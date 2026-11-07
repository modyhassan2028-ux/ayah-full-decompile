package F7;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f2468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f2469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f2470f;
    public final /* synthetic */ float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Matrix f2471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f2472i;

    public o(u uVar, float f3, float f7, float f10, float f11, float f12, float f13, float f14, Matrix matrix) {
        this.f2472i = uVar;
        this.f2465a = f3;
        this.f2466b = f7;
        this.f2467c = f10;
        this.f2468d = f11;
        this.f2469e = f12;
        this.f2470f = f13;
        this.g = f14;
        this.f2471h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u uVar = this.f2472i;
        uVar.f2515v.setAlpha(p137n7.a.b(this.f2465a, this.f2466b, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = uVar.f2515v;
        float f3 = this.f2467c;
        float f7 = this.f2468d;
        floatingActionButton.setScaleX(p137n7.a.a(f3, f7, fFloatValue));
        uVar.f2515v.setScaleY(p137n7.a.a(this.f2469e, f7, fFloatValue));
        float f10 = this.f2470f;
        float f11 = this.g;
        uVar.f2509p = p137n7.a.a(f10, f11, fFloatValue);
        float fA = p137n7.a.a(f10, f11, fFloatValue);
        Matrix matrix = this.f2471h;
        uVar.a(fA, matrix);
        uVar.f2515v.setImageMatrix(matrix);
    }
}
