package com.gangyi.buildsrc

import com.android.build.gradle.AppPlugin;
import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import com.gangyi.buildsrc.Person

public class Num1Plugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
         if(!project.getPlugins().hasPlugin(AppPlugin.class)){
             throw new GradleException("无法再非android application插件中使用gradle插件")
         }

        project.getProject()

        project.task("testTask").doFirst {
            System.out.println("task Test...")
        }
        project.getExtensions().create("user", Person.class)

        project.afterEvaluate {
            Person user = project.getExtensions().findByName("user");

            System.out.println("findByName --->"+user.toString())

            Person person = project.getExtensions().findByType(Person.class)

           System.out.println("findByTag ------>"+person.toString())

        }
    }
}