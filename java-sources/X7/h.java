package X7;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends R7.i {
    public static final /* synthetic */ int Q = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public f f10008P;

    @Override // R7.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f10008P = new f(this.f10008P);
        return this;
    }

    public final void w(float f3, float f7, float f10, float f11) {
        RectF rectF = this.f10008P.f10007s;
        if (f3 == rectF.left && f7 == rectF.top && f10 == rectF.right && f11 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f7, f10, f11);
        invalidateSelf();
    }
}
