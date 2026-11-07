package p180s0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: s0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1293b {
    public static void a(Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static final long b(AndroidComposeView androidComposeView) {
        return androidComposeView.getUniqueDrawingId();
    }

    public static void c(Paint paint, int i10) {
        paint.setBlendMode(d(i10));
    }

    public static final BlendMode d(int i10) {
        if (i10 == 0) {
            return BlendMode.CLEAR;
        }
        if (i10 == 1) {
            return BlendMode.SRC;
        }
        if (i10 == 2) {
            return BlendMode.DST;
        }
        if (i10 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i10 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i10 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i10 == 6) {
            return BlendMode.DST_IN;
        }
        if (i10 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i10 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i10 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i10 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i10 == 11) {
            return BlendMode.XOR;
        }
        if (i10 == 12) {
            return BlendMode.PLUS;
        }
        if (i10 == 13) {
            return BlendMode.MODULATE;
        }
        if (i10 == 14) {
            return BlendMode.SCREEN;
        }
        if (i10 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i10 == 16) {
            return BlendMode.DARKEN;
        }
        if (i10 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i10 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i10 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i10 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i10 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i10 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i10 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i10 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i10 == 25) {
            return BlendMode.HUE;
        }
        if (i10 == 26) {
            return BlendMode.SATURATION;
        }
        if (i10 == 27) {
            return BlendMode.COLOR;
        }
        return i10 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode e(int i10) {
        if (i10 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i10 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i10 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i10 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i10 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i10 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i10 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i10 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i10 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i10 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i10 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i10 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i10 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
