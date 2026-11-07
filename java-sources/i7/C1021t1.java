package i7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: i7.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021t1 extends I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1010p1 f17550A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ServiceConnectionC1018s1 f17551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public J f17552u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile Boolean f17553v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1010p1 f17554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ScheduledExecutorService f17555x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final A.o1 f17556y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f17557z;

    public C1021t1(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17557z = new ArrayList();
        this.f17556y = new A.o1(c1023u0.f17564B);
        this.f17551t = new ServiceConnectionC1018s1(this);
        this.f17554w = new C1010p1(this, c1023u0, 0);
        this.f17550A = new C1010p1(this, c1023u0, 1);
    }

    public final void A() {
        ((C1023u0) this.f16104r).getClass();
    }

    public final void B() {
        o();
        A.o1 o1Var = this.f17556y;
        ((Y6.a) o1Var.f367t).getClass();
        o1Var.f366s = SystemClock.elapsedRealtime();
        ((C1023u0) this.f16104r).getClass();
        this.f17554w.b(((Long) G.f16926Z.a(null)).longValue());
    }

    public final void C(Runnable runnable) {
        o();
        if (F()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f17557z;
        long size = arrayList.size();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        c1023u0.getClass();
        if (size >= 1000) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f17550A.b(60000L);
            u();
        }
    }

    public final void D() {
        o();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        V v10 = x9.f17178E;
        ArrayList arrayList = this.f17557z;
        v10.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e10) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17182w.b(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f17550A.c();
    }

    public final X1 E(boolean z10) {
        long jAbs;
        Pair pair;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        c1023u0.getClass();
        O oR = c1023u0.r();
        String string = null;
        if (z10) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            C1023u0 c1023u1 = (C1023u0) x9.f16104r;
            C0985h0 c0985h0 = c1023u1.f17583v;
            C1023u0.k(c0985h0);
            if (c0985h0.f17402v != null) {
                C0985h0 c0985h1 = c1023u1.f17583v;
                C1023u0.k(c0985h1);
                C0982g0 c0982g0 = c0985h1.f17402v;
                C0985h0 c0985h2 = (C0985h0) c0982g0.f17366e;
                c0985h2.o();
                c0985h2.o();
                long j = ((C0985h0) c0982g0.f17366e).s().getLong((String) c0982g0.f17363b, 0L);
                if (j == 0) {
                    c0982g0.b();
                    jAbs = 0;
                } else {
                    ((C1023u0) c0985h2.f16104r).f17564B.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j10 = c0982g0.f17362a;
                if (jAbs < j10) {
                    pair = null;
                } else if (jAbs > j10 + j10) {
                    c0982g0.b();
                    pair = null;
                } else {
                    String string2 = c0985h2.s().getString((String) c0982g0.f17365d, null);
                    long j11 = c0985h2.s().getLong((String) c0982g0.f17364c, 0L);
                    c0982g0.b();
                    pair = (string2 == null || j11 <= 0) ? C0985h0.Q : new Pair(string2, Long.valueOf(j11));
                }
                if (pair != null && pair != C0985h0.Q) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                    sb.append(strValueOf);
                    sb.append(":");
                    sb.append(str);
                    string = sb.toString();
                }
            }
        }
        return oR.s(string);
    }

    public final boolean F() {
        o();
        p();
        return this.f17552u != null;
    }

    /* JADX WARN: Code duplicated, block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #57 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:420:0x0470 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x045c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0477  */
    /* JADX WARN: Code duplicated, block: B:274:0x047c A[PHI: r5 r6 r24 r25 r27 r37 r38
      0x047c: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
      (r5v12 android.database.sqlite.SQLiteDatabase)
      (r5v13 android.database.sqlite.SQLiteDatabase)
      (r5v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:288:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:294:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:301:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:303:0x050d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0515  */
    /* JADX WARN: Code duplicated, block: B:308:0x059a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:323:0x05d4 A[Catch: RemoteException -> 0x0627, TRY_LEAVE, TryCatch #6 {RemoteException -> 0x0627, blocks: (B:321:0x05cf, B:323:0x05d4), top: B:392:0x05cf }] */
    /* JADX WARN: Code duplicated, block: B:332:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:346:0x0629  */
    /* JADX WARN: Code duplicated, block: B:351:0x0640  */
    /* JADX WARN: Code duplicated, block: B:355:0x0648  */
    /* JADX WARN: Code duplicated, block: B:357:0x0669  */
    /* JADX WARN: Code duplicated, block: B:363:0x0687  */
    /* JADX WARN: Code duplicated, block: B:369:0x069e  */
    /* JADX WARN: Code duplicated, block: B:377:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:406:0x059c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x05e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0675 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x068b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x04a6 A[SYNTHETIC] */
    public final void G(J j, V6.a aVar, X1 x9) throws Throwable {
        ArrayList arrayList;
        C1023u0 c1023u0;
        Context context;
        X x10;
        int i10;
        SQLiteDatabase sQLiteDatabaseU;
        int i11;
        int i12;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j10;
        String str;
        String[] strArr;
        int i13;
        long j11;
        String string;
        F f3;
        C1019t c1019tCreateFromParcel;
        int i14;
        C0975e c0975eCreateFromParcel;
        S1 s1CreateFromParcel;
        int size;
        String str2;
        boolean zY;
        int size2;
        int i15;
        P p10;
        V6.a aVar2;
        F f7;
        C1023u0 c1023u1;
        X x11;
        int i16;
        String str3;
        long jElapsedRealtime;
        long j12;
        long jCurrentTimeMillis;
        Context context2;
        String str4;
        o();
        p();
        A();
        C1023u0 c1023u2 = (C1023u0) this.f16104r;
        c1023u2.getClass();
        Context context3 = c1023u2.f17579r;
        X x12 = c1023u2.f17584w;
        Y6.a aVar3 = c1023u2.f17564B;
        C0981g c0981g = c1023u2.f17582u;
        X1 x13 = x9;
        int i17 = 100;
        int i18 = 0;
        for (int i19 = 100; i18 < 1001 && i17 == i19; i19 = 100) {
            ArrayList arrayList2 = new ArrayList();
            Q qO = c1023u2.o();
            int i20 = i19;
            String str5 = "entry";
            String str6 = "type";
            String str7 = "rowid";
            Y6.a aVar4 = aVar3;
            C1023u0 c1023u3 = (C1023u0) qO.f16104r;
            qO.o();
            int i21 = i18;
            if (qO.f17072u) {
                c1023u0 = c1023u2;
                context = context3;
                x10 = x12;
            } else {
                arrayList = new ArrayList();
                c1023u0 = c1023u2;
                if (((C1023u0) qO.f16104r).f17579r.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i22 = 5;
                    context = context3;
                    x10 = x12;
                    int i23 = 0;
                    int i24 = 5;
                    while (true) {
                        if (i23 < i22) {
                            try {
                                sQLiteDatabaseU = qO.u();
                                if (sQLiteDatabaseU == null) {
                                    try {
                                        try {
                                            qO.f17072u = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseU = sQLiteDatabaseU;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseU != null) {
                                                sQLiteDatabaseU.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i11 = i23;
                                        i12 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i24);
                                            i24 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseU != null) {
                                                sQLiteDatabaseU.close();
                                            }
                                            i23 = i11 + 1;
                                            i22 = i12;
                                            str6 = str6;
                                            str5 = str5;
                                            str7 = str7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseU != null) {
                                                sQLiteDatabaseU.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e10) {
                                        e = e10;
                                        i11 = i23;
                                        i12 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        X x14 = c1023u3.f17584w;
                                        C1023u0.m(x14);
                                        x14.f17182w.b(e, "Error reading entries from local database");
                                        qO.f17072u = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseU != null) {
                                            sQLiteDatabaseU.close();
                                        }
                                        i23 = i11 + 1;
                                        i22 = i12;
                                        str6 = str6;
                                        str5 = str5;
                                        str7 = str7;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        i11 = i23;
                                        i12 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseU != null) {
                                            sQLiteDatabaseU.endTransaction();
                                        }
                                        X x15 = c1023u3.f17584w;
                                        C1023u0.m(x15);
                                        x15.f17182w.b(e, "Error reading entries from local database");
                                        qO.f17072u = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseU != null) {
                                            sQLiteDatabaseU.close();
                                        }
                                        i23 = i11 + 1;
                                        i22 = i12;
                                        str6 = str6;
                                        str5 = str5;
                                        str7 = str7;
                                    }
                                } else {
                                    sQLiteDatabaseU.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseU.query("messages", new String[]{str7}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j13 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i11 = i23;
                                                try {
                                                    j10 = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        i12 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i24);
                                                        i24 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseU != null) {
                                                            sQLiteDatabaseU.close();
                                                        }
                                                        i23 = i11 + 1;
                                                        i22 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    } catch (SQLiteFullException e12) {
                                                        e = e12;
                                                        i12 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        X x16 = c1023u3.f17584w;
                                                        C1023u0.m(x16);
                                                        x16.f17182w.b(e, "Error reading entries from local database");
                                                        qO.f17072u = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseU != null) {
                                                            sQLiteDatabaseU.close();
                                                        }
                                                        i23 = i11 + 1;
                                                        i22 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        i12 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseU != null) {
                                                            sQLiteDatabaseU.endTransaction();
                                                        }
                                                        X x17 = c1023u3.f17584w;
                                                        C1023u0.m(x17);
                                                        x17.f17182w.b(e, "Error reading entries from local database");
                                                        qO.f17072u = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseU != null) {
                                                            sQLiteDatabaseU.close();
                                                        }
                                                        i23 = i11 + 1;
                                                        i22 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i12 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i24);
                                                            i24 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseU != null) {
                                                                sQLiteDatabaseU.close();
                                                            }
                                                            i23 = i11 + 1;
                                                            i22 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (SQLiteFullException e14) {
                                                            e = e14;
                                                            cursorQuery = null;
                                                            X x18 = c1023u3.f17584w;
                                                            C1023u0.m(x18);
                                                            x18.f17182w.b(e, "Error reading entries from local database");
                                                            qO.f17072u = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseU != null) {
                                                                sQLiteDatabaseU.close();
                                                            }
                                                            i23 = i11 + 1;
                                                            i22 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseU != null) {
                                                                sQLiteDatabaseU.endTransaction();
                                                            }
                                                            X x19 = c1023u3.f17584w;
                                                            C1023u0.m(x19);
                                                            x19.f17182w.b(e, "Error reading entries from local database");
                                                            qO.f17072u = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseU != null) {
                                                                sQLiteDatabaseU.close();
                                                            }
                                                            i23 = i11 + 1;
                                                            i22 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseU != null) {
                                                                sQLiteDatabaseU.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i11 = i23;
                                                cursorQuery2.close();
                                                j10 = -1;
                                            }
                                            if (j10 != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j10)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str7, str6, str5};
                                                C0981g c0981g2 = c1023u3.f17582u;
                                                F f10 = G.f16936c1;
                                                str7 = str7;
                                                try {
                                                    try {
                                                        int i25 = 4;
                                                        int i26 = 3;
                                                        if (c0981g2.y(null, f10)) {
                                                            i13 = 5;
                                                            try {
                                                                strArr2 = new String[]{str7, str6, str5, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i12 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i24);
                                                                i24 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.close();
                                                                }
                                                                i23 = i11 + 1;
                                                                i22 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e16) {
                                                                e = e16;
                                                                i12 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                X x110 = c1023u3.f17584w;
                                                                C1023u0.m(x110);
                                                                x110.f17182w.b(e, "Error reading entries from local database");
                                                                qO.f17072u = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.close();
                                                                }
                                                                i23 = i11 + 1;
                                                                i22 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteException e17) {
                                                                e = e17;
                                                                i12 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.endTransaction();
                                                                }
                                                                X x111 = c1023u3.f17584w;
                                                                C1023u0.m(x111);
                                                                x111.f17182w.b(e, "Error reading entries from local database");
                                                                qO.f17072u = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.close();
                                                                }
                                                                i23 = i11 + 1;
                                                                i22 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            }
                                                        } else {
                                                            i13 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseU.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i20));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j13 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i27 = cursorQuery.getInt(1);
                                                                                str6 = str6;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str5 = str5;
                                                                                    try {
                                                                                        if (c1023u3.f17582u.y(null, f10)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i26);
                                                                                                j11 = cursorQuery.getLong(i25);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                i12 = 5;
                                                                                                SystemClock.sleep(i24);
                                                                                                i24 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseU != null) {
                                                                                                    sQLiteDatabaseU.close();
                                                                                                }
                                                                                                i23 = i11 + 1;
                                                                                                i22 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteFullException e18) {
                                                                                                e = e18;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                i12 = 5;
                                                                                                X x112 = c1023u3.f17584w;
                                                                                                C1023u0.m(x112);
                                                                                                x112.f17182w.b(e, "Error reading entries from local database");
                                                                                                qO.f17072u = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseU != null) {
                                                                                                    sQLiteDatabaseU.close();
                                                                                                }
                                                                                                i23 = i11 + 1;
                                                                                                i22 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteException e19) {
                                                                                                e = e19;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                i12 = 5;
                                                                                                if (sQLiteDatabaseU != null) {
                                                                                                    sQLiteDatabaseU.endTransaction();
                                                                                                }
                                                                                                X x113 = c1023u3.f17584w;
                                                                                                C1023u0.m(x113);
                                                                                                x113.f17182w.b(e, "Error reading entries from local database");
                                                                                                qO.f17072u = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseU != null) {
                                                                                                    sQLiteDatabaseU.close();
                                                                                                }
                                                                                                i23 = i11 + 1;
                                                                                                i22 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            }
                                                                                        } else {
                                                                                            j11 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i27 == 0) {
                                                                                            f3 = f10;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            C1022u c1022uCreateFromParcel = C1022u.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (c1022uCreateFromParcel != null) {
                                                                                                                arrayList.add(new P(c1022uCreateFromParcel, string, j11));
                                                                                                            }
                                                                                                        } catch (V6.b unused6) {
                                                                                                            X x20 = c1023u3.f17584w;
                                                                                                            C1023u0.m(x20);
                                                                                                            x20.f17182w.a("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th5;
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseU != null) {
                                                                                                        sQLiteDatabaseU.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                i12 = 5;
                                                                                                SystemClock.sleep(i24);
                                                                                                i24 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseU != null) {
                                                                                                    sQLiteDatabaseU.close();
                                                                                                }
                                                                                                i23 = i11 + 1;
                                                                                                i22 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteFullException e20) {
                                                                                                e = e20;
                                                                                                sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                i12 = 5;
                                                                                                X x114 = c1023u3.f17584w;
                                                                                                C1023u0.m(x114);
                                                                                                x114.f17182w.b(e, "Error reading entries from local database");
                                                                                                qO.f17072u = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseU != null) {
                                                                                                    sQLiteDatabaseU.close();
                                                                                                }
                                                                                                i23 = i11 + 1;
                                                                                                i22 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteException e21) {
                                                                                                e = e21;
                                                                                                sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                i12 = 5;
                                                                                                if (sQLiteDatabaseU != null && sQLiteDatabaseU.inTransaction()) {
                                                                                                    sQLiteDatabaseU.endTransaction();
                                                                                                }
                                                                                                X x115 = c1023u3.f17584w;
                                                                                                C1023u0.m(x115);
                                                                                                x115.f17182w.b(e, "Error reading entries from local database");
                                                                                                qO.f17072u = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseU != null) {
                                                                                                    sQLiteDatabaseU.close();
                                                                                                }
                                                                                                i23 = i11 + 1;
                                                                                                i22 = i12;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            }
                                                                                        } else {
                                                                                            f3 = f10;
                                                                                            if (i27 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        s1CreateFromParcel = S1.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th7) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th7;
                                                                                                    }
                                                                                                } catch (V6.b unused8) {
                                                                                                    X x21 = c1023u3.f17584w;
                                                                                                    C1023u0.m(x21);
                                                                                                    x21.f17182w.a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    s1CreateFromParcel = null;
                                                                                                }
                                                                                                if (s1CreateFromParcel != null) {
                                                                                                    arrayList.add(new P(s1CreateFromParcel, string, j11));
                                                                                                }
                                                                                            } else {
                                                                                                if (i27 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            c0975eCreateFromParcel = C0975e.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (V6.b unused9) {
                                                                                                            X x22 = c1023u3.f17584w;
                                                                                                            C1023u0.m(x22);
                                                                                                            x22.f17182w.a("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            c0975eCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (c0975eCreateFromParcel != null) {
                                                                                                            arrayList.add(new P(c0975eCreateFromParcel, string, j11));
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } else if (i27 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    c1019tCreateFromParcel = C1019t.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (c1019tCreateFromParcel != null) {
                                                                                                                            arrayList.add(new P(c1019tCreateFromParcel, string, j11));
                                                                                                                        }
                                                                                                                        i14 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                                        i12 = 5;
                                                                                                                        SystemClock.sleep(i24);
                                                                                                                        i24 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                                            sQLiteDatabaseU.close();
                                                                                                                        }
                                                                                                                        i23 = i11 + 1;
                                                                                                                        i22 = i12;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteFullException e22) {
                                                                                                                        e = e22;
                                                                                                                        sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                                        i12 = 5;
                                                                                                                        X x116 = c1023u3.f17584w;
                                                                                                                        C1023u0.m(x116);
                                                                                                                        x116.f17182w.b(e, "Error reading entries from local database");
                                                                                                                        qO.f17072u = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                                            sQLiteDatabaseU.close();
                                                                                                                        }
                                                                                                                        i23 = i11 + 1;
                                                                                                                        i22 = i12;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteException e23) {
                                                                                                                        e = e23;
                                                                                                                        sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                                        i12 = 5;
                                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                                            sQLiteDatabaseU.endTransaction();
                                                                                                                        }
                                                                                                                        X x117 = c1023u3.f17584w;
                                                                                                                        C1023u0.m(x117);
                                                                                                                        x117.f17182w.b(e, "Error reading entries from local database");
                                                                                                                        qO.f17072u = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                                            sQLiteDatabaseU.close();
                                                                                                                        }
                                                                                                                        i23 = i11 + 1;
                                                                                                                        i22 = i12;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (V6.b unused11) {
                                                                                                                X x23 = c1023u3.f17584w;
                                                                                                                C1023u0.m(x23);
                                                                                                                x23.f17182w.a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                c1019tCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (V6.b unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                        i12 = 5;
                                                                                                        SystemClock.sleep(i24);
                                                                                                        i24 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                            sQLiteDatabaseU.close();
                                                                                                        }
                                                                                                        i23 = i11 + 1;
                                                                                                        i22 = i12;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteFullException e24) {
                                                                                                        e = e24;
                                                                                                        sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                        i12 = 5;
                                                                                                        X x118 = c1023u3.f17584w;
                                                                                                        C1023u0.m(x118);
                                                                                                        x118.f17182w.b(e, "Error reading entries from local database");
                                                                                                        qO.f17072u = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                            sQLiteDatabaseU.close();
                                                                                                        }
                                                                                                        i23 = i11 + 1;
                                                                                                        i22 = i12;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteException e25) {
                                                                                                        e = e25;
                                                                                                        sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                                        i12 = 5;
                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                            sQLiteDatabaseU.endTransaction();
                                                                                                        }
                                                                                                        X x119 = c1023u3.f17584w;
                                                                                                        C1023u0.m(x119);
                                                                                                        x119.f17182w.b(e, "Error reading entries from local database");
                                                                                                        qO.f17072u = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseU != null) {
                                                                                                            sQLiteDatabaseU.close();
                                                                                                        }
                                                                                                        i23 = i11 + 1;
                                                                                                        i22 = i12;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    }
                                                                                                } else {
                                                                                                    i14 = 3;
                                                                                                    if (i27 == 3) {
                                                                                                        X x24 = c1023u3.f17584w;
                                                                                                        C1023u0.m(x24);
                                                                                                        x24.f17178E.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        X x25 = c1023u3.f17584w;
                                                                                                        C1023u0.m(x25);
                                                                                                        x25.f17182w.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i26 = i14;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                cursorQuery = cursorQuery;
                                                                                                f10 = f3;
                                                                                                i25 = 4;
                                                                                            }
                                                                                        }
                                                                                        i14 = 3;
                                                                                        i26 = i14;
                                                                                        str6 = str6;
                                                                                        str5 = str5;
                                                                                        cursorQuery = cursorQuery;
                                                                                        f10 = f3;
                                                                                        i25 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e26) {
                                                                                        e = e26;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e27) {
                                                                                        e = e27;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                    i12 = 5;
                                                                                    SystemClock.sleep(i24);
                                                                                    i24 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseU != null) {
                                                                                        sQLiteDatabaseU.close();
                                                                                    }
                                                                                    i23 = i11 + 1;
                                                                                    i22 = i12;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteFullException e28) {
                                                                                    e = e28;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                    i12 = 5;
                                                                                    X x1110 = c1023u3.f17584w;
                                                                                    C1023u0.m(x1110);
                                                                                    x1110.f17182w.b(e, "Error reading entries from local database");
                                                                                    qO.f17072u = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseU != null) {
                                                                                        sQLiteDatabaseU.close();
                                                                                    }
                                                                                    i23 = i11 + 1;
                                                                                    i22 = i12;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteException e29) {
                                                                                    e = e29;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseU = sQLiteDatabaseU;
                                                                                    i12 = 5;
                                                                                    if (sQLiteDatabaseU != null) {
                                                                                        sQLiteDatabaseU.endTransaction();
                                                                                    }
                                                                                    X x1111 = c1023u3.f17584w;
                                                                                    C1023u0.m(x1111);
                                                                                    x1111.f17182w.b(e, "Error reading entries from local database");
                                                                                    qO.f17072u = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseU != null) {
                                                                                        sQLiteDatabaseU.close();
                                                                                    }
                                                                                    i23 = i11 + 1;
                                                                                    i22 = i12;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str6 = str6;
                                                                            } catch (SQLiteFullException e30) {
                                                                                e = e30;
                                                                                str6 = str6;
                                                                            } catch (SQLiteException e31) {
                                                                                e = e31;
                                                                                str6 = str6;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteFullException e32) {
                                                                            e = e32;
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteException e33) {
                                                                            e = e33;
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteFullException e34) {
                                                                    e = e34;
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteException e35) {
                                                                    e = e35;
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            i10 = 0;
                                                            sQLiteDatabaseU = sQLiteDatabaseU;
                                                            try {
                                                                if (sQLiteDatabaseU.delete("messages", "rowid <= ?", new String[]{Long.toString(j13)}) < arrayList.size()) {
                                                                    X x26 = c1023u3.f17584w;
                                                                    C1023u0.m(x26);
                                                                    x26.f17182w.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseU.setTransactionSuccessful();
                                                                sQLiteDatabaseU.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseU.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i12 = 5;
                                                                SystemClock.sleep(i24);
                                                                i24 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.close();
                                                                }
                                                                i23 = i11 + 1;
                                                                i22 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e36) {
                                                                e = e36;
                                                                i12 = 5;
                                                                X x1112 = c1023u3.f17584w;
                                                                C1023u0.m(x1112);
                                                                x1112.f17182w.b(e, "Error reading entries from local database");
                                                                qO.f17072u = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.close();
                                                                }
                                                                i23 = i11 + 1;
                                                                i22 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteException e37) {
                                                                e = e37;
                                                                i12 = 5;
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.endTransaction();
                                                                }
                                                                X x1113 = c1023u3.f17584w;
                                                                C1023u0.m(x1113);
                                                                x1113.f17182w.b(e, "Error reading entries from local database");
                                                                qO.f17072u = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseU != null) {
                                                                    sQLiteDatabaseU.close();
                                                                }
                                                                i23 = i11 + 1;
                                                                i22 = i12;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str5 = str5;
                                                            sQLiteDatabaseU = sQLiteDatabaseU;
                                                            str6 = str6;
                                                            i12 = i13;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i24);
                                                            i24 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseU != null) {
                                                                sQLiteDatabaseU.close();
                                                            }
                                                            i23 = i11 + 1;
                                                            i22 = i12;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str5 = str5;
                                                        sQLiteDatabaseU = sQLiteDatabaseU;
                                                        str6 = str6;
                                                        i12 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i24);
                                                        i24 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseU != null) {
                                                            sQLiteDatabaseU.close();
                                                        }
                                                        i23 = i11 + 1;
                                                        i22 = i12;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    }
                                                } catch (SQLiteFullException e38) {
                                                    e = e38;
                                                    str5 = str5;
                                                    sQLiteDatabaseU = sQLiteDatabaseU;
                                                    str6 = str6;
                                                    i12 = 5;
                                                    cursorQuery = null;
                                                    X x1114 = c1023u3.f17584w;
                                                    C1023u0.m(x1114);
                                                    x1114.f17182w.b(e, "Error reading entries from local database");
                                                    qO.f17072u = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseU != null) {
                                                        sQLiteDatabaseU.close();
                                                    }
                                                    i23 = i11 + 1;
                                                    i22 = i12;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str7 = str7;
                                                } catch (SQLiteException e39) {
                                                    e = e39;
                                                    str5 = str5;
                                                    sQLiteDatabaseU = sQLiteDatabaseU;
                                                    str6 = str6;
                                                    i12 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseU != null) {
                                                        sQLiteDatabaseU.endTransaction();
                                                    }
                                                    X x1115 = c1023u3.f17584w;
                                                    C1023u0.m(x1115);
                                                    x1115.f17182w.b(e, "Error reading entries from local database");
                                                    qO.f17072u = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseU != null) {
                                                        sQLiteDatabaseU.close();
                                                    }
                                                    i23 = i11 + 1;
                                                    i22 = i12;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str7 = str7;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str7 = str7;
                                            } catch (SQLiteFullException e40) {
                                                e = e40;
                                                str7 = str7;
                                            } catch (SQLiteException e41) {
                                                e = e41;
                                                str7 = str7;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i11 = i23;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i11 = i23;
                                        i12 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                str7 = str7;
                                i11 = i23;
                                str6 = str6;
                                str5 = str5;
                                i12 = 5;
                                sQLiteDatabaseU = null;
                            } catch (SQLiteFullException e42) {
                                e = e42;
                                str7 = str7;
                                i11 = i23;
                                str6 = str6;
                                str5 = str5;
                                i12 = 5;
                                sQLiteDatabaseU = null;
                            } catch (SQLiteException e43) {
                                e = e43;
                                str7 = str7;
                                i11 = i23;
                                str6 = str6;
                                str5 = str5;
                                i12 = 5;
                                sQLiteDatabaseU = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseU = null;
                            }
                        } else {
                            i10 = 0;
                            X x27 = c1023u3.f17584w;
                            C1023u0.m(x27);
                            x27.f17185z.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i23 = i11 + 1;
                        i22 = i12;
                        str6 = str6;
                        str5 = str5;
                        str7 = str7;
                    }
                } else {
                    context = context3;
                    x10 = x12;
                    i10 = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i10;
                }
                if (aVar != 0 && size < i20) {
                    arrayList2.add(new P(aVar, x13.f17206t, x13.f17187A));
                }
                str2 = null;
                zY = c0981g.y(null, G.f16912P0);
                size2 = arrayList2.size();
                i15 = i10;
                while (i15 < size2) {
                    p10 = (P) arrayList2.get(i15);
                    aVar2 = p10.f17061a;
                    f7 = G.f16936c1;
                    if (c0981g.y(str2, f7)) {
                        str4 = p10.f17062b;
                        if (!TextUtils.isEmpty(str4)) {
                            x13 = new X1(x13.f17204r, x13.f17205s, str4, p10.f17063c, x13.f17207u, x13.f17208v, x13.f17209w, x13.f17210x, x13.f17211y, x13.f17212z, x13.f17188B, x13.f17189C, x13.f17190D, x13.f17191E, x13.f17192F, x13.f17193G, x13.f17194H, x13.f17195I, x13.f17196J, x13.f17197K, x13.f17198L, x13.f17199M, x13.f17200N, x13.f17201O, x13.f17202P, x13.Q, x13.R, x13.S, x13.T, x13.U, x13.f17203V);
                        }
                    }
                    if (aVar2 instanceof C1022u) {
                        if (zY) {
                            try {
                                aVar4.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                try {
                                    aVar4.getClass();
                                    j12 = jCurrentTimeMillis;
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                } catch (RemoteException e44) {
                                    e = e44;
                                    j12 = jCurrentTimeMillis;
                                    jElapsedRealtime = 0;
                                    c1023u1 = c1023u0;
                                    context2 = context;
                                    x11 = x10;
                                    i16 = size;
                                    C1023u0.m(x11);
                                    x11.f17182w.b(e, "Failed to send event to the service");
                                    if (zY) {
                                        if (p074h0.i.f16420w == null) {
                                            p074h0.i.f16420w = new p074h0.i(context2, c1023u1);
                                        }
                                        p074h0.i iVar = p074h0.i.f16420w;
                                        aVar4.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        aVar4.getClass();
                                        iVar.N(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis2);
                                    }
                                    context = context2;
                                    str3 = null;
                                    i15++;
                                    c1023u0 = c1023u1;
                                    str2 = str3;
                                    size = i16;
                                    x10 = x11;
                                }
                            } catch (RemoteException e45) {
                                e = e45;
                                jElapsedRealtime = 0;
                                j12 = 0;
                            }
                        } else {
                            jElapsedRealtime = 0;
                            j12 = 0;
                        }
                        try {
                            try {
                                j.j0((C1022u) aVar2, x13);
                                if (zY) {
                                    C1023u0.m(x10);
                                    x11 = x10;
                                    try {
                                        x11.f17178E.a("Logging telemetry for logEvent from database");
                                        if (p074h0.i.f16420w == null) {
                                            try {
                                                c1023u1 = c1023u0;
                                                context2 = context;
                                                try {
                                                    p074h0.i.f16420w = new p074h0.i(context2, c1023u1);
                                                } catch (RemoteException e46) {
                                                    e = e46;
                                                    i16 = size;
                                                    C1023u0.m(x11);
                                                    x11.f17182w.b(e, "Failed to send event to the service");
                                                    if (zY && j12 != 0) {
                                                        if (p074h0.i.f16420w == null) {
                                                            p074h0.i.f16420w = new p074h0.i(context2, c1023u1);
                                                        }
                                                        p074h0.i iVar2 = p074h0.i.f16420w;
                                                        aVar4.getClass();
                                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                        aVar4.getClass();
                                                        iVar2.N(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis3);
                                                    }
                                                    context = context2;
                                                    str3 = null;
                                                    i15++;
                                                    c1023u0 = c1023u1;
                                                    str2 = str3;
                                                    size = i16;
                                                    x10 = x11;
                                                }
                                            } catch (RemoteException e47) {
                                                e = e47;
                                                c1023u1 = c1023u0;
                                                context2 = context;
                                            }
                                        } else {
                                            c1023u1 = c1023u0;
                                            context2 = context;
                                        }
                                        p074h0.i iVar3 = p074h0.i.f16420w;
                                        aVar4.getClass();
                                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                                        aVar4.getClass();
                                        i16 = size;
                                        try {
                                            iVar3.N(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis4);
                                        } catch (RemoteException e48) {
                                            e = e48;
                                            C1023u0.m(x11);
                                            x11.f17182w.b(e, "Failed to send event to the service");
                                            if (zY) {
                                                if (p074h0.i.f16420w == null) {
                                                    p074h0.i.f16420w = new p074h0.i(context2, c1023u1);
                                                }
                                                p074h0.i iVar4 = p074h0.i.f16420w;
                                                aVar4.getClass();
                                                long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                aVar4.getClass();
                                                iVar4.N(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis5);
                                            }
                                        }
                                    } catch (RemoteException e49) {
                                        e = e49;
                                        i16 = size;
                                        c1023u1 = c1023u0;
                                        context2 = context;
                                    }
                                    context = context2;
                                } else {
                                    c1023u1 = c1023u0;
                                    x11 = x10;
                                    i16 = size;
                                }
                            } catch (RemoteException e50) {
                                e = e50;
                                c1023u1 = c1023u0;
                                context2 = context;
                                x11 = x10;
                                i16 = size;
                                C1023u0.m(x11);
                                x11.f17182w.b(e, "Failed to send event to the service");
                                if (zY) {
                                    if (p074h0.i.f16420w == null) {
                                        p074h0.i.f16420w = new p074h0.i(context2, c1023u1);
                                    }
                                    p074h0.i iVar5 = p074h0.i.f16420w;
                                    aVar4.getClass();
                                    long jCurrentTimeMillis6 = System.currentTimeMillis();
                                    aVar4.getClass();
                                    iVar5.N(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis6);
                                }
                                context = context2;
                                str3 = null;
                                i15++;
                                c1023u0 = c1023u1;
                                str2 = str3;
                                size = i16;
                                x10 = x11;
                            }
                        } catch (RemoteException e51) {
                            e = e51;
                        }
                    } else {
                        c1023u1 = c1023u0;
                        x11 = x10;
                        i16 = size;
                        if (aVar2 instanceof S1) {
                            try {
                                j.Z((S1) aVar2, x13);
                            } catch (RemoteException e52) {
                                C1023u0.m(x11);
                                x11.f17182w.b(e52, "Failed to send user property to the service");
                            }
                        } else {
                            if (aVar2 instanceof C0975e) {
                                try {
                                    j.t0((C0975e) aVar2, x13);
                                } catch (RemoteException e53) {
                                    C1023u0.m(x11);
                                    x11.f17182w.b(e53, "Failed to send conditional user property to the service");
                                }
                            } else {
                                str3 = null;
                                if (c0981g.y(null, f7) || !(aVar2 instanceof C1019t)) {
                                    C1023u0.m(x11);
                                    x11.f17182w.a("Discarding data. Unrecognized parcel type.");
                                } else {
                                    try {
                                        j.r0(((C1019t) aVar2).e(), x13);
                                    } catch (RemoteException e54) {
                                        C1023u0.m(x11);
                                        x11.f17182w.b(e54, "Failed to send default event parameters to the service");
                                    }
                                }
                            }
                            i15++;
                            c1023u0 = c1023u1;
                            str2 = str3;
                            size = i16;
                            x10 = x11;
                        }
                    }
                    str3 = null;
                    i15++;
                    c1023u0 = c1023u1;
                    str2 = str3;
                    size = i16;
                    x10 = x11;
                }
                i18 = i21 + 1;
                x12 = x10;
                c1023u2 = c1023u0;
                aVar3 = aVar4;
                context3 = context;
                i17 = size;
            }
            i10 = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i10;
            }
            if (aVar != 0) {
                arrayList2.add(new P(aVar, x13.f17206t, x13.f17187A));
            }
            str2 = null;
            zY = c0981g.y(null, G.f16912P0);
            size2 = arrayList2.size();
            i15 = i10;
            while (i15 < size2) {
                p10 = (P) arrayList2.get(i15);
                aVar2 = p10.f17061a;
                f7 = G.f16936c1;
                if (c0981g.y(str2, f7)) {
                    str4 = p10.f17062b;
                    if (!TextUtils.isEmpty(str4)) {
                        x13 = new X1(x13.f17204r, x13.f17205s, str4, p10.f17063c, x13.f17207u, x13.f17208v, x13.f17209w, x13.f17210x, x13.f17211y, x13.f17212z, x13.f17188B, x13.f17189C, x13.f17190D, x13.f17191E, x13.f17192F, x13.f17193G, x13.f17194H, x13.f17195I, x13.f17196J, x13.f17197K, x13.f17198L, x13.f17199M, x13.f17200N, x13.f17201O, x13.f17202P, x13.Q, x13.R, x13.S, x13.T, x13.U, x13.f17203V);
                    }
                }
                if (aVar2 instanceof C1022u) {
                    if (zY) {
                        aVar4.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis();
                        aVar4.getClass();
                        j12 = jCurrentTimeMillis;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = 0;
                        j12 = 0;
                    }
                    j.j0((C1022u) aVar2, x13);
                    if (zY) {
                        C1023u0.m(x10);
                        x11 = x10;
                        x11.f17178E.a("Logging telemetry for logEvent from database");
                        if (p074h0.i.f16420w == null) {
                            c1023u1 = c1023u0;
                            context2 = context;
                            p074h0.i.f16420w = new p074h0.i(context2, c1023u1);
                        } else {
                            c1023u1 = c1023u0;
                            context2 = context;
                        }
                        p074h0.i iVar6 = p074h0.i.f16420w;
                        aVar4.getClass();
                        long jCurrentTimeMillis7 = System.currentTimeMillis();
                        aVar4.getClass();
                        i16 = size;
                        iVar6.N(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis7);
                        context = context2;
                    } else {
                        c1023u1 = c1023u0;
                        x11 = x10;
                        i16 = size;
                    }
                } else {
                    c1023u1 = c1023u0;
                    x11 = x10;
                    i16 = size;
                    if (aVar2 instanceof S1) {
                        j.Z((S1) aVar2, x13);
                    } else {
                        if (aVar2 instanceof C0975e) {
                            j.t0((C0975e) aVar2, x13);
                        } else {
                            str3 = null;
                            if (c0981g.y(null, f7)) {
                                C1023u0.m(x11);
                                x11.f17182w.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                C1023u0.m(x11);
                                x11.f17182w.a("Discarding data. Unrecognized parcel type.");
                            }
                        }
                        i15++;
                        c1023u0 = c1023u1;
                        str2 = str3;
                        size = i16;
                        x10 = x11;
                    }
                }
                str3 = null;
                i15++;
                c1023u0 = c1023u1;
                str2 = str3;
                size = i16;
                x10 = x11;
            }
            i18 = i21 + 1;
            x12 = x10;
            c1023u2 = c1023u0;
            aVar3 = aVar4;
            context3 = context;
            i17 = size;
        }
    }

    public final void H(C0975e c0975e) {
        boolean zV;
        o();
        p();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        c1023u0.getClass();
        Q qO = c1023u0.o();
        C1023u0 c1023u1 = (C1023u0) qO.f16104r;
        C1023u0.k(c1023u1.f17587z);
        byte[] bArrU = V1.U(c0975e);
        if (bArrU.length > 131072) {
            X x9 = c1023u1.f17584w;
            C1023u0.m(x9);
            x9.f17183x.a("Conditional user property too long for local database. Sending directly to service");
            zV = false;
        } else {
            zV = qO.v(2, bArrU);
        }
        C(new RunnableC1004n1(this, E(true), zV, new C0975e(c0975e)));
    }

    @Override // i7.I
    public final boolean r() {
        return false;
    }

    public final void s(AtomicReference atomicReference) {
        o();
        p();
        C(new F1.o(this, atomicReference, E(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public final void t(Bundle bundle) {
        boolean z10;
        boolean zV;
        o();
        p();
        C1019t c1019t = new C1019t(bundle);
        A();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (c1023u0.f17582u.y(null, G.f16936c1)) {
            Q qO = c1023u0.o();
            C1023u0 c1023u1 = (C1023u0) qO.f16104r;
            V1 v10 = c1023u1.f17587z;
            X x9 = c1023u1.f17584w;
            C1023u0.k(v10);
            byte[] bArrU = V1.U(c1019t);
            if (bArrU == null) {
                C1023u0.m(x9);
                x9.f17183x.a("Null default event parameters; not writing to database");
            } else {
                if (bArrU.length > 131072) {
                    C1023u0.m(x9);
                    x9.f17183x.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zV = qO.v(4, bArrU);
                }
                if (zV) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            zV = false;
            if (zV) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        C(new O0(this, E(false), z10, c1019t, bundle));
    }

    public final void u() {
        o();
        p();
        if (F()) {
            return;
        }
        if (v()) {
            this.f17551t.b();
            return;
        }
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (c1023u0.f17582u.r()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = c1023u0.f17579r.getPackageManager().queryIntentServices(new Intent().setClassName(c1023u0.f17579r, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(c1023u0.f17579r, "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC1018s1 serviceConnectionC1018s1 = this.f17551t;
        C1021t1 c1021t1 = serviceConnectionC1018s1.f17547c;
        c1021t1.o();
        Context context = ((C1023u0) c1021t1.f16104r).f17579r;
        X6.a aVarA = X6.a.a();
        synchronized (serviceConnectionC1018s1) {
            try {
                if (serviceConnectionC1018s1.f17545a) {
                    X x10 = ((C1023u0) serviceConnectionC1018s1.f17547c.f16104r).f17584w;
                    C1023u0.m(x10);
                    x10.f17178E.a("Connection attempt already in progress");
                    return;
                }
                C1021t1 c1021t2 = serviceConnectionC1018s1.f17547c;
                X x11 = ((C1023u0) c1021t2.f16104r).f17584w;
                C1023u0.m(x11);
                x11.f17178E.a("Using local app measurement service");
                serviceConnectionC1018s1.f17545a = true;
                aVarA.c(context, context.getClass().getName(), intent, c1021t2.f17551t, 129, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v() {
        o();
        p();
        if (this.f17553v == null) {
            o();
            p();
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            C0985h0 c0985h0 = c1023u0.f17583v;
            C1023u0.k(c0985h0);
            c0985h0.o();
            boolean z10 = false;
            Boolean boolValueOf = !c0985h0.s().contains("use_service") ? null : Boolean.valueOf(c0985h0.s().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                O oR = ((C1023u0) this.f16104r).r();
                oR.p();
                if (oR.f17041D == 1) {
                    z10 = true;
                } else {
                    X x9 = c1023u0.f17584w;
                    C1023u0.m(x9);
                    x9.f17178E.a("Checking service availability");
                    V1 v10 = c1023u0.f17587z;
                    C1023u0.k(v10);
                    int iB = R6.f.f7246b.b(((C1023u0) v10.f16104r).f17579r, 12451000);
                    if (iB == 0) {
                        X x10 = c1023u0.f17584w;
                        C1023u0.m(x10);
                        x10.f17178E.a("Service available");
                    } else if (iB == 1) {
                        X x11 = c1023u0.f17584w;
                        C1023u0.m(x11);
                        x11.f17178E.a("Service missing");
                    } else if (iB != 2) {
                        if (iB == 3) {
                            X x12 = c1023u0.f17584w;
                            C1023u0.m(x12);
                            x12.f17185z.a("Service disabled");
                        } else if (iB == 9) {
                            X x13 = c1023u0.f17584w;
                            C1023u0.m(x13);
                            x13.f17185z.a("Service invalid");
                        } else if (iB != 18) {
                            X x14 = c1023u0.f17584w;
                            C1023u0.m(x14);
                            x14.f17185z.b(Integer.valueOf(iB), "Unexpected service status");
                        } else {
                            X x15 = c1023u0.f17584w;
                            C1023u0.m(x15);
                            x15.f17185z.a("Service updating");
                        }
                        z11 = false;
                    } else {
                        X x16 = c1023u0.f17584w;
                        C1023u0.m(x16);
                        x16.f17177D.a("Service container out of date");
                        V1 v11 = c1023u0.f17587z;
                        C1023u0.k(v11);
                        if (v11.W() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && c1023u0.f17582u.r()) {
                    X x17 = c1023u0.f17584w;
                    C1023u0.m(x17);
                    x17.f17182w.a("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    C0985h0 c0985h1 = c1023u0.f17583v;
                    C1023u0.k(c0985h1);
                    c0985h1.o();
                    SharedPreferences.Editor editorEdit = c0985h1.s().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.f17553v = Boolean.valueOf(z11);
        }
        return this.f17553v.booleanValue();
    }

    public final void w() {
        o();
        p();
        ServiceConnectionC1018s1 serviceConnectionC1018s1 = this.f17551t;
        if (serviceConnectionC1018s1.f17546b != null && (serviceConnectionC1018s1.f17546b.a() || serviceConnectionC1018s1.f17546b.g())) {
            serviceConnectionC1018s1.f17546b.l();
        }
        serviceConnectionC1018s1.f17546b = null;
        try {
            X6.a.a().b(((C1023u0) this.f16104r).f17579r, serviceConnectionC1018s1);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f17552u = null;
    }

    public final boolean x() {
        o();
        p();
        if (!v()) {
            return true;
        }
        V1 v10 = ((C1023u0) this.f16104r).f17587z;
        C1023u0.k(v10);
        return v10.W() >= ((Integer) G.f16903K0.a(null)).intValue();
    }

    public final boolean y() {
        o();
        p();
        if (!v()) {
            return true;
        }
        V1 v10 = ((C1023u0) this.f16104r).f17587z;
        C1023u0.k(v10);
        return v10.W() >= 241200;
    }

    public final void z(ComponentName componentName) {
        o();
        if (this.f17552u != null) {
            this.f17552u = null;
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17178E.b(componentName, "Disconnected from device MeasurementService");
            o();
            u();
        }
    }
}
