package com.github.tyrrx.vb6language.psi.tree.nodes

import com.github.tyrrx.vb6language.psi.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.VB6Literal
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

class VB6LiteralImpl(node: ASTNode) : VB6PsiNode(node), VB6Literal {
    override fun getLiteralElement(): PsiElement {
        return firstChild
    }

    object Factory: IPsiNodeFactory<VB6Literal> {
        override fun createPsiNode(node: ASTNode): VB6Literal {
           return VB6LiteralImpl(node)
        }
    }
}