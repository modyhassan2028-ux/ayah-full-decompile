package Z9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements W9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p110k9.o f11055a;

    public l(p241y9.a aVar) {
        this.f11055a = p110k9.a.d(aVar);
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        return g().a(str);
    }

    @Override // W9.f
    public final String b() {
        return g().b();
    }

    @Override // W9.f
    public final va.g c() {
        return g().c();
    }

    @Override // W9.f
    public final int d() {
        return g().d();
    }

    @Override // W9.f
    public final String e(int i10) {
        return g().e(i10);
    }

    @Override // W9.f
    public final boolean f() {
        return false;
    }

    public final W9.f g() {
        return (W9.f) this.f11055a.getValue();
    }

    @Override // W9.f
    public final List getAnnotations() {
        return p120l9.r.f19440r;
    }

    @Override // W9.f
    public final boolean h() {
        return false;
    }

    @Override // W9.f
    public final List i(int i10) {
        return g().i(i10);
    }

    @Override // W9.f
    public final W9.f j(int i10) {
        return g().j(i10);
    }

    @Override // W9.f
    public final boolean k(int i10) {
        return g().k(i10);
    }
}
