package p215w0;

import J0.K;
import N9.b0;
import p063g1.m;
import p151p.V;
import p180s0.C1303l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f23566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1303l f23567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23568c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f23569d = m.f16261r;

    public abstract void a(float f3);

    public abstract void b(C1303l c1303l);

    public final void c(K k7, long j, float f3, C1303l c1303l) {
        p196u0.b bVar = k7.f3942r;
        if (this.f23568c != f3) {
            a(f3);
            this.f23568c = f3;
        }
        if (!j.a(this.f23567b, c1303l)) {
            b(c1303l);
            this.f23567b = c1303l;
        }
        m layoutDirection = k7.getLayoutDirection();
        if (this.f23569d != layoutDirection) {
            this.f23569d = layoutDirection;
        }
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (k7.b() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (k7.b() & 4294967295L)) - Float.intBitsToFloat(i11);
        ((V) bVar.f22795s.f16422s).p(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f3 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    e(k7);
                }
            } finally {
                ((V) bVar.f22795s.f16422s).p(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(K k7);
}
