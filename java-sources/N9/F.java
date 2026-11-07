package N9;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f6089s;

    public /* synthetic */ F(p251z9.v vVar, int i10) {
        this.f6088r = i10;
        this.f6089s = vVar;
    }

    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        switch (this.f6088r) {
            case 0:
                this.f6089s.f24886r = obj;
                throw new O9.a(this);
            default:
                this.f6089s.f24886r = obj;
                throw new O9.a(this);
        }
    }
}
