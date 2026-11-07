package j$.util.stream;

import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1078a extends AbstractC1184v1 implements InterfaceC1108g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1078a f18422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC1078a f18423i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC1078a f18424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Spliterator f18427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f18429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Runnable f18430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18431r;

    public abstract G0 J0(AbstractC1078a abstractC1078a, Spliterator spliterator, boolean z10, IntFunction intFunction);

    public abstract boolean K0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2);

    public abstract Z2 L0();

    public abstract boolean O0();

    public abstract InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2);

    public abstract Spliterator S0(AbstractC1078a abstractC1078a, Supplier supplier, boolean z10);

    public AbstractC1078a(Spliterator spliterator, int i10, boolean z10) {
        this.f18423i = null;
        this.f18427n = spliterator;
        this.f18422h = this;
        int i11 = Y2.g & i10;
        this.j = i11;
        this.f18426m = (~(i11 << 1)) & Y2.f18403l;
        this.f18425l = 0;
        this.f18431r = z10;
    }

    public AbstractC1078a(AbstractC1078a abstractC1078a, int i10) {
        if (abstractC1078a.f18428o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC1078a.f18428o = true;
        abstractC1078a.f18424k = this;
        this.f18423i = abstractC1078a;
        this.j = Y2.f18400h & i10;
        this.f18426m = Y2.k(i10, abstractC1078a.f18426m);
        AbstractC1078a abstractC1078a2 = abstractC1078a.f18422h;
        this.f18422h = abstractC1078a2;
        if (O0()) {
            abstractC1078a2.f18429p = true;
        }
        this.f18425l = abstractC1078a.f18425l + 1;
    }

    public final Object H0(E3 e10) {
        if (this.f18428o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18428o = true;
        if (this.f18422h.f18431r) {
            return e10.j(this, Q0(e10.w()));
        }
        return e10.f(this, Q0(e10.w()));
    }

    public final G0 I0(IntFunction intFunction) {
        if (this.f18428o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18428o = true;
        if (this.f18422h.f18431r && this.f18423i != null && O0()) {
            this.f18425l = 0;
            AbstractC1078a abstractC1078a = this.f18423i;
            return M0(abstractC1078a, abstractC1078a.Q0(0), intFunction);
        }
        return k0(Q0(0), true, intFunction);
    }

    public final Spliterator R0() {
        AbstractC1078a abstractC1078a = this.f18422h;
        if (this != abstractC1078a) {
            throw new IllegalStateException();
        }
        if (this.f18428o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18428o = true;
        Spliterator spliterator = abstractC1078a.f18427n;
        if (spliterator != null) {
            abstractC1078a.f18427n = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final InterfaceC1108g sequential() {
        this.f18422h.f18431r = false;
        return this;
    }

    public final InterfaceC1108g parallel() {
        this.f18422h.f18431r = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f18428o = true;
        this.f18427n = null;
        AbstractC1078a abstractC1078a = this.f18422h;
        Runnable runnable = abstractC1078a.f18430q;
        if (runnable != null) {
            abstractC1078a.f18430q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g onClose(Runnable runnable) {
        if (this.f18428o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC1078a abstractC1078a = this.f18422h;
        Runnable runnable2 = abstractC1078a.f18430q;
        if (runnable2 != null) {
            runnable = new D3(runnable2, runnable);
        }
        abstractC1078a.f18430q = runnable;
        return this;
    }

    public Spliterator spliterator() {
        if (this.f18428o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f18428o = true;
        AbstractC1078a abstractC1078a = this.f18422h;
        if (this == abstractC1078a) {
            Spliterator spliterator = abstractC1078a.f18427n;
            if (spliterator != null) {
                abstractC1078a.f18427n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return S0(this, new C1076q(2, this), abstractC1078a.f18431r);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final boolean isParallel() {
        return this.f18422h.f18431r;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final G0 k0(Spliterator spliterator, boolean z10, IntFunction intFunction) {
        if (this.f18422h.f18431r) {
            return J0(this, spliterator, z10, intFunction);
        }
        InterfaceC1198y0 interfaceC1198y0A0 = A0(l0(spliterator), intFunction);
        E0(spliterator, interfaceC1198y0A0);
        return interfaceC1198y0A0.build();
    }

    public final Spliterator Q0(int i10) {
        int i11;
        int i12;
        AbstractC1078a abstractC1078a = this.f18422h;
        Spliterator spliteratorN0 = abstractC1078a.f18427n;
        if (spliteratorN0 != null) {
            abstractC1078a.f18427n = null;
            if (abstractC1078a.f18431r && abstractC1078a.f18429p) {
                AbstractC1078a abstractC1078a2 = abstractC1078a.f18424k;
                int i13 = 1;
                while (abstractC1078a != this) {
                    int i14 = abstractC1078a2.j;
                    if (abstractC1078a2.O0()) {
                        if (Y2.SHORT_CIRCUIT.v(i14)) {
                            i14 &= ~Y2.f18412u;
                        }
                        spliteratorN0 = abstractC1078a2.N0(abstractC1078a, spliteratorN0);
                        if (spliteratorN0.hasCharacteristics(64)) {
                            i11 = (~Y2.f18411t) & i14;
                            i12 = Y2.f18410s;
                        } else {
                            i11 = (~Y2.f18410s) & i14;
                            i12 = Y2.f18411t;
                        }
                        i14 = i11 | i12;
                        i13 = 0;
                    }
                    int i15 = i13 + 1;
                    abstractC1078a2.f18425l = i13;
                    abstractC1078a2.f18426m = Y2.k(i14, abstractC1078a.f18426m);
                    AbstractC1078a abstractC1078a3 = abstractC1078a2;
                    abstractC1078a2 = abstractC1078a2.f18424k;
                    abstractC1078a = abstractC1078a3;
                    i13 = i15;
                }
            }
            if (i10 != 0) {
                this.f18426m = Y2.k(i10, this.f18426m);
            }
            return spliteratorN0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final long l0(Spliterator spliterator) {
        if (Y2.SIZED.v(this.f18426m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final InterfaceC1136l2 E0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        g0(spliterator, F0((InterfaceC1136l2) Objects.requireNonNull(interfaceC1136l2)));
        return interfaceC1136l2;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final void g0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        Objects.requireNonNull(interfaceC1136l2);
        if (!Y2.SHORT_CIRCUIT.v(this.f18426m)) {
            interfaceC1136l2.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(interfaceC1136l2);
            interfaceC1136l2.end();
            return;
        }
        h0(spliterator, interfaceC1136l2);
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final boolean h0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        AbstractC1078a abstractC1078a = this;
        while (abstractC1078a.f18425l > 0) {
            abstractC1078a = abstractC1078a.f18423i;
        }
        interfaceC1136l2.c(spliterator.getExactSizeIfKnown());
        boolean zK0 = abstractC1078a.K0(spliterator, interfaceC1136l2);
        interfaceC1136l2.end();
        return zK0;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final InterfaceC1136l2 F0(InterfaceC1136l2 interfaceC1136l2) {
        Objects.requireNonNull(interfaceC1136l2);
        for (AbstractC1078a abstractC1078a = this; abstractC1078a.f18425l > 0; abstractC1078a = abstractC1078a.f18423i) {
            interfaceC1136l2 = abstractC1078a.P0(abstractC1078a.f18423i.f18426m, interfaceC1136l2);
        }
        return interfaceC1136l2;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final Spliterator G0(Spliterator spliterator) {
        return this.f18425l == 0 ? spliterator : S0(this, new C1076q(3, spliterator), this.f18422h.f18431r);
    }

    public G0 M0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator N0(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        return M0(abstractC1078a, spliterator, new j$.time.f(11)).spliterator();
    }
}
