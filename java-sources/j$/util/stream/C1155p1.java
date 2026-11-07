package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1155p1 extends AbstractC1164r1 implements InterfaceC1131k2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f18520h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    public C1155p1(Spliterator spliterator, AbstractC1184v1 abstractC1184v1, long[] jArr) {
        super(spliterator, abstractC1184v1, jArr.length);
        this.f18520h = jArr;
    }

    public C1155p1(C1155p1 c1155p1, Spliterator spliterator, long j, long j10) {
        super(c1155p1, spliterator, j, j10, c1155p1.f18520h.length);
        this.f18520h = c1155p1.f18520h;
    }

    @Override // j$.util.stream.AbstractC1164r1
    public final AbstractC1164r1 a(Spliterator spliterator, long j, long j10) {
        return new C1155p1(this, spliterator, j, j10);
    }

    @Override // j$.util.stream.AbstractC1164r1, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        int i10 = this.f18536f;
        if (i10 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18536f));
        }
        long[] jArr = this.f18520h;
        this.f18536f = i10 + 1;
        jArr[i10] = j;
    }
}
