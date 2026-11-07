package com.google.android.material.datepicker;

import E2.Q;
import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14903q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Context context, int i10) {
        super(context);
        this.f14903q = i10;
    }

    @Override // E2.Q
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f14903q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // E2.Q
    public int g() {
        switch (this.f14903q) {
            case 1:
                return -1;
            default:
                return super.g();
        }
    }
}
