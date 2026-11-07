package p180s0;

import I1.n0;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p110k9.t;
import p123m2.c;

/* JADX INFO: renamed from: s0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1303l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorFilter f21834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21836c;

    public C1303l(long j, int i10) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            n0.f();
            porterDuffColorFilter = n0.a(F.u(j), AbstractC1293b.d(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(F.u(j), AbstractC1293b.e(i10));
        }
        this.f21834a = porterDuffColorFilter;
        this.f21835b = j;
        this.f21836c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1303l)) {
            return false;
        }
        C1303l c1303l = (C1303l) obj;
        return q.c(this.f21835b, c1303l.f21835b) && this.f21836c == c1303l.f21836c;
    }

    public final int hashCode() {
        int i10 = q.f21844h;
        return (t.a(this.f21835b) * 31) + this.f21836c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        c.A(this.f21835b, ", blendMode=", sb);
        int i10 = this.f21836c;
        if (i10 == 0) {
            str = "Clear";
        } else if (i10 == 1) {
            str = "Src";
        } else if (i10 == 2) {
            str = "Dst";
        } else if (i10 == 3) {
            str = "SrcOver";
        } else if (i10 == 4) {
            str = "DstOver";
        } else if (i10 == 5) {
            str = "SrcIn";
        } else if (i10 == 6) {
            str = "DstIn";
        } else if (i10 == 7) {
            str = "SrcOut";
        } else if (i10 == 8) {
            str = "DstOut";
        } else if (i10 == 9) {
            str = "SrcAtop";
        } else if (i10 == 10) {
            str = "DstAtop";
        } else if (i10 == 11) {
            str = "Xor";
        } else if (i10 == 12) {
            str = "Plus";
        } else if (i10 == 13) {
            str = "Modulate";
        } else if (i10 == 14) {
            str = "Screen";
        } else if (i10 == 15) {
            str = "Overlay";
        } else if (i10 == 16) {
            str = "Darken";
        } else if (i10 == 17) {
            str = "Lighten";
        } else if (i10 == 18) {
            str = "ColorDodge";
        } else if (i10 == 19) {
            str = "ColorBurn";
        } else if (i10 == 20) {
            str = "HardLight";
        } else if (i10 == 21) {
            str = "Softlight";
        } else if (i10 == 22) {
            str = "Difference";
        } else if (i10 == 23) {
            str = "Exclusion";
        } else if (i10 == 24) {
            str = "Multiply";
        } else if (i10 == 25) {
            str = "Hue";
        } else if (i10 == 26) {
            str = "Saturation";
        } else if (i10 == 27) {
            str = "Color";
        } else {
            str = i10 == 28 ? "Luminosity" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
