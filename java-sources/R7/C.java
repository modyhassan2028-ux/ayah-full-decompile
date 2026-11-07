package R7;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class C extends A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7285f = false;
    public float g = 0.0f;

    public C(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new B(0, this));
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    @Override // R7.A
    public final void a(FrameLayout frameLayout) {
        boolean z10;
        boolean z11;
        o oVar;
        o oVar2;
        RectF rectF;
        o oVar3 = this.f7280c;
        this.g = (oVar3 == null || (rectF = this.f7281d) == null) ? 0.0f : oVar3.f7353f.a(rectF);
        if (!((this.f7281d.isEmpty() || (oVar2 = this.f7280c) == null) ? false : oVar2.f(this.f7281d))) {
            if (this.f7281d.isEmpty() || (oVar = this.f7280c) == null || !this.f7279b || oVar.f(this.f7281d)) {
                z11 = false;
            } else {
                o oVar4 = this.f7280c;
                if ((oVar4.f7348a instanceof l) && (oVar4.f7349b instanceof l) && (oVar4.f7351d instanceof l) && (oVar4.f7350c instanceof l)) {
                    float fA = oVar4.f7352e.a(this.f7281d);
                    float fA2 = this.f7280c.f7353f.a(this.f7281d);
                    float fA3 = this.f7280c.f7354h.a(this.f7281d);
                    float fA4 = this.f7280c.g.a(this.f7281d);
                    if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                        RectF rectF2 = this.f7281d;
                        rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                        this.g = fA2;
                    } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                        RectF rectF3 = this.f7281d;
                        rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                        this.g = fA3;
                    } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                        RectF rectF4 = this.f7281d;
                        rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                        this.g = fA;
                    } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                        RectF rectF5 = this.f7281d;
                        rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                        this.g = fA;
                    } else {
                        z11 = false;
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            z10 = z11;
        }
        this.f7285f = z10;
        frameLayout.setClipToOutline(!b());
        if (b()) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // R7.A
    public final boolean b() {
        return !this.f7285f || this.f7278a;
    }
}
