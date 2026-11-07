package J0;

/* JADX INFO: renamed from: J0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0284g implements p162q0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0284g f4085a = new C0284g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f4086b;

    @Override // p162q0.l
    public final /* synthetic */ void a(p094j1.l lVar) {
    }

    @Override // p162q0.l
    public final boolean b() {
        Boolean bool = f4086b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw android.support.v4.media.session.p.s("canFocus is read before it is written");
    }

    @Override // p162q0.l
    public final void c(boolean z10) {
        f4086b = Boolean.valueOf(z10);
    }

    @Override // p162q0.l
    public final /* synthetic */ void d(p094j1.l lVar) {
    }
}
