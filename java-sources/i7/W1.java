package i7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
public final class W1 implements J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.T f17172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f17173b;

    public W1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.T t2) {
        this.f17173b = appMeasurementDynamiteService;
        this.f17172a = t2;
    }

    @Override // i7.J0
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f17172a.P(j, bundle, str, str2);
        } catch (RemoteException e10) {
            C1023u0 c1023u0 = this.f17173b.f14525f;
            if (c1023u0 != null) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17185z.b(e10, "Event listener threw exception");
            }
        }
    }
}
