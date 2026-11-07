package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends I implements InterfaceC1126j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f18251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f18252d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        n(Integer.valueOf(i10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18274a) {
            return new j$.util.D(((Integer) this.f18275b).intValue());
        }
        return null;
    }

    static {
        Z2 z10 = Z2.INT_VALUE;
        C1148o c1148o = new C1148o(3);
        C1148o c1148o2 = new C1148o(4);
        j$.util.D d5 = j$.util.D.f18048c;
        f18251c = new D(true, z10, d5, c1148o, c1148o2);
        f18252d = new D(false, z10, d5, new C1148o(3), new C1148o(4));
    }
}
