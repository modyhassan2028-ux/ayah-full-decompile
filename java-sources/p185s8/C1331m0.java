package p185s8;

import p085i0.n;

/* JADX INFO: renamed from: s8.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1331m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f22421f;

    public C1331m0(String str, String str2, String str3, String str4, int i10, n nVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f22416a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f22417b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f22418c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f22419d = str4;
        this.f22420e = i10;
        this.f22421f = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1331m0)) {
            return false;
        }
        C1331m0 c1331m0 = (C1331m0) obj;
        return this.f22416a.equals(c1331m0.f22416a) && this.f22417b.equals(c1331m0.f22417b) && this.f22418c.equals(c1331m0.f22418c) && this.f22419d.equals(c1331m0.f22419d) && this.f22420e == c1331m0.f22420e && this.f22421f.equals(c1331m0.f22421f);
    }

    public final int hashCode() {
        return ((((((((((this.f22416a.hashCode() ^ 1000003) * 1000003) ^ this.f22417b.hashCode()) * 1000003) ^ this.f22418c.hashCode()) * 1000003) ^ this.f22419d.hashCode()) * 1000003) ^ this.f22420e) * 1000003) ^ this.f22421f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f22416a + ", versionCode=" + this.f22417b + ", versionName=" + this.f22418c + ", installUuid=" + this.f22419d + ", deliveryMechanism=" + this.f22420e + ", developmentPlatformProvider=" + this.f22421f + "}";
    }
}
