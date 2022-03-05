package com.github.tyrrx.vb6language.psi.tree.impl.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.impl.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.interfaces.blockStmt.VB6GoSubStmt
import com.intellij.lang.ASTNode

class VB6GoSubStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6GoSubStmt {

    object Factory : IPsiNodeFactory<VB6GoSubStmt> {
        override fun createPsiNode(node: ASTNode): VB6GoSubStmt {
            return VB6GoSubStmtImpl(node)
        }
    }
}