package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class F2 extends AbstractC1114h0 implements P3 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18256s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F2(AbstractC1078a abstractC1078a, int i10, int i11) {
        super(abstractC1078a, i10);
        this.f18256s = i11;
    }

    @Override // j$.util.stream.AbstractC1078a
    public Spliterator N0(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        switch (this.f18256s) {
            case 1:
                return Y2.ORDERED.v(abstractC1078a.f18426m) ? M0(abstractC1078a, spliterator, new C1084b0(19)).spliterator() : new V3((j$.util.c0) abstractC1078a.G0(spliterator), 1);
            case 2:
                return Y2.ORDERED.v(abstractC1078a.f18426m) ? M0(abstractC1078a, spliterator, new C1084b0(20)).spliterator() : new V3((j$.util.c0) abstractC1078a.G0(spliterator), 0);
            default:
                return super.N0(abstractC1078a, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 M0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f18256s) {
            case 0:
                if (Y2.SORTED.v(((AbstractC1078a) abstractC1184v1).f18426m)) {
                    return abstractC1184v1.k0(spliterator, false, intFunction);
                }
                long[] jArr = (long[]) ((E0) abstractC1184v1.k0(spliterator, true, intFunction)).b();
                Arrays.sort(jArr);
                return new C1130k1(jArr);
            case 1:
                return (G0) new S3(this, abstractC1184v1, spliterator, intFunction).invoke();
            default:
                return (G0) new R3(this, abstractC1184v1, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18256s) {
            case 0:
                Objects.requireNonNull(interfaceC1136l2);
                if (Y2.SORTED.v(i10)) {
                    return interfaceC1136l2;
                }
                return Y2.SIZED.v(i10) ? new K2(interfaceC1136l2) : new C2(interfaceC1136l2);
            case 1:
                return new L3(this, interfaceC1136l2);
            default:
                return new M3(this, interfaceC1136l2, false);
        }
    }

    @Override // j$.util.stream.P3
    public Q3 i(InterfaceC1198y0 interfaceC1198y0, boolean z10) {
        return new M3(this, interfaceC1198y0, z10);
    }
}
