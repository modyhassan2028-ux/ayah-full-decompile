package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class N implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0727a f12401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f12402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0740n f12403c;

    public N(e0 e0Var, C0740n c0740n, AbstractC0727a abstractC0727a) {
        this.f12402b = e0Var;
        c0740n.getClass();
        this.f12403c = c0740n;
        this.f12401a = abstractC0727a;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, E2.A a9, C0739m c0739m) {
        this.f12402b.getClass();
        e0.a(obj);
        this.f12403c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, Object obj2) {
        X.k(this.f12402b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj, E e10) {
        this.f12403c.getClass();
        p245z2.a.H(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int d(AbstractC0746u abstractC0746u) {
        this.f12402b.getClass();
        return abstractC0746u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void e(Object obj) {
        this.f12402b.getClass();
        d0 d0Var = ((AbstractC0746u) obj).unknownFields;
        if (d0Var.f12447e) {
            d0Var.f12447e = false;
        }
        this.f12403c.getClass();
        p245z2.a.H(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean f(Object obj) {
        this.f12403c.getClass();
        p245z2.a.H(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean g(AbstractC0746u abstractC0746u, AbstractC0746u abstractC0746u2) {
        this.f12402b.getClass();
        return abstractC0746u.unknownFields.equals(abstractC0746u2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int h(AbstractC0746u abstractC0746u) {
        this.f12402b.getClass();
        d0 d0Var = abstractC0746u.unknownFields;
        int i10 = d0Var.f12446d;
        if (i10 != -1) {
            return i10;
        }
        int iX = 0;
        for (int i11 = 0; i11 < d0Var.f12443a; i11++) {
            int i12 = d0Var.f12444b[i11] >>> 3;
            iX += C0737k.X(3, (C0733g) d0Var.f12445c[i11]) + C0737k.a0(i12) + C0737k.Z(2) + (C0737k.Z(1) * 2);
        }
        d0Var.f12446d = iX;
        return iX;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0746u i() {
        AbstractC0727a abstractC0727a = this.f12401a;
        return abstractC0727a instanceof AbstractC0746u ? ((AbstractC0746u) abstractC0727a).i() : ((AbstractC0744s) ((AbstractC0746u) abstractC0727a).c(5)).b();
    }
}
