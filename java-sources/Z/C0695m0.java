package Z;

/* JADX INFO: renamed from: Z.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0695m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0693l0 f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F0 f10696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10699f = true;

    public C0695m0(AbstractC0693l0 abstractC0693l0, Object obj, boolean z10, F0 f3, boolean z11) {
        this.f10694a = abstractC0693l0;
        this.f10695b = z10;
        this.f10696c = f3;
        this.f10697d = z11;
        this.f10698e = obj;
    }

    public final Object a() {
        if (this.f10695b) {
            return null;
        }
        Object obj = this.f10698e;
        if (obj != null) {
            return obj;
        }
        AbstractC0700p.d("Unexpected form of a provided value");
        throw new A6.a();
    }
}
