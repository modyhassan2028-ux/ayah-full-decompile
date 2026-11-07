package i7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0899x;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0899x implements L {
    @Override // i7.L
    public final void k0(List list) {
        Parcel parcelG = g();
        parcelG.writeTypedList(list);
        F0(parcelG);
    }
}
