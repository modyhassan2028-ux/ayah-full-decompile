package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f14877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f14878t;

    public /* synthetic */ f(MaterialCalendar materialCalendar, n nVar, int i10) {
        this.f14876r = i10;
        this.f14878t = materialCalendar;
        this.f14877s = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14876r) {
            case 0:
                MaterialCalendar materialCalendar = this.f14878t;
                int iQ0 = ((LinearLayoutManager) materialCalendar.f14828v0.getLayoutManager()).Q0() - 1;
                if (iQ0 >= 0) {
                    Calendar calendarA = q.a(this.f14877s.f14900u.f14862r.f14884r);
                    calendarA.add(2, iQ0);
                    materialCalendar.S(new j(calendarA));
                }
                break;
            default:
                MaterialCalendar materialCalendar2 = this.f14878t;
                int iP0 = ((LinearLayoutManager) materialCalendar2.f14828v0.getLayoutManager()).P0() + 1;
                if (iP0 < materialCalendar2.f14828v0.getAdapter().a()) {
                    Calendar calendarA2 = q.a(this.f14877s.f14900u.f14862r.f14884r);
                    calendarA2.add(2, iP0);
                    materialCalendar2.S(new j(calendarA2));
                }
                break;
        }
    }
}
