package p094j1;

import J0.AbstractC0283f;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import p110k9.y;
import p162q0.a;
import p162q0.f;
import p162q0.j;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class l extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f18745s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i10) {
        super(1);
        this.f18744r = i10;
        this.f18745s = mVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f18744r) {
            case 0:
                a aVar = (a) obj;
                m mVar = this.f18745s;
                View viewC = h.c(mVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    if (!f.z(viewC, f.D(aVar.f21183a), h.b(AbstractC0283f.y(mVar).getFocusOwner(), AbstractC0283f.z(mVar), viewC))) {
                        aVar.f21184b = true;
                    }
                }
                return y.f19095a;
            default:
                a aVar2 = (a) obj;
                m mVar2 = this.f18745s;
                View viewC2 = h.c(mVar2);
                if (viewC2.hasFocus()) {
                    j focusOwner = AbstractC0283f.y(mVar2).getFocusOwner();
                    View viewZ = AbstractC0283f.z(mVar2);
                    if (viewC2 instanceof ViewGroup) {
                        Rect rectB = h.b(focusOwner, viewZ, viewC2);
                        Integer numD = f.D(aVar2.f21183a);
                        int iIntValue = numD != null ? numD.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = mVar2.f18746F;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewZ, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewZ, rectB, iIntValue);
                        if (viewFindNextFocus != null && h.a(viewC2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectB);
                            aVar2.f21184b = true;
                        } else if (!viewZ.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewZ.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return y.f19095a;
        }
    }
}
