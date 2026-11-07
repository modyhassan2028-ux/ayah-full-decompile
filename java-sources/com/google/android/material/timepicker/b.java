package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f15374r;

    public b(ClockFaceView clockFaceView) {
        this.f15374r = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f15374r;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f15348K.f15365u) - clockFaceView.S;
        if (height != clockFaceView.f15377I) {
            clockFaceView.f15377I = height;
            clockFaceView.o();
            ClockHandView clockHandView = clockFaceView.f15348K;
            clockHandView.f15360C = clockFaceView.f15377I;
            clockHandView.invalidate();
        }
        return true;
    }
}
