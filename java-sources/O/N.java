package O;

import A.C0039q;
import K.A0;
import K.W;
import K.t0;
import K0.InterfaceC0353k0;
import K0.Y0;
import K0.Z0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import U0.C0509a;
import U0.C0515g;
import Z.C0672b;
import Z.C0681f0;
import android.view.ActionMode;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.J1;
import io.realm.RealmFieldTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f6308a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W f6311d;
    public p251z9.k g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0353k0 f6314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC0402u f6315i;
    public Y0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p243z0.a f6316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p162q0.p f6317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0681f0 f6318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0681f0 f6319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f6320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f6321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0681f0 f6323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0681f0 f6324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z0.y f6326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public J1 f6327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final I f6328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final O8.c f6329x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z0.s f6309b = K.T.f4545d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p241y9.c f6310c = z.f6435u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0681f0 f6312e = C0672b.r(new Z0.y(0, 7, (String) null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public W2.n f6313f = Z0.G.f10893a;

    public N(A0 a9) {
        this.f6308a = a9;
        Boolean bool = Boolean.TRUE;
        this.f6318m = C0672b.r(bool);
        this.f6319n = C0672b.r(bool);
        this.f6320o = 0L;
        this.f6322q = 0L;
        this.f6323r = C0672b.r(null);
        this.f6324s = C0672b.r(null);
        this.f6325t = -1;
        this.f6326u = new Z0.y(0L, 7, (String) null);
        this.f6328w = new I(this, 1);
        this.f6329x = new O8.c(this);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:101:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    /* JADX WARN: Code duplicated, block: B:87:0x0180  */
    /* JADX WARN: Code duplicated, block: B:89:0x0187  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    /* JADX WARN: Code duplicated, block: B:92:0x019d  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b9  */
    public static final long a(N n6, Z0.y yVar, long j, boolean z10, boolean z11, J1.c cVar, boolean z12) {
        t0 t0VarD;
        long j10;
        C0446n c0446n;
        C0446n c0446n2;
        boolean z13;
        p243z0.a aVar;
        C0445m c0445mI;
        C0445m c0445mI2;
        C0446n c0446n3;
        boolean z14;
        String str;
        int i10;
        int length;
        boolean z15;
        int iR;
        C0446n c0446nA;
        int iU;
        int iR2;
        W w9 = n6.f6311d;
        if (w9 == null || (t0VarD = w9.d()) == null) {
            return U0.K.f8033b;
        }
        Z0.s sVar = n6.f6309b;
        long j11 = yVar.f10954b;
        C0515g c0515g = yVar.f10953a;
        int i11 = U0.K.f8034c;
        long jE = va.g.e(sVar.b((int) (j11 >> 32)), n6.f6309b.b((int) (j11 & 4294967295L)));
        int iB = t0VarD.b(j, false);
        int i12 = (z11 || z10) ? iB : (int) (jE >> 32);
        int i13 = (!z11 || z10) ? iB : (int) (jE & 4294967295L);
        J1 j12 = n6.f6327v;
        int i14 = -1;
        if (z10 || j12 == null) {
            j10 = 4294967295L;
        } else {
            j10 = 4294967295L;
            int i15 = n6.f6325t;
            if (i15 != -1) {
                i14 = i15;
            }
        }
        U0.I i16 = t0VarD.f4794a;
        if (z10) {
            c0446n = null;
        } else {
            int i17 = (int) (jE >> 32);
            int i18 = (int) (jE & j10);
            c0446n = new C0446n(new C0445m(p017b7.g.f0(i16, i17), i17, 1L), new C0445m(p017b7.g.f0(i16, i18), i18, 1L), U0.K.f(jE));
        }
        J1 j13 = new J1(z11, c0446n, new E2.A(i12, i13, i14, i16));
        if (c0446n != null && j12 != null && z11 == j12.f14055b) {
            E2.A a9 = (E2.A) j12.f14057d;
            if (i12 == a9.f1434b && i13 == a9.f1435c) {
                return j11;
            }
        }
        n6.f6327v = j13;
        n6.f6325t = iB;
        int i19 = cVar.f4195r;
        EnumC0442j enumC0442j = EnumC0442j.f6376r;
        switch (i19) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                E2.A a10 = (E2.A) j13.f14057d;
                c0446n2 = new C0446n(a10.d(a10.f1434b), a10.d(a10.f1435c), j13.d() == enumC0442j);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                c0446n2 = Y2.a.f(j13, C0447o.f6390c);
                break;
            case 17:
                c0446n2 = Y2.a.f(j13, C0447o.f6389b);
                break;
            default:
                Object obj = j13.f14056c;
                c0446n2 = (C0446n) obj;
                if (c0446n2 != null) {
                    C0445m c0445m = c0446n2.f6387b;
                    C0445m c0445m2 = c0446n2.f6386a;
                    E2.A a11 = (E2.A) j13.f14057d;
                    if (j13.f14055b) {
                        c0445mI2 = Y2.a.i(j13, a11, c0445m2);
                        c0445mI = c0445m;
                        c0445m = c0445m2;
                        c0445m2 = c0445mI2;
                    } else {
                        c0445mI = Y2.a.i(j13, a11, c0445m);
                        c0445mI2 = c0445mI;
                    }
                    if (!p251z9.j.a(c0445mI2, c0445m)) {
                        c0446n2 = new C0446n(c0445m2, c0445mI, j13.d() == enumC0442j || (j13.d() == EnumC0442j.f6378t && c0445m2.f6384b > c0445mI.f6384b));
                        E2.A a12 = (E2.A) j13.f14057d;
                        C0445m c0445m3 = c0446n2.f6386a;
                        long j14 = c0445m3.f6385c;
                        C0445m c0445m4 = c0446n2.f6387b;
                        if (j14 != c0445m4.f6385c) {
                            boolean z16 = c0446n2.f6388c;
                            if ((z16 ? c0445m3 : c0445m4).f6384b == 0) {
                                if (((U0.I) a12.f1437e).f8023a.f8015a.f8060s.length() == (z16 ? c0445m4 : c0445m3).f6384b) {
                                    String str2 = ((U0.I) a12.f1437e).f8023a.f8015a.f8060s;
                                    c0446n3 = (C0446n) obj;
                                    z14 = j13.f14055b;
                                    if (c0446n3 != null) {
                                        str = ((U0.I) a12.f1437e).f8023a.f8015a.f8060s;
                                        i10 = a12.f1434b;
                                        length = str.length();
                                        if (i10 == 0) {
                                            iR2 = K.T.r(0, str);
                                            if (z14) {
                                                c0446nA = C0446n.a(c0446n2, Y2.a.q(c0445m3, a12, iR2), null, true, 2);
                                            } else {
                                                c0446nA = C0446n.a(c0446n2, null, Y2.a.q(c0445m4, a12, iR2), false, 1);
                                            }
                                        } else if (i10 == length) {
                                            iU = K.T.u(length, str);
                                            if (z14) {
                                                c0446nA = C0446n.a(c0446n2, Y2.a.q(c0445m3, a12, iU), null, false, 2);
                                            } else {
                                                c0446nA = C0446n.a(c0446n2, null, Y2.a.q(c0445m4, a12, iU), true, 1);
                                            }
                                        } else {
                                            if (c0446n3.f6388c) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (z14 ^ z15) {
                                                iR = K.T.u(i10, str);
                                            } else {
                                                iR = K.T.r(i10, str);
                                            }
                                            if (z14) {
                                                c0446nA = C0446n.a(c0446n2, Y2.a.q(c0445m3, a12, iR), null, z15, 2);
                                            } else {
                                                c0446nA = C0446n.a(c0446n2, null, Y2.a.q(c0445m4, a12, iR), z15, 1);
                                            }
                                        }
                                        c0446n2 = c0446nA;
                                    }
                                }
                            }
                        } else if (c0445m3.f6384b == c0445m4.f6384b) {
                            String str3 = ((U0.I) a12.f1437e).f8023a.f8015a.f8060s;
                            c0446n3 = (C0446n) obj;
                            z14 = j13.f14055b;
                            if (c0446n3 != null && str3.length() != 0) {
                                str = ((U0.I) a12.f1437e).f8023a.f8015a.f8060s;
                                i10 = a12.f1434b;
                                length = str.length();
                                if (i10 == 0) {
                                    iR2 = K.T.r(0, str);
                                    if (z14) {
                                        c0446nA = C0446n.a(c0446n2, Y2.a.q(c0445m3, a12, iR2), null, true, 2);
                                    } else {
                                        c0446nA = C0446n.a(c0446n2, null, Y2.a.q(c0445m4, a12, iR2), false, 1);
                                    }
                                } else if (i10 == length) {
                                    iU = K.T.u(length, str);
                                    if (z14) {
                                        c0446nA = C0446n.a(c0446n2, Y2.a.q(c0445m3, a12, iU), null, false, 2);
                                    } else {
                                        c0446nA = C0446n.a(c0446n2, null, Y2.a.q(c0445m4, a12, iU), true, 1);
                                    }
                                } else {
                                    if (c0446n3.f6388c) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z14 ^ z15) {
                                        iR = K.T.u(i10, str);
                                    } else {
                                        iR = K.T.r(i10, str);
                                    }
                                    if (z14) {
                                        c0446nA = C0446n.a(c0446n2, Y2.a.q(c0445m3, a12, iR), null, z15, 2);
                                    } else {
                                        c0446nA = C0446n.a(c0446n2, null, Y2.a.q(c0445m4, a12, iR), z15, 1);
                                    }
                                }
                                c0446n2 = c0446nA;
                            }
                        }
                    }
                } else {
                    c0446n2 = Y2.a.f(j13, C0447o.f6390c);
                }
                break;
        }
        long jE2 = va.g.e(n6.f6309b.a(c0446n2.f6386a.f6384b), n6.f6309b.a(c0446n2.f6387b.f6384b));
        if (U0.K.a(jE2, j11)) {
            return j11;
        }
        boolean z17 = U0.K.f(jE2) != U0.K.f(j11) && U0.K.a(va.g.e((int) (jE2 & j10), (int) (jE2 >> 32)), j11);
        boolean z18 = U0.K.b(jE2) && U0.K.b(j11);
        if (z12 && c0515g.f8060s.length() > 0 && !z17 && !z18 && (aVar = n6.f6316k) != null) {
            aVar.a(9);
        }
        n6.f6310c.e(c(c0515g, jE2));
        if (!z12) {
            n6.q(!U0.K.b(jE2));
        }
        W w10 = n6.f6311d;
        if (w10 != null) {
            w10.f4567q.setValue(Boolean.valueOf(z12));
        }
        W w11 = n6.f6311d;
        if (w11 != null) {
            w11.f4563m.setValue(Boolean.valueOf(!U0.K.b(jE2) && p050e8.b.I(n6, true)));
        }
        W w12 = n6.f6311d;
        if (w12 == null) {
            z13 = false;
        } else {
            z13 = false;
            w12.f4564n.setValue(Boolean.valueOf(!U0.K.b(jE2) && p050e8.b.I(n6, false)));
        }
        W w13 = n6.f6311d;
        if (w13 == null) {
            return jE2;
        }
        if (U0.K.b(jE2) && p050e8.b.I(n6, true)) {
            z13 = true;
        }
        w13.f4565o.setValue(Boolean.valueOf(z13));
        return jE2;
    }

    public static Z0.y c(C0515g c0515g, long j) {
        return new Z0.y(c0515g, j, (U0.K) null);
    }

    public final K9.A b(boolean z10) {
        InterfaceC0402u interfaceC0402u = this.f6315i;
        p150o9.c cVar = null;
        if (interfaceC0402u != null) {
            return AbstractC0405x.x(interfaceC0402u, null, new H(this, z10, cVar, 0), 1);
        }
        return null;
    }

    public final void d() {
        InterfaceC0402u interfaceC0402u = this.f6315i;
        if (interfaceC0402u != null) {
            AbstractC0405x.x(interfaceC0402u, null, new J(this, null, 0), 1);
        }
    }

    public final void e(p171r0.c cVar) {
        if (!U0.K.b(k().f10954b)) {
            W w9 = this.f6311d;
            t0 t0VarD = w9 != null ? w9.d() : null;
            int iD = (cVar == null || t0VarD == null) ? U0.K.d(k().f10954b) : this.f6309b.a(t0VarD.b(cVar.f21387a, true));
            this.f6310c.e(Z0.y.a(k(), null, va.g.e(iD, iD), 5));
        }
        o((cVar == null || k().f10953a.f8060s.length() <= 0) ? K.L.f4484r : K.L.f4486t);
        q(false);
    }

    public final void f(boolean z10) {
        p162q0.p pVar;
        W w9 = this.f6311d;
        if (w9 != null && !w9.b() && (pVar = this.f6317l) != null) {
            p162q0.p.b(pVar);
        }
        this.f6326u = k();
        q(z10);
        o(K.L.f4485s);
    }

    public final p171r0.c g() {
        return (p171r0.c) this.f6324s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.f6318m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.f6319n.getValue()).booleanValue();
    }

    public final long j(boolean z10) {
        t0 t0VarD;
        long j;
        W w9 = this.f6311d;
        if (w9 == null || (t0VarD = w9.d()) == null) {
            return 9205357640488583168L;
        }
        U0.I i10 = t0VarD.f4794a;
        U0.p pVar = i10.f8024b;
        W w10 = this.f6311d;
        C0515g c0515g = w10 != null ? w10.f4553a.f4632a : null;
        if (c0515g == null) {
            return 9205357640488583168L;
        }
        if (!p251z9.j.a(c0515g.f8060s, i10.f8023a.f8015a.f8060s)) {
            return 9205357640488583168L;
        }
        Z0.y yVarK = k();
        if (z10) {
            long j10 = yVarK.f10954b;
            int i11 = U0.K.f8034c;
            j = j10 >> 32;
        } else {
            long j11 = yVarK.f10954b;
            int i12 = U0.K.f8034c;
            j = j11 & 4294967295L;
        }
        int iB = this.f6309b.b((int) j);
        boolean zF = U0.K.f(k().f10954b);
        long j12 = i10.f8025c;
        int iD = pVar.d(iB);
        if (iD >= pVar.f8111f) {
            return 9205357640488583168L;
        }
        boolean z11 = i10.a(((!z10 || zF) && (z10 || !zF)) ? Math.max(iB + (-1), 0) : iB) == i10.g(iB);
        ArrayList arrayList = pVar.f8112h;
        pVar.l(iB);
        U0.r rVar = (U0.r) arrayList.get(iB == ((C0515g) pVar.f8106a.f1960b).f8060s.length() ? AbstractC0813f2.E(arrayList) : AbstractC0813f2.v(iB, arrayList));
        C0509a c0509a = rVar.f8115a;
        int iD2 = rVar.d(iB);
        V0.r rVar2 = c0509a.f8045d;
        return (((long) Float.floatToRawIntBits(B0.c.k(pVar.b(iD), 0.0f, (int) (j12 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(B0.c.k(z11 ? rVar2.h(iD2, false) : rVar2.i(iD2, false), 0.0f, (int) (j12 >> 32)))) << 32);
    }

    public final Z0.y k() {
        return (Z0.y) this.f6312e.getValue();
    }

    public final void l() {
        Y0 y10 = this.j;
        if ((y10 != null ? ((K0.W) y10).f5031d : null) != Z0.f5049r || y10 == null) {
            return;
        }
        K0.W w9 = (K0.W) y10;
        w9.f5031d = Z0.f5050s;
        ActionMode actionMode = w9.f5029b;
        if (actionMode != null) {
            actionMode.finish();
        }
        w9.f5029b = null;
    }

    public final void m() {
        InterfaceC0402u interfaceC0402u = this.f6315i;
        if (interfaceC0402u != null) {
            AbstractC0405x.x(interfaceC0402u, null, new J(this, null, 1), 1);
        }
    }

    public final void n() {
        Z0.y yVarC = c(k().f10953a, va.g.e(0, k().f10953a.f8060s.length()));
        this.f6310c.e(yVarC);
        this.f6326u = Z0.y.a(this.f6326u, null, yVarC.f10954b, 5);
        f(true);
    }

    public final void o(K.L l10) {
        W w9 = this.f6311d;
        if (w9 != null) {
            if (w9.a() == l10) {
                w9 = null;
            }
            if (w9 != null) {
                w9.f4561k.setValue(l10);
            }
        }
    }

    public final void p() {
        InterfaceC0402u interfaceC0402u = this.f6315i;
        if (interfaceC0402u != null) {
            AbstractC0405x.x(interfaceC0402u, null, new C0039q(this, (p150o9.c) null, 17), 1);
        }
    }

    public final void q(boolean z10) {
        W w9 = this.f6311d;
        if (w9 != null) {
            w9.f4562l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            p();
        } else {
            l();
        }
    }
}
