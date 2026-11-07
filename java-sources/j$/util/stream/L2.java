package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class L2 extends AbstractC1205z2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f18310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18311e;

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18310d = new Object[(int) j];
    }

    @Override // j$.util.stream.AbstractC1116h2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18310d, 0, this.f18311e, this.f18594b);
        long j = this.f18311e;
        InterfaceC1136l2 interfaceC1136l2 = this.f18474a;
        interfaceC1136l2.c(j);
        if (!this.f18595c) {
            while (i10 < this.f18311e) {
                interfaceC1136l2.accept(this.f18310d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18311e && !interfaceC1136l2.e()) {
                interfaceC1136l2.accept(this.f18310d[i10]);
                i10++;
            }
        }
        interfaceC1136l2.end();
        this.f18310d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f18310d;
        int i10 = this.f18311e;
        this.f18311e = i10 + 1;
        objArr[i10] = obj;
    }
}
