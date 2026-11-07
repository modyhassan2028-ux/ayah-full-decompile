package p180s0;

import N9.b0;
import android.graphics.Paint;
import android.graphics.Shader;
import p171r0.i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Shader f21796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21797f = 9205357640488583168L;

    @Override // p180s0.F
    public final void j(float f3, long j, b0 b0Var) {
        Shader shaderX = this.f21796e;
        if (shaderX == null || !i.a(this.f21797f, j)) {
            if (i.e(j)) {
                shaderX = null;
                this.f21796e = null;
                this.f21797f = 9205357640488583168L;
            } else {
                shaderX = x(j);
                this.f21796e = shaderX;
                this.f21797f = j;
            }
        }
        Paint paint = (Paint) b0Var.f6165b;
        long jC = F.c(paint.getColor());
        long j10 = q.f21839b;
        if (!q.c(jC, j10)) {
            b0Var.e(j10);
        }
        if (!j.a((Shader) b0Var.f6166c, shaderX)) {
            b0Var.h(shaderX);
        }
        if (paint.getAlpha() / 255.0f == f3) {
            return;
        }
        b0Var.c(f3);
    }

    public abstract Shader x(long j);
}
