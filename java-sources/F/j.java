package F;

import Z.L0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j extends p251z9.q implements F9.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2058y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f2058y = i11;
    }

    @Override // p251z9.c
    public final F9.b b() {
        p251z9.w.f24887a.getClass();
        return this;
    }

    @Override // F9.d
    public final Object get() {
        switch (this.f2058y) {
            case 0:
                return ((L0) this.f24870s).getValue();
            case 1:
                return this.f24870s.getClass().getSimpleName();
            case 2:
                return ((L0) this.f24870s).getValue();
            default:
                return ((p162q0.k) this.f24870s).f21205f.x0();
        }
    }

    @Override // p241y9.a
    public final Object invoke() {
        return get();
    }
}
