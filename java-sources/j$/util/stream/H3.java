package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class H3 extends AbstractC1086b2 implements P3 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Predicate f18273t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H3(AbstractC1096d2 abstractC1096d2, int i10, Predicate predicate, int i11) {
        super(abstractC1096d2, i10);
        this.f18272s = i11;
        this.f18273t = predicate;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator N0(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        switch (this.f18272s) {
            case 0:
                return Y2.ORDERED.v(abstractC1078a.f18426m) ? M0(abstractC1078a, spliterator, new C1084b0(3)).spliterator() : new W3(abstractC1078a.G0(spliterator), this.f18273t, 1);
            default:
                return Y2.ORDERED.v(abstractC1078a.f18426m) ? M0(abstractC1078a, spliterator, new C1084b0(3)).spliterator() : new W3(abstractC1078a.G0(spliterator), this.f18273t, 0);
        }
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 M0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f18272s) {
            case 0:
                return (G0) new S3(this, abstractC1184v1, spliterator, intFunction).invoke();
            default:
                return (G0) new R3(this, abstractC1184v1, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18272s) {
            case 0:
                return new C1128k(this, interfaceC1136l2);
            default:
                return new I3(this, interfaceC1136l2, false);
        }
    }

    @Override // j$.util.stream.P3
    public Q3 i(InterfaceC1198y0 interfaceC1198y0, boolean z10) {
        return new I3(this, interfaceC1198y0, z10);
    }
}
