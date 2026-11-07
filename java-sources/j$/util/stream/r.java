package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC1197y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18530t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC1078a abstractC1078a, int i10, Object obj, int i11) {
        super(abstractC1078a, i10);
        this.f18529s = i11;
        this.f18530t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC1202z abstractC1202z, DoubleConsumer doubleConsumer) {
        super(abstractC1202z, 0);
        this.f18529s = 2;
        this.f18530t = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18529s) {
            case 0:
                return new C1153p(this, interfaceC1136l2, 1);
            case 1:
                return new C1177u(this, interfaceC1136l2);
            case 2:
                return new C1153p(this, interfaceC1136l2, 5);
            case 3:
                return new C1133l(this, interfaceC1136l2, 6);
            default:
                return new Y1(this, interfaceC1136l2);
        }
    }
}
