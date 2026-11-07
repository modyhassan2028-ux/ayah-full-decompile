package L6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d, M6.c, c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final B6.b f5549w = new B6.b("proto");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f5550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final N6.a f5551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final N6.a f5552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f5553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p101j9.a f5554v;

    public i(N6.a aVar, N6.a aVar2, a aVar3, k kVar, p101j9.a aVar4) {
        this.f5550r = kVar;
        this.f5551s = aVar;
        this.f5552t = aVar2;
        this.f5553u = aVar3;
        this.f5554v = aVar4;
    }

    public static String A(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f5540a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object E(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long e(SQLiteDatabase sQLiteDatabase, E6.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f1937a, String.valueOf(O6.a.a(jVar.f1939c))));
        byte[] bArr = jVar.f1938b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final SQLiteDatabase b() {
        k kVar = this.f5550r;
        Objects.requireNonNull(kVar);
        N6.a aVar = this.f5552t;
        long jE = aVar.e();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.e() >= ((long) this.f5553u.f5537c) + jE) {
                    throw new M6.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5550r.close();
    }

    public final Object i(g gVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = gVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList n(SQLiteDatabase sQLiteDatabase, E6.j jVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lE = e(sQLiteDatabase, jVar);
        if (lE == null) {
            return arrayList;
        }
        E(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lE.toString()}, null, null, null, String.valueOf(i10)), new J6.b(this, (Object) arrayList, jVar, 2));
        return arrayList;
    }

    public final void s(long j, H6.c cVar, String str) {
        i(new K6.i(j, str, cVar));
    }

    public final Object w(M6.b bVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        N6.a aVar = this.f5552t;
        long jE = aVar.e();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objB = bVar.b();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objB;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.e() >= ((long) this.f5553u.f5537c) + jE) {
                    throw new M6.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
