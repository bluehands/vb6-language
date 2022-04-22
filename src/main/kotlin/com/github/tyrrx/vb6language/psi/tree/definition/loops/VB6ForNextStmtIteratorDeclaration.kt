package com.github.tyrrx.vb6language.psi.tree.definition.loops

import com.github.tyrrx.vb6language.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.base.VB6NamedElement
import com.github.tyrrx.vb6language.psi.reference.VB6ReferenceFactory
import com.github.tyrrx.vb6language.psi.reference.VB6ReferenceOwner
import com.github.tyrrx.vb6language.psi.reference.references.SymbolReference
import com.github.tyrrx.vb6language.psi.reference.references.VB6Reference
import com.github.tyrrx.vb6language.psi.scope.VB6ScopeNode
import com.github.tyrrx.vb6language.psi.tree.definition.VB6PsiNode
import com.github.tyrrx.vb6language.psi.utils.findFirstChildByType
import com.github.tyrrx.vb6language.psi.utils.findFirstParentOfType
import com.intellij.lang.ASTNode

interface VB6ForNextStmtIteratorDeclaration : VB6ReferenceOwner, VB6ReferenceFactory {
    val identifier: VB6NamedElement?
}

class VB6ForNextStmtIteratorDeclarationImpl(node: ASTNode) :
    VB6PsiNode(node), VB6ForNextStmtIteratorDeclaration {

    object Factory : IPsiNodeFactory<VB6ForNextStmtIteratorDeclaration> {
        override fun createPsiNode(node: ASTNode): VB6ForNextStmtIteratorDeclaration {
            return VB6ForNextStmtIteratorDeclarationImpl(node)
        }
    }

    override val referenceFactory: VB6ReferenceFactory
        get() = this

    override fun createReference(): VB6Reference? {
        return identifier?.let {
            return SymbolReference(this, it, it.textRangeInParent)
        }
    }

    override val identifier: VB6NamedElement?
        get() = findFirstChildByType(this)

    override fun getReference(): VB6Reference? {
        return createReference()
    }

    override fun getContext(): VB6ScopeNode? {
        return findFirstParentOfType<VB6ForNextStmt>(this)?.context
    }
}