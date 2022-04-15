package com.github.tyrrx.vb6language.psi.tree.definition.blockStmt


import com.github.tyrrx.vb6language.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.VB6PsiElement
import com.github.tyrrx.vb6language.psi.tree.definition.VB6PsiNode
import com.intellij.lang.ASTNode

interface VB6ErrorStmt : VB6PsiElement {
}

class VB6ErrorStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6ErrorStmt {

    object Factory : IPsiNodeFactory<VB6ErrorStmt> {
        override fun createPsiNode(node: ASTNode): VB6ErrorStmt {
            return VB6ErrorStmtImpl(node)
        }
    }
}