package H2;

import U6.C0532j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p150o9.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0532j f3247s = new C0532j(9);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f3248r;

    public a(u uVar) {
        p251z9.j.e(uVar, "connectionWrapper");
        this.f3248r = uVar;
    }

    @Override // p150o9.h
    public final p150o9.h A(p150o9.g gVar) {
        return Y2.a.Y(this, gVar);
    }

    @Override // p150o9.h
    public final Object F(Object obj, p241y9.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // p150o9.h
    public final p150o9.h L(p150o9.h hVar) {
        return Y2.a.Z(this, hVar);
    }

    @Override // p150o9.f
    public final p150o9.g getKey() {
        return f3247s;
    }

    @Override // p150o9.h
    public final p150o9.f i(p150o9.g gVar) {
        return Y2.a.y(this, gVar);
    }
}
