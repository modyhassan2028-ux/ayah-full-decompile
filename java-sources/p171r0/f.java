package p171r0;

import D.AbstractC0060c;
import G.C;
import K0.AbstractC0359n0;
import W.G0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.X;
import androidx.compose.ui.draw.a;
import l0.o;
import l0.r;
import p074h0.d;
import p104k1.i;
import p104k1.t;
import p110k9.y;
import p171r0.f;
import p180s0.J;
import p180s0.M;
import p223x.I;
import p232y.j0;
import p241y9.c;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(r rVar, c cVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (c0698o.i(cVar) ? 32 : 16);
        if (c0698o.K(i12 & 1, (i12 & 19) != 18)) {
            AbstractC0060c.a(c0698o, a.a(rVar, cVar));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C(i10, 9, rVar, cVar);
        }
    }

    public static final void b(final boolean z10, final p241y9.a aVar, r rVar, final long j, j0 j0Var, t tVar, final J j10, final long j11, float f3, float f7, final d dVar, C0698o c0698o, final int i10) {
        int i11;
        final r rVar2;
        final j0 j0Var2;
        final t tVar2;
        final float f10;
        final float f11;
        char c10;
        int i12;
        r rVar3;
        t tVar3;
        j0 j0Var3;
        float f12;
        float f13;
        r rVar4;
        j.e(aVar, "onDismissRequest");
        c0698o.V(1733545872);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(aVar) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i13 |= c0698o.f(j) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= 8192;
        }
        int i14 = i13 | 196608;
        if ((1572864 & i10) == 0) {
            i14 |= c0698o.g(j10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i14 |= c0698o.f(j11) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i14 |= 33554432;
        }
        if ((805306368 & i10) == 0) {
            i14 |= 268435456;
        }
        if (c0698o.K(i14 & 1, (306783379 & i14) != 306783378)) {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                j0 j0VarD = p181s2.r.d(c0698o);
                c10 = ' ';
                t tVar4 = new t(14);
                float f14 = G0.f8553a;
                float f15 = G0.f8554b;
                i12 = i14 & (-2113986561);
                rVar3 = o.f19333a;
                tVar3 = tVar4;
                j0Var3 = j0VarD;
                f12 = f14;
                f13 = f15;
            } else {
                c0698o.N();
                i12 = i14 & (-2113986561);
                rVar3 = rVar;
                j0Var3 = j0Var;
                tVar3 = tVar;
                f12 = f3;
                f13 = f7;
                c10 = ' ';
            }
            c0698o.q();
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (objH == obj) {
                objH = new I(Boolean.FALSE);
                c0698o.e0(objH);
            }
            I i15 = (I) objH;
            i15.f23856t.setValue(Boolean.valueOf(z10));
            if (((Boolean) i15.f23855s.getValue()).booleanValue() || ((Boolean) i15.f23856t.getValue()).booleanValue()) {
                c0698o.T(1379071288);
                Object objH2 = c0698o.H();
                if (objH2 == obj) {
                    objH2 = C0672b.r(new M(M.f21814b));
                    c0698o.e0(objH2);
                }
                X x9 = (X) objH2;
                p063g1.c cVar = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
                int iE = cVar.E(Float.intBitsToFloat((int) (j >> c10)));
                boolean zG = ((i12 & 7168) == 2048) | c0698o.g(cVar);
                Object objH3 = c0698o.H();
                if (zG || objH3 == obj) {
                    objH3 = new p200u5.d(iE);
                    c0698o.e0(objH3);
                }
                rVar4 = rVar3;
                i.a((p200u5.d) objH3, aVar, tVar3, p074h0.j.d(-2140247945, new p200u5.a(rVar4, i15, x9, j0Var3, j10, j11, f12, f13, dVar), c0698o), c0698o, (i12 & 112) | 3072 | ((i12 >> 9) & 896), 0);
                c0698o.p(false);
            } else {
                c0698o.T(1376775986);
                c0698o.p(false);
                rVar4 = rVar3;
            }
            tVar2 = tVar3;
            rVar2 = rVar4;
            j0Var2 = j0Var3;
            f10 = f12;
            f11 = f13;
        } else {
            c0698o.N();
            rVar2 = rVar;
            j0Var2 = j0Var;
            tVar2 = tVar;
            f10 = f3;
            f11 = f7;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new e() { // from class: u5.c
                @Override // p241y9.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = C0672b.y(i10 | 1);
                    f.b(z10, aVar, rVar2, j, j0Var2, tVar2, j10, j11, f10, f11, dVar, (C0698o) obj2, iY);
                    return y.f19095a;
                }
            };
        }
    }

    public static final e c(long j, long j10) {
        return new e(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final e d(long j, long j10) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new e(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p171r0.f.e(int, int, int, boolean):int");
    }
}
