package F1;

import U6.y;
import Z0.B;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.r;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.C0790b;
import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.S;
import com.google.android.material.appbar.AppBarLayout;
import i7.B0;
import i7.C0967b0;
import i7.C0972d;
import i7.C0975e;
import i7.C0985h0;
import i7.C0999m;
import i7.C1003n0;
import i7.C1019t;
import i7.C1021t1;
import i7.C1022u;
import i7.C1023u0;
import i7.G0;
import i7.I0;
import i7.InterfaceC1030w1;
import i7.J;
import i7.P1;
import i7.Q1;
import i7.R1;
import i7.S1;
import i7.V1;
import i7.X;
import i7.X1;
import i7.Y0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f2184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f2185u;

    public /* synthetic */ o() {
        this.f2182r = 0;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0369  */
    /* JADX WARN: Code duplicated, block: B:128:0x036f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0380  */
    /* JADX WARN: Code duplicated, block: B:131:0x0386  */
    /* JADX WARN: Code duplicated, block: B:133:0x038c  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x0400 A[Catch: SQLiteException -> 0x040b, TRY_LEAVE, TryCatch #17 {SQLiteException -> 0x040b, blocks: (B:137:0x03e1, B:139:0x0400), top: B:237:0x03e1 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x042f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0432  */
    /* JADX WARN: Code duplicated, block: B:150:0x043a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0443  */
    /* JADX WARN: Code duplicated, block: B:158:0x048c  */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        C1019t c1019t;
        Cursor cursor;
        int i10;
        long j;
        Cursor cursorQuery;
        R1 r1P;
        String str;
        int i11;
        P1 p10;
        C0999m c0999m;
        Long lValueOf;
        ContentValues contentValues;
        X x9;
        Cursor cursor2;
        AtomicReference atomicReference;
        V1 v10;
        OverScroller overScroller;
        int i12 = 4;
        int i13 = 0;
        String strT = null;
        switch (this.f2182r) {
            case 0:
                try {
                    objCall = ((h) this.f2183s).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f2185u).post(new p039d8.a(i12, (i) this.f2184t, objCall));
                return;
            case 1:
                X1 x10 = (X1) this.f2184t;
                Q1 q10 = ((B0) this.f2185u).f16830f;
                q10.B();
                C0975e c0975e = (C0975e) this.f2183s;
                if (c0975e.f17327t.b() == null) {
                    q10.a0(c0975e, x10);
                    return;
                } else {
                    q10.Z(c0975e, x10);
                    return;
                }
            case 2:
                C1022u c1022u = (C1022u) this.f2183s;
                X1 x11 = (X1) this.f2184t;
                B0 b5 = (B0) this.f2185u;
                b5.getClass();
                Q1 q11 = b5.f16830f;
                if ("_cmp".equals(c1022u.f17558r) && (c1019t = c1022u.f17559s) != null) {
                    Bundle bundle = c1019t.f17548r;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            q11.b().f17176C.b(c1022u.toString(), "Event has been filtered ");
                            c1022u = new C1022u("_cmpx", c1019t, c1022u.f17560t, c1022u.f17561u);
                        }
                    }
                }
                String str2 = c1022u.f17558r;
                C1003n0 c1003n0 = q11.f17104r;
                C0967b0 c0967b0 = q11.f17110x;
                Q1.U(c1003n0);
                String str3 = x11.f17204r;
                E e10 = TextUtils.isEmpty(str3) ? null : (E) c1003n0.f17473A.g(str3);
                if (e10 == null) {
                    q11.b().f17178E.b(x11.f17204r, "EES not loaded for");
                    q11.B();
                    q11.j(c1022u, x11);
                    return;
                }
                try {
                    r rVar = e10.f14017c;
                    Q1.U(c0967b0);
                    HashMap mapE0 = C0967b0.e0(c1022u.f17559s.e(), true);
                    String strG = I0.g(str2, I0.f17005c, I0.f17003a);
                    if (strG == null) {
                        strG = str2;
                    }
                    if (e10.a(new C0790b(strG, c1022u.f17561u, mapE0))) {
                        if (((C0790b) rVar.f11365t).equals((C0790b) rVar.f11364s)) {
                            q11.B();
                            q11.j(c1022u, x11);
                        } else {
                            q11.b().f17178E.b(str2, "EES edited event");
                            Q1.U(c0967b0);
                            C1022u c1022uS = C0967b0.s((C0790b) rVar.f11365t);
                            q11.B();
                            q11.j(c1022uS, x11);
                        }
                        if (((ArrayList) rVar.f11366u).isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) rVar.f11366u;
                        int size = arrayList.size();
                        while (i13 < size) {
                            Object obj = arrayList.get(i13);
                            i13++;
                            C0790b c0790b = (C0790b) obj;
                            q11.b().f17178E.b(c0790b.f14203a, "EES logging created event");
                            Q1.U(c0967b0);
                            C1022u c1022uS2 = C0967b0.s(c0790b);
                            q11.B();
                            q11.j(c1022uS2, x11);
                        }
                        return;
                    }
                } catch (S unused2) {
                    q11.b().f17182w.c(x11.f17205s, str2, "EES error. appId, eventName");
                }
                q11.b().f17178E.b(str2, "EES was not applied to event");
                q11.B();
                q11.j(c1022u, x11);
                return;
            case 3:
                B0 b10 = (B0) this.f2185u;
                b10.f16830f.B();
                b10.f16830f.h((C1022u) this.f2183s, (String) this.f2184t);
                return;
            case 4:
                X1 x12 = (X1) this.f2184t;
                Q1 q12 = ((B0) this.f2185u).f16830f;
                q12.B();
                S1 s10 = (S1) this.f2183s;
                if (s10.b() == null) {
                    q12.X(s10.f17132s, x12);
                    return;
                } else {
                    q12.W(s10, x12);
                    return;
                }
            case 5:
                B0 b11 = (B0) this.f2183s;
                X1 x13 = (X1) this.f2184t;
                C0972d c0972d = (C0972d) this.f2185u;
                Q1 q13 = b11.f16830f;
                q13.B();
                String str4 = x13.f17204r;
                y.f(str4);
                HashMap map = q13.f17098V;
                q13.c().o();
                q13.l0();
                C0999m c0999m2 = q13.f17106t;
                Q1.U(c0999m2);
                long j10 = c0972d.f17316r;
                long j11 = c0972d.f17318t;
                c0999m2.o();
                c0999m2.p();
                try {
                    cursorQuery = c0999m2.d0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                y.f(string2);
                                try {
                                    try {
                                        i10 = 4;
                                        try {
                                            j = j11;
                                            cursor2 = cursorQuery;
                                            try {
                                                r1P = c0999m2.P(string2, j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                cursor2.close();
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                cursorQuery = cursor2;
                                                try {
                                                    X x14 = ((C1023u0) c0999m2.f16104r).f17584w;
                                                    C1023u0.m(x14);
                                                    x14.f17182w.c(Long.valueOf(j10), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    r1P = null;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = cursor2;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            cursor2 = cursorQuery;
                                            j = j11;
                                            cursorQuery = cursor2;
                                            X x15 = ((C1023u0) c0999m2.f16104r).f17584w;
                                            C1023u0.m(x15);
                                            x15.f17182w.c(Long.valueOf(j10), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            r1P = null;
                                            if (r1P == null) {
                                                q13.b().f17185z.c(str4, Long.valueOf(j10), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                                return;
                                            }
                                            str = r1P.f17118c;
                                            i11 = c0972d.f17317s;
                                            if (i11 == 1) {
                                                if (i11 == 3) {
                                                    p10 = (P1) map.get(str);
                                                    if (p10 == null) {
                                                        p10 = new P1(q13);
                                                        map.put(str, p10);
                                                    } else {
                                                        p10.f17068b++;
                                                        p10.f17069c = p10.a();
                                                    }
                                                    q13.e().getClass();
                                                    q13.b().f17178E.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((p10.f17069c - System.currentTimeMillis()) / 1000));
                                                }
                                                C0999m c0999m3 = q13.f17106t;
                                                Q1.U(c0999m3);
                                                Long lValueOf2 = Long.valueOf(c0972d.f17316r);
                                                c0999m3.A(lValueOf2);
                                                q13.b().f17178E.c(str4, lValueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                                return;
                                            }
                                            if (map.containsKey(str)) {
                                                map.remove(str);
                                            }
                                            C0999m c0999m4 = q13.f17106t;
                                            Q1.U(c0999m4);
                                            Long lValueOf3 = Long.valueOf(j10);
                                            c0999m4.v(lValueOf3);
                                            q13.b().f17178E.c(str4, lValueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                            if (j > 0) {
                                                c0999m = q13.f17106t;
                                                Q1.U(c0999m);
                                                C1023u0 c1023u0 = (C1023u0) c0999m.f16104r;
                                                c0999m.o();
                                                c0999m.p();
                                                lValueOf = Long.valueOf(j);
                                                contentValues = new ContentValues();
                                                contentValues.put("upload_type", (Integer) 1);
                                                Y6.a aVar = c1023u0.f17564B;
                                                x9 = c1023u0.f17584w;
                                                aVar.getClass();
                                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                try {
                                                    if (c0999m.d0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i10)}) != 1) {
                                                        C1023u0.m(x9);
                                                        x9.f17185z.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                                        break;
                                                    }
                                                    q13.b().f17178E.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                                    q13.t(str4);
                                                    return;
                                                } catch (SQLiteException e13) {
                                                    C1023u0.m(x9);
                                                    x9.f17182w.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e13);
                                                    throw e13;
                                                }
                                            }
                                            return;
                                        }
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        i10 = 4;
                                    }
                                } catch (SQLiteException e15) {
                                    e = e15;
                                    i10 = 4;
                                    cursor2 = cursorQuery;
                                    j = j11;
                                }
                            } else {
                                i10 = 4;
                                j = j11;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                r1P = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursorQuery;
                        }
                    } catch (SQLiteException e16) {
                        e = e16;
                        i10 = 4;
                        cursor2 = cursorQuery;
                        j = j11;
                    }
                } catch (SQLiteException e17) {
                    e = e17;
                    i10 = 4;
                    j = j11;
                    cursorQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
                if (r1P == null) {
                    q13.b().f17185z.c(str4, Long.valueOf(j10), "[sgtm] Queued batch doesn't exist. appId, rowId");
                    return;
                }
                str = r1P.f17118c;
                i11 = c0972d.f17317s;
                if (i11 == 1) {
                    if (i11 == 3) {
                        p10 = (P1) map.get(str);
                        if (p10 == null) {
                            p10 = new P1(q13);
                            map.put(str, p10);
                        } else {
                            p10.f17068b++;
                            p10.f17069c = p10.a();
                        }
                        q13.e().getClass();
                        q13.b().f17178E.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((p10.f17069c - System.currentTimeMillis()) / 1000));
                    }
                    C0999m c0999m5 = q13.f17106t;
                    Q1.U(c0999m5);
                    Long lValueOf4 = Long.valueOf(c0972d.f17316r);
                    c0999m5.A(lValueOf4);
                    q13.b().f17178E.c(str4, lValueOf4, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                C0999m c0999m6 = q13.f17106t;
                Q1.U(c0999m6);
                Long lValueOf5 = Long.valueOf(j10);
                c0999m6.v(lValueOf5);
                q13.b().f17178E.c(str4, lValueOf5, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                if (j > 0) {
                    c0999m = q13.f17106t;
                    Q1.U(c0999m);
                    C1023u0 c1023u1 = (C1023u0) c0999m.f16104r;
                    c0999m.o();
                    c0999m.p();
                    lValueOf = Long.valueOf(j);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    Y6.a aVar2 = c1023u1.f17564B;
                    x9 = c1023u1.f17584w;
                    aVar2.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (c0999m.d0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i10)}) != 1) {
                        C1023u0.m(x9);
                        x9.f17185z.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                        break;
                    }
                    q13.b().f17178E.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                    q13.t(str4);
                    return;
                }
                return;
            case 6:
                AtomicReference atomicReference2 = (AtomicReference) this.f2183s;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C1021t1 c1021t1 = (C1021t1) this.f2185u;
                            C1023u0 c1023u2 = (C1023u0) c1021t1.f16104r;
                            C0985h0 c0985h0 = c1023u2.f17583v;
                            C1023u0.k(c0985h0);
                            if (c0985h0.v().i(G0.f16990t)) {
                                J j12 = c1021t1.f17552u;
                                if (j12 != null) {
                                    atomicReference2.set(j12.T((X1) this.f2184t));
                                    String str5 = (String) atomicReference2.get();
                                    if (str5 != null) {
                                        Y0 y10 = ((C1023u0) c1021t1.f16104r).f17566D;
                                        C1023u0.l(y10);
                                        y10.f17236x.set(str5);
                                        C0985h0 c0985h1 = c1023u2.f17583v;
                                        C1023u0.k(c0985h1);
                                        c0985h1.f17404x.k(str5);
                                    }
                                    c1021t1.B();
                                    atomicReference = (AtomicReference) this.f2183s;
                                    atomicReference.notify();
                                    return;
                                }
                                X x16 = c1023u2.f17584w;
                                C1023u0.m(x16);
                                x16.f17182w.a("Failed to get app instance id");
                            } else {
                                X x17 = c1023u2.f17584w;
                                C1023u0.m(x17);
                                x17.f17175B.a("Analytics storage consent denied; will not get app instance id");
                                Y0 y11 = ((C1023u0) c1021t1.f16104r).f17566D;
                                C1023u0.l(y11);
                                y11.f17236x.set(null);
                                C0985h0 c0985h2 = c1023u2.f17583v;
                                C1023u0.k(c0985h2);
                                c0985h2.f17404x.k(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e18) {
                            X x18 = ((C1023u0) ((C1021t1) this.f2185u).f16104r).f17584w;
                            C1023u0.m(x18);
                            x18.f17182w.b(e18, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f2183s;
                        }
                    } catch (Throwable th5) {
                        ((AtomicReference) this.f2183s).notify();
                        throw th5;
                    }
                }
                break;
            case 7:
                N n6 = (N) this.f2184t;
                C1021t1 c1021t2 = (C1021t1) this.f2185u;
                try {
                    try {
                        C1023u0 c1023u3 = (C1023u0) c1021t2.f16104r;
                        C0985h0 c0985h3 = c1023u3.f17583v;
                        X x19 = c1023u3.f17584w;
                        C1023u0.k(c0985h3);
                        if (c0985h3.v().i(G0.f16990t)) {
                            J j13 = c1021t2.f17552u;
                            if (j13 != null) {
                                strT = j13.T((X1) this.f2183s);
                                if (strT != null) {
                                    Y0 y12 = c1023u3.f17566D;
                                    C1023u0.l(y12);
                                    y12.f17236x.set(strT);
                                    C1023u0.k(c0985h3);
                                    c0985h3.f17404x.k(strT);
                                }
                                c1021t2.B();
                                v10 = ((C1023u0) c1021t2.f16104r).f17587z;
                                C1023u0.k(v10);
                                v10.Y(strT, n6);
                                return;
                            }
                            C1023u0.m(x19);
                            x19.f17182w.a("Failed to get app instance id");
                        } else {
                            C1023u0.m(x19);
                            x19.f17175B.a("Analytics storage consent denied; will not get app instance id");
                            Y0 y13 = c1023u3.f17566D;
                            C1023u0.l(y13);
                            y13.f17236x.set(null);
                            C1023u0.k(c0985h3);
                            c0985h3.f17404x.k(null);
                        }
                        v10 = c1023u3.f17587z;
                    } catch (Throwable th6) {
                        V1 v11 = ((C1023u0) c1021t2.f16104r).f17587z;
                        C1023u0.k(v11);
                        v11.Y(null, n6);
                        throw th6;
                    }
                } catch (RemoteException e19) {
                    X x20 = ((C1023u0) c1021t2.f16104r).f17584w;
                    C1023u0.m(x20);
                    x20.f17182w.b(e19, "Failed to get app instance id");
                }
                C1023u0.k(v10);
                v10.Y(strT, n6);
                return;
            case 8:
                C1021t1 c1021t3 = (C1021t1) this.f2183s;
                X1 x21 = (X1) this.f2184t;
                C0972d c0972d2 = (C0972d) this.f2185u;
                C1023u0 c1023u4 = (C1023u0) c1021t3.f16104r;
                J j14 = c1021t3.f17552u;
                if (j14 == null) {
                    X x22 = c1023u4.f17584w;
                    C1023u0.m(x22);
                    x22.f17182w.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    j14.L(x21, c0972d2);
                    c1021t3.B();
                    return;
                } catch (RemoteException e20) {
                    X x23 = c1023u4.f17584w;
                    C1023u0.m(x23);
                    x23.f17182w.c(Long.valueOf(c0972d2.f17316r), e20, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 9:
                B b12 = (B) this.f2183s;
                X x24 = (X) this.f2184t;
                JobParameters jobParameters = (JobParameters) this.f2185u;
                x24.f17178E.a("AppMeasurementJobService processed last upload request.");
                ((InterfaceC1030w1) ((Service) b12.f10875s)).c(jobParameters);
                return;
            case 10:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2183s;
                p148o7.g gVar = (p148o7.g) this.f2185u;
                View view = (View) this.f2184t;
                if (view == null || (overScroller = gVar.f20359u) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    gVar.A(coordinatorLayout, view, gVar.f20359u.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) gVar).G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f14529C) {
                    appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                    return;
                }
                return;
            default:
                w8.c cVar = (w8.c) this.f2185u;
                p160p8.b bVar = (p160p8.b) this.f2183s;
                cVar.b(bVar, (p118l7.i) this.f2184t);
                ((AtomicInteger) cVar.f23808i.f16734t).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(cVar.f23802b, cVar.a()) * (60000.0d / cVar.f23801a));
                String str6 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + bVar.f21057b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str6, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused3) {
                    return;
                }
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, Parcelable parcelable, int i10) {
        this.f2182r = i10;
        this.f2183s = obj;
        this.f2184t = obj2;
        this.f2185u = parcelable;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.f2182r = i10;
        this.f2183s = obj2;
        this.f2184t = obj3;
        this.f2185u = obj;
    }

    public o(C1021t1 c1021t1, AtomicReference atomicReference, X1 x9) {
        this.f2182r = 6;
        this.f2183s = atomicReference;
        this.f2184t = x9;
        Objects.requireNonNull(c1021t1);
        this.f2185u = c1021t1;
    }
}
