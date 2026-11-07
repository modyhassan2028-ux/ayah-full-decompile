package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: loaded from: classes.dex */
public final class r implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f22449a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22450b = c.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22451c = c.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22452d = c.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22453e = c.a("defaultProcess");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        C1307a0 c1307a0 = (C1307a0) ((D0) obj);
        eVar.a(f22450b, c1307a0.f22301a);
        eVar.e(f22451c, c1307a0.f22302b);
        eVar.e(f22452d, c1307a0.f22303c);
        eVar.g(f22453e, c1307a0.f22304d);
    }
}
