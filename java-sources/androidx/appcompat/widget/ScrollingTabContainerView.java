package androidx.appcompat.widget;

import E2.C0149x;
import E6.k;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.SpinnerAdapter;
import com.ayah.R;
import p151p.C1268t0;
import p151p.K0;
import p151p.L0;
import p151p.RunnableC1244h;

/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RunnableC1244h f11583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearLayoutCompat f11584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AppCompatSpinner f11585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11590y;

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        new C0149x(4, this);
        setHorizontalScrollBarEnabled(false);
        k kVarB = k.b(context);
        setContentHeight(kVarB.d());
        this.f11588w = kVarB.f1940a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new C1268t0(-2, -1));
        this.f11584s = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        AppCompatSpinner appCompatSpinner = this.f11585t;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            return;
        }
        removeView(this.f11585t);
        addView(this.f11584s, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f11585t.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RunnableC1244h runnableC1244h = this.f11583r;
        if (runnableC1244h != null) {
            post(runnableC1244h);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k kVarB = k.b(getContext());
        setContentHeight(kVarB.d());
        this.f11588w = kVarB.f1940a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RunnableC1244h runnableC1244h = this.f11583r;
        if (runnableC1244h != null) {
            removeCallbacks(runnableC1244h);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
        ((L0) view).getClass();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        LinearLayoutCompat linearLayoutCompat = this.f11584s;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f11587v = -1;
        } else {
            if (childCount > 2) {
                this.f11587v = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f11587v = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f11587v = Math.min(this.f11587v, this.f11588w);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f11589x, 1073741824);
        if (z10 || !this.f11586u) {
            a();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                AppCompatSpinner appCompatSpinner = this.f11585t;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f11585t == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new C1268t0(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f11585t = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f11585t, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f11585t.getAdapter() == null) {
                        this.f11585t.setAdapter((SpinnerAdapter) new K0(this));
                    }
                    Runnable runnable = this.f11583r;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f11583r = null;
                    }
                    this.f11585t.setSelection(this.f11590y);
                }
            } else {
                a();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f11590y);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f11586u = z10;
    }

    public void setContentHeight(int i10) {
        this.f11589x = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f11590y = i10;
        LinearLayoutCompat linearLayoutCompat = this.f11584s;
        int childCount = linearLayoutCompat.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                View childAt2 = linearLayoutCompat.getChildAt(i10);
                Runnable runnable = this.f11583r;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                RunnableC1244h runnableC1244h = new RunnableC1244h(1, this, childAt2);
                this.f11583r = runnableC1244h;
                post(runnableC1244h);
            }
            i11++;
        }
        AppCompatSpinner appCompatSpinner = this.f11585t;
        if (appCompatSpinner == null || i10 < 0) {
            return;
        }
        appCompatSpinner.setSelection(i10);
    }
}
