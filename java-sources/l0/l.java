package l0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f19329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f19330b;

    public l(r rVar, r rVar2) {
        this.f19329a = rVar;
        this.f19330b = rVar2;
    }

    @Override // l0.r
    public final /* synthetic */ r b(r rVar) {
        return android.support.v4.media.session.p.d(this, rVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p251z9.j.a(this.f19329a, lVar.f19329a) && p251z9.j.a(this.f19330b, lVar.f19330b);
    }

    @Override // l0.r
    public final boolean g(p241y9.c cVar) {
        return this.f19329a.g(cVar) && this.f19330b.g(cVar);
    }

    @Override // l0.r
    public final Object h(Object obj, p241y9.e eVar) {
        return this.f19330b.h(this.f19329a.h(obj, eVar), eVar);
    }

    public final int hashCode() {
        return (this.f19330b.hashCode() * 31) + this.f19329a.hashCode();
    }

    public final String toString() {
        return p245z2.a.F(new StringBuilder("["), (String) h("", k.f19328r), ']');
    }
}
