package K6;

import D6.s;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import p185s8.C1329l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements M6.b, L6.g, I8.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5271t;

    public /* synthetic */ i(long j, Object obj, Object obj2) {
        this.f5270s = obj;
        this.f5271t = obj2;
        this.f5269r = j;
    }

    @Override // L6.g, B6.d
    public Object apply(Object obj) {
        String str = (String) this.f5270s;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((H6.c) this.f5271t).f3419r;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z10 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f5269r;
            if (z10) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // M6.b
    public Object b() {
        s sVar = (s) this.f5270s;
        E6.j jVar = (E6.j) this.f5271t;
        L6.d dVar = (L6.d) sVar.f1310c;
        long jE = ((N6.a) sVar.g).e() + this.f5269r;
        L6.i iVar = (L6.i) dVar;
        iVar.getClass();
        iVar.i(new L6.f(jE, jVar));
        return null;
    }

    @Override // I8.a
    public void e(I8.b bVar) {
        ((m8.a) bVar.get()).d((String) this.f5270s, this.f5269r, (C1329l0) this.f5271t);
    }

    public /* synthetic */ i(String str, long j, C1329l0 c1329l0) {
        this.f5270s = str;
        this.f5269r = j;
        this.f5271t = c1329l0;
    }
}
