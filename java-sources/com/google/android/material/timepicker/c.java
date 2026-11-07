package com.google.android.material.timepicker;

import I1.C0243b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0243b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f15375d;

    public c(ClockFaceView clockFaceView) {
        this.f15375d = clockFaceView;
    }

    @Override // I1.C0243b
    public final void d(View view, J1.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4219a;
        this.f3710a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f15375d.f15352O.get(iIntValue - 1));
        }
        gVar.o(J1.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(J1.d.g);
    }

    @Override // I1.C0243b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f15375d;
        view.getHitRect(clockFaceView.f15349L);
        float fCenterX = clockFaceView.f15349L.centerX();
        float fCenterY = clockFaceView.f15349L.centerY();
        clockFaceView.f15348K.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f15348K.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
