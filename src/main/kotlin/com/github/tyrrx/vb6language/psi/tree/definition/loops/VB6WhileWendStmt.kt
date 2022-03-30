package com.github.tyrrx.vb6language.psi.tree.definition.loops


import com.github.tyrrx.vb6language.psi.language.IPsiNodeFactory
import com.github.tyrrx.vb6language.psi.tree.visitor.ScopeNodeVisitor
import com.github.tyrrx.vb6language.psi.tree.definition.base.*
import com.github.tyrrx.vb6language.psi.tree.definition.block.VB6Block
import com.github.tyrrx.vb6language.psi.tree.utils.findFirstChildByType
import com.intellij.lang.ASTNode

interface VB6WhileWendStmt : VB6TransparentBlockScopeOwner, VB6StatementBase {
}

class VB6WhileWendStmtImpl(node: ASTNode) : VB6PsiNode(node),
    VB6WhileWendStmt {

    object Factory : IPsiNodeFactory<VB6WhileWendStmt> {
        override fun createPsiNode(node: ASTNode): VB6WhileWendStmt {
            return VB6WhileWendStmtImpl(node)
        }
    }

    override val block: VB6Block?
        get() = findFirstChildByType(this)

    override fun <TReturn> resolve(resolveVisitor: ScopeNodeVisitor<TReturn>): TReturn {
        return resolveVisitor.resolveWhileWendStmt(this)
    }

    override val visibleNamedElementOwners: List<VB6NamedElementOwner>
        get() = block?.visibleNamedElementOwners ?: emptyList()

    override val visibleNamedElements: List<VB6NamedElement>
        get() = block?.visibleNamedElements ?: emptyList()
}