package p132n1;

import java.util.LinkedHashMap;
import m1.e;
import s1.a;
import s1.g;
import s1.i;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f19947E = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f19952r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f19954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f19955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f19956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f19957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f19958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f19959y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19953s = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f19960z = Float.NaN;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f19948A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinkedHashMap f19949B = new LinkedHashMap();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public double[] f19950C = new double[18];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public double[] f19951D = new double[18];

    public static boolean b(float f3, float f7) {
        if (Float.isNaN(f3) || Float.isNaN(f7)) {
            return Float.isNaN(f3) != Float.isNaN(f7);
        }
        return Math.abs(f3 - f7) > 1.0E-6f;
    }

    public static void d(float f3, float f7, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f14 = (float) dArr[i10];
            double d5 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f10 = f14;
            } else if (i11 == 2) {
                f12 = f14;
            } else if (i11 == 3) {
                f11 = f14;
            } else if (i11 == 4) {
                f13 = f14;
            }
        }
        float f15 = f10 - ((0.0f * f11) / 2.0f);
        float f16 = f12 - ((0.0f * f13) / 2.0f);
        fArr[0] = (((f11 * 1.0f) + f15) * f3) + ((1.0f - f3) * f15) + 0.0f;
        fArr[1] = (((f13 * 1.0f) + f16) * f7) + ((1.0f - f7) * f16) + 0.0f;
    }

    public final void a(g gVar) {
        this.f19952r = e.c(gVar.f21935c.f21998c);
        i iVar = gVar.f21935c;
        this.f19948A = iVar.f21999d;
        this.f19960z = iVar.g;
        this.f19953s = iVar.f22000e;
        for (String str : gVar.f21938f.keySet()) {
            a aVar = (a) gVar.f21938f.get(str);
            if (aVar.f21854b != 5) {
                this.f19949B.put(str, aVar);
            }
        }
    }

    public final void c(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f3 = this.f19956v;
        float f7 = this.f19957w;
        float f10 = this.f19958x;
        float f11 = this.f19959y;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f3 = f12;
            } else if (i12 == 2) {
                f7 = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        fArr[i10] = (f10 / 2.0f) + f3 + 0.0f;
        fArr[i10 + 1] = (f11 / 2.0f) + f7 + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f19955u, ((w) obj).f19955u);
    }
}
