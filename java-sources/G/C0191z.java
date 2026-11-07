package G;

import K0.C0366r0;
import androidx.compose.ui.window.PopupLayout;
import java.util.Iterator;
import p020c.InterfaceC0777b;

/* JADX INFO: renamed from: G.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0191z implements Z.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2764b;

    public /* synthetic */ C0191z(int i10, Object obj) {
        this.f2763a = i10;
        this.f2764b = obj;
    }

    @Override // Z.E
    public final void a() {
        switch (this.f2763a) {
            case 0:
                ((A) this.f2764b).f2562d = null;
                break;
            case 1:
                ((L) this.f2764b).f2599c = null;
                break;
            case 2:
                ((H) this.f2764b).f2593f = true;
                break;
            case 3:
                ((O.N) this.f2764b).l();
                break;
            case 4:
                ((C0366r0) this.f2764b).f5154a.invoke();
                break;
            case 5:
                Iterator it = ((p032d.d) this.f2764b).f13408b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0777b) it.next()).cancel();
                }
                break;
            case 6:
                p104k1.o oVar = (p104k1.o) this.f2764b;
                oVar.dismiss();
                oVar.f18943x.c();
                break;
            default:
                PopupLayout popupLayout = (PopupLayout) this.f2764b;
                popupLayout.c();
                popupLayout.getClass();
                androidx.lifecycle.K.g(popupLayout, null);
                popupLayout.f12130E.removeViewImmediate(popupLayout);
                break;
        }
    }
}
