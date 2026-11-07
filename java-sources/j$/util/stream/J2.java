package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class J2 extends AbstractC1195x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f18296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18297d;

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18296c = new int[(int) j];
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18296c, 0, this.f18297d);
        long j = this.f18297d;
        InterfaceC1136l2 interfaceC1136l2 = this.f18469a;
        interfaceC1136l2.c(j);
        if (!this.f18585b) {
            while (i10 < this.f18297d) {
                interfaceC1136l2.accept(this.f18296c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18297d && !interfaceC1136l2.e()) {
                interfaceC1136l2.accept(this.f18296c[i10]);
                i10++;
            }
        }
        interfaceC1136l2.end();
        this.f18296c = null;
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        int[] iArr = this.f18296c;
        int i11 = this.f18297d;
        this.f18297d = i11 + 1;
        iArr[i11] = i10;
    }
}
