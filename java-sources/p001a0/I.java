package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.InterfaceC0674c;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11080b;

    public I(int i10, int i11) {
        this.f11079a = i10;
        this.f11080b = i11;
    }

    public abstract void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar);

    public final String toString() {
        String strC = w.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public /* synthetic */ I(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
