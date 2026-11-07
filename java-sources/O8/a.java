package O8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6507b;

    public a(String str, String str2) {
        this.f6506a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f6507b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6506a.equals(aVar.f6506a) && this.f6507b.equals(aVar.f6507b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6506a.hashCode() ^ 1000003) * 1000003) ^ this.f6507b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f6506a);
        sb.append(", version=");
        return p.B(sb, this.f6507b, "}");
    }
}
