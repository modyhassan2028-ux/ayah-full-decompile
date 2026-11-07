package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements m {
    public static final r BCE;
    public static final r CE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ r[] f17813a;

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

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f17813a.clone();
    }

    static {
        r rVar = new r("BCE", 0);
        BCE = rVar;
        r rVar2 = new r("CE", 1);
        CE = rVar2;
        f17813a = new r[]{rVar, rVar2};
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
