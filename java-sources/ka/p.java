package ka;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H9.m f19193b = new H9.m("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H9.m f19194c = new H9.m(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19195a;

    public p(String str, String str2, String str3, String[] strArr) {
        p251z9.j.e(str, "mediaType");
        p251z9.j.e(strArr, "parameterNamesAndValues");
        this.f19195a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && p251z9.j.a(((p) obj).f19195a, this.f19195a);
    }

    public final int hashCode() {
        return this.f19195a.hashCode();
    }

    public final String toString() {
        return this.f19195a;
    }
}
