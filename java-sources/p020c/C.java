package p020c;

import p120l9.k;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0777b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f13352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f13353s;

    public C(D d5, x xVar) {
        j.e(xVar, "onBackPressedCallback");
        this.f13353s = d5;
        this.f13352r = xVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [y9.a, z9.h] */
    @Override // p020c.InterfaceC0777b
    public final void cancel() {
        D d5 = this.f13353s;
        k kVar = d5.f13355b;
        x xVar = this.f13352r;
        kVar.remove(xVar);
        if (j.a(d5.f13356c, xVar)) {
            xVar.a();
            d5.f13356c = null;
        }
        xVar.f13408b.remove(this);
        ?? r10 = xVar.f13409c;
        if (r10 != 0) {
            r10.invoke();
        }
        xVar.f13409c = null;
    }
}
