package p185s8;

/* JADX INFO: loaded from: classes.dex */
public final class B extends O0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22168f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22170i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N0 f22171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t0 f22172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q0 f22173m;

    public B(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, N0 n6, t0 t0Var, q0 q0Var) {
        this.f22164b = str;
        this.f22165c = str2;
        this.f22166d = i10;
        this.f22167e = str3;
        this.f22168f = str4;
        this.g = str5;
        this.f22169h = str6;
        this.f22170i = str7;
        this.j = str8;
        this.f22171k = n6;
        this.f22172l = t0Var;
        this.f22173m = q0Var;
    }

    public final A a() {
        A a9 = new A();
        a9.f22153a = this.f22164b;
        a9.f22154b = this.f22165c;
        a9.f22155c = this.f22166d;
        a9.f22156d = this.f22167e;
        a9.f22157e = this.f22168f;
        a9.f22158f = this.g;
        a9.g = this.f22169h;
        a9.f22159h = this.f22170i;
        a9.f22160i = this.j;
        a9.j = this.f22171k;
        a9.f22161k = this.f22172l;
        a9.f22162l = this.f22173m;
        a9.f22163m = (byte) 1;
        return a9;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        N0 n6;
        t0 t0Var;
        q0 q0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof O0) {
            B b5 = (B) ((O0) obj);
            q0 q0Var2 = b5.f22173m;
            t0 t0Var2 = b5.f22172l;
            N0 n10 = b5.f22171k;
            String str4 = b5.f22169h;
            String str5 = b5.g;
            String str6 = b5.f22168f;
            if (this.f22164b.equals(b5.f22164b) && this.f22165c.equals(b5.f22165c) && this.f22166d == b5.f22166d && this.f22167e.equals(b5.f22167e) && ((str = this.f22168f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f22169h) != null ? str3.equals(str4) : str4 == null) && this.f22170i.equals(b5.f22170i) && this.j.equals(b5.j) && ((n6 = this.f22171k) != null ? n6.equals(n10) : n10 == null) && ((t0Var = this.f22172l) != null ? t0Var.equals(t0Var2) : t0Var2 == null) && ((q0Var = this.f22173m) != null ? q0Var.equals(q0Var2) : q0Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f22164b.hashCode() ^ 1000003) * 1000003) ^ this.f22165c.hashCode()) * 1000003) ^ this.f22166d) * 1000003) ^ this.f22167e.hashCode()) * 1000003;
        String str = this.f22168f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22169h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f22170i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        N0 n6 = this.f22171k;
        int iHashCode5 = (iHashCode4 ^ (n6 == null ? 0 : n6.hashCode())) * 1000003;
        t0 t0Var = this.f22172l;
        int iHashCode6 = (iHashCode5 ^ (t0Var == null ? 0 : t0Var.hashCode())) * 1000003;
        q0 q0Var = this.f22173m;
        return iHashCode6 ^ (q0Var != null ? q0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f22164b + ", gmpAppId=" + this.f22165c + ", platform=" + this.f22166d + ", installationUuid=" + this.f22167e + ", firebaseInstallationId=" + this.f22168f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.f22169h + ", buildVersion=" + this.f22170i + ", displayVersion=" + this.j + ", session=" + this.f22171k + ", ndkPayload=" + this.f22172l + ", appExitInfo=" + this.f22173m + "}";
    }
}
