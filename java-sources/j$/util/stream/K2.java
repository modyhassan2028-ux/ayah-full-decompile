package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class K2 extends AbstractC1200y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f18304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18305d;

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18304c = new long[(int) j];
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18304c, 0, this.f18305d);
        long j = this.f18305d;
        InterfaceC1136l2 interfaceC1136l2 = this.f18471a;
        interfaceC1136l2.c(j);
        if (!this.f18588b) {
            while (i10 < this.f18305d) {
                interfaceC1136l2.accept(this.f18304c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18305d && !interfaceC1136l2.e()) {
                interfaceC1136l2.accept(this.f18304c[i10]);
                i10++;
            }
        }
        interfaceC1136l2.end();
        this.f18304c = null;
    }

    @Override // j$.util.stream.InterfaceC1131k2, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        long[] jArr = this.f18304c;
        int i10 = this.f18305d;
        this.f18305d = i10 + 1;
        jArr[i10] = j;
    }
}
