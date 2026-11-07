package ka;

/* JADX INFO: loaded from: classes.dex */
public enum s {
    f19247t("http/1.0"),
    f19248u("http/1.1"),
    f19249v("spdy/3.1"),
    f19250w("h2"),
    f19251x("h2_prior_knowledge"),
    f19252y("quic"),
    f19253z("h3");


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f19246s = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f19254r;

    s(String str) {
        this.f19254r = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f19254r;
    }
}
