package p124m3;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19544e;

    public b(float f3, float f7, int i10, int i11, int i12) {
        this.f19540a = i10;
        this.f19541b = i11;
        this.f19542c = i12;
        this.f19543d = f3;
        this.f19544e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19540a == bVar.f19540a && this.f19541b == bVar.f19541b && this.f19542c == bVar.f19542c && Float.compare(this.f19543d, bVar.f19543d) == 0 && Float.compare(this.f19544e, bVar.f19544e) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19544e) + c.n(((((this.f19540a * 31) + this.f19541b) * 31) + this.f19542c) * 31, this.f19543d, 31);
    }

    public final String toString() {
        StringBuilder sbX = c.x("ChapterHeaderDao(chapterNumber=", this.f19540a, ", pageNumber=", this.f19541b, ", line=");
        sbX.append(this.f19542c);
        sbX.append(", centerX=");
        sbX.append(this.f19543d);
        sbX.append(", centerY=");
        sbX.append(this.f19544e);
        sbX.append(")");
        return sbX.toString();
    }
}
