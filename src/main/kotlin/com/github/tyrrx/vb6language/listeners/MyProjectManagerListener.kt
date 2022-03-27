package com.github.tyrrx.vb6language.listeners

import com.github.tyrrx.vb6language.project.VB6WorkspaceService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.tyrrx.vb6language.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
        project.service<VB6WorkspaceService>()
    }
}
