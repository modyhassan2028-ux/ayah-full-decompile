package p124m3;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19607c;

    public k(float f3, float f7, int i10) {
        this.f19605a = i10;
        this.f19606b = f3;
        this.f19607c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f19605a == kVar.f19605a && Float.compare(this.f19606b, kVar.f19606b) == 0 && Float.compare(this.f19607c, kVar.f19607c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19607c) + c.n(this.f19605a * 31, this.f19606b, 31);
    }

    public final String toString() {
        return "VerseHighlightDao(line=" + this.f19605a + ", left=" + this.f19606b + ", right=" + this.f19607c + ")";
    }
}
