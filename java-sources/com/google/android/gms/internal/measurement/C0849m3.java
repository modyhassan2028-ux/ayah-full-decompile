package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0849m3 implements InterfaceC0844l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O1 f14363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1 f14364b;

    static {
        G1.f fVar = new G1.f(N1.a(), true, true);
        fVar.r("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        fVar.r("measurement.set_default_event_parameters_with_backfill.service", true);
        fVar.q(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        f14363a = fVar.r("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f14364b = fVar.r("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        fVar.r("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
