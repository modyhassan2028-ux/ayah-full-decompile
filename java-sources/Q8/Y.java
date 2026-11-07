package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements S8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101j9.a f6933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S8.c f6934c;

    public /* synthetic */ Y(S8.c cVar, S8.c cVar2, int i10) {
        this.f6932a = i10;
        this.f6933b = cVar;
        this.f6934c = cVar2;
    }

    @Override // p101j9.a
    public final Object get() {
        switch (this.f6932a) {
            case 0:
                return new X((k0) this.f6933b.get(), (l0) this.f6934c.get());
            default:
                return new T8.j((T8.o) this.f6933b.get(), (T8.o) this.f6934c.get());
        }
    }
}
