package androidx.window.layout;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f13075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f13076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f13077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f13078f;
    public static final f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f13079h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13081b;

    static {
        int i10 = 0;
        f13075c = new f("VERTICAL", i10);
        f13076d = new f("HORIZONTAL", i10);
        int i11 = 1;
        f13077e = new f("FLAT", i11);
        f13078f = new f("HALF_OPENED", i11);
        int i12 = 2;
        g = new f("FOLD", i12);
        f13079h = new f("HINGE", i12);
    }

    public /* synthetic */ f(String str, int i10) {
        this.f13080a = i10;
        this.f13081b = str;
    }

    public final String toString() {
        switch (this.f13080a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f13081b;
    }
}
