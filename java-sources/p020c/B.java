package p020c;

import F2.t;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.w;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0769s, InterfaceC0777b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f13348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f13349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C f13350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D f13351u;

    public B(D d5, w wVar, x xVar) {
        j.e(xVar, "onBackPressedCallback");
        this.f13351u = d5;
        this.f13348r = wVar;
        this.f13349s = xVar;
        wVar.a(this);
    }

    @Override // p020c.InterfaceC0777b
    public final void cancel() {
        this.f13348r.f(this);
        this.f13349s.f13408b.remove(this);
        C c10 = this.f13350t;
        if (c10 != null) {
            c10.cancel();
        }
        this.f13350t = null;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        if (enumC0766o != EnumC0766o.ON_START) {
            if (enumC0766o != EnumC0766o.ON_STOP) {
                if (enumC0766o == EnumC0766o.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C c10 = this.f13350t;
                if (c10 != null) {
                    c10.cancel();
                    return;
                }
                return;
            }
        }
        x xVar = this.f13349s;
        j.e(xVar, "onBackPressedCallback");
        D d5 = this.f13351u;
        d5.f13355b.addLast(xVar);
        C c11 = new C(d5, xVar);
        xVar.f13408b.add(c11);
        d5.e();
        xVar.f13409c = new t(0, d5, D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 5);
        this.f13350t = c11;
    }
}
