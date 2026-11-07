package X7;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {
    @Override // R7.i
    public final void f(Canvas canvas) {
        if (this.f10008P.f10007s.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f10008P.f10007s);
        } else {
            canvas.clipRect(this.f10008P.f10007s, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}
