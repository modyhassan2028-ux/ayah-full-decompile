package p224x0;

import p085i0.f;
import p196u0.d;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f24131a;

    public abstract void a(d dVar);

    public c b() {
        return this.f24131a;
    }

    public final void c() {
        c cVarB = b();
        if (cVarB != null) {
            cVarB.e(this);
        }
    }

    public void d(f fVar) {
        this.f24131a = fVar;
    }
}
