package p232y;

import A.M0;
import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import J0.C0;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class A extends q implements C0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final D f24409G = new D(5);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public M0 f24410F;

    @Override // J0.C0
    public final Object p() {
        return f24409G;
    }

    public final void v0(InterfaceC0219s interfaceC0219s) {
        this.f24410F.e(interfaceC0219s);
        A a9 = (A) AbstractC0283f.j(this);
        if (a9 != null) {
            a9.v0(interfaceC0219s);
        }
    }
}
