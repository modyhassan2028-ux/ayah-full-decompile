package p232y;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f24477a;

    public b0(Magnifier magnifier) {
        this.f24477a = magnifier;
    }

    @Override // p232y.Z
    public void a(long j, long j10) {
        this.f24477a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.f24477a.dismiss();
    }

    public final long c() {
        return (((long) this.f24477a.getHeight()) & 4294967295L) | (((long) this.f24477a.getWidth()) << 32);
    }

    public final void d() {
        this.f24477a.update();
    }
}
