package p001a0;

import E2.A;
import E6.h;
import K.y0;
import Z.A0;
import Z.InterfaceC0674c;
import p074h0.e;

/* JADX INFO: renamed from: a0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0722f extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0722f f11100c = new C0722f(0, 2, 1);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        e eVar = (e) a9.i(1);
        int i10 = eVar != null ? eVar.f16416a : 0;
        C0717a c0717a = (C0717a) a9.i(0);
        if (i10 > 0) {
            interfaceC0674c = new y0(interfaceC0674c, i10);
        }
        c0717a.S(interfaceC0674c, a10, hVar);
    }
}
