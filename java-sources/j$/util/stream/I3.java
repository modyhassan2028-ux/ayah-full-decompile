package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class I3 extends AbstractC1116h2 implements Q3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H3 f18287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(H3 h7, InterfaceC1136l2 interfaceC1136l2, boolean z10) {
        super(interfaceC1136l2);
        this.f18287e = h7;
        this.f18286d = z10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z10;
        if (this.f18285c) {
            z10 = true;
        } else {
            boolean zTest = this.f18287e.f18273t.test(obj);
            this.f18285c = !zTest;
            if (zTest) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        boolean z11 = this.f18286d;
        if (z11 && !z10) {
            this.f18284b++;
        }
        if (z11 || z10) {
            this.f18474a.accept(obj);
        }
    }

    @Override // j$.util.stream.Q3
    public final long h() {
        return this.f18284b;
    }
}
