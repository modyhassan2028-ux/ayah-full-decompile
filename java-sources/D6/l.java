package D6;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0098a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1296f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1298i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1300l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1291a = num;
        this.f1292b = str;
        this.f1293c = str2;
        this.f1294d = str3;
        this.f1295e = str4;
        this.f1296f = str5;
        this.g = str6;
        this.f1297h = str7;
        this.f1298i = str8;
        this.j = str9;
        this.f1299k = str10;
        this.f1300l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0098a) {
            AbstractC0098a abstractC0098a = (AbstractC0098a) obj;
            Integer num = this.f1291a;
            if (num != null ? num.equals(((l) abstractC0098a).f1291a) : ((l) abstractC0098a).f1291a == null) {
                String str = this.f1292b;
                if (str != null ? str.equals(((l) abstractC0098a).f1292b) : ((l) abstractC0098a).f1292b == null) {
                    String str2 = this.f1293c;
                    if (str2 != null ? str2.equals(((l) abstractC0098a).f1293c) : ((l) abstractC0098a).f1293c == null) {
                        String str3 = this.f1294d;
                        if (str3 != null ? str3.equals(((l) abstractC0098a).f1294d) : ((l) abstractC0098a).f1294d == null) {
                            String str4 = this.f1295e;
                            if (str4 != null ? str4.equals(((l) abstractC0098a).f1295e) : ((l) abstractC0098a).f1295e == null) {
                                String str5 = this.f1296f;
                                if (str5 != null ? str5.equals(((l) abstractC0098a).f1296f) : ((l) abstractC0098a).f1296f == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(((l) abstractC0098a).g) : ((l) abstractC0098a).g == null) {
                                        String str7 = this.f1297h;
                                        if (str7 != null ? str7.equals(((l) abstractC0098a).f1297h) : ((l) abstractC0098a).f1297h == null) {
                                            String str8 = this.f1298i;
                                            if (str8 != null ? str8.equals(((l) abstractC0098a).f1298i) : ((l) abstractC0098a).f1298i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((l) abstractC0098a).j) : ((l) abstractC0098a).j == null) {
                                                    String str10 = this.f1299k;
                                                    if (str10 != null ? str10.equals(((l) abstractC0098a).f1299k) : ((l) abstractC0098a).f1299k == null) {
                                                        String str11 = this.f1300l;
                                                        if (str11 != null ? str11.equals(((l) abstractC0098a).f1300l) : ((l) abstractC0098a).f1300l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f1291a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f1292b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1293c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1294d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1295e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f1296f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f1297h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f1298i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f1299k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f1300l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f1291a);
        sb.append(", model=");
        sb.append(this.f1292b);
        sb.append(", hardware=");
        sb.append(this.f1293c);
        sb.append(", device=");
        sb.append(this.f1294d);
        sb.append(", product=");
        sb.append(this.f1295e);
        sb.append(", osBuild=");
        sb.append(this.f1296f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.f1297h);
        sb.append(", locale=");
        sb.append(this.f1298i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.f1299k);
        sb.append(", applicationBuild=");
        return android.support.v4.media.session.p.B(sb, this.f1300l, "}");
    }
}
