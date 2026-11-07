package S2;

import Da.r;
import android.content.Context;
import p110k9.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g implements R2.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f7490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f7491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f7492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o f7493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7494v;

    public g(Context context, String str, r rVar) {
        j.e(context, "context");
        j.e(rVar, "callback");
        this.f7490r = context;
        this.f7491s = str;
        this.f7492t = rVar;
        this.f7493u = p110k9.a.d(new B3.f(5, this));
    }

    @Override // R2.c
    public final R2.a U() {
        return ((f) this.f7493u.getValue()).b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o oVar = this.f7493u;
        if (oVar.a()) {
            ((f) oVar.getValue()).close();
        }
    }

    @Override // R2.c
    public final String getDatabaseName() {
        return this.f7491s;
    }

    @Override // R2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        o oVar = this.f7493u;
        if (oVar.a()) {
            ((f) oVar.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.f7494v = z10;
    }
}
