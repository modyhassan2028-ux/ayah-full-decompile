package W;

import A.C0039q;
import K9.AbstractC0405x;
import Z.C0672b;
import Z.C0673b0;
import Z.C0675c0;
import Z.C0681f0;

/* JADX INFO: renamed from: W.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0604u1 implements A.Y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0673b0 f9394A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0681f0 f9395B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0557f1 f9396C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0673b0 f9397D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0673b0 f9398E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0601t1 f9399F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p232y.V f9400G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p241y9.a f9402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final E9.a f9403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0673b0 f9404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p241y9.c f9405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f9406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0675c0 f9407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9408y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0673b0 f9409z;

    public C0604u1(float f3, int i10, p241y9.a aVar, E9.a aVar2) {
        float[] fArr;
        this.f9401r = i10;
        this.f9402s = aVar;
        this.f9403t = aVar2;
        this.f9404u = new C0673b0(f3);
        if (i10 == 0) {
            fArr = new float[0];
        } else {
            int i11 = i10 + 2;
            float[] fArr2 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr2[i12] = i12 / (i10 + 1);
            }
            fArr = fArr2;
        }
        this.f9406w = fArr;
        this.f9407x = new C0675c0(0);
        this.f9409z = new C0673b0(0.0f);
        this.f9394A = new C0673b0(0.0f);
        this.f9395B = C0672b.r(Boolean.FALSE);
        this.f9396C = new C0557f1(1, this);
        E9.a aVar3 = this.f9403t;
        float f7 = aVar3.f1993a;
        float f10 = aVar3.f1994b - f7;
        this.f9397D = new C0673b0(B9.a.L(0.0f, 0.0f, B0.c.k(f10 == 0.0f ? 0.0f : (f3 - f7) / f10, 0.0f, 1.0f)));
        this.f9398E = new C0673b0(0.0f);
        this.f9399F = new C0601t1(0, this);
        this.f9400G = new p232y.V();
    }

    public final void a(float f3) {
        float fG = this.f9407x.g();
        C0673b0 c0673b0 = this.f9394A;
        float f7 = 2;
        float fMax = Math.max(fG - (c0673b0.g() / f7), 0.0f);
        float fMin = Math.min(c0673b0.g() / f7, fMax);
        C0673b0 c0673b1 = this.f9397D;
        float fG2 = c0673b1.g() + f3;
        C0673b0 c0673b2 = this.f9398E;
        c0673b1.h(c0673b2.g() + fG2);
        c0673b2.h(0.0f);
        float fD = AbstractC0598s1.d(c0673b1.g(), fMin, fMax, this.f9406w);
        E9.a aVar = this.f9403t;
        float f10 = fMax - fMin;
        float fL = B9.a.L(aVar.f1993a, aVar.f1994b, B0.c.k(f10 == 0.0f ? 0.0f : (fD - fMin) / f10, 0.0f, 1.0f));
        if (fL == this.f9404u.g()) {
            return;
        }
        p241y9.c cVar = this.f9405v;
        if (cVar != null) {
            cVar.e(Float.valueOf(fL));
        } else {
            b(fL);
        }
    }

    public final void b(float f3) {
        E9.a aVar = this.f9403t;
        float f7 = aVar.f1993a;
        float f10 = aVar.f1994b;
        this.f9404u.h(AbstractC0598s1.d(B0.c.k(f3, f7, f10), f7, f10, this.f9406w));
    }

    @Override // A.Y
    public final Object c(C0039q c0039q, A.S s10) {
        Object objJ = AbstractC0405x.j(new O9.y(this, c0039q, null, 13), s10);
        return objJ == p161p9.a.f21156r ? objJ : p110k9.y.f19095a;
    }
}
