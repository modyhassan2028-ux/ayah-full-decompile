package X2;

import G.a0;
import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f9877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f9879f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9881i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f9883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f9884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9885n;

    @Override // X2.k
    public final boolean a() {
        return this.f9879f.i() || this.f9877d.i();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // X2.k
    public final boolean b(int[] iArr) {
        boolean z10;
        a0 a0Var = this.f9879f;
        boolean z11 = true;
        if (a0Var.i()) {
            ColorStateList colorStateList = (ColorStateList) a0Var.f2656d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != a0Var.f2654b) {
                a0Var.f2654b = colorForState;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        a0 a0Var2 = this.f9877d;
        if (a0Var2.i()) {
            ColorStateList colorStateList2 = (ColorStateList) a0Var2.f2656d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != a0Var2.f2654b) {
                a0Var2.f2654b = colorForState2;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.f9880h;
    }

    public int getFillColor() {
        return this.f9879f.f2654b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.f9877d.f2654b;
    }

    public float getStrokeWidth() {
        return this.f9878e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f9882k;
    }

    public float getTrimPathStart() {
        return this.f9881i;
    }

    public void setFillAlpha(float f3) {
        this.f9880h = f3;
    }

    public void setFillColor(int i10) {
        this.f9879f.f2654b = i10;
    }

    public void setStrokeAlpha(float f3) {
        this.g = f3;
    }

    public void setStrokeColor(int i10) {
        this.f9877d.f2654b = i10;
    }

    public void setStrokeWidth(float f3) {
        this.f9878e = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.j = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f9882k = f3;
    }

    public void setTrimPathStart(float f3) {
        this.f9881i = f3;
    }
}
