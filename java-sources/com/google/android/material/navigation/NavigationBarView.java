package com.google.android.material.navigation;

import A1.b;
import H7.H;
import I1.S;
import K7.e;
import K7.g;
import K7.i;
import K7.j;
import O8.c;
import R7.o;
import Y7.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.ayah.R;
import java.util.WeakHashMap;
import p130n.h;
import p140o.y;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f15069w = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f15070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final NavigationBarMenuView f15071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f15072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f15073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f15074v;

    public NavigationBarView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(a.a(context, attributeSet, i10, i11), attributeSet, i10);
        g gVar = new g();
        gVar.f5292s = false;
        this.f15072t = gVar;
        Context context2 = getContext();
        p074h0.i iVarN = H.n(context2, attributeSet, p128m7.a.f19646N, i10, i11, 12, 10);
        e eVar = new e(context2, getClass(), getMaxItemCount());
        this.f15070r = eVar;
        NavigationBarMenuView navigationBarMenuViewA = a(context2);
        this.f15071s = navigationBarMenuViewA;
        gVar.f5291r = navigationBarMenuViewA;
        gVar.f5293t = 1;
        navigationBarMenuViewA.setPresenter(gVar);
        eVar.b(gVar, eVar.f20134a);
        getContext();
        gVar.f5291r.f15059V = eVar;
        TypedArray typedArray = (TypedArray) iVarN.f16423t;
        if (typedArray.hasValue(6)) {
            navigationBarMenuViewA.setIconTintList(iVarN.q(6));
        } else {
            navigationBarMenuViewA.setIconTintList(navigationBarMenuViewA.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(iVarN.q(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListD = b.d(background);
        if (background == null || colorStateListD != null) {
            R7.i iVar = new R7.i(o.d(context2, attributeSet, i10, i11).a());
            if (colorStateListD != null) {
                iVar.m(colorStateListD);
            }
            iVar.k(context2);
            WeakHashMap weakHashMap = S.f3689a;
            setBackground(iVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(va.g.x(context2, iVarN, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            navigationBarMenuViewA.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(va.g.x(context2, iVarN, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, p128m7.a.f19645M);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(va.g.w(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(o.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            gVar.f5292s = true;
            getMenuInflater().inflate(resourceId3, eVar);
            gVar.f5292s = false;
            gVar.e(true);
        }
        iVarN.C();
        addView(navigationBarMenuViewA);
        eVar.f20138e = new c((Object) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f15073u == null) {
            this.f15073u = new h(getContext());
        }
        return this.f15073u;
    }

    public abstract NavigationBarMenuView a(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f15071s.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f15071s.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f15071s.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f15071s.getItemActiveIndicatorMarginHorizontal();
    }

    public o getItemActiveIndicatorShapeAppearance() {
        return this.f15071s.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f15071s.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f15071s.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f15071s.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f15071s.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f15071s.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f15071s.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f15071s.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f15071s.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f15071s.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f15071s.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f15071s.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f15071s.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f15070r;
    }

    public y getMenuView() {
        return this.f15071s;
    }

    public g getPresenter() {
        return this.f15072t;
    }

    public int getSelectedItemId() {
        return this.f15071s.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.D(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f6852r);
        this.f15070r.t(jVar.f5294t);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        jVar.f5294t = bundle;
        this.f15070r.v(bundle);
        return jVar;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f15071s.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        u0.B(this, f3);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f15071s.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f15071s.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f15071s.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f15071s.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(o oVar) {
        this.f15071s.setItemActiveIndicatorShapeAppearance(oVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f15071s.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f15071s.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f15071s.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f15071s.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f15071s.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i10, View.OnTouchListener onTouchListener) {
        this.f15071s.setItemOnTouchListener(i10, onTouchListener);
    }

    public void setItemPaddingBottom(int i10) {
        this.f15071s.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f15071s.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f15071s.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f15071s.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f15071s.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f15071s.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f15071s.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        NavigationBarMenuView navigationBarMenuView = this.f15071s;
        if (navigationBarMenuView.getLabelVisibilityMode() != i10) {
            navigationBarMenuView.setLabelVisibilityMode(i10);
            this.f15072t.e(false);
        }
    }

    public void setOnItemSelectedListener(i iVar) {
        this.f15074v = iVar;
    }

    public void setSelectedItemId(int i10) {
        e eVar = this.f15070r;
        MenuItem menuItemFindItem = eVar.findItem(i10);
        if (menuItemFindItem == null || eVar.q(menuItemFindItem, this.f15072t, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(K7.h hVar) {
    }
}
