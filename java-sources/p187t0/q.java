package p187t0;

import java.util.Arrays;
import p180s0.C1292a;
import p180s0.F;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1292a f22560r = new C1292a(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f22561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f22563f;
    public final r g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f22564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f22565i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f22566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f22567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f22568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f22569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f22570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f22571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f22572q;

    public q(String str, float[] fArr, s sVar, final r rVar, int i10) {
        i iVar;
        i iVar2;
        double d5 = rVar.f22573a;
        boolean z10 = d5 == -3.0d;
        double d9 = rVar.g;
        double d10 = rVar.f22578f;
        if (z10) {
            final int i11 = 4;
            iVar = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i12 = 5;
            iVar = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i13 = i12;
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        } else if (d10 == 0.0d && d9 == 0.0d) {
            final int i13 = 6;
            iVar = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i14 = i13;
                    r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        } else {
            final int i14 = 7;
            iVar = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i15 = i14;
                    r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        }
        if (d5 == -3.0d) {
            final int i15 = 0;
            iVar2 = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i16 = i15;
                    r rVar2 = rVar;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i16 = 1;
            iVar2 = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i17 = i16;
                    r rVar2 = rVar;
                    switch (i17) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        } else if (d10 == 0.0d && d9 == 0.0d) {
            final int i17 = 2;
            iVar2 = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i18 = i17;
                    r rVar2 = rVar;
                    switch (i18) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        } else {
            final int i18 = 3;
            iVar2 = new i() { // from class: t0.o
                @Override // p187t0.i
                public final double b(double d11) {
                    int i19 = i18;
                    r rVar2 = rVar;
                    switch (i19) {
                        case 0:
                            float[] fArr2 = d.f22513a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f22513a;
                            return d.c(rVar2, d11);
                        case 2:
                            double d12 = rVar2.f22574b;
                            return d11 >= rVar2.f22577e ? Math.pow((d12 * d11) + rVar2.f22575c, rVar2.f22573a) : d11 * rVar2.f22576d;
                        case 3:
                            double d13 = rVar2.f22574b;
                            double d14 = rVar2.f22575c;
                            double d15 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e ? Math.pow((d13 * d11) + d14, rVar2.f22573a) + rVar2.f22578f : (d15 * d11) + rVar2.g;
                        case 4:
                            float[] fArr4 = d.f22513a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f22513a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f22574b;
                            double d17 = rVar2.f22575c;
                            double d18 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d18 ? (Math.pow(d11, 1.0d / rVar2.f22573a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f22574b;
                            double d20 = rVar2.f22575c;
                            double d21 = rVar2.f22576d;
                            return d11 >= rVar2.f22577e * d21 ? (Math.pow(d11 - rVar2.f22578f, 1.0d / rVar2.f22573a) - d20) / d19 : (d11 - rVar2.g) / d21;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i10);
    }

    @Override // p187t0.c
    public final float a(int i10) {
        return this.f22563f;
    }

    @Override // p187t0.c
    public final float b(int i10) {
        return this.f22562e;
    }

    @Override // p187t0.c
    public final boolean c() {
        return this.f22572q;
    }

    @Override // p187t0.c
    public final long d(float f3, float f7, float f10) {
        double d5 = f3;
        m mVar = this.f22571p;
        float fB = (float) mVar.b(d5);
        float fB2 = (float) mVar.b(f7);
        float fB3 = (float) mVar.b(f10);
        float[] fArr = this.f22565i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f11 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        return (((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    @Override // p187t0.c
    public final float e(float f3, float f7, float f10) {
        double d5 = f3;
        m mVar = this.f22571p;
        float fB = (float) mVar.b(d5);
        float fB2 = (float) mVar.b(f7);
        float fB3 = (float) mVar.b(f10);
        float[] fArr = this.f22565i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // p187t0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.g;
        if (Float.compare(qVar.f22562e, this.f22562e) != 0 || Float.compare(qVar.f22563f, this.f22563f) != 0 || !j.a(this.f22561d, qVar.f22561d) || !Arrays.equals(this.f22564h, qVar.f22564h)) {
            return false;
        }
        r rVar2 = this.g;
        if (rVar2 != null) {
            return j.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (j.a(this.f22566k, qVar.f22566k)) {
            return j.a(this.f22569n, qVar.f22569n);
        }
        return false;
    }

    @Override // p187t0.c
    public final long f(float f3, float f7, float f10, float f11, c cVar) {
        float[] fArr = this.j;
        float f12 = (fArr[6] * f10) + (fArr[3] * f7) + (fArr[0] * f3);
        float f13 = (fArr[7] * f10) + (fArr[4] * f7) + (fArr[1] * f3);
        float f14 = (fArr[8] * f10) + (fArr[5] * f7) + (fArr[2] * f3);
        m mVar = this.f22568m;
        return F.b((float) mVar.b(f12), (float) mVar.b(f13), (float) mVar.b(f14), f11, cVar);
    }

    @Override // p187t0.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f22564h) + ((this.f22561d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f22562e;
        int iFloatToIntBits = (iHashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f7 = this.f22563f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        r rVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f22569n.hashCode() + ((this.f22566k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x021d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0231  */
    /* JADX WARN: Code duplicated, block: B:65:0x0249  */
    /* JADX WARN: Code duplicated, block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0263 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f3, float f7, r rVar, int i10) {
        int i11;
        float f10;
        float f11;
        float[] fArr3;
        q qVar;
        double d5;
        int i12;
        super(b.f22505a, i10, str);
        this.f22561d = sVar;
        this.f22562e = f3;
        this.f22563f = f7;
        this.g = rVar;
        this.f22566k = iVar;
        boolean z10 = 1;
        z10 = 1;
        this.f22567l = new p(this, z10 ? 1 : 0);
        int i13 = 0;
        this.f22568m = new m(this, i13);
        this.f22569n = iVar2;
        this.f22570o = new p(this, i13);
        this.f22571p = new m(this, z10 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f3 < f7) {
            float[] fArr4 = new float[6];
            if (fArr.length == 9) {
                float f12 = fArr[0];
                float f13 = fArr[1];
                float f14 = f12 + f13 + fArr[2];
                fArr4[0] = f12 / f14;
                fArr4[1] = f13 / f14;
                float f15 = fArr[3];
                float f16 = fArr[4];
                float f17 = f15 + f16 + fArr[5];
                fArr4[2] = f15 / f17;
                fArr4[3] = f16 / f17;
                float f18 = fArr[6];
                float f19 = fArr[7];
                float f20 = f18 + f19 + fArr[8];
                fArr4[4] = f18 / f20;
                fArr4[5] = f19 / f20;
            } else {
                System.arraycopy(fArr, 0, fArr4, 0, 6);
            }
            this.f22564h = fArr4;
            if (fArr2 == null) {
                float f21 = fArr4[0];
                float f22 = fArr4[1];
                float f23 = fArr4[2];
                float f24 = fArr4[3];
                float f25 = fArr4[4];
                float f26 = fArr4[5];
                f10 = 1.0f;
                float f27 = sVar.f22579a;
                i11 = 0;
                float f28 = sVar.f22580b;
                float f29 = 1;
                float f30 = (f29 - f21) / f22;
                float f31 = (f29 - f23) / f24;
                float f32 = (f29 - f25) / f26;
                float f33 = (f29 - f27) / f28;
                float f34 = f21 / f22;
                float f35 = (f23 / f24) - f34;
                float f36 = (f27 / f28) - f34;
                float f37 = f31 - f30;
                float f38 = (f25 / f26) - f34;
                float f39 = (((f33 - f30) * f35) - (f36 * f37)) / (((f32 - f30) * f35) - (f37 * f38));
                float f40 = (f36 - (f38 * f39)) / f35;
                float f41 = (1.0f - f40) - f39;
                float f42 = f41 / f22;
                float f43 = f40 / f24;
                float f44 = f39 / f26;
                this.f22565i = new float[]{f42 * f21, f41, ((1.0f - f21) - f22) * f42, f43 * f23, f40, ((1.0f - f23) - f24) * f43, f44 * f25, f39, ((1.0f - f25) - f26) * f44};
            } else {
                i11 = 0;
                f10 = 1.0f;
                if (fArr2.length == 9) {
                    this.f22565i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.j = j.f(this.f22565i);
            float fB = j.b(fArr4);
            float[] fArr5 = d.f22513a;
            if (fB / j.b(d.f22514b) > 0.9f) {
                float[] fArr6 = d.f22513a;
                float f45 = fArr4[i11];
                float f46 = fArr6[i11];
                float f47 = fArr4[1];
                float f48 = fArr6[1];
                float f49 = fArr4[2];
                float f50 = fArr6[2];
                float f51 = fArr4[3];
                float f52 = fArr6[3];
                float f53 = fArr4[4];
                float f54 = fArr6[4];
                float f55 = fArr4[5];
                float f56 = fArr6[5];
                f11 = 0.0f;
                float[] fArr7 = new float[6];
                fArr7[i11] = f45 - f46;
                fArr7[1] = f47 - f48;
                fArr7[2] = f49 - f50;
                fArr7[3] = f51 - f52;
                fArr7[4] = f53 - f54;
                fArr7[5] = f55 - f56;
                float f57 = fArr7[i11];
                float f58 = fArr7[1];
                if (((f48 - f56) * f57) - ((f46 - f54) * f58) >= 0.0f && ((f46 - f50) * f58) - ((f48 - f52) * f57) >= 0.0f) {
                    float f59 = fArr7[2];
                    float f60 = fArr7[3];
                    if (((f52 - f48) * f59) - ((f50 - f46) * f60) >= 0.0f && ((f50 - f54) * f60) - ((f52 - f56) * f59) >= 0.0f) {
                        float f61 = fArr7[4];
                        float f62 = fArr7[5];
                        if (((f56 - f52) * f61) - ((f54 - f50) * f62) < 0.0f || ((f54 - f46) * f62) - ((f56 - f48) * f61) < 0.0f) {
                        }
                    }
                }
                if (i10 != 0) {
                    fArr3 = d.f22513a;
                    if (fArr4 == fArr3) {
                        i12 = i11;
                        while (true) {
                            if (i12 < 6) {
                                if (Float.compare(fArr4[i12], fArr3[i12]) != 0 || Math.abs(fArr4[i12] - fArr3[i12]) <= 0.001f) {
                                    i12++;
                                }
                            } else {
                                if (j.d(sVar, j.f22546d)) {
                                    break;
                                }
                                float[] fArr8 = d.f22513a;
                                qVar = d.f22517e;
                                while (d5 <= 1.0d) {
                                    if (Math.abs(iVar.b(d5) - qVar.f22566k.b(d5)) <= 0.001d) {
                                    }
                                }
                            }
                            z10 = i11;
                            break;
                        }
                    }
                    if (j.d(sVar, j.f22546d) || f3 != f11 || f7 != f10) {
                        z10 = i11;
                        break;
                    }
                    float[] fArr9 = d.f22513a;
                    qVar = d.f22517e;
                    for (d5 = 0.0d; d5 <= 1.0d; d5 += 0.00392156862745098d) {
                        if (Math.abs(iVar.b(d5) - qVar.f22566k.b(d5)) <= 0.001d || Math.abs(iVar2.b(d5) - qVar.f22569n.b(d5)) > 0.001d) {
                            z10 = i11;
                            break;
                        }
                    }
                }
                this.f22572q = z10;
                return;
            }
            f11 = 0.0f;
            int i14 = (f3 > f11 ? 1 : (f3 == f11 ? 0 : -1));
            if (i10 != 0) {
                fArr3 = d.f22513a;
                if (fArr4 == fArr3) {
                    i12 = i11;
                    while (true) {
                        if (i12 < 6) {
                            if (Float.compare(fArr4[i12], fArr3[i12]) != 0) {
                            }
                            i12++;
                        } else {
                            if (j.d(sVar, j.f22546d)) {
                                break;
                            }
                            float[] fArr10 = d.f22513a;
                            qVar = d.f22517e;
                            while (d5 <= 1.0d) {
                                if (Math.abs(iVar.b(d5) - qVar.f22566k.b(d5)) <= 0.001d) {
                                }
                            }
                        }
                        z10 = i11;
                        break;
                    }
                }
                if (j.d(sVar, j.f22546d)) {
                    z10 = i11;
                    break;
                }
                float[] fArr11 = d.f22513a;
                qVar = d.f22517e;
                while (d5 <= 1.0d) {
                    if (Math.abs(iVar.b(d5) - qVar.f22566k.b(d5)) <= 0.001d) {
                    }
                    z10 = i11;
                }
            }
            this.f22572q = z10;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f3 + ", max=" + f7 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d5, float f3, float f7, int i10) {
        i iVar;
        i iVar2 = f22560r;
        if (d5 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i11 = 0;
            iVar = new i() { // from class: t0.n
                @Override // p187t0.i
                public final double b(double d9) {
                    switch (i11) {
                        case 0:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, 1.0d / d5);
                        default:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, d5);
                    }
                }
            };
        }
        if (d5 != 1.0d) {
            final int i12 = 1;
            iVar2 = new i() { // from class: t0.n
                @Override // p187t0.i
                public final double b(double d9) {
                    switch (i12) {
                        case 0:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, 1.0d / d5);
                        default:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, d5);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f3, f7, new r(d5, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}
