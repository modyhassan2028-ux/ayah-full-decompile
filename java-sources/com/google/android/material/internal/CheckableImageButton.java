package com.google.android.material.internal;

import H7.C0228b;
import H7.C0229c;
import I1.S;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f14965x = {R.attr.state_checked};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14968w;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14966u;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f14966u ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f14965x) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0229c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0229c c0229c = (C0229c) parcelable;
        super.onRestoreInstanceState(c0229c.f6852r);
        setChecked(c0229c.f3470t);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0229c c0229c = new C0229c(super.onSaveInstanceState());
        c0229c.f3470t = this.f14966u;
        return c0229c;
    }

    public void setCheckable(boolean z10) {
        if (this.f14967v != z10) {
            this.f14967v = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f14967v || this.f14966u == z10) {
            return;
        }
        this.f14966u = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f14968w = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f14968w) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f14966u);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14967v = true;
        this.f14968w = true;
        S.o(this, new C0228b(0, this));
    }
}
