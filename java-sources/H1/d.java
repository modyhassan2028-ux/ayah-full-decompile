package H1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3246d;

    public d(int i10) {
        super(i10);
        this.f3246d = new Object();
    }

    @Override // H1.c
    public final Object a() {
        Object objA;
        synchronized (this.f3246d) {
            objA = super.a();
        }
        return objA;
    }

    @Override // H1.c
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f3246d) {
            zC = super.c(obj);
        }
        return zC;
    }
}
