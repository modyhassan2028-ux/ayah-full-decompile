package i7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f16811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f16815w;

    public /* synthetic */ A0(B0 b5, X1 x9, Bundle bundle, L l10, String str) {
        this.f16810r = 0;
        this.f16813u = b5;
        this.f16812t = x9;
        this.f16814v = bundle;
        this.f16815w = l10;
        this.f16811s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        V1 v10;
        switch (this.f16810r) {
            case 0:
                B0 b5 = (B0) this.f16813u;
                X1 x9 = (X1) this.f16812t;
                Bundle bundle = (Bundle) this.f16814v;
                L l10 = (L) this.f16815w;
                String str = this.f16811s;
                Q1 q10 = b5.f16830f;
                q10.B();
                try {
                    l10.k0(q10.d0(bundle, x9));
                    return;
                } catch (RemoteException e10) {
                    q10.b().f17182w.c(str, e10, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f16813u;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C1021t1 c1021t1 = (C1021t1) this.f16815w;
                            J j = c1021t1.f17552u;
                            if (j == null) {
                                X x10 = ((C1023u0) c1021t1.f16104r).f17584w;
                                C1023u0.m(x10);
                                x10.f17182w.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f16811s, (String) this.f16814v);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(j.F(this.f16811s, (String) this.f16814v, (X1) this.f16812t));
                            } else {
                                atomicReference2.set(j.b0(null, this.f16811s, (String) this.f16814v));
                            }
                            c1021t1.B();
                            atomicReference = (AtomicReference) this.f16813u;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e11) {
                            X x11 = ((C1023u0) ((C1021t1) this.f16815w).f16104r).f17584w;
                            C1023u0.m(x11);
                            x11.f17182w.d("(legacy) Failed to get conditional properties; remote exception", null, this.f16811s, e11);
                            ((AtomicReference) this.f16813u).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f16813u;
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.f16813u).notify();
                        throw th;
                    }
                }
                break;
            case 2:
                com.google.android.gms.internal.measurement.N n6 = (com.google.android.gms.internal.measurement.N) this.f16814v;
                String str2 = (String) this.f16813u;
                String str3 = this.f16811s;
                C1021t1 c1021t2 = (C1021t1) this.f16815w;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        J j10 = c1021t2.f17552u;
                        if (j10 == null) {
                            C1023u0 c1023u0 = (C1023u0) c1021t2.f16104r;
                            X x12 = c1023u0.f17584w;
                            C1023u0.m(x12);
                            x12.f17182w.c(str3, str2, "Failed to get conditional properties; not connected to service");
                            v10 = c1023u0.f17587z;
                        } else {
                            arrayList = V1.f0(j10.F(str3, str2, (X1) this.f16812t));
                            c1021t2.B();
                            v10 = ((C1023u0) c1021t2.f16104r).f17587z;
                        }
                    } catch (RemoteException e12) {
                        X x13 = ((C1023u0) c1021t2.f16104r).f17584w;
                        C1023u0.m(x13);
                        x13.f17182w.d("Failed to get conditional properties; remote exception", str3, str2, e12);
                    }
                    C1023u0.k(v10);
                    v10.e0(n6, arrayList);
                    return;
                } catch (Throwable th2) {
                    V1 v11 = ((C1023u0) c1021t2.f16104r).f17587z;
                    C1023u0.k(v11);
                    v11.e0(n6, arrayList);
                    throw th2;
                }
            case 3:
                String str4 = this.f16811s;
                IBinder binder = ((Messenger) ((Z0.B) this.f16813u).f10875s).getBinder();
                X4.c cVar = (X4.c) this.f16815w;
                p143o2.f fVar = (p143o2.f) ((MediaBrowserServiceCompat) cVar.f9953r).f12704v.get(binder);
                if (fVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str4);
                    return;
                }
                HashMap map = fVar.f20276e;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) cVar.f9953r;
                IBinder iBinder = (IBinder) this.f16812t;
                Bundle bundle2 = (Bundle) this.f16814v;
                List<H1.b> arrayList2 = (List) map.get(str4);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                for (H1.b bVar : arrayList2) {
                    if (iBinder == bVar.f3241a) {
                        Bundle bundle3 = (Bundle) bVar.f3242b;
                        if (bundle2 == bundle3) {
                            return;
                        }
                        if (bundle2 == null) {
                            if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle3 == null) {
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == bundle3.getInt("android.media.browse.extra.PAGE", -1) && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                arrayList2.add(new H1.b(iBinder, bundle2));
                map.put(str4, arrayList2);
                if (bundle2 == null) {
                    mediaBrowserServiceCompat.b();
                } else {
                    mediaBrowserServiceCompat.b();
                }
                throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f20272a + " id=" + str4);
            default:
                IBinder binder2 = ((Messenger) ((Z0.B) this.f16813u).f10875s).getBinder();
                X4.c cVar2 = (X4.c) this.f16815w;
                if (((p143o2.f) ((MediaBrowserServiceCompat) cVar2.f9953r).f12704v.get(binder2)) != null) {
                    MediaBrowserServiceCompat mediaBrowserServiceCompat2 = (MediaBrowserServiceCompat) cVar2.f9953r;
                    p010b.d dVar = (p010b.d) this.f16812t;
                    mediaBrowserServiceCompat2.getClass();
                    dVar.b(-1, null);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f16811s + ", extras=" + ((Bundle) this.f16814v));
                return;
        }
    }

    public /* synthetic */ A0(Object obj, Object obj2, String str, Object obj3, Parcelable parcelable, int i10) {
        this.f16810r = i10;
        this.f16813u = obj2;
        this.f16811s = str;
        this.f16814v = obj3;
        this.f16812t = parcelable;
        this.f16815w = obj;
    }

    public A0(C1021t1 c1021t1, String str, String str2, X1 x9, com.google.android.gms.internal.measurement.N n6) {
        this.f16810r = 2;
        this.f16811s = str;
        this.f16813u = str2;
        this.f16812t = x9;
        this.f16814v = n6;
        this.f16815w = c1021t1;
    }

    public A0(X4.c cVar, Z0.B b5, String str, IBinder iBinder, Bundle bundle) {
        this.f16810r = 3;
        this.f16815w = cVar;
        this.f16813u = b5;
        this.f16811s = str;
        this.f16812t = iBinder;
        this.f16814v = bundle;
    }
}
