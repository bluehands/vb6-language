package com.github.tyrrx.vb6language.psi.tree.impl.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.impl.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.interfaces.blockStmt.VB6RedimStmt
import com.intellij.lang.ASTNode

class VB6RedimStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6RedimStmt {

    object Factory : IPsiNodeFactory<VB6RedimStmt> {
        override fun createPsiNode(node: ASTNode): VB6RedimStmt {
            return VB6RedimStmtImpl(node)
        }
    }
}