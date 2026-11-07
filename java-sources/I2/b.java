package I2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements H2.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p248z6.c f3799r;

    public b(p248z6.c cVar) {
        this.f3799r = cVar;
    }

    @Override // H2.b
    public final Object C(boolean z10, p241y9.e eVar, q9.c cVar) {
        R2.c cVar2 = (R2.c) this.f3799r.f24847s;
        cVar2.getDatabaseName();
        return eVar.invoke(new d(new a(cVar2.U())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((R2.c) this.f3799r.f24847s).close();
    }
}
