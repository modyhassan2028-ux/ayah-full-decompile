package com.google.android.material.datepicker;

import E2.Y;
import H7.C0228b;
import H7.ViewOnClickListenerC0238l;
import I1.S;
import Z0.B;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f14822p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public b f14823q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public j f14824r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f14825s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f14826t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public RecyclerView f14827u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public RecyclerView f14828v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public View f14829w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View f14830x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public View f14831y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public View f14832z0;

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(l(), this.f14822p0);
        this.f14826t0 = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        j jVar = this.f14823q0.f14862r;
        if (MaterialDatePicker.Y(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.ayah.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.ayah.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = M().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.ayah.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.ayah.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.ayah.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.ayah.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = k.f14891u;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.ayah.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.ayah.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.ayah.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.ayah.R.id.mtrl_calendar_days_of_week);
        S.o(gridView, new N1.f(2));
        int i13 = this.f14823q0.f14866v;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new e(i13) : new e()));
        gridView.setNumColumns(jVar.f14887u);
        gridView.setEnabled(false);
        this.f14828v0 = (RecyclerView) viewInflate.findViewById(com.ayah.R.id.mtrl_calendar_months);
        this.f14828v0.setLayoutManager(new g(this, i11, i11));
        this.f14828v0.setTag("MONTHS_VIEW_GROUP_TAG");
        n nVar = new n(contextThemeWrapper, this.f14823q0, new B(5, this));
        this.f14828v0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.ayah.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.ayah.R.id.mtrl_calendar_year_selector_frame);
        this.f14827u0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f14827u0.setLayoutManager(new GridLayoutManager(integer));
            this.f14827u0.setAdapter(new s(this));
            RecyclerView recyclerView2 = this.f14827u0;
            h hVar = new h();
            q.c(null);
            q.c(null);
            recyclerView2.i(hVar);
        }
        if (viewInflate.findViewById(com.ayah.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.ayah.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            S.o(materialButton, new C0228b(3, this));
            View viewFindViewById = viewInflate.findViewById(com.ayah.R.id.month_navigation_previous);
            this.f14829w0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.ayah.R.id.month_navigation_next);
            this.f14830x0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f14831y0 = viewInflate.findViewById(com.ayah.R.id.mtrl_calendar_year_selector_frame);
            this.f14832z0 = viewInflate.findViewById(com.ayah.R.id.mtrl_calendar_day_selector_frame);
            T(1);
            materialButton.setText(this.f14824r0.c());
            this.f14828v0.j(new i(this, nVar, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0238l(2, this));
            this.f14830x0.setOnClickListener(new f(this, nVar, 1));
            this.f14829w0.setOnClickListener(new f(this, nVar, 0));
        }
        if (!MaterialDatePicker.Y(contextThemeWrapper, R.attr.windowFullscreen)) {
            new Y().a(this.f14828v0);
        }
        this.f14828v0.l0(nVar.f14900u.f14862r.d(this.f14824r0));
        S.o(this.f14828v0, new N1.f(3));
        return viewInflate;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f14822p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14823q0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f14824r0);
    }

    public final void S(j jVar) {
        n nVar = (n) this.f14828v0.getAdapter();
        int iD = nVar.f14900u.f14862r.d(jVar);
        int iD2 = iD - nVar.f14900u.f14862r.d(this.f14824r0);
        boolean z10 = Math.abs(iD2) > 3;
        boolean z11 = iD2 > 0;
        this.f14824r0 = jVar;
        if (z10 && z11) {
            this.f14828v0.l0(iD - 3);
            this.f14828v0.post(new F1.a(iD, 6, this));
        } else if (!z10) {
            this.f14828v0.post(new F1.a(iD, 6, this));
        } else {
            this.f14828v0.l0(iD + 3);
            this.f14828v0.post(new F1.a(iD, 6, this));
        }
    }

    public final void T(int i10) {
        this.f14825s0 = i10;
        if (i10 == 2) {
            this.f14827u0.getLayoutManager().s0(this.f14824r0.f14886t - ((s) this.f14827u0.getAdapter()).f14906u.f14823q0.f14862r.f14886t);
            this.f14831y0.setVisibility(0);
            this.f14832z0.setVisibility(8);
            this.f14829w0.setVisibility(8);
            this.f14830x0.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f14831y0.setVisibility(8);
            this.f14832z0.setVisibility(0);
            this.f14829w0.setVisibility(0);
            this.f14830x0.setVisibility(0);
            S(this.f14824r0);
        }
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.f16166w;
        }
        this.f14822p0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f14823q0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f14824r0 = (j) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
