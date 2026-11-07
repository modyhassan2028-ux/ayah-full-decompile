package Z9;

import Y9.C0647c;
import com.google.android.gms.internal.measurement.B1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11050a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f11051b = e.f11047b;

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        d dVar = (d) obj;
        p251z9.j.e(dVar, "value");
        B1.f(nVar);
        k kVar = k.f11053a;
        new C0647c().b(nVar, dVar);
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        B1.g(bVar);
        k kVar = k.f11053a;
        return new d((List) new C0647c().i(bVar));
    }

    @Override // U9.a
    public final W9.f d() {
        return f11051b;
    }
}
