package i7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends I {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f17070v = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0996l f17071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17072u;

    public Q(C1023u0 c1023u0) {
        super(c1023u0);
        this.f17071t = new C0996l(this, ((C1023u0) this.f16104r).f17579r);
    }

    @Override // i7.I
    public final boolean r() {
        return false;
    }

    public final void s() {
        int iDelete;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        try {
            SQLiteDatabase sQLiteDatabaseU = u();
            if (sQLiteDatabaseU == null || (iDelete = sQLiteDatabaseU.delete("messages", null, null)) <= 0) {
                return;
            }
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e10) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(e10, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[PHI: r5
      0x0070: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:32:0x0081, B:28:0x006e, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean t() {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        if (!this.f17072u && c1023u0.f17579r.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseU = u();
                        if (sQLiteDatabaseU != null) {
                            sQLiteDatabaseU.beginTransaction();
                            sQLiteDatabaseU.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseU.setTransactionSuccessful();
                            sQLiteDatabaseU.endTransaction();
                            sQLiteDatabaseU.close();
                            return true;
                        }
                        this.f17072u = true;
                    } catch (SQLiteException e10) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        X x9 = c1023u0.f17584w;
                        C1023u0.m(x9);
                        x9.f17182w.b(e10, "Error deleting app launch break from local database");
                        this.f17072u = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e11) {
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.b(e11, "Error deleting app launch break from local database");
                    this.f17072u = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17185z.a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final SQLiteDatabase u() {
        if (this.f17072u) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f17071t.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f17072u = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
      0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    public final boolean v(int i10, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseU;
        boolean z10;
        boolean z11;
        Cursor cursorRawQuery;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        boolean z12 = false;
        z12 = false;
        if (!this.f17072u) {
            C0981g c0981g = c1023u0.f17582u;
            X x9 = c1023u0.f17584w;
            F f3 = G.f16936c1;
            Cursor cursor = null;
            cursor = null;
            X1 x1S = c0981g.y(null, f3) ? c1023u0.r().s(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (c1023u0.f17582u.y(null, f3) && x1S != null) {
                contentValues.put("app_version", x1S.f17206t);
                contentValues.put("app_version_int", Long.valueOf(x1S.f17187A));
            }
            int i11 = 5;
            int i12 = 0;
            for (int i13 = 5; i12 < i13; i13 = 5) {
                try {
                    sQLiteDatabaseU = u();
                    if (sQLiteDatabaseU == null) {
                        this.f17072u = true;
                    } else {
                        try {
                            sQLiteDatabaseU.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseU.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z12 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseU != null) {
                                            sQLiteDatabaseU.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z10 = z12 ? 1 : 0;
                                    SystemClock.sleep(i11);
                                    i11 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseU != null) {
                                        sQLiteDatabaseU.close();
                                    }
                                    i12++;
                                    z12 = z10;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    z10 = z12 ? 1 : 0;
                                    C1023u0.m(x9);
                                    x9.f17182w.b(e, "Error writing entry; local database full");
                                    this.f17072u = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseU != null) {
                                        sQLiteDatabaseU.close();
                                    }
                                    i12++;
                                    z12 = z10;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                    if (sQLiteDatabaseU != null) {
                                        sQLiteDatabaseU.endTransaction();
                                    }
                                    C1023u0.m(x9);
                                    x9.f17182w.b(e, "Error writing entry to local database");
                                    this.f17072u = z11;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseU != null) {
                                        sQLiteDatabaseU.close();
                                    }
                                    i12++;
                                    z12 = z10;
                                }
                            }
                            if (j >= 100000) {
                                C1023u0.m(x9);
                                x9.f17182w.a("Data loss, local db full");
                                long j10 = 100001 - j;
                                long jDelete = sQLiteDatabaseU.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j10)});
                                if (jDelete != j10) {
                                    C1023u0.m(x9);
                                    V v10 = x9.f17182w;
                                    z10 = z12 ? 1 : 0;
                                    try {
                                        try {
                                            z11 = true;
                                            try {
                                                v10.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j10), Long.valueOf(jDelete), Long.valueOf(j10 - jDelete));
                                            } catch (SQLiteFullException e12) {
                                                e = e12;
                                                C1023u0.m(x9);
                                                x9.f17182w.b(e, "Error writing entry; local database full");
                                                this.f17072u = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseU != null) {
                                                    sQLiteDatabaseU.close();
                                                }
                                                i12++;
                                                z12 = z10;
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                if (sQLiteDatabaseU != null) {
                                                    sQLiteDatabaseU.endTransaction();
                                                }
                                                C1023u0.m(x9);
                                                x9.f17182w.b(e, "Error writing entry to local database");
                                                this.f17072u = z11;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseU != null) {
                                                    sQLiteDatabaseU.close();
                                                }
                                                i12++;
                                                z12 = z10;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i11);
                                            i11 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseU != null) {
                                                sQLiteDatabaseU.close();
                                            }
                                            i12++;
                                            z12 = z10;
                                        }
                                    } catch (SQLiteFullException e14) {
                                        e = e14;
                                        C1023u0.m(x9);
                                        x9.f17182w.b(e, "Error writing entry; local database full");
                                        this.f17072u = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseU != null) {
                                            sQLiteDatabaseU.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        z11 = true;
                                        if (sQLiteDatabaseU != null && sQLiteDatabaseU.inTransaction()) {
                                            sQLiteDatabaseU.endTransaction();
                                        }
                                        C1023u0.m(x9);
                                        x9.f17182w.b(e, "Error writing entry to local database");
                                        this.f17072u = z11;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseU != null) {
                                            sQLiteDatabaseU.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    }
                                } else {
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                }
                            } else {
                                z10 = z12 ? 1 : 0;
                                z11 = true;
                            }
                            sQLiteDatabaseU.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseU.setTransactionSuccessful();
                            sQLiteDatabaseU.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseU.close();
                            return z11;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e16) {
                            e = e16;
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e17) {
                            e = e17;
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseU = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseU = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e19) {
                    e = e19;
                    z10 = z12 ? 1 : 0;
                    z11 = true;
                    sQLiteDatabaseU = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseU = null;
                }
            }
            boolean z13 = z12 ? 1 : 0;
            C1023u0.m(x9);
            x9.f17178E.a("Failed to write entry to local database");
            return z13;
        }
        return z12;
    }
}
