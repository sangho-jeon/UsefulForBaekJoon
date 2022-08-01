package com.github.sanghojeon.usefulforbaekjoon.services

import com.intellij.openapi.project.Project
import com.github.sanghojeon.usefulforbaekjoon.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
