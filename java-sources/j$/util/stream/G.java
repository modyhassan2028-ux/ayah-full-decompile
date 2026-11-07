package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends I implements InterfaceC1131k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f18257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f18258d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        n(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18274a) {
            return new j$.util.E(((Long) this.f18275b).longValue());
        }
        return null;
    }

    static {
        Z2 z10 = Z2.LONG_VALUE;
        C1148o c1148o = new C1148o(5);
        C1148o c1148o2 = new C1148o(6);
        j$.util.E e10 = j$.util.E.f18051c;
        f18257c = new D(true, z10, e10, c1148o, c1148o2);
        f18258d = new D(false, z10, e10, new C1148o(5), new C1148o(6));
    }
}
