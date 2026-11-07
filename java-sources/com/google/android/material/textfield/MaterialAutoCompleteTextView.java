package com.google.android.material.textfield;

import H7.H;
import R7.i;
import X7.r;
import X7.s;
import Y7.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.ayah.R;
import java.util.List;
import java.util.Locale;
import p151p.A0;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f15264A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15265B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f15266C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A0 f15267v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AccessibilityManager f15268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f15269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f15271z;

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f15268w;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f15267v.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f15264A;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f15309V) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f15271z;
    }

    public int getSimpleItemSelectedColor() {
        return this.f15265B;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f15266C;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f15309V && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15267v.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                A0 a9 = this.f15267v;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !a9.Q.isShowing() ? -1 : a9.f20526t.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = a9.Q.getBackground();
                if (background != null) {
                    Rect rect = this.f15269x;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f15267v.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        A0 a9 = this.f15267v;
        if (a9 != null) {
            a9.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f15264A = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof i) {
            ((i) dropDownBackground).m(this.f15264A);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f15267v.f20515H = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f15265B = i10;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f15266C = colorStateList;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f15267v.d();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new s(this, getContext(), this.f15270y, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, 0), attributeSet, i10);
        this.f15269x = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19685y, i10, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM.hasValue(0) && typedArrayM.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f15270y = typedArrayM.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f15271z = typedArrayM.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM.hasValue(2)) {
            this.f15264A = ColorStateList.valueOf(typedArrayM.getColor(2, 0));
        }
        this.f15265B = typedArrayM.getColor(4, 0);
        this.f15266C = g.w(context2, typedArrayM, 5);
        this.f15268w = (AccessibilityManager) context2.getSystemService("accessibility");
        A0 a9 = new A0(context2);
        this.f15267v = a9;
        a9.f20523P = true;
        a9.Q.setFocusable(true);
        a9.f20513F = this;
        a9.Q.setInputMethodMode(2);
        a9.p(getAdapter());
        a9.f20514G = new r(0, this);
        if (typedArrayM.hasValue(6)) {
            setSimpleItems(typedArrayM.getResourceId(6, 0));
        }
        typedArrayM.recycle();
    }
}
