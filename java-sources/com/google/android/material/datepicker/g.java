package com.google.android.material.datepicker;

import E2.B0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f14879E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f14880F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MaterialCalendar materialCalendar, int i10, int i11) {
        super(i10);
        this.f14880F = materialCalendar;
        this.f14879E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final void C0(RecyclerView recyclerView, B0 b5, int i10) {
        o oVar = new o(recyclerView.getContext(), 0);
        oVar.f1604a = i10;
        D0(oVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(B0 b5, int[] iArr) {
        int i10 = this.f14879E;
        MaterialCalendar materialCalendar = this.f14880F;
        if (i10 == 0) {
            iArr[0] = materialCalendar.f14828v0.getWidth();
            iArr[1] = materialCalendar.f14828v0.getWidth();
        } else {
            iArr[0] = materialCalendar.f14828v0.getHeight();
            iArr[1] = materialCalendar.f14828v0.getHeight();
        }
    }
}
