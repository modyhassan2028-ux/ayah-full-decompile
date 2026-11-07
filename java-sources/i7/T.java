package i7;

import U6.AbstractC0527e;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0527e {
    @Override // U6.AbstractC0527e, S6.a
    public final int f() {
        return 12451000;
    }

    @Override // U6.AbstractC0527e
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof J ? (J) iInterfaceQueryLocalInterface : new H(iBinder);
    }

    @Override // U6.AbstractC0527e
    public final String v() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // U6.AbstractC0527e
    public final String w() {
        return "com.google.android.gms.measurement.START";
    }
}
