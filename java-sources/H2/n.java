package H2;

import com.google.android.gms.internal.measurement.B1;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Q2.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q2.c f3304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f3306t;

    public n(u uVar, Q2.c cVar) {
        p251z9.j.e(cVar, "delegate");
        this.f3306t = uVar;
        this.f3304r = cVar;
        this.f3305s = B1.u();
    }

    @Override // Q2.c
    public final boolean I() {
        return getLong(0) != 0;
    }

    @Override // Q2.c
    public final boolean R() {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            return this.f3304r.R();
        }
        u0.F(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // Q2.c
    public final void c(long j, int i10) {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            this.f3304r.c(j, i10);
        } else {
            u0.F(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            this.f3304r.close();
        } else {
            u0.F(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // Q2.c
    public final int getColumnCount() {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            return this.f3304r.getColumnCount();
        }
        u0.F(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // Q2.c
    public final String getColumnName(int i10) {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            return this.f3304r.getColumnName(i10);
        }
        u0.F(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // Q2.c
    public final long getLong(int i10) {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            return this.f3304r.getLong(i10);
        }
        u0.F(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // Q2.c
    public final boolean isNull(int i10) {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            return this.f3304r.isNull(i10);
        }
        u0.F(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // Q2.c
    public final String j(int i10) {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            return this.f3304r.j(i10);
        }
        u0.F(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // Q2.c
    public final void r(String str) {
        p251z9.j.e(str, "value");
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            this.f3304r.r(str);
        } else {
            u0.F(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // Q2.c
    public final void reset() {
        if (this.f3306t.f3338d.get()) {
            u0.F(21, "Statement is recycled");
            throw null;
        }
        if (this.f3305s == B1.u()) {
            this.f3304r.reset();
        } else {
            u0.F(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
