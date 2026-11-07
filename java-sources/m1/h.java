package m1;

import android.graphics.Color;
import p244z1.k;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19521f;

    public h(float f3, float f7, float f10, float f11, float f12, float f13) {
        this.f19516a = f3;
        this.f19517b = f7;
        this.f19518c = f10;
        this.f19519d = f11;
        this.f19520e = f12;
        this.f19521f = f13;
    }

    public static h b(int i10) {
        k kVar = k.f24773k;
        float fH = p244z1.a.h(Color.red(i10));
        float fH2 = p244z1.a.h(Color.green(i10));
        float fH3 = p244z1.a.h(Color.blue(i10));
        float[][] fArr = p244z1.a.f24749d;
        float[] fArr2 = fArr[0];
        float f3 = (fArr2[2] * fH3) + (fArr2[1] * fH2) + (fArr2[0] * fH);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * fH3) + (fArr3[1] * fH2) + (fArr3[0] * fH);
        float[] fArr4 = fArr[2];
        float f10 = (fH3 * fArr4[2]) + (fH2 * fArr4[1]) + (fH * fArr4[0]);
        float[][] fArr5 = p244z1.a.f24746a;
        float[] fArr6 = fArr5[0];
        float f11 = (fArr6[2] * f10) + (fArr6[1] * f7) + (fArr6[0] * f3);
        float[] fArr7 = fArr5[1];
        float f12 = (fArr7[2] * f10) + (fArr7[1] * f7) + (fArr7[0] * f3);
        float[] fArr8 = fArr5[2];
        float f13 = (f10 * fArr8[2]) + (f7 * fArr8[1]) + (f3 * fArr8[0]);
        float[] fArr9 = kVar.g;
        float f14 = kVar.f24781i;
        float f15 = kVar.f24777d;
        float f16 = kVar.f24774a;
        float f17 = fArr9[0] * f11;
        float f18 = fArr9[1] * f12;
        float f19 = fArr9[2] * f13;
        float f20 = kVar.f24780h;
        float fPow = (float) Math.pow(((double) (Math.abs(f17) * f20)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f18) * f20)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f19) * f20)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f17) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f18) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f19) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f21 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d5)) / 11.0f;
        float f22 = ((float) (((double) (fSignum + fSignum2)) - (d5 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f23)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * kVar.f24775b) / f16, kVar.j * f15)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f27 = f16 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f24779f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f24778e) * kVar.f24776c) * ((float) Math.sqrt((f22 * f22) + (f21 * f21)))) / (f24 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f15) / f27);
        float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f14 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d9 = f26;
        return new h(fAtan2, fSqrt, fPow4, f28, fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
    }

    public static h c(float f3, float f7, float f10) {
        k kVar = k.f24773k;
        float f11 = kVar.f24777d;
        double d5 = ((double) f3) / 100.0d;
        Math.sqrt(d5);
        float f12 = kVar.f24774a + 4.0f;
        float f13 = kVar.f24781i * f7;
        Math.sqrt(((f7 / ((float) Math.sqrt(d5))) * kVar.f24777d) / f12);
        float f14 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) f13) * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f10) / 180.0f;
        return new h(f10, f7, f3, f14, fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
    }

    public void a(float f3, float f7, int i10, int i11, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = (f3 - 0.5f) * 2.0f;
        float f13 = (f7 - 0.5f) * 2.0f;
        float f14 = f10 + this.f19518c;
        float f15 = f11 + this.f19519d;
        float f16 = (this.f19516a * f12) + f14;
        float f17 = (this.f19517b * f13) + f15;
        float radians = (float) Math.toRadians(this.f19521f);
        float radians2 = (float) Math.toRadians(this.f19520e);
        double d5 = radians;
        double d9 = i11 * f13;
        float fSin = (((float) ((Math.sin(d5) * ((double) ((-i10) * f12))) - (Math.cos(d5) * d9))) * radians2) + f16;
        float fCos = (radians2 * ((float) ((Math.cos(d5) * ((double) (i10 * f12))) - (Math.sin(d5) * d9)))) + f17;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public int d(k kVar) {
        float fSqrt;
        float f3 = this.f19518c;
        float f7 = this.f19517b;
        if (f7 != 0.0d) {
            double d5 = f3;
            if (d5 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f7 / ((float) Math.sqrt(d5 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f10 = kVar.f24779f;
        float f11 = kVar.f24780h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f10), 0.73d), 1.1111111111111112d);
        double d9 = (this.f19516a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f;
        float fPow2 = kVar.f24774a * ((float) Math.pow(((double) f3) / 100.0d, (1.0d / ((double) kVar.f24777d)) / ((double) kVar.j)));
        float f12 = fCos * 3846.1538f * kVar.f24778e * kVar.f24776c;
        float f13 = fPow2 / kVar.f24775b;
        float fSin = (float) Math.sin(d9);
        float fCos2 = (float) Math.cos(d9);
        float f14 = (((0.305f + f13) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f12 * 23.0f)));
        float f15 = fCos2 * f14;
        float f16 = f14 * fSin;
        float f17 = f13 * 460.0f;
        float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
        float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
        float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
        float f21 = 100.0f / f11;
        float fSignum = Math.signum(f18) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20)))), 2.380952380952381d));
        float[] fArr = kVar.g;
        float f22 = fSignum / fArr[0];
        float f23 = fSignum2 / fArr[1];
        float f24 = fSignum3 / fArr[2];
        float[][] fArr2 = p244z1.a.f24747b;
        float[] fArr3 = fArr2[0];
        float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
        float[] fArr4 = fArr2[1];
        float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
        float[] fArr5 = fArr2[2];
        return A1.a.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
    }
}
