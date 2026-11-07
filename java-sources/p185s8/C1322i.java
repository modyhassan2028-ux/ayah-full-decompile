package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: renamed from: s8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1322i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1322i f22366a = new C1322i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22367b = c.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22368c = c.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22369d = c.a("cores");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22370e = c.a("ram");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22371f = c.a("diskSpace");
    public static final c g = c.a("simulator");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f22372h = c.a("state");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f22373i = c.a("manufacturer");
    public static final c j = c.a("modelClass");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        N n6 = (N) ((w0) obj);
        eVar.e(f22367b, n6.f22234a);
        eVar.a(f22368c, n6.f22235b);
        eVar.e(f22369d, n6.f22236c);
        eVar.d(f22370e, n6.f22237d);
        eVar.d(f22371f, n6.f22238e);
        eVar.g(g, n6.f22239f);
        eVar.e(f22372h, n6.g);
        eVar.a(f22373i, n6.f22240h);
        eVar.a(j, n6.f22241i);
    }
}
