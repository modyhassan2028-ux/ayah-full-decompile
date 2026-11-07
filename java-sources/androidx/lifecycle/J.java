package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class J implements S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static J f12623b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12624a;

    @Override // androidx.lifecycle.S
    public P a(Class cls) {
        switch (this.f12624a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                return p000a.a.y(cls);
            case 2:
                return new p056f2.N(true);
            default:
                return new p133n2.a();
        }
    }

    @Override // androidx.lifecycle.S
    public P b(Class cls, p105k2.d dVar) {
        switch (this.f12624a) {
            case 0:
                a(cls);
                throw null;
            case 1:
                return a(cls);
            case 2:
                return a(cls);
            default:
                return a(cls);
        }
    }

    @Override // androidx.lifecycle.S
    public final P c(p251z9.e eVar, p105k2.d dVar) {
        switch (this.f12624a) {
            case 0:
                return new M();
            case 1:
                return b(p171r0.a.d(eVar), dVar);
            case 2:
                return android.support.v4.media.session.p.a(this, eVar, dVar);
            default:
                return android.support.v4.media.session.p.a(this, eVar, dVar);
        }
    }
}
