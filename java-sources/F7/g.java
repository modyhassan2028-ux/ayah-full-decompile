package F7;

import I1.S;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.ayah.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public final j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f2449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ExtendedFloatingActionButton extendedFloatingActionButton, p248z6.c cVar, j jVar, boolean z10) {
        super(extendedFloatingActionButton, cVar);
        this.f2449i = extendedFloatingActionButton;
        this.g = jVar;
        this.f2448h = z10;
    }

    @Override // F7.b
    public final AnimatorSet a() {
        p137n7.e eVar = this.f2428f;
        if (eVar == null) {
            if (this.f2427e == null) {
                this.f2427e = p137n7.e.b(this.f2423a, c());
            }
            eVar = this.f2427e;
            eVar.getClass();
        }
        boolean zG = eVar.g("width");
        j jVar = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2449i;
        if (zG) {
            PropertyValuesHolder[] propertyValuesHolderArrE = eVar.e("width");
            propertyValuesHolderArrE[0].setFloatValues(extendedFloatingActionButton.getWidth(), jVar.b());
            eVar.h("width", propertyValuesHolderArrE);
        }
        if (eVar.g("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrE2 = eVar.e("height");
            propertyValuesHolderArrE2[0].setFloatValues(extendedFloatingActionButton.getHeight(), jVar.a());
            eVar.h("height", propertyValuesHolderArrE2);
        }
        if (eVar.g("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrE3 = eVar.e("paddingStart");
            PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArrE3[0];
            WeakHashMap weakHashMap = S.f3689a;
            propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), jVar.l());
            eVar.h("paddingStart", propertyValuesHolderArrE3);
        }
        if (eVar.g("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrE4 = eVar.e("paddingEnd");
            PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolderArrE4[0];
            WeakHashMap weakHashMap2 = S.f3689a;
            propertyValuesHolder2.setFloatValues(extendedFloatingActionButton.getPaddingEnd(), jVar.i());
            eVar.h("paddingEnd", propertyValuesHolderArrE4);
        }
        if (eVar.g("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrE5 = eVar.e("labelOpacity");
            boolean z10 = this.f2448h;
            propertyValuesHolderArrE5[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            eVar.h("labelOpacity", propertyValuesHolderArrE5);
        }
        return b(eVar);
    }

    @Override // F7.b
    public final int c() {
        return this.f2448h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // F7.b
    public final void e() {
        this.f2426d.f24847s = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2449i;
        extendedFloatingActionButton.U = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        j jVar = this.g;
        layoutParams.width = jVar.w().width;
        layoutParams.height = jVar.w().height;
    }

    @Override // F7.b
    public final void f(Animator animator) {
        p248z6.c cVar = this.f2426d;
        Animator animator2 = (Animator) cVar.f24847s;
        if (animator2 != null) {
            animator2.cancel();
        }
        cVar.f24847s = animator;
        boolean z10 = this.f2448h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2449i;
        extendedFloatingActionButton.T = z10;
        extendedFloatingActionButton.U = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // F7.b
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2449i;
        boolean z10 = this.f2448h;
        extendedFloatingActionButton.T = z10;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            extendedFloatingActionButton.f14924a0 = layoutParams.width;
            extendedFloatingActionButton.f14925b0 = layoutParams.height;
        }
        j jVar = this.g;
        layoutParams.width = jVar.w().width;
        layoutParams.height = jVar.w().height;
        int iL = jVar.l();
        int paddingTop = extendedFloatingActionButton.getPaddingTop();
        int i10 = jVar.i();
        int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
        WeakHashMap weakHashMap = S.f3689a;
        extendedFloatingActionButton.setPaddingRelative(iL, paddingTop, i10, paddingBottom);
        extendedFloatingActionButton.requestLayout();
    }

    @Override // F7.b
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2449i;
        return this.f2448h == extendedFloatingActionButton.T || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
