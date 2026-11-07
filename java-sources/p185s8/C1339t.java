package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: renamed from: s8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1339t implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1339t f22460a = new C1339t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22461b = c.a("timestamp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22462c = c.a("type");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22463d = c.a("app");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22464e = c.a("device");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22465f = c.a("log");
    public static final c g = c.a("rollouts");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        P p10 = (P) ((K0) obj);
        eVar.d(f22461b, p10.f22249a);
        eVar.a(f22462c, p10.f22250b);
        eVar.a(f22463d, p10.f22251c);
        eVar.a(f22464e, p10.f22252d);
        eVar.a(f22465f, p10.f22253e);
        eVar.a(g, p10.f22254f);
    }
}
