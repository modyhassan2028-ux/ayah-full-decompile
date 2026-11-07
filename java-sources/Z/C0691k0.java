package Z;

import K9.InterfaceC0402u;

/* JADX INFO: renamed from: Z.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691k0 implements X, InterfaceC0402u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p150o9.h f10684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f10685s;

    public C0691k0(X x9, p150o9.h hVar) {
        this.f10684r = hVar;
        this.f10685s = x9;
    }

    @Override // K9.InterfaceC0402u
    public final p150o9.h getCoroutineContext() {
        return this.f10684r;
    }

    @Override // Z.L0
    public final Object getValue() {
        return this.f10685s.getValue();
    }

    @Override // Z.X
    public final void setValue(Object obj) {
        this.f10685s.setValue(obj);
    }
}
