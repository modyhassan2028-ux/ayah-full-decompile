package ra;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Da.h f21665a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21667c;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21671h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21666b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21668d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d[] f21669e = new d[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21670f = 7;

    public f(Da.h hVar) {
        this.f21665a = hVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f21669e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f21670f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                d dVar = this.f21669e[length];
                p251z9.j.b(dVar);
                i10 -= dVar.f21658c;
                int i13 = this.f21671h;
                d dVar2 = this.f21669e[length];
                p251z9.j.b(dVar2);
                this.f21671h = i13 - dVar2.f21658c;
                this.g--;
                i12++;
                length--;
            }
            d[] dVarArr = this.f21669e;
            int i14 = i11 + 1;
            System.arraycopy(dVarArr, i14, dVarArr, i14 + i12, this.g);
            d[] dVarArr2 = this.f21669e;
            int i15 = this.f21670f + 1;
            Arrays.fill(dVarArr2, i15, i15 + i12, (Object) null);
            this.f21670f += i12;
        }
    }

    public final void b(d dVar) {
        int i10 = dVar.f21658c;
        int i11 = this.f21668d;
        if (i10 > i11) {
            d[] dVarArr = this.f21669e;
            p120l9.l.e0(0, dVarArr.length, null, dVarArr);
            this.f21670f = this.f21669e.length - 1;
            this.g = 0;
            this.f21671h = 0;
            return;
        }
        a((this.f21671h + i10) - i11);
        int i12 = this.g + 1;
        d[] dVarArr2 = this.f21669e;
        if (i12 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f21670f = this.f21669e.length - 1;
            this.f21669e = dVarArr3;
        }
        int i13 = this.f21670f;
        this.f21670f = i13 - 1;
        this.f21669e[i13] = dVar;
        this.g++;
        this.f21671h += i10;
    }

    public final void c(Da.k kVar) throws EOFException {
        p251z9.j.e(kVar, "data");
        int[] iArr = z.f21765a;
        int iA = kVar.a();
        long j = 0;
        long j10 = 0;
        for (int i10 = 0; i10 < iA; i10++) {
            byte bD = kVar.d(i10);
            byte[] bArr = la.c.f19448a;
            j10 += (long) z.f21766b[bD & 255];
        }
        int i11 = (int) ((j10 + ((long) 7)) >> 3);
        int iA2 = kVar.a();
        Da.h hVar = this.f21665a;
        if (i11 >= iA2) {
            e(kVar.a(), 127, 0);
            hVar.N(kVar);
            return;
        }
        Da.h hVar2 = new Da.h();
        int[] iArr2 = z.f21765a;
        int iA3 = kVar.a();
        int i12 = 0;
        for (int i13 = 0; i13 < iA3; i13++) {
            byte bD2 = kVar.d(i13);
            byte[] bArr2 = la.c.f19448a;
            int i14 = bD2 & 255;
            int i15 = z.f21765a[i14];
            byte b5 = z.f21766b[i14];
            j = (j << b5) | ((long) i15);
            i12 += b5;
            while (i12 >= 8) {
                i12 -= 8;
                hVar2.O((int) (j >> i12));
            }
        }
        if (i12 > 0) {
            hVar2.O((int) ((j << (8 - i12)) | (255 >>> i12)));
        }
        Da.k kVarK = hVar2.k(hVar2.f1362s);
        e(kVarK.a(), 127, 128);
        hVar.N(kVarK);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f21667c) {
            int i10 = this.f21666b;
            if (i10 < this.f21668d) {
                e(i10, 31, 32);
            }
            this.f21667c = false;
            this.f21666b = Integer.MAX_VALUE;
            e(this.f21668d, 31, 32);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            Da.k kVarI = dVar.f21656a.i();
            Da.k kVar = dVar.f21657b;
            Integer num = (Integer) g.f21673b.get(kVarI);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    d[] dVarArr = g.f21672a;
                    if (p251z9.j.a(dVarArr[iIntValue].f21657b, kVar)) {
                        length = length2;
                    } else if (p251z9.j.a(dVarArr[length2].f21657b, kVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f21669e.length;
                for (int i12 = this.f21670f + 1; i12 < length3; i12++) {
                    d dVar2 = this.f21669e[i12];
                    p251z9.j.b(dVar2);
                    if (p251z9.j.a(dVar2.f21656a, kVarI)) {
                        d dVar3 = this.f21669e[i12];
                        p251z9.j.b(dVar3);
                        if (p251z9.j.a(dVar3.f21657b, kVar)) {
                            length2 = g.f21672a.length + (i12 - this.f21670f);
                            break;
                        } else if (length == -1) {
                            length = (i12 - this.f21670f) + g.f21672a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.f21665a.O(64);
                c(kVarI);
                c(kVar);
                b(dVar);
            } else {
                Da.k kVar2 = d.f21651d;
                kVarI.getClass();
                p251z9.j.e(kVar2, "prefix");
                if (!kVarI.f(kVar2, kVar2.a()) || p251z9.j.a(d.f21655i, kVarI)) {
                    e(length, 63, 64);
                    c(kVar);
                    b(dVar);
                } else {
                    e(length, 15, 0);
                    c(kVar);
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        Da.h hVar = this.f21665a;
        if (i10 < i11) {
            hVar.O(i10 | i12);
            return;
        }
        hVar.O(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            hVar.O(128 | (i13 & 127));
            i13 >>>= 7;
        }
        hVar.O(i13);
    }
}
