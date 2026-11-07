package V0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static boolean a(Canvas canvas, float f3, float f7, float f10, float f11) {
        return canvas.quickReject(f3, f7, f10, f11);
    }

    public static boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
