package J0;

import D0.C0086d;
import H0.C0214m;
import H0.InterfaceC0219s;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends H0.U implements InterfaceC0276b0, H0.K {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public u.y f3966A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public u.y f3967B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3970y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final H0.F f3971z = new H0.F(0, this);

    public static void q0(j0 j0Var) {
        J j;
        j0 j0Var2 = j0Var.f4126D;
        I i10 = j0Var.f4125C;
        if (!p251z9.j.a(j0Var2 != null ? j0Var2.f4125C : null, i10)) {
            i10.f3915X.f3958p.f4036P.f();
            return;
        }
        InterfaceC0273a interfaceC0273aQ = i10.f3915X.f3958p.q();
        if (interfaceC0273aQ == null || (j = ((Z) interfaceC0273aQ).f4036P) == null) {
            return;
        }
        j.f();
    }

    @Override // p063g1.c
    public final /* synthetic */ int E(float f3) {
        return android.support.v4.media.session.p.c(this, f3);
    }

    @Override // p063g1.c
    public final /* synthetic */ long M(long j) {
        return android.support.v4.media.session.p.h(j, this);
    }

    @Override // p063g1.c
    public final /* synthetic */ float Q(long j) {
        return android.support.v4.media.session.p.g(j, this);
    }

    @Override // H0.U
    public final int R(C0214m c0214m) {
        int iH0;
        if (l0() && (iH0 = h0(c0214m)) != Integer.MIN_VALUE) {
            return iH0 + ((int) (this.f3172v & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return android.support.v4.media.session.p.i(this, d0(f3));
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return i10 / getDensity();
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / getDensity();
    }

    @Override // H0.K
    public final H0.J g0(int i10, int i11, Map map, p241y9.c cVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            G0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new N(i10, i11, map, cVar, this);
    }

    public abstract int h0(C0214m c0214m);

    /* JADX WARN: Code duplicated, block: B:66:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[LOOP:2: B:41:0x00b2->B:67:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0107 A[EDGE_INSN: B:76:0x0107->B:68:0x0107 BREAK  A[LOOP:2: B:41:0x00b2->B:67:0x0104], SYNTHETIC] */
    public final void i0(v0 v0Var) {
        long j;
        long j10;
        long j11;
        char c10;
        P pO0;
        t0 snapshotObserver;
        if (this.f3970y || v0Var.f4180r.e() == null) {
            return;
        }
        u.y yVar = this.f3967B;
        if (yVar == null) {
            yVar = new u.y();
            this.f3967B = yVar;
        }
        u.y yVar2 = this.f3966A;
        if (yVar2 == null) {
            yVar2 = new u.y();
            this.f3966A = yVar2;
        }
        Object[] objArr = yVar2.f22779b;
        float[] fArr = yVar2.f22780c;
        long[] jArr = yVar2.f22778a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            j = 128;
            j10 = 255;
            while (true) {
                long j12 = jArr[i10];
                char c11 = 7;
                j11 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j12 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            yVar.e(objArr[i13], fArr[i13]);
                        }
                        j12 >>= 8;
                        i12++;
                        c11 = c11;
                    }
                    c10 = c11;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            j = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
        }
        yVar2.a();
        r0 r0Var = m0().f3901E;
        if (r0Var != null && (snapshotObserver = r0Var.getSnapshotObserver()) != null) {
            snapshotObserver.a(v0Var, C0281e.f4075t, new C0086d(6, v0Var, this));
        }
        Object[] objArr2 = yVar2.f22779b;
        long[] jArr2 = yVar2.f22778a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr2[i14];
                if ((((~j13) << c10) & j13 & j11) == j11) {
                    if (i14 != length2) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j13 & j10) < j) {
                            if (objArr2[(i14 << 3) + i16] != null) {
                                throw new ClassCastException();
                            }
                            if (yVar.c(null) < 0 && (pO0 = o0()) != null) {
                                do {
                                    u.y yVar3 = pO0.f3966A;
                                    if (yVar3 != null && yVar3.c(null) >= 0) {
                                        break;
                                    } else {
                                        pO0 = pO0.o0();
                                    }
                                } while (pO0 != null);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length2) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        yVar.a();
    }

    public abstract P j0();

    public abstract InterfaceC0219s k0();

    @Override // J0.InterfaceC0276b0
    public final void l(boolean z10) {
        P pO0 = o0();
        I iM0 = pO0 != null ? pO0.m0() : null;
        if (p251z9.j.a(iM0, m0())) {
            this.f3968w = z10;
            return;
        }
        if ((iM0 != null ? iM0.f3915X.f3948d : null) != E.f3884t) {
            if ((iM0 != null ? iM0.f3915X.f3948d : null) != E.f3885u) {
                return;
            }
        }
        this.f3968w = z10;
    }

    public abstract boolean l0();

    public abstract I m0();

    public abstract H0.J n0();

    public abstract P o0();

    public abstract long p0();

    public abstract void r0();

    @Override // H0.InterfaceC0215n
    public boolean t() {
        return false;
    }

    @Override // p063g1.c
    public final /* synthetic */ long v(long j) {
        return android.support.v4.media.session.p.f(j, this);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return getDensity() * f3;
    }

    @Override // p063g1.c
    public final /* synthetic */ float z(long j) {
        return android.support.v4.media.session.p.e(j, this);
    }
}
