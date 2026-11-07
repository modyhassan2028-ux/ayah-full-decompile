package D0;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import com.google.android.gms.internal.measurement.J1;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0083a f1129a = new C0083a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0083a f1130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f1131c;

    static {
        new C0083a(1007);
        new C0083a(1008);
        f1130b = new C0083a(1002);
        f1131c = new StackTraceElement[0];
    }

    public static final boolean a(v vVar) {
        return !vVar.f1138h && vVar.f1135d;
    }

    public static final boolean b(v vVar) {
        return (vVar.b() || !vVar.f1138h || vVar.f1135d) ? false : true;
    }

    public static final boolean c(v vVar) {
        return vVar.f1138h && !vVar.f1135d;
    }

    public static final boolean d(long j, long j10) {
        return j == j10;
    }

    public static final boolean e(v vVar, long j, long j10) {
        int i10 = vVar.f1139i == 1 ? 1 : 0;
        long j11 = vVar.f1134c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float f3 = i10;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32)) * f3;
        float f7 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f3;
        return (fIntBitsToFloat > f7) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static l0.r f(l0.r rVar, C0083a c0083a) {
        return rVar.b(new PointerHoverIconModifierElement(c0083a));
    }

    public static final long g(v vVar, boolean z10) {
        long jG = p171r0.c.g(vVar.f1134c, vVar.g);
        if (z10 || !vVar.b()) {
            return jG;
        }
        return 0L;
    }

    public static final void h(C0096n c0096n, long j, p241y9.c cVar, boolean z10) {
        J1 j10 = c0096n.f1120b;
        MotionEvent motionEvent = j10 != null ? (MotionEvent) ((M.k) j10.f14057d).f5619t : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z10) {
            motionEvent.setAction(3);
        }
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        cVar.e(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEvent.setAction(action);
    }
}
