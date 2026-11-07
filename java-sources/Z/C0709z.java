package Z;

/* JADX INFO: renamed from: Z.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709z extends AbstractC0693l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10867b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0709z(p241y9.a aVar) {
        super(aVar);
        S s10 = S.f10643w;
        this.f10868c = s10;
    }

    @Override // Z.AbstractC0693l0
    public final C0695m0 a(Object obj) {
        switch (this.f10867b) {
            case 0:
                return new C0695m0(this, obj, obj == null, null, true);
            default:
                return new C0695m0(this, obj, obj == null, (F0) this.f10868c, true);
        }
    }

    @Override // Z.AbstractC0693l0
    public O0 b() {
        switch (this.f10867b) {
            case 0:
                return (A) this.f10868c;
            default:
                return super.b();
        }
    }

    public C0709z(p241y9.c cVar) {
        super(C0708y.f10863r);
        this.f10868c = new A(cVar);
    }
}
