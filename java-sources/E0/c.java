package E0;

import p017b7.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f1414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f1416f;
    public final float[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f1417h;

    public c(boolean z10, b bVar) {
        int i10;
        this.f1411a = z10;
        this.f1412b = bVar;
        if (z10 && bVar.equals(b.f1408r)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            i10 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new A6.a();
            }
            i10 = 2;
        }
        this.f1413c = i10;
        this.f1414d = new a[20];
        this.f1416f = new float[20];
        this.g = new float[20];
        this.f1417h = new float[3];
    }

    public final void a(long j, float f3) {
        int i10 = (this.f1415e + 1) % 20;
        this.f1415e = i10;
        a[] aVarArr = this.f1414d;
        a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f1406a = j;
            aVar.f1407b = f3;
        } else {
            a aVar2 = new a();
            aVar2.f1406a = j;
            aVar2.f1407b = f3;
            aVarArr[i10] = aVar2;
        }
    }

    public final float b(float f3) {
        b bVar;
        float[] fArr;
        float[] fArr2;
        float f7;
        boolean z10;
        int i10;
        float fSignum;
        float f10 = f3;
        float f11 = 0.0f;
        if (f10 <= 0.0f) {
            G0.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        int i11 = this.f1415e;
        a[] aVarArr = this.f1414d;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            f7 = 0.0f;
        } else {
            int i12 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i11];
                boolean z11 = this.f1411a;
                bVar = this.f1412b;
                fArr = this.f1416f;
                fArr2 = this.g;
                if (aVar3 == null) {
                    f7 = f11;
                    z10 = z11;
                    i10 = 1;
                    break;
                }
                long j = aVar.f1406a;
                f7 = f11;
                int i13 = i11;
                long j10 = aVar3.f1406a;
                float f12 = j - j10;
                z10 = z11;
                i10 = 1;
                float fAbs = Math.abs(j10 - aVar2.f1406a);
                aVar2 = (bVar == b.f1408r || z10) ? aVar3 : aVar;
                if (f12 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar3.f1407b;
                fArr2[i12] = -f12;
                i11 = (i13 == 0 ? 20 : i13) - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f11 = f7;
            }
            if (i12 >= this.f1413c) {
                int iOrdinal = bVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f1417h;
                        g.l0(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f7;
                    }
                } else {
                    if (iOrdinal != i10) {
                        throw new A6.a();
                    }
                    int i14 = i12 - i10;
                    float f13 = fArr2[i14];
                    int i15 = i14;
                    float fAbs2 = f7;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        float f14 = fArr2[i16];
                        if (f13 != f14) {
                            float f15 = (z10 ? -fArr[i16] : fArr[i15] - fArr[i16]) / (f13 - f14);
                            fAbs2 += Math.abs(f15) * (f15 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i15 == i14) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i15--;
                        f13 = f14;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f11 = fSignum * 1000;
            } else {
                f11 = f7;
            }
        }
        if (f11 == f7 || Float.isNaN(f11)) {
            return f7;
        }
        if (f11 <= f7) {
            f10 = -f10;
            if (f11 >= f10) {
                return f11;
            }
        } else if (f11 <= f10) {
            f10 = f11;
        }
        return f10;
    }

    public /* synthetic */ c() {
        this(false, b.f1408r);
    }

    public c(int i10) {
        this(true, b.f1409s);
    }
}
