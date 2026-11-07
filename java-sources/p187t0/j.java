package p187t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f22543a = new s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f22544b = new s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f22545c = new s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f22546d = new s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f22547e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        if (b.a(cVar.f22511b, b.f22505a)) {
            q qVar = (q) cVar;
            s sVar = qVar.f22561d;
            s sVar2 = f22544b;
            if (!d(sVar, sVar2)) {
                return new q(qVar.f22510a, qVar.f22564h, sVar2, g(c(a.f22503b.f22504a, sVar.a(), sVar2.a()), qVar.f22565i), qVar.f22566k, qVar.f22569n, qVar.f22562e, qVar.f22563f, qVar.g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f3 = fArr[0];
        float f7 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = (((((f10 * f13) + ((f7 * f12) + (f3 * f11))) - (f11 * f12)) - (f7 * f10)) - (f3 * f13)) * 0.5f;
        return f14 < 0.0f ? -f14 : f14;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = f(fArr);
        float f3 = fArr4[0];
        float f7 = fArr[0] * f3;
        float f10 = fArr4[1];
        float f11 = fArr[1] * f10;
        float f12 = fArr4[2];
        return g(fArrF, new float[]{f7, f11, fArr[2] * f12, fArr[3] * f3, fArr[4] * f10, fArr[5] * f12, f3 * fArr[6], f10 * fArr[7], f12 * fArr[8]});
    }

    public static final boolean d(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        return Math.abs(sVar.f22579a - sVar2.f22579a) < 0.001f && Math.abs(sVar.f22580b - sVar2.f22580b) < 0.001f;
    }

    public static final g e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new e(cVar, cVar, 1);
        }
        long j = cVar.f22511b;
        long j10 = b.f22505a;
        return (b.a(j, j10) && b.a(cVar2.f22511b, j10)) ? new f((q) cVar, (q) cVar2) : new g(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f3 = fArr[0];
        float f7 = fArr[3];
        float f10 = fArr[6];
        float f11 = fArr[1];
        float f12 = fArr[4];
        float f13 = fArr[7];
        float f14 = fArr[2];
        float f15 = fArr[5];
        float f16 = fArr[8];
        float f17 = (f12 * f16) - (f13 * f15);
        float f18 = (f13 * f14) - (f11 * f16);
        float f19 = (f11 * f15) - (f12 * f14);
        float f20 = (f10 * f19) + (f7 * f18) + (f3 * f17);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f17 / f20;
        fArr2[1] = f18 / f20;
        fArr2[2] = f19 / f20;
        fArr2[3] = ((f10 * f15) - (f7 * f16)) / f20;
        fArr2[4] = ((f16 * f3) - (f10 * f14)) / f20;
        fArr2[5] = ((f14 * f7) - (f15 * f3)) / f20;
        fArr2[6] = ((f7 * f13) - (f10 * f12)) / f20;
        fArr2[7] = ((f10 * f11) - (f13 * f3)) / f20;
        fArr2[8] = ((f3 * f12) - (f7 * f11)) / f20;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f3 = fArr[0] * fArr2[0];
        float f7 = fArr[3];
        float f10 = fArr2[1];
        float f11 = fArr[6];
        float f12 = fArr2[2];
        fArr3[0] = (f11 * f12) + (f7 * f10) + f3;
        float f13 = fArr[1];
        float f14 = fArr2[0];
        float f15 = fArr[4];
        float f16 = fArr[7];
        float f17 = f16 * f12;
        fArr3[1] = f17 + (f10 * f15) + (f13 * f14);
        float f18 = fArr[2] * f14;
        float f19 = fArr[5];
        float f20 = (fArr2[1] * f19) + f18;
        float f21 = fArr[8];
        fArr3[2] = (f12 * f21) + f20;
        float f22 = fArr[0];
        float f23 = fArr2[3] * f22;
        float f24 = fArr2[4];
        float f25 = (f7 * f24) + f23;
        float f26 = fArr2[5];
        fArr3[3] = (f11 * f26) + f25;
        float f27 = fArr[1];
        float f28 = fArr2[3];
        float f29 = f15 * f24;
        fArr3[4] = (f16 * f26) + f29 + (f27 * f28);
        float f30 = fArr[2];
        float f31 = f26 * f21;
        fArr3[5] = f31 + (f19 * fArr2[4]) + (f28 * f30);
        float f32 = f22 * fArr2[6];
        float f33 = fArr[3];
        float f34 = fArr2[7];
        float f35 = (f33 * f34) + f32;
        float f36 = fArr2[8];
        fArr3[6] = (f11 * f36) + f35;
        float f37 = fArr2[6];
        float f38 = f16 * f36;
        fArr3[7] = f38 + (fArr[4] * f34) + (f27 * f37);
        float f39 = f21 * f36;
        fArr3[8] = f39 + (fArr[5] * fArr2[7]) + (f30 * f37);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f3 = fArr2[0];
        float f7 = fArr2[1];
        float f10 = fArr2[2];
        fArr2[0] = (fArr[6] * f10) + (fArr[3] * f7) + (fArr[0] * f3);
        fArr2[1] = (fArr[7] * f10) + (fArr[4] * f7) + (fArr[1] * f3);
        fArr2[2] = (fArr[8] * f10) + (fArr[5] * f7) + (fArr[2] * f3);
        return fArr2;
    }
}
