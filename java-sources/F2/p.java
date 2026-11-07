package F2;

import E2.W;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0156a f2295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f2296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H2.b f2298f;
    public R2.a g;

    public p(C0156a c0156a, A3.d dVar) {
        this.f2295c = c0156a;
        this.f2296d = new n(-1, "", "");
        List list = c0156a.f2255e;
        p120l9.r rVar = p120l9.r.f19440r;
        this.f2297e = list == null ? rVar : list;
        ArrayList arrayListR0 = p120l9.m.r0(list == null ? rVar : list, new o(new E5.a(1, this)));
        Context context = c0156a.f2251a;
        String str = c0156a.f2252b;
        R2.b bVar = c0156a.f2253c;
        s sVar = c0156a.f2254d;
        boolean z10 = c0156a.f2256f;
        r rVar2 = c0156a.g;
        Executor executor = c0156a.f2257h;
        Executor executor2 = c0156a.f2258i;
        Intent intent = c0156a.j;
        boolean z11 = c0156a.f2259k;
        boolean z12 = c0156a.f2260l;
        Set set = c0156a.f2261m;
        String str2 = c0156a.f2262n;
        File file = c0156a.f2263o;
        Callable callable = c0156a.f2264p;
        List list2 = c0156a.f2265q;
        List list3 = c0156a.f2266r;
        boolean z13 = c0156a.f2267s;
        Q2.b bVar2 = c0156a.f2268t;
        p150o9.h hVar = c0156a.f2269u;
        p251z9.j.e(context, "context");
        p251z9.j.e(sVar, "migrationContainer");
        p251z9.j.e(executor, "queryExecutor");
        p251z9.j.e(executor2, "transactionExecutor");
        p251z9.j.e(list2, "typeConverters");
        p251z9.j.e(list3, "autoMigrationSpecs");
        dVar.e(new C0156a(context, str, bVar, sVar, arrayListR0, z10, rVar2, executor, executor2, intent, z11, z12, set, str2, file, callable, list2, list3, z13, bVar2, hVar));
        throw null;
    }

    public static final void a(p pVar, Q2.a aVar) throws Throwable {
        Object objB;
        W w9 = pVar.f2296d;
        C0156a c0156a = pVar.f2295c;
        r rVar = c0156a.g;
        r rVar2 = r.f2316t;
        if (rVar == rVar2) {
            u0.o(aVar, "PRAGMA journal_mode = WAL");
        } else {
            u0.o(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c0156a.g == rVar2) {
            u0.o(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            u0.o(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        Q2.c cVarA0 = aVar.a0("PRAGMA user_version");
        try {
            cVarA0.R();
            int i10 = (int) cVarA0.getLong(0);
            p186s9.b.b(cVarA0, null);
            int i11 = w9.f1625a;
            if (i10 != i11) {
                u0.o(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i10 == 0) {
                        pVar.d(aVar);
                    } else {
                        pVar.e(aVar, i10, i11);
                    }
                    u0.o(aVar, "PRAGMA user_version = " + i11);
                    objB = p110k9.y.f19095a;
                } catch (Throwable th) {
                    objB = p110k9.a.b(th);
                }
                if (!(objB instanceof p110k9.l)) {
                    u0.o(aVar, "END TRANSACTION");
                }
                Throwable thA = p110k9.m.a(objB);
                if (thA != null) {
                    u0.o(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            pVar.f(aVar);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                p186s9.b.b(cVarA0, th2);
                throw th3;
            }
        }
    }

    public static void b(Q2.a aVar) {
        Q2.c cVarA0 = aVar.a0("PRAGMA busy_timeout");
        try {
            cVarA0.R();
            long j = cVarA0.getLong(0);
            p186s9.b.b(cVarA0, null);
            if (j < 3000) {
                u0.o(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p186s9.b.b(cVarA0, th);
                throw th2;
            }
        }
    }

    public final R2.c c() {
        p248z6.c cVar;
        H2.b bVar = this.f2298f;
        I2.b bVar2 = bVar instanceof I2.b ? (I2.b) bVar : null;
        if (bVar2 == null || (cVar = bVar2.f3799r) == null) {
            return null;
        }
        return (R2.c) cVar.f24847s;
    }

    public final void d(Q2.a aVar) {
        p251z9.j.e(aVar, "connection");
        Q2.c cVarA0 = aVar.a0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cVarA0.R() && cVarA0.getLong(0) == 0) {
                z10 = true;
            }
            p186s9.b.b(cVarA0, null);
            W w9 = this.f2296d;
            w9.a(aVar);
            if (!z10) {
                v vVarV = w9.v(aVar);
                if (!vVarV.f2331c) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + vVarV.f2330b).toString());
                }
            }
            g(aVar);
            w9.r(aVar);
            Iterator it = this.f2297e.iterator();
            while (it.hasNext()) {
                ((o) it.next()).getClass();
                if (aVar instanceof I2.a) {
                    p251z9.j.e(((I2.a) aVar).f3798r, "db");
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p186s9.b.b(cVarA0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:? A[LOOP:4: B:9:0x0024->B:141:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    public final void e(Q2.a aVar, int i10, int i11) {
        Iterable<C3.a> iterable;
        TreeMap treeMap;
        p110k9.j jVar;
        Iterator it;
        boolean z10;
        int iIntValue;
        TreeMap treeMap2;
        p251z9.j.e(aVar, "connection");
        C0156a c0156a = this.f2295c;
        s sVar = c0156a.f2254d;
        p251z9.j.e(sVar, "<this>");
        LinkedHashMap linkedHashMap = sVar.f2318a;
        if (i10 == i11) {
            iterable = p120l9.r.f19440r;
        } else {
            boolean z11 = i11 > i10;
            ArrayList arrayList = new ArrayList();
            int i12 = i10;
            while (true) {
                if (z11) {
                    if (i12 < i11) {
                        if (z11) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                            if (treeMap2 == null) {
                                jVar = null;
                            } else {
                                jVar = new p110k9.j(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                            if (treeMap == null) {
                                jVar = null;
                            } else {
                                jVar = new p110k9.j(treeMap, treeMap.keySet());
                            }
                        }
                        if (jVar == null) {
                            Map map = (Map) jVar.f19077r;
                            it = ((Iterable) jVar.f19078s).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z10 = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z11) {
                                    if (i11 <= iIntValue && iIntValue < i12) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        p251z9.j.b(obj);
                                        arrayList.add(obj);
                                        z10 = true;
                                        i12 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i12 + 1 <= iIntValue && iIntValue <= i11) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    p251z9.j.b(obj2);
                                    arrayList.add(obj2);
                                    z10 = true;
                                    i12 = iIntValue;
                                    break;
                                }
                            }
                            if (!z10) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i12 > i11) {
                    if (z11) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                        if (treeMap2 == null) {
                            jVar = null;
                        } else {
                            jVar = new p110k9.j(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                        if (treeMap == null) {
                            jVar = null;
                        } else {
                            jVar = new p110k9.j(treeMap, treeMap.keySet());
                        }
                    }
                    if (jVar == null) {
                        Map map2 = (Map) jVar.f19077r;
                        it = ((Iterable) jVar.f19078s).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z10 = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z11) {
                                if (i12 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i11 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z10) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        W w9 = this.f2296d;
        if (iterable == null) {
            if (F9.n.H(c0156a, i10, i11)) {
                throw new IllegalStateException(("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
            if (c0156a.f2267s) {
                Q2.c cVarA0 = aVar.a0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                try {
                    p129m9.b bVar = new p129m9.b(10);
                    while (cVarA0.R()) {
                        String strJ = cVarA0.j(0);
                        if (!H9.v.R0(strJ, "sqlite_", false) && !strJ.equals("android_metadata")) {
                            bVar.add(new p110k9.j(strJ, Boolean.valueOf(p251z9.j.a(cVarA0.j(1), "view"))));
                        }
                    }
                    p129m9.b bVarO = AbstractC0813f2.o(bVar);
                    p186s9.b.b(cVarA0, null);
                    ListIterator listIterator = bVarO.listIterator(0);
                    while (true) {
                        J0.r rVar = (J0.r) listIterator;
                        if (!rVar.hasNext()) {
                            break;
                        }
                        p110k9.j jVar2 = (p110k9.j) rVar.next();
                        String str = (String) jVar2.f19077r;
                        if (((Boolean) jVar2.f19078s).booleanValue()) {
                            u0.o(aVar, "DROP VIEW IF EXISTS " + str);
                        } else {
                            u0.o(aVar, "DROP TABLE IF EXISTS " + str);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p186s9.b.b(cVarA0, th);
                        throw th2;
                    }
                }
            } else {
                w9.c(aVar);
            }
            Iterator it2 = this.f2297e.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).getClass();
                if (aVar instanceof I2.a) {
                    p251z9.j.e(((I2.a) aVar).f3798r, "db");
                }
            }
            w9.a(aVar);
            return;
        }
        w9.u(aVar);
        for (C3.a aVar2 : iterable) {
            aVar2.getClass();
            if (!(aVar instanceof I2.a)) {
                throw new p110k9.i("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
            }
            R2.a aVar3 = ((I2.a) aVar).f3798r;
            switch (aVar2.f724c) {
                case 0:
                    p251z9.j.e(aVar3, "db");
                    aVar3.l("DROP TABLE IF EXISTS history");
                    break;
                default:
                    p251z9.j.e(aVar3, "db");
                    aVar3.beginTransaction();
                    try {
                        aVar3.l("\n              CREATE TABLE favorites_tmp(\n                _id INTEGER PRIMARY KEY NOT NULL,\n                ayah_id INTEGER NOT NULL,\n                timestamp INTEGER NOT NULL)");
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        aVar3.l("UPDATE favorites SET timestamp=" + jCurrentTimeMillis + " WHERE timestamp is NULL");
                        aVar3.l("INSERT INTO favorites_tmp SELECT * FROM favorites");
                        aVar3.l("DROP TABLE favorites");
                        aVar3.l("ALTER TABLE favorites_tmp RENAME TO favorites");
                        aVar3.l("CREATE UNIQUE INDEX index_favorites_ayah_id ON favorites(ayah_id)");
                        aVar3.l("\n              CREATE TABLE notes_tmp(\n                _id INTEGER PRIMARY KEY NOT NULL,\n                ayah_id INTEGER NOT NULL,\n                note VARCHAR NOT NULL,\n                timestamp INTEGER NOT NULL)");
                        aVar3.l("UPDATE notes SET timestamp=" + jCurrentTimeMillis + " WHERE timestamp is NULL");
                        aVar3.l("INSERT INTO notes_tmp SELECT * FROM notes");
                        aVar3.l("DROP TABLE notes");
                        aVar3.l("ALTER TABLE notes_tmp RENAME TO notes");
                        aVar3.l("CREATE UNIQUE INDEX index_notes_ayah_id ON notes(ayah_id)");
                        aVar3.l("\n              CREATE TABLE bookmarks(\n                _id INTEGER PRIMARY KEY NOT NULL,\n                ayah_id INTEGER NOT NULL,\n                name VARCHAR NOT NULL,\n                timestamp INTEGER NOT NULL)");
                        aVar3.l("CREATE UNIQUE INDEX index_bookmarks_name ON bookmarks(name)");
                        aVar3.J();
                        aVar3.f();
                    } catch (Throwable th3) {
                        aVar3.f();
                        throw th3;
                    }
                    break;
            }
        }
        v vVarV = w9.v(aVar);
        if (!vVarV.f2331c) {
            throw new IllegalStateException(("Migration didn't properly handle: " + vVarV.f2330b).toString());
        }
        w9.t(aVar);
        g(aVar);
    }

    public final void f(Q2.a aVar) throws Throwable {
        Object objB;
        p251z9.j.e(aVar, "connection");
        Q2.c cVarA0 = aVar.a0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z10 = cVarA0.R() && cVarA0.getLong(0) != 0;
            p186s9.b.b(cVarA0, null);
            W w9 = this.f2296d;
            if (z10) {
                Q2.c cVarA1 = aVar.a0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strJ = cVarA1.R() ? cVarA1.j(0) : null;
                    p186s9.b.b(cVarA1, null);
                    if (!((String) w9.f1626b).equals(strJ) && !((String) w9.f1627c).equals(strJ)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) w9.f1626b) + ", found: " + strJ).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p186s9.b.b(cVarA1, th);
                        throw th2;
                    }
                }
            } else {
                u0.o(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    v vVarV = w9.v(aVar);
                    if (!vVarV.f2331c) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + vVarV.f2330b).toString());
                    }
                    w9.t(aVar);
                    g(aVar);
                    objB = p110k9.y.f19095a;
                    if (!(objB instanceof p110k9.l)) {
                        u0.o(aVar, "END TRANSACTION");
                    }
                    Throwable thA = p110k9.m.a(objB);
                    if (thA != null) {
                        u0.o(aVar, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    objB = p110k9.a.b(th3);
                }
            }
            w9.s(aVar);
            for (o oVar : this.f2297e) {
                oVar.getClass();
                if (aVar instanceof I2.a) {
                    R2.a aVar2 = ((I2.a) aVar).f3798r;
                    p251z9.j.e(aVar2, "db");
                    oVar.f2292a.e(aVar2);
                }
            }
            this.f2293a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                p186s9.b.b(cVarA0, th4);
                throw th5;
            }
        }
    }

    public final void g(Q2.a aVar) {
        u0.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) this.f2296d.f1626b;
        p251z9.j.e(str, "hash");
        u0.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    public p(C0156a c0156a, W w9) {
        int i10;
        H2.f fVar;
        r rVar = c0156a.g;
        R2.b bVar = c0156a.f2253c;
        String str = c0156a.f2252b;
        this.f2295c = c0156a;
        this.f2296d = w9;
        List list = c0156a.f2255e;
        this.f2297e = list == null ? p120l9.r.f19440r : list;
        Q2.b bVar2 = c0156a.f2268t;
        if (bVar2 != null) {
            if (str == null) {
                fVar = new H2.f(new M.k(this, bVar2));
            } else {
                M.k kVar = new M.k(this, bVar2);
                int iOrdinal = rVar.ordinal();
                if (iOrdinal == 1) {
                    i10 = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + rVar + '\'').toString());
                    }
                    i10 = 4;
                }
                int iOrdinal2 = rVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + rVar + '\'').toString());
                }
                fVar = new H2.f(kVar, str, i10);
            }
            this.f2298f = fVar;
        } else if (bVar != null) {
            Context context = c0156a.f2251a;
            p251z9.j.e(context, "context");
            this.f2298f = new I2.b(new p248z6.c(bVar.s(new android.support.v4.media.session.r(context, str, new Da.r(this, w9.f1625a)))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z10 = rVar == r.f2316t;
        R2.c cVarC = c();
        if (cVarC != null) {
            cVarC.setWriteAheadLoggingEnabled(z10);
        }
    }
}
