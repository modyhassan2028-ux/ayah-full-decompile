package K;

import H0.AbstractC0204c;
import H0.InterfaceC0215n;
import H0.InterfaceC0219s;
import U0.C0515g;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;

/* JADX INFO: renamed from: K.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0329x implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f4815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f4816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z0.y f4817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z0.s f4818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p063g1.c f4819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4820f;

    public C0329x(W w9, p241y9.c cVar, Z0.y yVar, Z0.s sVar, p063g1.c cVar2, int i10) {
        this.f4815a = w9;
        this.f4816b = cVar;
        this.f4817c = yVar;
        this.f4818d = sVar;
        this.f4819e = cVar2;
        this.f4820f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    /* JADX WARN: Code duplicated, block: B:73:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0243  */
    /* JADX WARN: Code duplicated, block: B:90:0x024b  */
    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        W w9;
        U0.I i10;
        U0.I i11;
        U0.I i12;
        C0329x c0329x;
        W w10;
        int i13;
        int iP;
        InterfaceC0219s interfaceC0219s;
        int i14;
        int iJ;
        int iH;
        int i15;
        E6.u uVar;
        E6.u uVar2;
        W w11 = this.f4815a;
        p093j0.i iVarC = p093j0.s.c();
        p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
        p093j0.i iVarD = p093j0.s.d(iVarC);
        try {
            t0 t0VarD = w11.d();
            p093j0.s.g(iVarC, iVarD, cVarE);
            U0.I i16 = t0VarD != null ? t0VarD.f4794a : null;
            f0 f0Var = w11.f4553a;
            p063g1.m layoutDirection = k7.getLayoutDirection();
            int i17 = f0Var.f4637f;
            boolean z10 = f0Var.f4636e;
            int i18 = f0Var.f4634c;
            if (i16 != null) {
                U0.p pVar = i16.f8024b;
                U0.H h7 = i16.f8023a;
                C0515g c0515g = f0Var.f4632a;
                U0.L l10 = f0Var.f4633b;
                List list2 = f0Var.f4639i;
                p063g1.c cVar = f0Var.g;
                Y0.d dVar = f0Var.f4638h;
                i11 = i16;
                if (!pVar.f8106a.c()) {
                    C0515g c0515g2 = h7.f8015a;
                    w9 = w11;
                    long j10 = h7.j;
                    if (p251z9.j.a(c0515g2, c0515g) && h7.f8016b.c(l10) && p251z9.j.a(h7.f8017c, list2) && h7.f8018d == i18 && h7.f8019e == z10 && h7.f8020f == i17 && p251z9.j.a(h7.g, cVar) && h7.f8021h == layoutDirection && p251z9.j.a(h7.f8022i, dVar) && p063g1.a.j(j) == p063g1.a.j(j10)) {
                        if ((z10 || i17 == 2) && !(p063g1.a.h(j) == p063g1.a.h(j10) && p063g1.a.g(j) == p063g1.a.g(j10))) {
                            j = j;
                            i14 = 2;
                            i10 = i11;
                            f0Var.a(layoutDirection);
                            iJ = p063g1.a.j(j);
                            iH = ((!z10 || i17 == i14) && p063g1.a.d(j)) ? p063g1.a.h(j) : Integer.MAX_VALUE;
                            if (z10 && i17 == i14) {
                                i15 = 1;
                            } else {
                                i15 = i18;
                            }
                            if (iJ != iH) {
                                uVar2 = f0Var.j;
                                if (uVar2 != null) {
                                    throw new IllegalStateException("layoutIntrinsics must be called first");
                                }
                                iH = B0.c.l(T.p(uVar2.h()), iJ, iH);
                            }
                            uVar = f0Var.j;
                            if (uVar != null) {
                                throw new IllegalStateException("layoutIntrinsics must be called first");
                            }
                            U0.p pVar2 = new U0.p(uVar, AbstractC0813f2.A(0, iH, 0, p063g1.a.g(j)), i15, f0Var.f4637f);
                            i11 = i10;
                            i12 = new U0.I(new U0.H(f0Var.f4632a, f0Var.f4633b, f0Var.f4639i, f0Var.f4634c, f0Var.f4636e, f0Var.f4637f, f0Var.g, layoutDirection, f0Var.f4638h, j), pVar2, p063g1.b.d(j, (((long) T.p(pVar2.f8109d)) << 32) | (((long) T.p(pVar2.f8110e)) & 4294967295L)));
                        } else {
                            i12 = new U0.I(new U0.H(h7.f8015a, f0Var.f4633b, h7.f8017c, h7.f8018d, h7.f8019e, h7.f8020f, h7.g, h7.f8021h, h7.f8022i, j), pVar, p063g1.b.d(j, (((long) T.p(pVar.f8110e)) & 4294967295L) | (((long) T.p(pVar.f8109d)) << 32)));
                        }
                    }
                    long j11 = i12.f8025c;
                    Integer numValueOf = Integer.valueOf((int) (j11 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j11 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (p251z9.j.a(i11, i12)) {
                        c0329x = this;
                        w10 = w9;
                        i13 = 0;
                    } else {
                        if (t0VarD != 0) {
                            interfaceC0219s = t0VarD.f4796c;
                        } else {
                            interfaceC0219s = null;
                        }
                        w10 = w9;
                        w10.f4560i.setValue(new t0(i12, interfaceC0219s));
                        i13 = 0;
                        w10.f4566p = false;
                        c0329x = this;
                        c0329x.f4816b.e(i12);
                        T.w(w10, c0329x.f4817c, c0329x.f4818d);
                    }
                    if (c0329x.f4820f == 1) {
                        iP = T.p(i12.f8024b.b(i13));
                    } else {
                        iP = 0;
                    }
                    w10.g.setValue(new p063g1.f(c0329x.f4819e.b0(iP)));
                    return k7.g0(iIntValue, iIntValue2, p120l9.w.i0(new p110k9.j(AbstractC0204c.f3185a, Integer.valueOf(Math.round(i12.f8026d))), new p110k9.j(AbstractC0204c.f3186b, Integer.valueOf(Math.round(i12.f8027e)))), C0317k.f4670u);
                }
                w9 = w11;
                i10 = i11;
            } else {
                j = j;
                w9 = w11;
                i10 = i16;
            }
            i14 = 2;
            f0Var.a(layoutDirection);
            iJ = p063g1.a.j(j);
            if (z10) {
            }
            if (z10) {
                i15 = i18;
            } else {
                i15 = i18;
            }
            if (iJ != iH) {
                uVar2 = f0Var.j;
                if (uVar2 != null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                iH = B0.c.l(T.p(uVar2.h()), iJ, iH);
            }
            uVar = f0Var.j;
            if (uVar != null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            U0.p pVar3 = new U0.p(uVar, AbstractC0813f2.A(0, iH, 0, p063g1.a.g(j)), i15, f0Var.f4637f);
            i11 = i10;
            i12 = new U0.I(new U0.H(f0Var.f4632a, f0Var.f4633b, f0Var.f4639i, f0Var.f4634c, f0Var.f4636e, f0Var.f4637f, f0Var.g, layoutDirection, f0Var.f4638h, j), pVar3, p063g1.b.d(j, (((long) T.p(pVar3.f8109d)) << 32) | (((long) T.p(pVar3.f8110e)) & 4294967295L)));
            long j12 = i12.f8025c;
            Integer numValueOf3 = Integer.valueOf((int) (j12 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j12 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (p251z9.j.a(i11, i12)) {
                if (t0VarD != 0) {
                    interfaceC0219s = t0VarD.f4796c;
                } else {
                    interfaceC0219s = null;
                }
                w10 = w9;
                w10.f4560i.setValue(new t0(i12, interfaceC0219s));
                i13 = 0;
                w10.f4566p = false;
                c0329x = this;
                c0329x.f4816b.e(i12);
                T.w(w10, c0329x.f4817c, c0329x.f4818d);
            } else {
                c0329x = this;
                w10 = w9;
                i13 = 0;
            }
            if (c0329x.f4820f == 1) {
                iP = T.p(i12.f8024b.b(i13));
            } else {
                iP = 0;
            }
            w10.g.setValue(new p063g1.f(c0329x.f4819e.b0(iP)));
            return k7.g0(iIntValue3, iIntValue4, p120l9.w.i0(new p110k9.j(AbstractC0204c.f3185a, Integer.valueOf(Math.round(i12.f8026d))), new p110k9.j(AbstractC0204c.f3186b, Integer.valueOf(Math.round(i12.f8027e)))), C0317k.f4670u);
        } catch (Throwable th) {
            p093j0.s.g(iVarC, iVarD, cVarE);
            throw th;
        }
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        W w9 = this.f4815a;
        w9.f4553a.a(interfaceC0215n.getLayoutDirection());
        E6.u uVar = w9.f4553a.j;
        if (uVar != null) {
            return T.p(uVar.h());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }
}
