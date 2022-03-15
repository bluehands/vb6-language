package com.github.tyrrx.vb6language.psi.tree.definition.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6StatementBase
import com.intellij.lang.ASTNode

interface VB6MidStmt : VB6StatementBase {
}

class VB6MidStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6MidStmt {

    object Factory : IPsiNodeFactory<VB6MidStmt> {
        override fun createPsiNode(node: ASTNode): VB6MidStmt {
            return VB6MidStmtImpl(node)
        }
    }
}