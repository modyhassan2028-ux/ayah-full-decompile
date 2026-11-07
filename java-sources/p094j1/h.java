package p094j1;

import J0.AbstractC0283f;
import J0.C0298v;
import J0.I;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import l0.q;
import p162q0.f;
import p162q0.j;
import p162q0.k;
import p162q0.t;
import p171r0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f18724a = new g();

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(j jVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        t tVarG = f.g(((k) jVar).f21205f);
        e eVarJ = tVarG != null ? f.j(tVarG) : null;
        if (eVarJ == null) {
            return null;
        }
        int i10 = (int) eVarJ.f21389a;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = (int) eVarJ.f21390b;
        int i14 = iArr[1];
        int i15 = iArr2[1];
        return new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) eVarJ.f21391c) + i11) - i12, (((int) eVarJ.f21392d) + i14) - i15);
    }

    public static final View c(q qVar) {
        ViewFactoryHolder viewFactoryHolder = AbstractC0283f.x(qVar.f19339r).f3902F;
        View interopView = viewFactoryHolder != null ? viewFactoryHolder.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(ViewFactoryHolder viewFactoryHolder, I i10) {
        long jG = ((C0298v) i10.f3914W.f4064c).G(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jG >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jG & 4294967295L)));
        viewFactoryHolder.layout(iRound, iRound2, viewFactoryHolder.getMeasuredWidth() + iRound, viewFactoryHolder.getMeasuredHeight() + iRound2);
    }
}
