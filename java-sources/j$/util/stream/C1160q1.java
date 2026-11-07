package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1160q1 extends AbstractC1164r1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object[] f18525h;

    public C1160q1(Spliterator spliterator, AbstractC1184v1 abstractC1184v1, Object[] objArr) {
        super(spliterator, abstractC1184v1, objArr.length);
        this.f18525h = objArr;
    }

    public C1160q1(C1160q1 c1160q1, Spliterator spliterator, long j, long j10) {
        super(c1160q1, spliterator, j, j10, c1160q1.f18525h.length);
        this.f18525h = c1160q1.f18525h;
    }

    @Override // j$.util.stream.AbstractC1164r1
    public final AbstractC1164r1 a(Spliterator spliterator, long j, long j10) {
        return new C1160q1(this, spliterator, j, j10);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i10 = this.f18536f;
        if (i10 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18536f));
        }
        Object[] objArr = this.f18525h;
        this.f18536f = i10 + 1;
        objArr[i10] = obj;
    }
}
