package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1097d3 extends AbstractC1102e3 implements LongConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f18459c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    public C1097d3(int i10) {
        this.f18459c = new long[i10];
    }

    @Override // j$.util.stream.AbstractC1102e3
    public final void a(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < j; i10++) {
            longConsumer.accept(this.f18459c[i10]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i10 = this.f18465b;
        this.f18465b = i10 + 1;
        this.f18459c[i10] = j;
    }
}
