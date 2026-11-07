package androidx.appcompat.widget;

import A1.f;
import E2.C0112b;
import I1.AbstractC0272z;
import N1.m;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p017b7.g;
import p151p.A;
import p151p.C1235c0;
import p151p.C1277y;
import p151p.L;
import p151p.T;
import p151p.U;
import p151p.V;
import p151p.W;
import p151p.X;
import p151p.Y0;
import p151p.Z0;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0112b f11543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f11544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f11545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1277y f11546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public V f11548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Future f11549x;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private C1277y getEmojiTextViewHelper() {
        if (this.f11546u == null) {
            this.f11546u = new C1277y(this);
        }
        return this.f11546u;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0112b c0112b = this.f11543r;
        if (c0112b != null) {
            c0112b.a();
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q1.f20768c) {
            return super.getAutoSizeMaxTextSize();
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            return Math.round(t2.f20592i.f20647e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q1.f20768c) {
            return super.getAutoSizeMinTextSize();
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            return Math.round(t2.f20592i.f20646d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q1.f20768c) {
            return super.getAutoSizeStepGranularity();
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            return Math.round(t2.f20592i.f20645c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f20768c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        T t2 = this.f11544s;
        return t2 != null ? t2.f20592i.f20648f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q1.f20768c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            return t2.f20592i.f20643a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.u0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public U getSuperCaller() {
        if (this.f11548w == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f11548w = new X(this);
            } else if (i10 >= 28) {
                this.f11548w = new W(this);
            } else if (i10 >= 26) {
                this.f11548w = new V(this);
            }
        }
        return this.f11548w;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11543r;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11543r;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11544s.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11544s.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f11549x;
        if (future != null) {
            try {
                this.f11549x = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                g.g0(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        A a9;
        if (Build.VERSION.SDK_INT >= 28 || (a9 = this.f11545t) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a9.f20507c;
        return textClassifier == null ? L.a((TextView) a9.f20506b) : textClassifier;
    }

    public G1.c getTextMetricsParamsCompat() {
        return g.g0(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11544s.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            K1.c.c(editorInfo, getText());
        }
        p000a.a.S(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        T t2 = this.f11544s;
        if (t2 == null || q1.f20768c) {
            return;
        }
        t2.f20592i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future future = this.f11549x;
        if (future != null) {
            try {
                this.f11549x = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                g.g0(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        T t2 = this.f11544s;
        if (t2 != null) {
            C1235c0 c1235c0 = t2.f20592i;
            if (q1.f20768c || !c1235c0.f()) {
                return;
            }
            c1235c0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (q1.f20768c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (q1.f20768c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (q1.f20768c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11543r;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11543r;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            g.o0(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            g.p0(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        g.q0(this, i10);
    }

    public void setPrecomputedText(G1.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        g.g0(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11543r;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11543r;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f11544s;
        t2.k(colorStateList);
        t2.b();
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f11544s;
        t2.l(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        A a9;
        if (Build.VERSION.SDK_INT >= 28 || (a9 = this.f11545t) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a9.f20507c = textClassifier;
        }
    }

    public void setTextFuture(Future<G1.d> future) {
        this.f11549x = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(G1.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f2776b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(cVar.f2775a);
        setBreakStrategy(cVar.f2777c);
        setHyphenationFrequency(cVar.f2778d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f3) {
        boolean z10 = q1.f20768c;
        if (z10) {
            super.setTextSize(i10, f3);
            return;
        }
        T t2 = this.f11544s;
        if (t2 != null) {
            C1235c0 c1235c0 = t2.f20592i;
            if (z10 || c1235c0.f()) {
                return;
            }
            c1235c0.g(i10, f3);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f11547v) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            B9.a aVar = f.f469a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f11547v = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f11547v = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f3) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().c(i10, f3);
        } else if (i11 >= 34) {
            AbstractC0272z.p(this, i10, f3);
        } else {
            g.q0(this, Math.round(TypedValue.applyDimension(i10, f3, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z0.a(context);
        this.f11547v = false;
        this.f11548w = null;
        Y0.a(this, getContext());
        C0112b c0112b = new C0112b(this);
        this.f11543r = c0112b;
        c0112b.l(attributeSet, i10);
        T t2 = new T(this);
        this.f11544s = t2;
        t2.f(attributeSet, i10);
        t2.b();
        A a9 = new A();
        a9.f20506b = this;
        this.f11545t = a9;
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? Y2.a.E(context, i10) : null, i11 != 0 ? Y2.a.E(context, i11) : null, i12 != 0 ? Y2.a.E(context, i12) : null, i13 != 0 ? Y2.a.E(context, i13) : null);
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? Y2.a.E(context, i10) : null, i11 != 0 ? Y2.a.E(context, i11) : null, i12 != 0 ? Y2.a.E(context, i12) : null, i13 != 0 ? Y2.a.E(context, i13) : null);
        T t2 = this.f11544s;
        if (t2 != null) {
            t2.b();
        }
    }
}
