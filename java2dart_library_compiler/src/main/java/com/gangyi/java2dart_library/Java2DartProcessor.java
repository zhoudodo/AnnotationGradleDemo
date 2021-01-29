package com.gangyi.java2dart_library;


import com.gangyi.java2dart_library_annotation.Java2Dart;
import com.gangyi.java2dart_library_annotation.Java2DartField;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.swing.plaf.TextUI;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;


@AutoService(Processor.class)
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class Java2DartProcessor extends AbstractProcessor {


    private Filer mFiler;
    private Messager mMessager;
    private Types mTypeUtils;
    private Elements mElementUtils;

    private HashMap<String, List<Table>> mTableMap = new HashMap<>();

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        LinkedHashSet<String> annotations = new LinkedHashSet<>();
        annotations.add(Java2Dart.class.getCanonicalName());
        annotations.add(Java2DartField.class.getCanonicalName());
        return annotations;
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);

        mFiler = processingEnv.getFiler();
        mMessager = processingEnv.getMessager();

        mMessager.printMessage(Diagnostic.Kind.NOTE, "aaaaaaaaaa:   init");

    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        mMessager.printMessage(Diagnostic.Kind.NOTE, "aaaaaaaaaa:   process");


        //如果annotation定义过多 可用for循环轮训
//        for (TypeElement annotation : annotations) {
//        }

        //保存Java2Dart
        processJava2Dart(roundEnv);
        //保存Java2DartField
        processJava2DartField(roundEnv);

        processTableMap(roundEnv);


