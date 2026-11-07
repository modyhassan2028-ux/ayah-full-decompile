package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ayah.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f14872u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Calendar f14873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14875t;

    static {
        f14872u = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarC = q.c(null);
        this.f14873r = calendarC;
        this.f14874s = calendarC.getMaximum(7);
        this.f14875t = calendarC.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f14874s;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f14874s;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f14875t;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f14875t;
        int i12 = this.f14874s;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f14873r;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f14872u, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar calendarC = q.c(null);
        this.f14873r = calendarC;
        this.f14874s = calendarC.getMaximum(7);
        this.f14875t = i10;
    }
}
