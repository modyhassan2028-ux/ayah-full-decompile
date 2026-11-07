package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1175t2 extends AbstractC1192x {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18550t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1175t2(AbstractC1202z abstractC1202z, int i10, long j, long j10) {
        super(abstractC1202z, i10);
        this.f18549s = j;
        this.f18550t = j10;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator N0(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        long jL0 = abstractC1078a.l0(spliterator);
        if (jL0 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.W w9 = (j$.util.W) abstractC1078a.G0(spliterator);
            long j = this.f18549s;
            return new C1152o3(w9, j, AbstractC1184v1.a0(j, this.f18550t));
        }
        if (Y2.ORDERED.v(abstractC1078a.f18426m)) {
            return ((G0) new C1185v2(this, abstractC1078a, spliterator, new C1084b0(14), this.f18549s, this.f18550t).invoke()).spliterator();
        }
        j$.util.W w10 = (j$.util.W) abstractC1078a.G0(spliterator);
        long j10 = this.f18549s;
        long j11 = this.f18550t;
        if (j10 <= jL0) {
            long jMin = jL0 - j10;
            if (j11 >= 0) {
                jMin = Math.min(j11, jMin);
            }
            j11 = jMin;
            j10 = 0;
        }
        return new C1181u3(w10, j10, j11);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 M0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jL0 = abstractC1184v1.l0(spliterator);
        if (jL0 > 0 && spliterator.hasCharacteristics(16384)) {
            AbstractC1078a abstractC1078a = (AbstractC1078a) abstractC1184v1;
            while (abstractC1078a.f18425l > 0) {
                abstractC1078a = abstractC1078a.f18423i;
            }
            return AbstractC1184v1.c0(abstractC1184v1, AbstractC1184v1.Y(abstractC1078a.L0(), spliterator, this.f18549s, this.f18550t), true);
        }
        if (!Y2.ORDERED.v(((AbstractC1078a) abstractC1184v1).f18426m)) {
            j$.util.W w9 = (j$.util.W) abstractC1184v1.G0(spliterator);
            long j10 = this.f18549s;
            long j11 = this.f18550t;
            if (j10 <= jL0) {
                long j12 = jL0 - j10;
                jMin = j11 >= 0 ? Math.min(j11, j12) : j12;
                j = 0;
            } else {
                jMin = j11;
                j = j10;
            }
            return AbstractC1184v1.c0(this, new C1181u3(w9, j, jMin), true);
        }
        return (G0) new C1185v2(this, abstractC1184v1, spliterator, intFunction, this.f18549s, this.f18550t).invoke();
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        return new C1170s2(this, interfaceC1136l2);
    }
}
