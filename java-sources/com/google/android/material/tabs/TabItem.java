package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f15199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Drawable f15200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15201t;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i iVarA = i.A(context, attributeSet, p128m7.a.f19659c0);
        TypedArray typedArray = (TypedArray) iVarA.f16423t;
        this.f15199r = typedArray.getText(2);
        this.f15200s = iVarA.r(0);
        this.f15201t = typedArray.getResourceId(1, 0);
        iVarA.C();
    }
}
