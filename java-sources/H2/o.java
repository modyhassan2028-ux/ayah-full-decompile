package H2;

/* JADX INFO: loaded from: classes.dex */
public final class o implements v, F2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3308b;

    public /* synthetic */ o(int i10, Object obj) {
        this.f3307a = i10;
        this.f3308b = obj;
    }

    @Override // H2.v
    public final Q2.a c() {
        switch (this.f3307a) {
            case 0:
                return ((u) this.f3308b).f3335a;
            default:
                return ((I2.d) this.f3308b).f3805a;
        }
    }

    @Override // F2.m
    public final Object d(String str, p241y9.c cVar, q9.c cVar2) {
        switch (this.f3307a) {
            case 0:
                return ((u) this.f3308b).d(str, cVar, cVar2);
            default:
                return ((I2.d) this.f3308b).d(str, cVar, cVar2);
        }
    }
}
