package E9;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1994b;

    public a(float f3, float f7) {
        this.f1993a = f3;
        this.f1994b = f7;
    }

    public static boolean a(Float f3, Float f7) {
        return f3.floatValue() <= f7.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f3 = this.f1993a;
        float f7 = this.f1994b;
        if (f3 > f7) {
            a aVar = (a) obj;
            if (aVar.f1993a > aVar.f1994b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f3 == aVar2.f1993a && f7 == aVar2.f1994b;
    }

    public final int hashCode() {
        float f3 = this.f1993a;
        float f7 = this.f1994b;
        if (f3 > f7) {
            return -1;
        }
        return Float.floatToIntBits(f7) + (Float.floatToIntBits(f3) * 31);
    }

    public final String toString() {
        return this.f1993a + ".." + this.f1994b;
    }
}
