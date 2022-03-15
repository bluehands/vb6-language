package com.github.tyrrx.vb6language.psi.tree.definition.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6StatementBase
import com.intellij.lang.ASTNode

interface VB6SavepictureStmt : VB6StatementBase {
}

class VB6SavepictureStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6SavepictureStmt {

    object Factory : IPsiNodeFactory<VB6SavepictureStmt> {
        override fun createPsiNode(node: ASTNode): VB6SavepictureStmt {
            return VB6SavepictureStmtImpl(node)
        }
    }
}