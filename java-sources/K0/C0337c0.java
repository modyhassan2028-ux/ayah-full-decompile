package K0;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: K0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0337c0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f5069a;

    public C0337c0(ViewConfiguration viewConfiguration) {
        this.f5069a = viewConfiguration;
    }

    @Override // K0.c1
    public final float a() {
        return this.f5069a.getScaledMaximumFlingVelocity();
    }

    @Override // K0.c1
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // K0.c1
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // K0.c1
    public final float d() {
        return this.f5069a.getScaledTouchSlop();
    }

    @Override // K0.c1
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0339d0.b(this.f5069a);
        }
        return 2.0f;
    }

    @Override // K0.c1
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0339d0.a(this.f5069a);
        }
        return 16.0f;
    }

    @Override // K0.c1
    public final long g() {
        float f3 = 48;
        return p185s8.u0.b(f3, f3);
    }
}
