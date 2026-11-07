package i7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0851n0;
import com.google.android.gms.internal.measurement.C0856o0;
import com.google.android.gms.internal.measurement.C0861p0;
import com.google.android.gms.internal.measurement.C0866q0;
import com.google.android.gms.internal.measurement.C0870r0;
import com.google.android.gms.internal.measurement.C0872r2;
import com.google.android.gms.internal.measurement.C0875s0;
import com.google.android.gms.internal.measurement.C0895w0;
import com.google.android.gms.internal.measurement.C0896w1;
import com.google.android.gms.internal.measurement.C0900x0;
import com.google.android.gms.internal.measurement.C0901x1;
import com.google.android.gms.internal.measurement.C0902x2;
import com.google.android.gms.internal.measurement.C0910z0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import u.C1350e;

/* JADX INFO: renamed from: i7.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1003n0 extends L1 implements InterfaceC0978f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0994k0 f17473A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Z0.B f17474B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1350e f17475C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1350e f17476D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1350e f17477E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1350e f17478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1350e f17479v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1350e f17480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1350e f17481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1350e f17482y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1350e f17483z;

    public C1003n0(Q1 q10) {
        super(q10);
        this.f17478u = new C1350e(0);
        this.f17479v = new C1350e(0);
        this.f17480w = new C1350e(0);
        this.f17481x = new C1350e(0);
        this.f17482y = new C1350e(0);
        this.f17475C = new C1350e(0);
        this.f17476D = new C1350e(0);
        this.f17477E = new C1350e(0);
        this.f17483z = new C1350e(0);
        this.f17473A = new C0994k0(this);
        this.f17474B = new Z0.B(12, this);
    }

    public static final C1350e y(com.google.android.gms.internal.measurement.H0 h7) {
        C1350e c1350e = new C1350e(0);
        for (com.google.android.gms.internal.measurement.L0 l10 : h7.t()) {
            c1350e.put(l10.p(), l10.q());
        }
        return c1350e;
    }

    public static final G0 z(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return G0.f16989s;
        }
        if (i11 == 2) {
            return G0.f16990t;
        }
        if (i11 == 3) {
            return G0.f16991u;
        }
        if (i11 != 4) {
            return null;
        }
        return G0.f16992v;
    }

    public final com.google.android.gms.internal.measurement.H0 A(String str) {
        p();
        o();
        U6.y.c(str);
        u(str);
        return (com.google.android.gms.internal.measurement.H0) this.f17482y.get(str);
    }

    public final String B(String str) {
        o();
        u(str);
        return (String) this.f17475C.get(str);
    }

    public final void C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        com.google.android.gms.internal.measurement.G0 g10;
        byte[] bArrA;
        int i10;
        int i11;
        boolean z10;
        p();
        o();
        U6.y.c(str);
        com.google.android.gms.internal.measurement.G0 g11 = (com.google.android.gms.internal.measurement.G0) x(str, bArr).i();
        v(str, g11);
        w(str, (com.google.android.gms.internal.measurement.H0) g11.e());
        com.google.android.gms.internal.measurement.H0 h7 = (com.google.android.gms.internal.measurement.H0) g11.e();
        C1350e c1350e = this.f17482y;
        c1350e.put(str, h7);
        this.f17475C.put(str, ((com.google.android.gms.internal.measurement.H0) g11.f14329s).A());
        this.f17476D.put(str, str2);
        this.f17477E.put(str, str3);
        this.f17478u.put(str, y((com.google.android.gms.internal.measurement.H0) g11.e()));
        Q1 q10 = this.f17001s;
        C0999m c0999m = q10.f17106t;
        Q1.U(c0999m);
        ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.H0) g11.f14329s).w()));
        C1023u0 c1023u0 = (C1023u0) c0999m.f16104r;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            C0851n0 c0851n0 = (C0851n0) ((C0856o0) arrayList.get(i12)).i();
            C1350e c1350e2 = c1350e;
            if (((C0856o0) c0851n0.f14329s).v() != 0) {
                int i13 = 0;
                while (i13 < ((C0856o0) c0851n0.f14329s).v()) {
                    C0861p0 c0861p0 = (C0861p0) ((C0856o0) c0851n0.f14329s).w(i13).i();
                    C0861p0 c0861p1 = (C0861p0) c0861p0.clone();
                    Q1 q11 = q10;
                    com.google.android.gms.internal.measurement.G0 g12 = g11;
                    String strG = I0.g(((C0866q0) c0861p0.f14329s).r(), I0.f17003a, I0.f17005c);
                    if (strG != null) {
                        c0861p1.b();
                        ((C0866q0) c0861p1.f14329s).C(strG);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i14 = 0;
                    while (i14 < ((C0866q0) c0861p0.f14329s).t()) {
                        C0875s0 c0875s0U = ((C0866q0) c0861p0.f14329s).u(i14);
                        boolean z11 = z10;
                        C0861p0 c0861p2 = c0861p0;
                        String strG2 = I0.g(c0875s0U.w(), I0.f17007e, I0.f17008f);
                        if (strG2 != null) {
                            C0870r0 c0870r0 = (C0870r0) c0875s0U.i();
                            c0870r0.b();
                            ((C0875s0) c0870r0.f14329s).y(strG2);
                            C0875s0 c0875s0 = (C0875s0) c0870r0.e();
                            c0861p1.b();
                            ((C0866q0) c0861p1.f14329s).D(i14, c0875s0);
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i14++;
                        c0861p0 = c0861p2;
                    }
                    if (z10) {
                        c0851n0.b();
                        ((C0856o0) c0851n0.f14329s).y(i13, (C0866q0) c0861p1.e());
                        arrayList.set(i12, (C0856o0) c0851n0.e());
                    }
                    i13++;
                    q10 = q11;
                    g11 = g12;
                }
            }
            com.google.android.gms.internal.measurement.G0 g13 = g11;
            Q1 q12 = q10;
            if (((C0856o0) c0851n0.f14329s).s() != 0) {
                for (int i15 = 0; i15 < ((C0856o0) c0851n0.f14329s).s(); i15++) {
                    C0900x0 c0900x0T = ((C0856o0) c0851n0.f14329s).t(i15);
                    String strG3 = I0.g(c0900x0T.r(), I0.f17010i, I0.j);
                    if (strG3 != null) {
                        C0895w0 c0895w0 = (C0895w0) c0900x0T.i();
                        c0895w0.b();
                        ((C0900x0) c0895w0.f14329s).y(strG3);
                        c0851n0.b();
                        ((C0856o0) c0851n0.f14329s).x(i15, (C0900x0) c0895w0.e());
                        arrayList.set(i12, (C0856o0) c0851n0.e());
                    }
                }
            }
            i12++;
            c1350e = c1350e2;
            q10 = q12;
            g11 = g13;
        }
        com.google.android.gms.internal.measurement.G0 g14 = g11;
        C1350e c1350e3 = c1350e;
        Q1 q13 = q10;
        c0999m.p();
        c0999m.o();
        U6.y.c(str);
        SQLiteDatabase sQLiteDatabaseD0 = c0999m.d0();
        sQLiteDatabaseD0.beginTransaction();
        try {
            c0999m.p();
            c0999m.o();
            U6.y.c(str);
            SQLiteDatabase sQLiteDatabaseD1 = c0999m.d0();
            sQLiteDatabaseD1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseD1.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                try {
                    int i17 = i16 + 1;
                    C0856o0 c0856o0 = (C0856o0) arrayList.get(i16);
                    c0999m.p();
                    c0999m.o();
                    U6.y.c(str);
                    U6.y.f(c0856o0);
                    if (c0856o0.p()) {
                        int iQ = c0856o0.q();
                        Iterator it = c0856o0.u().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Iterator it2 = c0856o0.r().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        Iterator it3 = c0856o0.u().iterator();
                                        while (true) {
                                            boolean zHasNext = it3.hasNext();
                                            Iterator it4 = it3;
                                            String str4 = "filter_id";
                                            sQLiteDatabase = sQLiteDatabaseD0;
                                            i10 = size;
                                            String str5 = "app_id";
                                            if (!zHasNext) {
                                                i11 = i17;
                                                Iterator it5 = c0856o0.r().iterator();
                                                while (it5.hasNext()) {
                                                    C0900x0 c0900x0 = (C0900x0) it5.next();
                                                    c0999m.p();
                                                    c0999m.o();
                                                    U6.y.c(str);
                                                    U6.y.f(c0900x0);
                                                    if (c0900x0.r().isEmpty()) {
                                                        X x9 = c1023u0.f17584w;
                                                        C1023u0.m(x9);
                                                        x9.f17185z.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", X.w(str), Integer.valueOf(iQ), String.valueOf(c0900x0.p() ? Integer.valueOf(c0900x0.q()) : null));
                                                    } else {
                                                        byte[] bArrA2 = c0900x0.a();
                                                        Iterator it6 = it5;
                                                        ContentValues contentValues = new ContentValues();
                                                        contentValues.put(str5, str);
                                                        String str6 = str5;
                                                        contentValues.put("audience_id", Integer.valueOf(iQ));
                                                        contentValues.put(str4, c0900x0.p() ? Integer.valueOf(c0900x0.q()) : null);
                                                        String str7 = str4;
                                                        contentValues.put("property_name", c0900x0.r());
                                                        contentValues.put("session_scoped", c0900x0.v() ? Boolean.valueOf(c0900x0.w()) : null);
                                                        contentValues.put("data", bArrA2);
                                                        try {
                                                            if (c0999m.d0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                X x10 = c1023u0.f17584w;
                                                                C1023u0.m(x10);
                                                                x10.f17182w.b(X.w(str), "Failed to insert property filter (got -1). appId");
                                                            } else {
                                                                it5 = it6;
                                                                str5 = str6;
                                                                str4 = str7;
                                                            }
                                                        } catch (SQLiteException e10) {
                                                            X x11 = c1023u0.f17584w;
                                                            C1023u0.m(x11);
                                                            x11.f17182w.c(X.w(str), e10, "Error storing property filter. appId");
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                            try {
                                                C0866q0 c0866q0 = (C0866q0) it4.next();
                                                c0999m.p();
                                                c0999m.o();
                                                U6.y.c(str);
                                                U6.y.f(c0866q0);
                                                if (c0866q0.r().isEmpty()) {
                                                    X x12 = c1023u0.f17584w;
                                                    C1023u0.m(x12);
                                                    x12.f17185z.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", X.w(str), Integer.valueOf(iQ), String.valueOf(c0866q0.p() ? Integer.valueOf(c0866q0.q()) : null));
                                                    i11 = i17;
                                                } else {
                                                    C0856o0 c0856o1 = c0856o0;
                                                    byte[] bArrA3 = c0866q0.a();
                                                    i11 = i17;
                                                    ContentValues contentValues2 = new ContentValues();
                                                    contentValues2.put("app_id", str);
                                                    contentValues2.put("audience_id", Integer.valueOf(iQ));
                                                    contentValues2.put("filter_id", c0866q0.p() ? Integer.valueOf(c0866q0.q()) : null);
                                                    contentValues2.put("event_name", c0866q0.r());
                                                    contentValues2.put("session_scoped", c0866q0.z() ? Boolean.valueOf(c0866q0.A()) : null);
                                                    contentValues2.put("data", bArrA3);
                                                    try {
                                                        if (c0999m.d0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                            X x13 = c1023u0.f17584w;
                                                            C1023u0.m(x13);
                                                            x13.f17182w.b(X.w(str), "Failed to insert event filter (got -1). appId");
                                                        }
                                                        it3 = it4;
                                                        sQLiteDatabaseD0 = sQLiteDatabase;
                                                        size = i10;
                                                        c0856o0 = c0856o1;
                                                        i17 = i11;
                                                    } catch (SQLiteException e11) {
                                                        X x14 = c1023u0.f17584w;
                                                        C1023u0.m(x14);
                                                        x14.f17182w.c(X.w(str), e11, "Error storing event filter. appId");
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                sQLiteDatabase.endTransaction();
                                                throw th;
                                            }
                                            c0999m.p();
                                            c0999m.o();
                                            U6.y.c(str);
                                            SQLiteDatabase sQLiteDatabaseD2 = c0999m.d0();
                                            sQLiteDatabaseD2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iQ)});
                                            sQLiteDatabaseD2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iQ)});
                                            break;
                                        }
                                        sQLiteDatabaseD0 = sQLiteDatabase;
                                        size = i10;
                                        i16 = i11;
                                        break;
                                    }
                                    if (!((C0900x0) it2.next()).p()) {
                                        X x15 = c1023u0.f17584w;
                                        C1023u0.m(x15);
                                        x15.f17185z.c(X.w(str), Integer.valueOf(iQ), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    }
                                }
                            } else if (!((C0866q0) it.next()).p()) {
                                X x16 = c1023u0.f17584w;
                                C1023u0.m(x16);
                                x16.f17185z.c(X.w(str), Integer.valueOf(iQ), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                            }
                        }
                    } else {
                        X x17 = c1023u0.f17584w;
                        C1023u0.m(x17);
                        x17.f17185z.b(X.w(str), "Audience with no ID. appId");
                    }
                    i16 = i17;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabaseD0;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = sQLiteDatabaseD0;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj = arrayList.get(i18);
                i18++;
                C0856o0 c0856o2 = (C0856o0) obj;
                arrayList2.add(c0856o2.p() ? Integer.valueOf(c0856o2.q()) : null);
            }
            U6.y.c(str);
            c0999m.p();
            c0999m.o();
            SQLiteDatabase sQLiteDatabaseD3 = c0999m.d0();
            try {
                long jY = c0999m.Y("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, c1023u0.f17582u.w(str, G.f16918V)));
                if (jY > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseD3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i19);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i19++;
                    }
                }
            } catch (SQLiteException e12) {
                X x18 = c1023u0.f17584w;
                C1023u0.m(x18);
                x18.f17182w.c(X.w(str), e12, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                g14.b();
                g10 = g14;
                try {
                    ((com.google.android.gms.internal.measurement.H0) g10.f14329s).I();
                    bArrA = ((com.google.android.gms.internal.measurement.H0) g10.e()).a();
                } catch (RuntimeException e13) {
                    e = e13;
                    X x19 = ((C1023u0) this.f16104r).f17584w;
                    C1023u0.m(x19);
                    x19.f17185z.c(X.w(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrA = bArr;
                }
            } catch (RuntimeException e14) {
                e = e14;
                g10 = g14;
            }
            C0999m c0999m2 = q13.f17106t;
            Q1.U(c0999m2);
            C1023u0 c1023u1 = (C1023u0) c0999m2.f16104r;
            U6.y.c(str);
            c0999m2.o();
            c0999m2.p();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrA);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (c0999m2.d0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    X x20 = c1023u1.f17584w;
                    C1023u0.m(x20);
                    x20.f17182w.b(X.w(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e15) {
                X x21 = c1023u1.f17584w;
                C1023u0.m(x21);
                x21.f17182w.c(X.w(str), e15, "Error storing remote config. appId");
            }
            g10.b();
            ((com.google.android.gms.internal.measurement.H0) g10.f14329s).J();
            c1350e3.put(str, (com.google.android.gms.internal.measurement.H0) g10.e());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseD0;
        }
    }

    public final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        o();
        u(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && V1.O(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && V1.o0(str2)) {
            return true;
        }
        Map map = (Map) this.f17480w.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        o();
        u(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f17481x.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int F(String str, String str2) throws Throwable {
        Integer num;
        o();
        u(str);
        Map map = (Map) this.f17483z.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean G(String str) throws Throwable {
        o();
        u(str);
        C1350e c1350e = this.f17479v;
        if (c1350e.get(str) != null) {
            return ((Set) c1350e.get(str)).contains("os_version") || ((Set) c1350e.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean H(String str) throws Throwable {
        o();
        u(str);
        C1350e c1350e = this.f17479v;
        return c1350e.get(str) != null && ((Set) c1350e.get(str)).contains("app_instance_id");
    }

    public final boolean I(String str, G0 g10) throws Throwable {
        o();
        u(str);
        com.google.android.gms.internal.measurement.C0 c0J = J(str);
        if (c0J == null) {
            return false;
        }
        for (C0910z0 c0910z0 : c0J.p()) {
            if (g10 == z(c0910z0.p())) {
                return c0910z0.q() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.C0 J(String str) throws Throwable {
        o();
        u(str);
        com.google.android.gms.internal.measurement.H0 h0A = A(str);
        if (h0A == null || !h0A.B()) {
            return null;
        }
        return h0A.C();
    }

    @Override // i7.InterfaceC0978f
    public final String a(String str, String str2) throws Throwable {
        o();
        u(str);
        Map map = (Map) this.f17478u.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final E0 s(String str, G0 g10) throws Throwable {
        o();
        u(str);
        com.google.android.gms.internal.measurement.C0 c0J = J(str);
        if (c0J != null) {
            for (C0910z0 c0910z0 : c0J.u()) {
                if (z(c0910z0.p()) == g10) {
                    int iQ = c0910z0.q() - 1;
                    if (iQ == 1) {
                        return E0.f16865v;
                    }
                    if (iQ != 2) {
                        break;
                    }
                    return E0.f16864u;
                }
            }
        }
        return E0.f16862s;
    }

    public final boolean t(String str) throws Throwable {
        o();
        u(str);
        com.google.android.gms.internal.measurement.C0 c0J = J(str);
        if (c0J == null) {
            return false;
        }
        for (C0910z0 c0910z0 : c0J.p()) {
            if (c0910z0.p() == 3 && c0910z0.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void u(String str) throws Throwable {
        p();
        o();
        U6.y.c(str);
        C1350e c1350e = this.f17482y;
        if (c1350e.get(str) == null) {
            C0999m c0999m = this.f17001s.f17106t;
            Q1.U(c0999m);
            p074h0.i iVarU0 = c0999m.u0(str);
            C1350e c1350e2 = this.f17477E;
            C1350e c1350e3 = this.f17476D;
            C1350e c1350e4 = this.f17475C;
            C1350e c1350e5 = this.f17478u;
            if (iVarU0 != null) {
                com.google.android.gms.internal.measurement.G0 g10 = (com.google.android.gms.internal.measurement.G0) x(str, (byte[]) iVarU0.f16422s).i();
                v(str, g10);
                c1350e5.put(str, y((com.google.android.gms.internal.measurement.H0) g10.e()));
                c1350e.put(str, (com.google.android.gms.internal.measurement.H0) g10.e());
                w(str, (com.google.android.gms.internal.measurement.H0) g10.e());
                c1350e4.put(str, ((com.google.android.gms.internal.measurement.H0) g10.f14329s).A());
                c1350e3.put(str, (String) iVarU0.f16423t);
                c1350e2.put(str, (String) iVarU0.f16424u);
                return;
            }
            c1350e5.put(str, null);
            this.f17480w.put(str, null);
            this.f17479v.put(str, null);
            this.f17481x.put(str, null);
            c1350e.put(str, null);
            c1350e4.put(str, null);
            c1350e3.put(str, null);
            c1350e2.put(str, null);
            this.f17483z.put(str, null);
        }
    }

    public final void v(String str, com.google.android.gms.internal.measurement.G0 g10) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        HashSet hashSet = new HashSet();
        C1350e c1350e = new C1350e(0);
        C1350e c1350e2 = new C1350e(0);
        C1350e c1350e3 = new C1350e(0);
        Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.H0) g10.f14329s).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.D0) it.next()).p());
        }
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.H0) g10.f14329s).u(); i10++) {
            com.google.android.gms.internal.measurement.E0 e10 = (com.google.android.gms.internal.measurement.E0) ((com.google.android.gms.internal.measurement.H0) g10.f14329s).v(i10).i();
            if (e10.h().isEmpty()) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17185z.a("EventConfig contained null event name");
            } else {
                String strH = e10.h();
                String strG = I0.g(e10.h(), I0.f17003a, I0.f17005c);
                if (!TextUtils.isEmpty(strG)) {
                    e10.b();
                    ((com.google.android.gms.internal.measurement.F0) e10.f14329s).w(strG);
                    g10.b();
                    ((com.google.android.gms.internal.measurement.H0) g10.f14329s).H(i10, (com.google.android.gms.internal.measurement.F0) e10.e());
                }
                if (((com.google.android.gms.internal.measurement.F0) e10.f14329s).q() && ((com.google.android.gms.internal.measurement.F0) e10.f14329s).r()) {
                    c1350e.put(strH, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.F0) e10.f14329s).s() && ((com.google.android.gms.internal.measurement.F0) e10.f14329s).t()) {
                    c1350e2.put(e10.h(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.F0) e10.f14329s).u()) {
                    if (((com.google.android.gms.internal.measurement.F0) e10.f14329s).v() < 2 || ((com.google.android.gms.internal.measurement.F0) e10.f14329s).v() > 65535) {
                        X x10 = c1023u0.f17584w;
                        C1023u0.m(x10);
                        x10.f17185z.c(e10.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.F0) e10.f14329s).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c1350e3.put(e10.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.F0) e10.f14329s).v()));
                    }
                }
            }
        }
        this.f17479v.put(str, hashSet);
        this.f17480w.put(str, c1350e);
        this.f17481x.put(str, c1350e2);
        this.f17483z.put(str, c1350e3);
    }

    public final void w(String str, com.google.android.gms.internal.measurement.H0 h7) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        int iY = h7.y();
        C0994k0 c0994k0 = this.f17473A;
        if (iY == 0) {
            c0994k0.l(str);
            return;
        }
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17178E.b(Integer.valueOf(h7.y()), "EES programs found");
        C0901x1 c0901x1 = (C0901x1) h7.x().get(0);
        try {
            com.google.android.gms.internal.measurement.E e10 = new com.google.android.gms.internal.measurement.E();
            Aa.a aVar = e10.f14015a;
            ((HashMap) ((C0902x2) aVar.f557u).f14509r).put("internal.remoteConfig", new CallableC0997l0(this, str, 2));
            ((HashMap) ((C0902x2) aVar.f557u).f14509r).put("internal.appMetadata", new CallableC0997l0(this, str, 0));
            ((HashMap) ((C0902x2) aVar.f557u).f14509r).put("internal.logger", new CallableC1000m0(this));
            e10.b(c0901x1);
            c0994k0.k(str, e10);
            C1023u0.m(x9);
            V v10 = x9.f17178E;
            v10.c(str, Integer.valueOf(c0901x1.q().q()), "EES program loaded for appId, activities");
            for (C0896w1 c0896w1 : c0901x1.q().p()) {
                C1023u0.m(x9);
                v10.b(c0896w1.p(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.S unused) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(str, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.H0 x(String str, byte[] bArr) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.H0.G();
        }
        try {
            com.google.android.gms.internal.measurement.H0 h7 = (com.google.android.gms.internal.measurement.H0) ((com.google.android.gms.internal.measurement.G0) C0967b0.b0(com.google.android.gms.internal.measurement.H0.F(), bArr)).e();
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.c(h7.p() ? Long.valueOf(h7.q()) : null, h7.r() ? h7.s() : null, "Parsed config. version, gmp_app_id");
            return h7;
        } catch (C0872r2 e10) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17185z.c(X.w(str), e10, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.H0.G();
        } catch (RuntimeException e11) {
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17185z.c(X.w(str), e11, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.H0.G();
        }
    }

    @Override // i7.L1
    public final void r() {
    }
}
