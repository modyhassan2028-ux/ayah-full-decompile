package O;

import D.AbstractC0071n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.AbstractC0567i;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6282r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.r f6283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f6284t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(l0.r rVar, p074h0.d dVar) {
        super(2);
        this.f6283s = rVar;
        this.f6284t = dVar;
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
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6282r) {
            case 0:
                ((Number) obj2).intValue();
                int iY = C0672b.y(49);
                AbstractC0813f2.j(this.f6283s, this.f6284t, (C0698o) obj, iY);
                break;
            default:
                C0698o c0698o = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                } else {
                    String strC = X.t.c(R.string.m3c_dialog, c0698o);
                    l0.r rVarM = androidx.compose.foundation.layout.c.m(this.f6283s, AbstractC0567i.f9166a, AbstractC0567i.f9167b, 10);
                    boolean zG = c0698o.g(strC);
                    Object objH = c0698o.H();
                    if (zG || objH == C0690k.f10683a) {
                        objH = new R0.n(strC, 1);
                        c0698o.e0(objH);
                    }
                    l0.r rVarB = rVarM.b(new AppendedSemanticsElement((p241y9.c) objH, false));
                    H0.I iD = AbstractC0071n.d(l0.c.f19313r, true);
                    int i10 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    l0.r rVarC = l0.a.c(c0698o, rVarB);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(c0286i);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, iD, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i10))) {
                        p123m2.c.y(i10, c0698o, i10, c0285h);
                    }
                    C0672b.v(c0698o, rVarC, C0287j.f4117d);
                    this.f6284t.invoke(c0698o, 0);
                    c0698o.p(true);
                }
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(l0.r rVar, p074h0.d dVar, int i10) {
        super(2);
        this.f6283s = rVar;
        this.f6284t = dVar;
    }
}
