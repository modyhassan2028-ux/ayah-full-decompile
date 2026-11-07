package p094j1;

import H0.InterfaceC0219s;
import I1.B0;
import I1.S;
import J0.I;
import J0.r0;
import K0.C0358n;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.HashMap;
import p063g1.l;
import p110k9.y;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f18712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I f18713t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ViewFactoryHolder viewFactoryHolder, I i10, int i11) {
        super(1);
        this.f18711r = i11;
        this.f18712s = viewFactoryHolder;
        this.f18713t = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        WindowInsets windowInsetsG;
        switch (this.f18711r) {
            case 0:
                r0 r0Var = (r0) obj;
                AndroidComposeView androidComposeView = r0Var instanceof AndroidComposeView ? (AndroidComposeView) r0Var : null;
                ViewFactoryHolder viewFactoryHolder = this.f18712s;
                if (androidComposeView != null) {
                    HashMap<AndroidViewHolder, I> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    I i10 = this.f18713t;
                    holderToLayoutNode.put(viewFactoryHolder, i10);
                    androidComposeView.getAndroidViewsHandler$ui_release().addView(viewFactoryHolder);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(i10, viewFactoryHolder);
                    viewFactoryHolder.setImportantForAccessibility(1);
                    S.o(viewFactoryHolder, new C0358n(androidComposeView, i10, androidComposeView));
                }
                if (viewFactoryHolder.getView().getParent() != viewFactoryHolder) {
                    viewFactoryHolder.addView(viewFactoryHolder.getView());
                }
                break;
            case 1:
                h.d(this.f18712s, this.f18713t);
                break;
            default:
                I i11 = this.f18713t;
                ViewFactoryHolder viewFactoryHolder2 = this.f18712s;
                h.d(viewFactoryHolder2, i11);
                ((AndroidComposeView) viewFactoryHolder2.f12115t).f12016O = true;
                int[] iArr = viewFactoryHolder2.f12101E;
                int i12 = iArr[0];
                int i13 = iArr[1];
                viewFactoryHolder2.getView().getLocationOnScreen(iArr);
                long j = viewFactoryHolder2.f12102F;
                long jF = ((InterfaceC0219s) obj).F();
                viewFactoryHolder2.f12102F = jF;
                B0 b5 = viewFactoryHolder2.f12103G;
                if (b5 != null && ((i12 != iArr[0] || i13 != iArr[1] || !l.a(j, jF)) && (windowInsetsG = viewFactoryHolder2.m(b5).g()) != null)) {
                    viewFactoryHolder2.getView().dispatchApplyWindowInsets(windowInsetsG);
                }
                break;
        }
        return y.f19095a;
    }
}
