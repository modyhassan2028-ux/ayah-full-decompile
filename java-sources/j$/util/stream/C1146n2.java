package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1146n2 extends AbstractC1086b2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18510t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146n2(AbstractC1096d2 abstractC1096d2, int i10, long j, long j10) {
        super(abstractC1096d2, i10);
        this.f18509s = j;
        this.f18510t = j10;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator N0(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        long jL0 = abstractC1078a.l0(spliterator);
        if (jL0 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator spliteratorG0 = abstractC1078a.G0(spliterator);
            long j = this.f18509s;
            return new C1171s3(spliteratorG0, j, AbstractC1184v1.a0(j, this.f18510t));
        }
        if (Y2.ORDERED.v(abstractC1078a.f18426m)) {
            return ((G0) new C1185v2(this, abstractC1078a, spliterator, new C1084b0(3), this.f18509s, this.f18510t).invoke()).spliterator();
        }
        Spliterator spliteratorG1 = abstractC1078a.G0(spliterator);
        long j10 = this.f18509s;
        long j11 = this.f18510t;
        if (j10 <= jL0) {
            long jMin = jL0 - j10;
            if (j11 >= 0) {
                jMin = Math.min(j11, jMin);
            }
            j11 = jMin;
            j10 = 0;
        }
        return new C1201y3(spliteratorG1, j10, j11);
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
            return AbstractC1184v1.b0(abstractC1184v1, AbstractC1184v1.Y(abstractC1078a.L0(), spliterator, this.f18509s, this.f18510t), true, intFunction);
        }
        if (!Y2.ORDERED.v(((AbstractC1078a) abstractC1184v1).f18426m)) {
            Spliterator spliteratorG0 = abstractC1184v1.G0(spliterator);
            long j10 = this.f18509s;
            long j11 = this.f18510t;
            if (j10 <= jL0) {
                long j12 = jL0 - j10;
                jMin = j11 >= 0 ? Math.min(j11, j12) : j12;
                j = 0;
            } else {
                jMin = j11;
                j = j10;
            }
            return AbstractC1184v1.b0(this, new C1201y3(spliteratorG0, j, jMin), true, intFunction);
        }
        return (G0) new C1185v2(this, abstractC1184v1, spliterator, intFunction, this.f18509s, this.f18510t).invoke();
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        return new C1141m2(this, interfaceC1136l2);
    }
}
