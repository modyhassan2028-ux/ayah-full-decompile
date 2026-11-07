package p185s8;

import C8.c;
import C8.d;
import C8.e;

/* JADX INFO: renamed from: s8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1306a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1306a f22297a = new C1306a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f22298b = c.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f22299c = c.a("libraryName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22300d = c.a("buildId");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        E e10 = (E) ((p0) obj);
        eVar.a(f22298b, e10.f22190a);
        eVar.a(f22299c, e10.f22191b);
        eVar.a(f22300d, e10.f22192c);
    }
}
