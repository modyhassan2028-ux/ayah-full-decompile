package com.google.android.gms.internal.measurement;

import A.C0029l;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import O.C0446n;
import O.EnumC0442j;
import U6.C0534l;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import u.C1360o;

/* JADX INFO: loaded from: classes.dex */
public final class J1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static J1 f14053e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14057d;

    public J1(int i10) {
        this.f14054a = i10;
        switch (i10) {
            case 5:
                this.f14056c = new Object();
                break;
            case 6:
                this.f14056c = new ReentrantLock();
                this.f14057d = new ArrayList();
                break;
            default:
                this.f14055b = false;
                this.f14056c = null;
                this.f14057d = null;
                break;
        }
    }

    public static J1 e(Context context) {
        J1 j10;
        synchronized (J1.class) {
            try {
                if (f14053e == null) {
                    f14053e = p181s2.t.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new J1(context) : new J1(0);
                }
                J1 j11 = f14053e;
                if (j11 != null && ((I1) j11.f14057d) != null && !j11.f14055b) {
                    try {
                        context.getContentResolver().registerContentObserver(A1.f13990a, true, (I1) f14053e.f14057d);
                        J1 j12 = f14053e;
                        j12.getClass();
                        j12.f14055b = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                j10 = f14053e;
                j10.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public static synchronized void i() {
        Context context;
        try {
            J1 j10 = f14053e;
            if (j10 != null && (context = (Context) j10.f14056c) != null && ((I1) j10.f14057d) != null && j10.f14055b) {
                context.getContentResolver().unregisterContentObserver((I1) f14053e.f14057d);
            }
            f14053e = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((M.k) this.f14057d).f5618s;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (D0.u.d(((D0.x) obj).f1148a, j)) {
                break;
            }
            i10++;
        }
        D0.x xVar = (D0.x) obj;
        if (xVar != null) {
            return xVar.f1154h;
        }
        return false;
    }

    public void b() {
        ((M9.e) this.f14056c).l(new CancellationException("onBack cancelled"), true);
        ((K9.A) this.f14057d).e(null);
    }

    public void c(S6.a aVar, p118l7.i iVar) {
        O8.c cVar = (O8.c) ((p248z6.c) this.f14057d).f24847s;
        cVar.getClass();
        W6.a aVar2 = (W6.a) ((W6.d) aVar).u();
        C0534l c0534l = (C0534l) cVar.f6511r;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar2.f14507h);
        int i10 = p038d7.b.f15700a;
        if (c0534l == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            c0534l.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar2.g.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            iVar.f19402a.j(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public EnumC0442j d() {
        E2.A a9 = (E2.A) this.f14057d;
        int i10 = a9.f1434b;
        int i11 = a9.f1435c;
        if (i10 < i11) {
            return EnumC0442j.f6377s;
        }
        return i10 > i11 ? EnumC0442j.f6376r : EnumC0442j.f6378t;
    }

    public void f(p118l7.n nVar) {
        synchronized (this.f14056c) {
            try {
                if (((ArrayDeque) this.f14057d) == null) {
                    this.f14057d = new ArrayDeque();
                }
                ((ArrayDeque) this.f14057d).add(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String g(String str) {
        Object objA;
        Context context = (Context) this.f14056c;
        if (context != null && (!D1.a() || D1.b(context))) {
            try {
                try {
                    C0879t c0879t = new C0879t(this, str);
                    try {
                        objA = c0879t.a();
                    } catch (SecurityException unused) {
                        long jClearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            objA = c0879t.a();
                        } finally {
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    }
                    return (String) objA;
                } catch (SecurityException e10) {
                    e = e10;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            } catch (IllegalStateException e11) {
                e = e11;
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            }
        }
        return null;
    }

    public void h(p118l7.o oVar) {
        p118l7.n nVar;
        synchronized (this.f14056c) {
            if (((ArrayDeque) this.f14057d) != null && !this.f14055b) {
                this.f14055b = true;
                while (true) {
                    synchronized (this.f14056c) {
                        try {
                            nVar = (p118l7.n) ((ArrayDeque) this.f14057d).poll();
                            if (nVar == null) {
                                this.f14055b = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    nVar.a(oVar);
                }
            }
        }
    }

    public String toString() {
        switch (this.f14054a) {
            case 2:
                return "SingleSelectionLayout(isStartHandle=" + this.f14055b + ", crossed=" + d() + ", info=\n\t" + ((E2.A) this.f14057d) + ')';
            default:
                return super.toString();
        }
    }

    public J1(p248z6.c cVar, R6.d[] dVarArr, boolean z10) {
        this.f14054a = 3;
        this.f14057d = cVar;
        this.f14056c = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f14055b = z11;
    }

    public J1(Context context) {
        this.f14054a = 0;
        this.f14055b = false;
        this.f14056c = context;
        this.f14057d = new I1(null);
    }

    public J1(B3.f fVar, F2.t tVar, F2.t tVar2, boolean z10, I4.e eVar) {
        this.f14054a = 7;
        this.f14055b = z10;
        this.f14056c = eVar;
        this.f14057d = new p239y6.a(fVar, tVar, tVar2);
    }

    public J1(C1360o c1360o, M.k kVar) {
        this.f14054a = 1;
        this.f14056c = c1360o;
        this.f14057d = kVar;
    }

    public J1(InterfaceC0402u interfaceC0402u, boolean z10, p241y9.e eVar, p032d.d dVar) {
        this.f14054a = 4;
        this.f14055b = z10;
        this.f14056c = p185s8.u0.a(-2, 4, M9.a.f5830r);
        this.f14057d = AbstractC0405x.x(interfaceC0402u, null, new C0029l(dVar, eVar, this, (p150o9.c) null, 8), 3);
    }

    public J1(boolean z10, C0446n c0446n, E2.A a9) {
        this.f14054a = 2;
        this.f14055b = z10;
        this.f14056c = c0446n;
        this.f14057d = a9;
    }
}
