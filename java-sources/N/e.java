package N;

import K.T;
import U0.C0509a;
import U0.L;
import U0.t;
import p063g1.m;
import p120l9.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f5912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y0.d f5913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5916f;
    public int g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p063g1.c f5918i;
    public C0509a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f5921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f5922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f5923o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5917h = a.f5886a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5924p = p063g1.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5925q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5926r = -1;

    public e(String str, L l10, Y0.d dVar, int i10, boolean z10, int i11, int i12) {
        this.f5911a = str;
        this.f5912b = l10;
        this.f5913c = dVar;
        this.f5914d = i10;
        this.f5915e = z10;
        this.f5916f = i11;
        this.g = i12;
        long j = 0;
        this.f5920l = (j & 4294967295L) | (j << 32);
    }

    public static long e(e eVar, long j, m mVar) {
        L l10 = eVar.f5912b;
        b bVar = eVar.f5921m;
        p063g1.c cVar = eVar.f5918i;
        p251z9.j.b(cVar);
        b bVarW = B9.a.w(bVar, mVar, l10, cVar, eVar.f5913c);
        eVar.f5921m = bVarW;
        return bVarW.a(j, eVar.g);
    }

    public final int a(int i10, m mVar) {
        int i11 = this.f5925q;
        int i12 = this.f5926r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = p063g1.b.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = e(this, jA, mVar);
        }
        t tVarD = d(mVar);
        long jX = B0.c.x(jA, this.f5915e, this.f5914d, tVarD.h());
        boolean z10 = this.f5915e;
        int i13 = this.f5914d;
        int i14 = this.f5916f;
        int iP = T.p(new C0509a((p022c1.c) tVarD, ((z10 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jX).b());
        int i15 = p063g1.a.i(jA);
        if (iP < i15) {
            iP = i15;
        }
        this.f5925q = i10;
        this.f5926r = iP;
        return iP;
    }

    public final void b() {
        this.j = null;
        this.f5922n = null;
        this.f5923o = null;
        this.f5925q = -1;
        this.f5926r = -1;
        this.f5924p = p063g1.b.h(0, 0, 0, 0);
        long j = 0;
        this.f5920l = (j & 4294967295L) | (j << 32);
        this.f5919k = false;
    }

    public final void c(p063g1.c cVar) {
        long jA;
        p063g1.c cVar2 = this.f5918i;
        if (cVar != null) {
            int i10 = a.f5887b;
            jA = a.a(cVar.getDensity(), cVar.n());
        } else {
            jA = a.f5886a;
        }
        if (cVar2 == null) {
            this.f5918i = cVar;
            this.f5917h = jA;
        } else if (cVar == null || this.f5917h != jA) {
            this.f5918i = cVar;
            this.f5917h = jA;
            b();
        }
    }

    public final t d(m mVar) {
        t cVar = this.f5922n;
        if (cVar == null || mVar != this.f5923o || cVar.c()) {
            this.f5923o = mVar;
            String str = this.f5911a;
            L lA0 = B0.c.a0(this.f5912b, mVar);
            p063g1.c cVar2 = this.f5918i;
            p251z9.j.b(cVar2);
            Y0.d dVar = this.f5913c;
            r rVar = r.f19440r;
            cVar = new p022c1.c(str, lA0, rVar, rVar, dVar, cVar2);
        }
        this.f5922n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.f5917h;
        int i10 = a.f5887b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
