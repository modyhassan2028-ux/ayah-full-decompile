package Z;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u.F f10615s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(u.F f3, int i10) {
        super(1);
        this.f10614r = i10;
        this.f10615s = f3;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f10614r) {
            case 0:
                if (obj instanceof p093j0.w) {
                    ((p093j0.w) obj).f(4);
                }
                this.f10615s.a(obj);
                return p110k9.y.f19095a;
            default:
                return obj == this.f10615s ? "(this)" : String.valueOf(obj);
        }
    }
}
