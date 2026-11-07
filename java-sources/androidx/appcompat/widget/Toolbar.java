package androidx.appcompat.widget;

import E2.RunnableC0147v;
import H7.ViewOnClickListenerC0238l;
import I1.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p017b7.g;
import p056f2.C;
import p130n.h;
import p140o.i;
import p140o.k;
import p140o.m;
import p140o.v;
import p151p.C1250k;
import p151p.C1256n;
import p151p.InterfaceC1241f0;
import p151p.J0;
import p151p.V;
import p151p.b1;
import p151p.c1;
import p151p.d1;
import p151p.e1;
import p151p.f1;
import p151p.g1;
import p151p.i1;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Context f11673A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11674B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11675C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11676D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f11677E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f11678F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11679G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f11680H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f11681I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f11682J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public J0 f11683K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f11684L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f11685M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f11686N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public CharSequence f11687O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence f11688P;
    public ColorStateList Q;
    public ColorStateList R;
    public boolean S;
    public boolean T;
    public final ArrayList U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final ArrayList f11689V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int[] f11690W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final r f11691a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f11692b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public f1 f11693c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final C1256n f11694d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public i1 f11695e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C1250k f11696f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public d1 f11697g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public v f11698h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public i f11699i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f11700j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OnBackInvokedCallback f11701k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public OnBackInvokedDispatcher f11702l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f11703m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final RunnableC0147v f11704n0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ActionMenuView f11705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AppCompatTextView f11706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AppCompatTextView f11707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AppCompatImageButton f11708u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppCompatImageView f11709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Drawable f11710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f11711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatImageButton f11712y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f11713z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static e1 h() {
        e1 e1Var = new e1(-2, -2);
        e1Var.f20656b = 0;
        e1Var.f20655a = 8388627;
        return e1Var;
    }

    public static e1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof e1;
        if (z10) {
            e1 e1Var = (e1) layoutParams;
            e1 e1Var2 = new e1(e1Var);
            e1Var2.f20656b = 0;
            e1Var2.f20656b = e1Var.f20656b;
            return e1Var2;
        }
        if (z10) {
            e1 e1Var3 = new e1((e1) layoutParams);
            e1Var3.f20656b = 0;
            return e1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            e1 e1Var4 = new e1(layoutParams);
            e1Var4.f20656b = 0;
            return e1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        e1 e1Var5 = new e1(marginLayoutParams);
        e1Var5.f20656b = 0;
        ((ViewGroup.MarginLayoutParams) e1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return e1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e1 e1Var = (e1) childAt.getLayoutParams();
                if (e1Var.f20656b == 0 && u(childAt)) {
                    int i12 = e1Var.f20655a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            e1 e1Var2 = (e1) childAt2.getLayoutParams();
            if (e1Var2.f20656b == 0 && u(childAt2)) {
                int i14 = e1Var2.f20655a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        e1 e1VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            e1VarI = h();
        } else {
            e1VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (e1) layoutParams;
        }
        e1VarI.f20656b = 1;
        if (!z10 || this.f11713z == null) {
            addView(view, e1VarI);
        } else {
            view.setLayoutParams(e1VarI);
            this.f11689V.add(view);
        }
    }

    public final void c() {
        if (this.f11712y == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f11712y = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f11710w);
            this.f11712y.setContentDescription(this.f11711x);
            e1 e1VarH = h();
            e1VarH.f20655a = (this.f11677E & 112) | 8388611;
            e1VarH.f20656b = 2;
            this.f11712y.setLayoutParams(e1VarH);
            this.f11712y.setOnClickListener(new ViewOnClickListenerC0238l(5, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e1);
    }

    public final void d() {
        if (this.f11683K == null) {
            J0 j10 = new J0();
            j10.f20562a = 0;
            j10.f20563b = 0;
            j10.f20564c = Integer.MIN_VALUE;
            j10.f20565d = Integer.MIN_VALUE;
            j10.f20566e = 0;
            j10.f20567f = 0;
            j10.g = false;
            j10.f20568h = false;
            this.f11683K = j10;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f11705r;
        if (actionMenuView.f11475G == null) {
            k kVar = (k) actionMenuView.getMenu();
            if (this.f11697g0 == null) {
                this.f11697g0 = new d1(this);
            }
            this.f11705r.setExpandedActionViewsExclusive(true);
            kVar.b(this.f11697g0, this.f11673A);
            w();
        }
    }

    public final void f() {
        if (this.f11705r == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f11705r = actionMenuView;
            actionMenuView.setPopupTheme(this.f11674B);
            this.f11705r.setOnMenuItemClickListener(this.f11694d0);
            this.f11705r.setMenuCallbacks(this.f11698h0, new V(this));
            e1 e1VarH = h();
            e1VarH.f20655a = (this.f11677E & 112) | 8388613;
            this.f11705r.setLayoutParams(e1VarH);
            b(this.f11705r, false);
        }
    }

    public final void g() {
        if (this.f11708u == null) {
            this.f11708u = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e1 e1VarH = h();
            e1VarH.f20655a = (this.f11677E & 112) | 8388611;
            this.f11708u.setLayoutParams(e1VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f11712y;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f11712y;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        J0 j10 = this.f11683K;
        if (j10 != null) {
            return j10.g ? j10.f20562a : j10.f20563b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f11685M;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        J0 j10 = this.f11683K;
        if (j10 != null) {
            return j10.f20562a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        J0 j10 = this.f11683K;
        if (j10 != null) {
            return j10.f20563b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        J0 j10 = this.f11683K;
        if (j10 != null) {
            return j10.g ? j10.f20563b : j10.f20562a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f11684L;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        k kVar;
        ActionMenuView actionMenuView = this.f11705r;
        return (actionMenuView == null || (kVar = actionMenuView.f11475G) == null || !kVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f11685M, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f11684L, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f11709v;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f11709v;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f11705r.getMenu();
    }

    public View getNavButtonView() {
        return this.f11708u;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f11708u;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f11708u;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public C1250k getOuterActionMenuPresenter() {
        return this.f11696f0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f11705r.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f11673A;
    }

    public int getPopupTheme() {
        return this.f11674B;
    }

    public CharSequence getSubtitle() {
        return this.f11688P;
    }

    public final TextView getSubtitleTextView() {
        return this.f11707t;
    }

    public CharSequence getTitle() {
        return this.f11687O;
    }

    public int getTitleMarginBottom() {
        return this.f11682J;
    }

    public int getTitleMarginEnd() {
        return this.f11680H;
    }

    public int getTitleMarginStart() {
        return this.f11679G;
    }

    public int getTitleMarginTop() {
        return this.f11681I;
    }

    public final TextView getTitleTextView() {
        return this.f11706s;
    }

    public InterfaceC1241f0 getWrapper() {
        if (this.f11695e0 == null) {
            this.f11695e0 = new i1(this, true);
        }
        return this.f11695e0;
    }

    public final int j(int i10, View view) {
        e1 e1Var = (e1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = e1Var.f20655a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f11686N & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void n() {
        ArrayList arrayList = this.f11692b0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f11691a0.f11365t).iterator();
        while (it.hasNext()) {
            ((C) it.next()).f15936a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f11692b0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f11689V.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f11704n0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.T = false;
        }
        if (!this.T) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.T = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.T = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        e1 e1Var;
        e1 e1Var2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i27;
        int size2;
        int i28;
        int i29;
        int size3;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.f11690W;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = S.f3689a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (u(this.f11708u)) {
            if (z12) {
                iR = r(this.f11708u, i35, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(this.f11708u, paddingLeft, iMin2, iArr);
            }
            if (u(this.f11712y)) {
                if (z12) {
                    iR = r(this.f11712y, iR, iMin2, iArr);
                } else {
                    iQ = q(this.f11712y, iQ, iMin2, iArr);
                }
            }
            if (u(this.f11705r)) {
                if (z12) {
                    iQ = q(this.f11705r, iQ, iMin2, iArr);
                } else {
                    iR = r(this.f11705r, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i35 - currentContentInsetRight);
            if (u(this.f11713z)) {
                if (z12) {
                    iMin = r(this.f11713z, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f11713z, iMax, iMin2, iArr);
                }
            }
            if (u(this.f11709v)) {
                if (z12) {
                    iMin = r(this.f11709v, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f11709v, iMax, iMin2, iArr);
                }
            }
            zU = u(this.f11706s);
            zU2 = u(this.f11707t);
            if (zU) {
                e1 e1Var3 = (e1) this.f11706s.getLayoutParams();
                measuredHeight = this.f11706s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var3).topMargin + ((ViewGroup.MarginLayoutParams) e1Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                e1 e1Var4 = (e1) this.f11707t.getLayoutParams();
                measuredHeight = this.f11707t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var4).topMargin + ((ViewGroup.MarginLayoutParams) e1Var4).bottomMargin + measuredHeight;
            }
            if (zU || zU2) {
                if (zU) {
                    appCompatTextView = this.f11706s;
                } else {
                    appCompatTextView = this.f11707t;
                }
                if (zU2) {
                    appCompatTextView2 = this.f11707t;
                } else {
                    appCompatTextView2 = this.f11706s;
                }
                e1Var = (e1) appCompatTextView.getLayoutParams();
                e1Var2 = (e1) appCompatTextView2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zU && this.f11706s.getMeasuredWidth() > 0) || (zU2 && this.f11707t.getMeasuredWidth() > 0);
                i15 = this.f11686N & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f11681I;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i23 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f11681I;
                    if (iMax2 < i23) {
                        iMax2 = i23;
                    } else {
                        i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i25 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
                        i26 = this.f11682J;
                        if (i24 < i25 + i26) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin + i26) - i24));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin) - this.f11682J) - i14;
                }
                if (z12) {
                    if (z11) {
                        i20 = this.f11679G;
                    } else {
                        i20 = 0;
                    }
                    int i36 = i20 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zU) {
                        e1 e1Var5 = (e1) this.f11706s.getLayoutParams();
                        int measuredWidth2 = iMin - this.f11706s.getMeasuredWidth();
                        int measuredHeight2 = this.f11706s.getMeasuredHeight() + paddingTop;
                        this.f11706s.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i21 = measuredWidth2 - this.f11680H;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin;
                    } else {
                        i21 = iMin;
                    }
                    if (zU2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f11707t.getLayoutParams())).topMargin;
                        this.f11707t.layout(iMin - this.f11707t.getMeasuredWidth(), i37, iMin, this.f11707t.getMeasuredHeight() + i37);
                        i22 = iMin - this.f11680H;
                    } else {
                        i22 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i21, i22);
                    }
                    iMax = i16;
                } else {
                    if (z11) {
                        i17 = this.f11679G;
                    } else {
                        i17 = 0;
                    }
                    int i38 = i17 - iArr[0];
                    iMax = Math.max(0, i38) + i16;
                    iArr[0] = Math.max(0, -i38);
                    if (zU) {
                        e1 e1Var6 = (e1) this.f11706s.getLayoutParams();
                        int measuredWidth3 = this.f11706s.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f11706s.getMeasuredHeight() + paddingTop;
                        this.f11706s.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i18 = measuredWidth3 + this.f11680H;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) e1Var6).bottomMargin;
                    } else {
                        i18 = iMax;
                    }
                    if (zU2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f11707t.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f11707t.getMeasuredWidth() + iMax;
                        this.f11707t.layout(iMax, i39, measuredWidth4, this.f11707t.getMeasuredHeight() + i39);
                        i19 = measuredWidth4 + this.f11680H;
                    } else {
                        i19 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i18, i19);
                    }
                }
            }
            arrayList = this.U;
            a(3, arrayList);
            size = arrayList.size();
            iQ2 = iMax;
            for (i27 = 0; i27 < size; i27++) {
                iQ2 = q((View) arrayList.get(i27), iQ2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = r((View) arrayList.get(i28), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i40 = iArr[0];
            i29 = iArr[1];
            size3 = arrayList.size();
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = (View) arrayList.get(i31);
                e1 e1Var7 = (e1) view.getLayoutParams();
                int i41 = i29;
                int i42 = ((ViewGroup.MarginLayoutParams) e1Var7).leftMargin - i30;
                int i43 = ((ViewGroup.MarginLayoutParams) e1Var7).rightMargin - i41;
                int iMax3 = Math.max(0, i42);
                int iMax4 = Math.max(0, i43);
                int iMax5 = Math.max(0, -i42);
                int iMax6 = Math.max(0, -i43);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i30 = iMax5;
                i29 = iMax6;
            }
            i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iQ2) {
                if (i34 > iMin) {
                    iQ2 = i33 - (i34 - iMin);
                } else {
                    iQ2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iQ2 = q((View) arrayList.get(i32), iQ2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i35;
        if (u(this.f11712y)) {
            if (z12) {
                iR = r(this.f11712y, iR, iMin2, iArr);
            } else {
                iQ = q(this.f11712y, iQ, iMin2, iArr);
            }
        }
        if (u(this.f11705r)) {
            if (z12) {
                iQ = q(this.f11705r, iQ, iMin2, iArr);
            } else {
                iR = r(this.f11705r, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i35 - currentContentInsetRight2);
        if (u(this.f11713z)) {
            if (z12) {
                iMin = r(this.f11713z, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f11713z, iMax, iMin2, iArr);
            }
        }
        if (u(this.f11709v)) {
            if (z12) {
                iMin = r(this.f11709v, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f11709v, iMax, iMin2, iArr);
            }
        }
        zU = u(this.f11706s);
        zU2 = u(this.f11707t);
        if (zU) {
            e1 e1Var8 = (e1) this.f11706s.getLayoutParams();
            measuredHeight = this.f11706s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var8).topMargin + ((ViewGroup.MarginLayoutParams) e1Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            e1 e1Var9 = (e1) this.f11707t.getLayoutParams();
            measuredHeight = this.f11707t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var9).topMargin + ((ViewGroup.MarginLayoutParams) e1Var9).bottomMargin + measuredHeight;
        }
        if (zU) {
            if (zU) {
                appCompatTextView = this.f11706s;
            } else {
                appCompatTextView = this.f11707t;
            }
            if (zU2) {
                appCompatTextView2 = this.f11707t;
            } else {
                appCompatTextView2 = this.f11706s;
            }
            e1Var = (e1) appCompatTextView.getLayoutParams();
            e1Var2 = (e1) appCompatTextView2.getLayoutParams();
            i14 = measuredHeight;
            if (zU) {
            }
            i15 = this.f11686N & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f11681I;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f11681I;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
                    i26 = this.f11682J;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin) - this.f11682J) - i14;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f11679G;
                } else {
                    i20 = 0;
                }
                int i310 = i20 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zU) {
                    e1 e1Var10 = (e1) this.f11706s.getLayoutParams();
                    int measuredWidth5 = iMin - this.f11706s.getMeasuredWidth();
                    int measuredHeight4 = this.f11706s.getMeasuredHeight() + paddingTop;
                    this.f11706s.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i21 = measuredWidth5 - this.f11680H;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) e1Var10).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zU2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f11707t.getLayoutParams())).topMargin;
                    this.f11707t.layout(iMin - this.f11707t.getMeasuredWidth(), i311, iMin, this.f11707t.getMeasuredHeight() + i311);
                    i22 = iMin - this.f11680H;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z11) {
                    i17 = this.f11679G;
                } else {
                    i17 = 0;
                }
                int i312 = i17 - iArr[0];
                iMax = Math.max(0, i312) + i16;
                iArr[0] = Math.max(0, -i312);
                if (zU) {
                    e1 e1Var11 = (e1) this.f11706s.getLayoutParams();
                    int measuredWidth6 = this.f11706s.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f11706s.getMeasuredHeight() + paddingTop;
                    this.f11706s.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i18 = measuredWidth6 + this.f11680H;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) e1Var11).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zU2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f11707t.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f11707t.getMeasuredWidth() + iMax;
                    this.f11707t.layout(iMax, i313, measuredWidth7, this.f11707t.getMeasuredHeight() + i313);
                    i19 = measuredWidth7 + this.f11680H;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        } else {
            if (zU) {
                appCompatTextView = this.f11706s;
            } else {
                appCompatTextView = this.f11707t;
            }
            if (zU2) {
                appCompatTextView2 = this.f11707t;
            } else {
                appCompatTextView2 = this.f11706s;
            }
            e1Var = (e1) appCompatTextView.getLayoutParams();
            e1Var2 = (e1) appCompatTextView2.getLayoutParams();
            i14 = measuredHeight;
            if (zU) {
            }
            i15 = this.f11686N & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f11681I;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f11681I;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
                    i26 = this.f11682J;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin) - this.f11682J) - i14;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f11679G;
                } else {
                    i20 = 0;
                }
                int i314 = i20 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zU) {
                    e1 e1Var12 = (e1) this.f11706s.getLayoutParams();
                    int measuredWidth8 = iMin - this.f11706s.getMeasuredWidth();
                    int measuredHeight6 = this.f11706s.getMeasuredHeight() + paddingTop;
                    this.f11706s.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i21 = measuredWidth8 - this.f11680H;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) e1Var12).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zU2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f11707t.getLayoutParams())).topMargin;
                    this.f11707t.layout(iMin - this.f11707t.getMeasuredWidth(), i315, iMin, this.f11707t.getMeasuredHeight() + i315);
                    i22 = iMin - this.f11680H;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z11) {
                    i17 = this.f11679G;
                } else {
                    i17 = 0;
                }
                int i316 = i17 - iArr[0];
                iMax = Math.max(0, i316) + i16;
                iArr[0] = Math.max(0, -i316);
                if (zU) {
                    e1 e1Var13 = (e1) this.f11706s.getLayoutParams();
                    int measuredWidth9 = this.f11706s.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f11706s.getMeasuredHeight() + paddingTop;
                    this.f11706s.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i18 = measuredWidth9 + this.f11680H;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) e1Var13).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zU2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f11707t.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f11707t.getMeasuredWidth() + iMax;
                    this.f11707t.layout(iMax, i317, measuredWidth10, this.f11707t.getMeasuredHeight() + i317);
                    i19 = measuredWidth10 + this.f11680H;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        }
        arrayList = this.U;
        a(3, arrayList);
        size = arrayList.size();
        iQ2 = iMax;
        while (i27 < size) {
            iQ2 = q((View) arrayList.get(i27), iQ2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = r((View) arrayList.get(i28), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i44 = iArr[0];
        i29 = iArr[1];
        size3 = arrayList.size();
        i30 = i44;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = (View) arrayList.get(i31);
            e1 e1Var14 = (e1) view2.getLayoutParams();
            int i45 = i29;
            int i46 = ((ViewGroup.MarginLayoutParams) e1Var14).leftMargin - i30;
            int i47 = ((ViewGroup.MarginLayoutParams) e1Var14).rightMargin - i45;
            int iMax7 = Math.max(0, i46);
            int iMax8 = Math.max(0, i47);
            int iMax9 = Math.max(0, -i46);
            int iMax10 = Math.max(0, -i47);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i30 = iMax9;
            i29 = iMax10;
        }
        i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iQ2) {
            if (i34 > iMin) {
                iQ2 = i33 - (i34 - iMin);
            } else {
                iQ2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iQ2 = q((View) arrayList.get(i32), iQ2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        char c10;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z10 = q1.f20766a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c10 = 0;
        } else {
            c10 = 1;
            objArr = false;
        }
        if (u(this.f11708u)) {
            t(this.f11708u, i10, 0, i11, this.f11678F);
            iK = k(this.f11708u) + this.f11708u.getMeasuredWidth();
            iMax = Math.max(0, l(this.f11708u) + this.f11708u.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f11708u.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.f11712y)) {
            t(this.f11712y, i10, 0, i11, this.f11678F);
            iK = k(this.f11712y) + this.f11712y.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f11712y) + this.f11712y.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11712y.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f11690W;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (u(this.f11705r)) {
            t(this.f11705r, i10, iMax3, i11, this.f11678F);
            iK2 = k(this.f11705r) + this.f11705r.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f11705r) + this.f11705r.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11705r.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c10] = Math.max(0, currentContentInsetEnd - iK2);
        if (u(this.f11713z)) {
            iMax5 += s(this.f11713z, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f11713z) + this.f11713z.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11713z.getMeasuredState());
        }
        if (u(this.f11709v)) {
            iMax5 += s(this.f11709v, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f11709v) + this.f11709v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11709v.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((e1) childAt.getLayoutParams()).f20656b == 0 && u(childAt)) {
                iMax5 += s(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.f11681I + this.f11682J;
        int i16 = this.f11679G + this.f11680H;
        if (u(this.f11706s)) {
            s(this.f11706s, i10, i14 + i16, i11, i15, iArr);
            int iK3 = k(this.f11706s) + this.f11706s.getMeasuredWidth();
            iL = l(this.f11706s) + this.f11706s.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f11706s.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.f11707t)) {
            iMax2 = Math.max(iMax2, s(this.f11707t, i10, i14 + i16, i11, i15 + iL, iArr));
            iL += l(this.f11707t) + this.f11707t.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f11707t.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f11700j0) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g1 g1Var = (g1) parcelable;
        super.onRestoreInstanceState(g1Var.f6852r);
        ActionMenuView actionMenuView = this.f11705r;
        k kVar = actionMenuView != null ? actionMenuView.f11475G : null;
        int i10 = g1Var.f20660t;
        if (i10 != 0 && this.f11697g0 != null && kVar != null && (menuItemFindItem = kVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (g1Var.f20661u) {
            RunnableC0147v runnableC0147v = this.f11704n0;
            removeCallbacks(runnableC0147v);
            post(runnableC0147v);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        J0 j10 = this.f11683K;
        boolean z10 = i10 == 1;
        if (z10 == j10.g) {
            return;
        }
        j10.g = z10;
        if (!j10.f20568h) {
            j10.f20562a = j10.f20566e;
            j10.f20563b = j10.f20567f;
            return;
        }
        if (z10) {
            int i11 = j10.f20565d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = j10.f20566e;
            }
            j10.f20562a = i11;
            int i12 = j10.f20564c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = j10.f20567f;
            }
            j10.f20563b = i12;
            return;
        }
        int i13 = j10.f20564c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = j10.f20566e;
        }
        j10.f20562a = i13;
        int i14 = j10.f20565d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = j10.f20567f;
        }
        j10.f20563b = i14;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar;
        g1 g1Var = new g1(super.onSaveInstanceState());
        d1 d1Var = this.f11697g0;
        if (d1Var != null && (mVar = d1Var.f20653s) != null) {
            g1Var.f20660t = mVar.f20162a;
        }
        g1Var.f20661u = p();
        return g1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = false;
        }
        if (!this.S) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.S = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.S = false;
        return true;
    }

    public final boolean p() {
        C1250k c1250k;
        ActionMenuView actionMenuView = this.f11705r;
        return (actionMenuView == null || (c1250k = actionMenuView.f11479K) == null || !c1250k.g()) ? false : true;
    }

    public final int q(View view, int i10, int i11, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) e1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).rightMargin + iMax;
    }

    public final int r(View view, int i10, int i11, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) e1Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).leftMargin);
    }

    public final int s(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f11703m0 != z10) {
            this.f11703m0 = z10;
            w();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(Y2.a.E(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f11700j0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f11685M) {
            this.f11685M = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f11684L) {
            this.f11684L = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        d();
        J0 j10 = this.f11683K;
        j10.f20568h = false;
        if (i10 != Integer.MIN_VALUE) {
            j10.f20566e = i10;
            j10.f20562a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            j10.f20567f = i11;
            j10.f20563b = i11;
        }
    }

    public void setContentInsetsRelative(int i10, int i11) {
        d();
        this.f11683K.a(i10, i11);
    }

    public void setLogo(int i10) {
        setLogo(Y2.a.E(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setMenu(k kVar, C1250k c1250k) {
        if (kVar == null && this.f11705r == null) {
            return;
        }
        f();
        k kVar2 = this.f11705r.f11475G;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.r(this.f11696f0);
            kVar2.r(this.f11697g0);
        }
        if (this.f11697g0 == null) {
            this.f11697g0 = new d1(this);
        }
        c1250k.f20699I = true;
        if (kVar != null) {
            kVar.b(c1250k, this.f11673A);
            kVar.b(this.f11697g0, this.f11673A);
        } else {
            c1250k.i(this.f11673A, null);
            this.f11697g0.i(this.f11673A, null);
            c1250k.e(true);
            this.f11697g0.e(true);
        }
        this.f11705r.setPopupTheme(this.f11674B);
        this.f11705r.setPresenter(c1250k);
        this.f11696f0 = c1250k;
        w();
    }

    public void setMenuCallbacks(v vVar, i iVar) {
        this.f11698h0 = vVar;
        this.f11699i0 = iVar;
        ActionMenuView actionMenuView = this.f11705r;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(vVar, iVar);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(Y2.a.E(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f11708u.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f1 f1Var) {
        this.f11693c0 = f1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f11705r.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f11674B != i10) {
            this.f11674B = i10;
            if (i10 == 0) {
                this.f11673A = getContext();
            } else {
                this.f11673A = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextAppearance(Context context, int i10) {
        this.f11676D = i10;
        AppCompatTextView appCompatTextView = this.f11707t;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.f11679G = i10;
        this.f11681I = i11;
        this.f11680H = i12;
        this.f11682J = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.f11682J = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f11680H = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f11679G = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f11681I = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i10) {
        this.f11675C = i10;
        AppCompatTextView appCompatTextView = this.f11706s;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final void t(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        C1250k c1250k;
        ActionMenuView actionMenuView = this.f11705r;
        return (actionMenuView == null || (c1250k = actionMenuView.f11479K) == null || !c1250k.n()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = c1.a(this);
            d1 d1Var = this.f11697g0;
            boolean z10 = (d1Var == null || d1Var.f20653s == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f11703m0) ? false : true;
            if (z10 && this.f11702l0 == null) {
                if (this.f11701k0 == null) {
                    this.f11701k0 = c1.b(new b1(this, 0));
                }
                c1.c(onBackInvokedDispatcherA, this.f11701k0);
                this.f11702l0 = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f11702l0) == null) {
                return;
            }
            c1.d(onBackInvokedDispatcher, this.f11701k0);
            this.f11702l0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e1 e1Var = new e1(context, attributeSet);
        e1Var.f20655a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p073h.a.f16381b);
        e1Var.f20655a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        e1Var.f20656b = 0;
        return e1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f11712y;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f11712y.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f11712y;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f11710w);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f11709v == null) {
                this.f11709v = new AppCompatImageView(getContext());
            }
            if (!o(this.f11709v)) {
                b(this.f11709v, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f11709v;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f11709v);
                this.f11689V.remove(this.f11709v);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f11709v;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f11709v == null) {
            this.f11709v = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f11709v;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f11708u;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            g.r0(this.f11708u, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f11708u)) {
                b(this.f11708u, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f11708u;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f11708u);
                this.f11689V.remove(this.f11708u);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f11708u;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f11707t;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f11707t);
                this.f11689V.remove(this.f11707t);
            }
        } else {
            if (this.f11707t == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f11707t = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f11707t.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f11676D;
                if (i10 != 0) {
                    this.f11707t.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.R;
                if (colorStateList != null) {
                    this.f11707t.setTextColor(colorStateList);
                }
            }
            if (!o(this.f11707t)) {
                b(this.f11707t, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f11707t;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f11688P = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        AppCompatTextView appCompatTextView = this.f11707t;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f11706s;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f11706s);
                this.f11689V.remove(this.f11706s);
            }
        } else {
            if (this.f11706s == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f11706s = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f11706s.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f11675C;
                if (i10 != 0) {
                    this.f11706s.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.Q;
                if (colorStateList != null) {
                    this.f11706s.setTextColor(colorStateList);
                }
            }
            if (!o(this.f11706s)) {
                b(this.f11706s, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f11706s;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f11687O = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        AppCompatTextView appCompatTextView = this.f11706s;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11686N = 8388627;
        this.U = new ArrayList();
        this.f11689V = new ArrayList();
        this.f11690W = new int[2];
        this.f11691a0 = new r(new b1(this, 1));
        this.f11692b0 = new ArrayList();
        this.f11694d0 = new C1256n(1, this);
        this.f11704n0 = new RunnableC0147v(28, this);
        Context context2 = getContext();
        int[] iArr = p073h.a.f16376A;
        p074h0.i iVarB = p074h0.i.B(context2, attributeSet, iArr, i10);
        S.n(this, context, iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        this.f11675C = typedArray.getResourceId(28, 0);
        this.f11676D = typedArray.getResourceId(19, 0);
        this.f11686N = typedArray.getInteger(0, 8388627);
        this.f11677E = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f11682J = dimensionPixelOffset;
        this.f11681I = dimensionPixelOffset;
        this.f11680H = dimensionPixelOffset;
        this.f11679G = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f11679G = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f11680H = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f11681I = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f11682J = dimensionPixelOffset5;
        }
        this.f11678F = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        J0 j10 = this.f11683K;
        j10.f20568h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            j10.f20566e = dimensionPixelSize;
            j10.f20562a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            j10.f20567f = dimensionPixelSize2;
            j10.f20563b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            j10.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f11684L = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f11685M = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f11710w = iVarB.r(4);
        this.f11711x = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f11673A = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableR = iVarB.r(16);
        if (drawableR != null) {
            setNavigationIcon(drawableR);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableR2 = iVarB.r(11);
        if (drawableR2 != null) {
            setLogo(drawableR2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(iVarB.q(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(iVarB.q(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        iVarB.C();
    }
}
