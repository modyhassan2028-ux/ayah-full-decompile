package X7;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends R7.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f10007s;

    public f(R7.o oVar, RectF rectF) {
        super(oVar);
        this.f10007s = rectF;
    }

    @Override // R7.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f10008P = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f10007s = fVar.f10007s;
    }
}
