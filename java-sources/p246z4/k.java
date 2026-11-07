package p246z4;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24826b;

    public k(int i10, String str) {
        j.e(str, "reciterId");
        this.f24825a = i10;
        this.f24826b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24825a == kVar.f24825a && j.a(this.f24826b, kVar.f24826b);
    }

    public final int hashCode() {
        return this.f24826b.hashCode() + (this.f24825a * 31);
    }

    public final String toString() {
        return "TrackKey(sura=" + this.f24825a + ", reciterId=" + this.f24826b + ")";
    }
}
