package N;

import E6.u;
import K.T;
import U0.C0515g;
import U0.H;
import U0.I;
import U0.L;
import U0.p;
import java.util.List;
import p063g1.m;
import p120l9.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0515g f5897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y0.d f5898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5902f;
    public List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f5903h;
    public p063g1.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public L f5905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f5906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f5907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I f5908n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5904i = a.f5886a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5909o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5910p = -1;

    public d(C0515g c0515g, L l10, Y0.d dVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f5897a = c0515g;
        this.f5898b = dVar;
        this.f5899c = i10;
        this.f5900d = z10;
        this.f5901e = i11;
        this.f5902f = i12;
        this.g = list;
        this.f5905k = l10;
    }

    public final int a(int i10, m mVar) {
        int i11 = this.f5909o;
        int i12 = this.f5910p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = p063g1.b.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f5902f > 1) {
            b bVar = this.f5903h;
            L l10 = this.f5905k;
            p063g1.c cVar = this.j;
            p251z9.j.b(cVar);
            b bVarW = B9.a.w(bVar, mVar, l10, cVar, this.f5898b);
            this.f5903h = bVarW;
            jA = bVarW.a(jA, this.f5902f);
        }
        int iP = T.p(b(jA, mVar).f8110e);
        int i13 = p063g1.a.i(jA);
        if (iP < i13) {
            iP = i13;
        }
        this.f5909o = i10;
        this.f5910p = iP;
        return iP;
    }

    public final p b(long j, m mVar) {
        u uVarD = d(mVar);
        long jX = B0.c.x(j, this.f5900d, this.f5899c, uVarD.h());
        boolean z10 = this.f5900d;
        int i10 = this.f5899c;
        int i11 = this.f5901e;
        return new p(uVarD, jX, ((z10 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10);
    }

    public final void c(p063g1.c cVar) {
        long jA;
        p063g1.c cVar2 = this.j;
        if (cVar != null) {
            int i10 = a.f5887b;
            jA = a.a(cVar.getDensity(), cVar.n());
        } else {
            jA = a.f5886a;
        }
        if (cVar2 == null) {
            this.j = cVar;
            this.f5904i = jA;
        } else if (cVar == null || this.f5904i != jA) {
            this.j = cVar;
            this.f5904i = jA;
            this.f5906l = null;
            this.f5908n = null;
            this.f5910p = -1;
            this.f5909o = -1;
        }
    }

    public final u d(m mVar) {
        u uVar = this.f5906l;
        if (uVar == null || mVar != this.f5907m || uVar.c()) {
            this.f5907m = mVar;
            C0515g c0515g = this.f5897a;
            L lA0 = B0.c.a0(this.f5905k, mVar);
            p063g1.c cVar = this.j;
            p251z9.j.b(cVar);
            Y0.d dVar = this.f5898b;
            List list = this.g;
            if (list == null) {
                list = r.f19440r;
            }
            uVar = new u(c0515g, lA0, list, cVar, dVar);
        }
        this.f5906l = uVar;
        return uVar;
    }

    public final I e(m mVar, long j, p pVar) {
        float fMin = Math.min(pVar.f8106a.h(), pVar.f8109d);
        C0515g c0515g = this.f5897a;
        L l10 = this.f5905k;
        List list = this.g;
        if (list == null) {
            list = r.f19440r;
        }
        int i10 = this.f5901e;
        boolean z10 = this.f5900d;
        int i11 = this.f5899c;
        p063g1.c cVar = this.j;
        p251z9.j.b(cVar);
        return new I(new H(c0515g, l10, list, i10, z10, i11, cVar, mVar, this.f5898b, j), pVar, p063g1.b.d(j, (((long) T.p(fMin)) << 32) | (((long) T.p(pVar.f8110e)) & 4294967295L)));
    }
}
