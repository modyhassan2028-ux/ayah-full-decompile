package K0;

import A.C0039q;
import K9.AbstractC0405x;
import Z.C0704u;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f5170a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    public static final r1 a(AbstractComposeView abstractComposeView, Z.r rVar, p074h0.d dVar) {
        AndroidComposeView androidComposeView;
        r1 r1Var;
        Object[] objArr = 0;
        if (AbstractC0372u0.f5173a.compareAndSet(false, true)) {
            M9.e eVarA = p185s8.u0.a(1, 6, null);
            AbstractC0405x.x(AbstractC0405x.b((p150o9.h) Y.f5035D.getValue()), null, new C0039q((Object) eVarA, (p150o9.c) (objArr == true ? 1 : 0), 15), 3);
            A.M0 m10 = new A.M0(16, eVarA);
            synchronized (p093j0.n.f18661b) {
                p093j0.n.f18666h = p120l9.m.r0(p093j0.n.f18666h, m10);
            }
            p093j0.n.a();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), rVar.h());
                abstractComposeView.addView(androidComposeView.getView(), f5170a);
            }
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            r1Var = tag instanceof r1 ? (r1) tag : null;
            if (r1Var == null) {
                r1Var = new r1(androidComposeView, new C0704u(rVar, new android.support.v4.media.session.r(androidComposeView.getRoot())));
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, r1Var);
            }
            r1Var.c(dVar);
            if (!p251z9.j.a(androidComposeView.getCoroutineContext(), rVar.h())) {
                androidComposeView.setCoroutineContext(rVar.h());
            }
            return r1Var;
        }
        abstractComposeView.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), rVar.h());
            abstractComposeView.addView(androidComposeView.getView(), f5170a);
        }
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof r1) {
        }
        if (r1Var == null) {
            r1Var = new r1(androidComposeView, new C0704u(rVar, new android.support.v4.media.session.r(androidComposeView.getRoot())));
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, r1Var);
        }
        r1Var.c(dVar);
        if (!p251z9.j.a(androidComposeView.getCoroutineContext(), rVar.h())) {
            androidComposeView.setCoroutineContext(rVar.h());
        }
        return r1Var;
    }
}
