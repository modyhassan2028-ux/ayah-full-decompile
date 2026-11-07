package I1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: I1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0257j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0258k f3747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VelocityTracker f3748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3750e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3751f = -1;
    public int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f3752h = {Integer.MAX_VALUE, 0};

    public C0257j(Context context, InterfaceC0258k interfaceC0258k) {
        this.f3746a = context;
        this.f3747b = interfaceC0258k;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:83:0x016a  */
    public final void a(MotionEvent motionEvent, int i10) {
        int i11;
        int i12;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z10;
        float f3;
        float yVelocity;
        long j;
        float fSqrt;
        float f7;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i13 = this.f3751f;
        int[] iArr = this.f3752h;
        if (i13 == source && this.g == deviceId && this.f3750e == i10) {
            z10 = false;
            i11 = 1;
            i12 = 0;
        } else {
            Context context = this.f3746a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i11 = 1;
            int i14 = Build.VERSION.SDK_INT;
            i12 = 0;
            if (i14 >= 34) {
                Method method = T.f3695a;
                scaledMinimumFlingVelocity = AbstractC0272z.i(viewConfiguration, deviceId2, i10, source2);
            } else {
                Method method2 = T.f3695a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i10, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i14 >= 34) {
                scaledMaximumFlingVelocity = AbstractC0272z.h(viewConfiguration, deviceId3, i10, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i10, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f3751f = source;
            this.g = deviceId;
            this.f3750e = i10;
            z10 = true;
        }
        if (iArr[i12] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f3748c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3748c = null;
                return;
            }
            return;
        }
        if (this.f3748c == null) {
            this.f3748c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f3748c;
        Map map = A.f3664a;
        velocityTracker2.addMovement(motionEvent);
        float f10 = 0.0f;
        int i15 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = A.f3664a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new B());
            }
            B b5 = (B) map2.get(velocityTracker2);
            long[] jArr = b5.f3666b;
            long eventTime = motionEvent.getEventTime();
            if (b5.f3668d != 0 && eventTime - jArr[b5.f3669e] > 40) {
                b5.f3668d = i12;
                b5.f3667c = 0.0f;
            }
            int i16 = (b5.f3669e + 1) % 20;
            b5.f3669e = i16;
            int i17 = b5.f3668d;
            if (i17 != 20) {
                b5.f3668d = i17 + 1;
            }
            b5.f3665a[i16] = motionEvent.getAxisValue(26);
            jArr[b5.f3669e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        B b10 = (B) A.f3664a.get(velocityTracker2);
        if (b10 != null) {
            float[] fArr = b10.f3665a;
            long[] jArr2 = b10.f3666b;
            int i18 = b10.f3668d;
            if (i18 < 2) {
                fSqrt = 0.0f;
                f3 = 0.0f;
            } else {
                int i19 = b10.f3669e;
                int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                long j10 = jArr2[i19];
                while (true) {
                    j = jArr2[i20];
                    if (j10 - j <= 100) {
                        break;
                    }
                    b10.f3668d--;
                    i20 = (i20 + 1) % 20;
                }
                int i21 = b10.f3668d;
                if (i21 < 2) {
                    fSqrt = 0.0f;
                    f3 = 0.0f;
                } else if (i21 == 2) {
                    int i22 = (i20 + 1) % 20;
                    long j11 = jArr2[i22];
                    if (j == j11) {
                        fSqrt = 0.0f;
                        f3 = 0.0f;
                    } else {
                        fSqrt = fArr[i22] / (j11 - j);
                        f3 = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        if (i23 >= b10.f3668d - 1) {
                            break;
                        }
                        int i25 = i23 + i20;
                        long j12 = jArr2[i25 % 20];
                        int i26 = (i25 + 1) % i15;
                        if (jArr2[i26] == j12) {
                            f7 = f10;
                        } else {
                            i24++;
                            f7 = f10;
                            float fSqrt2 = (fAbs < f10 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f11 = fArr[i26] / (jArr2[i26] - j12);
                            fAbs += Math.abs(f11) * (f11 - fSqrt2);
                            if (i24 == i11) {
                                fAbs *= 0.5f;
                            }
                        }
                        i23++;
                        f10 = f7;
                        i15 = 20;
                        i11 = 1;
                    }
                    f3 = f10;
                    fSqrt = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f12 = fSqrt * 1000;
            b10.f3667c = f12;
            if (f12 < (-Math.abs((float) r4))) {
                b10.f3667c = -Math.abs(Float.MAX_VALUE);
            } else if (b10.f3667c > Math.abs((float) r4)) {
                b10.f3667c = Math.abs((float) r4);
            }
        } else {
            f3 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0272z.e(velocityTracker2, i10);
        } else if (i10 == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i10 == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            B b11 = (B) A.f3664a.get(velocityTracker2);
            yVelocity = (b11 == null || i10 != 26) ? f3 : b11.f3667c;
        }
        InterfaceC0258k interfaceC0258k = this.f3747b;
        float fX = interfaceC0258k.x() * yVelocity;
        float fSignum = Math.signum(fX);
        if (z10 || (fSignum != Math.signum(this.f3749d) && fSignum != f3)) {
            interfaceC0258k.A();
        }
        if (Math.abs(fX) < iArr[0]) {
            return;
        }
        int i27 = iArr[1];
        float fMax = Math.max(-i27, Math.min(fX, i27));
        this.f3749d = interfaceC0258k.n(fMax) ? fMax : f3;
    }
}
