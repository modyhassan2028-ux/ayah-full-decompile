package K0;

import K9.C0389g;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0389g f5047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f5048s;

    public Z(C0389g c0389g, C0333a0 c0333a0, p241y9.c cVar) {
        this.f5047r = c0389g;
        this.f5048s = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objB;
        try {
            objB = this.f5048s.e(Long.valueOf(j));
        } catch (Throwable th) {
            objB = p110k9.a.b(th);
        }
        this.f5047r.resumeWith(objB);
    }
}
