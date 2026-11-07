package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0893v3 implements InterfaceC0888u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O1 f14433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1 f14434b;

    static {
        G1.f fVar = new G1.f(N1.a(), true, true);
        fVar.r("measurement.collection.event_safelist", true);
        f14433a = fVar.r("measurement.service.store_null_safelist", true);
        f14434b = fVar.r("measurement.service.store_safelist", true);
    }
}
