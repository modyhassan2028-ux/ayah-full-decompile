package androidx.compose.foundation.layout;

import D.c0;
import J0.AbstractC0274a0;
import l0.i;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends AbstractC0274a0 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null) == null) {
            return false;
        }
        i iVar = l0.c.f19307B;
        return iVar.equals(iVar);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        i iVar = l0.c.f19307B;
        c0 c0Var = new c0();
        c0Var.f947F = iVar;
        return c0Var;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((c0) qVar).f947F = l0.c.f19307B;
    }
}
