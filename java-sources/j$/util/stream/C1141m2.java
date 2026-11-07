package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1141m2 extends AbstractC1116h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1146n2 f18501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141m2(C1146n2 c1146n2, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18501d = c1146n2;
        this.f18499b = c1146n2.f18509s;
        long j = c1146n2.f18510t;
        this.f18500c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18474a.c(AbstractC1184v1.X(j, this.f18501d.f18509s, this.f18500c));
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        long j = this.f18499b;
        if (j == 0) {
            long j10 = this.f18500c;
            if (j10 > 0) {
                this.f18500c = j10 - 1;
                this.f18474a.n(obj);
                return;
            }
            return;
        }
        this.f18499b = j - 1;
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return this.f18500c == 0 || this.f18474a.e();
    }
}
