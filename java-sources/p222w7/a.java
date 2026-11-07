package p222w7;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23755f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23756h;

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    public a(int i10, float f3, float f7, float f10, int i11, float f11, int i12, float f12, int i13, float f13) {
        float fAbs;
        this.f23750a = i10;
        float fH = B9.a.h(f3, f7, f10);
        this.f23751b = fH;
        this.f23752c = i11;
        this.f23754e = f11;
        this.f23753d = i12;
        this.f23755f = f12;
        this.g = i13;
        float f14 = i13;
        float f15 = (f11 * i12) + (f12 * f14);
        float f16 = i11;
        float f17 = f13 - ((fH * f16) + f15);
        if (i11 > 0 && f17 > 0.0f) {
            this.f23751b = Math.min(f17 / f16, f10 - fH) + fH;
        } else if (i11 > 0 && f17 < 0.0f) {
            this.f23751b = Math.max(f17 / f16, f7 - fH) + fH;
        }
        int i14 = this.f23752c;
        float f18 = i14 > 0 ? this.f23751b : 0.0f;
        this.f23751b = f18;
        int i15 = this.f23753d;
        float f19 = i15;
        float f20 = f19 / 2.0f;
        float f21 = (f13 - ((i14 + f20) * (i14 > 0 ? f18 : 0.0f))) / (f20 + f14);
        this.f23755f = f21;
        float f22 = (f18 + f21) / 2.0f;
        this.f23754e = f22;
        if (i15 > 0 && f21 != f12) {
            float f23 = (f12 - f21) * f14;
            float fMin = Math.min(Math.abs(f23), f22 * 0.1f * f19);
            if (f23 > 0.0f) {
                this.f23754e -= fMin / this.f23753d;
                this.f23755f = (fMin / f14) + this.f23755f;
            } else {
                this.f23754e = (fMin / this.f23753d) + this.f23754e;
                this.f23755f -= fMin / f14;
            }
        }
        if (i13 > 0 && this.f23752c > 0 && this.f23753d > 0) {
            float f24 = this.f23755f;
            float f25 = this.f23754e;
            if (f24 <= f25 || f25 <= this.f23751b) {
                fAbs = Float.MAX_VALUE;
            } else {
                fAbs = i10 * Math.abs(f12 - this.f23755f);
            }
        } else if (i13 <= 0 || this.f23752c <= 0 || this.f23755f > this.f23751b) {
            fAbs = i10 * Math.abs(f12 - this.f23755f);
        } else {
            fAbs = Float.MAX_VALUE;
        }
        this.f23756h = fAbs;
    }

    public static a a(float f3, float f7, float f10, float f11, int[] iArr, float f12, int[] iArr2, float f13, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f7, f10, f11, iArr[i14], f12, i13, f13, i11, f3);
                    float f14 = aVar2.f23756h;
                    if (aVar == null || f14 < aVar.f23756h) {
                        if (f14 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.f23750a + ", smallCount=" + this.f23752c + ", smallSize=" + this.f23751b + ", mediumCount=" + this.f23753d + ", mediumSize=" + this.f23754e + ", largeCount=" + this.g + ", largeSize=" + this.f23755f + ", cost=" + this.f23756h + "]";
    }
}
