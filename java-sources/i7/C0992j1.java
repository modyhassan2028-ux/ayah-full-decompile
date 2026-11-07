package i7;

import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: i7.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0992j1 extends I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0983g1 f17425A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f17426B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f17427C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile C0983g1 f17428t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile C0983g1 f17429u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0983g1 f17430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ConcurrentHashMap f17431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.Y f17432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f17433y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile C0983g1 f17434z;

    public C0992j1(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17427C = new Object();
        this.f17431w = new ConcurrentHashMap();
    }

    @Override // i7.I
    public final boolean r() {
        return false;
    }

    public final void s(C0983g1 c0983g1, boolean z10, long j) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        A a9 = c1023u0.f17567E;
        C1023u0.j(a9);
        c1023u0.f17564B.getClass();
        a9.r(SystemClock.elapsedRealtime());
        boolean z11 = c0983g1 != null && c0983g1.f17370d;
        B1 b5 = c1023u0.f17586y;
        C1023u0.l(b5);
        if (!b5.f16835w.a(j, z11, z10) || c0983g1 == null) {
            return;
        }
        c0983g1.f17370d = false;
    }

    public final C0983g1 t(com.google.android.gms.internal.measurement.Y y10) {
        U6.y.f(y10);
        Integer numValueOf = Integer.valueOf(y10.f14175r);
        ConcurrentHashMap concurrentHashMap = this.f17431w;
        C0983g1 c0983g1 = (C0983g1) concurrentHashMap.get(numValueOf);
        if (c0983g1 == null) {
            String strV = v(y10.f14176s);
            V1 v10 = ((C1023u0) this.f16104r).f17587z;
            C1023u0.k(v10);
            C0983g1 c0983g2 = new C0983g1(v10.m0(), null, strV);
            concurrentHashMap.put(numValueOf, c0983g2);
            c0983g1 = c0983g2;
        }
        return this.f17434z != null ? this.f17434z : c0983g1;
    }

    public final C0983g1 u(boolean z10) {
        p();
        o();
        if (!z10) {
            return this.f17430v;
        }
        C0983g1 c0983g1 = this.f17430v;
        return c0983g1 != null ? c0983g1 : this.f17425A;
    }

    public final String v(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        int length2 = str2.length();
        c1023u0.f17582u.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c1023u0.f17582u.getClass();
        return str2.substring(0, 500);
    }

    public final void w(com.google.android.gms.internal.measurement.Y y10, Bundle bundle) {
        Bundle bundle2;
        if (!((C1023u0) this.f16104r).f17582u.C() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f17431w.put(Integer.valueOf(y10.f14175r), new C0983g1(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void x(String str, C0983g1 c0983g1, boolean z10) {
        C0983g1 c0983g2;
        C0983g1 c0983g3 = this.f17428t == null ? this.f17429u : this.f17428t;
        if (c0983g1.f17368b == null) {
            c0983g2 = new C0983g1(c0983g1.f17367a, str != null ? v(str) : null, c0983g1.f17369c, c0983g1.f17371e, c0983g1.f17372f);
        } else {
            c0983g2 = c0983g1;
        }
        this.f17429u = this.f17428t;
        this.f17428t = c0983g2;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        c1023u0.f17564B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.x(new RunnableC0986h1(this, c0983g2, c0983g3, jElapsedRealtime, z10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    public final void y(C0983g1 c0983g1, C0983g1 c0983g2, long j, boolean z10, Bundle bundle) {
        boolean z11;
        boolean z12 = c0983g1.f17371e;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        boolean z13 = false;
        if (c0983g2 != null) {
            if (c0983g2.f17369c == c0983g1.f17369c && Objects.equals(c0983g2.f17368b, c0983g1.f17368b) && Objects.equals(c0983g2.f17367a, c0983g1.f17367a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f17430v != null) {
            z13 = true;
        }
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            V1.h0(c0983g1, bundle2, true);
            if (c0983g2 != null) {
                String str = c0983g2.f17367a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c0983g2.f17368b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c0983g2.f17369c);
            }
            if (z13) {
                B1 b5 = c1023u0.f17586y;
                C1023u0.l(b5);
                A1 a9 = b5.f16835w;
                long j10 = j - a9.f16817b;
                a9.f16817b = j;
                if (j10 > 0) {
                    V1 v10 = c1023u0.f17587z;
                    C1023u0.k(v10);
                    v10.X(bundle2, j10);
                }
            }
            if (!c1023u0.f17582u.C()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z12 ? "auto" : "app";
            c1023u0.f17564B.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z12) {
                long j11 = c0983g1.f17372f;
                if (j11 != 0) {
                    jCurrentTimeMillis = j11;
                }
            }
            Y0 y10 = c1023u0.f17566D;
            C1023u0.l(y10);
            y10.w(jCurrentTimeMillis, bundle2, str3, "_vs");
        }
        if (z13) {
            s(this.f17430v, true, j);
        }
        this.f17430v = c0983g1;
        if (z12) {
            this.f17425A = c0983g1;
        }
        C1021t1 c1021t1P = c1023u0.p();
        c1021t1P.o();
        c1021t1P.p();
        c1021t1P.C(new p039d8.a(c1021t1P, c0983g1));
    }
}
