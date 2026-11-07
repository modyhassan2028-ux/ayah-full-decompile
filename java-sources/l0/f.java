package l0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19322a;

    public f(float f3) {
        this.f19322a = f3;
    }

    @Override // l0.d
    public final int a(int i10, int i11, p063g1.m mVar) {
        return Math.round((1 + this.f19322a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f19322a, ((f) obj).f19322a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19322a);
    }

    public final String toString() {
        return p123m2.c.v(new StringBuilder("Horizontal(bias="), this.f19322a, ')');
    }
}
