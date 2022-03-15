package com.github.tyrrx.vb6language.psi.tree.interfaces.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.interfaces.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.interfaces.base.VB6Statement
import com.intellij.lang.ASTNode

interface VB6DateStmt : VB6Statement {
}

class VB6DateStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6DateStmt {

    object Factory : IPsiNodeFactory<VB6DateStmt> {
        override fun createPsiNode(node: ASTNode): VB6DateStmt {
            return VB6DateStmtImpl(node)
        }
    }
}