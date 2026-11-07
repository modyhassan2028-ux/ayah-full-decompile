package p014b3;

import E2.AbstractC0135m0;
import E2.B0;
import E2.u0;
import J1.f;
import J1.g;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends LinearLayoutManager {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f13229E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ViewPager2 viewPager2) {
        super(1);
        this.f13229E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(B0 b5, int[] iArr) {
        ViewPager2 viewPager2 = this.f13229E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.F0(b5, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final void W(u0 u0Var, B0 b5, g gVar) {
        super.W(u0Var, b5, gVar);
        this.f13229E.f13048K.getClass();
    }

    @Override // E2.AbstractC0135m0
    public final void X(u0 u0Var, B0 b5, View view, g gVar) {
        int iH;
        ViewPager2 viewPager2 = (ViewPager2) this.f13229E.f13048K.f557u;
        int iH2 = 0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f13055x.getClass();
            iH = AbstractC0135m0.H(view);
        } else {
            iH = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f13055x.getClass();
            iH2 = AbstractC0135m0.H(view);
        }
        gVar.o(f.a(iH, 1, iH2, 1, false, false));
    }

    @Override // E2.AbstractC0135m0
    public final boolean k0(u0 u0Var, B0 b5, int i10, Bundle bundle) {
        this.f13229E.f13048K.getClass();
        return super.k0(u0Var, b5, i10, bundle);
    }

    @Override // E2.AbstractC0135m0
    public final boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }
}
