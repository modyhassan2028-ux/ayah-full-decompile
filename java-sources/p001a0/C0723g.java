package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.InterfaceC0674c;
import java.util.List;
import p074h0.e;

/* JADX INFO: renamed from: a0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0723g extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0723g f11101c = new C0723g(0, 2, 1);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        int i10 = ((e) a9.i(0)).f16416a;
        List list = (List) a9.i(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            interfaceC0674c.f(i12, obj);
            interfaceC0674c.m(i12, obj);
        }
    }
}
