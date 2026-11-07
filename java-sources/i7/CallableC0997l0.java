package i7;

import com.google.android.gms.internal.measurement.C0892v2;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: i7.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0997l0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1003n0 f17450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17451c;

    public /* synthetic */ CallableC0997l0(C1003n0 c1003n0, String str, int i10) {
        this.f17449a = i10;
        this.f17450b = c1003n0;
        this.f17451c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17449a) {
            case 0:
                return new com.google.android.gms.internal.measurement.L1(new CallableC0997l0(this.f17450b, this.f17451c, 1));
            case 1:
                C1003n0 c1003n0 = this.f17450b;
                C0999m c0999m = c1003n0.f17001s.f17106t;
                Q1.U(c0999m);
                String str = this.f17451c;
                C0970c0 c0970c0Q0 = c0999m.q0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((C1023u0) c1003n0.f16104r).f17582u.t();
                map.put("gmp_version", 133005L);
                if (c0970c0Q0 != null) {
                    String strN = c0970c0Q0.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(c0970c0Q0.P()));
                    map.put("dynamite_version", Long.valueOf(c0970c0Q0.b()));
                }
                return map;
            default:
                p085i0.n nVar = new p085i0.n(2, this.f17450b, this.f17451c, false);
                C0892v2 c0892v2 = new C0892v2("internal.remoteConfig", 0);
                c0892v2.f14326s.put("getValue", new com.google.android.gms.internal.measurement.L1(c0892v2, nVar));
                return c0892v2;
        }
    }
}
