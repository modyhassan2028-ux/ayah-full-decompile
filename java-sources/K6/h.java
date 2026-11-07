package K6;

import D6.s;
import F2.x;
import Z0.B;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements M6.b, p109k8.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f5265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5266t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5267u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5268v;

    public /* synthetic */ h(s sVar, Iterable iterable, E6.j jVar, long j) {
        this.f5264r = 0;
        this.f5266t = sVar;
        this.f5267u = iterable;
        this.f5268v = jVar;
        this.f5265s = j;
    }

    @Override // p109k8.g
    public ScheduledFuture a(final B b5) {
        switch (this.f5264r) {
            case 1:
                p109k8.f fVar = (p109k8.f) this.f5266t;
                Runnable runnable = (Runnable) this.f5267u;
                return fVar.f19055s.schedule(new p109k8.d(fVar, runnable, b5, 1), this.f5265s, (TimeUnit) this.f5268v);
            default:
                final p109k8.f fVar2 = (p109k8.f) this.f5266t;
                final Callable callable = (Callable) this.f5267u;
                return fVar2.f19055s.schedule(new Callable() { // from class: k8.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fVar2.f19054r.submit(new x(9, callable, b5));
                    }
                }, this.f5265s, (TimeUnit) this.f5268v);
        }
    }

    @Override // M6.b
    public Object b() {
        s sVar = (s) this.f5266t;
        Iterable iterable = (Iterable) this.f5267u;
        E6.j jVar = (E6.j) this.f5268v;
        L6.i iVar = (L6.i) ((L6.d) sVar.f1310c);
        iVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + L6.i.A(iterable);
            SQLiteDatabase sQLiteDatabaseB = iVar.b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        iVar.s(cursorRawQuery.getInt(0), H6.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
                sQLiteDatabaseB.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseB.endTransaction();
                throw th2;
            }
        }
        iVar.i(new L6.f(((N6.a) sVar.g).e() + this.f5265s, jVar));
        return null;
    }

    public /* synthetic */ h(p109k8.f fVar, Object obj, long j, TimeUnit timeUnit, int i10) {
        this.f5264r = i10;
        this.f5266t = fVar;
        this.f5267u = obj;
        this.f5265s = j;
        this.f5268v = timeUnit;
    }
}
