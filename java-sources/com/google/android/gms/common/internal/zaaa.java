package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    public static final int a(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException(c.r(i10, "Unknown color scheme: "));
    }
}
