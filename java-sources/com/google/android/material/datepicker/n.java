package com.google.android.material.datepicker;

import E2.AbstractC0115c0;
import E2.C0137n0;
import E2.F0;
import Z0.B;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ayah.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0115c0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f14900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B f14901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14902w;

    public n(ContextThemeWrapper contextThemeWrapper, b bVar, B b5) {
        j jVar = bVar.f14862r;
        j jVar2 = bVar.f14863s;
        j jVar3 = bVar.f14865u;
        if (jVar.f14884r.compareTo(jVar3.f14884r) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (jVar3.f14884r.compareTo(jVar2.f14884r) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f14902w = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * k.f14891u) + (MaterialDatePicker.Y(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f14900u = bVar;
        this.f14901v = b5;
        i(true);
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f14900u.f14868x;
    }

    @Override // E2.AbstractC0115c0
    public final long b(int i10) {
        Calendar calendarA = q.a(this.f14900u.f14862r.f14884r);
        calendarA.add(2, i10);
        calendarA.set(5, 1);
        Calendar calendarA2 = q.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        m mVar = (m) f3;
        b bVar = this.f14900u;
        Calendar calendarA = q.a(bVar.f14862r.f14884r);
        calendarA.add(2, i10);
        j jVar = new j(calendarA);
        mVar.f14898u.setText(jVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) mVar.f14899v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !jVar.equals(materialCalendarGridView.a().f14893r)) {
            new k(jVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.Y(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new m(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0137n0(-1, this.f14902w));
        return new m(linearLayout, true);
    }
}
