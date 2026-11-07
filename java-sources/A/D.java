package A;

import D.C0082z;
import D0.C0086d;
import K0.AbstractC0359n0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import p223x.C1424m;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f25s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i10, Object obj) {
        super(3);
        this.f24r = i10;
        this.f25s = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x013f  */
    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i10 = this.f24r;
        int i11 = 2;
        boolean z10 = true;
        long j = 0;
        Z.S s10 = C0690k.f10683a;
        p120l9.s sVar = p120l9.s.f19441r;
        Object obj4 = this.f25s;
        switch (i10) {
            case 0:
                long j10 = ((p171r0.c) obj3).f21387a;
                ((p241y9.c) obj4).e(new p171r0.c(((D0.v) obj2).f1134c));
                return p110k9.y.f19095a;
            case 1:
                C0698o c0698o = (C0698o) obj2;
                ((Number) obj3).intValue();
                c0698o.T(-1415685722);
                D.d0 d0Var = (D.d0) obj4;
                boolean zG = c0698o.g(d0Var);
                Object objH = c0698o.H();
                if (zG || objH == s10) {
                    objH = new D.F(d0Var);
                    c0698o.e0(objH);
                }
                D.F f3 = (D.F) objH;
                c0698o.p(false);
                return f3;
            case 2:
                long j11 = ((p063g1.a) obj3).f16246a;
                long j12 = ((K.s0) obj4).f4779f;
                H0.U uA = ((H0.H) obj2).a(p063g1.a.a(j11, B0.c.l((int) (j12 >> 32), p063g1.a.j(j11), p063g1.a.h(j11)), 0, B0.c.l((int) (j12 & 4294967295L), p063g1.a.i(j11), p063g1.a.g(j11)), 0, 10));
                return ((H0.K) obj).g0(uA.f3168r, uA.f3169s, sVar, new C0082z(uA, 6));
            case 3:
                C0698o c0698o2 = (C0698o) obj2;
                ((Number) obj3).intValue();
                c0698o2.T(1582736677);
                p063g1.c cVar = (p063g1.c) c0698o2.k(AbstractC0359n0.f5118h);
                Y0.d dVar = (Y0.d) c0698o2.k(AbstractC0359n0.f5120k);
                p063g1.m mVar = (p063g1.m) c0698o2.k(AbstractC0359n0.f5123n);
                U0.L l10 = (U0.L) obj4;
                boolean zG2 = c0698o2.g(l10) | c0698o2.g(mVar);
                Object objH2 = c0698o2.H();
                if (zG2 || objH2 == s10) {
                    objH2 = B0.c.a0(l10, mVar);
                    c0698o2.e0(objH2);
                }
                U0.L l11 = (U0.L) objH2;
                boolean zG3 = c0698o2.g(dVar) | c0698o2.g(l11);
                Object objH3 = c0698o2.H();
                if (zG3 || objH3 == s10) {
                    U0.C c10 = l11.f8037a;
                    Y0.e eVar = c10.f7999f;
                    Y0.l lVar = c10.f7996c;
                    if (lVar == null) {
                        lVar = Y0.l.f10359t;
                    }
                    Y0.j jVar = c10.f7997d;
                    int i12 = jVar != null ? jVar.f10356a : 0;
                    Y0.k kVar = c10.f7998e;
                    objH3 = ((Y0.f) dVar).b(eVar, lVar, i12, kVar != null ? kVar.f10357a : 65535);
                    c0698o2.e0(objH3);
                }
                Z.L0 l12 = (Z.L0) objH3;
                Object objH4 = c0698o2.H();
                Object obj5 = objH4;
                if (objH4 == s10) {
                    Object value = l12.getValue();
                    K.s0 s0Var = new K.s0();
                    s0Var.f4774a = mVar;
                    s0Var.f4775b = cVar;
                    s0Var.f4776c = dVar;
                    s0Var.f4777d = l10;
                    s0Var.f4778e = value;
                    s0Var.f4779f = K.i0.a(l10, cVar, dVar, K.i0.f4650a, 1);
                    c0698o2.e0(s0Var);
                    obj5 = s0Var;
                }
                K.s0 s0Var2 = (K.s0) obj5;
                Object value2 = l12.getValue();
                if (mVar != s0Var2.f4774a || !p251z9.j.a(cVar, s0Var2.f4775b) || !p251z9.j.a(dVar, s0Var2.f4776c) || !p251z9.j.a(l11, s0Var2.f4777d) || !p251z9.j.a(value2, s0Var2.f4778e)) {
                    s0Var2.f4774a = mVar;
                    s0Var2.f4775b = cVar;
                    s0Var2.f4776c = dVar;
                    s0Var2.f4777d = l11;
                    s0Var2.f4778e = value2;
                    s0Var2.f4779f = K.i0.a(l11, cVar, dVar, K.i0.f4650a, 1);
                }
                boolean zI = c0698o2.i(s0Var2);
                Object objH5 = c0698o2.H();
                if (zI || objH5 == s10) {
                    objH5 = new D(i11, s0Var2);
                    c0698o2.e0(objH5);
                }
                l0.r rVarB = androidx.compose.ui.layout.a.b(l0.o.f19333a, (p241y9.f) objH5);
                c0698o2.p(false);
                return rVarB;
            case 4:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                M.g gVar = (M.g) obj4;
                if (!zBooleanValue) {
                    iIntValue = gVar.f5607L.a(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = gVar.f5607L.a(iIntValue2);
                }
                if (gVar.f5606K) {
                    long j13 = gVar.f5604I.f10954b;
                    int i13 = U0.K.f8034c;
                    if (iIntValue == ((int) (j13 >> 32)) && iIntValue2 == ((int) (j13 & 4294967295L))) {
                        z10 = false;
                    } else {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        K.L l13 = K.L.f4484r;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > gVar.f5604I.f10953a.f8060s.length()) {
                            O.N n6 = gVar.f5608M;
                            n6.q(false);
                            n6.o(l13);
                            z10 = false;
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                O.N n10 = gVar.f5608M;
                                n10.q(false);
                                n10.o(l13);
                            } else {
                                gVar.f5608M.f(true);
                            }
                            gVar.f5605J.f4572v.e(new Z0.y(gVar.f5604I.f10953a, va.g.e(iIntValue, iIntValue2), (U0.K) null));
                        }
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 5:
                l0.r rVar = (l0.r) obj;
                C0698o c0698o3 = (C0698o) obj2;
                ((Number) obj3).intValue();
                O.N n11 = (O.N) obj4;
                c0698o3.T(1980580247);
                p063g1.c cVar2 = (p063g1.c) c0698o3.k(AbstractC0359n0.f5118h);
                Object objH6 = c0698o3.H();
                if (objH6 == s10) {
                    objH6 = C0672b.r(new p063g1.l(0L));
                    c0698o3.e0(objH6);
                }
                Z.X x9 = (Z.X) objH6;
                boolean zI2 = c0698o3.i(n11);
                Object objH7 = c0698o3.H();
                if (zI2 || objH7 == s10) {
                    objH7 = new C0086d(15, n11, x9);
                    c0698o3.e0(objH7);
                }
                p241y9.a aVar = (p241y9.a) objH7;
                boolean zG4 = c0698o3.g(cVar2);
                Object objH8 = c0698o3.H();
                if (zG4 || objH8 == s10) {
                    objH8 = new O.S(cVar2, x9, 1);
                    c0698o3.e0(objH8);
                }
                C1424m c1424m = O.B.f6273a;
                l0.r rVarA = l0.a.a(rVar, new M(i11, aVar, (p241y9.c) objH8));
                c0698o3.p(false);
                return rVarA;
            case 6:
                H0.U uA2 = ((H0.H) obj2).a(((p063g1.a) obj3).f16246a);
                return ((H0.K) obj).g0(uA2.f3168r, uA2.f3169s, sVar, new X.L(16, uA2, (p214w.u) obj4));
            case 7:
                H0.K k7 = (H0.K) obj;
                H0.U uA3 = ((H0.H) obj2).a(((p063g1.a) obj3).f16246a);
                if (k7.t()) {
                    Boolean bool = (Boolean) ((p223x.q0) obj4).f24068d.getValue();
                    bool.booleanValue();
                    if (bool.booleanValue()) {
                        j = (((long) uA3.f3169s) & 4294967295L) | (((long) uA3.f3168r) << 32);
                    }
                } else {
                    j = (((long) uA3.f3169s) & 4294967295L) | (((long) uA3.f3168r) << 32);
                }
                return k7.g0((int) (j >> 32), (int) (j & 4294967295L), sVar, new C0082z(uA3, 11));
            default:
                C0698o c0698o4 = (C0698o) obj2;
                ((Number) obj3).intValue();
                c0698o4.T(438406499);
                p223x.u0 u0Var = (p223x.u0) obj4;
                c0698o4.p(false);
                return u0Var;
        }
    }
}
