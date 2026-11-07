package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.InterfaceC0674c;
import p120l9.l;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends u0 {
    public int j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11083l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11085n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I[] f11081i = new I[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f11082k = new int[16];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f11084m = new Object[16];

    public final void S() {
        this.j = 0;
        this.f11083l = 0;
        l.e0(0, this.f11085n, null, this.f11084m);
        this.f11085n = 0;
    }

    public final void T(InterfaceC0674c interfaceC0674c, A0 a9, h hVar) {
        int i10;
        int i11;
        if (V()) {
            A a10 = new A(this);
            J j = (J) a10.f1437e;
            do {
                j.f11081i[a10.f1434b].a(a10, interfaceC0674c, a9, hVar);
                int i12 = a10.f1434b;
                i10 = j.j;
                if (i12 >= i10) {
                    break;
                }
                I i13 = j.f11081i[i12];
                a10.f1435c += i13.f11079a;
                a10.f1436d += i13.f11080b;
                i11 = i12 + 1;
                a10.f1434b = i11;
            } while (i11 < i10);
        }
        S();
    }

    public final boolean U() {
        return this.j == 0;
    }

    public final boolean V() {
        return this.j != 0;
    }

    public final void W(I i10) {
        int i11 = this.j;
        I[] iArr = this.f11081i;
        if (i11 == iArr.length) {
            I[] iArr2 = new I[(i11 > 1024 ? 1024 : i11) + i11];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f11081i = iArr2;
        }
        int i12 = this.f11083l;
        int i13 = i10.f11079a;
        int i14 = i10.f11080b;
        int i15 = i12 + i13;
        int[] iArr3 = this.f11082k;
        int length = iArr3.length;
        if (i15 > length) {
            int i16 = (length > 1024 ? 1024 : length) + length;
            if (i16 >= i15) {
                i15 = i16;
            }
            int[] iArr4 = new int[i15];
            l.W(0, 0, length, iArr3, iArr4);
            this.f11082k = iArr4;
        }
        int i17 = this.f11085n + i14;
        Object[] objArr = this.f11084m;
        int length2 = objArr.length;
        if (i17 > length2) {
            int i18 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i18 >= i17) {
                i17 = i18;
            }
            Object[] objArr2 = new Object[i17];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f11084m = objArr2;
        }
        I[] iArr5 = this.f11081i;
        int i19 = this.j;
        this.j = i19 + 1;
        iArr5[i19] = i10;
        this.f11083l += i10.f11079a;
        this.f11085n += i14;
    }
}
