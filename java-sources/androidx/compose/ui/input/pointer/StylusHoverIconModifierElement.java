package androidx.compose.ui.input.pointer;

import D0.C0083a;
import D0.G;
import J0.AbstractC0274a0;
import J0.C0292o;
import K.T;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0292o f11971a;

    public StylusHoverIconModifierElement(C0292o c0292o) {
        this.f11971a = c0292o;
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
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        C0083a c0083a = T.f4544c;
        return c0083a.equals(c0083a) && j.a(this.f11971a, stylusHoverIconModifierElement.f11971a);
    }

    public final int hashCode() {
        int i10 = ((1022 * 31) + 1237) * 31;
        C0292o c0292o = this.f11971a;
        return i10 + (c0292o == null ? 0 : c0292o.hashCode());
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new G(T.f4544c, this.f11971a);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        G g = (G) qVar;
        C0083a c0083a = T.f4544c;
        if (!j.a(g.f1103G, c0083a)) {
            g.f1103G = c0083a;
            if (g.f1104H) {
                g.x0();
            }
        }
        g.f1102F = this.f11971a;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + T.f4544c + ", overrideDescendants=false, touchBoundsExpansion=" + this.f11971a + ')';
    }
}
