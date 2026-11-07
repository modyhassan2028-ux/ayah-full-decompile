package i7;

import android.util.Log;

/* JADX INFO: renamed from: i7.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0991j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17423a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1023u0 f17424b;

    public C0991j0(Q1 q10) {
        this.f17424b = q10.f17084C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.f17423a) {
            case 0:
                C1023u0 c1023u0 = this.f17424b;
                boolean z10 = false;
                try {
                    N0.a aVarA = Z6.b.a(c1023u0.f17579r);
                    if (aVarA == null) {
                        X x9 = c1023u0.f17584w;
                        C1023u0.m(x9);
                        x9.f17178E.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        c1023u0 = c1023u0;
                    } else {
                        int i10 = aVarA.b(128, "com.android.vending").versionCode;
                        c1023u0 = i10;
                        if (i10 >= 80837300) {
                            z10 = true;
                            c1023u0 = i10;
                        }
                    }
                    break;
                } catch (Exception e10) {
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17178E.b(e10, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z10;
            default:
                X x11 = this.f17424b.f17584w;
                C1023u0.m(x11);
                return Log.isLoggable(x11.y(), 3);
        }
    }

    public C0991j0(K0 k7, C1023u0 c1023u0) {
        this.f17424b = c1023u0;
    }
}
