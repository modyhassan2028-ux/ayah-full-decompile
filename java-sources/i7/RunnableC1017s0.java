package i7;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: i7.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1017s0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.N f17543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f17544t;

    public /* synthetic */ RunnableC1017s0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.N n6, int i10) {
        this.f17542r = i10;
        this.f17543s = n6;
        this.f17544t = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17542r) {
            case 0:
                C1021t1 c1021t1P = this.f17544t.f14525f.p();
                com.google.android.gms.internal.measurement.N n6 = this.f17543s;
                c1021t1P.o();
                c1021t1P.p();
                c1021t1P.C(new F1.o(c1021t1P, c1021t1P.E(false), n6, 7));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f17544t;
                V1 v10 = appMeasurementDynamiteService.f14525f.f17587z;
                C1023u0.k(v10);
                C1023u0 c1023u0 = appMeasurementDynamiteService.f14525f;
                v10.c0(this.f17543s, c1023u0.f17578P != null && c1023u0.f17578P.booleanValue());
                break;
        }
    }
}
