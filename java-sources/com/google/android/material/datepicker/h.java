package com.google.android.material.datepicker;

import E2.AbstractC0131k0;
import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0131k0 {
    @Override // E2.AbstractC0131k0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw null;
        }
    }
}
