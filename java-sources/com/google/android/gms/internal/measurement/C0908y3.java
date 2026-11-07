package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0908y3 implements InterfaceC0903x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O1 f14511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1 f14512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O1 f14513c;

    static {
        G1.f fVar = new G1.f(N1.a(), true, true);
        fVar.r("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f14511a = fVar.r("measurement.audience.refresh_event_count_filters_timestamp", false);
        f14512b = fVar.r("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f14513c = fVar.r("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
