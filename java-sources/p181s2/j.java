package p181s2;

import p074h0.d;
import p173r2.v;
import p173r2.w;

/* JADX INFO: loaded from: classes.dex */
public final class j extends w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f22073f;
    public final d g;

    public j(i iVar, String str, d dVar) {
        super(iVar, str);
        this.f22073f = iVar;
        this.g = dVar;
    }

    @Override // p173r2.w
    public final v a() {
        return (h) super.a();
    }

    @Override // p173r2.w
    public final v b() {
        return new h(this.f22073f, this.g);
    }
}
