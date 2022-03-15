package com.github.tyrrx.vb6language.psi.tree.definition.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6StatementBase
import com.intellij.lang.ASTNode

interface VB6RandomizeStmt : VB6StatementBase {
}

class VB6RandomizeStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6RandomizeStmt {

    object Factory : IPsiNodeFactory<VB6RandomizeStmt> {
        override fun createPsiNode(node: ASTNode): VB6RandomizeStmt {
            return VB6RandomizeStmtImpl(node)
        }
    }
}