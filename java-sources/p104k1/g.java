package p104k1;

import H0.InterfaceC0219s;
import K0.RunnableC0373v;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.window.PopupLayout;
import p063g1.l;
import p110k9.y;
import p241y9.a;
import p241y9.c;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f18916s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PopupLayout popupLayout, int i10) {
        super(1);
        this.f18915r = i10;
        this.f18916s = popupLayout;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f18915r) {
            case 0:
                InterfaceC0219s interfaceC0219sJ = ((InterfaceC0219s) obj).j();
                j.b(interfaceC0219sJ);
                this.f18916s.k(interfaceC0219sJ);
                break;
            case 1:
                l lVar = new l(((l) obj).f16260a);
                PopupLayout popupLayout = this.f18916s;
                popupLayout.m4setPopupContentSizefhxjrPA(lVar);
                popupLayout.l();
                break;
            default:
                a aVar = (a) obj;
                PopupLayout popupLayout2 = this.f18916s;
                Handler handler = popupLayout2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = popupLayout2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0373v(3, aVar));
                    }
                }
                break;
        }
        return y.f19095a;
    }
}
