package ra;

import K.y0;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Da.t f21661c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21664f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21659a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21660b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f21662d = new d[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21663e = 7;

    public e(s sVar) {
        this.f21661c = Y2.a.p(sVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f21662d.length;
            while (true) {
                length--;
                i11 = this.f21663e;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                d dVar = this.f21662d[length];
                p251z9.j.b(dVar);
                int i13 = dVar.f21658c;
                i10 -= i13;
                this.g -= i13;
                this.f21664f--;
                i12++;
            }
            d[] dVarArr = this.f21662d;
            System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f21664f);
            this.f21663e += i12;
        }
        return i12;
    }

    public final Da.k b(int i10) throws IOException {
        if (i10 >= 0) {
            d[] dVarArr = g.f21672a;
            if (i10 <= dVarArr.length - 1) {
                return dVarArr[i10].f21656a;
            }
        }
        int length = this.f21663e + 1 + (i10 - g.f21672a.length);
        if (length >= 0) {
            d[] dVarArr2 = this.f21662d;
            if (length < dVarArr2.length) {
                d dVar = dVarArr2[length];
                p251z9.j.b(dVar);
                return dVar.f21656a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(d dVar) {
        this.f21660b.add(dVar);
        int i10 = dVar.f21658c;
        int i11 = this.f21659a;
        if (i10 > i11) {
            d[] dVarArr = this.f21662d;
            p120l9.l.e0(0, dVarArr.length, null, dVarArr);
            this.f21663e = this.f21662d.length - 1;
            this.f21664f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i10) - i11);
        int i12 = this.f21664f + 1;
        d[] dVarArr2 = this.f21662d;
        if (i12 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f21663e = this.f21662d.length - 1;
            this.f21662d = dVarArr3;
        }
        int i13 = this.f21663e;
        this.f21663e = i13 - 1;
        this.f21662d[i13] = dVar;
        this.f21664f++;
        this.g += i10;
    }

    public final Da.k d() {
        Da.t tVar = this.f21661c;
        byte b5 = tVar.readByte();
        byte[] bArr = la.c.f19448a;
        int i10 = b5 & 255;
        int i11 = 0;
        boolean z10 = (b5 & 128) == 128;
        long jE = e(i10, 127);
        if (!z10) {
            return tVar.k(jE);
        }
        Da.h hVar = new Da.h();
        int[] iArr = z.f21765a;
        p251z9.j.e(tVar, "source");
        y0 y0Var = z.f21767c;
        y0 y0Var2 = y0Var;
        int i12 = 0;
        for (long j = 0; j < jE; j++) {
            byte b10 = tVar.readByte();
            byte[] bArr2 = la.c.f19448a;
            i11 = (i11 << 8) | (b10 & 255);
            i12 += 8;
            while (i12 >= 8) {
                y0[] y0VarArr = (y0[]) y0Var2.f4843t;
                p251z9.j.b(y0VarArr);
                y0Var2 = y0VarArr[(i11 >>> (i12 - 8)) & 255];
                p251z9.j.b(y0Var2);
                if (((y0[]) y0Var2.f4843t) == null) {
                    hVar.O(y0Var2.f4841r);
                    i12 -= y0Var2.f4842s;
                    y0Var2 = y0Var;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            y0[] y0VarArr2 = (y0[]) y0Var2.f4843t;
            p251z9.j.b(y0VarArr2);
            y0 y0Var3 = y0VarArr2[(i11 << (8 - i12)) & 255];
            p251z9.j.b(y0Var3);
            int i13 = y0Var3.f4842s;
            if (((y0[]) y0Var3.f4843t) != null || i13 > i12) {
                break;
            }
            hVar.O(y0Var3.f4841r);
            i12 -= i13;
            y0Var2 = y0Var;
        }
        return hVar.k(hVar.f1362s);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b5 = this.f21661c.readByte();
            byte[] bArr = la.c.f19448a;
            int i14 = b5 & 255;
            if ((b5 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b5 & 127) << i13;
            i13 += 7;
        }
    }
}
