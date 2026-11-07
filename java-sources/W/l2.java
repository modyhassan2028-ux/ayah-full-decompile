package W;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f9235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0576l f9236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f9237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f9238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Z.X f9239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Z.X f9240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(InterfaceC0402u interfaceC0402u, C0576l c0576l, float f3, boolean z10, Z.X x9, Z.X x10) {
        super(0);
        this.f9235r = interfaceC0402u;
        this.f9236s = c0576l;
        this.f9237t = f3;
        this.f9238u = z10;
        this.f9239v = x9;
        this.f9240w = x10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        AbstractC0405x.x(this.f9235r, null, new V(this.f9236s, this.f9237t, this.f9238u, this.f9239v, this.f9240w, null, 1), 3);
        return Boolean.TRUE;
    }
}
