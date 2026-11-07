package M4;

import A.V0;
import A.k1;
import D0.z;
import D4.l;
import F.A;
import G9.m;
import K9.InterfaceC0402u;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class k implements PointerInputEventHandler {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f5744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A f5745u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5746v;

    public k(int i10, int i11, InterfaceC0402u interfaceC0402u, A a9, int i12) {
        this.f5742r = i10;
        this.f5743s = i11;
        this.f5744t = interfaceC0402u;
        this.f5745u = a9;
        this.f5746v = i12;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(z zVar, p150o9.c cVar) {
        int i10 = this.f5742r;
        int i11 = this.f5743s;
        InterfaceC0402u interfaceC0402u = this.f5744t;
        A a9 = this.f5745u;
        Object objD = V0.d(zVar, new k1(new i(i10, i11, interfaceC0402u, a9), new m(2), new l(this.f5746v, 2, interfaceC0402u, a9), new Ba.b(3), new Ba.b(3), null, 2), cVar);
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (objD != aVar) {
            objD = yVar;
        }
        return objD == aVar ? objD : yVar;
    }
}
