package com.google.android.material.datepicker;

import E2.r0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class i extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f14881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f14882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f14883c;

    public i(MaterialCalendar materialCalendar, n nVar, MaterialButton materialButton) {
        this.f14883c = materialCalendar;
        this.f14881a = nVar;
        this.f14882b = materialButton;
    }

    @Override // E2.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f14882b.getText());
        }
    }

    @Override // E2.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b bVar = this.f14881a.f14900u;
        MaterialCalendar materialCalendar = this.f14883c;
        int iP0 = i10 < 0 ? ((LinearLayoutManager) materialCalendar.f14828v0.getLayoutManager()).P0() : ((LinearLayoutManager) materialCalendar.f14828v0.getLayoutManager()).Q0();
        Calendar calendarA = q.a(bVar.f14862r.f14884r);
        calendarA.add(2, iP0);
        materialCalendar.f14824r0 = new j(calendarA);
        Calendar calendarA2 = q.a(bVar.f14862r.f14884r);
        calendarA2.add(2, iP0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = q.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        this.f14882b.setText(K1.h(calendarA3.getTimeInMillis()));
    }
}
