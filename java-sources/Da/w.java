package Da;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient byte[][] f1404v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int[] f1405w;

    public w(byte[][] bArr, int[] iArr) {
        super(k.f1363u.f1364r);
        this.f1404v = bArr;
        this.f1405w = iArr;
    }

    @Override // Da.k
    public final int a() {
        return this.f1405w[this.f1404v.length - 1];
    }

    @Override // Da.k
    public final String b() {
        return new k(j()).b();
    }

    @Override // Da.k
    public final byte[] c() {
        return j();
    }

    @Override // Da.k
    public final byte d(int i10) {
        byte[][] bArr = this.f1404v;
        int length = bArr.length - 1;
        int[] iArr = this.f1405w;
        F9.n.m(iArr[length], i10, 1L);
        int iB = Ea.b.b(this, i10);
        return bArr[iB][(i10 - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // Da.k
    public final boolean e(int i10, byte[] bArr, int i11, int i12) {
        p251z9.j.e(bArr, "other");
        if (i10 < 0 || i10 > a() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = Ea.b.b(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f1405w;
            int i14 = iB == 0 ? 0 : iArr[iB - 1];
            int i15 = iArr[iB] - i14;
            byte[][] bArr2 = this.f1404v;
            int i16 = iArr[bArr2.length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!F9.n.f((i10 - i14) + i16, i11, iMin, bArr2[iB], bArr)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // Da.k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.a() == a() && f(kVar, a());
    }

    @Override // Da.k
    public final boolean f(k kVar, int i10) {
        p251z9.j.e(kVar, "other");
        if (a() - i10 >= 0) {
            int iB = Ea.b.b(this, 0);
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int[] iArr = this.f1405w;
                int i13 = iB == 0 ? 0 : iArr[iB - 1];
                int i14 = iArr[iB] - i13;
                byte[][] bArr = this.f1404v;
                int i15 = iArr[bArr.length + iB];
                int iMin = Math.min(i10, i14 + i13) - i11;
                if (kVar.e(i12, bArr[iB], (i11 - i13) + i15, iMin)) {
                    i12 += iMin;
                    i11 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // Da.k
    public final String g(Charset charset) {
        p251z9.j.e(charset, "charset");
        return new k(j()).g(charset);
    }

    @Override // Da.k
    public final k h(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = a();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "beginIndex=", " < 0").toString());
        }
        if (i11 > a()) {
            StringBuilder sbW = p123m2.c.w(i11, "endIndex=", " > length(");
            sbW.append(a());
            sbW.append(')');
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(i11, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && i11 == a()) {
            return this;
        }
        if (i10 == i11) {
            return k.f1363u;
        }
        int iB = Ea.b.b(this, i10);
        int iB2 = Ea.b.b(this, i11 - 1);
        byte[][] bArr = this.f1404v;
        byte[][] bArr2 = (byte[][]) p120l9.l.d0(bArr, iB, iB2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f1405w;
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? iArr2[iB - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new w(bArr2, iArr);
    }

    @Override // Da.k
    public final int hashCode() {
        int i10 = this.f1365s;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f1404v;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f1405w;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f1365s = i12;
        return i12;
    }

    @Override // Da.k
    public final k i() {
        return new k(j()).i();
    }

    @Override // Da.k
    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f1404v;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f1405w;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            p120l9.l.V(i12, i13, i13 + i15, bArr2[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // Da.k
    public final void l(h hVar, int i10) {
        int iB = Ea.b.b(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f1405w;
            int i12 = iB == 0 ? 0 : iArr[iB - 1];
            int i13 = iArr[iB] - i12;
            byte[][] bArr = this.f1404v;
            int i14 = iArr[bArr.length + iB];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            u uVar = new u(bArr[iB], i15, i15 + iMin, true);
            u uVar2 = hVar.f1361r;
            if (uVar2 == null) {
                uVar.g = uVar;
                uVar.f1400f = uVar;
                hVar.f1361r = uVar;
            } else {
                u uVar3 = uVar2.g;
                p251z9.j.b(uVar3);
                uVar3.b(uVar);
            }
            i11 += iMin;
            iB++;
        }
        hVar.f1362s += (long) i10;
    }

    @Override // Da.k
    public final String toString() {
        return new k(j()).toString();
    }
}
