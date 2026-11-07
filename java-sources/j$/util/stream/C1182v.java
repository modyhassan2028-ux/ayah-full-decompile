package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1182v extends AbstractC1197y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18565s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1182v(AbstractC1078a abstractC1078a, int i10, int i11) {
        super(abstractC1078a, i10);
        this.f18565s = i11;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18565s) {
            case 0:
                return interfaceC1136l2;
            case 1:
                return new C1153p(this, interfaceC1136l2, 4);
            case 2:
                return new V(1, interfaceC1136l2);
            case 3:
                return new T(this, interfaceC1136l2, 4);
            case 4:
                return new C1094d0(interfaceC1136l2);
            default:
                return new C1089c0(this, interfaceC1136l2, 3);
        }
    }
}
