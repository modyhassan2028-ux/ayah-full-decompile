package p180s0;

import android.graphics.PathMeasure;
import p123m2.c;

/* JADX INFO: renamed from: s0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1301j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f21833a;

    public C1301j(PathMeasure pathMeasure) {
        this.f21833a = pathMeasure;
    }

    public final void a(float f3, float f7, C1300i c1300i) {
        if (!c.D(c1300i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f21833a.getSegment(f3, f7, c1300i.f21829a, true);
    }
}
