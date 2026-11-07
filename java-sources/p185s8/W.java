package p185s8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22280c;

    public W(int i10, String str, List list) {
        this.f22278a = str;
        this.f22279b = i10;
        this.f22280c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B0) {
            W w9 = (W) ((B0) obj);
            if (this.f22278a.equals(w9.f22278a) && this.f22279b == w9.f22279b && this.f22280c.equals(w9.f22280c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22278a.hashCode() ^ 1000003) * 1000003) ^ this.f22279b) * 1000003) ^ this.f22280c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f22278a + ", importance=" + this.f22279b + ", frames=" + this.f22280c + "}";
    }
}
