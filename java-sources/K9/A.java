package K9;

/* JADX INFO: loaded from: classes.dex */
public class A extends AbstractC0383a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5316u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(p150o9.h hVar, boolean z10, int i10) {
        super(hVar, z10);
        this.f5316u = i10;
    }

    @Override // K9.h0
    public boolean I(Throwable th) {
        switch (this.f5316u) {
            case 1:
                AbstractC0405x.s(th, this.f5346t);
                return true;
            default:
                return super.I(th);
        }
    }
}
