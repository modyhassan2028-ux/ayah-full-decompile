package X0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9839d;

    public j(float f3, float f7, float f10, int i10) {
        this.f9836a = i10;
        this.f9837b = f3;
        this.f9838c = f7;
        this.f9839d = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f9839d, this.f9837b, this.f9838c, this.f9836a);
    }
}
