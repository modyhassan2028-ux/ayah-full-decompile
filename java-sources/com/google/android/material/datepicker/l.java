package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class l implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f14896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f14897s;

    public l(n nVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f14897s = nVar;
        this.f14896r = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f14896r;
        k kVarA = materialCalendarGridView.a();
        if (i10 < kVarA.a() || i10 > kVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i10).longValue() >= ((MaterialCalendar) this.f14897s.f14901v.f10875s).f14823q0.f14864t.f14871r) {
            throw null;
        }
    }
}
