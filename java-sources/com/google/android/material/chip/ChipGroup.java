package com.google.android.material.chip;

import H7.C0227a;
import H7.H;
import H7.InterfaceC0235i;
import I1.S;
import Y7.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ayah.R;
import com.google.android.material.internal.FlowLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p151p.C1256n;
import p151p.V;
import p240y7.e;
import p240y7.f;
import p240y7.g;
import p240y7.h;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends FlowLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final h f14810A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f14813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0227a f14814y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14815z;

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && getChildAt(i11).getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean a() {
        return this.f14973t;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f14814y.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f14814y.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f14811v;
    }

    public int getChipSpacingVertical() {
        return this.f14812w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f14815z;
        if (i10 != -1) {
            C0227a c0227a = this.f14814y;
            InterfaceC0235i interfaceC0235i = (InterfaceC0235i) ((HashMap) c0227a.f3465d).get(Integer.valueOf(i10));
            if (interfaceC0235i != null && c0227a.a(interfaceC0235i)) {
                c0227a.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) J1.e.a(getRowCount(), this.f14973t ? getVisibleChipCount() : -1, this.f14814y.f3463b ? 1 : 2).f4215a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f14811v != i10) {
            this.f14811v = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f14812w != i10) {
            this.f14812w = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(f fVar) {
        if (fVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new V(this));
        }
    }

    public void setOnCheckedStateChangeListener(g gVar) {
        this.f14813x = gVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f14810A.f24714a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f14814y.f3464c = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        C0227a c0227a = this.f14814y;
        if (c0227a.f3463b != z10) {
            c0227a.f3463b = z10;
            boolean zIsEmpty = ((HashSet) c0227a.f3466e).isEmpty();
            Iterator it = ((HashMap) c0227a.f3465d).values().iterator();
            while (it.hasNext()) {
                c0227a.e((InterfaceC0235i) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            c0227a.d();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i10);
        C0227a c0227a = new C0227a(0);
        this.f14814y = c0227a;
        h hVar = new h(this);
        this.f14810A = hVar;
        TypedArray typedArrayM = H.m(getContext(), attributeSet, p128m7.a.f19671k, i10, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM.getBoolean(5, false));
        setSingleSelection(typedArrayM.getBoolean(6, false));
        setSelectionRequired(typedArrayM.getBoolean(4, false));
        this.f14815z = typedArrayM.getResourceId(0, -1);
        typedArrayM.recycle();
        c0227a.f3467f = new C1256n(16, this);
        super.setOnHierarchyChangeListener(hVar);
        WeakHashMap weakHashMap = S.f3689a;
        setImportantForAccessibility(1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
