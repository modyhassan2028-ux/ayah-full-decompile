package K9;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends P9.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5386v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p150o9.h hVar, p150o9.c cVar, int i10) {
        super(cVar, hVar);
        this.f5386v = i10;
    }

    @Override // K9.h0
    public final boolean v(Throwable th) {
        switch (this.f5386v) {
            case 0:
                return false;
            default:
                if (th instanceof O9.l) {
                    return true;
                }
                return q(th);
        }
    }
}
