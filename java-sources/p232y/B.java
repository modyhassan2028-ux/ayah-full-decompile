package p232y;

import android.content.Context;
import android.widget.EdgeEffect;
import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final class B extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24412b;

    public B(Context context) {
        super(context);
        this.f24411a = B1.a(context).f16249r * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f24412b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3, float f7) {
        this.f24412b = 0.0f;
        super.onPull(f3, f7);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f24412b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3) {
        this.f24412b = 0.0f;
        super.onPull(f3);
    }
}
