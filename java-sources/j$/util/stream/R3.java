package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class R3 extends AbstractC1093d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1078a f18345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IntFunction f18346i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18348l;

    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        G0 g0F0;
        AbstractC1093d abstractC1093d = this.f18456d;
        if (abstractC1093d != null) {
            if (this.j) {
                R3 r10 = (R3) abstractC1093d;
                long j = r10.f18348l;
                this.f18348l = j;
                if (j == r10.f18347k) {
                    this.f18348l = j + ((R3) this.f18457e).f18348l;
                }
            }
            R3 r11 = (R3) abstractC1093d;
            long j10 = r11.f18347k;
            R3 r12 = (R3) this.f18457e;
            this.f18347k = j10 + r12.f18347k;
            if (r11.f18347k == 0) {
                g0F0 = (G0) r12.f18458f;
            } else {
                g0F0 = r12.f18347k == 0 ? (G0) r11.f18458f : AbstractC1184v1.f0(this.f18345h.L0(), (G0) ((R3) this.f18456d).f18458f, (G0) ((R3) this.f18457e).f18458f);
            }
            G0 g0J = g0F0;
            if (b() && this.j) {
                g0J = g0J.j(this.f18348l, g0J.count(), this.f18346i);
            }
            this.f18458f = g0J;
        }
        super.onCompletion(countedCompleter);
    }

    public R3(AbstractC1078a abstractC1078a, AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC1184v1, spliterator);
        this.f18345h = abstractC1078a;
        this.f18346i = intFunction;
        this.j = Y2.ORDERED.v(((AbstractC1078a) abstractC1184v1).f18426m);
    }

    public R3(R3 r10, Spliterator spliterator) {
        super(r10, spliterator);
        this.f18345h = r10.f18345h;
        this.f18346i = r10.f18346i;
        this.j = r10.j;
    }

    @Override // j$.util.stream.AbstractC1093d
    public final AbstractC1093d c(Spliterator spliterator) {
        return new R3(this, spliterator);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // j$.util.stream.AbstractC1093d
    public final Object a() {
        long jL0;
        boolean zB = b();
        if (zB || !this.j) {
            jL0 = -1;
        } else {
            Y2 y10 = Y2.SIZED;
            AbstractC1078a abstractC1078a = this.f18345h;
            int i10 = abstractC1078a.j;
            int i11 = y10.f18418e;
            if ((i10 & i11) == i11) {
                jL0 = abstractC1078a.l0(this.f18454b);
            } else {
                jL0 = -1;
            }
        }
        InterfaceC1198y0 interfaceC1198y0A0 = this.f18453a.A0(jL0, this.f18346i);
        Q3 q3I = ((P3) this.f18345h).i(interfaceC1198y0A0, this.j && !zB);
        this.f18453a.E0(this.f18454b, q3I);
        G0 g0Build = interfaceC1198y0A0.build();
        this.f18347k = g0Build.count();
        this.f18348l = q3I.h();
        return g0Build;
    }
}
