package ka;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f19284r;

    static {
        Da.k kVar = Da.k.f1363u;
        p251z9.j.e(kVar, "<this>");
        Da.h hVar = new Da.h();
        hVar.N(kVar);
        f19284r = new v(kVar.f1364r.length, hVar);
    }

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        la.c.a(i());
    }

    public abstract p e();

    public abstract Da.j i();
}
