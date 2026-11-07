package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1151o2 extends AbstractC1106f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1156p2 f18517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151o2(C1156p2 c1156p2, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18517d = c1156p2;
        this.f18515b = c1156p2.f18521s;
        long j = c1156p2.f18522t;
        this.f18516c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18469a.c(AbstractC1184v1.X(j, this.f18517d.f18521s, this.f18516c));
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        long j = this.f18515b;
        if (j == 0) {
            long j10 = this.f18516c;
            if (j10 > 0) {
                this.f18516c = j10 - 1;
                this.f18469a.accept(i10);
                return;
            }
            return;
        }
        this.f18515b = j - 1;
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return this.f18516c == 0 || this.f18469a.e();
    }
}
