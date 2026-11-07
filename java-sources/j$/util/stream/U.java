package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends Z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18372t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(AbstractC1078a abstractC1078a, int i10, Object obj, int i11) {
        super(abstractC1078a, i10);
        this.f18371s = i11;
        this.f18372t = obj;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18371s) {
            case 0:
                return new T(this, interfaceC1136l2, 1);
            case 1:
                return new W(this, interfaceC1136l2);
            case 2:
                return new C1133l(this, interfaceC1136l2, 4);
            default:
                return new Y1(this, interfaceC1136l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AbstractC1079a0 abstractC1079a0, IntConsumer intConsumer) {
        super(abstractC1079a0, 0);
        this.f18371s = 0;
        this.f18372t = intConsumer;
    }
}
