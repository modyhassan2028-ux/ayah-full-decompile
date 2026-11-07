package androidx.window.layout;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p024c3.b f13082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f13083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f13084c;

    public g(p024c3.b bVar, f fVar, f fVar2) {
        int i10 = bVar.f13445b;
        this.f13082a = bVar;
        this.f13083b = fVar;
        this.f13084c = fVar2;
        int i11 = bVar.f13446c;
        int i12 = bVar.f13444a;
        if (i11 - i12 == 0 && bVar.f13447d - i10 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i12 != 0 && i10 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean a() {
        f fVar = f.f13079h;
        f fVar2 = this.f13083b;
        if (p251z9.j.a(fVar2, fVar)) {
            return true;
        }
        return p251z9.j.a(fVar2, f.g) && p251z9.j.a(this.f13084c, f.f13078f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        g gVar = (g) obj;
        return p251z9.j.a(this.f13082a, gVar.f13082a) && p251z9.j.a(this.f13083b, gVar.f13083b) && p251z9.j.a(this.f13084c, gVar.f13084c);
    }

    public final int hashCode() {
        return this.f13084c.hashCode() + ((this.f13083b.hashCode() + (this.f13082a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return ((Object) g.class.getSimpleName()) + " { " + this.f13082a + ", type=" + this.f13083b + ", state=" + this.f13084c + " }";
    }
}
