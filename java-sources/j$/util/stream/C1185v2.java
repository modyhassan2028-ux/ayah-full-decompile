package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1185v2 extends AbstractC1083b {
    public final AbstractC1078a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f18572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f18573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f18574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f18576o;

    @Override // j$.util.stream.AbstractC1083b
    public final void f() {
        this.f18441i = true;
        if (this.f18576o) {
            d(AbstractC1184v1.j0(this.j.L0()));
        }
    }

    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C1185v2 c1185v2;
        G0 g0F0;
        AbstractC1093d abstractC1093d = this.f18456d;
        if (abstractC1093d != null) {
            this.f18575n = ((C1185v2) abstractC1093d).f18575n + ((C1185v2) this.f18457e).f18575n;
            if (this.f18441i) {
                this.f18575n = 0L;
                g0F0 = AbstractC1184v1.j0(this.j.L0());
            } else if (this.f18575n == 0) {
                g0F0 = AbstractC1184v1.j0(this.j.L0());
            } else {
                g0F0 = ((C1185v2) this.f18456d).f18575n == 0 ? (G0) ((C1185v2) this.f18457e).i() : AbstractC1184v1.f0(this.j.L0(), (G0) ((C1185v2) this.f18456d).i(), (G0) ((C1185v2) this.f18457e).i());
            }
            G0 g0J = g0F0;
            if (b()) {
                g0J = g0J.j(this.f18573l, this.f18574m >= 0 ? Math.min(g0J.count(), this.f18573l + this.f18574m) : this.f18575n, this.f18572k);
            }
            d(g0J);
            this.f18576o = true;
        }
        if (this.f18574m >= 0 && !b()) {
            long j = this.f18573l + this.f18574m;
            long j10 = this.f18576o ? this.f18575n : j(j);
            if (j10 >= j) {
                g();
            } else {
                C1185v2 c1185v3 = (C1185v2) ((AbstractC1093d) getCompleter());
                Object obj = this;
                while (true) {
                    if (c1185v3 == null) {
                        if (j10 >= j) {
                            break;
                        }
                    } else {
                        if (obj == c1185v3.f18457e && (c1185v2 = (C1185v2) c1185v3.f18456d) != null) {
                            long j11 = c1185v2.j(j) + j10;
                            if (j11 >= j) {
                                break;
                            } else {
                                j10 = j11;
                            }
                        }
                        obj = c1185v3;
                        c1185v3 = (C1185v2) ((AbstractC1093d) c1185v3.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C1185v2(AbstractC1078a abstractC1078a, AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction, long j, long j10) {
        super(abstractC1184v1, spliterator);
        this.j = abstractC1078a;
        this.f18572k = intFunction;
        this.f18573l = j;
        this.f18574m = j10;
    }

    public C1185v2(C1185v2 c1185v2, Spliterator spliterator) {
        super(c1185v2, spliterator);
        this.j = c1185v2.j;
        this.f18572k = c1185v2.f18572k;
        this.f18573l = c1185v2.f18573l;
        this.f18574m = c1185v2.f18574m;
    }

    @Override // j$.util.stream.AbstractC1093d
    public final AbstractC1093d c(Spliterator spliterator) {
        return new C1185v2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1083b
    public final Object h() {
        return AbstractC1184v1.j0(this.j.L0());
    }

    @Override // j$.util.stream.AbstractC1093d
    public final Object a() {
        if (b()) {
            Y2 y10 = Y2.SIZED;
            AbstractC1078a abstractC1078a = this.j;
            int i10 = abstractC1078a.j;
            int i11 = y10.f18418e;
            InterfaceC1198y0 interfaceC1198y0A0 = this.j.A0((i10 & i11) == i11 ? abstractC1078a.l0(this.f18454b) : -1L, this.f18572k);
            InterfaceC1136l2 interfaceC1136l2P0 = this.j.P0(((AbstractC1078a) this.f18453a).f18426m, interfaceC1198y0A0);
            AbstractC1184v1 abstractC1184v1 = this.f18453a;
            abstractC1184v1.h0(this.f18454b, abstractC1184v1.F0(interfaceC1136l2P0));
            return interfaceC1198y0A0.build();
        }
        InterfaceC1198y0 interfaceC1198y0A1 = this.j.A0(-1L, this.f18572k);
        if (this.f18573l == 0) {
            InterfaceC1136l2 interfaceC1136l2P1 = this.j.P0(((AbstractC1078a) this.f18453a).f18426m, interfaceC1198y0A1);
            AbstractC1184v1 abstractC1184v2 = this.f18453a;
            abstractC1184v2.h0(this.f18454b, abstractC1184v2.F0(interfaceC1136l2P1));
        } else {
            this.f18453a.E0(this.f18454b, interfaceC1198y0A1);
        }
        G0 g0Build = interfaceC1198y0A1.build();
        this.f18575n = g0Build.count();
        this.f18576o = true;
        this.f18454b = null;
        return g0Build;
    }

    public final long j(long j) {
        if (this.f18576o) {
            return this.f18575n;
        }
        C1185v2 c1185v2 = (C1185v2) this.f18456d;
        C1185v2 c1185v3 = (C1185v2) this.f18457e;
        if (c1185v2 == null || c1185v3 == null) {
            return this.f18575n;
        }
        long j10 = c1185v2.j(j);
        return j10 >= j ? j10 : c1185v3.j(j) + j10;
    }
}
