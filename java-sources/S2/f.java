package S2;

import Da.r;
import F2.p;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f7483x = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f7484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final O8.c f7485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f7486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final T2.a f7488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final O8.c cVar, final r rVar) {
        String string;
        super(context, str, null, rVar.f1387s, new DatabaseErrorHandler() { // from class: S2.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i10 = f.f7483x;
                j.b(sQLiteDatabase);
                b bVarC = p050e8.b.C(cVar, sQLiteDatabase);
                rVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVarC + ".path");
                SQLiteDatabase sQLiteDatabase2 = bVarC.f7472r;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        r.g(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                j.d(obj, "second");
                                r.g((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                r.g(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVarC.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        j.e(context, "context");
        j.e(rVar, "callback");
        this.f7484r = context;
        this.f7485s = cVar;
        this.f7486t = rVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            j.d(string, "toString(...)");
        } else {
            string = str;
        }
        this.f7488v = new T2.a(string, context.getCacheDir(), false);
    }

    public final R2.a b(boolean z10) {
        T2.a aVar = this.f7488v;
        try {
            aVar.a((this.f7489w || getDatabaseName() == null) ? false : true);
            this.f7487u = false;
            SQLiteDatabase sQLiteDatabaseE = e(z10);
            if (!this.f7487u) {
                return p050e8.b.C(this.f7485s, sQLiteDatabaseE);
            }
            close();
            return b(z10);
        } finally {
            aVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        T2.a aVar = this.f7488v;
        try {
            aVar.a(aVar.f7775a);
            super.close();
            this.f7485s.f6511r = null;
            this.f7489w = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase e(boolean z10) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.f7489w;
        if (databaseName != null && !z11 && (parentFile = this.f7484r.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                j.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            j.b(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z10) {
                    readableDatabase = getWritableDatabase();
                    j.b(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    j.b(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int iOrdinal = dVar.f7475r.ordinal();
                    th = dVar.f7476s;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new A6.a();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        j.e(sQLiteDatabase, "db");
        boolean z10 = this.f7487u;
        r rVar = this.f7486t;
        if (!z10 && rVar.f1387s != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            p050e8.b.C(this.f7485s, sQLiteDatabase);
            rVar.getClass();
        } catch (Throwable th) {
            throw new d(e.f7477r, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        j.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            ((p) this.f7486t.f1388t).d(new I2.a(p050e8.b.C(this.f7485s, sQLiteDatabase)));
        } catch (Throwable th) {
            throw new d(e.f7478s, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        j.e(sQLiteDatabase, "db");
        this.f7487u = true;
        try {
            this.f7486t.j(p050e8.b.C(this.f7485s, sQLiteDatabase), i10, i11);
        } catch (Throwable th) {
            throw new d(e.f7480u, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        j.e(sQLiteDatabase, "db");
        if (!this.f7487u) {
            try {
                r rVar = this.f7486t;
                b bVarC = p050e8.b.C(this.f7485s, sQLiteDatabase);
                p pVar = (p) rVar.f1388t;
                pVar.f(new I2.a(bVarC));
                pVar.g = bVarC;
            } catch (Throwable th) {
                throw new d(e.f7481v, th);
            }
        }
        this.f7489w = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        j.e(sQLiteDatabase, "sqLiteDatabase");
        this.f7487u = true;
        try {
            this.f7486t.j(p050e8.b.C(this.f7485s, sQLiteDatabase), i10, i11);
        } catch (Throwable th) {
            throw new d(e.f7479t, th);
        }
    }
}
