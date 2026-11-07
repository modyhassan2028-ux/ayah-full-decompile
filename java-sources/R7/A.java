package R7;

import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f7280c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7278a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7279b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f7281d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f7282e = new Path();

    public abstract void a(FrameLayout frameLayout);

    public abstract boolean b();

    public final void c() {
        o oVar;
        RectF rectF = this.f7281d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (oVar = this.f7280c) == null) {
            return;
        }
        p.f7358a.a(oVar, 1.0f, rectF, null, this.f7282e);
    }
}
