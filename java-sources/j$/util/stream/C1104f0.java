package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1104f0 extends AbstractC1119i0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18468t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1104f0(AbstractC1078a abstractC1078a, int i10, Object obj, int i11) {
        super(abstractC1078a, i10);
        this.f18467s = i11;
        this.f18468t = obj;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18467s) {
            case 0:
                return new C1099e0(this, interfaceC1136l2);
            case 1:
                return new C1089c0(this, interfaceC1136l2, 5);
            case 2:
                return new Y1(this, interfaceC1136l2);
            default:
                return new C1133l(this, interfaceC1136l2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104f0(AbstractC1124j0 abstractC1124j0, LongConsumer longConsumer) {
        super(abstractC1124j0, 0);
        this.f18467s = 1;
        this.f18468t = longConsumer;
    }
}
