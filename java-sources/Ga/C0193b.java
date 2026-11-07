package Ga;

/* JADX INFO: renamed from: Ga.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0193b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3007b;

    public C0193b(float f3, float f7) {
        this.f3006a = f3;
        this.f3007b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0193b)) {
            return false;
        }
        C0193b c0193b = (C0193b) obj;
        return Float.compare(this.f3006a, c0193b.f3006a) == 0 && Float.compare(this.f3007b, c0193b.f3007b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3007b) + (Float.floatToIntBits(this.f3006a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionScrollPadding(start=");
        sb.append(this.f3006a);
        sb.append(", end=");
        return p123m2.c.v(sb, this.f3007b, ')');
    }
}
