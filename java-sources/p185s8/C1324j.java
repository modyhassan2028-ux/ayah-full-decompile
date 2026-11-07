package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: renamed from: s8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1324j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1324j f22379a = new C1324j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22380b = c.a("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22381c = c.a("identifier");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22382d = c.a("appQualitySessionId");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22383e = c.a("startedAt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22384f = c.a("endedAt");
    public static final c g = c.a("crashed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f22385h = c.a("app");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f22386i = c.a("user");
    public static final c j = c.a("os");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f22387k = c.a("device");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f22388l = c.a("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f22389m = c.a("generatorType");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        J j10 = (J) ((N0) obj);
        eVar.a(f22380b, j10.f22210a);
        eVar.a(f22381c, j10.f22211b.getBytes(O0.f22248a));
        eVar.a(f22382d, j10.f22212c);
        eVar.d(f22383e, j10.f22213d);
        eVar.a(f22384f, j10.f22214e);
        eVar.g(g, j10.f22215f);
        eVar.a(f22385h, j10.g);
        eVar.a(f22386i, j10.f22216h);
        eVar.a(j, j10.f22217i);
        eVar.a(f22387k, j10.j);
        eVar.a(f22388l, j10.f22218k);
        eVar.e(f22389m, j10.f22219l);
    }
}
