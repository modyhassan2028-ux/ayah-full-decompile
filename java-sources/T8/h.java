package T8;

import T1.C0485b;
import T1.Y;
import T1.f0;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f7952a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f7953b = new g(null, null, null, null, null);

    @Override // T1.Y
    public final /* bridge */ /* synthetic */ Object a() {
        return f7953b;
    }

    @Override // T1.Y
    public final void b(Object obj, f0 f0Var) throws IOException {
        byte[] bytes = Z9.b.f11042d.b(g.Companion.serializer(), (g) obj).getBytes(H9.a.f3610a);
        p251z9.j.d(bytes, "getBytes(...)");
        f0Var.write(bytes);
    }

    @Override // T1.Y
    public final Object c(FileInputStream fileInputStream) throws C0485b {
        try {
            Z9.b bVar = Z9.b.f11042d;
            String str = new String(p171r0.j.e(fileInputStream), H9.a.f3610a);
            bVar.getClass();
            return (g) bVar.a(g.Companion.serializer(), str);
        } catch (Exception e10) {
            throw new C0485b("Cannot parse session configs", e10);
        }
    }
}
