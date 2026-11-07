package i7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class V1 extends C0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SecureRandom f17164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicLong f17165u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public A2.a f17167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f17168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f17169y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f17163z = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f17162A = {"_err"};

    public V1(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17169y = null;
        this.f17165u = new AtomicLong(0L);
    }

    public static void E(U1 u8, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        j0(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        u8.a(str, "_err", bundle);
    }

    public static MessageDigest F() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long G(byte[] bArr) {
        U6.y.f(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i10 = 0;
        long j = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j;
    }

    public static boolean H(Context context) {
        U6.y.f(context);
        return Build.VERSION.SDK_INT >= 24 ? I(context, "com.google.android.gms.measurement.AppMeasurementJobService") : I(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean I(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static int K() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static boolean M(String str) {
        String str2 = (String) G.f16974s0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean O(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean P(String str, String[] strArr) {
        U6.y.f(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] U(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList f0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0975e c0975e = (C0975e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0975e.f17325r);
            bundle.putString("origin", c0975e.f17326s);
            bundle.putLong("creation_timestamp", c0975e.f17328u);
            bundle.putString("name", c0975e.f17327t.f17132s);
            Object objB = c0975e.f17327t.b();
            U6.y.f(objB);
            I0.c(bundle, objB);
            bundle.putBoolean("active", c0975e.f17329v);
            String str = c0975e.f17330w;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C1022u c1022u = c0975e.f17331x;
            if (c1022u != null) {
                bundle.putString("timed_out_event_name", c1022u.f17558r);
                C1019t c1019t = c1022u.f17559s;
                if (c1019t != null) {
                    bundle.putBundle("timed_out_event_params", c1019t.e());
                }
            }
            bundle.putLong("trigger_timeout", c0975e.f17332y);
            C1022u c1022u2 = c0975e.f17333z;
            if (c1022u2 != null) {
                bundle.putString("triggered_event_name", c1022u2.f17558r);
                C1019t c1019t2 = c1022u2.f17559s;
                if (c1019t2 != null) {
                    bundle.putBundle("triggered_event_params", c1019t2.e());
                }
            }
            bundle.putLong("triggered_timestamp", c0975e.f17327t.f17133t);
            bundle.putLong("time_to_live", c0975e.f17323A);
            C1022u c1022u3 = c0975e.f17324B;
            if (c1022u3 != null) {
                bundle.putString("expired_event_name", c1022u3.f17558r);
                C1019t c1019t3 = c1022u3.f17559s;
                if (c1019t3 != null) {
                    bundle.putBundle("expired_event_params", c1019t3.e());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean g0(Context context) {
        ActivityInfo receiverInfo;
        U6.y.f(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void h0(C0983g1 c0983g1, Bundle bundle, boolean z10) {
        if (bundle != null && c0983g1 != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = c0983g1.f17367a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c0983g1.f17368b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c0983g1.f17369c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && c0983g1 == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean j0(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean o0(String str) {
        U6.y.c(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String t(int i10, String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public static boolean y0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final void A(Bundle bundle, int i10, String str, Object obj) {
        if (j0(i10, bundle)) {
            ((C1023u0) this.f16104r).getClass();
            bundle.putString("_ev", t(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void A0(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iW0;
        int iU;
        list = list;
        if (bundle == null) {
            return;
        }
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C0981g c0981g = c1023u0.f17582u;
        X x9 = c1023u0.f17584w;
        S s10 = c1023u0.f17563A;
        V1 v10 = ((C1023u0) c0981g.f16104r).f17587z;
        C1023u0.k(v10);
        int i10 = true != v10.V(231100000) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iW0 = !z10 ? w0(str3) : 0;
                if (iW0 == 0) {
                    iW0 = x0(str3);
                }
            } else {
                iW0 = 0;
            }
            if (iW0 != 0) {
                A(bundle, iW0, str3, iW0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (y0(bundle.get(str3))) {
                    C1023u0.m(x9);
                    x9.f17175B.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iU = 22;
                } else {
                    iU = u(str, str3, bundle.get(str3), bundle, list, z10, false);
                }
                if (iU != 0 && !"_ev".equals(str3)) {
                    A(bundle, iU, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (o0(str3) && !P(str3, I0.f17009h)) {
                    int i12 = i11 + 1;
                    if (!V(231100000)) {
                        C1023u0.m(x9);
                        x9.f17184y.c(s10.a(str), s10.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        j0(23, bundle);
                        bundle.remove(str3);
                    } else if (i12 > i10) {
                        if (!c1023u0.f17582u.y(null, G.f16944f1) || !z11) {
                            C1023u0.m(x9);
                            V v11 = x9.f17184y;
                            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i10);
                            sb.append(" item-scoped custom params");
                            v11.c(s10.a(str), s10.e(bundle), sb.toString());
                        }
                        j0(28, bundle);
                        bundle.remove(str3);
                        list = list;
                        i11 = i12;
                        z11 = true;
                    }
                    i11 = i12;
                }
            }
        }
    }

    public final int B(Object obj, String str) {
        return "_ldl".equals(str) ? z0(l0(str), obj, "user property referrer", str) : z0(l0(str), obj, "user property", str) ? 0 : 7;
    }

    public final Object C(Object obj, String str) {
        return "_ldl".equals(str) ? k0(l0(str), obj, true, false) : k0(l0(str), obj, false, false);
    }

    public final void D(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17175B.c(c1023u0.f17563A.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final A2.a J() {
        AbstractC0813f2 bVar;
        Object objE;
        if (this.f17167w == null) {
            Context context = ((C1023u0) this.f16104r).f17579r;
            p251z9.j.e(context, "context");
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i10 = Build.VERSION.SDK_INT;
            p235y2.b bVar2 = p235y2.b.f24626a;
            sb.append(i10 >= 33 ? bVar2.a() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i10 >= 33 ? bVar2.a() : 0) >= 5) {
                bVar = new B2.b(context, 1);
            } else {
                p235y2.a aVar = p235y2.a.f24625a;
                if (((i10 == 31 || i10 == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        objE = new A.M0(2, context).e(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i11 = Build.VERSION.SDK_INT;
                        sb2.append((i11 == 31 || i11 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        objE = null;
                    }
                    bVar = (AbstractC0813f2) objE;
                } else {
                    bVar = null;
                }
            }
            this.f17167w = bVar != null ? new A2.a(bVar) : null;
        }
        return this.f17167w;
    }

    public final long L() {
        long j;
        boolean zBooleanValue;
        Object e10;
        Integer num;
        o();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        O oR = c1023u0.r();
        X x9 = c1023u0.f17584w;
        if (!M(oR.u())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = K() < ((Integer) G.f16962m0.a(null)).intValue() ? 16L : 0L;
        }
        if (!N("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f17168x == null) {
                A2.a aVarJ = J();
                zBooleanValue = false;
                if (aVarJ != null) {
                    try {
                        num = (Integer) aVarJ.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e11) {
                                e10 = e11;
                                C1023u0.m(x9);
                                x9.f17185z.b(e10, "Measurement manager api exception");
                                this.f17168x = Boolean.FALSE;
                            } catch (CancellationException e12) {
                                e10 = e12;
                                C1023u0.m(x9);
                                x9.f17185z.b(e10, "Measurement manager api exception");
                                this.f17168x = Boolean.FALSE;
                            } catch (ExecutionException e13) {
                                e10 = e13;
                                C1023u0.m(x9);
                                x9.f17185z.b(e10, "Measurement manager api exception");
                                this.f17168x = Boolean.FALSE;
                            } catch (TimeoutException e14) {
                                e10 = e14;
                                C1023u0.m(x9);
                                x9.f17185z.b(e10, "Measurement manager api exception");
                                this.f17168x = Boolean.FALSE;
                            }
                        }
                        this.f17168x = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                        e10 = e15;
                        num = null;
                    }
                    C1023u0.m(x9);
                    x9.f17178E.b(num, "Measurement manager api status result");
                    zBooleanValue = this.f17168x.booleanValue();
                }
            } else {
                zBooleanValue = this.f17168x.booleanValue();
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final boolean N(String str) {
        o();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (((Context) Z6.b.a(c1023u0.f17579r).f5961a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17177D.b(str, "Permission not granted");
        return false;
    }

    public final boolean Q(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C1023u0) this.f16104r).f17582u.s("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle R(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objV = v(bundle.get(str), str);
                if (objV == null) {
                    C1023u0 c1023u0 = (C1023u0) this.f16104r;
                    X x9 = c1023u0.f17584w;
                    C1023u0.m(x9);
                    x9.f17175B.b(c1023u0.f17563A.b(str), "Param value can't be null");
                } else {
                    D(bundle2, str, objV);
                }
            }
        }
        return bundle2;
    }

    public final C1022u S(String str, Bundle bundle, String str2, long j, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (u0(str) != 0) {
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(c1023u0.f17563A.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleW = w(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            bundleW = R(bundleW);
        }
        U6.y.f(bundleW);
        return new C1022u(str, new C1019t(bundleW), str2, j);
    }

    public final boolean T(Context context, String str) {
        Signature[] signatureArr;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = Z6.b.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(e10, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean V(int i10) {
        Boolean bool = ((C1023u0) this.f16104r).p().f17553v;
        if (W() < i10 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int W() {
        if (this.f17169y == null) {
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            R6.f fVar = R6.f.f7246b;
            Context context = c1023u0.f17579r;
            fVar.getClass();
            AtomicBoolean atomicBoolean = R6.h.f7247a;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f17169y = Integer.valueOf(i10 / 1000);
        }
        return this.f17169y.intValue();
    }

    public final void X(Bundle bundle, long j) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(Long.valueOf(j10), "Params already contained engagement");
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j + j10);
    }

    public final void Y(String str, com.google.android.gms.internal.measurement.N n6) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning string value to wrapper");
        }
    }

    public final void Z(com.google.android.gms.internal.measurement.N n6, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning long value to wrapper");
        }
    }

    public final void a0(com.google.android.gms.internal.measurement.N n6, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning int value to wrapper");
        }
    }

    public final void b0(com.google.android.gms.internal.measurement.N n6, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning byte array to wrapper");
        }
    }

    public final void c0(com.google.android.gms.internal.measurement.N n6, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void d0(com.google.android.gms.internal.measurement.N n6, Bundle bundle) {
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void e0(com.google.android.gms.internal.measurement.N n6, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            n6.D(bundle);
        } catch (RemoteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error returning bundle list to wrapper");
        }
    }

    public final String i0() {
        byte[] bArr = new byte[16];
        n0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object k0(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return t(i10, obj.toString(), z10);
        }
        if (!z11) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleR = R((Bundle) parcelable);
                if (!bundleR.isEmpty()) {
                    arrayList.add(bundleR);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int l0(String str) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if ("_ldl".equals(str)) {
            c1023u0.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c1023u0.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            c1023u0.getClass();
            return 100;
        }
        c1023u0.getClass();
        return 36;
    }

    public final long m0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f17165u;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f17165u;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((C1023u0) this.f16104r).f17564B.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f17166v + 1;
            this.f17166v = i10;
            j = jNextLong + ((long) i10);
        }
        return j;
    }

    public final SecureRandom n0() {
        o();
        if (this.f17164t == null) {
            this.f17164t = new SecureRandom();
        }
        return this.f17164t;
    }

    @Override // i7.C0
    public final boolean p() {
        return true;
    }

    public final Bundle p0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            for (String str : uri.getQueryParameterNames()) {
                if (str.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final boolean q0(String str, String str2) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (str2 == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17184y.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17184y.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17184y.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                X x12 = c1023u0.f17584w;
                C1023u0.m(x12);
                x12.f17184y.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean r0(String str, String str2) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (str2 == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17184y.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17184y.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                X x11 = c1023u0.f17584w;
                C1023u0.m(x11);
                x11.f17184y.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                X x12 = c1023u0.f17584w;
                C1023u0.m(x12);
                x12.f17184y.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean s(String str) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (TextUtils.isEmpty(str)) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17184y.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        U6.y.f(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        X x10 = c1023u0.f17584w;
        C1023u0.m(x10);
        x10.f17184y.b(X.w(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean s0(String str, String[] strArr, String[] strArr2, String str2) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (str2 == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17184y.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(f17163z[i10])) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17184y.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !P(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && P(str2, strArr2)) {
            return true;
        }
        X x11 = c1023u0.f17584w;
        C1023u0.m(x11);
        x11.f17184y.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean t0(int i10, String str, String str2) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (str2 == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17184y.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        X x10 = c1023u0.f17584w;
        C1023u0.m(x10);
        x10.f17184y.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int u(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int size;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        int i11 = 0;
        if (!y0(obj)) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!P(str2, I0.g)) {
                return 20;
            }
            C1021t1 c1021t1P = c1023u0.p();
            c1021t1P.o();
            c1021t1P.p();
            if (c1021t1P.v()) {
                V1 v10 = ((C1023u0) c1021t1P.f16104r).f17587z;
                C1023u0.k(v10);
                if (v10.W() < 200900) {
                    return 25;
                }
            }
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17175B.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i10 = 17;
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i10 = 0;
            }
        }
        int iMax = 500;
        if (O(str) || O(str2)) {
            c1023u0.f17582u.getClass();
            iMax = Math.max(500, 256);
        } else {
            c1023u0.f17582u.getClass();
        }
        if (!z0(iMax, obj, "param", str2)) {
            if (!z11) {
                return 4;
            }
            if (obj instanceof Bundle) {
                A0(str, str2, (Bundle) obj, list, z10);
                return i10;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i11 < length) {
                    Parcelable parcelable = parcelableArr2[i11];
                    if (!(parcelable instanceof Bundle)) {
                        X x10 = c1023u0.f17584w;
                        C1023u0.m(x10);
                        x10.f17175B.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    A0(str, str2, (Bundle) parcelable, list, z10);
                    i11++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    if (!(obj2 instanceof Bundle)) {
                        X x11 = c1023u0.f17584w;
                        C1023u0.m(x11);
                        x11.f17175B.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    A0(str, str2, (Bundle) obj2, list, z10);
                    i11++;
                }
            }
        }
        return i10;
    }

    public final int u0(String str) {
        if (!r0("event", str)) {
            return 2;
        }
        if (!s0("event", I0.f17003a, I0.f17004b, str)) {
            return 13;
        }
        ((C1023u0) this.f16104r).getClass();
        return !t0(40, "event", str) ? 2 : 0;
    }

    public final Object v(Object obj, String str) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        int iMax = 500;
        if ("_ev".equals(str)) {
            c1023u0.f17582u.getClass();
            return k0(Math.max(500, 256), obj, true, true);
        }
        if (O(str)) {
            c1023u0.f17582u.getClass();
            iMax = Math.max(500, 256);
        } else {
            c1023u0.f17582u.getClass();
        }
        return k0(iMax, obj, false, true);
    }

    public final int v0(String str) {
        if (!r0("user property", str)) {
            return 6;
        }
        if (!s0("user property", I0.f17010i, null, str)) {
            return 15;
        }
        ((C1023u0) this.f16104r).getClass();
        return !t0(24, "user property", str) ? 6 : 0;
    }

    public final Bundle w(String str, Bundle bundle, List list, boolean z10) {
        int iW0;
        list = list;
        boolean zP = P(str, I0.f17006d);
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C0981g c0981g = c1023u0.f17582u;
        S s10 = c1023u0.f17563A;
        V1 v10 = ((C1023u0) c0981g.f16104r).f17587z;
        C1023u0.k(v10);
        int i10 = v10.V(201500000) ? 100 : 25;
        int i11 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iW0 = !z10 ? w0(str3) : 0;
                if (iW0 == 0) {
                    iW0 = x0(str3);
                }
            } else {
                iW0 = 0;
            }
            if (iW0 != 0) {
                A(bundle2, iW0, str3, iW0 == 3 ? str3 : str2);
                bundle2.remove(str3);
            } else {
                int iU = u(str, str3, bundle.get(str3), bundle2, list, z10, zP);
                if (iU == 17) {
                    A(bundle2, 17, str3, Boolean.FALSE);
                } else if (iU != 0 && !"_ev".equals(str3)) {
                    A(bundle2, iU, iU == 21 ? str : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (o0(str3)) {
                    i11++;
                    if (i11 > i10) {
                        if (!c1023u0.f17582u.y(str2, G.f16944f1) || !z11) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i10);
                            sb.append(" params");
                            String string = sb.toString();
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17184y.c(s10.a(str), s10.e(bundle), string);
                        }
                        j0(5, bundle2);
                        bundle2.remove(str3);
                        z11 = true;
                        str2 = str2;
                    }
                }
            }
            str2 = str2;
            str2 = str2;
        }
        return bundle2;
    }

    public final int w0(String str) {
        if (!q0("event param", str)) {
            return 3;
        }
        if (!s0("event param", null, null, str)) {
            return 14;
        }
        ((C1023u0) this.f16104r).getClass();
        return !t0(40, "event param", str) ? 3 : 0;
    }

    public final void x(Y y10, int i10) {
        Bundle bundle = (Bundle) y10.f17217e;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (o0(str) && (i11 = i11 + 1) > i10) {
                C1023u0 c1023u0 = (C1023u0) this.f16104r;
                C0981g c0981g = c1023u0.f17582u;
                S s10 = c1023u0.f17563A;
                if (!c0981g.y(null, G.f16944f1) || !z10) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i10);
                    sb.append(" params");
                    String string = sb.toString();
                    X x9 = c1023u0.f17584w;
                    C1023u0.m(x9);
                    x9.f17184y.c(s10.a((String) y10.f17215c), s10.e(bundle), string);
                    j0(5, bundle);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final int x0(String str) {
        if (!r0("event param", str)) {
            return 3;
        }
        if (!s0("event param", null, null, str)) {
            return 14;
        }
        ((C1023u0) this.f16104r).getClass();
        return !t0(40, "event param", str) ? 3 : 0;
    }

    public final void y(Parcelable[] parcelableArr, int i10) {
        U6.y.f(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (o0(str) && !P(str, I0.f17009h) && (i11 = i11 + 1) > i10) {
                    C1023u0 c1023u0 = (C1023u0) this.f16104r;
                    C0981g c0981g = c1023u0.f17582u;
                    S s10 = c1023u0.f17563A;
                    if (!c0981g.y(null, G.f16944f1) || !z10) {
                        X x9 = c1023u0.f17584w;
                        C1023u0.m(x9);
                        V v10 = x9.f17184y;
                        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i10);
                        sb.append(" item-scoped custom parameters");
                        v10.c(s10.b(str), s10.e(bundle), sb.toString());
                    }
                    j0(28, bundle);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final void z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                V1 v10 = ((C1023u0) this.f16104r).f17587z;
                C1023u0.k(v10);
                v10.D(bundle, str, bundle2.get(str));
            }
        }
    }

    public final boolean z0(int i10, Object obj, String str, String str2) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17175B.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }
}
