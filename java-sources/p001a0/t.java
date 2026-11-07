package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.AbstractC0700p;
import Z.C0670a;
import Z.InterfaceC0674c;
import Z.x0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f11117c = new t(0, 3, 1);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        x0 x0Var = (x0) a9.i(1);
        C0670a c0670a = (C0670a) a9.i(0);
        C0719c c0719c = (C0719c) a9.i(2);
        A0 a0E = x0Var.e();
        try {
            if (!c0719c.j.U()) {
                AbstractC0700p.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            c0719c.f11097i.T(interfaceC0674c, a0E, hVar);
            a0E.e(true);
            a10.d();
            c0670a.getClass();
            a10.y(x0Var, x0Var.b(c0670a));
            a10.j();
        } catch (Throwable th) {
            a0E.e(false);
            throw th;
        }
    }
}
