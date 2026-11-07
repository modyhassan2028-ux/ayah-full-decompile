package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class M implements S8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6904b;

    public /* synthetic */ M(int i10, Object obj) {
        this.f6903a = i10;
        this.f6904b = obj;
    }

    public static M a(Object obj) {
        if (obj != null) {
            return new M(2, obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f6903a) {
            case 0:
                return new L((X) ((p101j9.a) this.f6904b).get());
            case 1:
                return new a0((f0) ((S8.c) this.f6904b).get());
            default:
                return this.f6904b;
        }
    }
}
