package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22192c;

    public E(String str, String str2, String str3) {
        this.f22190a = str;
        this.f22191b = str2;
        this.f22192c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            E e10 = (E) ((p0) obj);
            if (this.f22190a.equals(e10.f22190a) && this.f22191b.equals(e10.f22191b) && this.f22192c.equals(e10.f22192c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22190a.hashCode() ^ 1000003) * 1000003) ^ this.f22191b.hashCode()) * 1000003) ^ this.f22192c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f22190a);
        sb.append(", libraryName=");
        sb.append(this.f22191b);
        sb.append(", buildId=");
        return p.B(sb, this.f22192c, "}");
    }
}
