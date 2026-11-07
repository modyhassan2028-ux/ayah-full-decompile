package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class S3 extends AbstractC1083b {
    public final AbstractC1078a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IntFunction f18355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f18359o;

    @Override // j$.util.stream.AbstractC1083b
    public final void f() {
        this.f18441i = true;
        if (this.f18356l && this.f18359o) {
            d(AbstractC1184v1.j0(this.j.L0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        S3 s10;
        S3 s11;
        Object objF0;
        AbstractC1093d abstractC1093d = this.f18456d;
        if (abstractC1093d != null) {
            this.f18358n = ((S3) abstractC1093d).f18358n | ((S3) this.f18457e).f18358n;
            if (this.f18356l && this.f18441i) {
                this.f18357m = 0L;
                objF0 = AbstractC1184v1.j0(this.j.L0());
            } else if (this.f18356l) {
                S3 s12 = (S3) this.f18456d;
                if (s12.f18358n) {
                    this.f18357m = s12.f18357m;
                    objF0 = (G0) s12.i();
                } else {
                    s10 = (S3) this.f18456d;
                    long j = s10.f18357m;
                    s11 = (S3) this.f18457e;
                    this.f18357m = j + s11.f18357m;
                    if (s10.f18357m == 0) {
                        objF0 = (G0) s11.i();
                    } else if (s11.f18357m == 0) {
                        objF0 = (G0) s10.i();
                    } else {
                        objF0 = AbstractC1184v1.f0(this.j.L0(), (G0) ((S3) this.f18456d).i(), (G0) ((S3) this.f18457e).i());
                    }
                }
            } else {
                s10 = (S3) this.f18456d;
                long j10 = s10.f18357m;
                s11 = (S3) this.f18457e;
                this.f18357m = j10 + s11.f18357m;
                if (s10.f18357m == 0) {
                    objF0 = (G0) s11.i();
                } else if (s11.f18357m == 0) {
                    objF0 = (G0) s10.i();
                } else {
                    objF0 = AbstractC1184v1.f0(this.j.L0(), (G0) ((S3) this.f18456d).i(), (G0) ((S3) this.f18457e).i());
                }
            }
            d(objF0);
        }
        this.f18359o = true;
        super.onCompletion(countedCompleter);
    }

    public S3(AbstractC1078a abstractC1078a, AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC1184v1, spliterator);
        this.j = abstractC1078a;
        this.f18355k = intFunction;
        this.f18356l = Y2.ORDERED.v(((AbstractC1078a) abstractC1184v1).f18426m);
    }

    public S3(S3 s10, Spliterator spliterator) {
        super(s10, spliterator);
        this.j = s10.j;
        this.f18355k = s10.f18355k;
        this.f18356l = s10.f18356l;
    }

    @Override // j$.util.stream.AbstractC1093d
    public final AbstractC1093d c(Spliterator spliterator) {
        return new S3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1083b
    public final Object h() {
        return AbstractC1184v1.j0(this.j.L0());
    }

    @Override // j$.util.stream.AbstractC1093d
    public final Object a() {
        InterfaceC1198y0 interfaceC1198y0A0 = this.f18453a.A0(-1L, this.f18355k);
        InterfaceC1136l2 interfaceC1136l2P0 = this.j.P0(((AbstractC1078a) this.f18453a).f18426m, interfaceC1198y0A0);
        AbstractC1184v1 abstractC1184v1 = this.f18453a;
        boolean zH0 = abstractC1184v1.h0(this.f18454b, abstractC1184v1.F0(interfaceC1136l2P0));
        this.f18358n = zH0;
        if (zH0) {
            g();
        }
        G0 g0Build = interfaceC1198y0A0.build();
        this.f18357m = g0Build.count();
        return g0Build;
    }
}
