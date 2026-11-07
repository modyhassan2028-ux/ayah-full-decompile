package p187t0;

import p180s0.C1292a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f22513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f22514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f22515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f22516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f22517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f22518f;
    public static final q g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f22519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f22520i;
    public static final q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f22521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f22522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f22523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f22524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f22525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f22526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f22527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f22528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f22529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f22530t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f22531u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f22532v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f22533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l f22534x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c[] f22535y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f22513a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f22514b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f22515c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f22516d = rVar4;
        s sVar = j.f22546d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f22517e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f22518f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new C1292a(10), new C1292a(11), -0.799f, 2.399f, rVar, 2);
        g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f22519h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f22520i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f22521k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f22522l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f22543a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f22523m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f22524n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f22525o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f22544b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f22526p = qVar12;
        s sVar2 = j.f22545c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f22527q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f22528r = qVar14;
        k kVar = new k(14, 1, b.f22506b, "Generic XYZ");
        f22529s = kVar;
        long j10 = b.f22507c;
        k kVar2 = new k(15, 0, j10, "Generic L*a*b*");
        f22530t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f22531u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new C1292a(12), new C1292a(13), 0.0f, 1.0f, rVar3, 17);
        f22532v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new C1292a(14), new C1292a(15), 0.0f, 1.0f, rVar4, 18);
        f22533w = qVar17;
        l lVar = new l(j10, 19, "Oklab");
        f22534x = lVar;
        f22535y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d5) {
        double d9 = d5 < 0.0d ? -1.0d : 1.0d;
        double d10 = d5 * d9;
        double d11 = rVar.f22574b;
        double d12 = rVar.f22575c;
        double d13 = rVar.f22576d;
        double d14 = rVar.f22577e;
        double d15 = rVar.f22578f;
        double d16 = d11 * d10;
        return (rVar.g + 1.0d) * d9 * (d16 <= 1.0d ? Math.pow(d16, d12) : Math.exp((d10 - d15) * d13) + d14);
    }

    public static double b(r rVar, double d5) {
        double d9 = d5 < 0.0d ? -1.0d : 1.0d;
        double d10 = 1.0d / rVar.f22574b;
        double d11 = 1.0d / rVar.f22575c;
        double d12 = 1.0d / rVar.f22576d;
        double d13 = rVar.f22577e;
        double d14 = rVar.f22578f;
        double d15 = (d5 * d9) / (rVar.g + 1.0d);
        return d9 * (d15 <= 1.0d ? Math.pow(d15, d11) * d10 : (Math.log(d15 - d13) * d12) + d14);
    }

    public static double c(r rVar, double d5) {
        double d9 = d5 < 0.0d ? -1.0d : 1.0d;
        double d10 = d5 * d9;
        double d11 = rVar.f22574b;
        double d12 = rVar.f22576d;
        double dPow = (Math.pow(d10, d12) * rVar.f22575c) + d11;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d10, d12) * rVar.f22578f) + rVar.f22577e), rVar.g) * d9;
    }

    public static double d(r rVar, double d5) {
        double d9 = d5 < 0.0d ? -1.0d : 1.0d;
        double d10 = d5 * d9;
        double d11 = -rVar.f22574b;
        double d12 = rVar.f22577e;
        double d13 = 1.0d / rVar.g;
        return Math.pow(Math.max((Math.pow(d10, d13) * d12) + d11, 0.0d) / ((Math.pow(d10, d13) * (-rVar.f22578f)) + rVar.f22575c), 1.0d / rVar.f22576d) * d9;
    }
}
