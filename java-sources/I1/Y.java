package I1;

import H7.C0232f;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3706b;

    public /* synthetic */ Y(int i10, Object obj) {
        this.f3705a = i10;
        this.f3706b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3705a) {
            case 0:
                ((View) ((p084i.J) ((X4.c) this.f3706b).f9953r).f16532h.getParent()).invalidate();
                break;
            case 1:
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) this.f3706b;
                clippableRoundedCornerLayout.a(clippableRoundedCornerLayout.getLeft(), clippableRoundedCornerLayout.getTop(), clippableRoundedCornerLayout.getRight(), clippableRoundedCornerLayout.getBottom(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((DrawerLayout) this.f3706b).setScrimColor(A1.a.e(-1728053248, p137n7.a.c(K7.a.f5282a, valueAnimator.getAnimatedFraction(), 0)));
                break;
            case 3:
                p102k.f fVar = (p102k.f) this.f3706b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fVar.f18890i != fFloatValue) {
                    fVar.f18890i = fFloatValue;
                    fVar.invalidateSelf();
                }
                break;
            case 4:
                ((C0232f) this.f3706b).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                X7.j jVar = (X7.j) this.f3706b;
                jVar.getClass();
                jVar.f10049d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                p212v7.c cVar = (p212v7.c) this.f3706b;
                cVar.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.j.setAlpha((int) (255.0f * fFloatValue2));
                cVar.f23369x = fFloatValue2;
                break;
        }
    }

    public /* synthetic */ Y(X4.c cVar, View view) {
        this.f3705a = 0;
        this.f3706b = cVar;
    }
}
