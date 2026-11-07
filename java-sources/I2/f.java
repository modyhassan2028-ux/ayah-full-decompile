package I2;

import S2.i;
import java.io.IOException;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i f3812u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(R2.a aVar, String str) {
        super(aVar, str);
        j.e(aVar, "db");
        j.e(str, "sql");
        this.f3812u = aVar.q(str);
    }

    @Override // Q2.c
    public final boolean R() {
        b();
        this.f3812u.f7496s.execute();
        return false;
    }

    @Override // Q2.c
    public final void c(long j, int i10) {
        b();
        this.f3812u.c(j, i10);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3812u.close();
        this.f3815t = true;
    }

    @Override // Q2.c
    public final int getColumnCount() {
        b();
        return 0;
    }

    @Override // Q2.c
    public final String getColumnName(int i10) {
        b();
        u0.F(21, "no row");
        throw null;
    }

    @Override // Q2.c
    public final long getLong(int i10) {
        b();
        u0.F(21, "no row");
        throw null;
    }

    @Override // Q2.c
    public final boolean isNull(int i10) {
        b();
        u0.F(21, "no row");
        throw null;
    }

    @Override // Q2.c
    public final String j(int i10) {
        b();
        u0.F(21, "no row");
        throw null;
    }

    @Override // Q2.c
    public final void r(String str) {
        j.e(str, "value");
        b();
        this.f3812u.m(3, str);
    }

    @Override // Q2.c
    public final void reset() {
    }
}
