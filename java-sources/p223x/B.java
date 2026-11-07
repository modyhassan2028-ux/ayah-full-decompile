package p223x;

import Aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC1436z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1433w f23814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23816d;

    public B(int i10, int i11, InterfaceC1433w interfaceC1433w) {
        this.f23813a = i10;
        this.f23814b = interfaceC1433w;
        this.f23815c = ((long) i10) * 1000000;
        this.f23816d = ((long) i11) * 1000000;
    }

    @Override // p223x.InterfaceC1421j
    public final x0 a(v0 v0Var) {
        return new a((InterfaceC1436z) this);
    }

    @Override // p223x.InterfaceC1436z
    public final float b(long j, float f3, float f7, float f10) {
        long j10 = j - this.f23816d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f23815c;
        if (j10 > j11) {
            j10 = j11;
        }
        float fA = this.f23814b.a(this.f23813a == 0 ? 1.0f : j10 / j11);
        return (f7 * fA) + ((1 - fA) * f3);
    }

    @Override // p223x.InterfaceC1436z
    public final float c(long j, float f3, float f7, float f10) {
        long j10 = j - this.f23816d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f23815c;
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 == 0) {
            return f10;
        }
        return (b(j12, f3, f7, f10) - b(j12 - 1000000, f3, f7, f10)) * 1000.0f;
    }

    @Override // p223x.InterfaceC1436z
    public final long d(float f3, float f7, float f10) {
        return this.f23816d + this.f23815c;
    }

    @Override // p223x.InterfaceC1436z
    public final float e(float f3, float f7, float f10) {
        return c(d(f3, f7, f10), f3, f7, f10);
    }
}
