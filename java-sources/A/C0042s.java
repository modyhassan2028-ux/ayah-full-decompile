package A;

import K9.AbstractC0405x;
import Z.C0672b;
import Z.C0681f0;

/* JADX INFO: renamed from: A.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0042s implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p251z9.k f405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f406b = new r(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p232y.V f407c = new p232y.V();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0681f0 f408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0681f0 f409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0681f0 f410f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0042s(p241y9.c cVar) {
        this.f405a = (p251z9.k) cVar;
        Boolean bool = Boolean.FALSE;
        this.f408d = C0672b.r(bool);
        this.f409e = C0672b.r(bool);
        this.f410f = C0672b.r(bool);
    }

    @Override // A.T0
    public final Object a(p232y.T t2, p241y9.e eVar, q9.c cVar) {
        Object objJ = AbstractC0405x.j(new C0039q(this, t2, eVar, (p150o9.c) null), cVar);
        return objJ == p161p9.a.f21156r ? objJ : p110k9.y.f19095a;
    }

    @Override // A.T0
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // A.T0
    public final boolean c() {
        return ((Boolean) this.f408d.getValue()).booleanValue();
    }

    @Override // A.T0
    public final /* synthetic */ boolean d() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.c, z9.k] */
    @Override // A.T0
    public final float e(float f3) {
        return ((Number) this.f405a.e(Float.valueOf(f3))).floatValue();
    }
}
