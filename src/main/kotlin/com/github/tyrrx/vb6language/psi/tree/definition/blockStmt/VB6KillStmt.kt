package com.github.tyrrx.vb6language.psi.tree.definition.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6StatementBase
import com.intellij.lang.ASTNode

interface VB6KillStmt : VB6StatementBase {
}

class VB6KillStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6KillStmt {

    object Factory : IPsiNodeFactory<VB6KillStmt> {
        override fun createPsiNode(node: ASTNode): VB6KillStmt {
            return VB6KillStmtImpl(node)
        }
    }
}