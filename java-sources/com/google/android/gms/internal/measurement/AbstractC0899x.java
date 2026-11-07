package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0899x implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14506f;
    public final IBinder g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14507h;

    public /* synthetic */ AbstractC0899x(IBinder iBinder, String str, int i10) {
        this.f14506f = i10;
        this.g = iBinder;
        this.f14507h = str;
    }

    public void E0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.g.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void F0(Parcel parcel) {
        try {
            this.g.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f14506f) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.g;
    }

    public Parcel c(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.g.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel g() {
        switch (this.f14506f) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f14507h);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f14507h);
                return parcelObtain2;
        }
    }
}
