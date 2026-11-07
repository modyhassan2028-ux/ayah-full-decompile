package D7;

import android.content.Context;
import android.graphics.Color;
import com.ayah.R;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1335f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1340e;

    public a(Context context) {
        boolean z10 = u0.z(context, R.attr.elevationOverlayEnabled, false);
        int iC = Y2.a.C(context, R.attr.elevationOverlayColor, 0);
        int iC2 = Y2.a.C(context, R.attr.elevationOverlayAccentColor, 0);
        int iC3 = Y2.a.C(context, R.attr.colorSurface, 0);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f1336a = z10;
        this.f1337b = iC;
        this.f1338c = iC2;
        this.f1339d = iC3;
        this.f1340e = f3;
    }

    public final int a(int i10, float f3) {
        int i11;
        if (!this.f1336a || A1.a.e(i10, 255) != this.f1339d) {
            return i10;
        }
        float f7 = this.f1340e;
        float fMin = (f7 <= 0.0f || f3 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f3 / f7)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iV = Y2.a.V(A1.a.e(i10, 255), fMin, this.f1337b);
        if (fMin > 0.0f && (i11 = this.f1338c) != 0) {
            iV = A1.a.c(A1.a.e(i11, f1335f), iV);
        }
        return A1.a.e(iV, iAlpha);
    }
}
