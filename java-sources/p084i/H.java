package p084i;

import I1.G;
import I1.S;
import L5.c;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class H extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J f16520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(J j, int i10) {
        super(4);
        this.f16519c = i10;
        this.f16520d = j;
    }

    @Override // I1.InterfaceC0242a0
    public final void a() {
        View view;
        int i10 = this.f16519c;
        J j = this.f16520d;
        switch (i10) {
            case 0:
                if (j.f16542s && (view = j.f16534k) != null) {
                    view.setTranslationY(0.0f);
                    j.f16532h.setTranslationY(0.0f);
                }
                j.f16532h.setVisibility(8);
                j.f16532h.setTransitioning(false);
                j.f16546w = null;
                c cVar = j.f16538o;
                if (cVar != null) {
                    cVar.F(j.f16537n);
                    j.f16537n = null;
                    j.f16538o = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = j.g;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = S.f3689a;
                    G.c(actionBarOverlayLayout);
                }
                break;
            default:
                j.f16546w = null;
                j.f16532h.requestLayout();
                break;
        }
    }
}
