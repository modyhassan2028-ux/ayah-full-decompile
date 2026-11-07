package K0;

import I1.C0243b;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* JADX INFO: renamed from: K0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0358n extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f5109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J0.I f5110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f5111f;

    public C0358n(AndroidComposeView androidComposeView, J0.I i10, AndroidComposeView androidComposeView2) {
        this.f5109d = androidComposeView;
        this.f5110e = i10;
        this.f5111f = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // I1.C0243b
    public final void d(View view, J1.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        this.f3710a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.f5109d;
        E e10 = androidComposeView.f12001G;
        if (e10.u()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        J0.I i10 = this.f5110e;
        J0.I iU = i10.u();
        while (true) {
            if (iU == null) {
                iU = null;
                break;
            } else if (iU.f3914W.g(8)) {
                break;
            } else {
                iU = iU.u();
            }
        }
        Integer numValueOf = iU != null ? Integer.valueOf(iU.f3926s) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        gVar.f4220b = iIntValue;
        AndroidComposeView androidComposeView2 = this.f5111f;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i11 = i10.f3926s;
        int iD = e10.f4891E.d(i11);
        if (iD != -1) {
            AndroidViewHolder androidViewHolderR = P.r(androidComposeView.getAndroidViewsHandler$ui_release(), iD);
            if (androidViewHolderR != null) {
                accessibilityNodeInfo.setTraversalBefore(androidViewHolderR);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iD);
            }
            AndroidComposeView.a(androidComposeView, i11, accessibilityNodeInfo, e10.f4893G);
        }
        int iD2 = e10.f4892F.d(i11);
        if (iD2 != -1) {
            AndroidViewHolder androidViewHolderR2 = P.r(androidComposeView.getAndroidViewsHandler$ui_release(), iD2);
            if (androidViewHolderR2 != null) {
                accessibilityNodeInfo.setTraversalAfter(androidViewHolderR2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iD2);
            }
            AndroidComposeView.a(androidComposeView, i11, accessibilityNodeInfo, e10.f4894H);
        }
    }
}
