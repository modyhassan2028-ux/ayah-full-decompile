package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class B2 extends AbstractC1195x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Q2 f18230c;

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        Q2 q10;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            q10 = new Q2();
        } else {
            q10 = new Q2((int) j);
        }
        this.f18230c = q10;
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        int[] iArr = (int[]) this.f18230c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC1136l2 interfaceC1136l2 = this.f18469a;
        interfaceC1136l2.c(length);
        int i10 = 0;
        if (!this.f18585b) {
            int length2 = iArr.length;
            while (i10 < length2) {
                interfaceC1136l2.accept(iArr[i10]);
                i10++;
            }
        } else {
            int length3 = iArr.length;
            while (i10 < length3) {
                int i11 = iArr[i10];
                if (interfaceC1136l2.e()) {
                    break;
                }
                interfaceC1136l2.accept(i11);
                i10++;
            }
        }
        interfaceC1136l2.end();
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        this.f18230c.accept(i10);
    }
}
