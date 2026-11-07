package com.google.android.material.datepicker;

import E2.AbstractC0115c0;
import E2.F0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ayah.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0115c0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MaterialCalendar f14906u;

    public s(MaterialCalendar materialCalendar) {
        this.f14906u = materialCalendar;
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f14906u.f14823q0.f14867w;
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        MaterialCalendar materialCalendar = this.f14906u;
        int i11 = materialCalendar.f14823q0.f14862r.f14886t + i10;
        TextView textView = ((r) f3).f14905u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        Context context = textView.getContext();
        textView.setContentDescription(q.b().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        c cVar = materialCalendar.f14826t0;
        if (q.b().get(1) == i11) {
            H8.e eVar = cVar.f14870b;
        } else {
            H8.e eVar2 = cVar.f14869a;
        }
        throw null;
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        return new r((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
