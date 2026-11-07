package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class H implements m {
    public static final H BE;
    public static final H BEFORE_BE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ H[] f17781a;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long D(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.m(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.p(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.l(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object v(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.u(this, fVar);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f17781a.clone();
    }

    static {
        H h7 = new H("BEFORE_BE", 0);
        BEFORE_BE = h7;
        H h10 = new H("BE", 1);
        BE = h10;
        f17781a = new H[]{h7, h10};
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(getValue(), ChronoField.ERA);
    }
}
