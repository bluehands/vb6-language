package com.github.tyrrx.vb6language.psi.tree.impl


import com.github.tyrrx.vb6language.VB6Language
import com.github.tyrrx.vb6language.parser.VisualBasic6Parser
import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.language.VB6IElementTypes
import com.github.tyrrx.vb6language.psi.tree.impl.call.TestReference
import com.github.tyrrx.vb6language.psi.tree.interfaces.identifier.VB6Identifier
import com.github.tyrrx.vb6language.psi.tree.utils.createElementFromText
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference

class VB6IdentifierImpl(node: ASTNode) : VB6PsiNode(node),
    VB6Identifier {

    object Factory : IPsiNodeFactory<VB6Identifier> {
        override fun createPsiNode(node: ASTNode): VB6Identifier {
            return VB6IdentifierImpl(node)
        }
    }

    override fun setName(name: String): PsiElement {

        val element = createElementFromText(
			project,
			VB6Language.INSTANCE,
			context,
			name,
			VB6IElementTypes.rules[VisualBasic6Parser.RULE_ambiguousIdentifier]
		)
       return element?.let { this.replace(it) } ?: this
    }

    override fun getName(): String {
        return children.fold("") { acc, psiElement -> acc.plus(psiElement.text) }
    }

    override fun getReference(): PsiReference {
        return TestReference(this)
    }
}