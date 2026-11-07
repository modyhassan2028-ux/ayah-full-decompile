package T1;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements p150o9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0 f7680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B f7681s;

    public h0(h0 h0Var, B b5) {
        this.f7680r = h0Var;
        this.f7681s = b5;
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

    public final void a(B b5) {
        if (this.f7681s == b5) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        h0 h0Var = this.f7680r;
        if (h0Var != null) {
            h0Var.a(b5);
        }
    }

    @Override // p150o9.f
    public final p150o9.g getKey() {
        return g0.f7679r;
    }

    @Override // p150o9.h
    public final p150o9.f i(p150o9.g gVar) {
        return Y2.a.y(this, gVar);
    }
}
