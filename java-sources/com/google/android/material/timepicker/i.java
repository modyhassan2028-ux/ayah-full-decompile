package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f15381r;

    public i(GestureDetector gestureDetector) {
        this.f15381r = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f15381r.onTouchEvent(motionEvent);
        }
        return false;
    }
}
