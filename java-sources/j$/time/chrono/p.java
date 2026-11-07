package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements m {
    public static final p AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p[] f17811a;

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

    @Override // j$.time.chrono.m
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object v(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.u(this, fVar);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f17811a.clone();
    }

    static {
        p pVar = new p("AH", 0);
        AH = pVar;
        f17811a = new p[]{pVar};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return j$.time.temporal.p.f(1L, 1L);
        }
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(1, ChronoField.ERA);
    }
}
