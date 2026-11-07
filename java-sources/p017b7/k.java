package p017b7;

import a7.a;
import a7.b;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0899x;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0899x {
    public final a G0(b bVar, String str, int i10, b bVar2) {
        Parcel parcelG = g();
        p049e7.a.c(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        p049e7.a.c(parcelG, bVar2);
        Parcel parcelA = a(parcelG, 2);
        a aVarF0 = b.F0(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarF0;
    }

    public final a H0(b bVar, String str, int i10, b bVar2) {
        Parcel parcelG = g();
        p049e7.a.c(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        p049e7.a.c(parcelG, bVar2);
        Parcel parcelA = a(parcelG, 3);
        a aVarF0 = b.F0(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarF0;
    }
}
