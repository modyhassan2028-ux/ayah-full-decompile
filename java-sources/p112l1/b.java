package p112l1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Throwable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19355r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(str);
        this.f19355r = i10;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f19355r) {
            case 0:
                a();
                break;
            default:
                b();
                break;
        }
        return this;
    }
}
