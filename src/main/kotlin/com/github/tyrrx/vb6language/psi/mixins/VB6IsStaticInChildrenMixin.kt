package com.github.tyrrx.vb6language.psi.mixins

import com.github.tyrrx.vb6language.language.VB6IElementTypes
import com.github.tyrrx.vb6language.psi.base.VB6PsiElement
import com.github.tyrrx.vb6language.psi.utils.isIElementTypePresentInChildren
import com.intellij.psi.PsiElement

interface VB6IsStaticInChildrenMixin: VB6PsiElement {
    fun isStatic(): Boolean {
        return VB6IElementTypes.STATIC.isIElementTypePresentInChildren(this)
    }
}