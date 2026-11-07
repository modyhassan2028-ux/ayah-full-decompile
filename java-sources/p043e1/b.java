package p043e1;

import W.C0557f1;
import Z.C;
import Z.C0672b;
import Z.C0681f0;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p171r0.i;
import p180s0.H;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final H f15750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f15751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0681f0 f15752t = C0672b.r(new i(9205357640488583168L));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C f15753u = C0672b.o(new C0557f1(11, this));

    public b(H h7, float f3) {
        this.f15750r = h7;
        this.f15751s = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        p022c1.i.b(textPaint, this.f15751s);
        textPaint.setShader((Shader) this.f15753u.getValue());
    }
}
