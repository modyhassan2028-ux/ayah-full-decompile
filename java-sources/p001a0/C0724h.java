package p001a0;

import A6.a;
import E2.A;
import E6.h;
import Z.A0;
import Z.AbstractC0700p;
import Z.InterfaceC0674c;
import Z.W;
import Z.r;

/* JADX INFO: renamed from: a0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0724h extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0724h f11102c = new C0724h(0, 4, 1);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        W w9 = (W) a9.i(2);
        r rVar = (r) a9.i(1);
        rVar.j(w9);
        AbstractC0700p.d("Could not resolve state for movable content");
        throw new a();
    }
}
