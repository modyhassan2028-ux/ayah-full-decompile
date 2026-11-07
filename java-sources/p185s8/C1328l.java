package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: renamed from: s8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1328l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1328l f22402a = new C1328l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22403b = c.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22404c = c.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22405d = c.a("name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22406e = c.a("uuid");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        T t2 = (T) ((x0) obj);
        eVar.d(f22403b, t2.f22266a);
        eVar.d(f22404c, t2.f22267b);
        eVar.a(f22405d, t2.f22268c);
        String str = t2.f22269d;
        eVar.a(f22406e, str != null ? str.getBytes(O0.f22248a) : null);
    }
}
