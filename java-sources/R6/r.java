package R6;

/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f7273e;

    public /* synthetic */ r(k kVar) {
        super(false, null, null);
        this.f7273e = kVar;
    }

    @Override // R6.s
    public final String a() {
        try {
            return (String) this.f7273e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
