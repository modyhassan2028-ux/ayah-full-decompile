package M7;

import K0.AbstractC0332a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o extends l {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final n f5802C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AbstractC0332a f5803D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public X2.p f5804E;

    public o(Context context, d dVar, n nVar, AbstractC0332a abstractC0332a) {
        super(context, dVar);
        this.f5802C = nVar;
        this.f5803D = abstractC0332a;
        abstractC0332a.f5052a = this;
    }

    @Override // M7.l
    public final boolean d(boolean z10, boolean z11, boolean z12) {
        X2.p pVar;
        boolean zD = super.d(z10, z11, z12);
        if (this.f5790t != null && Settings.Global.getFloat(this.f5788r.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (pVar = this.f5804E) != null) {
            return pVar.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f5803D.c();
        }
        if (z10 && z12) {
            this.f5803D.r();
        }
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        X2.p pVar;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            a aVar = this.f5790t;
            d dVar = this.f5789s;
            if (aVar != null && Settings.Global.getFloat(this.f5788r.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (pVar = this.f5804E) != null) {
                pVar.setBounds(getBounds());
                this.f5804E.setTint(dVar.f5754c[0]);
                this.f5804E.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f5791u;
            boolean z10 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f5792v;
            boolean z11 = objectAnimator2 != null && objectAnimator2.isRunning();
            n nVar = this.f5802C;
            nVar.f5801a.a();
            nVar.a(canvas, bounds, fB, z10, z11);
            int i11 = dVar.g;
            int i12 = this.f5787A;
            Paint paint = this.f5796z;
            if (i11 == 0) {
                this.f5802C.d(canvas, paint, 0.0f, 1.0f, dVar.f5755d, i12, 0);
                i10 = i11;
            } else {
                m mVar = (m) ((ArrayList) this.f5803D.f5053b).get(0);
                m mVar2 = (m) p123m2.c.q(1, (ArrayList) this.f5803D.f5053b);
                n nVar2 = this.f5802C;
                if (nVar2 instanceof p) {
                    i10 = i11;
                    nVar2.d(canvas, paint, 0.0f, mVar.f5797a, dVar.f5755d, i12, i10);
                    this.f5802C.d(canvas, paint, mVar2.f5798b, 1.0f, dVar.f5755d, i12, i10);
                } else {
                    i10 = i11;
                    i12 = 0;
                    nVar2.d(canvas, paint, mVar2.f5798b, mVar.f5797a + 1.0f, dVar.f5755d, 0, i10);
                }
            }
            for (int i13 = 0; i13 < ((ArrayList) this.f5803D.f5053b).size(); i13++) {
                m mVar3 = (m) ((ArrayList) this.f5803D.f5053b).get(i13);
                this.f5802C.c(canvas, paint, mVar3, this.f5787A);
                if (i13 > 0 && i10 > 0) {
                    this.f5802C.d(canvas, paint, ((m) ((ArrayList) this.f5803D.f5053b).get(i13 - 1)).f5798b, mVar3.f5797a, dVar.f5755d, i12, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5802C.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5802C.f();
    }
}
