package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends I implements InterfaceC1121i2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f18246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f18247d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        n(Double.valueOf(d5));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18274a) {
            return new j$.util.C(((Double) this.f18275b).doubleValue());
        }
        return null;
    }

    static {
        Z2 z10 = Z2.DOUBLE_VALUE;
        C1148o c1148o = new C1148o(1);
        C1148o c1148o2 = new C1148o(2);
        j$.util.C c10 = j$.util.C.f18045c;
        f18246c = new D(true, z10, c10, c1148o, c1148o2);
        f18247d = new D(false, z10, c10, new C1148o(1), new C1148o(2));
    }
}
