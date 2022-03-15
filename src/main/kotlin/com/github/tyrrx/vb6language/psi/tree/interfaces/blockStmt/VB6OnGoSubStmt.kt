package com.github.tyrrx.vb6language.psi.tree.interfaces.blockStmt


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.interfaces.base.VB6PsiNode
import com.github.tyrrx.vb6language.psi.tree.interfaces.base.VB6Statement
import com.intellij.lang.ASTNode

interface VB6OnGoSubStmt : VB6Statement {
}

class VB6OnGoSubStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6OnGoSubStmt {

    object Factory : IPsiNodeFactory<VB6OnGoSubStmt> {
        override fun createPsiNode(node: ASTNode): VB6OnGoSubStmt {
            return VB6OnGoSubStmtImpl(node)
        }
    }
}