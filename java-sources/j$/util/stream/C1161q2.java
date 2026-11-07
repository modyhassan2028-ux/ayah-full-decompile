package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1161q2 extends AbstractC1111g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1165r2 f18528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161q2(C1165r2 c1165r2, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18528d = c1165r2;
        this.f18526b = c1165r2.f18537s;
        long j = c1165r2.f18538t;
        this.f18527c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18471a.c(AbstractC1184v1.X(j, this.f18528d.f18537s, this.f18527c));
    }

    @Override // j$.util.stream.InterfaceC1131k2, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        long j10 = this.f18526b;
        if (j10 == 0) {
            long j11 = this.f18527c;
            if (j11 > 0) {
                this.f18527c = j11 - 1;
                this.f18471a.accept(j);
                return;
            }
            return;
        }
        this.f18526b = j10 - 1;
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return this.f18527c == 0 || this.f18471a.e();
    }
}
