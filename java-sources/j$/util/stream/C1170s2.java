package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1170s2 extends AbstractC1101e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1175t2 f18544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170s2(C1175t2 c1175t2, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18544d = c1175t2;
        this.f18542b = c1175t2.f18549s;
        long j = c1175t2.f18550t;
        this.f18543c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18464a.c(AbstractC1184v1.X(j, this.f18544d.f18549s, this.f18543c));
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        long j = this.f18542b;
        if (j == 0) {
            long j10 = this.f18543c;
            if (j10 > 0) {
                this.f18543c = j10 - 1;
                this.f18464a.accept(d5);
                return;
            }
            return;
        }
        this.f18542b = j - 1;
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return this.f18543c == 0 || this.f18464a.e();
    }
}
