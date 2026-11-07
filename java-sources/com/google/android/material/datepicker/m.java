package com.google.android.material.datepicker;

import E2.F0;
import I1.D;
import I1.S;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ayah.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends F0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f14898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f14899v;

    public m(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f14898u = textView;
        WeakHashMap weakHashMap = S.f3689a;
        new D(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f14899v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z10) {
            return;
        }
        textView.setVisibility(8);
    }
}
