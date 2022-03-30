package com.github.tyrrx.vb6language.psi.tree.definition.block

import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.definition.base.*
import com.github.tyrrx.vb6language.psi.tree.utils.findPsiElementsInDirectChildrenByType
import com.intellij.lang.ASTNode

interface VB6Block : VB6PsiElement, VB6EnclosingVisibleNamedElements {
    val statements: List<VB6StatementBase>
}

class VB6BlockImpl(node: ASTNode) : VB6PsiNode(node), VB6Block {

    object Factory : IPsiNodeFactory<VB6Block> {
        override fun createPsiNode(node: ASTNode): VB6Block {
            return VB6BlockImpl(node)
        }
    }

    override val statements: List<VB6StatementBase>
        get() = findPsiElementsInDirectChildrenByType<VB6BlockStmt>(this)
            .map { it.statement }

    override val visibleNamedElementOwners: List<VB6NamedElementOwner>
        get() = statements
            .filterIsInstance<VB6EnclosingVisibleNamedElements>()
            .flatMap { it.visibleNamedElementOwners }

    override val visibleNamedElements: List<VB6NamedElement>
        get() = statements.filterIsInstance<VB6EnclosingVisibleNamedElements>().flatMap { it.visibleNamedElements }
}
