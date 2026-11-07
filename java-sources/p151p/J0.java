package p151p;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20567f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20568h;

    public final void a(int i10, int i11) {
        this.f20564c = i10;
        this.f20565d = i11;
        this.f20568h = true;
        if (this.g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f20562a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f20563b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20562a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f20563b = i11;
        }
    }
}
