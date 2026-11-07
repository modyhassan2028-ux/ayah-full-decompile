package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1172t extends AbstractC1119i0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18545s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1172t(AbstractC1078a abstractC1078a, int i10, int i11) {
        super(abstractC1078a, i10);
        this.f18545s = i11;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        switch (this.f18545s) {
            case 0:
                return new C1153p(this, interfaceC1136l2, 3);
            case 1:
                return new V(0, interfaceC1136l2);
            case 2:
                return new T(this, interfaceC1136l2, 3);
            case 3:
                return new C1089c0(this, interfaceC1136l2, 1);
            case 4:
                return interfaceC1136l2;
            default:
                return new C1089c0(this, interfaceC1136l2, 4);
        }
    }
}
