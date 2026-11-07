package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I0 implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0 f18276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0 f18277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18278c;

    @Override // j$.util.stream.G0
    public final int o() {
        return 2;
    }

    public I0(G0 g10, G0 g11) {
        this.f18276a = g10;
        this.f18277b = g11;
        this.f18278c = g11.count() + g10.count();
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i10) {
        if (i10 == 0) {
            return this.f18276a;
        }
        if (i10 == 1) {
            return this.f18277b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f18278c;
    }

    @Override // j$.util.stream.G0
    public /* bridge */ /* synthetic */ F0 a(int i10) {
        return (F0) a(i10);
    }
}
