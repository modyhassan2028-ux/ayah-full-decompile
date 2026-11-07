package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements m {
    public static final B BEFORE_ROC;
    public static final B ROC;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ B[] f17774a;

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

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f17774a.clone();
    }

    static {
        B b5 = new B("BEFORE_ROC", 0);
        BEFORE_ROC = b5;
        B b10 = new B("ROC", 1);
        ROC = b10;
        f17774a = new B[]{b5, b10};
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
