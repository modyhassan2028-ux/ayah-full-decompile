package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class W implements S8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6924a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f6925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p101j9.a f6926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p101j9.a f6927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S8.c f6928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p101j9.a f6929f;

    public W(S8.c cVar, M m10, S8.c cVar2, S8.c cVar3, S8.c cVar4) {
        this.f6925b = cVar;
        this.f6926c = m10;
        this.f6927d = cVar2;
        this.f6929f = cVar3;
        this.f6928e = cVar4;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f6924a) {
            case 0:
                return new V((p050e8.f) ((M) this.f6929f).f6904b, (J8.e) this.f6925b.get(), (T8.j) this.f6926c.get(), (C0465l) this.f6928e.get(), (p150o9.h) this.f6927d.get());
            default:
                return new T8.c((k0) this.f6925b.get(), (J8.e) this.f6926c.get(), (C0455b) this.f6927d.get(), (T8.d) this.f6929f.get(), (T8.n) this.f6928e.get());
        }
    }

    public W(M m10, M m11, S8.c cVar, S8.c cVar2, M m12) {
        this.f6929f = m10;
        this.f6925b = m11;
        this.f6926c = cVar;
        this.f6928e = cVar2;
        this.f6927d = m12;
    }
}
