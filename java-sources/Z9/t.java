package Z9;

import Y9.C;
import Y9.Z;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t implements W9.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f11063b = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11064c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f11065a;

    public t() {
        Z z10 = Z.f10495a;
        k kVar = k.f11053a;
        Z z11 = Z.f10495a;
        this.f11065a = new C(Z.f10496b, kVar.d());
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        return this.f11065a.a(str);
    }

    @Override // W9.f
    public final String b() {
        return f11064c;
    }

    @Override // W9.f
    public final va.g c() {
        this.f11065a.getClass();
        return W9.i.f9681e;
    }

    @Override // W9.f
    public final int d() {
        this.f11065a.getClass();
        return 2;
    }

    @Override // W9.f
    public final String e(int i10) {
        this.f11065a.getClass();
        return String.valueOf(i10);
    }

    @Override // W9.f
    public final boolean f() {
        this.f11065a.getClass();
        return false;
    }

    @Override // W9.f
    public final List getAnnotations() {
        this.f11065a.getClass();
        return p120l9.r.f19440r;
    }

    @Override // W9.f
    public final boolean h() {
        this.f11065a.getClass();
        return false;
    }

    @Override // W9.f
    public final List i(int i10) {
        this.f11065a.i(i10);
        return p120l9.r.f19440r;
    }

    @Override // W9.f
    public final W9.f j(int i10) {
        return this.f11065a.j(i10);
    }

    @Override // W9.f
    public final boolean k(int i10) {
        this.f11065a.k(i10);
        return false;
    }
}
