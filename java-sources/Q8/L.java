package Q8;

import T1.C0485b;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class L implements T1.Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f6902a;

    public L(X x9) {
        p251z9.j.e(x9, "sessionGenerator");
        this.f6902a = x9;
    }

    @Override // T1.Y
    public final Object a() {
        return new K(this.f6902a.a(null), null, null);
    }

    @Override // T1.Y
    public final void b(Object obj, T1.f0 f0Var) throws IOException {
        byte[] bytes = Z9.b.f11042d.b(K.Companion.serializer(), (K) obj).getBytes(H9.a.f3610a);
        p251z9.j.d(bytes, "getBytes(...)");
        f0Var.write(bytes);
    }

    @Override // T1.Y
    public final Object c(FileInputStream fileInputStream) throws C0485b {
        try {
            Z9.b bVar = Z9.b.f11042d;
            String str = new String(p171r0.j.e(fileInputStream), H9.a.f3610a);
            bVar.getClass();
            return (K) bVar.a(K.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new C0485b("Cannot parse session data", e10);
        }
    }
}
