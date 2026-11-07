package com.google.android.material.tabs;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f15262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout.TabView f15263b;

    public c(TabLayout.TabView tabView, View view) {
        this.f15263b = tabView;
        this.f15262a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f15262a;
        if (view2.getVisibility() == 0) {
            int i18 = TabLayout.TabView.f15244C;
            this.f15263b.c(view2);
        }
    }
}
