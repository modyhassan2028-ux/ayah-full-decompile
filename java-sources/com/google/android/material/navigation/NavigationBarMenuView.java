package com.google.android.material.navigation;

import H1.d;
import H7.F;
import H7.ViewOnClickListenerC0238l;
import I1.S;
import J1.e;
import K7.g;
import R7.i;
import R7.o;
import W2.C0620a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.HashSet;
import java.util.WeakHashMap;
import p050e8.b;
import p137n7.a;
import p140o.k;
import p140o.m;
import p140o.y;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements y {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f15041W = {R.attr.state_checked};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f15042a0 = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15043A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f15044B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ColorStateList f15045C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15046D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f15047E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f15048F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f15049G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ColorStateList f15050H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15051I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseArray f15052J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15053K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15054L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15055M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f15056N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f15057O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f15058P;
    public int Q;
    public o R;
    public boolean S;
    public ColorStateList T;
    public g U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public k f15059V;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0620a f15060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ViewOnClickListenerC0238l f15061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f15062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f15063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NavigationBarItemView[] f15065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f15068z;

    public NavigationBarMenuView(Context context) {
        super(context);
        this.f15062t = new d(5);
        this.f15063u = new SparseArray(5);
        this.f15066x = 0;
        this.f15067y = 0;
        this.f15052J = new SparseArray(5);
        this.f15053K = -1;
        this.f15054L = -1;
        this.f15055M = -1;
        this.S = false;
        this.f15045C = c();
        if (isInEditMode()) {
            this.f15060r = null;
        } else {
            C0620a c0620a = new C0620a();
            this.f15060r = c0620a;
            c0620a.O(0);
            c0620a.D(b.S(getContext(), com.ayah.R.attr.motionDurationMedium4, getResources().getInteger(com.ayah.R.integer.material_motion_duration_long_1)));
            c0620a.F(b.T(getContext(), com.ayah.R.attr.motionEasingStandard, a.f20016b));
            c0620a.L(new F());
        }
        this.f15061s = new ViewOnClickListenerC0238l(1, this);
        WeakHashMap weakHashMap = S.f3689a;
        setImportantForAccessibility(1);
    }

    public static boolean f(int i10, int i11) {
        if (i10 == -1) {
            return i11 > 3;
        }
        return i10 == 0;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f15062t.a();
        return navigationBarItemView == null ? e(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        p159p7.a aVar;
        int id = navigationBarItemView.getId();
        if (id == -1 || (aVar = (p159p7.a) this.f15052J.get(id)) == null) {
            return;
        }
        navigationBarItemView.setBadge(aVar);
    }

    public final void a() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f15062t.c(navigationBarItemView);
                    ImageView imageView = navigationBarItemView.f15018E;
                    if (navigationBarItemView.f15031W != null) {
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            p159p7.a aVar = navigationBarItemView.f15031W;
                            if (aVar != null) {
                                if (aVar.d() != null) {
                                    aVar.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        navigationBarItemView.f15031W = null;
                    }
                    navigationBarItemView.f15024K = null;
                    navigationBarItemView.Q = 0.0f;
                    navigationBarItemView.f15032r = false;
                }
            }
        }
        if (this.f15059V.f20139f.size() == 0) {
            this.f15066x = 0;
            this.f15067y = 0;
            this.f15065w = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f15059V.f20139f.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f15059V.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f15052J;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i11++;
        }
        this.f15065w = new NavigationBarItemView[this.f15059V.f20139f.size()];
        boolean zF = f(this.f15064v, this.f15059V.l().size());
        for (int i12 = 0; i12 < this.f15059V.f20139f.size(); i12++) {
            this.U.f5292s = true;
            this.f15059V.getItem(i12).setCheckable(true);
            this.U.f5292s = false;
            NavigationBarItemView newItem = getNewItem();
            this.f15065w[i12] = newItem;
            newItem.setIconTintList(this.f15068z);
            newItem.setIconSize(this.f15043A);
            newItem.setTextColor(this.f15045C);
            newItem.setTextAppearanceInactive(this.f15046D);
            newItem.setTextAppearanceActive(this.f15047E);
            newItem.setTextAppearanceActiveBoldEnabled(this.f15048F);
            newItem.setTextColor(this.f15044B);
            int i13 = this.f15053K;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.f15054L;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            int i15 = this.f15055M;
            if (i15 != -1) {
                newItem.setActiveIndicatorLabelPadding(i15);
            }
            newItem.setActiveIndicatorWidth(this.f15057O);
            newItem.setActiveIndicatorHeight(this.f15058P);
            newItem.setActiveIndicatorMarginHorizontal(this.Q);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.S);
            newItem.setActiveIndicatorEnabled(this.f15056N);
            Drawable drawable = this.f15049G;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f15051I);
            }
            newItem.setItemRippleColor(this.f15050H);
            newItem.setShifting(zF);
            newItem.setLabelVisibilityMode(this.f15064v);
            m mVar = (m) this.f15059V.getItem(i12);
            newItem.a(mVar);
            newItem.setItemPosition(i12);
            int i16 = mVar.f20162a;
            newItem.setOnTouchListener((View.OnTouchListener) this.f15063u.get(i16));
            newItem.setOnClickListener(this.f15061s);
            int i17 = this.f15066x;
            if (i17 != 0 && i16 == i17) {
                this.f15067y = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f15059V.f20139f.size() - 1, this.f15067y);
        this.f15067y = iMin;
        this.f15059V.getItem(iMin).setChecked(true);
    }

    @Override // p140o.y
    public final void b(k kVar) {
        this.f15059V = kVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListE = s.e(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.ayah.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateListE.getDefaultColor();
        int[] iArr = f15042a0;
        return new ColorStateList(new int[][]{iArr, f15041W, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListE.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final i d() {
        if (this.R == null || this.T == null) {
            return null;
        }
        i iVar = new i(this.R);
        iVar.m(this.T);
        return iVar;
    }

    public abstract NavigationBarItemView e(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f15055M;
    }

    public SparseArray<p159p7.a> getBadgeDrawables() {
        return this.f15052J;
    }

    public ColorStateList getIconTintList() {
        return this.f15068z;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.T;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f15056N;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f15058P;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.Q;
    }

    public o getItemActiveIndicatorShapeAppearance() {
        return this.R;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f15057O;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f15049G : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f15051I;
    }

    public int getItemIconSize() {
        return this.f15043A;
    }

    public int getItemPaddingBottom() {
        return this.f15054L;
    }

    public int getItemPaddingTop() {
        return this.f15053K;
    }

    public ColorStateList getItemRippleColor() {
        return this.f15050H;
    }

    public int getItemTextAppearanceActive() {
        return this.f15047E;
    }

    public int getItemTextAppearanceInactive() {
        return this.f15046D;
    }

    public ColorStateList getItemTextColor() {
        return this.f15044B;
    }

    public int getLabelVisibilityMode() {
        return this.f15064v;
    }

    public k getMenu() {
        return this.f15059V;
    }

    public int getSelectedItemId() {
        return this.f15066x;
    }

    public int getSelectedItemPosition() {
        return this.f15067y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e.a(1, this.f15059V.l().size(), 1).f4215a);
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f15055M = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorLabelPadding(i10);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f15068z = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.T = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f15056N = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f15058P = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.Q = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.S = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(o oVar) {
        this.R = oVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f15057O = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f15049G = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f15051I = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f15043A = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i10);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i10, View.OnTouchListener onTouchListener) {
        SparseArray sparseArray = this.f15063u;
        if (onTouchListener == null) {
            sparseArray.remove(i10);
        } else {
            sparseArray.put(i10, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().f20162a == i10) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f15054L = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f15053K = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f15050H = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f15047E = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f15044B;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f15048F = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActiveBoldEnabled(z10);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f15046D = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f15044B;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f15044B = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f15065w;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f15064v = i10;
    }

    public void setPresenter(g gVar) {
        this.U = gVar;
    }
}
