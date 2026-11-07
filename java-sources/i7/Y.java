package i7;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0797c1;
import com.google.android.gms.internal.measurement.C0802d1;
import com.google.android.gms.internal.measurement.C0817g1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17213a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17217e;

    public Y(long j, Bundle bundle, String str, String str2) {
        this.f17215c = str;
        this.f17216d = str2;
        this.f17217e = bundle;
        this.f17214b = j;
    }

    public static Y b(C1022u c1022u) {
        String str = c1022u.f17558r;
        String str2 = c1022u.f17560t;
        return new Y(c1022u.f17561u, c1022u.f17559s.e(), str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ff A[PHI: r8 r16 r17
      0x00ff: PHI (r8v6 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r16v3 com.google.android.gms.internal.measurement.d1) = (r16v5 com.google.android.gms.internal.measurement.d1), (r16v10 com.google.android.gms.internal.measurement.d1) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public C0802d1 a(C0802d1 c0802d1, String str) throws Throwable {
        Cursor cursor;
        C0802d1 c0802d2;
        long j;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strS = c0802d1.s();
        List listP = c0802d1.p();
        C0969c c0969c = (C0969c) this.f17217e;
        Q1 q10 = c0969c.f17001s;
        Q1 q11 = c0969c.f17001s;
        C1023u0 c1023u0 = (C1023u0) c0969c.f16104r;
        q10.j0();
        C0817g1 c0817g1W = C0967b0.w(c0802d1, "_eid");
        Long l10 = (Long) (c0817g1W == null ? null : C0967b0.D(c0817g1W));
        if (l10 != null) {
            if (strS.equals("_ep")) {
                q10.j0();
                C0817g1 c0817g1W2 = C0967b0.w(c0802d1, "_en");
                String str2 = (String) (c0817g1W2 == null ? null : C0967b0.D(c0817g1W2));
                if (TextUtils.isEmpty(str2)) {
                    X x9 = c1023u0.f17584w;
                    C1023u0.m(x9);
                    x9.f17183x.b(l10, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((C0802d1) this.f17215c) == null || ((Long) this.f17216d) == null || l10.longValue() != ((Long) this.f17216d).longValue()) {
                    C0999m c0999m = q10.f17106t;
                    Q1.U(c0999m);
                    C1023u0 c1023u1 = (C1023u0) c0999m.f16104r;
                    c0999m.o();
                    c0999m.p();
                    try {
                        cursorRawQuery = c0999m.d0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    c0802d2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((C0802d1) ((C0797c1) C0967b0.b0(C0802d1.z(), cursorRawQuery.getBlob(0))).e(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            j = 0;
                                            X x10 = c1023u1.f17584w;
                                            C1023u0.m(x10);
                                            x10.f17182w.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = c0802d2;
                                        }
                                    } catch (IOException e11) {
                                        X x11 = c1023u1.f17584w;
                                        C1023u0.m(x11);
                                        j = 0;
                                        try {
                                            x11.f17182w.d("Failed to merge main event. appId, eventId", X.w(str), l10, e11);
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            X x12 = c1023u1.f17584w;
                                            C1023u0.m(x12);
                                            x12.f17182w.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = c0802d2;
                                            if (pair != 0) {
                                            }
                                            X x13 = c1023u0.f17584w;
                                            C1023u0.m(x13);
                                            x13.f17183x.c(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                                            return c0802d2;
                                        }
                                        cursorRawQuery.close();
                                        pair = c0802d2;
                                    }
                                } else {
                                    X x14 = c1023u1.f17584w;
                                    C1023u0.m(x14);
                                    x14.f17178E.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    c0802d2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e13) {
                                e = e13;
                                c0802d2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        c0802d2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        X x15 = c1023u0.f17584w;
                        C1023u0.m(x15);
                        x15.f17183x.c(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                        return c0802d2;
                    }
                    this.f17215c = (C0802d1) obj;
                    this.f17214b = ((Long) pair.second).longValue();
                    q11.j0();
                    this.f17216d = (Long) C0967b0.x((C0802d1) this.f17215c, "_eid");
                } else {
                    j = 0;
                }
                long j10 = this.f17214b - 1;
                this.f17214b = j10;
                if (j10 <= j) {
                    C0999m c0999m2 = q11.f17106t;
                    Q1.U(c0999m2);
                    C1023u0 c1023u2 = (C1023u0) c0999m2.f16104r;
                    c0999m2.o();
                    X x16 = c1023u2.f17584w;
                    C1023u0.m(x16);
                    x16.f17178E.b(str, "Clearing complex main event info. appId");
                    try {
                        c0999m2.d0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e15) {
                        X x17 = c1023u2.f17584w;
                        C1023u0.m(x17);
                        x17.f17182w.b(e15, "Error clearing complex main event");
                    }
                } else {
                    C0999m c0999m3 = q11.f17106t;
                    Q1.U(c0999m3);
                    c0999m3.F(str, l10, this.f17214b, (C0802d1) this.f17215c);
                }
                ArrayList arrayList = new ArrayList();
                for (C0817g1 c0817g1 : ((C0802d1) this.f17215c).p()) {
                    q11.j0();
                    if (C0967b0.w(c0802d1, c0817g1.q()) == null) {
                        arrayList.add(c0817g1);
                    }
                }
                if (arrayList.isEmpty()) {
                    X x18 = c1023u0.f17584w;
                    C1023u0.m(x18);
                    x18.f17183x.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listP);
                    listP = arrayList;
                }
                strS = str2;
            } else {
                this.f17216d = l10;
                this.f17215c = c0802d1;
                q10.j0();
                C0817g1 c0817g1W3 = C0967b0.w(c0802d1, "_epc");
                Serializable serializableD = c0817g1W3 == null ? null : C0967b0.D(c0817g1W3);
                long jLongValue = ((Long) (serializableD != null ? serializableD : 0L)).longValue();
                this.f17214b = jLongValue;
                if (jLongValue <= 0) {
                    X x19 = c1023u0.f17584w;
                    C1023u0.m(x19);
                    x19.f17183x.b(strS, "Complex event with zero extra param count. eventName");
                } else {
                    C0999m c0999m4 = q10.f17106t;
                    Q1.U(c0999m4);
                    c0999m4.F(str, l10, this.f17214b, c0802d1);
                }
            }
        }
        C0797c1 c0797c1 = (C0797c1) c0802d1.i();
        c0797c1.b();
        ((C0802d1) c0797c1.f14329s).F(strS);
        c0797c1.b();
        ((C0802d1) c0797c1.f14329s).D();
        c0797c1.b();
        ((C0802d1) c0797c1.f14329s).C(listP);
        return (C0802d1) c0797c1.e();
    }

    public C1022u c() {
        return new C1022u((String) this.f17215c, new C1019t(new Bundle((Bundle) this.f17217e)), (String) this.f17216d, this.f17214b);
    }

    public String toString() {
        switch (this.f17213a) {
            case 0:
                String str = (String) this.f17216d;
                String string = ((Bundle) this.f17217e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f17215c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                p245z2.a.I(sb, "origin=", str, ",name=", str2);
                return android.support.v4.media.session.p.B(sb, ",params=", string);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Y(C0969c c0969c) {
        this.f17217e = c0969c;
    }
}
