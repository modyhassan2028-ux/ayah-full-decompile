package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: renamed from: s8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1338s implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1338s f22454a = new C1338s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22455b = c.a("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22456c = c.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22457d = c.a("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22458e = c.a("orientation");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22459f = c.a("ramUsed");
    public static final c g = c.a("diskUsed");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        C1311c0 c1311c0 = (C1311c0) ((F0) obj);
        eVar.a(f22455b, c1311c0.f22322a);
        eVar.e(f22456c, c1311c0.f22323b);
        eVar.g(f22457d, c1311c0.f22324c);
        eVar.e(f22458e, c1311c0.f22325d);
        eVar.d(f22459f, c1311c0.f22326e);
        eVar.d(g, c1311c0.f22327f);
    }
}
