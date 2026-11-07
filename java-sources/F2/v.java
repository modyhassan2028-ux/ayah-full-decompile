package F2;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2331c;

    public /* synthetic */ v(int i10, String str, boolean z10) {
        this.f2329a = i10;
        this.f2330b = str;
        this.f2331c = z10;
    }

    public String toString() {
        switch (this.f2329a) {
            case 1:
                String str = this.f2330b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f2331c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public v(String str, boolean z10) {
        this.f2329a = 0;
        this.f2331c = z10;
        this.f2330b = str;
    }
}
