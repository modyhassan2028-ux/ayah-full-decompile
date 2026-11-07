package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class C2 extends AbstractC1200y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S2 f18234c;

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        S2 s10;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            s10 = new S2();
        } else {
            s10 = new S2((int) j);
        }
        this.f18234c = s10;
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        long[] jArr = (long[]) this.f18234c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC1136l2 interfaceC1136l2 = this.f18471a;
        interfaceC1136l2.c(length);
        int i10 = 0;
        if (!this.f18588b) {
            int length2 = jArr.length;
            while (i10 < length2) {
                interfaceC1136l2.accept(jArr[i10]);
                i10++;
            }
        } else {
            int length3 = jArr.length;
            while (i10 < length3) {
                long j = jArr[i10];
                if (interfaceC1136l2.e()) {
                    break;
                }
                interfaceC1136l2.accept(j);
                i10++;
            }
        }
        interfaceC1136l2.end();
    }

    @Override // j$.util.stream.InterfaceC1131k2, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        this.f18234c.accept(j);
    }
}
