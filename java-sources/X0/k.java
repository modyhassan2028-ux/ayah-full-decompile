package X0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9841b;

    public k(boolean z10, boolean z11) {
        this.f9840a = z10;
        this.f9841b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f9840a);
        textPaint.setStrikeThruText(this.f9841b);
    }
}
