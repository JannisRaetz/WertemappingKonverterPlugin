package com.github.jannisraetz.wertemappingkonverterplugin.services

import com.github.jannisraetz.wertemappingkonverterplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
