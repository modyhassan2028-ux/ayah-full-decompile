package Z9;

import Y9.D;
import Y9.Z;
import com.google.android.gms.internal.measurement.B1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f11066a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f11067b = t.f11063b;

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        s sVar = (s) obj;
        p251z9.j.e(sVar, "value");
        B1.f(nVar);
        Z z10 = Z.f10495a;
        new D(k.f11053a).b(nVar, sVar);
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        B1.g(bVar);
        Z z10 = Z.f10495a;
        return new s((Map) new D(k.f11053a).i(bVar));
    }

    @Override // U9.a
    public final W9.f d() {
        return f11067b;
    }
}
