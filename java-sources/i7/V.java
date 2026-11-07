package i7;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f17159d;

    public V(X x9, int i10, boolean z10, boolean z11) {
        this.f17159d = x9;
        this.f17156a = i10;
        this.f17157b = z10;
        this.f17158c = z11;
    }

    public final void a(String str) {
        this.f17159d.x(this.f17156a, this.f17157b, this.f17158c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.f17159d.x(this.f17156a, this.f17157b, this.f17158c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.f17159d.x(this.f17156a, this.f17157b, this.f17158c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f17159d.x(this.f17156a, this.f17157b, this.f17158c, str, obj, obj2, obj3);
    }
}
