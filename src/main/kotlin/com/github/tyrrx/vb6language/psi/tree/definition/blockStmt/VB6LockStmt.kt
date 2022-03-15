package com.github.tyrrx.vb6language.psi.tree.definition.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6StatementBase
import com.intellij.lang.ASTNode

interface VB6LockStmt : VB6StatementBase {
}

class VB6LockStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6LockStmt {

    object Factory : IPsiNodeFactory<VB6LockStmt> {
        override fun createPsiNode(node: ASTNode): VB6LockStmt {
            return VB6LockStmtImpl(node)
        }
    }
}