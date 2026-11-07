package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1178u0 extends AbstractC1083b {
    public final j$.util.concurrent.t j;

    public C1178u0(j$.util.concurrent.t tVar, AbstractC1078a abstractC1078a, Spliterator spliterator) {
        super(abstractC1078a, spliterator);
        this.j = tVar;
    }

    public C1178u0(C1178u0 c1178u0, Spliterator spliterator) {
        super(c1178u0, spliterator);
        this.j = c1178u0.j;
    }

    @Override // j$.util.stream.AbstractC1093d
    public final AbstractC1093d c(Spliterator spliterator) {
        return new C1178u0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1093d
    public final Object a() {
        AbstractC1184v1 abstractC1184v1 = this.f18453a;
        AbstractC1168s0 abstractC1168s0 = (AbstractC1168s0) ((Supplier) this.j.f18130c).get();
        abstractC1184v1.E0(this.f18454b, abstractC1168s0);
        boolean z10 = abstractC1168s0.f18541b;
        if (z10 == ((EnumC1173t0) this.j.f18129b).f18548b) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            AtomicReference atomicReference = this.f18440h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC1083b
    public final Object h() {
        return Boolean.valueOf(!((EnumC1173t0) this.j.f18129b).f18548b);
    }
}
