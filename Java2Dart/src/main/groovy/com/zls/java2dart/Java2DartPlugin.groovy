package com.zls.java2dart

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.api.ApplicationVariant
import com.android.build.gradle.internal.dsl.DefaultConfig
import com.android.build.gradle.internal.dsl.SigningConfig
import com.android.builder.model.Dependencies
import org.gradle.api.GradleException
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Plugin;
import org.gradle.api.Project
import com.zls.java2dart.Baby

public class Java2DartPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        if (!project.getPlugins().hasPlugin(AppPlugin.class)) {
            throw new GradleException("无法再非android application插件中使用gradle插件")
        }
        project.afterEvaluate {
            //android 标签
            AppExtension appExtension = project.getExtensions().getByName("android")
            DefaultConfig defaultConfig = appExtension.getDefaultConfig()
            //defaultConfig 标签
            System.out.println("applicationId =" + defaultConfig.applicationId)
            defaultConfig.javaCompileOptions.annotationProcessorOptions.arguments.each {
                argument ->
                    System.out.println("argument key = " + argument.key + "    value  =" + argument.getValue())
            }
            //signingConfigs标签
            NamedDomainObjectContainer<SigningConfig> signingConfigs = appExtension.getSigningConfigs();
            signingConfigs.each {
                signingConfig ->
                    signingConfig.keyAlias
                    signingConfig.keyPassword
                    signingConfig.storeFile
                    signingConfig.storePassword
                    signingConfig.storeType
                    signingConfig.v1SigningEnabled
                    signingConfig.v2SigningEnabled
                    //别名
                    System.out.println(
                            "signingConfig.keyAlias =" + signingConfig.keyAlias + "\n" +
                                    "signingConfig.keyPassword =" + signingConfig.keyPassword + "\n" +
                                    "signingConfig.storeFile =" + signingConfig.storeFile + "\n" +
                                    "signingConfig.storePassword =" + signingConfig.storePassword + "\n" +
                                    "signingConfig.storeType =" + signingConfig.storeType + "\n" +
                                    "signingConfig.v1SigningEnabled =" + signingConfig.v1SigningEnabled + "\n"
                    )

            }
            List<List<Object>> depss = appExtension.getTransformsDependencies();
            depss.each {
                deps ->
                    deps.each {
                        dependencies ->
                            System.out.println(
                                    "dependencies =" + dependencies.toString() + "\n"
                            )

                    }
            }
        }
    }
}