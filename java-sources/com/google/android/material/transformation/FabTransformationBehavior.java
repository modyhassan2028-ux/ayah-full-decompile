package com.google.android.material.transformation;

import E2.C0150y;
import F7.m;
import I1.C0248d0;
import I1.I;
import I1.S;
import L5.c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ayah.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p008a8.b;
import p137n7.a;
import p137n7.d;
import p137n7.e;
import p137n7.f;
import p137n7.g;
import p181s2.r;
import u.O;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f15384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f15385u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f15386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f15387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f15388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f15389y;

    public FabTransformationBehavior() {
        this.f15384t = new Rect();
        this.f15385u = new RectF();
        this.f15386v = new RectF();
        this.f15387w = new int[2];
    }

    public static float B(c cVar, f fVar, float f3) {
        long j = fVar.f20025a;
        long j10 = fVar.f20026b;
        f fVarF = ((e) cVar.f5532s).f("expansion");
        return a.a(f3, 0.0f, fVar.b().getInterpolation((((fVarF.f20025a + fVarF.f20026b) + 17) - j) / j10));
    }

    public static Pair y(float f3, float f7, boolean z10, c cVar) {
        f fVarF;
        f fVarF2;
        if (f3 == 0.0f || f7 == 0.0f) {
            fVarF = ((e) cVar.f5532s).f("translationXLinear");
            fVarF2 = ((e) cVar.f5532s).f("translationYLinear");
        } else if ((!z10 || f7 >= 0.0f) && (z10 || f7 <= 0.0f)) {
            fVarF = ((e) cVar.f5532s).f("translationXCurveDownwards");
            fVarF2 = ((e) cVar.f5532s).f("translationYCurveDownwards");
        } else {
            fVarF = ((e) cVar.f5532s).f("translationXCurveUpwards");
            fVarF2 = ((e) cVar.f5532s).f("translationYCurveUpwards");
        }
        return new Pair(fVarF, fVarF2);
    }

    public final float A(View view, View view2, g gVar) {
        RectF rectF = this.f15385u;
        C(view, rectF);
        rectF.offset(this.f15388x, this.f15389y);
        RectF rectF2 = this.f15386v;
        C(view2, rectF2);
        gVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f15387w;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract c D(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableBehavior, u1.b
    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // u1.b
    public final void g(u1.e eVar) {
        if (eVar.f22812h == 0) {
            eVar.f22812h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0152  */
    /* JADX WARN: Code duplicated, block: B:97:0x0360  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        float f3;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        AnimatorSet animatorSetC;
        int i10;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2;
        c cVarD = D(view2.getContext(), z10);
        if (z10) {
            this.f15388x = view.getTranslationX();
            this.f15389y = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap weakHashMap = S.f3689a;
        float fE = I.e(view2) - I.e(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fE);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fE);
        }
        ((e) cVarD.f5532s).f("elevation").a(objectAnimatorOfFloat);
        arrayList2.add(objectAnimatorOfFloat);
        float fZ = z(view, view2, (g) cVarD.f5533t);
        float fA = A(view, view2, (g) cVarD.f5533t);
        Pair pairY = y(fZ, fA, z10, cVarD);
        f fVar = (f) pairY.first;
        f fVar2 = (f) pairY.second;
        RectF rectF = this.f15386v;
        Rect rect = this.f15384t;
        RectF rectF2 = this.f15385u;
        if (z10) {
            f3 = 0.0f;
            if (!z11) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(cVarD, fVar, -fZ);
            float fB2 = B(cVarD, fVar2, -fA);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF2.set(rect);
            C(view2, rectF);
            rectF.offset(fB, fB2);
            rectF.intersect(rectF2);
            rectF2.set(rectF);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            f3 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        fVar.a(objectAnimatorOfFloat2);
        fVar2.a(objectAnimatorOfFloat3);
        arrayList2.add(objectAnimatorOfFloat2);
        arrayList2.add(objectAnimatorOfFloat3);
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        float fZ2 = z(view, view2, (g) cVarD.f5533t);
        float fA2 = A(view, view2, (g) cVarD.f5533t);
        Pair pairY2 = y(fZ2, fA2, z10, cVarD);
        f fVar3 = (f) pairY2.first;
        f fVar4 = (f) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fZ2 = this.f15388x;
        }
        float f7 = fA2;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fZ2);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            f7 = this.f15389y;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f7);
        fVar3.a(objectAnimatorOfFloat7);
        fVar4.a(objectAnimatorOfFloat8);
        arrayList2.add(objectAnimatorOfFloat7);
        arrayList2.add(objectAnimatorOfFloat8);
        boolean z12 = view2 instanceof p249z7.e;
        if (z12 && (view instanceof ImageView)) {
            p249z7.e eVar = (p249z7.e) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList3;
            } else {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, d.f20022a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, d.f20022a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new C0150y(7, view2));
                ((e) cVarD.f5532s).f("iconFade").a(objectAnimatorOfInt2);
                arrayList2.add(objectAnimatorOfInt2);
                C0248d0 c0248d0 = new C0248d0(3, eVar, drawable);
                arrayList = arrayList3;
                arrayList.add(c0248d0);
            }
        } else {
            arrayList = arrayList3;
        }
        if (z12) {
            p249z7.e eVar2 = (p249z7.e) view2;
            g gVar = (g) cVarD.f5533t;
            C(view, rectF2);
            rectF2.offset(this.f15388x, this.f15389y);
            C(view2, rectF);
            rectF.offset(-z(view, view2, gVar), f3);
            float fCenterX = rectF2.centerX() - rectF.left;
            g gVar2 = (g) cVarD.f5533t;
            C(view, rectF2);
            rectF2.offset(this.f15388x, this.f15389y);
            C(view2, rectF);
            rectF.offset(0.0f, -A(view, view2, gVar2));
            float fCenterY = rectF2.centerY() - rectF.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (floatingActionButton.isLaidOut()) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                floatingActionButton.j(rect);
            }
            float fWidth2 = rect.width() / 2.0f;
            f fVarF = ((e) cVarD.f5532s).f("expansion");
            if (z10) {
                if (!z11) {
                    eVar2.setRevealInfo(new p249z7.d(fCenterX, fCenterY, fWidth2));
                }
                if (z11) {
                    fWidth2 = eVar2.getRevealInfo().f24854c;
                }
                animatorSetC = r.c(eVar2, fCenterX, fCenterY, p000a.a.B(fCenterX, fCenterY, fWidth, fHeight));
                animatorSetC.addListener(new b(eVar2, 0));
                long j = fVarF.f20025a;
                int i11 = (int) fCenterX;
                int i12 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i11, i12, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList2.add(animatorCreateCircularReveal);
                }
            } else {
                float f10 = eVar2.getRevealInfo().f24854c;
                AnimatorSet animatorSetC2 = r.c(eVar2, fCenterX, fCenterY, fWidth2);
                long j10 = fVarF.f20025a;
                int i13 = (int) fCenterX;
                int i14 = (int) fCenterY;
                if (j10 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i13, i14, f10, f10);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j10);
                    arrayList2.add(animatorCreateCircularReveal2);
                }
                long j11 = fVarF.f20025a;
                long j12 = fVarF.f20026b;
                O o10 = ((e) cVarD.f5532s).f20023a;
                int i15 = o10.f22703t;
                long jMax = 0;
                int i16 = 0;
                while (i16 < i15) {
                    O o11 = o10;
                    f fVar5 = (f) o10.i(i16);
                    jMax = Math.max(jMax, fVar5.f20025a + fVar5.f20026b);
                    i16++;
                    o10 = o11;
                    j11 = j11;
                }
                long j13 = j11 + j12;
                if (j13 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i13, i14, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j13);
                    animatorCreateCircularReveal3.setDuration(jMax - j13);
                    arrayList2.add(animatorCreateCircularReveal3);
                }
                animatorSetC = animatorSetC2;
            }
            fVarF.a(animatorSetC);
            arrayList2.add(animatorSetC);
            arrayList.add(new b(eVar2, 1));
        }
        if (z12) {
            p249z7.e eVar3 = (p249z7.e) view2;
            WeakHashMap weakHashMap2 = S.f3689a;
            ColorStateList colorStateListC = I.c(view);
            int colorForState = colorStateListC != null ? colorStateListC.getColorForState(view.getDrawableState(), colorStateListC.getDefaultColor()) : 0;
            int i17 = 16777215 & colorForState;
            if (z10) {
                if (!z11) {
                    eVar3.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(eVar3, p249z7.c.f24851a, i17);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(eVar3, p249z7.c.f24851a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(p137n7.b.f20020a);
            ((e) cVarD.f5532s).f("color").a(objectAnimatorOfInt);
            arrayList2.add(objectAnimatorOfInt);
        }
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i10 = 0;
            } else {
                if (z10) {
                    if (!z11) {
                        p137n7.c.f20021a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    i10 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, p137n7.c.f20021a, 1.0f);
                } else {
                    i10 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, p137n7.c.f20021a, 0.0f);
                }
                ((e) cVarD.f5532s).f("contentFade").a(objectAnimatorOfFloat4);
                arrayList2.add(objectAnimatorOfFloat4);
            }
        } else {
            i10 = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        p050e8.b.R(animatorSet, arrayList2);
        animatorSet.addListener(new m(z10, view2, view));
        int size = arrayList.size();
        for (int i18 = i10; i18 < size; i18++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i18));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, g gVar) {
        RectF rectF = this.f15385u;
        C(view, rectF);
        rectF.offset(this.f15388x, this.f15389y);
        RectF rectF2 = this.f15386v;
        C(view2, rectF2);
        gVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15384t = new Rect();
        this.f15385u = new RectF();
        this.f15386v = new RectF();
        this.f15387w = new int[2];
    }
}
