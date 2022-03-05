package com.github.tyrrx.vb6language.psi.tree.leafes

import com.github.tyrrx.vb6language.psi.language.ILeafFactory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.impl.source.tree.LeafElement
import com.intellij.psi.tree.IElementType

class IdentifierPsiLeaf(type: IElementType?, text: CharSequence?) : VB6PsiLeaf(type, text), PsiNamedElement {
	override fun getName(): String {
		return text
	}

	override fun setName(name: String): PsiElement {
		// Todo valid?
//		val newIdentifier = Trees.createLeafFromText(
//			project,
//			VB6Language.INSTANCE,
//			context,
//			name,
//			VB6IElementTypes.tokens[VisualBasic6Lexer.IDENTIFIER]
//		)
//		return this.replace(newIdentifier)
		TODO("Not yet implemented")
	}

	object Factory : ILeafFactory {
		override fun createLeaf(type: IElementType, text: CharSequence): LeafElement {
			return IdentifierPsiLeaf(type, text)
		}
	}
}