//                if (element.getKind() == ElementKind.CLASS) {
//                    //class
//                    mMessager.printMessage(Diagnostic.Kind.NOTE, "aaaaaaaaaa:" + element.toString());
//                    TypeSpec typeSpec = null;
//                    try {
//                        typeSpec = java2DartFile(element);
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    } catch (InstantiationException e) {
//                        e.printStackTrace();
//                    } catch (ClassNotFoundException e) {
//                        e.printStackTrace();
//                    }
//                    if (typeSpec != null) {
//                        JavaFile javaFile = JavaFile.builder("com.test", typeSpec).build();
//                        try {
//                            javaFile.writeTo(mFiler);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }


        return true;
    }

    private void processTableMap(RoundEnvironment roundEnv) {

        Iterator<Map.Entry<String, List<Table>>> entryIterator = mTableMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, List<Table>> entry = entryIterator.next();
            String tableName = entry.getKey();
            List<Table> tableElements = entry.getValue();


            //
            StringBuilder builder = new StringBuilder()
                    .append("import 'package:flutter_deer/generated/json/base/json_convert_content.dart';\n" +
                            "import 'package:flutter_deer/generated/json/base/json_filed.dart';\n");


            HashMap<String, String> classTable = new HashMap<>();
            HashMap<String, String> fieldTable = new HashMap<>();

            for (Table tableElement : tableElements) {
                if (tableElement.annotation == Java2Dart.class) {
                    Java2Dart java2Dart = (Java2Dart) tableElement.element.getAnnotation(tableElement.annotation);
                    String newClassName = java2Dart.value();
                    String oldClassName = tableElement.element.getSimpleName().toString();
                    classTable.put(oldClassName, newClassName);
                } else if (tableElement.annotation == Java2DartField.class) {
                    Java2DartField java2DartField = (Java2DartField) tableElement.element.getAnnotation(tableElement.annotation);
                    String newFieldName = java2DartField.name();
                    String oldFieldName = tableElement.element.getSimpleName().toString();
                    fieldTable.put(oldFieldName, newFieldName);
                }
            }
            for (Table tableElement : tableElements) {
                if (tableElement.annotation == Java2Dart.class) {
                    Java2Dart java2Dart = (Java2Dart) tableElement.element.getAnnotation(tableElement.annotation);
                    String newClassName = java2Dart.value();

                    String classHeader = "class " + newClassName + " with JsonConvert<" + newClassName + "> {\n";
                    builder.append(classHeader);
                    List<? extends Element> enclosedElements = tableElement.element.getEnclosedElements();
                    for (Element enclosedElement : enclosedElements) {
                        if(enclosedElement.getKind() == ElementKind.FIELD) {
                            Set<Modifier> modifiers = enclosedElement.getModifiers();//

                            String realField = enclosedElement.getSimpleName().toString();
                            String field = fieldTable.get(enclosedElement.getSimpleName().toString());
                            if(field != null){
                                realField = field;
                            }

                            String classType = enclosedElement.asType().toString();
                            String simpleType = simpleClassType(classType);

                            String fieldLine = simpleType+" "+ realField+";"+"\n";
                            builder.append(fieldLine);
                        }else if(enclosedElement.getKind() == ElementKind.CLASS){

                           String classNameWithPkg = enclosedElement.getSimpleName().toString();
                           String[] argNames = classNameWithPkg.split("\\.");
                           String className = argNames[argNames.length-1];


                            String classHeaderInner = "class " + className + " with JsonConvert<" + className + "> {\n";
                            builder.append(classHeaderInner);


                            for (Element innerElement : enclosedElement.getEnclosedElements()) {
                                Set<Modifier> modifiers = enclosedElement.getModifiers();//
                                if (innerElement.getKind() == ElementKind.FIELD) {
                                    String realField = innerElement.getSimpleName().toString();
                                    String field = fieldTable.get(enclosedElement.getSimpleName().toString());
                                    if (field != null) {
                                        realField = field;
                                    }

                                    String classType = innerElement.asType().toString();
                                    String simpleType = simpleClassType(classType);

                                    String fieldLine = simpleType + " " + realField + ";" + "\n";
                                    builder.append(fieldLine);
                                }
                            }

                            builder.append("}"+"\n");

                        }
                    }

                    Element parentElement = tableElement.element.getEnclosingElement();


                } else if (tableElement.annotation == Java2DartField.class) {

                }
            }
            builder.append("}");
            mMessager.printMessage(Diagnostic.Kind.NOTE, "Class file =  " + builder.toString());

            String targetFilePath = "D:\\Java2Dart";



                for (Table tableElement : tableElements) {
                    if (tableElement.annotation == Java2Dart.class) {
//                        Java2Dart java2Dart = (Java2Dart) tableElement.element.getAnnotation(tableElement.annotation);
//                        String newClassName = java2Dart.value();
                        String oldClassName = tableElement.element.getSimpleName().toString();

                        StringBuilder stringBuilder = new StringBuilder();
                        for (char c : oldClassName.toCharArray()) {
                            if(Character.isUpperCase(c)){
                                String r = Character.toString(Character.toLowerCase(c));
                                stringBuilder.append("_"+r);
                            }else{
                                String r = Character.toString(Character.toLowerCase(c));
                                stringBuilder.append(r);
                            }
                        }

                        String filename = stringBuilder.toString();
                        if(filename.startsWith("_")){
                            filename = filename.substring(1,filename.length());
                        }
                        String fileType = ".dart";
                        File file = new File(targetFilePath,filename+fileType);
                        if(!file.getParentFile().exists()){
                            try {
                                file.getParentFile().mkdirs();
                                file.createNewFile();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        FileWriter fileWriter = null;
                        try {
                            fileWriter = new FileWriter(file);
                            fileWriter.write(builder.toString());
                            fileWriter.flush();
                            fileWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }



                    break;

                    } else if (tableElement.annotation == Java2DartField.class) {

                    }
                }


        }
    }

    private String simpleClassType(String classType) {
        if(classType.contains("<") && classType.contains(">")){
            if(classType.contains("List")) {
                int start = classType.indexOf("<");
                int end = classType.indexOf(">");

                String T = classType.substring(start + 1, end);
                String argT[] = T.split("\\.");
                String realT = argT[argT.length - 1];

                String classTypeT = classType.substring(0, start);
                String argClassTypeT[] = classTypeT.split("\\.");
                String realClassTypeT = argClassTypeT[argClassTypeT.length - 1];

                realT = fieldJava2Dart(realT);
                return realClassTypeT + "<" + realT + ">";
            }else if(classType.contains("Map")){
                int start = classType.indexOf("<");
                int end = classType.indexOf(">");

                String T2 = classType.substring(start + 1, end);

                String argT2[] = T2.split(",");
                if(argT2.length == 2) {
                    String T11 = argT2[0];
                    String T22 = argT2[1];

                    String[] argT11 = T11.split("\\.");
                    String[] argT22 = T22.split("\\.");

                    String realT11 = argT11[argT11.length-1];
                    String realT22 = argT22[argT22.length-1];
                    String classTypeT = classType.substring(0, start);
                    String argClassTypeT[] = classTypeT.split("\\.");
                    String realClassTypeT = argClassTypeT[argClassTypeT.length - 1];

                    realT11 = fieldJava2Dart(realT11);
                    realT22 = fieldJava2Dart(realT22);

                    return realClassTypeT + "<" + realT11+","+realT22 + ">";
                }else{
                    return classType;
                }
            }else{
                return classType;
            }
        }else{
            String[] args = classType.split("\\.");



            if(args.length > 0) {
                return fieldJava2Dart(args[args.length - 1]);
            }else{
                return classType;
            }
        }
    }

    private String fieldJava2Dart(String java) {
        String dart = java;
        if (java.equals("String")) {
            dart = "String";
        } else if (java.equals("Object")) {
            dart = "Object";
        } else if (
                java.equals("Integer") ||
                        java.equals("int")
        ) {
            dart = "int";
        } else if (
                java.equals("Byte") ||
                        java.equals("byte")
        ) {
            dart = "String";
        } else if (
                java.equals("Long") ||
                        java.equals("long")
        ) {
            dart = "String";
        } else if (
                java.equals("Float") ||
                        java.equals("float")
        ) {
            dart = "String";
        } else if (
                java.equals("Double") ||
                        java.equals("double")
        ) {
            dart = "double";
        } else if (
                java.equals("Character") ||
                        java.equals("char")
        ) {
            dart = "String";
        } else if (
                java.equals("Short") ||
                        java.equals("short")
        ) {
            dart = "String";
        } else if (
                java.equals("Boolean") ||
                        java.equals("boolean")
        ) {
            dart = "bool";
        }
        return dart;
    }





    private void processJava2DartField(RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(Java2DartField.class)) {
            Java2DartField tempAnnotation = element.getAnnotation(Java2DartField.class);
            //
            String annotationValue = tempAnnotation.name();


            String className = element.getSimpleName().toString();
            String type = element.asType().toString();
            String name = element.getSimpleName().toString();

            String parentType = element.getEnclosingElement().asType().toString();

            List<Table> tempList = mTableMap.get(parentType);
            if (tempList == null) {
                tempList = new ArrayList<>();
                mTableMap.put(parentType, tempList);
                saveElement2List(tempList, element, Java2DartField.class);
            } else {
                boolean needSave = true;
                for (Table tempTable : tempList) {
                    if (type.equals(tempTable.element.asType().toString()) && tempTable.annotation == Java2DartField.class) {
                        //
                        needSave = false;
                        break;
                    }
                }
                if (needSave) {
                    saveElement2List(tempList, element, Java2DartField.class);
                }
            }

        }
    }

    private void processJava2Dart(RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(Java2Dart.class)) {
            Java2Dart tempAnnotation = element.getAnnotation(Java2Dart.class);
            //
            String annotationValue = tempAnnotation.value();


            String className = element.getSimpleName().toString();
            String type = element.asType().toString();
            String name = element.getSimpleName().toString();

            List<Table> tempList = mTableMap.get(type);
            if (tempList == null) {
                tempList = new ArrayList<>();
                mTableMap.put(type, tempList);
                saveElement2List(tempList, element, Java2Dart.class);
            } else {
                boolean needSave = true;
                for (Table tempTable : tempList) {
                    if (type.equals(tempTable.element.asType().toString()) && tempTable.annotation == Java2Dart.class) {
                        //
                        needSave = false;
                        break;
                    }
                }
                if (needSave) {
                    saveElement2List(tempList, element, Java2Dart.class);
                }
            }

        }
    }

    //保存Element至List
    private void saveElement2List(List<Table> target, Element element, Class clazz) {
        target.add(new Table(clazz, element));
    }


    TypeSpec java2DartFile(Element tempElement) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Java2Dart tempAnnotation = tempElement.getAnnotation(Java2Dart.class);
        //
        String annotationValue = tempAnnotation.value();

        TypeElement clazz = (TypeElement) tempElement;

        String packageName = mElementUtils.getPackageOf(clazz).asType().toString();
        String className = clazz.getSimpleName().toString();
        String type = tempElement.asType().toString();
        String name = tempElement.getSimpleName().toString();


        Class baseClass = Class.forName(tempElement.toString());
        return iterClass(baseClass);

    }

    private TypeSpec iterClass(Class baseClass) throws InstantiationException, IllegalAccessException {

        List<TypeSpec> mTypeSpecs = new ArrayList<>();
        List<FieldSpec> mFieldSpec = new ArrayList<>();
        for (Field declaredField : baseClass.getDeclaredFields()) {

            declaredField.setAccessible(true);
            String fieldName = declaredField.getName();
            Class fieldClass = declaredField.getClass();
            boolean isBaseType = isBaseType(fieldClass, true);


            if (fieldClass.newInstance() instanceof List) {

                Type genericType = declaredField.getGenericType();
                if (null == genericType) {

                    mMessager.printMessage(Diagnostic.Kind.NOTE, "List内部类型为null");
                }
                if (genericType instanceof ParameterizedType) {
                    ParameterizedType pt = (ParameterizedType) genericType;
                    // 得到泛型里的class类型对象
                    Class<?> actualTypeArgument = (Class<?>) pt.getActualTypeArguments()[0];
                    boolean isListBaseType = isBaseType(actualTypeArgument, true);
                    if (isListBaseType) {

                        Class clazz = getBaseType(actualTypeArgument);
                        if (clazz != null) {

                            TypeName listOfSure = ParameterizedTypeName.get(
                                    ClassName.get(List.class), ClassName.get(actualTypeArgument)
                            );
                            FieldSpec fs = FieldSpec.builder(listOfSure, fieldName)
                                    .addModifiers(Modifier.DEFAULT)

                                    .build();
                            mFieldSpec.add(fs);
                        }
                    } else {

                        TypeSpec innerTypeSpec = iterClass(fieldClass);
                        mTypeSpecs.add(innerTypeSpec);

                        ClassName innerName = ClassName.get(baseClass.getPackage().getName(), baseClass.getSimpleName(), actualTypeArgument.getSimpleName());

                        TypeName listOfSure = ParameterizedTypeName.get(
                                ClassName.get(List.class), innerName);

                        FieldSpec fs = FieldSpec.builder(listOfSure, fieldName)
                                .addModifiers(Modifier.DEFAULT)
                                .build();
                        mFieldSpec.add(fs);
                    }


                }

                FieldSpec fs = FieldSpec.builder(List.class, fieldName, Modifier.DEFAULT).build();

            } else if (fieldClass.newInstance() instanceof Map) {

            } else if (isBaseType) {
                FieldSpec fs = FieldSpec.builder(fieldClass, fieldName)
                        .addModifiers(Modifier.DEFAULT)
                        .build();
                mFieldSpec.add(fs);

            } else {

                TypeSpec innerTypeSpec = iterClass(fieldClass);
                mTypeSpecs.add(innerTypeSpec);
            }
        }

        String className = baseClass.getName();

        TypeSpec.Builder builder = TypeSpec.classBuilder(className);

        for (TypeSpec mTypeSpec : mTypeSpecs) {
            builder.addType(mTypeSpec);
        }


        for (FieldSpec fieldSpec : mFieldSpec) {
            builder.addField(fieldSpec);
        }
        TypeSpec typeSpec = builder.build();

        return typeSpec;
    }


    public static boolean isBaseType(Class className, boolean incString) {
        if (incString && className.equals(String.class)) {
            return true;
        }
        return className.equals(Object.class) ||
                className.equals(Integer.class) ||
                className.equals(int.class) ||
                className.equals(Byte.class) ||
                className.equals(byte.class) ||
                className.equals(Long.class) ||
                className.equals(long.class) ||
                className.equals(Double.class) ||
                className.equals(double.class) ||
                className.equals(Float.class) ||
                className.equals(float.class) ||
                className.equals(Character.class) ||
                className.equals(char.class) ||
                className.equals(Short.class) ||
                className.equals(short.class) ||
                className.equals(Boolean.class) ||
                className.equals(boolean.class);
    }

    public static Class getBaseType(Class className) {
        if (className.equals(String.class)) {
            return String.class;
        } else if (className.equals(Integer.class) || className.equals(int.class)) {
            return Integer.class;
        } else if (className.equals(Object.class)) {
            return Object.class;
        } else if (className.equals(Byte.class) ||
                className.equals(byte.class)) {
            return Byte.class;
        } else if (className.equals(Long.class) ||
                className.equals(long.class)) {
            return Long.class;
        } else if (className.equals(Double.class) ||
                className.equals(double.class)) {
            return Double.class;
        } else if (className.equals(Float.class) ||
                className.equals(float.class)) {
            return Float.class;
        } else if (className.equals(Character.class) ||
                className.equals(char.class)) {
            return Character.class;
        } else if (className.equals(Short.class) ||
                className.equals(short.class)) {
            return Short.class;
        } else if (className.equals(Boolean.class) ||
                className.equals(boolean.class)) {
            return Boolean.class;
        }
        return null;
    }


    public static class Table {
        public Table(Class annotation, Element element) {
            this.annotation = annotation;
            this.element = element;
        }

        private Class annotation;
        private Element element;

        public Class getAnnotation() {
            return annotation;
        }

        public void setAnnotation(Class annotation) {
            this.annotation = annotation;
        }

        public Element getElement() {
            return element;
        }

        public void setElement(Element element) {
            this.element = element;
        }
    }

}
