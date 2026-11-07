package p142o1;

import E2.C0140p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h[] f20243f;
    public h[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f20245i;

    @Override // p142o1.c
    public final h d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f20244h; i11++) {
            h[] hVarArr = this.f20243f;
            h hVar = hVarArr[i11];
            if (!zArr[hVar.f20247b]) {
                f fVar = this.f20245i;
                fVar.f20241r = hVar;
                int i12 = 8;
                if (i10 != -1) {
                    h hVar2 = hVarArr[i10];
                    while (i12 >= 0) {
                        float f3 = hVar2.f20252h[i12];
                        float f7 = fVar.f20241r.f20252h[i12];
                        if (f7 != f3) {
                            if (f7 >= f3) {
                                break;
                            }
                            i10 = i11;
                            break;
                            break;
                        }
                        i12--;
                    }
                } else {
                    while (i12 >= 0) {
                        float f10 = fVar.f20241r.f20252h[i12];
                        if (f10 > 0.0f) {
                            break;
                        }
                        if (f10 < 0.0f) {
                            i10 = i11;
                            break;
                        }
                        i12--;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f20243f[i10];
    }

    @Override // p142o1.c
    public final void h(c cVar, boolean z10) {
        h hVar = cVar.f20222a;
        if (hVar == null) {
            return;
        }
        float[] fArr = hVar.f20252h;
        b bVar = cVar.f20225d;
        int iD = bVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            h hVarH = bVar.h(i10);
            float fA = bVar.a(i10);
            f fVar = this.f20245i;
            fVar.f20241r = hVarH;
            if (hVarH.f20246a) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = fVar.f20241r.f20252h;
                    float f3 = (fArr[i11] * fA) + fArr2[i11];
                    fArr2[i11] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        fVar.f20241r.f20252h[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    fVar.f20242s.j(fVar.f20241r);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f7 = fArr[i12];
                    if (f7 != 0.0f) {
                        float f10 = f7 * fA;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        fVar.f20241r.f20252h[i12] = f10;
                    } else {
                        fVar.f20241r.f20252h[i12] = 0.0f;
                    }
                }
                i(hVarH);
            }
            this.f20223b = (cVar.f20223b * fA) + this.f20223b;
        }
        j(hVar);
    }

    public final void i(h hVar) {
        int i10;
        int i11 = this.f20244h + 1;
        h[] hVarArr = this.f20243f;
        if (i11 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f20243f = hVarArr2;
            this.g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f20243f;
        int i12 = this.f20244h;
        hVarArr3[i12] = hVar;
        int i13 = i12 + 1;
        this.f20244h = i13;
        if (i13 > 1 && hVarArr3[i12].f20247b > hVar.f20247b) {
            int i14 = 0;
            while (true) {
                i10 = this.f20244h;
                if (i14 >= i10) {
                    break;
                }
                this.g[i14] = this.f20243f[i14];
                i14++;
            }
            Arrays.sort(this.g, 0, i10, new C0140p(13));
            for (int i15 = 0; i15 < this.f20244h; i15++) {
                this.f20243f[i15] = this.g[i15];
            }
        }
        hVar.f20246a = true;
        hVar.a(this);
    }

    public final void j(h hVar) {
        int i10 = 0;
        while (i10 < this.f20244h) {
            if (this.f20243f[i10] == hVar) {
                while (true) {
                    int i11 = this.f20244h;
                    if (i10 >= i11 - 1) {
                        this.f20244h = i11 - 1;
                        hVar.f20246a = false;
                        return;
                    } else {
                        h[] hVarArr = this.f20243f;
                        int i12 = i10 + 1;
                        hVarArr[i10] = hVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p142o1.c
    public final String toString() {
        f fVar = this.f20245i;
        String str = " goal -> (" + this.f20223b + ") : ";
        for (int i10 = 0; i10 < this.f20244h; i10++) {
            fVar.f20241r = this.f20243f[i10];
            str = str + fVar + " ";
        }
        return str;
    }
}
