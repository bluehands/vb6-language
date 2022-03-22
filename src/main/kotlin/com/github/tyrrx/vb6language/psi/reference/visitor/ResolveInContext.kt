package com.github.tyrrx.vb6language.psi.reference.visitor

import com.github.tyrrx.vb6language.psi.tree.visitor.ScopeNodeVisitor
import com.github.tyrrx.vb6language.psi.tree.definition.base.VB6PsiElement

fun <TReturn> VB6PsiElement.resolveInContext(resolveVisitor: ScopeNodeVisitor<TReturn>): TReturn? {
    return this.context?.resolve(resolveVisitor)
}