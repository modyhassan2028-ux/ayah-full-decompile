package F;

import G.C0182p;
import G.C0185t;
import G.C0188w;
import H0.T;
import H0.U;
import H0.V;
import H0.W;
import K9.AbstractC0405x;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0.d f2112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p063g1.m f2113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2115f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f2117i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f2118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2125r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f2128u;

    public s(int i10, List list, l0.d dVar, p063g1.m mVar, int i11, int i12, int i13, long j, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j10) {
        this.f2110a = i10;
        this.f2111b = list;
        this.f2112c = dVar;
        this.f2113d = mVar;
        this.f2114e = i11;
        this.f2115f = i12;
        this.g = i13;
        this.f2116h = j;
        this.f2117i = obj;
        this.j = obj2;
        this.f2118k = bVar;
        this.f2119l = j10;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            U u8 = (U) list.get(i15);
            i14 += u8.f3169s;
            iMax = Math.max(iMax, u8.f3168r);
        }
        this.f2121n = i14;
        int i16 = i14 + this.g;
        this.f2122o = i16 >= 0 ? i16 : 0;
        this.f2123p = iMax;
        this.f2128u = new int[this.f2111b.size() * 2];
    }

    public final long a(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f2128u;
        return (((long) iArr[i11]) << 32) | (((long) iArr[i11 + 1]) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(T t2, boolean z10) {
        V v10 = V.f3173s;
        if (this.f2125r == Integer.MIN_VALUE) {
            C.a.a("position() should be called first");
        }
        List list = this.f2111b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            U u8 = (U) list.get(i10);
            int i11 = this.f2126s - u8.f3169s;
            int i12 = this.f2127t;
            long jA = a(i10);
            C0188w c0188w = (C0188w) this.f2118k.f11846a.g(this.f2117i);
            p205v0.b bVar = null;
            Object[] objArr = 0;
            C0185t c0185t = c0188w != null ? c0188w.f2752a[i10] : null;
            if (c0185t != null) {
                if (z10) {
                    c0185t.f2749r = jA;
                } else {
                    if (!p063g1.j.a(c0185t.f2749r, C0185t.f2732s)) {
                        jA = c0185t.f2749r;
                    }
                    long jC = p063g1.j.c(jA, ((p063g1.j) c0185t.f2748q.getValue()).f16254a);
                    int i13 = (int) (jA & 4294967295L);
                    if (((i13 <= i11 && ((int) (jC & 4294967295L)) <= i11) || (i13 >= i12 && ((int) (jC & 4294967295L)) >= i12)) && ((Boolean) c0185t.f2740h.getValue()).booleanValue()) {
                        AbstractC0405x.x(c0185t.f2734a, null, new C0182p(c0185t, objArr == true ? 1 : 0, 1), 3);
                    }
                    jA = jC;
                }
                bVar = c0185t.f2745n;
            } else {
                list = list;
                size = size;
            }
            long jC2 = p063g1.j.c(jA, this.f2116h);
            if (!z10 && c0185t != null) {
                c0185t.f2744m = jC2;
            }
            if (bVar != null) {
                t2.getClass();
                T.a(t2, u8);
                u8.V(p063g1.j.c(jC2, u8.f3172v), 0.0f, bVar);
            } else {
                int i14 = W.f3177b;
                t2.getClass();
                T.a(t2, u8);
                u8.Y(p063g1.j.c(jC2, u8.f3172v), 0.0f, v10);
            }
            i10++;
            list = list;
            size = size;
        }
    }

    public final void c(int i10, int i11, int i12) {
        this.f2120m = i10;
        this.f2125r = i12;
        List list = this.f2111b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            U u8 = (U) list.get(i13);
            int i14 = i13 * 2;
            l0.d dVar = this.f2112c;
            if (dVar == null) {
                C.a.b("null horizontalAlignment when isVertical == true");
                throw new A6.a();
            }
            int iA = dVar.a(u8.f3168r, i11, this.f2113d);
            int[] iArr = this.f2128u;
            iArr[i14] = iA;
            iArr[i14 + 1] = i10;
            i10 += u8.f3169s;
        }
        this.f2126s = -this.f2114e;
        this.f2127t = this.f2125r + this.f2115f;
    }
}
