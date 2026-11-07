package i7;

import I1.RunnableC0250e0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractBinderC0904y;
import com.google.android.gms.internal.measurement.AbstractC0909z;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractBinderC0904y implements J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q1 f16830f;
    public Boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16831h;

    public B0(Q1 q10) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        U6.y.f(q10);
        this.f16830f = q10;
        this.f16831h = null;
    }

    @Override // i7.J
    public final void A0(X1 x9) {
        g(x9);
        F0(new RunnableC1029w0(this, x9, 0));
    }

    public final void E0(String str, boolean z10) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        Q1 q10 = this.f16830f;
        if (zIsEmpty) {
            q10.b().f17182w.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.g == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f16831h) && !Y6.b.b(q10.f17084C.f17579r, Binder.getCallingUid()) && !R6.i.a(q10.f17084C.f17579r).b(Binder.getCallingUid())) {
                        z11 = false;
                    }
                    this.g = Boolean.valueOf(z11);
                }
                if (this.g.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                q10.b().f17182w.b(X.w(str), "Measurement Service called with invalid calling package. appId");
                throw e10;
            }
        }
        if (this.f16831h == null) {
            Context context = q10.f17084C.f17579r;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = R6.h.f7247a;
            if (Y6.b.e(callingUid, context, str)) {
                this.f16831h = str;
            }
        }
        if (str.equals(this.f16831h)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // i7.J
    public final List F(String str, String str2, X1 x9) {
        g(x9);
        String str3 = x9.f17204r;
        U6.y.f(str3);
        Q1 q10 = this.f16830f;
        try {
            return (List) q10.c().v(new CallableC1035y0(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            q10.b().f17182w.b(e10, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    public final void F0(Runnable runnable) {
        Q1 q10 = this.f16830f;
        if (q10.c().u()) {
            runnable.run();
        } else {
            q10.c().x(runnable);
        }
    }

    @Override // i7.J
    public final void L(X1 x9, C0972d c0972d) {
        g(x9);
        F0(new F1.o((Object) this, (Object) x9, (Parcelable) c0972d, 5));
    }

    @Override // i7.J
    public final void N(long j, String str, String str2, String str3) {
        F0(new RunnableC1032x0(this, str2, str3, str, j, 0));
    }

    @Override // i7.J
    public final void O(X1 x9) {
        U6.y.c(x9.f17204r);
        U6.y.f(x9.f17196J);
        c(new RunnableC1029w0(this, x9, 5));
    }

    @Override // i7.J
    public final void R(X1 x9) {
        g(x9);
        F0(new RunnableC1029w0(this, x9, 2));
    }

    @Override // i7.J
    public final String T(X1 x9) {
        g(x9);
        Q1 q10 = this.f16830f;
        try {
            return (String) q10.c().v(new CallableC1026v0(q10, x9)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            q10.b().f17182w.c(X.w(x9.f17204r), e10, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // i7.J
    public final void Z(S1 s10, X1 x9) {
        U6.y.f(s10);
        g(x9);
        F0(new F1.o((Object) this, (Object) s10, (Object) x9, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0904y
    public final boolean a(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        List list;
        Q1 q10 = this.f16830f;
        ArrayList arrayList = null;
        L k7 = null;
        N m10 = null;
        switch (i10) {
            case 1:
                C1022u c1022u = (C1022u) AbstractC0909z.a(parcel, C1022u.CREATOR);
                X1 x9 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                j0(c1022u, x9);
                parcel2.writeNoException();
                return true;
            case 2:
                S1 s10 = (S1) AbstractC0909z.a(parcel, S1.CREATOR);
                X1 x10 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                Z(s10, x10);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                X1 x11 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                A0(x11);
                parcel2.writeNoException();
                return true;
            case 5:
                C1022u c1022u2 = (C1022u) AbstractC0909z.a(parcel, C1022u.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC0909z.d(parcel);
                U6.y.f(c1022u2);
                U6.y.c(string);
                E0(string, true);
                F0(new F1.o(this, c1022u2, string, 3));
                parcel2.writeNoException();
                return true;
            case 6:
                X1 x12 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                R(x12);
                parcel2.writeNoException();
                return true;
            case 7:
                X1 x13 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                AbstractC0909z.d(parcel);
                g(x13);
                String str = x13.f17204r;
                U6.y.f(str);
                try {
                    List<T1> list2 = (List) q10.c().v(new CallableC1026v0(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (T1 t2 : list2) {
                        if (objArr != false || !V1.O(t2.f17145c)) {
                            arrayList2.add(new S1(t2));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e10) {
                    e = e10;
                    q10.b().f17182w.c(X.w(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e11) {
                    e = e11;
                    q10.b().f17182w.c(X.w(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C1022u c1022u3 = (C1022u) AbstractC0909z.a(parcel, C1022u.CREATOR);
                String string2 = parcel.readString();
                AbstractC0909z.d(parcel);
                byte[] bArrX = x(c1022u3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrX);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC0909z.d(parcel);
                N(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                X1 x14 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                String strT = T(x14);
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 12:
                C0975e c0975e = (C0975e) AbstractC0909z.a(parcel, C0975e.CREATOR);
                X1 x15 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                t0(c0975e, x15);
                parcel2.writeNoException();
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                C0975e c0975e2 = (C0975e) AbstractC0909z.a(parcel, C0975e.CREATOR);
                AbstractC0909z.d(parcel);
                U6.y.f(c0975e2);
                U6.y.f(c0975e2.f17327t);
                U6.y.c(c0975e2.f17325r);
                E0(c0975e2.f17325r, true);
                F0(new p039d8.a(11, this, new C0975e(c0975e2), false));
                parcel2.writeNoException();
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC0909z.f14514a;
                z10 = parcel.readInt() != 0;
                X1 x16 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                List listY = y(string6, string7, z10, x16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0909z.f14514a;
                z10 = parcel.readInt() != 0;
                AbstractC0909z.d(parcel);
                List listL = l(string8, string9, string10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                X1 x17 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                List listF = F(string11, string12, x17);
                parcel2.writeNoException();
                parcel2.writeTypedList(listF);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC0909z.d(parcel);
                List listB0 = b0(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listB0);
                return true;
            case 18:
                X1 x18 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                o(x18);
                parcel2.writeNoException();
                return true;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                Bundle bundle = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                X1 x19 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                r0(bundle, x19);
                parcel2.writeNoException();
                return true;
            case 20:
                X1 x20 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                c0(x20);
                parcel2.writeNoException();
                return true;
            case 21:
                X1 x21 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                C0987i c0987iM0 = m0(x21);
                parcel2.writeNoException();
                if (c0987iM0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c0987iM0.writeToParcel(parcel2, 1);
                return true;
            case 24:
                X1 x22 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                AbstractC0909z.d(parcel);
                g(x22);
                String str2 = x22.f17204r;
                U6.y.f(str2);
                if (!q10.e0().y(null, G.f16927Z0)) {
                    try {
                        list = (List) q10.c().v(new CallableC1038z0(this, x22, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e12) {
                        q10.b().f17182w.c(X.w(str2), e12, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) q10.c().w(new CallableC1038z0(this, x22, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e13) {
                        q10.b().f17182w.c(X.w(str2), e13, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                X1 x23 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                t(x23);
                parcel2.writeNoException();
                return true;
            case 26:
                X1 x24 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                O(x24);
                parcel2.writeNoException();
                return true;
            case 27:
                X1 x25 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                AbstractC0909z.d(parcel);
                i(x25);
                parcel2.writeNoException();
                return true;
            case 29:
                X1 x26 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                J1 j10 = (J1) AbstractC0909z.a(parcel, J1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    m10 = iInterfaceQueryLocalInterface instanceof N ? (N) iInterfaceQueryLocalInterface : new M(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                AbstractC0909z.d(parcel);
                j(x26, j10, m10);
                parcel2.writeNoException();
                return true;
            case 30:
                X1 x27 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                C0972d c0972d = (C0972d) AbstractC0909z.a(parcel, C0972d.CREATOR);
                AbstractC0909z.d(parcel);
                L(x27, c0972d);
                parcel2.writeNoException();
                return true;
            case 31:
                X1 x28 = (X1) AbstractC0909z.a(parcel, X1.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    k7 = iInterfaceQueryLocalInterface2 instanceof L ? (L) iInterfaceQueryLocalInterface2 : new K(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                AbstractC0909z.d(parcel);
                u(x28, bundle3, k7);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // i7.J
    public final List b0(String str, String str2, String str3) {
        E0(str, true);
        Q1 q10 = this.f16830f;
        try {
            return (List) q10.c().v(new CallableC1035y0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            q10.b().f17182w.b(e10, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    public final void c(Runnable runnable) {
        Q1 q10 = this.f16830f;
        if (q10.c().u()) {
            runnable.run();
        } else {
            q10.c().z(runnable);
        }
    }

    @Override // i7.J
    public final void c0(X1 x9) {
        U6.y.c(x9.f17204r);
        U6.y.f(x9.f17196J);
        c(new RunnableC1029w0(this, x9, 4));
    }

    public final void g(X1 x9) {
        U6.y.f(x9);
        String str = x9.f17204r;
        U6.y.c(str);
        E0(str, false);
        this.f16830f.k0().s(x9.f17205s);
    }

    @Override // i7.J
    public final void i(X1 x9) {
        g(x9);
        F0(new RunnableC1029w0(this, x9, 1));
    }

    @Override // i7.J
    public final void j(X1 x9, J1 j10, N n6) {
        g(x9);
        String str = x9.f17204r;
        U6.y.f(str);
        this.f16830f.c().x(new RunnableC0250e0(this, str, j10, n6, 1));
    }

    @Override // i7.J
    public final void j0(C1022u c1022u, X1 x9) {
        U6.y.f(c1022u);
        g(x9);
        F0(new F1.o((Object) this, (Object) c1022u, (Object) x9, 2));
    }

    @Override // i7.J
    public final List l(String str, String str2, String str3, boolean z10) {
        E0(str, true);
        Q1 q10 = this.f16830f;
        try {
            List<T1> list = (List) q10.c().v(new CallableC1035y0(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (T1 t2 : list) {
                if (z10 || !V1.O(t2.f17145c)) {
                    arrayList.add(new S1(t2));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            q10.b().f17182w.c(X.w(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            q10.b().f17182w.c(X.w(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // i7.J
    public final C0987i m0(X1 x9) {
        g(x9);
        String str = x9.f17204r;
        U6.y.c(str);
        Q1 q10 = this.f16830f;
        try {
            return (C0987i) q10.c().w(new CallableC1026v0(this, x9, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            q10.b().f17182w.c(X.w(str), e10, "Failed to get consent. appId");
            return new C0987i(null);
        }
    }

    @Override // i7.J
    public final void o(X1 x9) {
        String str = x9.f17204r;
        U6.y.c(str);
        E0(str, false);
        F0(new RunnableC1029w0(this, x9, 3));
    }

    @Override // i7.J
    public final void r0(Bundle bundle, X1 x9) {
        g(x9);
        String str = x9.f17204r;
        U6.y.f(str);
        F0(new RunnableC0250e0(this, bundle, str, x9, 3));
    }

    @Override // i7.J
    public final void t(X1 x9) {
        U6.y.c(x9.f17204r);
        U6.y.f(x9.f17196J);
        c(new RunnableC1029w0(this, x9, 6));
    }

    @Override // i7.J
    public final void t0(C0975e c0975e, X1 x9) {
        U6.y.f(c0975e);
        U6.y.f(c0975e.f17327t);
        g(x9);
        C0975e c0975e2 = new C0975e(c0975e);
        c0975e2.f17325r = x9.f17204r;
        F0(new F1.o((Object) this, (Object) c0975e2, (Object) x9, 1));
    }

    @Override // i7.J
    public final void u(X1 x9, Bundle bundle, L l10) {
        g(x9);
        String str = x9.f17204r;
        U6.y.f(str);
        this.f16830f.c().x(new A0(this, x9, bundle, l10, str));
    }

    @Override // i7.J
    public final byte[] x(C1022u c1022u, String str) {
        U6.y.c(str);
        U6.y.f(c1022u);
        E0(str, true);
        Q1 q10 = this.f16830f;
        V v10 = q10.b().f17177D;
        C1023u0 c1023u0 = q10.f17084C;
        S s10 = c1023u0.f17563A;
        String str2 = c1022u.f17558r;
        v10.b(s10.a(str2), "Log and bundle. event");
        q10.e().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) q10.c().w(new CallableC1000m0(this, c1022u, str)).get();
            if (bArr == null) {
                q10.b().f17182w.b(X.w(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            q10.e().getClass();
            q10.b().f17177D.d("Log and bundle processed. event, size, time_ms", c1023u0.f17563A.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            q10.b().f17182w.d("Failed to log and bundle. appId, event, error", X.w(str), c1023u0.f17563A.a(str2), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            q10.b().f17182w.d("Failed to log and bundle. appId, event, error", X.w(str), c1023u0.f17563A.a(str2), e);
            return null;
        }
    }

    @Override // i7.J
    public final List y(String str, String str2, boolean z10, X1 x9) {
        g(x9);
        String str3 = x9.f17204r;
        U6.y.f(str3);
        Q1 q10 = this.f16830f;
        try {
            List<T1> list = (List) q10.c().v(new CallableC1035y0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (T1 t2 : list) {
                if (z10 || !V1.O(t2.f17145c)) {
                    arrayList.add(new S1(t2));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            q10.b().f17182w.c(X.w(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            q10.b().f17182w.c(X.w(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }
}
