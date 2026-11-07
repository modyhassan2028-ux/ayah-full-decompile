package O;

import p223x.C1408a0;
import p223x.C1424m;
import p223x.v0;
import p223x.w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1424m f6273a = new C1424m(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f6274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1408a0 f6276d;

    static {
        z zVar = z.f6433s;
        z zVar2 = z.f6434t;
        v0 v0Var = w0.f24113a;
        f6274b = new v0(zVar, zVar2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f6275c = jFloatToRawIntBits;
        f6276d = new C1408a0(3, new p171r0.c(jFloatToRawIntBits));
    }
}
