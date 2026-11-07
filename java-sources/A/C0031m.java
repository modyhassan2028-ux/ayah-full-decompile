package A;

import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import J0.InterfaceC0289l;
import J0.InterfaceC0301y;
import K9.AbstractC0405x;

/* JADX INFO: renamed from: A.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0031m extends l0.q implements InterfaceC0301y, InterfaceC0289l {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EnumC0047u0 f315F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final b1 f316G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f317H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC0219s f319J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f320K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f321L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f323N;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0009b f318I = new C0009b(0);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f322M = 0;

    public C0031m(EnumC0047u0 enumC0047u0, b1 b1Var, boolean z10) {
        this.f315F = enumC0047u0;
        this.f316G = b1Var;
        this.f317H = z10;
    }

    public static final float v0(C0031m c0031m, InterfaceC0015e interfaceC0015e) {
        p171r0.e eVar;
        int iCompare;
        if (p063g1.l.a(c0031m.f322M, 0L)) {
            return 0.0f;
        }
        p011b0.e eVar2 = c0031m.f318I.f188a;
        int i10 = eVar2.f13127t - 1;
        Object[] objArr = eVar2.f13125r;
        if (i10 < objArr.length) {
            eVar = null;
            while (i10 >= 0) {
                p171r0.e eVar3 = (p171r0.e) ((C0021h) objArr[i10]).f246a.invoke();
                if (eVar3 != null) {
                    long jC = eVar3.c();
                    long jD0 = B9.a.d0(c0031m.f322M);
                    int iOrdinal = c0031m.f315F.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jD0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new A6.a();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jD0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (eVar != null) {
                            break;
                        }
                        eVar = eVar3;
                        break;
                    }
                    eVar = eVar3;
                }
                i10--;
            }
        } else {
            eVar = null;
        }
        if (eVar == null) {
            p171r0.e eVarW0 = c0031m.f320K ? c0031m.w0() : null;
            if (eVarW0 == null) {
                return 0.0f;
            }
            eVar = eVarW0;
        }
        long jD1 = B9.a.d0(c0031m.f322M);
        int iOrdinal2 = c0031m.f315F.ordinal();
        if (iOrdinal2 == 0) {
            float f3 = eVar.f21390b;
            return interfaceC0015e.a(f3, eVar.f21392d - f3, Float.intBitsToFloat((int) (jD1 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new A6.a();
        }
        float f7 = eVar.f21389a;
        return interfaceC0015e.a(f7, eVar.f21391c - f7, Float.intBitsToFloat((int) (jD1 >> 32)));
    }

    @Override // J0.InterfaceC0301y
    public final /* synthetic */ void G(InterfaceC0219s interfaceC0219s) {
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // J0.InterfaceC0301y
    public final void s(long j) {
        int iF;
        p171r0.e eVarW0;
        long j10 = this.f322M;
        this.f322M = j;
        int iOrdinal = this.f315F.ordinal();
        if (iOrdinal == 0) {
            iF = p251z9.j.f((int) (j & 4294967295L), (int) (4294967295L & j10));
        } else {
            if (iOrdinal != 1) {
                throw new A6.a();
            }
            iF = p251z9.j.f((int) (j >> 32), (int) (j10 >> 32));
        }
        if (iF >= 0 || this.f323N || this.f320K || (eVarW0 = w0()) == null || !x0(eVarW0, j10)) {
            return;
        }
        this.f321L = true;
    }

    public final p171r0.e w0() {
        if (this.f19338E) {
            J0.j0 j0VarW = AbstractC0283f.w(this);
            InterfaceC0219s interfaceC0219s = this.f319J;
            if (interfaceC0219s != null) {
                if (!interfaceC0219s.C()) {
                    interfaceC0219s = null;
                }
                if (interfaceC0219s != null) {
                    return j0VarW.J(interfaceC0219s, false);
                }
            }
        }
        return null;
    }

    public final boolean x0(p171r0.e eVar, long j) {
        long jZ0 = z0(eVar, j);
        return Math.abs(Float.intBitsToFloat((int) (jZ0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jZ0 & 4294967295L))) <= 0.5f;
    }

    public final void y0() {
        InterfaceC0015e interfaceC0015e = (InterfaceC0015e) AbstractC0283f.i(this, AbstractC0019g.f240a);
        if (this.f323N) {
            C.a.c("launchAnimation called when previous animation was running");
        }
        InterfaceC0015e.f226a.getClass();
        AbstractC0405x.x(h0(), null, new C0029l(this, new r1(C0013d.f215b), interfaceC0015e, (p150o9.c) null, 0), 1);
    }

    public final long z0(p171r0.e eVar, long j) {
        long jFloatToRawIntBits;
        long j10;
        long jD0 = B9.a.d0(j);
        int iOrdinal = this.f315F.ordinal();
        if (iOrdinal == 0) {
            InterfaceC0015e interfaceC0015e = (InterfaceC0015e) AbstractC0283f.i(this, AbstractC0019g.f240a);
            float f3 = eVar.f21390b;
            float fA = interfaceC0015e.a(f3, eVar.f21392d - f3, Float.intBitsToFloat((int) (jD0 & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j10 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new A6.a();
            }
            InterfaceC0015e interfaceC0015e2 = (InterfaceC0015e) AbstractC0283f.i(this, AbstractC0019g.f240a);
            float f7 = eVar.f21389a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(interfaceC0015e2.a(f7, eVar.f21391c - f7, Float.intBitsToFloat((int) (jD0 >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j10 = jFloatToRawIntBits3 << 32;
        }
        return j10 | (jFloatToRawIntBits & 4294967295L);
    }
}
