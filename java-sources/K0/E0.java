package K0;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E0 f4923a = new E0();

    public final boolean a(MotionEvent motionEvent, int i10) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i10)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i10)) & Integer.MAX_VALUE) < 2139095040;
    }
}
