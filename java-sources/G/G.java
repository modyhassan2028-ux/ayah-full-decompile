package G;

import Z.C0681f0;
import Z.L0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements L0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0681f0 f2586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2587s;

    public G(int i10) {
        int i11 = (i10 / 30) * 30;
        this.f2586r = new C0681f0(B0.c.i0(Math.max(i11 - 100, 0), i11 + 130), Z.S.f10643w);
        this.f2587s = i10;
    }

    @Override // Z.L0
    public final Object getValue() {
        return (E9.d) this.f2586r.getValue();
    }
}
