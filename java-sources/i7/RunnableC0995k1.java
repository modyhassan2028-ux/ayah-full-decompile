package i7;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: i7.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0995k1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17440r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f17441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f17442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X1 f17443u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1021t1 f17445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17446x;

    public RunnableC0995k1(C1021t1 c1021t1, String str, String str2, X1 x9, boolean z10, com.google.android.gms.internal.measurement.N n6) {
        this.f17441s = str;
        this.f17442t = str2;
        this.f17443u = x9;
        this.f17444v = z10;
        this.f17446x = n6;
        this.f17445w = c1021t1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        V1 v10;
        AtomicReference atomicReference;
        switch (this.f17440r) {
            case 0:
                String str = this.f17442t;
                String str2 = this.f17441s;
                com.google.android.gms.internal.measurement.N n6 = (com.google.android.gms.internal.measurement.N) this.f17446x;
                C1021t1 c1021t1 = this.f17445w;
                Bundle bundle = new Bundle();
                try {
                    try {
                        J j = c1021t1.f17552u;
                        C1023u0 c1023u0 = (C1023u0) c1021t1.f16104r;
                        if (j == null) {
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.c(str2, str, "Failed to get user properties; not connected to service");
                            v10 = c1023u0.f17587z;
                            C1023u0.k(v10);
                            v10.d0(n6, bundle);
                            return;
                        }
                        List<S1> listY = j.y(str2, str, this.f17444v, this.f17443u);
                        Bundle bundle2 = new Bundle();
                        if (listY != null) {
                            for (S1 s10 : listY) {
                                String str3 = s10.f17135v;
                                String str4 = s10.f17132s;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l10 = s10.f17134u;
                                    if (l10 != null) {
                                        bundle2.putLong(str4, l10.longValue());
                                    } else {
                                        Double d5 = s10.f17137x;
                                        if (d5 != null) {
                                            bundle2.putDouble(str4, d5.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            c1021t1.B();
                            V1 v11 = c1023u0.f17587z;
                            C1023u0.k(v11);
                            v11.d0(n6, bundle2);
                            return;
                        } catch (RemoteException e10) {
                            e = e10;
                            bundle = bundle2;
                            X x10 = ((C1023u0) c1021t1.f16104r).f17584w;
                            C1023u0.m(x10);
                            x10.f17182w.c(str2, e, "Failed to get user properties; remote exception");
                            v10 = ((C1023u0) c1021t1.f16104r).f17587z;
                            C1023u0.k(v10);
                            v10.d0(n6, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            V1 v12 = ((C1023u0) c1021t1.f16104r).f17587z;
                            C1023u0.k(v12);
                            v12.d0(n6, bundle);
                            throw th;
                        }
                    } catch (RemoteException e11) {
                        e = e11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f17446x;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C1021t1 c1021t2 = this.f17445w;
                            J j10 = c1021t2.f17552u;
                            if (j10 == null) {
                                X x11 = ((C1023u0) c1021t2.f16104r).f17584w;
                                C1023u0.m(x11);
                                x11.f17182w.d("(legacy) Failed to get user properties; not connected to service", null, this.f17441s, this.f17442t);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(j10.y(this.f17441s, this.f17442t, this.f17444v, this.f17443u));
                            } else {
                                atomicReference2.set(j10.l(null, this.f17441s, this.f17442t, this.f17444v));
                            }
                            c1021t2.B();
                            atomicReference = (AtomicReference) this.f17446x;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e12) {
                            X x12 = ((C1023u0) this.f17445w.f16104r).f17584w;
                            C1023u0.m(x12);
                            x12.f17182w.d("(legacy) Failed to get user properties; remote exception", null, this.f17441s, e12);
                            ((AtomicReference) this.f17446x).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f17446x;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f17446x).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public RunnableC0995k1(C1021t1 c1021t1, AtomicReference atomicReference, String str, String str2, X1 x9, boolean z10) {
        this.f17446x = atomicReference;
        this.f17441s = str;
        this.f17442t = str2;
        this.f17443u = x9;
        this.f17444v = z10;
        this.f17445w = c1021t1;
    }
}
