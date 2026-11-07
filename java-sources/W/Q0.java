package W;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H0.U f8769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f8770t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q0(int i10, int i11, H0.U u8) {
        super(1);
        this.f8768r = i11;
        this.f8769s = u8;
        this.f8770t = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f8768r) {
            case 0:
                ((H0.T) obj).d(this.f8769s, 0, -this.f8770t, 0.0f);
                break;
            default:
                ((H0.T) obj).d(this.f8769s, -this.f8770t, 0, 0.0f);
                break;
        }
        return p110k9.y.f19095a;
    }
}
