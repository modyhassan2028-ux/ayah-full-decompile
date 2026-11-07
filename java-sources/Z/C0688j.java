package Z;

/* JADX INFO: renamed from: Z.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688j extends IllegalStateException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10682r;

    public C0688j(String str) {
        this.f10682r = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f10682r;
    }
}
