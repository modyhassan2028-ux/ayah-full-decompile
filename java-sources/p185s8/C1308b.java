package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: renamed from: s8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1308b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1308b f22305a = new C1308b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22306b = c.a("pid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22307c = c.a("processName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22308d = c.a("reasonCode");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22309e = c.a("importance");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22310f = c.a("pss");
    public static final c g = c.a("rss");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f22311h = c.a("timestamp");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f22312i = c.a("traceFile");
    public static final c j = c.a("buildIdMappingForArch");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        D d5 = (D) ((q0) obj);
        eVar.e(f22306b, d5.f22182a);
        eVar.a(f22307c, d5.f22183b);
        eVar.e(f22308d, d5.f22184c);
        eVar.e(f22309e, d5.f22185d);
        eVar.d(f22310f, d5.f22186e);
        eVar.d(g, d5.f22187f);
        eVar.d(f22311h, d5.g);
        eVar.a(f22312i, d5.f22188h);
        eVar.a(j, d5.f22189i);
    }
}
