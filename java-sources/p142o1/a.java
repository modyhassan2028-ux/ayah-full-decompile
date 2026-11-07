package p142o1;

import android.support.v4.media.session.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Aa.a f20216c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20214a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20217d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f20218e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f20219f = new int[8];
    public float[] g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20220h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20221i = -1;
    public boolean j = false;

    public a(c cVar, Aa.a aVar) {
        this.f20215b = cVar;
        this.f20216c = aVar;
    }

    @Override // p142o1.b
    public final float a(int i10) {
        int i11 = this.f20220h;
        for (int i12 = 0; i11 != -1 && i12 < this.f20214a; i12++) {
            if (i12 == i10) {
                return this.g[i11];
            }
            i11 = this.f20219f[i11];
        }
        return 0.0f;
    }

    @Override // p142o1.b
    public final float b(h hVar, boolean z10) {
        int i10 = this.f20220h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f20214a) {
            if (this.f20218e[i10] == hVar.f20247b) {
                if (i10 == this.f20220h) {
                    this.f20220h = this.f20219f[i10];
                } else {
                    int[] iArr = this.f20219f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    hVar.b(this.f20215b);
                }
                hVar.f20254k--;
                this.f20214a--;
                this.f20218e[i10] = -1;
                if (this.j) {
                    this.f20221i = i10;
                }
                return this.g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f20219f[i10];
        }
        return 0.0f;
    }

    @Override // p142o1.b
    public final float c(c cVar, boolean z10) {
        float f3 = f(cVar.f20222a);
        b(cVar.f20222a, z10);
        b bVar = cVar.f20225d;
        int iD = bVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            h hVarH = bVar.h(i10);
            i(hVarH, bVar.f(hVarH) * f3, z10);
        }
        return f3;
    }

    @Override // p142o1.b
    public final void clear() {
        int i10 = this.f20220h;
        for (int i11 = 0; i10 != -1 && i11 < this.f20214a; i11++) {
            h hVar = ((h[]) this.f20216c.f557u)[this.f20218e[i10]];
            if (hVar != null) {
                hVar.b(this.f20215b);
            }
            i10 = this.f20219f[i10];
        }
        this.f20220h = -1;
        this.f20221i = -1;
        this.j = false;
        this.f20214a = 0;
    }

    @Override // p142o1.b
    public final int d() {
        return this.f20214a;
    }

    @Override // p142o1.b
    public final void e(h hVar, float f3) {
        if (f3 == 0.0f) {
            b(hVar, true);
            return;
        }
        int i10 = this.f20220h;
        c cVar = this.f20215b;
        if (i10 == -1) {
            this.f20220h = 0;
            this.g[0] = f3;
            this.f20218e[0] = hVar.f20247b;
            this.f20219f[0] = -1;
            hVar.f20254k++;
            hVar.a(cVar);
            this.f20214a++;
            if (this.j) {
                return;
            }
            int i11 = this.f20221i + 1;
            this.f20221i = i11;
            int[] iArr = this.f20218e;
            if (i11 >= iArr.length) {
                this.j = true;
                this.f20221i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f20214a; i13++) {
            int i14 = this.f20218e[i10];
            int i15 = hVar.f20247b;
            if (i14 == i15) {
                this.g[i10] = f3;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f20219f[i10];
        }
        int length = this.f20221i;
        int i16 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f20218e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f20218e;
        if (length >= iArr3.length && this.f20214a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f20218e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f20218e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f20217d * 2;
            this.f20217d = i18;
            this.j = false;
            this.f20221i = length - 1;
            this.g = Arrays.copyOf(this.g, i18);
            this.f20218e = Arrays.copyOf(this.f20218e, this.f20217d);
            this.f20219f = Arrays.copyOf(this.f20219f, this.f20217d);
        }
        this.f20218e[length] = hVar.f20247b;
        this.g[length] = f3;
        if (i12 != -1) {
            int[] iArr6 = this.f20219f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f20219f[length] = this.f20220h;
            this.f20220h = length;
        }
        hVar.f20254k++;
        hVar.a(cVar);
        int i19 = this.f20214a + 1;
        this.f20214a = i19;
        if (!this.j) {
            this.f20221i++;
        }
        int[] iArr7 = this.f20218e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f20221i >= iArr7.length) {
            this.j = true;
            this.f20221i = iArr7.length - 1;
        }
    }

    @Override // p142o1.b
    public final float f(h hVar) {
        int i10 = this.f20220h;
        for (int i11 = 0; i10 != -1 && i11 < this.f20214a; i11++) {
            if (this.f20218e[i10] == hVar.f20247b) {
                return this.g[i10];
            }
            i10 = this.f20219f[i10];
        }
        return 0.0f;
    }

    @Override // p142o1.b
    public final boolean g(h hVar) {
        int i10 = this.f20220h;
        if (i10 != -1) {
            for (int i11 = 0; i10 != -1 && i11 < this.f20214a; i11++) {
                if (this.f20218e[i10] == hVar.f20247b) {
                    return true;
                }
                i10 = this.f20219f[i10];
            }
        }
        return false;
    }

    @Override // p142o1.b
    public final h h(int i10) {
        int i11 = this.f20220h;
        for (int i12 = 0; i11 != -1 && i12 < this.f20214a; i12++) {
            if (i12 == i10) {
                return ((h[]) this.f20216c.f557u)[this.f20218e[i11]];
            }
            i11 = this.f20219f[i11];
        }
        return null;
    }

    @Override // p142o1.b
    public final void i(h hVar, float f3, boolean z10) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i10 = this.f20220h;
            c cVar = this.f20215b;
            if (i10 == -1) {
                this.f20220h = 0;
                this.g[0] = f3;
                this.f20218e[0] = hVar.f20247b;
                this.f20219f[0] = -1;
                hVar.f20254k++;
                hVar.a(cVar);
                this.f20214a++;
                if (this.j) {
                    return;
                }
                int i11 = this.f20221i + 1;
                this.f20221i = i11;
                int[] iArr = this.f20218e;
                if (i11 >= iArr.length) {
                    this.j = true;
                    this.f20221i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f20214a; i13++) {
                int i14 = this.f20218e[i10];
                int i15 = hVar.f20247b;
                if (i14 == i15) {
                    float[] fArr = this.g;
                    float f7 = fArr[i10] + f3;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i10] = f7;
                    if (f7 == 0.0f) {
                        if (i10 == this.f20220h) {
                            this.f20220h = this.f20219f[i10];
                        } else {
                            int[] iArr2 = this.f20219f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            hVar.b(cVar);
                        }
                        if (this.j) {
                            this.f20221i = i10;
                        }
                        hVar.f20254k--;
                        this.f20214a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f20219f[i10];
            }
            int length = this.f20221i;
            int i16 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f20218e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f20218e;
            if (length >= iArr4.length && this.f20214a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f20218e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f20218e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f20217d * 2;
                this.f20217d = i18;
                this.j = false;
                this.f20221i = length - 1;
                this.g = Arrays.copyOf(this.g, i18);
                this.f20218e = Arrays.copyOf(this.f20218e, this.f20217d);
                this.f20219f = Arrays.copyOf(this.f20219f, this.f20217d);
            }
            this.f20218e[length] = hVar.f20247b;
            this.g[length] = f3;
            if (i12 != -1) {
                int[] iArr7 = this.f20219f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f20219f[length] = this.f20220h;
                this.f20220h = length;
            }
            hVar.f20254k++;
            hVar.a(cVar);
            this.f20214a++;
            if (!this.j) {
                this.f20221i++;
            }
            int i19 = this.f20221i;
            int[] iArr8 = this.f20218e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f20221i = iArr8.length - 1;
            }
        }
    }

    @Override // p142o1.b
    public final void j(float f3) {
        int i10 = this.f20220h;
        for (int i11 = 0; i10 != -1 && i11 < this.f20214a; i11++) {
            float[] fArr = this.g;
            fArr[i10] = fArr[i10] / f3;
            i10 = this.f20219f[i10];
        }
    }

    @Override // p142o1.b
    public final void k() {
        int i10 = this.f20220h;
        for (int i11 = 0; i10 != -1 && i11 < this.f20214a; i11++) {
            float[] fArr = this.g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f20219f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f20220h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f20214a; i11++) {
            StringBuilder sbC = p.C(p.z(string, " -> "));
            sbC.append(this.g[i10]);
            sbC.append(" : ");
            StringBuilder sbC2 = p.C(sbC.toString());
            sbC2.append(((h[]) this.f20216c.f557u)[this.f20218e[i10]]);
            string = sbC2.toString();
            i10 = this.f20219f[i10];
        }
        return string;
    }
}
