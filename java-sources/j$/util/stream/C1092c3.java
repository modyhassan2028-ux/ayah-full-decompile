package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1092c3 extends AbstractC1102e3 implements IntConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f18452c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    public C1092c3(int i10) {
        this.f18452c = new int[i10];
    }

    @Override // j$.util.stream.AbstractC1102e3
    public final void a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < j; i10++) {
            intConsumer.accept(this.f18452c[i10]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        int i11 = this.f18465b;
        this.f18465b = i11 + 1;
        this.f18452c[i11] = i10;
    }
}
