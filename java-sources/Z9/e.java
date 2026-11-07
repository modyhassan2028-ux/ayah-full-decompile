package Z9;

import Y9.C0646b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements W9.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f11047b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11048c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0646b f11049a;

    public e() {
        k kVar = k.f11053a;
        k kVar2 = k.f11053a;
        W9.g gVar = k.f11054b;
        p251z9.j.e(gVar, "elementDesc");
        this.f11049a = new C0646b(gVar);
    }

    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        return this.f11049a.a(str);
    }

    @Override // W9.f
    public final String b() {
        return f11048c;
    }

    @Override // W9.f
    public final va.g c() {
        this.f11049a.getClass();
        return W9.i.f9680d;
    }

    @Override // W9.f
    public final int d() {
        this.f11049a.getClass();
        return 1;
    }

    @Override // W9.f
    public final String e(int i10) {
        this.f11049a.getClass();
        return String.valueOf(i10);
    }

    @Override // W9.f
    public final boolean f() {
        this.f11049a.getClass();
        return false;
    }

    @Override // W9.f
    public final List getAnnotations() {
        this.f11049a.getClass();
        return p120l9.r.f19440r;
    }

    @Override // W9.f
    public final boolean h() {
        this.f11049a.getClass();
        return false;
    }

    @Override // W9.f
    public final List i(int i10) {
        this.f11049a.i(i10);
        return p120l9.r.f19440r;
    }

    @Override // W9.f
    public final W9.f j(int i10) {
        return this.f11049a.j(i10);
    }

    @Override // W9.f
    public final boolean k(int i10) {
        this.f11049a.k(i10);
        return false;
    }
}
