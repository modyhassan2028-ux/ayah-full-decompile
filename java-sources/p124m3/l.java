package p124m3;

import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19611d;

    public l(String str, int i10, float f3, float f7) {
        j.e(str, "numberCodePoint");
        this.f19608a = str;
        this.f19609b = i10;
        this.f19610c = f3;
        this.f19611d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return j.a(this.f19608a, lVar.f19608a) && this.f19609b == lVar.f19609b && Float.compare(this.f19610c, lVar.f19610c) == 0 && Float.compare(this.f19611d, lVar.f19611d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19611d) + c.n(((this.f19608a.hashCode() * 31) + this.f19609b) * 31, this.f19610c, 31);
    }

    public final String toString() {
        return "VerseMarkerDao(numberCodePoint=" + this.f19608a + ", line=" + this.f19609b + ", centerX=" + this.f19610c + ", centerY=" + this.f19611d + ")";
    }
}
