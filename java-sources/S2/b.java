package S2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements R2.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f7469s = new String[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f7470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f7471u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SQLiteDatabase f7472r;

    static {
        Ba.b bVar = new Ba.b(5);
        p110k9.h hVar = p110k9.h.f19075s;
        f7470t = p110k9.a.c(hVar, bVar);
        f7471u = p110k9.a.c(hVar, new Ba.b(6));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f7472r = sQLiteDatabase;
    }

    @Override // R2.a
    public final Cursor B(O8.c cVar) {
        final D4.f fVar = new D4.f(1, cVar);
        Cursor cursorRawQueryWithFactory = this.f7472r.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: S2.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) fVar.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ((I2.e) cVar.f6511r).f3814s, f7469s, null);
        j.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // R2.a
    public final void J() {
        this.f7472r.setTransactionSuccessful();
    }

    @Override // R2.a
    public final void M() {
        this.f7472r.beginTransactionNonExclusive();
    }

    @Override // R2.a
    public final void beginTransaction() {
        this.f7472r.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7472r.close();
    }

    @Override // R2.a
    public final void f() {
        this.f7472r.endTransaction();
    }

    @Override // R2.a
    public final boolean isOpen() {
        return this.f7472r.isOpen();
    }

    @Override // R2.a
    public final void l(String str) {
        j.e(str, "sql");
        this.f7472r.execSQL(str);
    }

    @Override // R2.a
    public final i q(String str) {
        j.e(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f7472r.compileStatement(str);
        j.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new i(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k9.g] */
    @Override // R2.a
    public final void x() throws IllegalAccessException, InvocationTargetException {
        ?? r10 = f7471u;
        if (((Method) r10.getValue()) != null) {
            ?? r11 = f7470t;
            if (((Method) r11.getValue()) != null) {
                Method method = (Method) r10.getValue();
                j.b(method);
                Method method2 = (Method) r11.getValue();
                j.b(method2);
                Object objInvoke = method2.invoke(this.f7472r, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        beginTransaction();
    }

    @Override // R2.a
    public final boolean z() {
        return this.f7472r.inTransaction();
    }
}
