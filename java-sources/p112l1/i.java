package p112l1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f19374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f19375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f19376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19377d;

    public final void finalize() {
        l lVar;
        k kVar = this.f19375b;
        if (kVar != null) {
            j jVar = kVar.f19380s;
            if (!jVar.isDone()) {
                jVar.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f19374a, 1));
            }
        }
        if (this.f19377d || (lVar = this.f19376c) == null) {
            return;
        }
        lVar.j(null);
    }
}
