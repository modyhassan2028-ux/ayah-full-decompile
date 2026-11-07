package p224x0;

import java.util.ArrayList;
import java.util.List;
import p074h0.i;
import p085i0.f;
import p120l9.r;
import p151p.V;
import p180s0.A;
import p180s0.AbstractC1302k;
import p180s0.C1300i;
import p180s0.F;
import p180s0.L;
import p180s0.q;
import p196u0.d;
import p241y9.c;

/* JADX INFO: renamed from: x0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1439c extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f24181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24182c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24183d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24184e = q.g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f24185f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1300i f24186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f24187i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f24189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f24190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f24191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f24192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f24193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f24194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f24195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24196s;

    public C1439c() {
        int i10 = G.f24154a;
        this.f24185f = r.f19440r;
        this.g = true;
        this.j = new f(13, this);
        this.f24188k = "";
        this.f24192o = 1.0f;
        this.f24193p = 1.0f;
        this.f24196s = true;
    }

    @Override // p224x0.C
    public final void a(d dVar) {
        if (this.f24196s) {
            float[] fArrA = this.f24181b;
            if (fArrA == null) {
                fArrA = A.a();
                this.f24181b = fArrA;
            } else {
                A.d(fArrA);
            }
            A.f(fArrA, this.f24194q + this.f24190m, this.f24195r + this.f24191n);
            float f3 = this.f24189l;
            if (fArrA.length >= 16) {
                double d5 = ((double) f3) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d5);
                float fCos = (float) Math.cos(d5);
                float f7 = fArrA[0];
                float f10 = fArrA[4];
                float f11 = (fSin * f10) + (fCos * f7);
                float f12 = -fSin;
                float f13 = (f10 * fCos) + (f7 * f12);
                float f14 = fArrA[1];
                float f15 = fArrA[5];
                float f16 = (fSin * f15) + (fCos * f14);
                float f17 = (f15 * fCos) + (f14 * f12);
                float f18 = fArrA[2];
                float f19 = fArrA[6];
                float f20 = (fSin * f19) + (fCos * f18);
                float f21 = (f19 * fCos) + (f18 * f12);
                float f22 = fArrA[3];
                float f23 = fArrA[7];
                float f24 = (fSin * f23) + (fCos * f22);
                fArrA[0] = f11;
                fArrA[1] = f16;
                fArrA[2] = f20;
                fArrA[3] = f24;
                fArrA[4] = f13;
                fArrA[5] = f17;
                fArrA[6] = f21;
                fArrA[7] = (fCos * f23) + (f12 * f22);
            }
            float f25 = this.f24192o;
            float f26 = this.f24193p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f25;
                fArrA[1] = fArrA[1] * f25;
                fArrA[2] = fArrA[2] * f25;
                fArrA[3] = fArrA[3] * f25;
                fArrA[4] = fArrA[4] * f26;
                fArrA[5] = fArrA[5] * f26;
                fArrA[6] = fArrA[6] * f26;
                fArrA[7] = fArrA[7] * f26;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            A.f(fArrA, -this.f24190m, -this.f24191n);
            this.f24196s = false;
        }
        if (this.g) {
            if (!this.f24185f.isEmpty()) {
                C1300i c1300iA = this.f24186h;
                if (c1300iA == null) {
                    c1300iA = AbstractC1302k.a();
                    this.f24186h = c1300iA;
                }
                AbstractC1438b.d(this.f24185f, c1300iA);
            }
            this.g = false;
        }
        i iVarY = dVar.y();
        long jV = iVarY.v();
        iVarY.p().q();
        try {
            i iVar = (i) ((V) iVarY.f16422s).f20603r;
            float[] fArr = this.f24181b;
            if (fArr != null) {
                iVar.p().s(fArr);
            }
            C1300i c1300i = this.f24186h;
            if (!this.f24185f.isEmpty() && c1300i != null) {
                iVar.p().b(c1300i);
            }
            ArrayList arrayList = this.f24182c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C) arrayList.get(i10)).a(dVar);
            }
        } finally {
            iVarY.p().n();
            iVarY.J(jV);
        }
    }

    @Override // p224x0.C
    public final c b() {
        return this.f24187i;
    }

    @Override // p224x0.C
    public final void d(f fVar) {
        this.f24187i = fVar;
    }

    public final void e(int i10, C c10) {
        ArrayList arrayList = this.f24182c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, c10);
        } else {
            arrayList.add(c10);
        }
        g(c10);
        c10.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.f24183d && j != 16) {
            long j10 = this.f24184e;
            if (j10 == 16) {
                this.f24184e = j;
                return;
            }
            int i10 = G.f24154a;
            if (q.h(j10) == q.h(j) && q.g(j10) == q.g(j) && q.e(j10) == q.e(j)) {
                return;
            }
            this.f24183d = false;
            this.f24184e = q.g;
        }
    }

    public final void g(C c10) {
        if (!(c10 instanceof C1444h)) {
            if (c10 instanceof C1439c) {
                C1439c c1439c = (C1439c) c10;
                if (c1439c.f24183d && this.f24183d) {
                    f(c1439c.f24184e);
                    return;
                } else {
                    this.f24183d = false;
                    this.f24184e = q.g;
                    return;
                }
            }
            return;
        }
        C1444h c1444h = (C1444h) c10;
        F f3 = c1444h.f24227b;
        if (this.f24183d && f3 != null) {
            if (f3 instanceof L) {
                f(((L) f3).f21813e);
            } else {
                this.f24183d = false;
                this.f24184e = q.g;
            }
        }
        F f7 = c1444h.g;
        if (this.f24183d && f7 != null) {
            if (f7 instanceof L) {
                f(((L) f7).f21813e);
            } else {
                this.f24183d = false;
                this.f24184e = q.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f24188k);
        ArrayList arrayList = this.f24182c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C c10 = (C) arrayList.get(i10);
            sb.append("\t");
            sb.append(c10.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
