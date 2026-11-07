package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.AbstractC0700p;
import Z.InterfaceC0674c;

/* JADX INFO: loaded from: classes.dex */
public final class z extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f11123c = new z(0, 0, 3);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        if (a10.f10571n != 0) {
            AbstractC0700p.c("Cannot reset when inserting");
        }
        a10.E();
        a10.f10577t = 0;
        a10.f10578u = a10.m() - a10.f10566h;
        a10.f10567i = 0;
        a10.j = 0;
        a10.f10572o = 0;
    }
}
