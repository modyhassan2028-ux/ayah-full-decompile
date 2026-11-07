package p072ga;

import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final double f16375s;

    public f(double d5) {
        this.f16375s = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return Double.compare(0.5d, 0.5d) == 0 && Double.compare(this.f16375s, ((f) obj).f16375s) == 0;
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(0.5d);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f16375s);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "Relative(x=0.5, y=" + this.f16375s + ")";
    }
}
