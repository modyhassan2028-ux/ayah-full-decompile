package com.google.android.material.floatingactionbutton;

import F7.b;
import F7.e;
import F7.f;
import F7.g;
import F7.h;
import F7.i;
import F7.j;
import H7.AbstractC0231e;
import H7.H;
import I1.S;
import M.k;
import R7.o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p123m2.c;
import u1.a;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final f f14912c0 = new f(Float.class, "width", 0);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final f f14913d0 = new f(Float.class, "height", 1);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final f f14914e0 = new f(Float.class, "paddingStart", 2);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final f f14915f0 = new f(Float.class, "paddingEnd", 3);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f14916K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final g f14917L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final g f14918M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final i f14919N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final h f14920O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f14921P;
    public int Q;
    public int R;
    public final ExtendedFloatingActionButtonBehavior S;
    public boolean T;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f14922V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ColorStateList f14923W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f14924a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f14925b0;

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[LOOP:0: B:37:0x007e->B:38:0x0080, LOOP_END] */
    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
        b bVar;
        int i11;
        AnimatorSet animatorSetA;
        ArrayList arrayList;
        int size;
        ViewGroup.LayoutParams layoutParams;
        if (i10 == 0) {
            bVar = extendedFloatingActionButton.f14919N;
        } else if (i10 == 1) {
            bVar = extendedFloatingActionButton.f14920O;
        } else if (i10 == 2) {
            bVar = extendedFloatingActionButton.f14917L;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(c.r(i10, "Unknown strategy type: "));
            }
            bVar = extendedFloatingActionButton.f14918M;
        }
        if (bVar.h()) {
            return;
        }
        WeakHashMap weakHashMap = S.f3689a;
        if (extendedFloatingActionButton.isLaidOut()) {
            if (!extendedFloatingActionButton.isInEditMode()) {
                if (i10 == 2) {
                    layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams != null) {
                        extendedFloatingActionButton.f14924a0 = layoutParams.width;
                        extendedFloatingActionButton.f14925b0 = layoutParams.height;
                    } else {
                        extendedFloatingActionButton.f14924a0 = extendedFloatingActionButton.getWidth();
                        extendedFloatingActionButton.f14925b0 = extendedFloatingActionButton.getHeight();
                    }
                }
                i11 = 0;
                extendedFloatingActionButton.measure(0, 0);
                animatorSetA = bVar.a();
                animatorSetA.addListener(new e(0, bVar));
                arrayList = bVar.f2425c;
                size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    animatorSetA.addListener((Animator.AnimatorListener) obj);
                }
                animatorSetA.start();
                return;
            }
        } else if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.f14922V) {
                if (!extendedFloatingActionButton.isInEditMode()) {
                    if (i10 == 2) {
                        layoutParams = extendedFloatingActionButton.getLayoutParams();
                        if (layoutParams != null) {
                            extendedFloatingActionButton.f14924a0 = layoutParams.width;
                            extendedFloatingActionButton.f14925b0 = layoutParams.height;
                        } else {
                            extendedFloatingActionButton.f14924a0 = extendedFloatingActionButton.getWidth();
                            extendedFloatingActionButton.f14925b0 = extendedFloatingActionButton.getHeight();
                        }
                    }
                    i11 = 0;
                    extendedFloatingActionButton.measure(0, 0);
                    animatorSetA = bVar.a();
                    animatorSetA.addListener(new e(0, bVar));
                    arrayList = bVar.f2425c;
                    size = arrayList.size();
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        animatorSetA.addListener((Animator.AnimatorListener) obj2);
                    }
                    animatorSetA.start();
                    return;
                }
            }
        } else if (extendedFloatingActionButton.f14922V) {
            if (!extendedFloatingActionButton.isInEditMode()) {
                if (i10 == 2) {
                    layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams != null) {
                        extendedFloatingActionButton.f14924a0 = layoutParams.width;
                        extendedFloatingActionButton.f14925b0 = layoutParams.height;
                    } else {
                        extendedFloatingActionButton.f14924a0 = extendedFloatingActionButton.getWidth();
                        extendedFloatingActionButton.f14925b0 = extendedFloatingActionButton.getHeight();
                    }
                }
                i11 = 0;
                extendedFloatingActionButton.measure(0, 0);
                animatorSetA = bVar.a();
                animatorSetA.addListener(new e(0, bVar));
                arrayList = bVar.f2425c;
                size = arrayList.size();
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    animatorSetA.addListener((Animator.AnimatorListener) obj3);
                }
                animatorSetA.start();
                return;
            }
        }
        bVar.g();
    }

    public final void f(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // u1.a
    public u1.b getBehavior() {
        return this.S;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.f14921P;
        if (i10 >= 0) {
            return i10;
        }
        WeakHashMap weakHashMap = S.f3689a;
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public p137n7.e getExtendMotionSpec() {
        return this.f14918M.f2428f;
    }

    public p137n7.e getHideMotionSpec() {
        return this.f14920O.f2428f;
    }

    public p137n7.e getShowMotionSpec() {
        return this.f14919N.f2428f;
    }

    public p137n7.e getShrinkMotionSpec() {
        return this.f14917L.f2428f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.T && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.T = false;
            this.f14917L.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f14922V = z10;
    }

    public void setExtendMotionSpec(p137n7.e eVar) {
        this.f14918M.f2428f = eVar;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(p137n7.e.b(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.T == z10) {
            return;
        }
        g gVar = z10 ? this.f14918M : this.f14917L;
        if (gVar.h()) {
            return;
        }
        gVar.g();
    }

    public void setHideMotionSpec(p137n7.e eVar) {
        this.f14920O.f2428f = eVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(p137n7.e.b(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.T || this.U) {
            return;
        }
        WeakHashMap weakHashMap = S.f3689a;
        this.Q = getPaddingStart();
        this.R = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.T || this.U) {
            return;
        }
        this.Q = i10;
        this.R = i12;
    }

    public void setShowMotionSpec(p137n7.e eVar) {
        this.f14919N.f2428f = eVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(p137n7.e.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(p137n7.e eVar) {
        this.f14917L.f2428f = eVar;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(p137n7.e.b(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.f14923W = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends u1.b {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Rect f14926r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f14927s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f14928t;

        public ExtendedFloatingActionButtonBehavior() {
            this.f14927s = false;
            this.f14928t = true;
        }

        @Override // u1.b
        public final /* bridge */ /* synthetic */ boolean e(Rect rect, View view) {
            return false;
        }

        @Override // u1.b
        public final void g(u1.e eVar) {
            if (eVar.f22812h == 0) {
                eVar.f22812h = 80;
            }
        }

        @Override // u1.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof u1.e ? ((u1.e) layoutParams).f22806a instanceof BottomSheetBehavior : false) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // u1.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListO = coordinatorLayout.o(extendedFloatingActionButton);
            int size = arrayListO.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayListO.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof u1.e ? ((u1.e) layoutParams).f22806a instanceof BottomSheetBehavior : false) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.v(i10, extendedFloatingActionButton);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            u1.e eVar = (u1.e) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f14927s;
            boolean z11 = this.f14928t;
            if ((!z10 && !z11) || eVar.f22811f != appBarLayout.getId()) {
                return false;
            }
            if (this.f14926r == null) {
                this.f14926r = new Rect();
            }
            Rect rect = this.f14926r;
            AbstractC0231e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z11 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z11 ? 3 : 0);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            u1.e eVar = (u1.e) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f14927s;
            boolean z11 = this.f14928t;
            if ((!z10 && !z11) || eVar.f22811f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((u1.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z11 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, z11 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19678r);
            this.f14927s = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f14928t = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i10);
        char c10 = 0;
        this.f14916K = 0;
        int i11 = 8;
        p248z6.c cVar = new p248z6.c(c10, i11);
        i iVar = new i(this, cVar);
        this.f14919N = iVar;
        h hVar = new h(this, cVar);
        this.f14920O = hVar;
        this.T = true;
        this.U = false;
        this.f14922V = false;
        Context context2 = getContext();
        this.S = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19677q, i10, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        p137n7.e eVarA = p137n7.e.a(context2, typedArrayM, 5);
        p137n7.e eVarA2 = p137n7.e.a(context2, typedArrayM, 4);
        p137n7.e eVarA3 = p137n7.e.a(context2, typedArrayM, 2);
        p137n7.e eVarA4 = p137n7.e.a(context2, typedArrayM, 6);
        this.f14921P = typedArrayM.getDimensionPixelSize(0, -1);
        int i12 = typedArrayM.getInt(3, 1);
        WeakHashMap weakHashMap = S.f3689a;
        this.Q = getPaddingStart();
        this.R = getPaddingEnd();
        p248z6.c cVar2 = new p248z6.c(c10, i11);
        p248z6.c cVar3 = new p248z6.c(9, this);
        k kVar = new k(this, cVar3, 14);
        r rVar = new r(this, kVar, cVar3);
        boolean z10 = true;
        j jVar = cVar3;
        if (i12 != 1) {
            j jVar2 = i12 != 2 ? rVar : kVar;
            z10 = true;
            jVar = jVar2;
        }
        g gVar = new g(this, cVar2, jVar, z10);
        this.f14918M = gVar;
        g gVar2 = new g(this, cVar2, new O8.c((Object) this), false);
        this.f14917L = gVar2;
        iVar.f2428f = eVarA;
        hVar.f2428f = eVarA2;
        gVar.f2428f = eVarA3;
        gVar2.f2428f = eVarA4;
        typedArrayM.recycle();
        setShapeAppearanceModel(o.c(context2, attributeSet, i10, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, o.f7347m).a());
        this.f14923W = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f14923W = getTextColors();
    }
}
