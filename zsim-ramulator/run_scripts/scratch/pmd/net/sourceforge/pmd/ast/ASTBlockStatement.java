/* Generated By:JJTree: Do not edit this line. ASTBlockStatement.java */

package net.sourceforge.pmd.ast;

public class ASTBlockStatement extends SimpleJavaNode {
    public ASTBlockStatement(int id) {
        super(id);
    }

    public ASTBlockStatement(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    /**
     * Tells if this BlockStatement is an allocation statement.
     * This is done by
     *
     * @return the result of !findChildrenOfType(ASTAllocationExpression.class).isEmpty()
     */
    public final boolean isAllocation() {
        return !findChildrenOfType(ASTAllocationExpression.class).isEmpty();
    }
}
