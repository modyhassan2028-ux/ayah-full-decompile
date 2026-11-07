package com.google.android.material.datepicker;

import I1.S;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f14833r;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        q.c(null);
        if (MaterialDatePicker.Y(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.ayah.R.id.cancel_button);
            setNextFocusRightId(com.ayah.R.id.confirm_button);
        }
        this.f14833r = MaterialDatePicker.Y(getContext(), com.ayah.R.attr.nestedScrollable);
        S.o(this, new N1.f(4));
    }

    public final k a() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((k) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        k kVar = (k) super.getAdapter();
        kVar.getClass();
        int iMax = Math.max(kVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(kVar.c(), getLastVisiblePosition());
        kVar.getItem(iMax);
        kVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            setSelection(((k) super.getAdapter()).c());
        } else if (i10 == 130) {
            setSelection(((k) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((k) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(((k) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f14833r) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < ((k) super.getAdapter()).a()) {
            super.setSelection(((k) super.getAdapter()).a());
        } else {
            super.setSelection(i10);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (k) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof k)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), k.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
