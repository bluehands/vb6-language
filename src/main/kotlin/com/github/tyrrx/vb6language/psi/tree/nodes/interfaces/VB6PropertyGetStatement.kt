package com.github.tyrrx.vb6language.psi.tree.nodes.interfaces

import com.github.tyrrx.vb6language.psi.tree.nodes.mixins.VB6GetTypeHintInDirectChildrenMixin

interface VB6PropertyGetStatement :
    VB6Property,
    VB6GetTypeHintInDirectChildrenMixin {
}