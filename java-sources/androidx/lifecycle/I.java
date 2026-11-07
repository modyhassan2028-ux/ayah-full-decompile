package androidx.lifecycle;

import K0.C0368s0;

/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC0769s, AutoCloseable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final H f12621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12622t;

    public I(String str, H h7) {
        this.f12620r = str;
        this.f12621s = h7;
    }

    public final void E(L5.c cVar, w wVar) {
        p251z9.j.e(cVar, "registry");
        p251z9.j.e(wVar, "lifecycle");
        if (this.f12622t) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f12622t = true;
        wVar.a(this);
        cVar.L(this.f12620r, (C0368s0) this.f12621s.f12619b.f1964f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        if (enumC0766o == EnumC0766o.ON_DESTROY) {
            this.f12622t = false;
            interfaceC0771u.h().f(this);
        }
    }
}
