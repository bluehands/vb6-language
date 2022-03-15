package com.github.tyrrx.vb6language.psi.tree.definition.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6StatementBase
import com.intellij.lang.ASTNode

interface VB6ExitStmt : VB6StatementBase {
}

class VB6ExitStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6ExitStmt {

    object Factory : IPsiNodeFactory<VB6ExitStmt> {
        override fun createPsiNode(node: ASTNode): VB6ExitStmt {
            return VB6ExitStmtImpl(node)
        }
    }
}