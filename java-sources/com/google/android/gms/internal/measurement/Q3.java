package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 implements P3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O1 f14102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1 f14103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O1 f14104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O1 f14105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O1 f14106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O1 f14107f;

    static {
        G1.f fVar = new G1.f(N1.a(), true, true);
        f14102a = fVar.r("measurement.test.boolean_flag", false);
        f14103b = fVar.q(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = O1.g;
        f14104c = new O1(fVar, "measurement.test.double_flag", dValueOf, 2);
        f14105d = fVar.q(-2L, "measurement.test.int_flag");
        f14106e = fVar.q(-1L, "measurement.test.long_flag");
        f14107f = fVar.s("measurement.test.string_flag", "---");
    }
}
