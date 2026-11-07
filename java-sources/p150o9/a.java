package p150o9;

import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f20376r;

    public a(g gVar) {
        this.f20376r = gVar;
    }

    @Override // p150o9.h
    public h A(g gVar) {
        return Y2.a.Y(this, gVar);
    }

    @Override // p150o9.h
    public final Object F(Object obj, e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // p150o9.h
    public final h L(h hVar) {
        return Y2.a.Z(this, hVar);
    }

    @Override // p150o9.f
    public final g getKey() {
        return this.f20376r;
    }

    @Override // p150o9.h
    public f i(g gVar) {
        return Y2.a.y(this, gVar);
    }
}
