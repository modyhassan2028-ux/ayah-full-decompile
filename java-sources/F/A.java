package F;

import A.C0009b;
import A.C0042s;
import A.M0;
import A.R0;
import A.T0;
import G.C0171e;
import G.C0174h;
import G.G;
import G.K;
import G.L;
import G.N;
import G.O;
import G.d0;
import G.e0;
import J0.I;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.C0672b;
import Z.C0675c0;
import Z.C0681f0;
import Z.S;
import Z.X;
import p223x.AbstractC1413d;
import p223x.C1422k;
import p223x.C1423l;
import p223x.w0;
import p232y.T;

/* JADX INFO: loaded from: classes.dex */
public final class A implements T0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p085i0.n f2008w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E7.b f2009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f2011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D0.y f2012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0681f0 f2013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B.j f2014f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0042s f2015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2016i;
    public I j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f2017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0171e f2018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f2019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0009b f2020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final L f2021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final O8.c f2022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G.I f2023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X f2024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0681f0 f2025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0681f0 f2026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final X f2027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final O8.c f2028v;

    static {
        o oVar = o.f2084u;
        R0 r10 = new R0(t.f2129r);
        p251z9.y.b(1, oVar);
        p085i0.n nVar = p085i0.o.f16735a;
        f2008w = new p085i0.n(0, r10, oVar);
    }

    public A(int i10, int i11) {
        E7.b bVar = new E7.b();
        bVar.f1974a = -1;
        this.f2009a = bVar;
        D0.y yVar = new D0.y();
        yVar.f1158s = new C0675c0(i10);
        yVar.f1159t = new C0675c0(i11);
        yVar.f1161v = new G(i10);
        this.f2012d = yVar;
        r rVar = D.f2029a;
        S s10 = S.f10640t;
        this.f2013e = new C0681f0(rVar, s10);
        this.f2014f = new B.j();
        this.f2015h = new C0042s(new M0(5, this));
        this.f2016i = true;
        this.f2017k = new w(this);
        this.f2018l = new C0171e();
        this.f2019m = new androidx.compose.foundation.lazy.layout.b();
        this.f2020n = new C0009b(1);
        this.f2021o = new L(new v(this, i10));
        this.f2022p = new O8.c(this);
        this.f2023q = new G.I();
        p110k9.y yVar2 = p110k9.y.f19095a;
        this.f2024r = new C0681f0(yVar2, s10);
        Boolean bool = Boolean.FALSE;
        this.f2025s = C0672b.r(bool);
        this.f2026t = C0672b.r(bool);
        this.f2027u = new C0681f0(yVar2, s10);
        O8.c cVar = new O8.c();
        cVar.f6511r = new C1422k(w0.f24113a, Float.valueOf(0.0f), new C1423l(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f2028v = cVar;
    }

    public static Object i(A a9, int i10, q9.i iVar) {
        a9.getClass();
        Object objA = a9.a(T.f24454r, new y(a9, i10, null), iVar);
        return objA == p161p9.a.f21156r ? objA : p110k9.y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.a(r6, r7, r0) == r4) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // A.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p232y.T r6, p241y9.e r7, q9.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof F.z
            if (r0 == 0) goto L13
            r0 = r8
            F.z r0 = (F.z) r0
            int r1 = r0.f2147w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2147w = r1
            goto L18
        L13:
            F.z r0 = new F.z
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f2145u
            int r1 = r0.f2147w
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            p110k9.a.e(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            q9.i r6 = r0.f2144t
            r7 = r6
            y9.e r7 = (p241y9.e) r7
            y.T r6 = r0.f2143s
            F.A r1 = r0.f2142r
            p110k9.a.e(r8)
            goto L57
        L3f:
            p110k9.a.e(r8)
            r0.f2142r = r5
            r0.f2143s = r6
            r8 = r7
            q9.i r8 = (q9.i) r8
            r0.f2144t = r8
            r0.f2147w = r3
            G.e r8 = r5.f2018l
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r4) goto L56
            goto L68
        L56:
            r1 = r5
        L57:
            A.s r8 = r1.f2015h
            r1 = 0
            r0.f2142r = r1
            r0.f2143s = r1
            r0.f2144t = r1
            r0.f2147w = r2
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r4) goto L69
        L68:
            return r4
        L69:
            k9.y r6 = p110k9.y.f19095a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F.A.a(y.T, y9.e, q9.c):java.lang.Object");
    }

    @Override // A.T0
    public final boolean b() {
        return ((Boolean) this.f2026t.getValue()).booleanValue();
    }

    @Override // A.T0
    public final boolean c() {
        return this.f2015h.c();
    }

    @Override // A.T0
    public final boolean d() {
        return ((Boolean) this.f2025s.getValue()).booleanValue();
    }

    @Override // A.T0
    public final float e(float f3) {
        return this.f2015h.e(f3);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(r rVar, boolean z10, boolean z11) {
        if (!z10 && this.f2010b) {
            this.f2011c = rVar;
            return;
        }
        if (z10) {
            this.f2010b = true;
        }
        s sVar = rVar.f2095a;
        ?? r10 = rVar.f2103k;
        int i10 = rVar.f2096b;
        this.f2026t.setValue(Boolean.valueOf(((sVar != null ? sVar.f2110a : 0) == 0 && i10 == 0) ? false : true));
        this.f2025s.setValue(Boolean.valueOf(rVar.f2097c));
        this.g -= rVar.f2098d;
        this.f2013e.setValue(rVar);
        D0.y yVar = this.f2012d;
        p150o9.c cVar = null;
        if (z11) {
            yVar.getClass();
            if (!(((float) i10) >= 0.0f)) {
                C.a.c("scrollOffset should be non-negative");
            }
            ((C0675c0) yVar.f1159t).h(i10);
        } else {
            yVar.getClass();
            yVar.f1160u = sVar != null ? sVar.f2117i : null;
            if (yVar.f1157r || rVar.f2106n > 0) {
                yVar.f1157r = true;
                if (!(((float) i10) >= 0.0f)) {
                    C.a.c("scrollOffset should be non-negative");
                }
                yVar.g(sVar != null ? sVar.f2110a : 0, i10);
            }
            if (this.f2016i) {
                E7.b bVar = this.f2009a;
                if (bVar.f1974a != -1 && !r10.isEmpty()) {
                    if (bVar.f1974a != (bVar.f1975b ? ((s) p120l9.m.m0(r10)).f2110a + 1 : ((s) p120l9.m.f0(r10)).f2110a - 1)) {
                        bVar.f1974a = -1;
                        K k7 = (K) bVar.f1976c;
                        if (k7 != null) {
                            k7.cancel();
                        }
                        bVar.f1976c = null;
                    }
                }
            }
        }
        if (z10) {
            float f3 = rVar.f2100f;
            p063g1.c cVar2 = rVar.f2102i;
            InterfaceC0402u interfaceC0402u = rVar.f2101h;
            O8.c cVar3 = this.f2028v;
            cVar3.getClass();
            if (f3 <= cVar2.w(O.f2605a)) {
                return;
            }
            p093j0.i iVarC = p093j0.s.c();
            p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
            p093j0.i iVarD = p093j0.s.d(iVarC);
            try {
                float fFloatValue = ((Number) ((C1422k) cVar3.f6511r).f24028s.getValue()).floatValue();
                C1422k c1422k = (C1422k) cVar3.f6511r;
                if (c1422k.f24032w) {
                    cVar3.f6511r = AbstractC1413d.k(c1422k, fFloatValue - f3);
                    AbstractC0405x.x(interfaceC0402u, null, new N(cVar3, cVar, 0), 3);
                } else {
                    cVar3.f6511r = new C1422k(w0.f24113a, Float.valueOf(-f3), null, 60);
                    AbstractC0405x.x(interfaceC0402u, null, new N(cVar3, cVar, 1), 3);
                }
            } finally {
                p093j0.s.g(iVarC, iVarD, cVarE);
            }
        }
    }

    public final r g() {
        return (r) this.f2013e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f3, r rVar) {
        K k7;
        K k10;
        Object obj;
        K k11;
        if (this.f2016i) {
            ?? r10 = rVar.f2103k;
            ?? r11 = rVar.f2103k;
            if (r10.isEmpty()) {
                return;
            }
            boolean z10 = f3 < 0.0f;
            int i10 = z10 ? ((s) p120l9.m.m0(r11)).f2110a + 1 : ((s) p120l9.m.f0(r11)).f2110a - 1;
            if (i10 < 0 || i10 >= rVar.f2106n) {
                return;
            }
            E7.b bVar = this.f2009a;
            if (i10 != bVar.f1974a) {
                if (bVar.f1975b != z10 && (k11 = (K) bVar.f1976c) != null) {
                    k11.cancel();
                }
                bVar.f1975b = z10;
                bVar.f1974a = i10;
                A a9 = (A) this.f2022p.f6511r;
                p093j0.i iVarC = p093j0.s.c();
                p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
                p093j0.i iVarD = p093j0.s.d(iVarC);
                try {
                    long j = ((r) a9.f2013e.getValue()).j;
                    p093j0.s.g(iVarC, iVarD, cVarE);
                    L l10 = a9.f2021o;
                    android.support.v4.media.session.r rVar2 = l10.f2599c;
                    if (rVar2 != null) {
                        d0 d0Var = new d0(rVar2, i10, j, l10.f2598b);
                        ((e0) rVar2.f11366u).a(d0Var);
                        obj = d0Var;
                    } else {
                        obj = C0174h.f2698r;
                    }
                    bVar.f1976c = obj;
                } catch (Throwable th) {
                    p093j0.s.g(iVarC, iVarD, cVarE);
                    throw th;
                }
            }
            if (!z10) {
                if (rVar.f2104l - ((s) p120l9.m.f0(r11)).f2120m >= f3 || (k7 = (K) bVar.f1976c) == null) {
                    return;
                }
                k7.b();
                return;
            }
            s sVar = (s) p120l9.m.m0(r11);
            if (((sVar.f2120m + sVar.f2121n) + rVar.f2109q) - rVar.f2105m >= (-f3) || (k10 = (K) bVar.f1976c) == null) {
                return;
            }
            k10.b();
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        D0.y yVar = this.f2012d;
        if (((C0675c0) yVar.f1158s).g() != i10 || ((C0675c0) yVar.f1159t).g() != i11) {
            androidx.compose.foundation.lazy.layout.b bVar = this.f2019m;
            bVar.d();
            bVar.f11847b = null;
            bVar.f11848c = -1;
        }
        yVar.g(i10, i11);
        yVar.f1160u = null;
        if (!z10) {
            this.f2024r.setValue(p110k9.y.f19095a);
            return;
        }
        I i12 = this.j;
        if (i12 != null) {
            i12.l();
        }
    }
}
