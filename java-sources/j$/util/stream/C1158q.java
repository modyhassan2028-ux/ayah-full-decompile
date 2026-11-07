package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1158q extends AbstractC1091c2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18524t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1158q(AbstractC1078a abstractC1078a, int i10, Object obj, int i11) {
        super(abstractC1078a, i10);
        this.f18523s = i11;
        this.f18524t = obj;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18523s) {
            case 0:
                return new C1153p(this, interfaceC1136l2, 0);
            case 1:
                return new T(this, interfaceC1136l2, 0);
            case 2:
                return new C1089c0(this, interfaceC1136l2, 0);
            case 3:
                return new C1133l(this, interfaceC1136l2, 1);
            case 4:
                return new C1133l(this, interfaceC1136l2, 2);
            case 5:
                return new C1133l(this, interfaceC1136l2, 3);
            default:
                return new C1128k(this, interfaceC1136l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158q(AbstractC1096d2 abstractC1096d2, Consumer consumer) {
        super(abstractC1096d2, 0);
        this.f18523s = 3;
        this.f18524t = consumer;
    }
}
