package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.ayah.R;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H8.e f14869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H8.e f14870b;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(u0.A(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, p128m7.a.f19634B);
        H8.e.n(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        H8.e.n(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        H8.e.n(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        H8.e.n(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListW = va.g.w(context, typedArrayObtainStyledAttributes, 7);
        this.f14869a = H8.e.n(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        H8.e.n(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f14870b = H8.e.n(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListW.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
