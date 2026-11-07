package p196u0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22804e;

    public g(float f3, float f7, int i10, int i11, int i12) {
        f7 = (i12 & 2) != 0 ? 4.0f : f7;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f22801b = f3;
        this.f22802c = f7;
        this.f22803d = i10;
        this.f22804e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f22801b == gVar.f22801b && this.f22802c == gVar.f22802c && this.f22803d == gVar.f22803d && this.f22804e == gVar.f22804e;
    }

    public final int hashCode() {
        return (((c.n(Float.floatToIntBits(this.f22801b) * 31, this.f22802c, 31) + this.f22803d) * 31) + this.f22804e) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f22801b);
        sb.append(", miter=");
        sb.append(this.f22802c);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i10 = this.f22803d;
        if (i10 == 0) {
            str = "Butt";
        } else if (i10 == 1) {
            str = "Round";
        } else {
            str = i10 == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i11 = this.f22804e;
        if (i11 == 0) {
            str2 = "Miter";
        } else if (i11 == 1) {
            str2 = "Round";
        } else if (i11 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
