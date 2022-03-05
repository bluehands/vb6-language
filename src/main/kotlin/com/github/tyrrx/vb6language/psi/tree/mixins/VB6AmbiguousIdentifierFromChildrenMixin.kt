package com.github.tyrrx.vb6language.psi.tree.mixins

import com.github.tyrrx.vb6language.psi.tree.interfaces.base.VB6AmbiguousIdentifierOwner
import com.github.tyrrx.vb6language.psi.tree.interfaces.identifier.VB6AmbiguousIdentifier
import com.github.tyrrx.vb6language.psi.tree.utils.findFirstChildByType

interface VB6AmbiguousIdentifierFromChildrenMixin:
    VB6AmbiguousIdentifierOwner {

    override fun getName(): String? {
        return nameIdentifier?.name
    }

    override fun getNameIdentifier(): VB6AmbiguousIdentifier? {
        return findFirstChildByType(this)
    }
}