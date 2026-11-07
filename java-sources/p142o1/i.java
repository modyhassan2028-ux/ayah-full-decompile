package p142o1;

import Aa.a;
import android.support.v4.media.session.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20256a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20257b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f20258c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f20259d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f20260e = new float[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f20261f = new int[16];
    public int[] g = new int[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20262h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20263i = -1;
    public final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f20264k;

    public i(d dVar, a aVar) {
        this.j = dVar;
        this.f20264k = aVar;
        clear();
    }

    @Override // p142o1.b
    public final float a(int i10) {
        int i11 = this.f20262h;
        int i12 = this.f20263i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f20260e[i12];
            }
            i12 = this.g[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p142o1.b
    public final float b(h hVar, boolean z10) {
        int[] iArr;
        int i10;
        int iN = n(hVar);
        if (iN == -1) {
            return 0.0f;
        }
        int i11 = hVar.f20247b;
        int i12 = i11 % 16;
        int[] iArr2 = this.f20257b;
        int i13 = iArr2[i12];
        if (i13 != -1) {
            if (this.f20259d[i13] == i11) {
                int[] iArr3 = this.f20258c;
                iArr2[i12] = iArr3[i13];
                iArr3[i13] = -1;
            } else {
                while (true) {
                    iArr = this.f20258c;
                    i10 = iArr[i13];
                    if (i10 == -1 || this.f20259d[i10] == i11) {
                        break;
                    }
                    i13 = i10;
                }
                if (i10 != -1 && this.f20259d[i10] == i11) {
                    iArr[i13] = iArr[i10];
                    iArr[i10] = -1;
                }
            }
        }
        float f3 = this.f20260e[iN];
        if (this.f20263i == iN) {
            this.f20263i = this.g[iN];
        }
        this.f20259d[iN] = -1;
        int[] iArr4 = this.f20261f;
        int i14 = iArr4[iN];
        if (i14 != -1) {
            int[] iArr5 = this.g;
            iArr5[i14] = iArr5[iN];
        }
        int i15 = this.g[iN];
        if (i15 != -1) {
            iArr4[i15] = iArr4[iN];
        }
        this.f20262h--;
        hVar.f20254k--;
        if (z10) {
            hVar.b(this.j);
        }
        return f3;
    }

    @Override // p142o1.b
    public final float c(c cVar, boolean z10) {
        float f3 = f(cVar.f20222a);
        b(cVar.f20222a, z10);
        i iVar = (i) cVar.f20225d;
        int i10 = iVar.f20262h;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = iVar.f20259d[i12];
            if (i13 != -1) {
                i(((h[]) this.f20264k.f557u)[i13], iVar.f20260e[i12] * f3, z10);
                i11++;
            }
            i12++;
        }
        return f3;
    }

    @Override // p142o1.b
    public final void clear() {
        int i10 = this.f20262h;
        for (int i11 = 0; i11 < i10; i11++) {
            h hVarH = h(i11);
            if (hVarH != null) {
                hVarH.b(this.j);
            }
        }
        for (int i12 = 0; i12 < this.f20256a; i12++) {
            this.f20259d[i12] = -1;
            this.f20258c[i12] = -1;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            this.f20257b[i13] = -1;
        }
        this.f20262h = 0;
        this.f20263i = -1;
    }

    @Override // p142o1.b
    public final int d() {
        return this.f20262h;
    }

    @Override // p142o1.b
    public final void e(h hVar, float f3) {
        if (f3 > -0.001f && f3 < 0.001f) {
            b(hVar, true);
            return;
        }
        int i10 = 0;
        if (this.f20262h == 0) {
            m(0, hVar, f3);
            l(hVar, 0);
            this.f20263i = 0;
            return;
        }
        int iN = n(hVar);
        if (iN != -1) {
            this.f20260e[iN] = f3;
            return;
        }
        int i11 = this.f20262h + 1;
        int i12 = this.f20256a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f20259d = Arrays.copyOf(this.f20259d, i13);
            this.f20260e = Arrays.copyOf(this.f20260e, i13);
            this.f20261f = Arrays.copyOf(this.f20261f, i13);
            this.g = Arrays.copyOf(this.g, i13);
            this.f20258c = Arrays.copyOf(this.f20258c, i13);
            for (int i14 = this.f20256a; i14 < i13; i14++) {
                this.f20259d[i14] = -1;
                this.f20258c[i14] = -1;
            }
            this.f20256a = i13;
        }
        int i15 = this.f20262h;
        int i16 = this.f20263i;
        int i17 = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = this.f20259d[i16];
            int i20 = hVar.f20247b;
            if (i19 == i20) {
                this.f20260e[i16] = f3;
                return;
            }
            if (i19 < i20) {
                i17 = i16;
            }
            i16 = this.g[i16];
            if (i16 == -1) {
                break;
            }
        }
        while (true) {
            if (i10 >= this.f20256a) {
                i10 = -1;
                break;
            } else if (this.f20259d[i10] == -1) {
                break;
            } else {
                i10++;
            }
        }
        m(i10, hVar, f3);
        if (i17 != -1) {
            this.f20261f[i10] = i17;
            int[] iArr = this.g;
            iArr[i10] = iArr[i17];
            iArr[i17] = i10;
        } else {
            this.f20261f[i10] = -1;
            if (this.f20262h > 0) {
                this.g[i10] = this.f20263i;
                this.f20263i = i10;
            } else {
                this.g[i10] = -1;
            }
        }
        int i21 = this.g[i10];
        if (i21 != -1) {
            this.f20261f[i21] = i10;
        }
        l(hVar, i10);
    }

    @Override // p142o1.b
    public final float f(h hVar) {
        int iN = n(hVar);
        if (iN != -1) {
            return this.f20260e[iN];
        }
        return 0.0f;
    }

    @Override // p142o1.b
    public final boolean g(h hVar) {
        return n(hVar) != -1;
    }

    @Override // p142o1.b
    public final h h(int i10) {
        int i11 = this.f20262h;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f20263i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return ((h[]) this.f20264k.f557u)[this.f20259d[i12]];
            }
            i12 = this.g[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p142o1.b
    public final void i(h hVar, float f3, boolean z10) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int iN = n(hVar);
            if (iN == -1) {
                e(hVar, f3);
                return;
            }
            float[] fArr = this.f20260e;
            float f7 = fArr[iN] + f3;
            fArr[iN] = f7;
            if (f7 <= -0.001f || f7 >= 0.001f) {
                return;
            }
            fArr[iN] = 0.0f;
            b(hVar, z10);
        }
    }

    @Override // p142o1.b
    public final void j(float f3) {
        int i10 = this.f20262h;
        int i11 = this.f20263i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f20260e;
            fArr[i11] = fArr[i11] / f3;
            i11 = this.g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // p142o1.b
    public final void k() {
        int i10 = this.f20262h;
        int i11 = this.f20263i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f20260e;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public final void l(h hVar, int i10) {
        int[] iArr;
        int i11 = hVar.f20247b % 16;
        int[] iArr2 = this.f20257b;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f20258c;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f20258c[i10] = -1;
    }

    public final void m(int i10, h hVar, float f3) {
        this.f20259d[i10] = hVar.f20247b;
        this.f20260e[i10] = f3;
        this.f20261f[i10] = -1;
        this.g[i10] = -1;
        hVar.a(this.j);
        hVar.f20254k++;
        this.f20262h++;
    }

    public final int n(h hVar) {
        if (this.f20262h == 0) {
            return -1;
        }
        int i10 = hVar.f20247b;
        int i11 = this.f20257b[i10 % 16];
        if (i11 == -1) {
            return -1;
        }
        if (this.f20259d[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f20258c[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f20259d[i11] != i10);
        if (i11 != -1 && this.f20259d[i11] == i10) {
            return i11;
        }
        return -1;
    }

    public final String toString() {
        String strZ;
        String strZ2;
        String strZ3 = hashCode() + " { ";
        int i10 = this.f20262h;
        for (int i11 = 0; i11 < i10; i11++) {
            h hVarH = h(i11);
            if (hVarH != null) {
                String str = strZ3 + hVarH + " = " + a(i11) + " ";
                int iN = n(hVarH);
                String strZ4 = p.z(str, "[p: ");
                int i12 = this.f20261f[iN];
                a aVar = this.f20264k;
                if (i12 != -1) {
                    StringBuilder sbC = p.C(strZ4);
                    sbC.append(((h[]) aVar.f557u)[this.f20259d[this.f20261f[iN]]]);
                    strZ = sbC.toString();
                } else {
                    strZ = p.z(strZ4, "none");
                }
                String strZ5 = p.z(strZ, ", n: ");
                if (this.g[iN] != -1) {
                    StringBuilder sbC2 = p.C(strZ5);
                    sbC2.append(((h[]) aVar.f557u)[this.f20259d[this.g[iN]]]);
                    strZ2 = sbC2.toString();
                } else {
                    strZ2 = p.z(strZ5, "none");
                }
                strZ3 = p.z(strZ2, "]");
            }
        }
        return p.z(strZ3, " }");
    }
}
