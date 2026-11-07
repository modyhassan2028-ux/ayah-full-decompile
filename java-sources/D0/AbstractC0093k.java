package D0;

import android.view.MotionEvent;

/* JADX INFO: renamed from: D0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0093k {
    public static long a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i10))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
