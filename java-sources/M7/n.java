package M7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5801a;

    public n(d dVar) {
        this.f5801a = dVar;
    }

    public abstract void a(Canvas canvas, Rect rect, float f3, boolean z10, boolean z11);

    public abstract void b(Canvas canvas, Paint paint, int i10, int i11);

    public abstract void c(Canvas canvas, Paint paint, m mVar, int i10);

    public abstract void d(Canvas canvas, Paint paint, float f3, float f7, int i10, int i11, int i12);

    public abstract int e();

    public abstract int f();
}
