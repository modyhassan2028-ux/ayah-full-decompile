package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14996r;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final void a(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f14996r = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f14996r;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        a(i10, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14996r = getVisibility();
    }
}
