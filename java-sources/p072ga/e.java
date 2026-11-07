package p072ga;

import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f16373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f16374t;

    public e(float f3, float f7) {
        this.f16373s = f3;
        this.f16374t = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f16373s, eVar.f16373s) == 0 && Float.compare(this.f16374t, eVar.f16374t) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16374t) + (Float.floatToIntBits(this.f16373s) * 31);
    }

    public final String toString() {
        return "Absolute(x=" + this.f16373s + ", y=" + this.f16374t + ")";
    }
}
