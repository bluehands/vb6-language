package com.github.tyrrx.vb6language.psi.tree.nodes.impl.blockStmt


import com.github.tyrrx.vb6language.psi.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.nodes.impl.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.nodes.interfaces.VB6AmbiguousIdentifier
import com.github.tyrrx.vb6language.psi.tree.nodes.interfaces.VB6AsTypeClause
import com.github.tyrrx.vb6language.psi.tree.nodes.interfaces.VB6Block
import com.github.tyrrx.vb6language.psi.tree.nodes.interfaces.blockStmt.VB6ForNextStmt
import com.github.tyrrx.vb6language.psi.tree.nodes.utils.findFirstChildByType
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement

class VB6ForNextStmtImpl(node: ASTNode) : VB6PsiNode(node), VB6ForNextStmt {

    object Factory : IPsiNodeFactory<VB6ForNextStmt> {
        override fun createPsiNode(node: ASTNode): VB6ForNextStmt {
            return VB6ForNextStmtImpl(node)
        }
    }

    override fun getBlock(): VB6Block? {
        return findFirstChildByType(this)
    }

    override fun resolve(element: PsiNamedElement?): PsiElement? {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): VB6AmbiguousIdentifier? {
        return children[2] as VB6AmbiguousIdentifier
    }

    override fun getName(): String? {
        return nameIdentifier?.name
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getAsTypeClause(): VB6AsTypeClause? {
        return findFirstChildByType(this)
    }
}