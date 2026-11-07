package L6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E6.j f5546s;

    public /* synthetic */ f(long j, E6.j jVar) {
        this.f5545r = j;
        this.f5546s = jVar;
    }

    @Override // L6.g, B6.d
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f5545r));
        E6.j jVar = this.f5546s;
        String str = jVar.f1937a;
        B6.c cVar = jVar.f1939c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(O6.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", jVar.f1937a);
            contentValues.put("priority", Integer.valueOf(O6.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
