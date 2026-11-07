package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class H extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Looper looper, int i10) {
        super(looper);
        switch (i10) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
