package F7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.ayah.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w extends u {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public StateListAnimator f2520N;

    @Override // F7.u
    public final float e() {
        return this.f2515v.getElevation();
    }

    @Override // F7.u
    public final void f(Rect rect) {
        if (((FloatingActionButton) this.f2516w.f6511r).f14930B) {
            super.f(rect);
            return;
        }
        if (this.f2501f) {
            FloatingActionButton floatingActionButton = this.f2515v;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i10 = this.f2504k;
            if (sizeDimension < i10) {
                int sizeDimension2 = (i10 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // F7.u
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        R7.o oVar = this.f2496a;
        oVar.getClass();
        v vVar = new v(oVar);
        this.f2497b = vVar;
        vVar.setTintList(colorStateList);
        if (mode != null) {
            this.f2497b.setTintMode(mode);
        }
        R7.i iVar = this.f2497b;
        FloatingActionButton floatingActionButton = this.f2515v;
        iVar.k(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            R7.o oVar2 = this.f2496a;
            oVar2.getClass();
            d dVar = new d(oVar2);
            int color = context.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context.getColor(R.color.design_fab_stroke_end_outer_color);
            dVar.f2438i = color;
            dVar.j = color2;
            dVar.f2439k = color3;
            dVar.f2440l = color4;
            float f3 = i10;
            if (dVar.f2437h != f3) {
                dVar.f2437h = f3;
                dVar.f2432b.setStrokeWidth(f3 * 1.3333f);
                dVar.f2442n = true;
                dVar.invalidateSelf();
            }
            if (colorStateList != null) {
                dVar.f2441m = colorStateList.getColorForState(dVar.getState(), dVar.f2441m);
            }
            dVar.f2444p = colorStateList;
            dVar.f2442n = true;
            dVar.invalidateSelf();
            this.f2499d = dVar;
            d dVar2 = this.f2499d;
            dVar2.getClass();
            R7.i iVar2 = this.f2497b;
            iVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{dVar2, iVar2});
        } else {
            this.f2499d = null;
            layerDrawable = this.f2497b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(O7.a.c(colorStateList2), layerDrawable, null);
        this.f2498c = rippleDrawable;
        this.f2500e = rippleDrawable;
    }

    @Override // F7.u
    public final void i() {
        r();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // F7.u
    public final void k(float f3, float f7, float f10) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f2515v;
        if (floatingActionButton.getStateListAnimator() == this.f2520N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(u.f2488H, s(f3, f10));
            stateListAnimator.addState(u.f2489I, s(f3, f7));
            stateListAnimator.addState(u.f2490J, s(f3, f7));
            stateListAnimator.addState(u.f2491K, s(f3, f7));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f3).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(u.f2483C);
            stateListAnimator.addState(u.f2492L, animatorSet);
            stateListAnimator.addState(u.f2493M, s(0.0f, 0.0f));
            this.f2520N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (p()) {
            r();
        }
    }

    @Override // F7.u
    public final void n(ColorStateList colorStateList) {
        Drawable drawable = this.f2498c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(O7.a.c(colorStateList));
        } else {
            super.n(colorStateList);
        }
    }

    @Override // F7.u
    public final boolean p() {
        if (((FloatingActionButton) this.f2516w.f6511r).f14930B) {
            return true;
        }
        return this.f2501f && this.f2515v.getSizeDimension() < this.f2504k;
    }

    public final AnimatorSet s(float f3, float f7) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f3};
        FloatingActionButton floatingActionButton = this.f2515v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f7).setDuration(100L));
        animatorSet.setInterpolator(u.f2483C);
        return animatorSet;
    }

    @Override // F7.u
    public final void h() {
    }

    @Override // F7.u
    public final void q() {
    }

    @Override // F7.u
    public final void j(int[] iArr) {
    }
}
