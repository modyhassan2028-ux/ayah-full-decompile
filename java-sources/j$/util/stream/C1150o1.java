package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1150o1 extends AbstractC1164r1 implements InterfaceC1126j2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f18514h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1126j2
    public final /* synthetic */ void d(Integer num) {
        AbstractC1184v1.G(this, num);
    }

    public C1150o1(Spliterator spliterator, AbstractC1184v1 abstractC1184v1, int[] iArr) {
        super(spliterator, abstractC1184v1, iArr.length);
        this.f18514h = iArr;
    }

    public C1150o1(C1150o1 c1150o1, Spliterator spliterator, long j, long j10) {
        super(c1150o1, spliterator, j, j10, c1150o1.f18514h.length);
        this.f18514h = c1150o1.f18514h;
    }

    @Override // j$.util.stream.AbstractC1164r1
    public final AbstractC1164r1 a(Spliterator spliterator, long j, long j10) {
        return new C1150o1(this, spliterator, j, j10);
    }

    @Override // j$.util.stream.AbstractC1164r1, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        int i11 = this.f18536f;
        if (i11 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18536f));
        }
        int[] iArr = this.f18514h;
        this.f18536f = i11 + 1;
        iArr[i11] = i10;
    }
}
