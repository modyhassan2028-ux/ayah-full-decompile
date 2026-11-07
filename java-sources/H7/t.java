package H7;

import E2.H0;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class t extends H0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f3558f = wVar;
    }

    @Override // E2.H0, I1.C0243b
    public final void d(View view, J1.g gVar) {
        super.d(view, gVar);
        w wVar = this.f3558f.f3579v.f3553x;
        int i10 = 0;
        for (int i11 = 0; i11 < wVar.f3579v.f3550u.size(); i11++) {
            int iC = wVar.f3579v.c(i11);
            if (iC == 0 || iC == 1) {
                i10++;
            }
        }
        gVar.f4219a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 1, false));
    }
}
