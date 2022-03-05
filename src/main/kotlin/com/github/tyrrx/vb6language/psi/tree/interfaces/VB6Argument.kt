package com.github.tyrrx.vb6language.psi.tree.interfaces

import com.github.tyrrx.vb6language.psi.tree.interfaces.base.VB6GetAsTypeClause
import com.github.tyrrx.vb6language.psi.tree.interfaces.base.VB6GetTypeHint
import com.intellij.psi.PsiNameIdentifierOwner

interface VB6Argument :
    PsiNameIdentifierOwner,
    VB6GetAsTypeClause,
    VB6GetTypeHint {
    fun isOptional(): Boolean //= false
    fun getPassType(): com.github.tyrrx.vb6language.psi.tree.interfaces.ByValOrRef //= ByValOrRef.BYVALUE (https://docs.microsoft.com/en-us/dotnet/visual-basic/programming-guide/language-features/procedures/passing-arguments-by-value-and-by-reference)
    fun isParameterArray(): Boolean //= false
    fun getArgumentDefaultValue(): com.github.tyrrx.vb6language.psi.tree.interfaces.VB6ArgumentDefaultValue?
}