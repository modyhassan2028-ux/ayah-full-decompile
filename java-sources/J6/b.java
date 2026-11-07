package J6;

import E6.h;
import E6.j;
import E6.n;
import H6.f;
import L6.g;
import L6.i;
import Z0.B;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements M6.b, g, p118l7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4353t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4354u;

    public /* synthetic */ b(i iVar, Object obj, j jVar, int i10) {
        this.f4351r = i10;
        this.f4354u = iVar;
        this.f4352s = obj;
        this.f4353t = jVar;
    }

    @Override // p118l7.a
    public Object a(o oVar) {
        p118l7.i iVar = (p118l7.i) this.f4354u;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f4353t;
        X4.c cVar = (X4.c) this.f4352s;
        if (oVar.g()) {
            iVar.b(oVar.e());
        } else if (oVar.d() != null) {
            iVar.a(oVar.d());
        } else if (atomicBoolean.getAndSet(true)) {
            ((o) ((B) cVar.f9953r).f10875s).l(null);
        }
        return p000a.a.E(null);
    }

    @Override // L6.g, B6.d
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        H6.c cVar;
        int i10 = this.f4351r;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        H6.c cVar2 = H6.c.CACHE_FULL;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.f4352s;
        Object obj3 = this.f4353t;
        int i16 = 0;
        i iVar = (i) this.f4354u;
        switch (i10) {
            case 1:
                E6.i iVar2 = (E6.i) obj2;
                n nVar = iVar2.f1931c;
                String str = iVar2.f1929a;
                j jVar = (j) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = iVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                L6.a aVar = iVar.f5553u;
                if (jSimpleQueryForLong >= aVar.f5535a) {
                    iVar.s(1L, cVar2, str);
                    return -1L;
                }
                Long lE = i.e(sQLiteDatabase, jVar);
                if (lE != null) {
                    jInsert = lE.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.f1937a);
                    contentValues.put("priority", Integer.valueOf(O6.a.a(jVar.f1939c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.f1938b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i17 = aVar.f5539e;
                byte[] bArr2 = nVar.f1948b;
                boolean z10 = bArr2.length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar2.f1932d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar2.f1933e));
                contentValues2.put("payload_encoding", nVar.f1947a.f643a);
                contentValues2.put("code", iVar2.f1930b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar2.g);
                contentValues2.put("pseudonymous_id", iVar2.f1935h);
                contentValues2.put("experiment_ids_clear_blob", iVar2.f1936i);
                contentValues2.put("experiment_ids_encrypted_blob", iVar2.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i17));
                    for (int i18 = 1; i18 <= iCeil; i18++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i18 - 1) * i17, Math.min(i18 * i17, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(iVar2.f1934f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                j jVar2 = (j) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i19 = cursor2.getInt(7) != 0 ? i15 : 0;
                    h hVar = new h();
                    hVar.f1927h = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar.f1921a = string;
                    hVar.f1926f = Long.valueOf(cursor2.getLong(i14));
                    hVar.g = Long.valueOf(cursor2.getLong(3));
                    if (i19 != 0) {
                        String string2 = cursor2.getString(4);
                        hVar.f1925e = new n(string2 == null ? i.f5549w : new B6.b(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        B6.b bVar = string3 == null ? i.f5549w : new B6.b(string3);
                        Cursor cursorQuery = iVar.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i20 = 0;
                            int length2 = 0;
                            while (i20 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i20);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i20++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            hVar.f1925e = new n(bVar, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar.f1923c = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        hVar.f1924d = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        hVar.f1922b = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        hVar.f1928i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        hVar.j = cursor2.getBlob(11);
                    }
                    arrayList.add(new L6.b(j, jVar2, hVar.b()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                Aa.a aVar2 = (Aa.a) obj2;
                ArrayList arrayList4 = (ArrayList) aVar2.f556t;
                Cursor cursor3 = (Cursor) obj;
                iVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i16);
                    int i21 = cursor3.getInt(1);
                    H6.c cVar3 = H6.c.REASON_UNKNOWN;
                    if (i21 != 0) {
                        if (i21 == 1) {
                            cVar3 = H6.c.MESSAGE_TOO_OLD;
                        } else if (i21 == 2) {
                            cVar = cVar2;
                        } else if (i21 == i13) {
                            cVar3 = H6.c.PAYLOAD_TOO_BIG;
                        } else if (i21 == i12) {
                            cVar3 = H6.c.MAX_RETRIES_REACHED;
                        } else if (i21 == i11) {
                            cVar3 = H6.c.INVALID_PAYLOD;
                        } else if (i21 == 6) {
                            cVar3 = H6.c.SERVER_ERROR;
                        } else {
                            Y2.a.v("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i21));
                        }
                        cVar = cVar3;
                    } else {
                        cVar = cVar3;
                    }
                    long j10 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new H6.d(j10, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i22 = H6.e.f3422c;
                    new ArrayList();
                    arrayList4.add(new H6.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long jE = iVar.f5551s.e();
                SQLiteDatabase sQLiteDatabaseB = iVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        H6.g gVar = new H6.g(cursorRawQuery.getLong(0), jE);
                        cursorRawQuery.close();
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        aVar2.f554r = gVar;
                        aVar2.f555s = new H6.b(new f(iVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), L6.a.f5534f.f5535a));
                        aVar2.f557u = (String) iVar.f5554v.get();
                        return new H6.a((H6.g) aVar2.f554r, DesugarCollections.unmodifiableList(arrayList4), (H6.b) aVar2.f555s, (String) aVar2.f557u);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseB.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // M6.b
    public Object b() {
        c cVar = (c) this.f4354u;
        j jVar = (j) this.f4353t;
        E6.i iVar = (E6.i) this.f4352s;
        i iVar2 = (i) cVar.f4359d;
        iVar2.getClass();
        B6.c cVar2 = jVar.f1939c;
        String str = iVar.f1929a;
        String str2 = jVar.f1937a;
        String strO = Y2.a.O("SQLiteEventStore");
        if (Log.isLoggable(strO, 3)) {
            Log.d(strO, "Storing event with priority=" + cVar2 + ", name=" + str + " for destination " + str2);
        }
        ((Long) iVar2.i(new b(iVar2, (Object) iVar, jVar, 1))).getClass();
        cVar.f4356a.M(jVar, 1, false);
        return null;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f4351r = i10;
        this.f4354u = obj;
        this.f4353t = obj2;
        this.f4352s = obj3;
    }
}
