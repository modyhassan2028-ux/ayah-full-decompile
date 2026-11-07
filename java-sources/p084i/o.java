package p084i;

import I1.G;
import I1.S;
import L5.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class o extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, Object obj) {
        super(4);
        this.f16621c = i10;
        this.f16622d = obj;
    }

    @Override // I1.InterfaceC0242a0
    public final void a() {
        int i10 = this.f16621c;
        Object obj = this.f16622d;
        switch (i10) {
            case 0:
                x xVar = ((l) obj).f16618s;
                xVar.f16663M.setAlpha(1.0f);
                xVar.f16666P.d(null);
                xVar.f16666P = null;
                break;
            case 1:
                x xVar2 = (x) obj;
                xVar2.f16663M.setAlpha(1.0f);
                xVar2.f16666P.d(null);
                xVar2.f16666P = null;
                break;
            default:
                x xVar3 = (x) ((c) obj).f5533t;
                xVar3.f16663M.setVisibility(8);
                PopupWindow popupWindow = xVar3.f16664N;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (xVar3.f16663M.getParent() instanceof View) {
                    View view = (View) xVar3.f16663M.getParent();
                    WeakHashMap weakHashMap = S.f3689a;
                    G.c(view);
                }
                xVar3.f16663M.e();
                xVar3.f16666P.d(null);
                xVar3.f16666P = null;
                ViewGroup viewGroup = xVar3.R;
                WeakHashMap weakHashMap2 = S.f3689a;
                G.c(viewGroup);
                break;
        }
    }

    @Override // va.g, I1.InterfaceC0242a0
    public void c() {
        int i10 = this.f16621c;
        Object obj = this.f16622d;
        switch (i10) {
            case 0:
                ((l) obj).f16618s.f16663M.setVisibility(0);
                break;
            case 1:
                x xVar = (x) obj;
                xVar.f16663M.setVisibility(0);
                if (xVar.f16663M.getParent() instanceof View) {
                    View view = (View) xVar.f16663M.getParent();
                    WeakHashMap weakHashMap = S.f3689a;
                    G.c(view);
                }
                break;
        }
    }
}
