package R3;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7225d;

    public a(int i10, int i11, int i12, int i13) {
        this.f7222a = i10;
        this.f7223b = i11;
        this.f7224c = i12;
        this.f7225d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7222a == aVar.f7222a && this.f7223b == aVar.f7223b && this.f7224c == aVar.f7224c && this.f7225d == aVar.f7225d;
    }

    public final int hashCode() {
        return (((((this.f7222a * 31) + this.f7223b) * 31) + this.f7224c) * 31) + this.f7225d;
    }

    public final String toString() {
        StringBuilder sbX = c.x("Measurements(quranImageWidth=", this.f7222a, ", quranImageHeight=", this.f7223b, ", headerFooterWidth=");
        sbX.append(this.f7224c);
        sbX.append(", headerFooterHeight=");
        sbX.append(this.f7225d);
        sbX.append(")");
        return sbX.toString();
    }
}
