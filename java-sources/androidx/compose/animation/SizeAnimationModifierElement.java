package androidx.compose.animation;

import J0.AbstractC0274a0;
import l0.j;
import l0.q;
import p214w.O;
import p223x.C1408a0;

/* JADX INFO: loaded from: classes.dex */
final class SizeAnimationModifierElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1408a0 f11738a;

    public SizeAnimationModifierElement(C1408a0 c1408a0) {
        this.f11738a = c1408a0;
    }

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
        if (!(obj instanceof SizeAnimationModifierElement) || !this.f11738a.equals(((SizeAnimationModifierElement) obj).f11738a)) {
            return false;
        }
        j jVar = l0.c.f19313r;
        return jVar.equals(jVar);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.f11738a.hashCode() * 31)) * 31;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new O(this.f11738a);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((O) qVar).f23456G = this.f11738a;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f11738a + ", alignment=" + l0.c.f19313r + ", finishedListener=null)";
    }
}
