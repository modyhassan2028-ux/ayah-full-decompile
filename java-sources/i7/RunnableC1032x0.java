package i7;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: i7.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1032x0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f17683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f17684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17687w;

    public /* synthetic */ RunnableC1032x0(Object obj, String str, String str2, Object obj2, long j, int i10) {
        this.f17682r = i10;
        this.f17683s = str;
        this.f17684t = str2;
        this.f17686v = obj2;
        this.f17685u = j;
        this.f17687w = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17682r) {
            case 0:
                String str = (String) this.f17684t;
                B0 b5 = (B0) this.f17687w;
                String str2 = (String) this.f17683s;
                if (str2 != null) {
                    C0983g1 c0983g1 = new C0983g1(this.f17685u, (String) this.f17686v, str2);
                    Q1 q10 = b5.f16830f;
                    q10.c().o();
                    String str3 = q10.f17100X;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    q10.f17100X = str;
                    q10.f17099W = c0983g1;
                } else {
                    Q1 q11 = b5.f16830f;
                    q11.c().o();
                    String str4 = q11.f17100X;
                    if (str4 == null || str4.equals(str)) {
                        q11.f17100X = str;
                        q11.f17099W = null;
                    }
                }
                break;
            case 1:
                ((Y0) this.f17687w).z((String) this.f17683s, (String) this.f17684t, this.f17685u, this.f17686v);
                break;
            default:
                C0992j1 c0992j1 = (C0992j1) this.f17687w;
                Bundle bundle = (Bundle) this.f17683s;
                C0983g1 c0983g2 = (C0983g1) this.f17684t;
                C0983g1 c0983g3 = (C0983g1) this.f17686v;
                c0992j1.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                V1 v10 = ((C1023u0) c0992j1.f16104r).f17587z;
                C1023u0.k(v10);
                c0992j1.y(c0983g2, c0983g3, this.f17685u, true, v10.w("screen_view", bundle, null, false));
                break;
        }
    }

    public RunnableC1032x0(C0992j1 c0992j1, Bundle bundle, C0983g1 c0983g1, C0983g1 c0983g2, long j) {
        this.f17682r = 2;
        this.f17683s = bundle;
        this.f17684t = c0983g1;
        this.f17686v = c0983g2;
        this.f17685u = j;
        Objects.requireNonNull(c0992j1);
        this.f17687w = c0992j1;
    }
}
