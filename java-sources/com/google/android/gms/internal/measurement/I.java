package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractBinderC0904y implements N {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f14046f;
    public boolean g;

    public I() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f14046f = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L38
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.I.g(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.N
    public final void D(Bundle bundle) {
        AtomicReference atomicReference = this.f14046f;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.g = true;
                    this.f14046f.notify();
                } catch (Throwable th) {
                    this.f14046f.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0904y
    public final boolean a(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
        AbstractC0909z.d(parcel);
        D(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle c(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f14046f;
        synchronized (atomicReference) {
            if (!this.g) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f14046f.get();
        }
        return bundle;
    }
}
