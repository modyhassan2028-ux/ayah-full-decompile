package com.google.android.material.navigation;

import H7.C0237k;
import H7.H;
import H7.t;
import H7.w;
import I1.B0;
import I1.C0248d0;
import I1.S;
import I1.Y;
import J7.b;
import J7.d;
import J7.j;
import K7.a;
import K7.k;
import K7.l;
import K7.n;
import R7.A;
import R7.C;
import R7.C0479a;
import R7.E;
import R7.m;
import R7.o;
import Z1.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.r;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p020c.C0776a;
import p074h0.i;
import p130n.h;
import p181s2.s;
import p185s8.u0;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements b {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int[] f15075N = {R.attr.state_checked};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f15076O = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f15077A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f15078B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public h f15079C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final l f15080D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f15081E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f15082F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15083G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f15084H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f15085I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final A f15086J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final j f15087K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final r f15088L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final k f15089M;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0237k f15090y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final w f15091z;

    public NavigationView(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f15079C == null) {
            this.f15079C = new h(getContext());
        }
        return this.f15079C;
    }

    @Override // J7.b
    public final void a() {
        Pair pairI = i();
        DrawerLayout drawerLayout = (DrawerLayout) pairI.first;
        j jVar = this.f15087K;
        C0776a c0776a = jVar.f4371f;
        jVar.f4371f = null;
        if (c0776a == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        int i10 = ((c) pairI.second).f10958a;
        int i11 = a.f5282a;
        jVar.c(c0776a, i10, new C0248d0(1, drawerLayout, this), new Y(2, drawerLayout));
    }

    @Override // J7.b
    public final void b(C0776a c0776a) {
        float f3 = c0776a.f13367c;
        int i10 = ((c) i().second).f10958a;
        j jVar = this.f15087K;
        if (jVar.f4371f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0776a c0776a2 = jVar.f4371f;
        jVar.f4371f = c0776a;
        if (c0776a2 != null) {
            jVar.d(i10, f3, c0776a.f13368d == 0);
        }
        if (this.f15084H) {
            this.f15083G = p137n7.a.c(0, jVar.f4366a.getInterpolation(f3), this.f15085I);
            h(getWidth(), getHeight());
        }
    }

    @Override // J7.b
    public final void c(C0776a c0776a) {
        i();
        this.f15087K.f4371f = c0776a;
    }

    @Override // J7.b
    public final void d() {
        i();
        this.f15087K.b();
        if (!this.f15084H || this.f15083G == 0) {
            return;
        }
        this.f15083G = 0;
        h(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        A a9 = this.f15086J;
        Path path = a9.f7282e;
        if (!a9.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void e(B0 b5) {
        w wVar = this.f15091z;
        wVar.getClass();
        int iD = b5.d();
        if (wVar.Q != iD) {
            wVar.Q = iD;
            int i10 = (wVar.f3576s.getChildCount() <= 0 && wVar.f3573O) ? wVar.Q : 0;
            NavigationMenuView navigationMenuView = wVar.f3575r;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = wVar.f3575r;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, b5.a());
        S.b(wVar.f3576s, b5);
    }

    public final ColorStateList f(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListE = s.e(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.ayah.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListE.getDefaultColor();
        int[] iArr = f15076O;
        return new ColorStateList(new int[][]{iArr, f15075N, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListE.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final InsetDrawable g(i iVar, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) iVar.f16423t;
        R7.i iVar2 = new R7.i(o.a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0)).a());
        iVar2.m(colorStateList);
        return new InsetDrawable((Drawable) iVar2, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    public j getBackHelper() {
        return this.f15087K;
    }

    public MenuItem getCheckedItem() {
        return this.f15091z.f3579v.f3551v;
    }

    public int getDividerInsetEnd() {
        return this.f15091z.f3569K;
    }

    public int getDividerInsetStart() {
        return this.f15091z.f3568J;
    }

    public int getHeaderCount() {
        return this.f15091z.f3576s.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f15091z.f3562D;
    }

    public int getItemHorizontalPadding() {
        return this.f15091z.f3564F;
    }

    public int getItemIconPadding() {
        return this.f15091z.f3566H;
    }

    public ColorStateList getItemIconTintList() {
        return this.f15091z.f3561C;
    }

    public int getItemMaxLines() {
        return this.f15091z.f3574P;
    }

    public ColorStateList getItemTextColor() {
        return this.f15091z.f3560B;
    }

    public int getItemVerticalPadding() {
        return this.f15091z.f3565G;
    }

    public Menu getMenu() {
        return this.f15090y;
    }

    public int getSubheaderInsetEnd() {
        return this.f15091z.f3571M;
    }

    public int getSubheaderInsetStart() {
        return this.f15091z.f3570L;
    }

    public final void h(int i10, int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof c)) {
            if ((this.f15083G > 0 || this.f15084H) && (getBackground() instanceof R7.i)) {
                int i12 = ((c) getLayoutParams()).f10958a;
                WeakHashMap weakHashMap = S.f3689a;
                boolean z10 = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) == 3;
                R7.i iVar = (R7.i) getBackground();
                m mVarG = iVar.f7325r.f7294a.g();
                mVarG.b(this.f15083G);
                if (z10) {
                    mVarG.f7341e = new C0479a(0.0f);
                    mVarG.f7343h = new C0479a(0.0f);
                } else {
                    mVarG.f7342f = new C0479a(0.0f);
                    mVarG.g = new C0479a(0.0f);
                }
                o oVarA = mVarG.a();
                iVar.setShapeAppearanceModel(oVarA);
                A a9 = this.f15086J;
                a9.f7280c = oVarA;
                a9.c();
                a9.a(this);
                a9.f7281d = new RectF(0.0f, 0.0f, i10, i11);
                a9.c();
                a9.a(this);
                a9.f7279b = true;
                a9.a(this);
            }
        }
    }

    public final Pair i() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof c)) {
            return new Pair((DrawerLayout) parent, (c) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.D(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            r rVar = this.f15088L;
            if (((d) rVar.f11364s) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                ArrayList arrayList = drawerLayout.f12549M;
                k kVar = this.f15089M;
                if (arrayList != null) {
                    arrayList.remove(kVar);
                }
                drawerLayout.a(kVar);
                if (DrawerLayout.k(this)) {
                    rVar.O(true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f15080D);
        ViewParent parent = getParent();
        if (!(parent instanceof DrawerLayout) || (arrayList = ((DrawerLayout) parent).f12549M) == null) {
            return;
        }
        arrayList.remove(this.f15089M);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f15077A;
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i12), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.f6852r);
        this.f15090y.t(nVar.f5298t);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        nVar.f5298t = bundle;
        this.f15090y.v(bundle);
        return nVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h(i10, i11);
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f15082F = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem menuItemFindItem = this.f15090y.findItem(i10);
        if (menuItemFindItem != null) {
            this.f15091z.f3579v.k((p140o.m) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        w wVar = this.f15091z;
        wVar.f3569K = i10;
        wVar.e(false);
    }

    public void setDividerInsetStart(int i10) {
        w wVar = this.f15091z;
        wVar.f3568J = i10;
        wVar.e(false);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        u0.B(this, f3);
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        A a9 = this.f15086J;
        if (z10 != a9.f7278a) {
            a9.f7278a = z10;
            a9.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        w wVar = this.f15091z;
        wVar.f3562D = drawable;
        wVar.e(false);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(getContext().getDrawable(i10));
    }

    public void setItemHorizontalPadding(int i10) {
        w wVar = this.f15091z;
        wVar.f3564F = i10;
        wVar.e(false);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        w wVar = this.f15091z;
        wVar.f3564F = dimensionPixelSize;
        wVar.e(false);
    }

    public void setItemIconPadding(int i10) {
        w wVar = this.f15091z;
        wVar.f3566H = i10;
        wVar.e(false);
    }

    public void setItemIconPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        w wVar = this.f15091z;
        wVar.f3566H = dimensionPixelSize;
        wVar.e(false);
    }

    public void setItemIconSize(int i10) {
        w wVar = this.f15091z;
        if (wVar.f3567I != i10) {
            wVar.f3567I = i10;
            wVar.f3572N = true;
            wVar.e(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        w wVar = this.f15091z;
        wVar.f3561C = colorStateList;
        wVar.e(false);
    }

    public void setItemMaxLines(int i10) {
        w wVar = this.f15091z;
        wVar.f3574P = i10;
        wVar.e(false);
    }

    public void setItemTextAppearance(int i10) {
        w wVar = this.f15091z;
        wVar.f3583z = i10;
        wVar.e(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        w wVar = this.f15091z;
        wVar.f3559A = z10;
        wVar.e(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        w wVar = this.f15091z;
        wVar.f3560B = colorStateList;
        wVar.e(false);
    }

    public void setItemVerticalPadding(int i10) {
        w wVar = this.f15091z;
        wVar.f3565G = i10;
        wVar.e(false);
    }

    public void setItemVerticalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        w wVar = this.f15091z;
        wVar.f3565G = dimensionPixelSize;
        wVar.e(false);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        w wVar = this.f15091z;
        if (wVar != null) {
            wVar.S = i10;
            NavigationMenuView navigationMenuView = wVar.f3575r;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        w wVar = this.f15091z;
        wVar.f3571M = i10;
        wVar.e(false);
    }

    public void setSubheaderInsetStart(int i10) {
        w wVar = this.f15091z;
        wVar.f3570L = i10;
        wVar.e(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f15081E = z10;
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x018f A[PHI: r10
      0x018f: PHI (r10v3 android.graphics.drawable.Drawable) = 
      (r10v2 android.graphics.drawable.Drawable)
      (r10v7 android.graphics.drawable.Drawable)
      (r10v2 android.graphics.drawable.Drawable)
     binds: [B:54:0x0151, B:60:0x0177, B:58:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    public NavigationView(Context context, AttributeSet attributeSet, int i10) {
        A c10;
        ColorStateList colorStateListF;
        int i11;
        boolean z10;
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_Design_NavigationView), attributeSet, i10);
        w wVar = new w();
        this.f15091z = wVar;
        this.f15078B = new int[2];
        this.f15081E = true;
        this.f15082F = true;
        this.f15083G = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            c10 = new E(this);
        } else {
            c10 = new C(this);
        }
        this.f15086J = c10;
        this.f15087K = new j(this);
        this.f15088L = new r(this, this);
        this.f15089M = new k(this);
        Context context2 = getContext();
        C0237k c0237k = new C0237k(context2);
        this.f15090y = c0237k;
        i iVarN = H.n(context2, attributeSet, p128m7.a.f19648P, i10, com.ayah.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) iVarN.f16423t;
        if (typedArray.hasValue(1)) {
            Drawable drawableR = iVarN.r(1);
            WeakHashMap weakHashMap = S.f3689a;
            setBackground(drawableR);
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        this.f15083G = dimensionPixelSize;
        this.f15084H = dimensionPixelSize == 0;
        this.f15085I = getResources().getDimensionPixelSize(com.ayah.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListD = A1.b.d(background);
        if (background == null || colorStateListD != null) {
            R7.i iVar = new R7.i(o.d(context2, attributeSet, i10, com.ayah.R.style.Widget_Design_NavigationView).a());
            if (colorStateListD != null) {
                iVar.m(colorStateListD);
            }
            iVar.k(context2);
            WeakHashMap weakHashMap2 = S.f3689a;
            setBackground(iVar);
        }
        if (typedArray.hasValue(8)) {
            setElevation(typedArray.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(2, false));
        this.f15077A = typedArray.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListQ = typedArray.hasValue(31) ? iVarN.q(31) : null;
        int resourceId = typedArray.hasValue(34) ? typedArray.getResourceId(34, 0) : 0;
        if (resourceId == 0 && colorStateListQ == null) {
            colorStateListQ = f(R.attr.textColorSecondary);
        }
        if (typedArray.hasValue(14)) {
            colorStateListF = iVarN.q(14);
        } else {
            colorStateListF = f(R.attr.textColorSecondary);
        }
        int resourceId2 = typedArray.hasValue(24) ? typedArray.getResourceId(24, 0) : 0;
        boolean z11 = typedArray.getBoolean(25, true);
        if (typedArray.hasValue(13)) {
            setItemIconSize(typedArray.getDimensionPixelSize(13, 0));
        }
        ColorStateList colorStateListQ2 = typedArray.hasValue(26) ? iVarN.q(26) : null;
        if (resourceId2 == 0 && colorStateListQ2 == null) {
            colorStateListQ2 = f(R.attr.textColorPrimary);
        }
        Drawable drawableR2 = iVarN.r(10);
        if (drawableR2 == null && (typedArray.hasValue(17) || typedArray.hasValue(18))) {
            drawableR2 = g(iVarN, g.x(getContext(), iVarN, 19));
            ColorStateList colorStateListX = g.x(context2, iVarN, 16);
            if (colorStateListX != null) {
                wVar.f3563E = new RippleDrawable(O7.a.c(colorStateListX), null, g(iVarN, null));
                i11 = 0;
                wVar.e(false);
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        if (typedArray.hasValue(11)) {
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(11, i11));
        }
        if (typedArray.hasValue(27)) {
            setItemVerticalPadding(typedArray.getDimensionPixelSize(27, i11));
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(6, i11));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(5, i11));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(33, i11));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(32, i11));
        setTopInsetScrimEnabled(typedArray.getBoolean(35, this.f15081E));
        setBottomInsetScrimEnabled(typedArray.getBoolean(4, this.f15082F));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(12, i11);
        setItemMaxLines(typedArray.getInt(15, 1));
        c0237k.f20138e = new p248z6.c(20, this);
        wVar.f3578u = 1;
        wVar.i(context2, c0237k);
        if (resourceId != 0) {
            wVar.f3581x = resourceId;
            z10 = false;
            wVar.e(false);
        } else {
            z10 = false;
        }
        wVar.f3582y = colorStateListQ;
        wVar.e(z10);
        wVar.f3561C = colorStateListF;
        wVar.e(z10);
        int overScrollMode = getOverScrollMode();
        wVar.S = overScrollMode;
        NavigationMenuView navigationMenuView = wVar.f3575r;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            wVar.f3583z = resourceId2;
            wVar.e(z10);
        }
        wVar.f3559A = z11;
        wVar.e(z10);
        wVar.f3560B = colorStateListQ2;
        wVar.e(z10);
        wVar.f3562D = drawableR2;
        wVar.e(z10);
        wVar.f3566H = dimensionPixelSize2;
        wVar.e(z10);
        c0237k.b(wVar, c0237k.f20134a);
        if (wVar.f3575r == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) wVar.f3580w.inflate(com.ayah.R.layout.design_navigation_menu, this, z10);
            wVar.f3575r = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new t(wVar, wVar.f3575r));
            if (wVar.f3579v == null) {
                H7.o oVar = new H7.o(wVar);
                wVar.f3579v = oVar;
                oVar.i(true);
            }
            int i12 = wVar.S;
            if (i12 != -1) {
                wVar.f3575r.setOverScrollMode(i12);
            }
            LinearLayout linearLayout = (LinearLayout) wVar.f3580w.inflate(com.ayah.R.layout.design_navigation_item_header, (ViewGroup) wVar.f3575r, false);
            wVar.f3576s = linearLayout;
            WeakHashMap weakHashMap3 = S.f3689a;
            linearLayout.setImportantForAccessibility(2);
            wVar.f3575r.setAdapter(wVar.f3579v);
        }
        addView(wVar.f3575r);
        if (typedArray.hasValue(28)) {
            int resourceId3 = typedArray.getResourceId(28, 0);
            H7.o oVar2 = wVar.f3579v;
            if (oVar2 != null) {
                oVar2.f3552w = true;
            }
            getMenuInflater().inflate(resourceId3, c0237k);
            H7.o oVar3 = wVar.f3579v;
            if (oVar3 != null) {
                oVar3.f3552w = false;
            }
            wVar.e(false);
        }
        if (typedArray.hasValue(9)) {
            wVar.f3576s.addView(wVar.f3580w.inflate(typedArray.getResourceId(9, 0), (ViewGroup) wVar.f3576s, false));
            NavigationMenuView navigationMenuView3 = wVar.f3575r;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        iVarN.C();
        this.f15080D = new l(0, this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f15080D);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f15090y.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f15091z.f3579v.k((p140o.m) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setNavigationItemSelectedListener(K7.m mVar) {
    }
}
