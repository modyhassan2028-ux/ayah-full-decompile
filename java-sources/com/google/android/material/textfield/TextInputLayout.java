package com.google.android.material.textfield;

import E2.C0150y;
import E2.RunnableC0147v;
import H7.AbstractC0231e;
import H7.C0230d;
import H7.H;
import I1.L;
import I1.S;
import K0.RunnableC0354l;
import R7.C0479a;
import R7.InterfaceC0482d;
import R7.f;
import R7.i;
import R7.o;
import W2.C0626g;
import W2.n;
import W2.t;
import X7.g;
import X7.h;
import X7.j;
import X7.l;
import X7.m;
import X7.p;
import X7.q;
import X7.u;
import X7.v;
import X7.w;
import X7.x;
import X7.y;
import Y2.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p050e8.b;
import p151p.AbstractC1249j0;
import p151p.C1273w;
import p181s2.s;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final int[][] f15274T0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final q f15275A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ColorStateList f15276A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15277B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f15278B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15279C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f15280C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f15281D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f15282D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public x f15283E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ColorStateList f15284E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AppCompatTextView f15285F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f15286F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15287G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f15288G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15289H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f15290H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f15291I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f15292I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f15293J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f15294J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public AppCompatTextView f15295K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f15296K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ColorStateList f15297L;
    public boolean L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15298M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final C0230d f15299M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0626g f15300N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f15301N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0626g f15302O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f15303O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ColorStateList f15304P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ValueAnimator f15305P0;
    public ColorStateList Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f15306Q0;
    public ColorStateList R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f15307R0;
    public ColorStateList S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f15308S0;
    public boolean T;
    public CharSequence U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f15309V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public i f15310W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public i f15311a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public StateListDrawable f15312b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f15313c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i f15314d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public i f15315e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public o f15316f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f15317g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f15318h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f15319i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f15320j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f15321k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f15322l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f15323m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f15324n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f15325o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Rect f15326p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Rect f15327q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FrameLayout f15328r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RectF f15329r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f15330s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Typeface f15331s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f15332t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorDrawable f15333t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EditText f15334u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f15335u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f15336v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final LinkedHashSet f15337v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15338w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ColorDrawable f15339w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15340x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f15341x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15342y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Drawable f15343y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15344z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ColorStateList f15345z0;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f15334u;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f15310W;
        }
        int iB = a.B(com.ayah.R.attr.colorControlHighlight, this.f15334u);
        int i10 = this.f15319i0;
        int[][] iArr = f15274T0;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            i iVar = this.f15310W;
            int i11 = this.f15325o0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{a.V(iB, 0.1f, i11), i11}), iVar, iVar);
        }
        Context context = getContext();
        i iVar2 = this.f15310W;
        TypedValue typedValueA = u0.A(com.ayah.R.attr.colorSurface, context, "TextInputLayout");
        int i12 = typedValueA.resourceId;
        int color = i12 != 0 ? context.getColor(i12) : typedValueA.data;
        i iVar3 = new i(iVar2.f7325r.f7294a);
        int iV = a.V(iB, 0.1f, color);
        iVar3.m(new ColorStateList(iArr, new int[]{iV, 0}));
        iVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iV, color});
        i iVar4 = new i(iVar2.f7325r.f7294a);
        iVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar3, iVar4), iVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f15312b0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f15312b0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f15312b0.addState(new int[0], f(false));
        }
        return this.f15312b0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f15311a0 == null) {
            this.f15311a0 = f(true);
        }
        return this.f15311a0;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f15334u != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f15334u = editText;
        int i10 = this.f15338w;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f15342y);
        }
        int i11 = this.f15340x;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f15344z);
        }
        this.f15313c0 = false;
        i();
        setTextInputAccessibilityDelegate(new w(this));
        Typeface typeface = this.f15334u.getTypeface();
        C0230d c0230d = this.f15299M0;
        boolean zM = c0230d.m(typeface);
        boolean zO = c0230d.o(typeface);
        if (zM || zO) {
            c0230d.i(false);
        }
        float textSize = this.f15334u.getTextSize();
        if (c0230d.f3512l != textSize) {
            c0230d.f3512l = textSize;
            c0230d.i(false);
        }
        int i12 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f15334u.getLetterSpacing();
        if (c0230d.f3504g0 != letterSpacing) {
            c0230d.f3504g0 = letterSpacing;
            c0230d.i(false);
        }
        int gravity = this.f15334u.getGravity();
        c0230d.l((gravity & (-113)) | 48);
        if (c0230d.j != gravity) {
            c0230d.j = gravity;
            c0230d.i(false);
        }
        WeakHashMap weakHashMap = S.f3689a;
        this.f15296K0 = editText.getMinimumHeight();
        this.f15334u.addTextChangedListener(new v(this, editText));
        if (this.f15345z0 == null) {
            this.f15345z0 = this.f15334u.getHintTextColors();
        }
        if (this.T) {
            if (TextUtils.isEmpty(this.U)) {
                CharSequence hint = this.f15334u.getHint();
                this.f15336v = hint;
                setHint(hint);
                this.f15334u.setHint((CharSequence) null);
            }
            this.f15309V = true;
        }
        if (i12 >= 29) {
            p();
        }
        if (this.f15285F != null) {
            n(this.f15334u.getText());
        }
        r();
        this.f15275A.b();
        this.f15330s.bringToFront();
        m mVar = this.f15332t;
        mVar.bringToFront();
        Iterator it = this.f15337v0.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(this);
        }
        mVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.U)) {
            return;
        }
        this.U = charSequence;
        C0230d c0230d = this.f15299M0;
        if (charSequence == null || !TextUtils.equals(c0230d.f3477G, charSequence)) {
            c0230d.f3477G = charSequence;
            c0230d.f3478H = null;
            Bitmap bitmap = c0230d.f3481K;
            if (bitmap != null) {
                bitmap.recycle();
                c0230d.f3481K = null;
            }
            c0230d.i(false);
        }
        if (this.L0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f15293J == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.f15295K;
            if (appCompatTextView != null) {
                this.f15328r.addView(appCompatTextView);
                this.f15295K.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f15295K;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f15295K = null;
        }
        this.f15293J = z10;
    }

    public final void a(float f3) {
        C0230d c0230d = this.f15299M0;
        if (c0230d.f3494b == f3) {
            return;
        }
        if (this.f15305P0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15305P0 = valueAnimator;
            valueAnimator.setInterpolator(b.T(getContext(), com.ayah.R.attr.motionEasingEmphasizedInterpolator, p137n7.a.f20016b));
            this.f15305P0.setDuration(b.S(getContext(), com.ayah.R.attr.motionDurationMedium4, 167));
            this.f15305P0.addUpdateListener(new C0150y(6, this));
        }
        this.f15305P0.setFloatValues(c0230d.f3494b, f3);
        this.f15305P0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f15328r;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i10;
        int i11;
        i iVar = this.f15310W;
        if (iVar == null) {
            return;
        }
        o oVar = iVar.f7325r.f7294a;
        o oVar2 = this.f15316f0;
        if (oVar != oVar2) {
            iVar.setShapeAppearanceModel(oVar2);
        }
        if (this.f15319i0 == 2 && (i10 = this.f15321k0) > -1 && (i11 = this.f15324n0) != 0) {
            i iVar2 = this.f15310W;
            iVar2.s(i10);
            iVar2.r(ColorStateList.valueOf(i11));
        }
        int iC = this.f15325o0;
        if (this.f15319i0 == 1) {
            iC = A1.a.c(this.f15325o0, a.C(getContext(), com.ayah.R.attr.colorSurface, 0));
        }
        this.f15325o0 = iC;
        this.f15310W.m(ColorStateList.valueOf(iC));
        i iVar3 = this.f15314d0;
        if (iVar3 != null && this.f15315e0 != null) {
            if (this.f15321k0 > -1 && this.f15324n0 != 0) {
                iVar3.m(this.f15334u.isFocused() ? ColorStateList.valueOf(this.f15278B0) : ColorStateList.valueOf(this.f15324n0));
                this.f15315e0.m(ColorStateList.valueOf(this.f15324n0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fE;
        if (!this.T) {
            return 0;
        }
        int i10 = this.f15319i0;
        C0230d c0230d = this.f15299M0;
        if (i10 == 0) {
            fE = c0230d.e();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fE = c0230d.e() / 2.0f;
        }
        return (int) fE;
    }

    public final C0626g d() {
        C0626g c0626g = new C0626g();
        c0626g.f9572t = b.S(getContext(), com.ayah.R.attr.motionDurationShort2, 87);
        c0626g.f9573u = b.T(getContext(), com.ayah.R.attr.motionEasingLinearInterpolator, p137n7.a.f20015a);
        return c0626g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f15334u;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f15336v != null) {
            boolean z10 = this.f15309V;
            this.f15309V = false;
            CharSequence hint = editText.getHint();
            this.f15334u.setHint(this.f15336v);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f15334u.setHint(hint);
                this.f15309V = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f15328r;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f15334u) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f15307R0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f15307R0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar;
        super.draw(canvas);
        boolean z10 = this.T;
        C0230d c0230d = this.f15299M0;
        if (z10) {
            c0230d.d(canvas);
        }
        if (this.f15315e0 == null || (iVar = this.f15314d0) == null) {
            return;
        }
        iVar.draw(canvas);
        if (this.f15334u.isFocused()) {
            Rect bounds = this.f15315e0.getBounds();
            Rect bounds2 = this.f15314d0.getBounds();
            float f3 = c0230d.f3494b;
            int iCenterX = bounds2.centerX();
            bounds.left = p137n7.a.c(iCenterX, f3, bounds2.left);
            bounds.right = p137n7.a.c(iCenterX, f3, bounds2.right);
            this.f15315e0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        if (this.f15306Q0) {
            return;
        }
        this.f15306Q0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0230d c0230d = this.f15299M0;
        if (c0230d != null) {
            c0230d.R = drawableState;
            ColorStateList colorStateList2 = c0230d.f3518o;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0230d.f3516n) == null || !colorStateList.isStateful())) {
                z10 = false;
            } else {
                c0230d.i(false);
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (this.f15334u != null) {
            WeakHashMap weakHashMap = S.f3689a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z10) {
            invalidate();
        }
        this.f15306Q0 = false;
    }

    public final boolean e() {
        return this.T && !TextUtils.isEmpty(this.U) && (this.f15310W instanceof h);
    }

    public final i f(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.ayah.R.dimen.mtrl_shape_corner_size_small_component);
        float f3 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f15334u;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.ayah.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.ayah.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        R7.l lVar = new R7.l();
        R7.l lVar2 = new R7.l();
        R7.l lVar3 = new R7.l();
        R7.l lVar4 = new R7.l();
        int i10 = 0;
        f fVar = new f(i10);
        f fVar2 = new f(i10);
        f fVar3 = new f(i10);
        f fVar4 = new f(i10);
        C0479a c0479a = new C0479a(f3);
        C0479a c0479a2 = new C0479a(f3);
        C0479a c0479a3 = new C0479a(dimensionPixelOffset);
        C0479a c0479a4 = new C0479a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f7348a = lVar;
        oVar.f7349b = lVar2;
        oVar.f7350c = lVar3;
        oVar.f7351d = lVar4;
        oVar.f7352e = c0479a;
        oVar.f7353f = c0479a2;
        oVar.g = c0479a4;
        oVar.f7354h = c0479a3;
        oVar.f7355i = fVar;
        oVar.j = fVar2;
        oVar.f7356k = fVar3;
        oVar.f7357l = fVar4;
        EditText editText2 = this.f15334u;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = i.f7310O;
            TypedValue typedValueA = u0.A(com.ayah.R.attr.colorSurface, context, i.class.getSimpleName());
            int i11 = typedValueA.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i11 != 0 ? context.getColor(i11) : typedValueA.data);
        }
        i iVar = new i();
        iVar.k(context);
        iVar.m(dropDownBackgroundTintList);
        iVar.l(popupElevation);
        iVar.setShapeAppearanceModel(oVar);
        R7.h hVar = iVar.f7325r;
        if (hVar.g == null) {
            hVar.g = new Rect();
        }
        iVar.f7325r.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f15334u.getCompoundPaddingLeft() : this.f15332t.c();
        } else {
            compoundPaddingLeft = this.f15330s.a();
        }
        return compoundPaddingLeft + i10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f15334u;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public i getBoxBackground() {
        int i10 = this.f15319i0;
        if (i10 == 1 || i10 == 2) {
            return this.f15310W;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f15325o0;
    }

    public int getBoxBackgroundMode() {
        return this.f15319i0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f15320j0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zL = H.l(this);
        RectF rectF = this.f15329r0;
        return zL ? this.f15316f0.f7354h.a(rectF) : this.f15316f0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zL = H.l(this);
        RectF rectF = this.f15329r0;
        return zL ? this.f15316f0.g.a(rectF) : this.f15316f0.f7354h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zL = H.l(this);
        RectF rectF = this.f15329r0;
        return zL ? this.f15316f0.f7352e.a(rectF) : this.f15316f0.f7353f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zL = H.l(this);
        RectF rectF = this.f15329r0;
        return zL ? this.f15316f0.f7353f.a(rectF) : this.f15316f0.f7352e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f15282D0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f15284E0;
    }

    public int getBoxStrokeWidth() {
        return this.f15322l0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f15323m0;
    }

    public int getCounterMaxLength() {
        return this.f15279C;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f15277B && this.f15281D && (appCompatTextView = this.f15285F) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.Q;
    }

    public ColorStateList getCounterTextColor() {
        return this.f15304P;
    }

    public ColorStateList getCursorColor() {
        return this.R;
    }

    public ColorStateList getCursorErrorColor() {
        return this.S;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f15345z0;
    }

    public EditText getEditText() {
        return this.f15334u;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f15332t.f10043x.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f15332t.f10043x.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f15332t.f10027D;
    }

    public int getEndIconMode() {
        return this.f15332t.f10045z;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f15332t.f10028E;
    }

    public CheckableImageButton getEndIconView() {
        return this.f15332t.f10043x;
    }

    public CharSequence getError() {
        q qVar = this.f15275A;
        if (qVar.f10072q) {
            return qVar.f10071p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f15275A.f10075t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f15275A.f10074s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f15275A.f10073r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f15332t.f10039t.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f15275A;
        if (qVar.f10079x) {
            return qVar.f10078w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f15275A.f10080y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.T) {
            return this.U;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f15299M0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0230d c0230d = this.f15299M0;
        return c0230d.f(c0230d.f3518o);
    }

    public ColorStateList getHintTextColor() {
        return this.f15276A0;
    }

    public x getLengthCounter() {
        return this.f15283E;
    }

    public int getMaxEms() {
        return this.f15340x;
    }

    public int getMaxWidth() {
        return this.f15344z;
    }

    public int getMinEms() {
        return this.f15338w;
    }

    public int getMinWidth() {
        return this.f15342y;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f15332t.f10043x.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f15332t.f10043x.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f15293J) {
            return this.f15291I;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f15298M;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f15297L;
    }

    public CharSequence getPrefixText() {
        return this.f15330s.f10092t;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f15330s.f10091s.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f15330s.f10091s;
    }

    public o getShapeAppearanceModel() {
        return this.f15316f0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f15330s.f10093u.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f15330s.f10093u.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f15330s.f10096x;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f15330s.f10097y;
    }

    public CharSequence getSuffixText() {
        return this.f15332t.f10030G;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f15332t.f10031H.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f15332t.f10031H;
    }

    public Typeface getTypeface() {
        return this.f15331s0;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f15334u.getCompoundPaddingRight() : this.f15330s.a();
        } else {
            compoundPaddingRight = this.f15332t.c();
        }
        return i10 - compoundPaddingRight;
    }

    public final void i() {
        int i10 = this.f15319i0;
        if (i10 == 0) {
            this.f15310W = null;
            this.f15314d0 = null;
            this.f15315e0 = null;
        } else if (i10 == 1) {
            this.f15310W = new i(this.f15316f0);
            this.f15314d0 = new i();
            this.f15315e0 = new i();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(p245z2.a.E(new StringBuilder(), this.f15319i0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.T || (this.f15310W instanceof h)) {
                this.f15310W = new i(this.f15316f0);
            } else {
                o oVar = this.f15316f0;
                int i11 = h.Q;
                if (oVar == null) {
                    oVar = new o();
                }
                X7.f fVar = new X7.f(oVar, new RectF());
                g gVar = new g(fVar);
                gVar.f10008P = fVar;
                this.f15310W = gVar;
            }
            this.f15314d0 = null;
            this.f15315e0 = null;
        }
        s();
        x();
        if (this.f15319i0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f15320j0 = getResources().getDimensionPixelSize(com.ayah.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (va.g.C(getContext())) {
                this.f15320j0 = getResources().getDimensionPixelSize(com.ayah.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f15334u != null && this.f15319i0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f15334u;
                WeakHashMap weakHashMap = S.f3689a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.ayah.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f15334u.getPaddingEnd(), getResources().getDimensionPixelSize(com.ayah.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (va.g.C(getContext())) {
                EditText editText2 = this.f15334u;
                WeakHashMap weakHashMap2 = S.f3689a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.ayah.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f15334u.getPaddingEnd(), getResources().getDimensionPixelSize(com.ayah.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f15319i0 != 0) {
            t();
        }
        EditText editText3 = this.f15334u;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f15319i0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f3;
        float f7;
        float f10;
        RectF rectF;
        float f11;
        int i10;
        float f12;
        int i11;
        if (e()) {
            int width = this.f15334u.getWidth();
            int gravity = this.f15334u.getGravity();
            C0230d c0230d = this.f15299M0;
            boolean zB = c0230d.b(c0230d.f3477G);
            c0230d.f3479I = zB;
            Rect rect = c0230d.f3505h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i11 = rect.left;
                        f10 = i11;
                    } else {
                        f3 = rect.right;
                        f7 = c0230d.f3509j0;
                    }
                } else if (zB) {
                    f3 = rect.right;
                    f7 = c0230d.f3509j0;
                } else {
                    i11 = rect.left;
                    f10 = i11;
                }
                float fMax = Math.max(f10, rect.left);
                rectF = this.f15329r0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f11 = (width / 2.0f) + (c0230d.f3509j0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0230d.f3479I) {
                        f12 = c0230d.f3509j0;
                        f11 = f12 + fMax;
                    } else {
                        i10 = rect.right;
                        f11 = i10;
                    }
                } else if (c0230d.f3479I) {
                    i10 = rect.right;
                    f11 = i10;
                } else {
                    f12 = c0230d.f3509j0;
                    f11 = f12 + fMax;
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = c0230d.e() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.f15318h0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f15321k0);
                h hVar = (h) this.f15310W;
                hVar.getClass();
                hVar.w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f3 = width / 2.0f;
            f7 = c0230d.f3509j0 / 2.0f;
            f10 = f3 - f7;
            float fMax2 = Math.max(f10, rect.left);
            rectF = this.f15329r0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f11 = (width / 2.0f) + (c0230d.f3509j0 / 2.0f);
            } else {
                f11 = (width / 2.0f) + (c0230d.f3509j0 / 2.0f);
            }
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = c0230d.e() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(AppCompatTextView appCompatTextView, int i10) {
        try {
            appCompatTextView.setTextAppearance(i10);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.ayah.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.ayah.R.color.design_error));
    }

    public final boolean m() {
        q qVar = this.f15275A;
        return (qVar.f10070o != 1 || qVar.f10073r == null || TextUtils.isEmpty(qVar.f10071p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((n) this.f15283E).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z10 = this.f15281D;
        int i10 = this.f15279C;
        if (i10 == -1) {
            this.f15285F.setText(String.valueOf(length));
            this.f15285F.setContentDescription(null);
            this.f15281D = false;
        } else {
            this.f15281D = length > i10;
            Context context = getContext();
            this.f15285F.setContentDescription(context.getString(this.f15281D ? com.ayah.R.string.character_counter_overflowed_content_description : com.ayah.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f15279C)));
            if (z10 != this.f15281D) {
                o();
            }
            String str = G1.b.f2770b;
            G1.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? G1.b.f2773e : G1.b.f2772d;
            AppCompatTextView appCompatTextView = this.f15285F;
            String string = getContext().getString(com.ayah.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f15279C));
            bVar.getClass();
            G1.f fVar = G1.g.f2782a;
            appCompatTextView.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f15334u == null || z10 == this.f15281D) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f15285F;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.f15281D ? this.f15287G : this.f15289H);
            if (!this.f15281D && (colorStateList2 = this.f15304P) != null) {
                this.f15285F.setTextColor(colorStateList2);
            }
            if (!this.f15281D || (colorStateList = this.Q) == null) {
                return;
            }
            this.f15285F.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15299M0.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        m mVar = this.f15332t;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.f15308S0 = false;
        if (this.f15334u != null && this.f15334u.getMeasuredHeight() < (iMax = Math.max(mVar.getMeasuredHeight(), this.f15330s.getMeasuredHeight()))) {
            this.f15334u.setMinimumHeight(iMax);
            z10 = true;
        }
        boolean zQ = q();
        if (z10 || zQ) {
            this.f15334u.post(new RunnableC0354l(9, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f15334u;
        if (editText != null) {
            Rect rect = this.f15326p0;
            AbstractC0231e.a(this, editText, rect);
            i iVar = this.f15314d0;
            if (iVar != null) {
                int i14 = rect.bottom;
                iVar.setBounds(rect.left, i14 - this.f15322l0, rect.right, i14);
            }
            i iVar2 = this.f15315e0;
            if (iVar2 != null) {
                int i15 = rect.bottom;
                iVar2.setBounds(rect.left, i15 - this.f15323m0, rect.right, i15);
            }
            if (this.T) {
                float textSize = this.f15334u.getTextSize();
                C0230d c0230d = this.f15299M0;
                if (c0230d.f3512l != textSize) {
                    c0230d.f3512l = textSize;
                    c0230d.i(false);
                }
                int gravity = this.f15334u.getGravity();
                c0230d.l((gravity & (-113)) | 48);
                if (c0230d.j != gravity) {
                    c0230d.j = gravity;
                    c0230d.i(false);
                }
                if (this.f15334u == null) {
                    throw new IllegalStateException();
                }
                boolean zL = H.l(this);
                int i16 = rect.bottom;
                Rect rect2 = this.f15327q0;
                rect2.bottom = i16;
                int i17 = this.f15319i0;
                if (i17 == 1) {
                    rect2.left = g(rect.left, zL);
                    rect2.top = rect.top + this.f15320j0;
                    rect2.right = h(rect.right, zL);
                } else if (i17 != 2) {
                    rect2.left = g(rect.left, zL);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zL);
                } else {
                    rect2.left = this.f15334u.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f15334u.getPaddingRight();
                }
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                int i21 = rect2.bottom;
                Rect rect3 = c0230d.f3505h;
                if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                    rect3.set(i18, i19, i20, i21);
                    c0230d.S = true;
                }
                if (this.f15334u == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0230d.U;
                textPaint.setTextSize(c0230d.f3512l);
                textPaint.setTypeface(c0230d.f3532z);
                textPaint.setLetterSpacing(c0230d.f3504g0);
                float f3 = -textPaint.ascent();
                rect2.left = this.f15334u.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f15319i0 != 1 || this.f15334u.getMinLines() > 1) ? rect.top + this.f15334u.getCompoundPaddingTop() : (int) (rect.centerY() - (f3 / 2.0f));
                rect2.right = rect.right - this.f15334u.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f15319i0 != 1 || this.f15334u.getMinLines() > 1) ? rect.bottom - this.f15334u.getCompoundPaddingBottom() : (int) (rect2.top + f3);
                rect2.bottom = compoundPaddingBottom;
                int i22 = rect2.left;
                int i23 = rect2.top;
                int i24 = rect2.right;
                Rect rect4 = c0230d.g;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    c0230d.S = true;
                }
                c0230d.i(false);
                if (!e() || this.L0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.f15308S0;
        m mVar = this.f15332t;
        if (!z10) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f15308S0 = true;
        }
        if (this.f15295K != null && (editText = this.f15334u) != null) {
            this.f15295K.setGravity(editText.getGravity());
            this.f15295K.setPadding(this.f15334u.getCompoundPaddingLeft(), this.f15334u.getCompoundPaddingTop(), this.f15334u.getCompoundPaddingRight(), this.f15334u.getCompoundPaddingBottom());
        }
        mVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.f6852r);
        setError(yVar.f10103t);
        if (yVar.f10104u) {
            post(new RunnableC0147v(10, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f15317g0) {
            InterfaceC0482d interfaceC0482d = this.f15316f0.f7352e;
            RectF rectF = this.f15329r0;
            float fA = interfaceC0482d.a(rectF);
            float fA2 = this.f15316f0.f7353f.a(rectF);
            float fA3 = this.f15316f0.f7354h.a(rectF);
            float fA4 = this.f15316f0.g.a(rectF);
            o oVar = this.f15316f0;
            b bVar = oVar.f7348a;
            b bVar2 = oVar.f7349b;
            b bVar3 = oVar.f7351d;
            b bVar4 = oVar.f7350c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            C0479a c0479a = new C0479a(fA2);
            C0479a c0479a2 = new C0479a(fA);
            C0479a c0479a3 = new C0479a(fA4);
            C0479a c0479a4 = new C0479a(fA3);
            o oVar2 = new o();
            oVar2.f7348a = bVar2;
            oVar2.f7349b = bVar;
            oVar2.f7350c = bVar3;
            oVar2.f7351d = bVar4;
            oVar2.f7352e = c0479a;
            oVar2.f7353f = c0479a2;
            oVar2.g = c0479a4;
            oVar2.f7354h = c0479a3;
            oVar2.f7355i = fVar;
            oVar2.j = fVar2;
            oVar2.f7356k = fVar3;
            oVar2.f7357l = fVar4;
            this.f15317g0 = z10;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        if (m()) {
            yVar.f10103t = getError();
        }
        m mVar = this.f15332t;
        yVar.f10104u = mVar.f10045z != 0 && mVar.f10043x.f14966u;
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.R;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueY = u0.y(context, com.ayah.R.attr.colorControlActivated);
            if (typedValueY != null) {
                int i10 = typedValueY.resourceId;
                if (i10 != 0) {
                    colorStateListValueOf = s.e(context, i10);
                } else {
                    int i11 = typedValueY.data;
                    if (i11 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i11);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f15334u;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f15334u.getTextCursorDrawable().mutate();
        if ((m() || (this.f15285F != null && this.f15281D)) && (colorStateList = this.S) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z10;
        if (this.f15334u == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z11 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            u uVar = this.f15330s;
            if (uVar.getMeasuredWidth() > 0) {
                int measuredWidth = uVar.getMeasuredWidth() - this.f15334u.getPaddingLeft();
                if (this.f15333t0 == null || this.f15335u0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f15333t0 = colorDrawable;
                    this.f15335u0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f15334u.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f15333t0;
                if (drawable != colorDrawable2) {
                    this.f15334u.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (this.f15333t0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f15334u.getCompoundDrawablesRelative();
                this.f15334u.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f15333t0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f15333t0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f15334u.getCompoundDrawablesRelative();
            this.f15334u.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f15333t0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = this.f15332t;
        if ((mVar.e() || ((mVar.f10045z != 0 && mVar.d()) || mVar.f10030G != null)) && mVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = mVar.f10031H.getMeasuredWidth() - this.f15334u.getPaddingRight();
            if (mVar.e()) {
                checkableImageButton = mVar.f10039t;
            } else if (mVar.f10045z != 0 && mVar.d()) {
                checkableImageButton = mVar.f10043x;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f15334u.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f15339w0;
            if (colorDrawable3 != null && this.f15341x0 != measuredWidth2) {
                this.f15341x0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f15334u.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f15339w0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f15339w0 = colorDrawable4;
                this.f15341x0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f15339w0;
            if (drawable2 != colorDrawable5) {
                this.f15343y0 = drawable2;
                this.f15334u.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f15339w0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f15334u.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f15339w0) {
                this.f15334u.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f15343y0, compoundDrawablesRelative5[3]);
            } else {
                z11 = z10;
            }
            this.f15339w0 = null;
            return z11;
        }
        return z10;
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f15334u;
        if (editText == null || this.f15319i0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1249j0.f20688a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(C1273w.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f15281D && (appCompatTextView = this.f15285F) != null) {
            drawableMutate.setColorFilter(C1273w.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f15334u.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f15334u;
        if (editText == null || this.f15310W == null) {
            return;
        }
        if ((this.f15313c0 || editText.getBackground() == null) && this.f15319i0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f15334u;
            WeakHashMap weakHashMap = S.f3689a;
            editText2.setBackground(editTextBoxBackground);
            this.f15313c0 = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f15325o0 != i10) {
            this.f15325o0 = i10;
            this.f15286F0 = i10;
            this.f15290H0 = i10;
            this.f15292I0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(getContext().getColor(i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f15286F0 = defaultColor;
        this.f15325o0 = defaultColor;
        this.f15288G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f15290H0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f15292I0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f15319i0) {
            return;
        }
        this.f15319i0 = i10;
        if (this.f15334u != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f15320j0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        R7.m mVarG = this.f15316f0.g();
        InterfaceC0482d interfaceC0482d = this.f15316f0.f7352e;
        mVarG.f7337a = u0.l(i10);
        mVarG.f7341e = interfaceC0482d;
        InterfaceC0482d interfaceC0482d2 = this.f15316f0.f7353f;
        mVarG.f7338b = u0.l(i10);
        mVarG.f7342f = interfaceC0482d2;
        InterfaceC0482d interfaceC0482d3 = this.f15316f0.f7354h;
        mVarG.f7340d = u0.l(i10);
        mVarG.f7343h = interfaceC0482d3;
        InterfaceC0482d interfaceC0482d4 = this.f15316f0.g;
        mVarG.f7339c = u0.l(i10);
        mVarG.g = interfaceC0482d4;
        this.f15316f0 = mVarG.a();
        b();
    }

    public void setBoxCornerRadii(float f3, float f7, float f10, float f11) {
        boolean zL = H.l(this);
        this.f15317g0 = zL;
        float f12 = zL ? f7 : f3;
        if (!zL) {
            f3 = f7;
        }
        float f13 = zL ? f11 : f10;
        if (!zL) {
            f10 = f11;
        }
        i iVar = this.f15310W;
        if (iVar != null && iVar.i() == f12) {
            i iVar2 = this.f15310W;
            if (iVar2.f7325r.f7294a.f7353f.a(iVar2.g()) == f3) {
                i iVar3 = this.f15310W;
                if (iVar3.f7325r.f7294a.f7354h.a(iVar3.g()) == f13) {
                    i iVar4 = this.f15310W;
                    if (iVar4.f7325r.f7294a.g.a(iVar4.g()) == f10) {
                        return;
                    }
                }
            }
        }
        R7.m mVarG = this.f15316f0.g();
        mVarG.f7341e = new C0479a(f12);
        mVarG.f7342f = new C0479a(f3);
        mVarG.f7343h = new C0479a(f13);
        mVarG.g = new C0479a(f10);
        this.f15316f0 = mVarG.a();
        b();
    }

    public void setBoxCornerRadiiResources(int i10, int i11, int i12, int i13) {
        setBoxCornerRadii(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f15282D0 != i10) {
            this.f15282D0 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f15278B0 = colorStateList.getDefaultColor();
            this.f15294J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f15280C0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f15282D0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f15282D0 != colorStateList.getDefaultColor()) {
            this.f15282D0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f15284E0 != colorStateList) {
            this.f15284E0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f15322l0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f15323m0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f15277B != z10) {
            q qVar = this.f15275A;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f15285F = appCompatTextView;
                appCompatTextView.setId(com.ayah.R.id.textinput_counter);
                Typeface typeface = this.f15331s0;
                if (typeface != null) {
                    this.f15285F.setTypeface(typeface);
                }
                this.f15285F.setMaxLines(1);
                qVar.a(this.f15285F, 2);
                ((ViewGroup.MarginLayoutParams) this.f15285F.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.ayah.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f15285F != null) {
                    EditText editText = this.f15334u;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                qVar.g(this.f15285F, 2);
                this.f15285F = null;
            }
            this.f15277B = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f15279C != i10) {
            if (i10 > 0) {
                this.f15279C = i10;
            } else {
                this.f15279C = -1;
            }
            if (!this.f15277B || this.f15285F == null) {
                return;
            }
            EditText editText = this.f15334u;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f15287G != i10) {
            this.f15287G = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f15289H != i10) {
            this.f15289H = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f15304P != colorStateList) {
            this.f15304P = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (m() || (this.f15285F != null && this.f15281D)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f15345z0 = colorStateList;
        this.f15276A0 = colorStateList;
        if (this.f15334u != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f15332t.f10043x.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f15332t.f10043x.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        m mVar = this.f15332t;
        CharSequence text = i10 != 0 ? mVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = mVar.f10043x;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        m mVar = this.f15332t;
        Drawable drawableE = i10 != 0 ? a.E(mVar.getContext(), i10) : null;
        TextInputLayout textInputLayout = mVar.f10037r;
        CheckableImageButton checkableImageButton = mVar.f10043x;
        checkableImageButton.setImageDrawable(drawableE);
        if (drawableE != null) {
            a.k(textInputLayout, checkableImageButton, mVar.f10025B, mVar.f10026C);
            a.g0(textInputLayout, checkableImageButton, mVar.f10025B);
        }
    }

    public void setEndIconMinSize(int i10) {
        m mVar = this.f15332t;
        if (i10 < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != mVar.f10027D) {
            mVar.f10027D = i10;
            CheckableImageButton checkableImageButton = mVar.f10043x;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = mVar.f10039t;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f15332t.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f15332t;
        CheckableImageButton checkableImageButton = mVar.f10043x;
        View.OnLongClickListener onLongClickListener = mVar.f10029F;
        checkableImageButton.setOnClickListener(onClickListener);
        a.i0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f15332t;
        mVar.f10029F = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f10043x;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a.i0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.f15332t;
        mVar.f10028E = scaleType;
        mVar.f10043x.setScaleType(scaleType);
        mVar.f10039t.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.f15332t;
        if (mVar.f10025B != colorStateList) {
            mVar.f10025B = colorStateList;
            a.k(mVar.f10037r, mVar.f10043x, colorStateList, mVar.f10026C);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f15332t;
        if (mVar.f10026C != mode) {
            mVar.f10026C = mode;
            a.k(mVar.f10037r, mVar.f10043x, mVar.f10025B, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f15332t.h(z10);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.f15275A;
        if (!qVar.f10072q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.f();
            return;
        }
        qVar.c();
        qVar.f10071p = charSequence;
        qVar.f10073r.setText(charSequence);
        int i10 = qVar.f10069n;
        if (i10 != 1) {
            qVar.f10070o = 1;
        }
        qVar.i(i10, qVar.f10070o, qVar.h(qVar.f10073r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        q qVar = this.f15275A;
        qVar.f10075t = i10;
        AppCompatTextView appCompatTextView = qVar.f10073r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = S.f3689a;
            appCompatTextView.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f15275A;
        qVar.f10074s = charSequence;
        AppCompatTextView appCompatTextView = qVar.f10073r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.f15275A;
        TextInputLayout textInputLayout = qVar.f10064h;
        if (qVar.f10072q == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.g);
            qVar.f10073r = appCompatTextView;
            appCompatTextView.setId(com.ayah.R.id.textinput_error);
            qVar.f10073r.setTextAlignment(5);
            Typeface typeface = qVar.f10057B;
            if (typeface != null) {
                qVar.f10073r.setTypeface(typeface);
            }
            int i10 = qVar.f10076u;
            qVar.f10076u = i10;
            AppCompatTextView appCompatTextView2 = qVar.f10073r;
            if (appCompatTextView2 != null) {
                qVar.f10064h.l(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = qVar.f10077v;
            qVar.f10077v = colorStateList;
            AppCompatTextView appCompatTextView3 = qVar.f10073r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f10074s;
            qVar.f10074s = charSequence;
            AppCompatTextView appCompatTextView4 = qVar.f10073r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i11 = qVar.f10075t;
            qVar.f10075t = i11;
            AppCompatTextView appCompatTextView5 = qVar.f10073r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = S.f3689a;
                appCompatTextView5.setAccessibilityLiveRegion(i11);
            }
            qVar.f10073r.setVisibility(4);
            qVar.a(qVar.f10073r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f10073r, 0);
            qVar.f10073r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        qVar.f10072q = z10;
    }

    public void setErrorIconDrawable(int i10) {
        m mVar = this.f15332t;
        mVar.i(i10 != 0 ? a.E(mVar.getContext(), i10) : null);
        a.g0(mVar.f10037r, mVar.f10039t, mVar.f10040u);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f15332t;
        CheckableImageButton checkableImageButton = mVar.f10039t;
        View.OnLongClickListener onLongClickListener = mVar.f10042w;
        checkableImageButton.setOnClickListener(onClickListener);
        a.i0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f15332t;
        mVar.f10042w = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f10039t;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a.i0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.f15332t;
        if (mVar.f10040u != colorStateList) {
            mVar.f10040u = colorStateList;
            a.k(mVar.f10037r, mVar.f10039t, colorStateList, mVar.f10041v);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f15332t;
        if (mVar.f10041v != mode) {
            mVar.f10041v = mode;
            a.k(mVar.f10037r, mVar.f10039t, mVar.f10040u, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        q qVar = this.f15275A;
        qVar.f10076u = i10;
        AppCompatTextView appCompatTextView = qVar.f10073r;
        if (appCompatTextView != null) {
            qVar.f10064h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f15275A;
        qVar.f10077v = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f10073r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f15301N0 != z10) {
            this.f15301N0 = z10;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f15275A;
        if (zIsEmpty) {
            if (qVar.f10079x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f10079x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f10078w = charSequence;
        qVar.f10080y.setText(charSequence);
        int i10 = qVar.f10069n;
        if (i10 != 2) {
            qVar.f10070o = 2;
        }
        qVar.i(i10, qVar.f10070o, qVar.h(qVar.f10080y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f15275A;
        qVar.f10056A = colorStateList;
        AppCompatTextView appCompatTextView = qVar.f10080y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.f15275A;
        TextInputLayout textInputLayout = qVar.f10064h;
        if (qVar.f10079x == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(qVar.g);
            qVar.f10080y = appCompatTextView;
            appCompatTextView.setId(com.ayah.R.id.textinput_helper_text);
            qVar.f10080y.setTextAlignment(5);
            Typeface typeface = qVar.f10057B;
            if (typeface != null) {
                qVar.f10080y.setTypeface(typeface);
            }
            qVar.f10080y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = qVar.f10080y;
            WeakHashMap weakHashMap = S.f3689a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i10 = qVar.f10081z;
            qVar.f10081z = i10;
            AppCompatTextView appCompatTextView3 = qVar.f10080y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i10);
            }
            ColorStateList colorStateList = qVar.f10056A;
            qVar.f10056A = colorStateList;
            AppCompatTextView appCompatTextView4 = qVar.f10080y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            qVar.a(qVar.f10080y, 1);
            qVar.f10080y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i11 = qVar.f10069n;
            if (i11 == 2) {
                qVar.f10070o = 0;
            }
            qVar.i(i11, qVar.f10070o, qVar.h(qVar.f10080y, ""));
            qVar.g(qVar.f10080y, 1);
            qVar.f10080y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        qVar.f10079x = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        q qVar = this.f15275A;
        qVar.f10081z = i10;
        AppCompatTextView appCompatTextView = qVar.f10080y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.T) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f15303O0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.T) {
            this.T = z10;
            if (z10) {
                CharSequence hint = this.f15334u.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.U)) {
                        setHint(hint);
                    }
                    this.f15334u.setHint((CharSequence) null);
                }
                this.f15309V = true;
            } else {
                this.f15309V = false;
                if (!TextUtils.isEmpty(this.U) && TextUtils.isEmpty(this.f15334u.getHint())) {
                    this.f15334u.setHint(this.U);
                }
                setHintInternal(null);
            }
            if (this.f15334u != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        C0230d c0230d = this.f15299M0;
        c0230d.k(i10);
        this.f15276A0 = c0230d.f3518o;
        if (this.f15334u != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f15276A0 != colorStateList) {
            if (this.f15345z0 == null) {
                C0230d c0230d = this.f15299M0;
                if (c0230d.f3518o != colorStateList) {
                    c0230d.f3518o = colorStateList;
                    c0230d.i(false);
                }
            }
            this.f15276A0 = colorStateList;
            if (this.f15334u != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.f15283E = xVar;
    }

    public void setMaxEms(int i10) {
        this.f15340x = i10;
        EditText editText = this.f15334u;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f15344z = i10;
        EditText editText = this.f15334u;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f15338w = i10;
        EditText editText = this.f15334u;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f15342y = i10;
        EditText editText = this.f15334u;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        m mVar = this.f15332t;
        mVar.f10043x.setContentDescription(i10 != 0 ? mVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        m mVar = this.f15332t;
        mVar.f10043x.setImageDrawable(i10 != 0 ? a.E(mVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        m mVar = this.f15332t;
        if (z10 && mVar.f10045z != 1) {
            mVar.g(1);
        } else if (z10) {
            mVar.getClass();
        } else {
            mVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.f15332t;
        mVar.f10025B = colorStateList;
        a.k(mVar.f10037r, mVar.f10043x, colorStateList, mVar.f10026C);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.f15332t;
        mVar.f10026C = mode;
        a.k(mVar.f10037r, mVar.f10043x, mVar.f10025B, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f15295K == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f15295K = appCompatTextView;
            appCompatTextView.setId(com.ayah.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f15295K;
            WeakHashMap weakHashMap = S.f3689a;
            appCompatTextView2.setImportantForAccessibility(2);
            C0626g c0626gD = d();
            this.f15300N = c0626gD;
            c0626gD.f9571s = 67L;
            this.f15302O = d();
            setPlaceholderTextAppearance(this.f15298M);
            setPlaceholderTextColor(this.f15297L);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f15293J) {
                setPlaceholderTextEnabled(true);
            }
            this.f15291I = charSequence;
        }
        EditText editText = this.f15334u;
        v(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f15298M = i10;
        AppCompatTextView appCompatTextView = this.f15295K;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f15297L != colorStateList) {
            this.f15297L = colorStateList;
            AppCompatTextView appCompatTextView = this.f15295K;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        u uVar = this.f15330s;
        uVar.getClass();
        uVar.f10092t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        uVar.f10091s.setText(charSequence);
        uVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f15330s.f10091s.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f15330s.f10091s.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o oVar) {
        i iVar = this.f15310W;
        if (iVar == null || iVar.f7325r.f7294a == oVar) {
            return;
        }
        this.f15316f0 = oVar;
        b();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f15330s.f10093u.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? a.E(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        u uVar = this.f15330s;
        if (i10 < 0) {
            uVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != uVar.f10096x) {
            uVar.f10096x = i10;
            CheckableImageButton checkableImageButton = uVar.f10093u;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.f15330s;
        CheckableImageButton checkableImageButton = uVar.f10093u;
        View.OnLongClickListener onLongClickListener = uVar.f10098z;
        checkableImageButton.setOnClickListener(onClickListener);
        a.i0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.f15330s;
        uVar.f10098z = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.f10093u;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a.i0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.f15330s;
        uVar.f10097y = scaleType;
        uVar.f10093u.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.f15330s;
        if (uVar.f10094v != colorStateList) {
            uVar.f10094v = colorStateList;
            a.k(uVar.f10090r, uVar.f10093u, colorStateList, uVar.f10095w);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.f15330s;
        if (uVar.f10095w != mode) {
            uVar.f10095w = mode;
            a.k(uVar.f10090r, uVar.f10093u, uVar.f10094v, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f15330s.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        m mVar = this.f15332t;
        mVar.getClass();
        mVar.f10030G = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.f10031H.setText(charSequence);
        mVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f15332t.f10031H.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f15332t.f10031H.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.f15334u;
        if (editText != null) {
            S.o(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f15331s0) {
            this.f15331s0 = typeface;
            C0230d c0230d = this.f15299M0;
            boolean zM = c0230d.m(typeface);
            boolean zO = c0230d.o(typeface);
            if (zM || zO) {
                c0230d.i(false);
            }
            q qVar = this.f15275A;
            if (typeface != qVar.f10057B) {
                qVar.f10057B = typeface;
                AppCompatTextView appCompatTextView = qVar.f10073r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = qVar.f10080y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f15285F;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f15319i0 != 1) {
            FrameLayout frameLayout = this.f15328r;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f15334u;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f15334u;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f15345z0;
        C0230d c0230d = this.f15299M0;
        if (colorStateList2 != null) {
            c0230d.j(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f15345z0;
            c0230d.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f15294J0) : this.f15294J0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f15275A.f10073r;
            c0230d.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f15281D && (appCompatTextView = this.f15285F) != null) {
            c0230d.j(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f15276A0) != null && c0230d.f3518o != colorStateList) {
            c0230d.f3518o = colorStateList;
            c0230d.i(false);
        }
        m mVar = this.f15332t;
        u uVar = this.f15330s;
        if (z12 || !this.f15301N0 || (isEnabled() && z13)) {
            if (z11 || this.L0) {
                ValueAnimator valueAnimator = this.f15305P0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f15305P0.cancel();
                }
                if (z10 && this.f15303O0) {
                    a(1.0f);
                } else {
                    c0230d.p(1.0f);
                }
                this.L0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f15334u;
                v(editText3 != null ? editText3.getText() : null);
                uVar.f10089A = false;
                uVar.e();
                mVar.f10032I = false;
                mVar.n();
                return;
            }
            return;
        }
        if (z11 || !this.L0) {
            ValueAnimator valueAnimator2 = this.f15305P0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15305P0.cancel();
            }
            if (z10 && this.f15303O0) {
                a(0.0f);
            } else {
                c0230d.p(0.0f);
            }
            if (e() && !((h) this.f15310W).f10008P.f10007s.isEmpty() && e()) {
                ((h) this.f15310W).w(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.L0 = true;
            AppCompatTextView appCompatTextView3 = this.f15295K;
            if (appCompatTextView3 != null && this.f15293J) {
                appCompatTextView3.setText((CharSequence) null);
                t.a(this.f15328r, this.f15302O);
                this.f15295K.setVisibility(4);
            }
            uVar.f10089A = true;
            uVar.e();
            mVar.f10032I = true;
            mVar.n();
        }
    }

    public final void v(Editable editable) {
        ((n) this.f15283E).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f15328r;
        if (length != 0 || this.L0) {
            AppCompatTextView appCompatTextView = this.f15295K;
            if (appCompatTextView == null || !this.f15293J) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            t.a(frameLayout, this.f15302O);
            this.f15295K.setVisibility(4);
            return;
        }
        if (this.f15295K == null || !this.f15293J || TextUtils.isEmpty(this.f15291I)) {
            return;
        }
        this.f15295K.setText(this.f15291I);
        t.a(frameLayout, this.f15300N);
        this.f15295K.setVisibility(0);
        this.f15295K.bringToFront();
        announceForAccessibility(this.f15291I);
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.f15284E0.getDefaultColor();
        int colorForState = this.f15284E0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f15284E0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f15324n0 = colorForState2;
        } else if (z11) {
            this.f15324n0 = colorForState;
        } else {
            this.f15324n0 = defaultColor;
        }
    }

    public final void x() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f15310W == null || this.f15319i0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f15334u) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f15334u) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f15324n0 = this.f15294J0;
        } else if (m()) {
            if (this.f15284E0 != null) {
                w(z11, z10);
            } else {
                this.f15324n0 = getErrorCurrentTextColors();
            }
        } else if (!this.f15281D || (appCompatTextView = this.f15285F) == null) {
            if (z11) {
                this.f15324n0 = this.f15282D0;
            } else if (z10) {
                this.f15324n0 = this.f15280C0;
            } else {
                this.f15324n0 = this.f15278B0;
            }
        } else if (this.f15284E0 != null) {
            w(z11, z10);
        } else {
            this.f15324n0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        m mVar = this.f15332t;
        TextInputLayout textInputLayout = mVar.f10037r;
        CheckableImageButton checkableImageButton = mVar.f10043x;
        TextInputLayout textInputLayout2 = mVar.f10037r;
        mVar.l();
        a.g0(textInputLayout2, mVar.f10039t, mVar.f10040u);
        a.g0(textInputLayout2, checkableImageButton, mVar.f10025B);
        if (mVar.b() instanceof j) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                a.k(textInputLayout, checkableImageButton, mVar.f10025B, mVar.f10026C);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        u uVar = this.f15330s;
        a.g0(uVar.f10090r, uVar.f10093u, uVar.f10094v);
        if (this.f15319i0 == 2) {
            int i10 = this.f15321k0;
            if (z11 && isEnabled()) {
                this.f15321k0 = this.f15323m0;
            } else {
                this.f15321k0 = this.f15322l0;
            }
            if (this.f15321k0 != i10 && e() && !this.L0) {
                if (e()) {
                    ((h) this.f15310W).w(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f15319i0 == 1) {
            if (!isEnabled()) {
                this.f15325o0 = this.f15288G0;
            } else if (z10 && !z11) {
                this.f15325o0 = this.f15292I0;
            } else if (z11) {
                this.f15325o0 = this.f15290H0;
            } else {
                this.f15325o0 = this.f15286F0;
            }
        }
        b();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.textInputStyle);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15330s.f10093u;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f15330s.b(drawable);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_Design_TextInputLayout), attributeSet, i10);
        this.f15338w = -1;
        this.f15340x = -1;
        this.f15342y = -1;
        this.f15344z = -1;
        this.f15275A = new q(this);
        this.f15283E = new n(1);
        this.f15326p0 = new Rect();
        this.f15327q0 = new Rect();
        this.f15329r0 = new RectF();
        this.f15337v0 = new LinkedHashSet();
        C0230d c0230d = new C0230d(this);
        this.f15299M0 = c0230d;
        this.f15308S0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f15328r = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = p137n7.a.f20015a;
        c0230d.f3488W = linearInterpolator;
        c0230d.i(false);
        c0230d.f3487V = linearInterpolator;
        c0230d.i(false);
        c0230d.l(8388659);
        p074h0.i iVarN = H.n(context2, attributeSet, p128m7.a.f19666g0, i10, com.ayah.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        u uVar = new u(this, iVarN);
        this.f15330s = uVar;
        TypedArray typedArray = (TypedArray) iVarN.f16423t;
        this.T = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f15303O0 = typedArray.getBoolean(47, true);
        this.f15301N0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f15316f0 = o.d(context2, attributeSet, i10, com.ayah.R.style.Widget_Design_TextInputLayout).a();
        this.f15318h0 = context2.getResources().getDimensionPixelOffset(com.ayah.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f15320j0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f15322l0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.ayah.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f15323m0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.ayah.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f15321k0 = this.f15322l0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        R7.m mVarG = this.f15316f0.g();
        if (dimension >= 0.0f) {
            mVarG.f7341e = new C0479a(dimension);
        }
        if (dimension2 >= 0.0f) {
            mVarG.f7342f = new C0479a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            mVarG.g = new C0479a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            mVarG.f7343h = new C0479a(dimension4);
        }
        this.f15316f0 = mVarG.a();
        ColorStateList colorStateListX = va.g.x(context2, iVarN, 7);
        if (colorStateListX != null) {
            int defaultColor = colorStateListX.getDefaultColor();
            this.f15286F0 = defaultColor;
            this.f15325o0 = defaultColor;
            if (colorStateListX.isStateful()) {
                this.f15288G0 = colorStateListX.getColorForState(new int[]{-16842910}, -1);
                this.f15290H0 = colorStateListX.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f15292I0 = colorStateListX.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f15290H0 = this.f15286F0;
                ColorStateList colorStateListE = s.e(context2, com.ayah.R.color.mtrl_filled_background_color);
                this.f15288G0 = colorStateListE.getColorForState(new int[]{-16842910}, -1);
                this.f15292I0 = colorStateListE.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f15325o0 = 0;
            this.f15286F0 = 0;
            this.f15288G0 = 0;
            this.f15290H0 = 0;
            this.f15292I0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListQ = iVarN.q(1);
            this.f15276A0 = colorStateListQ;
            this.f15345z0 = colorStateListQ;
        }
        ColorStateList colorStateListX2 = va.g.x(context2, iVarN, 14);
        this.f15282D0 = typedArray.getColor(14, 0);
        this.f15278B0 = context2.getColor(com.ayah.R.color.mtrl_textinput_default_box_stroke_color);
        this.f15294J0 = context2.getColor(com.ayah.R.color.mtrl_textinput_disabled_color);
        this.f15280C0 = context2.getColor(com.ayah.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListX2 != null) {
            setBoxStrokeColorStateList(colorStateListX2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(va.g.x(context2, iVarN, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.R = iVarN.q(24);
        this.S = iVarN.q(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i11 = typedArray.getInt(34, 1);
        boolean z10 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z11 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z12 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f15289H = typedArray.getResourceId(22, 0);
        this.f15287G = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i11);
        setCounterOverflowTextAppearance(this.f15287G);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f15289H);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(iVarN.q(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(iVarN.q(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(iVarN.q(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(iVarN.q(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(iVarN.q(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(iVarN.q(58));
        }
        m mVar = new m(this, iVarN);
        this.f15332t = mVar;
        boolean z13 = typedArray.getBoolean(0, true);
        iVarN.C();
        WeakHashMap weakHashMap = S.f3689a;
        setImportantForAccessibility(2);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && i12 >= 26) {
            L.b(this, 1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f15332t.f10043x.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f15332t.f10043x.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f15332t.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15332t.f10043x;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.f15332t;
        TextInputLayout textInputLayout = mVar.f10037r;
        CheckableImageButton checkableImageButton = mVar.f10043x;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            a.k(textInputLayout, checkableImageButton, mVar.f10025B, mVar.f10026C);
            a.g0(textInputLayout, checkableImageButton, mVar.f10025B);
        }
    }
}
