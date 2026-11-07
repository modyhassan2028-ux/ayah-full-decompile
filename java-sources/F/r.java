package F;

import A.EnumC0047u0;
import G.C0185t;
import G.C0188w;
import H0.J;
import K9.InterfaceC0402u;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f2095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f2099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2100f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0402u f2101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p063g1.c f2102i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f2103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EnumC0047u0 f2107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f2109q;

    public r(s sVar, int i10, boolean z10, float f3, J j, float f7, boolean z11, InterfaceC0402u interfaceC0402u, p063g1.c cVar, long j10, List list, int i11, int i12, int i13, EnumC0047u0 enumC0047u0, int i14, int i15) {
        this.f2095a = sVar;
        this.f2096b = i10;
        this.f2097c = z10;
        this.f2098d = f3;
        this.f2099e = j;
        this.f2100f = f7;
        this.g = z11;
        this.f2101h = interfaceC0402u;
        this.f2102i = cVar;
        this.j = j10;
        this.f2103k = list;
        this.f2104l = i11;
        this.f2105m = i12;
        this.f2106n = i13;
        this.f2107o = enumC0047u0;
        this.f2108p = i14;
        this.f2109q = i15;
    }

    @Override // H0.J
    public final int a() {
        return this.f2099e.a();
    }

    @Override // H0.J
    public final int b() {
        return this.f2099e.b();
    }

    @Override // H0.J
    public final Map c() {
        return this.f2099e.c();
    }

    @Override // H0.J
    public final void d() {
        this.f2099e.d();
    }

    @Override // H0.J
    public final p241y9.c e() {
        return this.f2099e.e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final r f(int i10, boolean z10) {
        s sVar;
        if (this.g) {
            return null;
        }
        ?? r10 = this.f2103k;
        if (r10.isEmpty() || (sVar = this.f2095a) == null) {
            return null;
        }
        int i11 = sVar.f2122o;
        int i12 = this.f2096b - i10;
        if (i12 < 0 || i12 >= i11) {
            return null;
        }
        s sVar2 = (s) p120l9.m.f0(r10);
        s sVar3 = (s) p120l9.m.m0(r10);
        if (sVar2.f2124q || sVar3.f2124q) {
            return null;
        }
        int i13 = this.f2105m;
        int i14 = this.f2104l;
        if (i10 < 0) {
            if (Math.min((sVar2.f2120m + sVar2.f2122o) - i14, (sVar3.f2120m + sVar3.f2122o) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - sVar2.f2120m, i13 - sVar3.f2120m) <= i10) {
            return null;
        }
        int size = r10.size();
        int i15 = 0;
        while (i15 < size) {
            s sVar4 = (s) r10.get(i15);
            sVar4.getClass();
            int[] iArr = sVar4.f2128u;
            if (!sVar4.f2124q) {
                sVar4.f2120m += i10;
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    if ((i16 & 1) != 0) {
                        iArr[i16] = iArr[i16] + i10;
                    }
                }
                if (z10) {
                    int size2 = sVar4.f2111b.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        C0188w c0188w = (C0188w) sVar4.f2118k.f11846a.g(sVar4.f2117i);
                        C0185t c0185t = c0188w != null ? c0188w.f2752a[i17] : null;
                        if (c0185t != null) {
                            long j = c0185t.f2743l;
                            c0185t.f2743l = (((long) (((int) (j & 4294967295L)) + i10)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
                        }
                        i17++;
                        size = size;
                    }
                }
            }
            i15++;
            size = size;
        }
        return new r(this.f2095a, i12, this.f2097c || i10 > 0, i10, this.f2099e, this.f2100f, this.g, this.f2101h, this.f2102i, this.j, r10, this.f2104l, this.f2105m, this.f2106n, this.f2107o, this.f2108p, this.f2109q);
    }

    public final long g() {
        J j = this.f2099e;
        return (((long) j.b()) << 32) | (((long) j.a()) & 4294967295L);
    }
}
