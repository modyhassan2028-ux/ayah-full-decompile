package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends AbstractC1106f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18377b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i10, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18377b = i10;
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        switch (this.f18377b) {
            case 0:
                this.f18469a.accept(i10);
                break;
            default:
                this.f18469a.accept(i10);
                break;
        }
    }
}
