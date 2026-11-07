package K0;

import A.C0007a;
import Z.C0704u;
import Z.InterfaceC0701q;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements InterfaceC0701q, InterfaceC0769s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AndroidComposeView f5156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0704u f5157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.lifecycle.w f5159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p241y9.e f5160v = AbstractC0357m0.f5099a;

    public r1(AndroidComposeView androidComposeView, C0704u c0704u) {
        this.f5156r = androidComposeView;
        this.f5157s = c0704u;
    }

    public final void a() {
        if (!this.f5158t) {
            this.f5158t = true;
            this.f5156r.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.w wVar = this.f5159u;
            if (wVar != null) {
                wVar.f(this);
            }
        }
        this.f5157s.l();
    }

    public final void c(p241y9.e eVar) {
        this.f5156r.setOnViewTreeOwnersAvailable(new C0007a(22, this, eVar));
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        if (enumC0766o == EnumC0766o.ON_DESTROY) {
            a();
        } else {
            if (enumC0766o != EnumC0766o.ON_CREATE || this.f5158t) {
                return;
            }
            c(this.f5160v);
        }
    }
}
