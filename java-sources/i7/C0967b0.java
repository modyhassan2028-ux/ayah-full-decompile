package i7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.AbstractC0823h2;
import com.google.android.gms.internal.measurement.C0790b;
import com.google.android.gms.internal.measurement.C0792b1;
import com.google.android.gms.internal.measurement.C0793b2;
import com.google.android.gms.internal.measurement.C0797c1;
import com.google.android.gms.internal.measurement.C0802d1;
import com.google.android.gms.internal.measurement.C0812f1;
import com.google.android.gms.internal.measurement.C0817g1;
import com.google.android.gms.internal.measurement.C0832j1;
import com.google.android.gms.internal.measurement.C0837k1;
import com.google.android.gms.internal.measurement.C0842l1;
import com.google.android.gms.internal.measurement.C0857o1;
import com.google.android.gms.internal.measurement.C0867q1;
import com.google.android.gms.internal.measurement.C0872r2;
import com.google.android.gms.internal.measurement.C0875s0;
import com.google.android.gms.internal.measurement.C0876s1;
import com.google.android.gms.internal.measurement.C0881t1;
import com.google.android.gms.internal.measurement.C0886u1;
import com.google.android.gms.internal.measurement.C0890v0;
import com.google.android.gms.internal.measurement.C0897w2;
import com.google.android.gms.internal.measurement.C0900x0;
import com.google.android.gms.internal.measurement.C0905y0;
import com.google.android.gms.internal.measurement.H2;
import com.google.android.gms.internal.measurement.InterfaceC0853n2;
import com.google.android.gms.internal.measurement.InterfaceC0858o2;
import com.google.android.gms.internal.measurement.R3;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: i7.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0967b0 extends L1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17265u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0967b0(Q1 q10, int i10) {
        super(q10);
        this.f17265u = i10;
    }

    public static final void A(int i10, StringBuilder sb) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    public static final void B(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String C(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append("Dynamic ");
        }
        if (z11) {
            sb.append("Sequence ");
        }
        if (z12) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable D(C0817g1 c0817g1) {
        if (c0817g1.r()) {
            return c0817g1.s();
        }
        if (c0817g1.t()) {
            return Long.valueOf(c0817g1.u());
        }
        if (c0817g1.x()) {
            return Double.valueOf(c0817g1.y());
        }
        if (c0817g1.A() > 0) {
            return d0((InterfaceC0858o2) c0817g1.z());
        }
        return null;
    }

    public static final void E(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                B(builder, str3, string, set);
            }
        }
    }

    public static final void F(StringBuilder sb, String str, C0857o1 c0857o1) {
        if (c0857o1 == null) {
            return;
        }
        A(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0857o1.s() != 0) {
            A(4, sb);
            sb.append("results: ");
            int i10 = 0;
            for (Long l10 : c0857o1.r()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (c0857o1.q() != 0) {
            A(4, sb);
            sb.append("status: ");
            int i12 = 0;
            for (Long l11 : c0857o1.p()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(l11);
                i12 = i13;
            }
            sb.append('\n');
        }
        if (c0857o1.u() != 0) {
            A(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (C0792b1 c0792b1 : c0857o1.t()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(c0792b1.p() ? Integer.valueOf(c0792b1.q()) : null);
                sb.append(":");
                sb.append(c0792b1.r() ? Long.valueOf(c0792b1.s()) : null);
                i14 = i15;
            }
            sb.append("}\n");
        }
        if (c0857o1.w() != 0) {
            A(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (C0867q1 c0867q1 : c0857o1.v()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb.append(", ");
                }
                sb.append(c0867q1.p() ? Integer.valueOf(c0867q1.q()) : null);
                sb.append(": [");
                Iterator it = c0867q1.r().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i18 = i19;
                }
                sb.append("]");
                i16 = i17;
            }
            sb.append("}\n");
        }
        A(3, sb);
        sb.append("}\n");
    }

    public static final void G(StringBuilder sb, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        A(i10 + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void H(StringBuilder sb, int i10, String str, C0890v0 c0890v0) {
        String str2;
        if (c0890v0 == null) {
            return;
        }
        A(i10, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0890v0.p()) {
            int iZ = c0890v0.z();
            if (iZ == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZ == 2) {
                str2 = "LESS_THAN";
            } else if (iZ != 3) {
                str2 = iZ != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            G(sb, i10, "comparison_type", str2);
        }
        if (c0890v0.q()) {
            G(sb, i10, "match_as_float", Boolean.valueOf(c0890v0.r()));
        }
        if (c0890v0.s()) {
            G(sb, i10, "comparison_value", c0890v0.t());
        }
        if (c0890v0.u()) {
            G(sb, i10, "min_comparison_value", c0890v0.v());
        }
        if (c0890v0.w()) {
            G(sb, i10, "max_comparison_value", c0890v0.x());
        }
        A(i10, sb);
        sb.append("}\n");
    }

    public static boolean U(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean V(InterfaceC0853n2 interfaceC0853n2, int i10) {
        if (i10 < ((C0897w2) interfaceC0853n2).f14501t * 64) {
            return ((1 << (i10 % 64)) & ((Long) ((C0897w2) interfaceC0853n2).get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList W(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static AbstractC0823h2 b0(AbstractC0823h2 abstractC0823h2, byte[] bArr) throws C0872r2 {
        C0793b2 c0793b2Y;
        C0793b2 c0793b2 = C0793b2.f14210a;
        if (c0793b2 == null) {
            synchronized (C0793b2.class) {
                try {
                    c0793b2Y = C0793b2.f14210a;
                    if (c0793b2Y == null) {
                        H2 h7 = H2.f14042c;
                        c0793b2Y = AbstractC0813f2.Y();
                        C0793b2.f14210a = c0793b2Y;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0793b2 = c0793b2Y;
        }
        if (c0793b2 != null) {
            abstractC0823h2.getClass();
            abstractC0823h2.g(bArr, bArr.length, c0793b2);
            return abstractC0823h2;
        }
        abstractC0823h2.getClass();
        int length = bArr.length;
        C0793b2 c0793b3 = C0793b2.f14210a;
        H2 h10 = H2.f14042c;
        abstractC0823h2.g(bArr, length, C0793b2.f14211b);
        return abstractC0823h2;
    }

    public static int c0(C0837k1 c0837k1, String str) {
        for (int i10 = 0; i10 < ((C0842l1) c0837k1.f14329s).V1(); i10++) {
            if (str.equals(((C0842l1) c0837k1.f14329s).W1(i10).r())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] d0(InterfaceC0858o2 interfaceC0858o2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC0858o2.iterator();
        while (it.hasNext()) {
            C0817g1 c0817g1 = (C0817g1) it.next();
            if (c0817g1 != null) {
                Bundle bundle = new Bundle();
                for (C0817g1 c0817g2 : c0817g1.z()) {
                    if (c0817g2.r()) {
                        bundle.putString(c0817g2.q(), c0817g2.s());
                    } else if (c0817g2.t()) {
                        bundle.putLong(c0817g2.q(), c0817g2.u());
                    } else if (c0817g2.x()) {
                        bundle.putDouble(c0817g2.q(), c0817g2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap e0(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(e0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(e0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(e0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static C1022u s(C0790b c0790b) {
        Object obj;
        Bundle bundleT = t(c0790b.f14205c, true);
        String string = (!bundleT.containsKey("_o") || (obj = bundleT.get("_o")) == null) ? "app" : obj.toString();
        String strG = I0.g(c0790b.f14203a, I0.f17003a, I0.f17005c);
        if (strG == null) {
            strG = c0790b.f14203a;
        }
        return new C1022u(strG, new C1019t(bundleT), string, c0790b.f14204b);
    }

    public static Bundle t(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(t((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void u(C0797c1 c0797c1, String str, Long l10) {
        List listH = c0797c1.h();
        int i10 = 0;
        while (true) {
            if (i10 >= listH.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((C0817g1) listH.get(i10)).q())) {
                break;
            } else {
                i10++;
            }
        }
        C0812f1 c0812f1B = C0817g1.B();
        c0812f1B.h(str);
        c0812f1B.j(l10.longValue());
        if (i10 < 0) {
            c0797c1.l(c0812f1B);
        } else {
            c0797c1.b();
            ((C0802d1) c0797c1.f14329s).A(i10, (C0817g1) c0812f1B.e());
        }
    }

    public static final Bundle v(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0817g1 c0817g1 = (C0817g1) it.next();
            String strQ = c0817g1.q();
            if (c0817g1.x()) {
                bundle.putDouble(strQ, c0817g1.y());
            } else if (c0817g1.v()) {
                bundle.putFloat(strQ, c0817g1.w());
            } else if (c0817g1.r()) {
                bundle.putString(strQ, c0817g1.s());
            } else if (c0817g1.t()) {
                bundle.putLong(strQ, c0817g1.u());
            }
        }
        return bundle;
    }

    public static final C0817g1 w(C0802d1 c0802d1, String str) {
        for (C0817g1 c0817g1 : c0802d1.p()) {
            if (c0817g1.q().equals(str)) {
                return c0817g1;
            }
        }
        return null;
    }

    public static final Serializable x(C0802d1 c0802d1, String str) {
        C0817g1 c0817g1W = w(c0802d1, str);
        if (c0817g1W == null) {
            return null;
        }
        return D(c0817g1W);
    }

    public boolean I() {
        p();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C1023u0) this.f16104r).f17579r.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void M(C0881t1 c0881t1, Object obj) {
        U6.y.f(obj);
        c0881t1.b();
        ((C0886u1) c0881t1.f14329s).E();
        c0881t1.b();
        ((C0886u1) c0881t1.f14329s).G();
        c0881t1.b();
        ((C0886u1) c0881t1.f14329s).I();
        if (obj instanceof String) {
            c0881t1.b();
            ((C0886u1) c0881t1.f14329s).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            c0881t1.b();
            ((C0886u1) c0881t1.f14329s).F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c0881t1.b();
            ((C0886u1) c0881t1.f14329s).H(dDoubleValue);
        } else {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void N(String str, M1 m10, C0832j1 c0832j1, Z z10) {
        String str2;
        String str3 = m10.f17032a;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        try {
            URL url = new URI(str3).toURL();
            this.f17001s.j0();
            byte[] bArrA = c0832j1.a();
            C1014r0 c1014r0 = c1023u0.f17585x;
            C1023u0.m(c1014r0);
            Map map = m10.f17033b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                c1014r0.A(new RunnableC0964a0(this, str2, url, bArrA, map, z10));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17182w.c(X.w(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void O(C0812f1 c0812f1, Object obj) {
        c0812f1.b();
        ((C0817g1) c0812f1.f14329s).E();
        c0812f1.b();
        ((C0817g1) c0812f1.f14329s).G();
        c0812f1.b();
        ((C0817g1) c0812f1.f14329s).I();
        c0812f1.b();
        ((C0817g1) c0812f1.f14329s).L();
        if (obj instanceof String) {
            c0812f1.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c0812f1.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c0812f1.b();
            ((C0817g1) c0812f1.f14329s).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C0812f1 c0812f1B = C0817g1.B();
                for (String str : bundle.keySet()) {
                    C0812f1 c0812f1B2 = C0817g1.B();
                    c0812f1B2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c0812f1B2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c0812f1B2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c0812f1B2.b();
                        ((C0817g1) c0812f1B2.f14329s).H(dDoubleValue2);
                    }
                    c0812f1B.b();
                    ((C0817g1) c0812f1B.f14329s).J((C0817g1) c0812f1B2.e());
                }
                if (((C0817g1) c0812f1B.f14329s).A() > 0) {
                    arrayList.add((C0817g1) c0812f1B.e());
                }
            }
        }
        c0812f1.b();
        ((C0817g1) c0812f1.f14329s).K(arrayList);
    }

    public F1 P(String str, C0837k1 c0837k1, C0797c1 c0797c1, String str2) {
        int iIndexOf;
        R3.a();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C0981g c0981g = c1023u0.f17582u;
        if (!c0981g.y(str, G.f16913Q0)) {
            return null;
        }
        c1023u0.f17564B.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = c0981g.u(str, G.f16980v0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        Q1 q10 = this.f17001s;
        N1 n6 = q10.f17082A;
        C1003n0 c1003n0 = q10.f17104r;
        C1003n0 c1003n1 = n6.f17001s.f17104r;
        Q1.U(c1003n1);
        String strB = c1003n1.B(str);
        Uri.Builder builder = new Uri.Builder();
        C0981g c0981g2 = ((C1023u0) n6.f16104r).f17582u;
        builder.scheme(c0981g2.u(str, G.f16966o0));
        if (TextUtils.isEmpty(strB)) {
            builder.authority(c0981g2.u(str, G.f16968p0));
        } else {
            String strU = c0981g2.u(str, G.f16968p0);
            StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strU).length());
            sb.append(strB);
            sb.append(".");
            sb.append(strU);
            builder.authority(sb.toString());
        }
        builder.path(c0981g2.u(str, G.f16970q0));
        B(builder, "gmp_app_id", ((C0842l1) c0837k1.f14329s).E(), setUnmodifiableSet);
        c0981g.t();
        B(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strY = ((C0842l1) c0837k1.f14329s).y();
        F f3 = G.f16916T0;
        if (c0981g.y(str, f3)) {
            Q1.U(c1003n0);
            if (c1003n0.H(str)) {
                strY = "";
            }
        }
        B(builder, "app_instance_id", strY, setUnmodifiableSet);
        B(builder, "rdid", ((C0842l1) c0837k1.f14329s).v(), setUnmodifiableSet);
        B(builder, "bundle_id", c0837k1.o(), setUnmodifiableSet);
        String strN = c0797c1.n();
        String strG = I0.g(strN, I0.f17005c, I0.f17003a);
        if (true != TextUtils.isEmpty(strG)) {
            strN = strG;
        }
        B(builder, "app_event_name", strN, setUnmodifiableSet);
        B(builder, "app_version", String.valueOf(((C0842l1) c0837k1.f14329s).K()), setUnmodifiableSet);
        String strI2 = ((C0842l1) c0837k1.f14329s).i2();
        if (c0981g.y(str, f3)) {
            Q1.U(c1003n0);
            if (c1003n0.G(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        B(builder, "os_version", strI2, setUnmodifiableSet);
        B(builder, "timestamp", String.valueOf(c0797c1.o()), setUnmodifiableSet);
        if (((C0842l1) c0837k1.f14329s).x()) {
            B(builder, "lat", "1", setUnmodifiableSet);
        }
        B(builder, "privacy_sandbox_version", String.valueOf(((C0842l1) c0837k1.f14329s).G0()), setUnmodifiableSet);
        B(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        B(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        B(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C0817g1> listH = c0797c1.h();
        Bundle bundle = new Bundle();
        for (C0817g1 c0817g1 : listH) {
            String strQ = c0817g1.q();
            if (c0817g1.x()) {
                bundle.putString(strQ, String.valueOf(c0817g1.y()));
            } else if (c0817g1.v()) {
                bundle.putString(strQ, String.valueOf(c0817g1.w()));
            } else if (c0817g1.r()) {
                bundle.putString(strQ, c0817g1.s());
            } else if (c0817g1.t()) {
                bundle.putString(strQ, String.valueOf(c0817g1.u()));
            }
        }
        E(builder, c0981g.u(str, G.f16978u0).split("\\|"), bundle, setUnmodifiableSet);
        List<C0886u1> listUnmodifiableList = DesugarCollections.unmodifiableList(((C0842l1) c0837k1.f14329s).U1());
        Bundle bundle2 = new Bundle();
        for (C0886u1 c0886u1 : listUnmodifiableList) {
            String strR = c0886u1.r();
            if (c0886u1.y()) {
                bundle2.putString(strR, String.valueOf(c0886u1.z()));
            } else if (c0886u1.w()) {
                bundle2.putString(strR, String.valueOf(c0886u1.x()));
            } else if (c0886u1.s()) {
                bundle2.putString(strR, c0886u1.t());
            } else if (c0886u1.u()) {
                bundle2.putString(strR, String.valueOf(c0886u1.v()));
            }
        }
        E(builder, c0981g.u(str, G.f16976t0).split("\\|"), bundle2, setUnmodifiableSet);
        B(builder, "dma", true != ((C0842l1) c0837k1.f14329s).D0() ? "0" : "1", setUnmodifiableSet);
        if (!((C0842l1) c0837k1.f14329s).F0().isEmpty()) {
            B(builder, "dma_cps", ((C0842l1) c0837k1.f14329s).F0(), setUnmodifiableSet);
        }
        if (((C0842l1) c0837k1.f14329s).L0()) {
            com.google.android.gms.internal.measurement.Q0 q0M0 = ((C0842l1) c0837k1.f14329s).M0();
            if (!q0M0.z().isEmpty()) {
                B(builder, "dl_gclid", q0M0.z(), setUnmodifiableSet);
            }
            if (!q0M0.B().isEmpty()) {
                B(builder, "dl_gbraid", q0M0.B(), setUnmodifiableSet);
            }
            if (!q0M0.D().isEmpty()) {
                B(builder, "dl_gs", q0M0.D(), setUnmodifiableSet);
            }
            if (q0M0.F() > 0) {
                B(builder, "dl_ss_ts", String.valueOf(q0M0.F()), setUnmodifiableSet);
            }
            if (!q0M0.H().isEmpty()) {
                B(builder, "mr_gclid", q0M0.H(), setUnmodifiableSet);
            }
            if (!q0M0.J().isEmpty()) {
                B(builder, "mr_gbraid", q0M0.J(), setUnmodifiableSet);
            }
            if (!q0M0.L().isEmpty()) {
                B(builder, "mr_gs", q0M0.L(), setUnmodifiableSet);
            }
            if (q0M0.N() > 0) {
                B(builder, "mr_click_ts", String.valueOf(q0M0.N()), setUnmodifiableSet);
            }
        }
        return new F1(jCurrentTimeMillis, 1, builder.build().toString());
    }

    public C0802d1 Q(C1011q c1011q) {
        C0797c1 c0797c1Z = C0802d1.z();
        long j = c1011q.f17510c;
        c0797c1Z.b();
        ((C0802d1) c0797c1Z.f14329s).H(j);
        C1019t c1019t = (C1019t) c1011q.g;
        Objects.requireNonNull(c1019t);
        Bundle bundle = c1019t.f17548r;
        for (String str : bundle.keySet()) {
            C0812f1 c0812f1B = C0817g1.B();
            c0812f1B.h(str);
            Object obj = bundle.get(str);
            U6.y.f(obj);
            O(c0812f1B, obj);
            c0797c1Z.l(c0812f1B);
        }
        String str2 = (String) c1011q.f17513f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            C0812f1 c0812f1B2 = C0817g1.B();
            c0812f1B2.h("_o");
            c0812f1B2.i(str2);
            c0797c1Z.k((C0817g1) c0812f1B2.e());
        }
        return (C0802d1) c0797c1Z.e();
    }

    public String R(C0832j1 c0832j1) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.T0 t0I0;
        StringBuilder sbC = android.support.v4.media.session.p.C("\nbatch {\n");
        if (c0832j1.u()) {
            G(sbC, 0, "upload_subdomain", c0832j1.v());
        }
        if (c0832j1.s()) {
            G(sbC, 0, "sgtm_join_id", c0832j1.t());
        }
        for (C0842l1 c0842l1 : c0832j1.p()) {
            if (c0842l1 != null) {
                A(1, sbC);
                sbC.append("bundle {\n");
                if (c0842l1.P()) {
                    G(sbC, 1, "protocol_version", Integer.valueOf(c0842l1.P0()));
                }
                C1023u0 c1023u0 = (C1023u0) this.f16104r;
                C0981g c0981g = c1023u0.f17582u;
                S s10 = c1023u0.f17563A;
                if (c0981g.y(c0842l1.p(), G.f16908N0) && c0842l1.v0()) {
                    G(sbC, 1, "session_stitching_token", c0842l1.w0());
                }
                G(sbC, 1, "platform", c0842l1.h2());
                if (c0842l1.r()) {
                    G(sbC, 1, "gmp_version", Long.valueOf(c0842l1.s()));
                }
                if (c0842l1.t()) {
                    G(sbC, 1, "uploading_gmp_version", Long.valueOf(c0842l1.u()));
                }
                if (c0842l1.r0()) {
                    G(sbC, 1, "dynamite_version", Long.valueOf(c0842l1.s0()));
                }
                if (c0842l1.L()) {
                    G(sbC, 1, "config_version", Long.valueOf(c0842l1.M()));
                }
                G(sbC, 1, "gmp_app_id", c0842l1.E());
                G(sbC, 1, "app_id", c0842l1.p());
                G(sbC, 1, "app_version", c0842l1.q());
                if (c0842l1.J()) {
                    G(sbC, 1, "app_version_major", Integer.valueOf(c0842l1.K()));
                }
                G(sbC, 1, "firebase_instance_id", c0842l1.I());
                if (c0842l1.z()) {
                    G(sbC, 1, "dev_cert_hash", Long.valueOf(c0842l1.A()));
                }
                G(sbC, 1, "app_store", c0842l1.n2());
                if (c0842l1.X1()) {
                    G(sbC, 1, "upload_timestamp_millis", Long.valueOf(c0842l1.Y1()));
                }
                if (c0842l1.Z1()) {
                    G(sbC, 1, "start_timestamp_millis", Long.valueOf(c0842l1.a2()));
                }
                if (c0842l1.b2()) {
                    G(sbC, 1, "end_timestamp_millis", Long.valueOf(c0842l1.c2()));
                }
                if (c0842l1.d2()) {
                    G(sbC, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c0842l1.e2()));
                }
                if (c0842l1.f2()) {
                    G(sbC, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c0842l1.g2()));
                }
                G(sbC, 1, "app_instance_id", c0842l1.y());
                G(sbC, 1, "resettable_device_id", c0842l1.v());
                G(sbC, 1, "ds_id", c0842l1.O());
                if (c0842l1.w()) {
                    G(sbC, 1, "limited_ad_tracking", Boolean.valueOf(c0842l1.x()));
                }
                G(sbC, 1, "os_version", c0842l1.i2());
                G(sbC, 1, "device_model", c0842l1.j2());
                G(sbC, 1, "user_default_language", c0842l1.k2());
                if (c0842l1.l2()) {
                    G(sbC, 1, "time_zone_offset_minutes", Integer.valueOf(c0842l1.m2()));
                }
                if (c0842l1.B()) {
                    G(sbC, 1, "bundle_sequential_index", Integer.valueOf(c0842l1.C()));
                }
                if (c0842l1.J0()) {
                    G(sbC, 1, "delivery_index", Integer.valueOf(c0842l1.K0()));
                }
                if (c0842l1.F()) {
                    G(sbC, 1, "service_upload", Boolean.valueOf(c0842l1.G()));
                }
                G(sbC, 1, "health_monitor", c0842l1.D());
                if (c0842l1.p0()) {
                    G(sbC, 1, "retry_counter", Integer.valueOf(c0842l1.q0()));
                }
                if (c0842l1.t0()) {
                    G(sbC, 1, "consent_signals", c0842l1.u0());
                }
                if (c0842l1.C0()) {
                    G(sbC, 1, "is_dma_region", Boolean.valueOf(c0842l1.D0()));
                }
                if (c0842l1.E0()) {
                    G(sbC, 1, "core_platform_services", c0842l1.F0());
                }
                if (c0842l1.A0()) {
                    G(sbC, 1, "consent_diagnostics", c0842l1.B0());
                }
                if (c0842l1.x0()) {
                    G(sbC, 1, "target_os_version", Long.valueOf(c0842l1.y0()));
                }
                R3.a();
                if (c1023u0.f17582u.y(c0842l1.p(), G.f16913Q0)) {
                    G(sbC, 1, "ad_services_version", Integer.valueOf(c0842l1.G0()));
                    if (c0842l1.H0() && (t0I0 = c0842l1.I0()) != null) {
                        A(2, sbC);
                        sbC.append("attribution_eligibility_status {\n");
                        G(sbC, 2, "eligible", Boolean.valueOf(t0I0.p()));
                        G(sbC, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(t0I0.q()));
                        G(sbC, 2, "pre_r", Boolean.valueOf(t0I0.r()));
                        G(sbC, 2, "r_extensions_too_old", Boolean.valueOf(t0I0.s()));
                        G(sbC, 2, "adservices_extension_too_old", Boolean.valueOf(t0I0.t()));
                        G(sbC, 2, "ad_storage_not_allowed", Boolean.valueOf(t0I0.u()));
                        G(sbC, 2, "measurement_manager_disabled", Boolean.valueOf(t0I0.v()));
                        A(2, sbC);
                        sbC.append("}\n");
                    }
                }
                if (c0842l1.L0()) {
                    com.google.android.gms.internal.measurement.Q0 q0M0 = c0842l1.M0();
                    A(2, sbC);
                    sbC.append("ad_campaign_info {\n");
                    if (q0M0.y()) {
                        G(sbC, 2, "deep_link_gclid", q0M0.z());
                    }
                    if (q0M0.A()) {
                        G(sbC, 2, "deep_link_gbraid", q0M0.B());
                    }
                    if (q0M0.C()) {
                        G(sbC, 2, "deep_link_gad_source", q0M0.D());
                    }
                    if (q0M0.E()) {
                        G(sbC, 2, "deep_link_session_millis", Long.valueOf(q0M0.F()));
                    }
                    if (q0M0.G()) {
                        G(sbC, 2, "market_referrer_gclid", q0M0.H());
                    }
                    if (q0M0.I()) {
                        G(sbC, 2, "market_referrer_gbraid", q0M0.J());
                    }
                    if (q0M0.K()) {
                        G(sbC, 2, "market_referrer_gad_source", q0M0.L());
                    }
                    if (q0M0.M()) {
                        G(sbC, 2, "market_referrer_click_millis", Long.valueOf(q0M0.N()));
                    }
                    A(2, sbC);
                    sbC.append("}\n");
                }
                if (c0842l1.Q()) {
                    G(sbC, 1, "batching_timestamp_millis", Long.valueOf(c0842l1.R()));
                }
                if (c0842l1.N0()) {
                    C0876s1 c0876s1O0 = c0842l1.O0();
                    A(2, sbC);
                    sbC.append("sgtm_diagnostics {\n");
                    int iT = c0876s1O0.t();
                    if (iT == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iT == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iT != 3) {
                        str2 = iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    G(sbC, 2, "upload_type", str2);
                    G(sbC, 2, "client_upload_eligibility", android.support.v4.media.session.p.F(c0876s1O0.p()));
                    int iU = c0876s1O0.u();
                    if (iU == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iU == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iU == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iU != 4) {
                        str3 = iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    G(sbC, 2, "service_upload_eligibility", str3);
                    A(2, sbC);
                    sbC.append("}\n");
                }
                if (c0842l1.S()) {
                    com.google.android.gms.internal.measurement.Z0 z0T = c0842l1.T();
                    A(2, sbC);
                    sbC.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.Y0 y10 : z0T.p()) {
                        A(3, sbC);
                        sbC.append("limited_data_modes {\n");
                        int iQ = y10.q();
                        if (iQ == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iQ == 2) {
                            str = "AD_STORAGE";
                        } else if (iQ != 3) {
                            str = iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        G(sbC, 3, "type", str);
                        int iR = y10.r();
                        G(sbC, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        A(3, sbC);
                        sbC.append("}\n");
                    }
                    A(2, sbC);
                    sbC.append("}\n");
                }
                InterfaceC0858o2<C0886u1> interfaceC0858o2U1 = c0842l1.U1();
                if (interfaceC0858o2U1 != null) {
                    for (C0886u1 c0886u1 : interfaceC0858o2U1) {
                        if (c0886u1 != null) {
                            A(2, sbC);
                            sbC.append("user_property {\n");
                            G(sbC, 2, "set_timestamp_millis", c0886u1.p() ? Long.valueOf(c0886u1.q()) : null);
                            G(sbC, 2, "name", s10.c(c0886u1.r()));
                            G(sbC, 2, "string_value", c0886u1.t());
                            G(sbC, 2, "int_value", c0886u1.u() ? Long.valueOf(c0886u1.v()) : null);
                            G(sbC, 2, "double_value", c0886u1.y() ? Double.valueOf(c0886u1.z()) : null);
                            A(2, sbC);
                            sbC.append("}\n");
                        }
                    }
                }
                InterfaceC0858o2<com.google.android.gms.internal.measurement.V0> interfaceC0858o2H = c0842l1.H();
                if (interfaceC0858o2H != null) {
                    for (com.google.android.gms.internal.measurement.V0 v10 : interfaceC0858o2H) {
                        if (v10 != null) {
                            A(2, sbC);
                            sbC.append("audience_membership {\n");
                            if (v10.p()) {
                                G(sbC, 2, "audience_id", Integer.valueOf(v10.q()));
                            }
                            if (v10.u()) {
                                G(sbC, 2, "new_audience", Boolean.valueOf(v10.v()));
                            }
                            F(sbC, "current_data", v10.r());
                            if (v10.s()) {
                                F(sbC, "previous_data", v10.t());
                            }
                            A(2, sbC);
                            sbC.append("}\n");
                        }
                    }
                }
                List<C0802d1> listP1 = c0842l1.P1();
                if (listP1 != null) {
                    for (C0802d1 c0802d1 : listP1) {
                        if (c0802d1 != null) {
                            A(2, sbC);
                            sbC.append("event {\n");
                            G(sbC, 2, "name", s10.a(c0802d1.s()));
                            if (c0802d1.t()) {
                                G(sbC, 2, "timestamp_millis", Long.valueOf(c0802d1.u()));
                            }
                            if (c0802d1.v()) {
                                G(sbC, 2, "previous_timestamp_millis", Long.valueOf(c0802d1.w()));
                            }
                            if (c0802d1.x()) {
                                G(sbC, 2, "count", Integer.valueOf(c0802d1.y()));
                            }
                            if (c0802d1.q() != 0) {
                                y(sbC, 2, (InterfaceC0858o2) c0802d1.p());
                            }
                            A(2, sbC);
                            sbC.append("}\n");
                        }
                    }
                }
                A(1, sbC);
                sbC.append("}\n");
            }
        }
        sbC.append("} // End-of-batch\n");
        return sbC.toString();
    }

    public String S(C0900x0 c0900x0) {
        StringBuilder sbC = android.support.v4.media.session.p.C("\nproperty_filter {\n");
        if (c0900x0.p()) {
            G(sbC, 0, "filter_id", Integer.valueOf(c0900x0.q()));
        }
        G(sbC, 0, "property_name", ((C1023u0) this.f16104r).f17563A.c(c0900x0.r()));
        String strC = C(c0900x0.t(), c0900x0.u(), c0900x0.w());
        if (!strC.isEmpty()) {
            G(sbC, 0, "filter_type", strC);
        }
        z(sbC, 1, c0900x0.s());
        sbC.append("}\n");
        return sbC.toString();
    }

    public Parcelable T(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (V6.b unused) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public List X(InterfaceC0853n2 interfaceC0853n2, List list) {
        int i10;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        ArrayList arrayList = new ArrayList(interfaceC0853n2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17185z.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17185z.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public boolean Y(long j, long j10) {
        if (j == 0 || j10 <= 0) {
            return true;
        }
        ((C1023u0) this.f16104r).f17564B.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j10;
    }

    public long Z(byte[] bArr) {
        U6.y.f(bArr);
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        V1 v10 = c1023u0.f17587z;
        C1023u0.k(v10);
        v10.o();
        MessageDigest messageDigestF = V1.F();
        if (messageDigestF != null) {
            return V1.G(messageDigestF.digest(bArr));
        }
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17182w.a("Failed to get MD5");
        return 0L;
    }

    public byte[] a0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(e10, "Failed to gzip content");
            throw e10;
        }
    }

    @Override // i7.L1
    public final void r() {
        int i10 = this.f17265u;
    }

    public void y(StringBuilder sb, int i10, InterfaceC0858o2 interfaceC0858o2) {
        if (interfaceC0858o2 == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = interfaceC0858o2.iterator();
        while (it.hasNext()) {
            C0817g1 c0817g1 = (C0817g1) it.next();
            if (c0817g1 != null) {
                A(i11, sb);
                sb.append("param {\n");
                G(sb, i11, "name", c0817g1.p() ? ((C1023u0) this.f16104r).f17563A.b(c0817g1.q()) : null);
                G(sb, i11, "string_value", c0817g1.r() ? c0817g1.s() : null);
                G(sb, i11, "int_value", c0817g1.t() ? Long.valueOf(c0817g1.u()) : null);
                G(sb, i11, "double_value", c0817g1.x() ? Double.valueOf(c0817g1.y()) : null);
                if (c0817g1.A() > 0) {
                    y(sb, i11, (InterfaceC0858o2) c0817g1.z());
                }
                A(i11, sb);
                sb.append("}\n");
            }
        }
    }

    public void z(StringBuilder sb, int i10, C0875s0 c0875s0) {
        String str;
        if (c0875s0 == null) {
            return;
        }
        A(i10, sb);
        sb.append("filter {\n");
        if (c0875s0.t()) {
            G(sb, i10, "complement", Boolean.valueOf(c0875s0.u()));
        }
        if (c0875s0.v()) {
            G(sb, i10, "param_name", ((C1023u0) this.f16104r).f17563A.b(c0875s0.w()));
        }
        if (c0875s0.p()) {
            int i11 = i10 + 1;
            C0905y0 c0905y0Q = c0875s0.q();
            if (c0905y0Q != null) {
                A(i11, sb);
                sb.append("string_filter {\n");
                if (c0905y0Q.p()) {
                    switch (c0905y0Q.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    G(sb, i11, "match_type", str);
                }
                if (c0905y0Q.q()) {
                    G(sb, i11, "expression", c0905y0Q.r());
                }
                if (c0905y0Q.s()) {
                    G(sb, i11, "case_sensitive", Boolean.valueOf(c0905y0Q.t()));
                }
                if (c0905y0Q.v() > 0) {
                    A(i10 + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : c0905y0Q.u()) {
                        A(i10 + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                A(i11, sb);
                sb.append("}\n");
            }
        }
        if (c0875s0.r()) {
            H(sb, i10 + 1, "number_filter", c0875s0.s());
        }
        A(i10, sb);
        sb.append("}\n");
    }

    private final void J() {
    }

    private final void K() {
    }

    private final void L() {
    }
}
