package Z9;

import com.google.android.gms.internal.measurement.B1;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f11060a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W9.g f11061b = u0.g("kotlinx.serialization.json.JsonNull", W9.h.f9678d, new W9.f[0]);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        p251z9.j.e((p) obj, "value");
        B1.f(nVar);
        nVar.m();
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        B1.g(bVar);
        if (bVar.g()) {
            throw new p009aa.g("Expected 'null' literal");
        }
        return p.INSTANCE;
    }

    @Override // U9.a
    public final W9.f d() {
        return f11061b;
    }
}
