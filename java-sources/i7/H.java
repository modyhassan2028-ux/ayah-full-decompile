package i7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0899x;
import com.google.android.gms.internal.measurement.AbstractC0909z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0899x implements J {
    public H(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // i7.J
    public final void A0(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 4);
    }

    @Override // i7.J
    public final List F(String str, String str2, X1 x9) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC0909z.b(parcelG, x9);
        Parcel parcelC = c(parcelG, 16);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(C0975e.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // i7.J
    public final void L(X1 x9, C0972d c0972d) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        AbstractC0909z.b(parcelG, c0972d);
        E0(parcelG, 30);
    }

    @Override // i7.J
    public final void N(long j, String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeLong(j);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        E0(parcelG, 10);
    }

    @Override // i7.J
    public final void O(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 26);
    }

    @Override // i7.J
    public final void R(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 6);
    }

    @Override // i7.J
    public final String T(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        Parcel parcelC = c(parcelG, 11);
        String string = parcelC.readString();
        parcelC.recycle();
        return string;
    }

    @Override // i7.J
    public final void Z(S1 s10, X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, s10);
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 2);
    }

    @Override // i7.J
    public final List b0(String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelC = c(parcelG, 17);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(C0975e.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // i7.J
    public final void c0(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 20);
    }

    @Override // i7.J
    public final void i(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 27);
    }

    @Override // i7.J
    public final void j(X1 x9, J1 j10, N n6) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        AbstractC0909z.b(parcelG, j10);
        AbstractC0909z.c(parcelG, n6);
        E0(parcelG, 29);
    }

    @Override // i7.J
    public final void j0(C1022u c1022u, X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, c1022u);
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 1);
    }

    @Override // i7.J
    public final List l(String str, String str2, String str3, boolean z10) {
        Parcel parcelG = g();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        ClassLoader classLoader = AbstractC0909z.f14514a;
        parcelG.writeInt(z10 ? 1 : 0);
        Parcel parcelC = c(parcelG, 15);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(S1.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // i7.J
    public final C0987i m0(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        Parcel parcelC = c(parcelG, 21);
        C0987i c0987i = (C0987i) AbstractC0909z.a(parcelC, C0987i.CREATOR);
        parcelC.recycle();
        return c0987i;
    }

    @Override // i7.J
    public final void o(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 18);
    }

    @Override // i7.J
    public final void r0(Bundle bundle, X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, bundle);
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 19);
    }

    @Override // i7.J
    public final void t(X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 25);
    }

    @Override // i7.J
    public final void t0(C0975e c0975e, X1 x9) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, c0975e);
        AbstractC0909z.b(parcelG, x9);
        E0(parcelG, 12);
    }

    @Override // i7.J
    public final void u(X1 x9, Bundle bundle, L l10) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, x9);
        AbstractC0909z.b(parcelG, bundle);
        AbstractC0909z.c(parcelG, l10);
        E0(parcelG, 31);
    }

    @Override // i7.J
    public final byte[] x(C1022u c1022u, String str) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, c1022u);
        parcelG.writeString(str);
        Parcel parcelC = c(parcelG, 9);
        byte[] bArrCreateByteArray = parcelC.createByteArray();
        parcelC.recycle();
        return bArrCreateByteArray;
    }

    @Override // i7.J
    public final List y(String str, String str2, boolean z10, X1 x9) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = AbstractC0909z.f14514a;
        parcelG.writeInt(z10 ? 1 : 0);
        AbstractC0909z.b(parcelG, x9);
        Parcel parcelC = c(parcelG, 14);
        ArrayList arrayListCreateTypedArrayList = parcelC.createTypedArrayList(S1.CREATOR);
        parcelC.recycle();
        return arrayListCreateTypedArrayList;
    }
}
