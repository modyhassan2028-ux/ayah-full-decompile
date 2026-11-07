package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ayah.R;
import p151p.C;
import p151p.Y0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C f11533r;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C c10 = this.f11533r;
        AppCompatSeekBar appCompatSeekBar = c10.f20533e;
        Drawable drawable = c10.f20534f;
        if (drawable != null && drawable.isStateful() && drawable.setState(appCompatSeekBar.getDrawableState())) {
            appCompatSeekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11533r.f20534f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11533r.g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Y0.a(this, getContext());
        C c10 = new C(this);
        this.f11533r = c10;
        c10.b(attributeSet, i10);
    }
}
