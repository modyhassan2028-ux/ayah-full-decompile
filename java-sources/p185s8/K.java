package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class K extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22225f;

    public K(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f22220a = str;
        this.f22221b = str2;
        this.f22222c = str3;
        this.f22223d = str4;
        this.f22224e = str5;
        this.f22225f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            K k7 = (K) ((v0) obj);
            String str5 = k7.f22225f;
            String str6 = k7.f22224e;
            String str7 = k7.f22223d;
            String str8 = k7.f22222c;
            if (this.f22220a.equals(k7.f22220a) && this.f22221b.equals(k7.f22221b) && ((str = this.f22222c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f22223d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f22224e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f22225f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f22220a.hashCode() ^ 1000003) * 1000003) ^ this.f22221b.hashCode()) * 1000003;
        String str = this.f22222c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f22223d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22224e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f22225f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f22220a);
        sb.append(", version=");
        sb.append(this.f22221b);
        sb.append(", displayVersion=");
        sb.append(this.f22222c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f22223d);
        sb.append(", developmentPlatform=");
        sb.append(this.f22224e);
        sb.append(", developmentPlatformVersion=");
        return p.B(sb, this.f22225f, "}");
    }
}
