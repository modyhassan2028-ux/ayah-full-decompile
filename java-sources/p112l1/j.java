package p112l1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f19378y;

    public j(k kVar) {
        this.f19378y = kVar;
    }

    @Override // p112l1.h
    public final String h() {
        i iVar = (i) this.f19378y.f19379r.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f19374a + "]";
    }
}
