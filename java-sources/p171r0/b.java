package p171r0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f21383a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21384b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21385c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21386d = 0.0f;

    public final void a(float f3, float f7, float f10, float f11) {
        this.f21383a = Math.max(f3, this.f21383a);
        this.f21384b = Math.max(f7, this.f21384b);
        this.f21385c = Math.min(f10, this.f21385c);
        this.f21386d = Math.min(f11, this.f21386d);
    }

    public final boolean b() {
        return (this.f21383a >= this.f21385c) | (this.f21384b >= this.f21386d);
    }

    public final String toString() {
        return "MutableRect(" + a.f(this.f21383a) + ", " + a.f(this.f21384b) + ", " + a.f(this.f21385c) + ", " + a.f(this.f21386d) + ')';
    }
}
