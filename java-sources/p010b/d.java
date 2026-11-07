package p010b;

import E2.O;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new O(24);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f13117r;

    public final void b(int i10, Bundle bundle) {
        b bVar = this.f13117r;
        if (bVar != null) {
            try {
                bVar.C0(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f13117r == null) {
                    this.f13117r = new c(this);
                }
                parcel.writeStrongBinder(this.f13117r.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
