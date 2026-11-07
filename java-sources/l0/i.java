package l0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19325a;

    public i(float f3) {
        this.f19325a = f3;
    }

    public final int a(int i10, int i11) {
        return Math.round((1 + this.f19325a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Float.compare(this.f19325a, ((i) obj).f19325a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19325a);
    }

    public final String toString() {
        return p123m2.c.v(new StringBuilder("Vertical(bias="), this.f19325a, ')');
    }
}
