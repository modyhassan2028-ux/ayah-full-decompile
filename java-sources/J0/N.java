package J0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N implements H0.J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f3962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f3963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f3964e;

    /* JADX WARN: Multi-variable type inference failed */
    public N(int i10, int i11, Map map, p241y9.c cVar, P p10) {
        this.f3960a = i10;
        this.f3961b = i11;
        this.f3962c = map;
        this.f3963d = (p251z9.k) cVar;
        this.f3964e = p10;
    }

    @Override // H0.J
    public final int a() {
        return this.f3961b;
    }

    @Override // H0.J
    public final int b() {
        return this.f3960a;
    }

    @Override // H0.J
    public final Map c() {
        return this.f3962c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [y9.c, z9.k] */
    @Override // H0.J
    public final void d() {
        this.f3963d.e(this.f3964e.f3971z);
    }

    @Override // H0.J
    public final p241y9.c e() {
        return null;
    }
}
