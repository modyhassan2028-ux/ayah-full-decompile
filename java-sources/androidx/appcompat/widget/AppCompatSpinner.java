package androidx.appcompat.widget;

import E2.C0112b;
import K7.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p074h0.i;
import p151p.D;
import p151p.E;
import p151p.F;
import p151p.G;
import p151p.I;
import p151p.J;
import p151p.K;
import p151p.Y0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f11534z = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0112b f11535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f11536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f11537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SpinnerAdapter f11538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f11539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K f11540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f11542y;

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f11542y;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0112b c0112b = this.f11535r;
        if (c0112b != null) {
            c0112b.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        K k7 = this.f11540w;
        return k7 != null ? k7.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        K k7 = this.f11540w;
        return k7 != null ? k7.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f11540w != null ? this.f11541x : super.getDropDownWidth();
    }

    public final K getInternalPopup() {
        return this.f11540w;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        K k7 = this.f11540w;
        return k7 != null ? k7.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f11536s;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        K k7 = this.f11540w;
        return k7 != null ? k7.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11535r;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11535r;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K k7 = this.f11540w;
        if (k7 == null || !k7.a()) {
            return;
        }
        k7.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f11540w == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        J j = (J) parcelable;
        super.onRestoreInstanceState(j.getSuperState());
        if (!j.f20561r || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new l(4, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        J j = new J(super.onSaveInstanceState());
        K k7 = this.f11540w;
        j.f20561r = k7 != null && k7.a();
        return j;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        D d5 = this.f11537t;
        if (d5 == null || !d5.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        K k7 = this.f11540w;
        if (k7 == null) {
            return super.performClick();
        }
        if (k7.a()) {
            return true;
        }
        k7.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11535r;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11535r;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        K k7 = this.f11540w;
        if (k7 == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            k7.k(i10);
            k7.l(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        K k7 = this.f11540w;
        if (k7 != null) {
            k7.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f11540w != null) {
            this.f11541x = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        K k7 = this.f11540w;
        if (k7 != null) {
            k7.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(Y2.a.E(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        K k7 = this.f11540w;
        if (k7 != null) {
            k7.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11535r;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11535r;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f11539v) {
            this.f11538u = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        K k7 = this.f11540w;
        if (k7 != null) {
            Context context = this.f11536s;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            G g = new G();
            g.f20544r = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                g.f20545s = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                E.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            k7.p(g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f11542y = new Rect();
        Y0.a(this, getContext());
        int[] iArr = p073h.a.f16401x;
        i iVarB = i.B(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        this.f11535r = new C0112b(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f11536s = new p130n.c(context, resourceId);
        } else {
            this.f11536s = context;
        }
        int i11 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11534z, i10, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i11 != 0) {
                        F f3 = new F(this);
                        this.f11540w = f3;
                        f3.f20542t = typedArray.getString(2);
                    } else if (i11 == 1) {
                        I i12 = new I(this, this.f11536s, attributeSet, i10);
                        i iVarB2 = i.B(this.f11536s, attributeSet, iArr, i10);
                        this.f11541x = ((TypedArray) iVarB2.f16423t).getLayoutDimension(3, -2);
                        i12.i(iVarB2.r(1));
                        i12.U = typedArray.getString(2);
                        iVarB2.C();
                        this.f11540w = i12;
                        this.f11537t = new D(this, this, i12);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.ayah.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    iVarB.C();
                    this.f11539v = true;
                    spinnerAdapter = this.f11538u;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f11538u = null;
                    }
                    this.f11535r.l(attributeSet, i10);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i11 != 0) {
            F f7 = new F(this);
            this.f11540w = f7;
            f7.f20542t = typedArray.getString(2);
        } else if (i11 == 1) {
            I i13 = new I(this, this.f11536s, attributeSet, i10);
            i iVarB3 = i.B(this.f11536s, attributeSet, iArr, i10);
            this.f11541x = ((TypedArray) iVarB3.f16423t).getLayoutDimension(3, -2);
            i13.i(iVarB3.r(1));
            i13.U = typedArray.getString(2);
            iVarB3.C();
            this.f11540w = i13;
            this.f11537t = new D(this, this, i13);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.ayah.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        iVarB.C();
        this.f11539v = true;
        spinnerAdapter = this.f11538u;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f11538u = null;
        }
        this.f11535r.l(attributeSet, i10);
    }
}
