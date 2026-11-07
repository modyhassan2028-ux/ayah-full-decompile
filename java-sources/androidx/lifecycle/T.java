package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.e f12644b = new H8.e(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12645a;

    public T(U u8, S s10, p105k2.c cVar) {
        p251z9.j.e(u8, "store");
        p251z9.j.e(s10, "factory");
        p251z9.j.e(cVar, "defaultCreationExtras");
        this.f12645a = new Aa.a(u8, s10, cVar);
    }

    public P a(p251z9.e eVar) {
        Aa.a aVar = (Aa.a) this.f12645a;
        String strB = eVar.b();
        if (strB != null) {
            return aVar.x("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVar);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public T(D d5) {
        this.f12645a = d5;
    }
}
