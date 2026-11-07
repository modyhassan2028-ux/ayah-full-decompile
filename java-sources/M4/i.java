package M4;

import F.A;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f5736t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A f5737u;

    public /* synthetic */ i(int i10, int i11, InterfaceC0402u interfaceC0402u, A a9) {
        this.f5734r = i10;
        this.f5735s = i11;
        this.f5736t = interfaceC0402u;
        this.f5737u = a9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        AbstractC0405x.x(this.f5736t, null, new D4.i(this.f5737u, B9.a.V((Float.intBitsToFloat((int) (((p171r0.c) obj).f21387a & 4294967295L)) / this.f5734r) * this.f5735s), null, 1), 3);
        return y.f19095a;
    }
}
