package androidx.compose.foundation.layout;

import A.R0;
import D.EnumC0080x;
import W.J0;
import l0.h;
import l0.i;
import l0.j;
import l0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f11826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f11827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FillElement f11828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f11829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f11830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f11831f;
    public static final WrapContentElement g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f11832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final WrapContentElement f11833i;

    static {
        EnumC0080x enumC0080x = EnumC0080x.f1032s;
        f11826a = new FillElement(enumC0080x, 1.0f);
        EnumC0080x enumC0080x2 = EnumC0080x.f1031r;
        f11827b = new FillElement(enumC0080x2, 1.0f);
        EnumC0080x enumC0080x3 = EnumC0080x.f1033t;
        f11828c = new FillElement(enumC0080x3, 1.0f);
        h hVar = l0.c.f19310E;
        int i10 = 3;
        f11829d = new WrapContentElement(enumC0080x, new R0(i10, hVar), hVar);
        h hVar2 = l0.c.f19309D;
        f11830e = new WrapContentElement(enumC0080x, new R0(i10, hVar2), hVar2);
        i iVar = l0.c.f19307B;
        int i11 = 1;
        f11831f = new WrapContentElement(enumC0080x2, new R0(i11, iVar), iVar);
        i iVar2 = l0.c.f19306A;
        g = new WrapContentElement(enumC0080x2, new R0(i11, iVar2), iVar2);
        j jVar = l0.c.f19317v;
        int i12 = 2;
        f11832h = new WrapContentElement(enumC0080x3, new R0(i12, jVar), jVar);
        j jVar2 = l0.c.f19313r;
        f11833i = new WrapContentElement(enumC0080x3, new R0(i12, jVar2), jVar2);
    }

    public static final r a(r rVar, float f3, float f7) {
        return rVar.b(new UnspecifiedConstraintsElement(f3, f7));
    }

    public static r b(float f3) {
        return new UnspecifiedConstraintsElement(f3, Float.NaN);
    }

    public static final r c(r rVar, float f3) {
        return rVar.b(f3 == 1.0f ? f11827b : new FillElement(EnumC0080x.f1031r, f3));
    }

    public static final r d(r rVar, float f3) {
        return rVar.b(new SizeElement(0.0f, f3, 0.0f, f3, true, 5));
    }

    public static final r e(r rVar, float f3, float f7) {
        return rVar.b(new SizeElement(0.0f, f3, 0.0f, f7, true, 5));
    }

    public static /* synthetic */ r f(r rVar, float f3, float f7, int i10) {
        if ((i10 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f7 = Float.NaN;
        }
        return e(rVar, f3, f7);
    }

    public static r g(r rVar, float f3) {
        return rVar.b(new SizeElement(0.0f, f3, 0.0f, Float.NaN, false, 5));
    }

    public static final r h(r rVar, float f3, float f7) {
        return rVar.b(new SizeElement(f3, f7, f3, f7, false));
    }

    public static r i(r rVar, float f3, float f7, float f10, float f11, int i10) {
        return rVar.b(new SizeElement(f3, (i10 & 2) != 0 ? Float.NaN : f7, (i10 & 4) != 0 ? Float.NaN : f10, (i10 & 8) != 0 ? Float.NaN : f11, false));
    }

    public static final r j(r rVar, float f3) {
        return rVar.b(new SizeElement(f3, f3, f3, f3, true));
    }

    public static final r k(r rVar, float f3, float f7) {
        return rVar.b(new SizeElement(f3, f7, f3, f7, true));
    }

    public static final r l(r rVar, float f3, float f7, float f10, float f11) {
        return rVar.b(new SizeElement(f3, f7, f10, f11, true));
    }

    public static /* synthetic */ r m(r rVar, float f3, float f7, int i10) {
        float f10 = J0.f8604b;
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return l(rVar, f3, f10, f7, Float.NaN);
    }

    public static final r n(r rVar, float f3) {
        return rVar.b(new SizeElement(f3, 0.0f, f3, 0.0f, true, 10));
    }

    public static r o(float f3) {
        return new SizeElement(Float.NaN, 0.0f, f3, 0.0f, true, 10);
    }

    public static r p(r rVar) {
        WrapContentElement wrapContentElement;
        i iVar = l0.c.f19307B;
        if (p251z9.j.a(iVar, iVar)) {
            wrapContentElement = f11831f;
        } else if (p251z9.j.a(iVar, l0.c.f19306A)) {
            wrapContentElement = g;
        } else {
            wrapContentElement = new WrapContentElement(EnumC0080x.f1031r, new R0(1, iVar), iVar);
        }
        return rVar.b(wrapContentElement);
    }

    public static r q(r rVar, j jVar) {
        WrapContentElement wrapContentElement;
        if (jVar.equals(l0.c.f19317v)) {
            wrapContentElement = f11832h;
        } else if (jVar.equals(l0.c.f19313r)) {
            wrapContentElement = f11833i;
        } else {
            wrapContentElement = new WrapContentElement(EnumC0080x.f1033t, new R0(2, jVar), jVar);
        }
        return rVar.b(wrapContentElement);
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
    public static r r(r rVar, int i10) {
        WrapContentElement wrapContentElement;
        h hVar = l0.c.f19310E;
        if (hVar.equals(hVar)) {
            wrapContentElement = f11829d;
        } else if (hVar.equals(l0.c.f19309D)) {
            wrapContentElement = f11830e;
        } else {
            wrapContentElement = new WrapContentElement(EnumC0080x.f1032s, new R0(3, hVar), hVar);
        }
        return rVar.b(wrapContentElement);
    }
}
