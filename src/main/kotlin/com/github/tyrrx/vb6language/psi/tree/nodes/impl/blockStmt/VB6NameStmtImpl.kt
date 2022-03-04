package com.github.tyrrx.vb6language.psi.tree.nodes.impl.blockStmt


import com.github.tyrrx.vb6language.psi.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.nodes.impl.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.nodes.interfaces.blockStmt.VB6NameStmt
import com.intellij.lang.ASTNode

class VB6NameStmtImpl(node: ASTNode) : VB6PsiNode(node), VB6NameStmt {

    object Factory : IPsiNodeFactory<VB6NameStmt> {
        override fun createPsiNode(node: ASTNode): VB6NameStmt {
            return VB6NameStmtImpl(node)
        }
    }
}