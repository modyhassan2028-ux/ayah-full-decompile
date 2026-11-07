package S2;

import android.database.sqlite.SQLiteProgram;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class h implements R2.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SQLiteProgram f7495r;

    public h(SQLiteProgram sQLiteProgram) {
        j.e(sQLiteProgram, "delegate");
        this.f7495r = sQLiteProgram;
    }

    @Override // R2.d
    public final void P(int i10, byte[] bArr) {
        this.f7495r.bindBlob(i10, bArr);
    }

    @Override // R2.d
    public final void c(long j, int i10) {
        this.f7495r.bindLong(i10, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7495r.close();
    }

    @Override // R2.d
    public final void m(int i10, String str) {
        j.e(str, "value");
        this.f7495r.bindString(i10, str);
    }

    @Override // R2.d
    public final void p(double d5, int i10) {
        this.f7495r.bindDouble(i10, d5);
    }

    @Override // R2.d
    public final void t(int i10) {
        this.f7495r.bindNull(i10);
    }
}
