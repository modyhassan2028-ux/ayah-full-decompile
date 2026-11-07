package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ayah.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class k extends BaseAdapter {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f14891u = q.c(null).getMaximum(4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f14892v = (q.c(null).getMaximum(7) + q.c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f14893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f14894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f14895t;

    public k(j jVar, b bVar) {
        this.f14893r = jVar;
        this.f14895t = bVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f14895t.f14866v;
        j jVar = this.f14893r;
        Calendar calendar = jVar.f14884r;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + jVar.f14887u : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < a() || i10 > c()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarA = q.a(this.f14893r.f14884r);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f14893r.f14888v) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f14892v;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f14893r.f14887u;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f14894s == null) {
            this.f14894s = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i10 - a();
        if (iA >= 0) {
            j jVar = this.f14893r;
            if (iA >= jVar.f14888v) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(jVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i10) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        q.b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
