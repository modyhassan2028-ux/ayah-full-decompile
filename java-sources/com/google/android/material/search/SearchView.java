package com.google.android.material.search;

import H7.C0232f;
import H7.H;
import I1.B0;
import I1.I;
import I1.S;
import J7.b;
import J7.d;
import J7.h;
import P7.c;
import P7.e;
import P7.g;
import P7.i;
import P7.j;
import P7.n;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.r;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p020c.C0776a;
import p102k.f;
import p151p.f1;
import p185s8.u0;
import u1.a;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends FrameLayout implements a, b {
    public static final /* synthetic */ int U = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final EditText f15132A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ImageButton f15133B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f15134C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final TouchObserverFrameLayout f15135D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f15136E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final n f15137F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final r f15138G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f15139H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final D7.a f15140I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final LinkedHashSet f15141J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SearchBar f15142K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15143L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f15144M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f15145N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f15146O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f15147P;
    public boolean Q;
    public boolean R;
    public j S;
    public HashMap T;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f15148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f15149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f15150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f15151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FrameLayout f15152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FrameLayout f15153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MaterialToolbar f15154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Toolbar f15155y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f15156z;

    public static class Behavior extends u1.b {
        public Behavior() {
        }

        @Override // u1.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.f15142K != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void e(SearchView searchView, B0 b5) {
        int iD = b5.d();
        searchView.setUpStatusBarSpacer(iD);
        if (searchView.R) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(iD > 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    private Window getActivityWindow() {
        Activity activity;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return null;
                }
                return activity.getWindow();
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f15142K;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f15151u.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f3) {
        View view;
        D7.a aVar = this.f15140I;
        if (aVar == null || (view = this.f15150t) == null) {
            return;
        }
        view.setBackgroundColor(aVar.a(this.f15147P, f3));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.f15152v;
            frameLayout.addView(layoutInflaterFrom.inflate(i10, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        View view = this.f15151u;
        if (view.getLayoutParams().height != i10) {
            view.getLayoutParams().height = i10;
            view.requestLayout();
        }
    }

    @Override // J7.b
    public final void a() {
        if (h()) {
            return;
        }
        n nVar = this.f15137F;
        h hVar = nVar.f6760m;
        C0776a c0776a = hVar.f4371f;
        hVar.f4371f = null;
        if (Build.VERSION.SDK_INT >= 34 && this.f15142K != null && c0776a != null) {
            nVar.d();
        } else {
            if (this.S.equals(j.f6738s) || this.S.equals(j.f6737r)) {
                return;
            }
            nVar.l();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f15136E) {
            this.f15135D.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // J7.b
    public final void b(C0776a c0776a) {
        if (h() || this.f15142K == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f15137F.m(c0776a);
    }

    @Override // J7.b
    public final void c(C0776a c0776a) {
        if (h() || this.f15142K == null) {
            return;
        }
        n nVar = this.f15137F;
        h hVar = nVar.f6760m;
        SearchBar searchBar = nVar.f6762o;
        hVar.f4371f = c0776a;
        float f3 = c0776a.f13366b;
        View view = hVar.f4367b;
        hVar.j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar != null) {
            hVar.f4380k = H.b(view, searchBar);
        }
        hVar.f4379i = f3;
    }

    @Override // J7.b
    public final void d() {
        if (h() || this.f15142K == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f15137F.c();
    }

    public final void f() {
        this.f15132A.post(new c(this, 2));
    }

    public final boolean g() {
        return this.f15143L == 48;
    }

    public h getBackHelper() {
        return this.f15137F.f6760m;
    }

    @Override // u1.a
    public u1.b getBehavior() {
        return new Behavior();
    }

    public j getCurrentTransitionState() {
        return this.S;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.f15132A;
    }

    public CharSequence getHint() {
        return this.f15132A.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f15156z;
    }

    public CharSequence getSearchPrefixText() {
        return this.f15156z.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f15143L;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f15132A.getText();
    }

    public Toolbar getToolbar() {
        return this.f15154x;
    }

    public final boolean h() {
        return this.S.equals(j.f6738s) || this.S.equals(j.f6737r);
    }

    public final void i() {
        if (this.f15146O) {
            this.f15132A.postDelayed(new c(this, 0), 100L);
        }
    }

    public final void j(j jVar, boolean z10) {
        if (this.S.equals(jVar)) {
            return;
        }
        if (z10) {
            if (jVar == j.f6740u) {
                setModalForAccessibility(true);
            } else if (jVar == j.f6738s) {
                setModalForAccessibility(false);
            }
        }
        this.S = jVar;
        Iterator it = new LinkedHashSet(this.f15141J).iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
        m(jVar);
    }

    public final void k() {
        if (this.S.equals(j.f6740u)) {
            return;
        }
        j jVar = this.S;
        j jVar2 = j.f6739t;
        if (jVar.equals(jVar2)) {
            return;
        }
        final n nVar = this.f15137F;
        SearchView searchView = nVar.f6750a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = nVar.f6752c;
        if (nVar.f6762o == null) {
            if (searchView.g()) {
                searchView.postDelayed(new c(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            final int i10 = 1;
            clippableRoundedCornerLayout.post(new Runnable() { // from class: P7.l
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            n nVar2 = nVar;
                            AnimatorSet animatorSetF = nVar2.f(true);
                            animatorSetF.addListener(new m(nVar2, 0));
                            animatorSetF.start();
                            break;
                        default:
                            n nVar3 = nVar;
                            ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = nVar3.f6752c;
                            clippableRoundedCornerLayout2.setTranslationY(clippableRoundedCornerLayout2.getHeight());
                            AnimatorSet animatorSetJ = nVar3.j(true);
                            animatorSetJ.addListener(new m(nVar3, 2));
                            animatorSetJ.start();
                            break;
                    }
                }
            });
            return;
        }
        EditText editText = nVar.f6757i;
        if (searchView.g()) {
            searchView.i();
        }
        searchView.setTransitionState(jVar2);
        Toolbar toolbar = nVar.g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (nVar.f6762o.getMenuResId() == -1 || !searchView.f15145N) {
            toolbar.setVisibility(8);
        } else {
            toolbar.m(nVar.f6762o.getMenuResId());
            ActionMenuView actionMenuViewH = H.h(toolbar);
            if (actionMenuViewH != null) {
                for (int i11 = 0; i11 < actionMenuViewH.getChildCount(); i11++) {
                    View childAt = actionMenuViewH.getChildAt(i11);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(nVar.f6762o.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        final int i12 = 0;
        clippableRoundedCornerLayout.post(new Runnable() { // from class: P7.l
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        n nVar2 = nVar;
                        AnimatorSet animatorSetF = nVar2.f(true);
                        animatorSetF.addListener(new m(nVar2, 0));
                        animatorSetF.start();
                        break;
                    default:
                        n nVar3 = nVar;
                        ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = nVar3.f6752c;
                        clippableRoundedCornerLayout2.setTranslationY(clippableRoundedCornerLayout2.getHeight());
                        AnimatorSet animatorSetJ = nVar3.j(true);
                        animatorSetJ.addListener(new m(nVar3, 2));
                        animatorSetJ.start();
                        break;
                }
            }
        });
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f15149s.getId()) != null) {
                    l((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.T.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap weakHashMap = S.f3689a;
                    childAt.setImportantForAccessibility(4);
                } else {
                    HashMap map = this.T;
                    if (map != null && map.containsKey(childAt)) {
                        int iIntValue = ((Integer) this.T.get(childAt)).intValue();
                        WeakHashMap weakHashMap2 = S.f3689a;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
        }
    }

    public final void m(j jVar) {
        d dVar;
        if (this.f15142K == null || !this.f15139H) {
            return;
        }
        boolean zEquals = jVar.equals(j.f6740u);
        r rVar = this.f15138G;
        if (zEquals) {
            rVar.O(false);
        } else {
            if (!jVar.equals(j.f6738s) || (dVar = (d) rVar.f11364s) == null) {
                return;
            }
            dVar.c((View) rVar.f11366u);
        }
    }

    public final void n() {
        ImageButton imageButtonJ = H.j(this.f15154x);
        if (imageButtonJ == null) {
            return;
        }
        int i10 = this.f15149s.getVisibility() == 0 ? 1 : 0;
        Drawable drawableN = B1.N(imageButtonJ.getDrawable());
        if (drawableN instanceof f) {
            f fVar = (f) drawableN;
            float f3 = i10;
            if (fVar.f18890i != f3) {
                fVar.f18890i = f3;
                fVar.invalidateSelf();
            }
        }
        if (drawableN instanceof C0232f) {
            ((C0232f) drawableN).a(i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.D(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f15143L = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f6852r);
        setText(iVar.f6735t);
        setVisible(iVar.f6736u == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        Editable text = getText();
        iVar.f6735t = text == null ? null : text.toString();
        iVar.f6736u = this.f15149s.getVisibility();
        return iVar;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f15144M = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f15146O = z10;
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        setUpBackgroundViewElevationOverlay(f3);
    }

    public void setHint(CharSequence charSequence) {
        this.f15132A.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f15145N = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.T = new HashMap(viewGroup.getChildCount());
        }
        l(viewGroup, z10);
        if (z10) {
            return;
        }
        this.T = null;
    }

    public void setOnMenuItemClickListener(f1 f1Var) {
        this.f15154x.setOnMenuItemClickListener(f1Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.f15156z;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.R = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f15132A.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f15154x.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(j jVar) {
        j(jVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.Q = z10;
    }

    public void setVisible(boolean z10) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f15149s;
        boolean z11 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z10 ? 0 : 8);
        n();
        j(z10 ? j.f6740u : j.f6738s, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f15142K = searchBar;
        this.f15137F.f6762o = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new e(this, 0));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new c(this, 1));
                    this.f15132A.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.f15154x;
        if (materialToolbar != null && !(B1.N(materialToolbar.getNavigationIcon()) instanceof f)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.f15142K == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableMutate = Y2.a.E(getContext(), defaultNavigationIconResource).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    drawableMutate.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                materialToolbar.setNavigationIcon(new C0232f(this.f15142K.getNavigationIcon(), drawableMutate));
                n();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        m(getCurrentTransitionState());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(int i10) {
        this.f15132A.setHint(i10);
    }

    public void setText(int i10) {
        this.f15132A.setText(i10);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_Material3_SearchView), attributeSet, i10);
        this.f15138G = new r(this, this);
        this.f15141J = new LinkedHashSet();
        this.f15143L = 16;
        this.S = j.f6738s;
        Context context2 = getContext();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19649V, i10, R.style.Widget_Material3_SearchView, new int[0]);
        this.f15147P = typedArrayM.getColor(11, 0);
        int resourceId = typedArrayM.getResourceId(16, -1);
        int resourceId2 = typedArrayM.getResourceId(0, -1);
        String string = typedArrayM.getString(3);
        String string2 = typedArrayM.getString(4);
        String string3 = typedArrayM.getString(24);
        boolean z10 = typedArrayM.getBoolean(27, false);
        this.f15144M = typedArrayM.getBoolean(8, true);
        this.f15145N = typedArrayM.getBoolean(7, true);
        boolean z11 = typedArrayM.getBoolean(17, false);
        this.f15146O = typedArrayM.getBoolean(9, true);
        this.f15139H = typedArrayM.getBoolean(10, true);
        typedArrayM.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.f15136E = true;
        this.f15148r = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.f15149s = clippableRoundedCornerLayout;
        this.f15150t = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.f15151u = viewFindViewById;
        this.f15152v = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.f15153w = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.f15154x = materialToolbar;
        this.f15155y = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.f15156z = (TextView) findViewById(R.id.open_search_view_search_prefix);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.f15132A = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.f15133B = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.f15134C = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.f15135D = touchObserverFrameLayout;
        this.f15137F = new n(this);
        this.f15140I = new D7.a(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new P7.f());
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z11) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new e(this, 1));
            if (z10) {
                f fVar = new f(getContext());
                int iB = Y2.a.B(R.attr.colorOnSurface, this);
                Paint paint = fVar.f18883a;
                if (iB != paint.getColor()) {
                    paint.setColor(iB);
                    fVar.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(fVar);
            }
        }
        imageButton.setOnClickListener(new e(this, 2));
        editText.addTextChangedListener(new P7.h(this, 0));
        touchObserverFrameLayout.setOnTouchListener(new g(0, this));
        H.f(materialToolbar, new P7.d(this));
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i11 = marginLayoutParams.leftMargin;
        final int i12 = marginLayoutParams.rightMargin;
        I1.r rVar = new I1.r() { // from class: P7.b
            @Override // I1.r
            public final B0 p(View view, B0 b5) {
                int i13 = SearchView.U;
                int iB2 = b5.b() + i11;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = iB2;
                marginLayoutParams2.rightMargin = b5.c() + i12;
                return b5;
            }
        };
        WeakHashMap weakHashMap = S.f3689a;
        I.m(viewFindViewById2, rVar);
        setUpStatusBarSpacer(getStatusBarHeight());
        I.m(viewFindViewById, new P7.d(this));
    }
}
