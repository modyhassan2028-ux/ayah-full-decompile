package ka;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f19109n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19115f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19117i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f19120m;

    static {
        int i10 = I9.a.f3852u;
        I9.c cVar = I9.c.SECONDS;
        long jG = I9.a.g(p017b7.g.s0(Integer.MAX_VALUE, cVar), cVar);
        if (jG >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + jG).toString());
    }

    public c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f19110a = z10;
        this.f19111b = z11;
        this.f19112c = i10;
        this.f19113d = i11;
        this.f19114e = z12;
        this.f19115f = z13;
        this.g = z14;
        this.f19116h = i12;
        this.f19117i = i13;
        this.j = z15;
        this.f19118k = z16;
        this.f19119l = z17;
        this.f19120m = str;
    }

    public final String toString() {
        String str = this.f19120m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19110a) {
            sb.append("no-cache, ");
        }
        if (this.f19111b) {
            sb.append("no-store, ");
        }
        int i10 = this.f19112c;
        if (i10 != -1) {
            sb.append("max-age=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.f19113d;
        if (i11 != -1) {
            sb.append("s-maxage=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f19114e) {
            sb.append("private, ");
        }
        if (this.f19115f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i12 = this.f19116h;
        if (i12 != -1) {
            sb.append("max-stale=");
            sb.append(i12);
            sb.append(", ");
        }
        int i13 = this.f19117i;
        if (i13 != -1) {
            sb.append("min-fresh=");
            sb.append(i13);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.f19118k) {
            sb.append("no-transform, ");
        }
        if (this.f19119l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        p251z9.j.d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String string = sb.toString();
        this.f19120m = string;
        return string;
    }
}
