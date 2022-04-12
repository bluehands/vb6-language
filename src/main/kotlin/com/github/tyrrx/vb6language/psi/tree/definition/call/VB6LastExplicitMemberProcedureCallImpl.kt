package com.github.tyrrx.vb6language.psi.tree.definition.call

import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.reference.TypeMemberReference
import com.github.tyrrx.vb6language.psi.reference.VB6Reference
import com.github.tyrrx.vb6language.psi.tree.definition.base.*
import com.github.tyrrx.vb6language.psi.tree.utils.findFirstChildByType
import com.intellij.lang.ASTNode

interface VB6LastExplicitMemberProcedureCall : VB6PsiElement, VB6ReferenceOwner, VB6ReferenceFactory {
    val referencingElement: VB6NamedElement?
}

class VB6LastExplicitMemberProcedureCallImpl(node: ASTNode) :  VB6PsiNode(node), VB6LastExplicitMemberProcedureCall {

    object Factory : IPsiNodeFactory<VB6LastExplicitMemberProcedureCall> {
        override fun createPsiNode(node: ASTNode): VB6LastExplicitMemberProcedureCall {
            return VB6LastExplicitMemberProcedureCallImpl(node)
        }
    }

    override val referencingElement: VB6NamedElement?
        get() = findFirstChildByType(this)

    override fun getReference(): VB6Reference? {
        return createReference()
    }

    override val referenceFactory: VB6ReferenceFactory?
        get() = this

    override fun createReference(): VB6Reference? {
        val blockMembersCall = parent as VB6ExplicitMemberProcedureCall
        return blockMembersCall.inlineCall?.let { inlineCall ->
            referencingElement?.let { ref ->
                TypeMemberReference(
                    this,
                    ref,
                    ref.textRangeInParent,
                    inlineCall.finalReference
                )
            }
        } ?: TODO("Search for with statment and get type")
    }
}