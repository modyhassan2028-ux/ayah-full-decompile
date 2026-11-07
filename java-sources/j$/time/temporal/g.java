package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17967a;

    static {
        j$.time.d.l(31556952L, 0);
        j$.time.d.l(7889238L, 0);
    }

    g(String str) {
        this.f17967a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal k(Temporal temporal, long j) {
        int i10 = a.f17963a[ordinal()];
        if (i10 == 1) {
            f fVar = h.f17970c;
            return temporal.c(j$.com.android.tools.r8.a.B(temporal.get(fVar), j), fVar);
        }
        if (i10 == 2) {
            return temporal.d(j / 4, ChronoUnit.YEARS).d((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int i10 = a.f17963a[ordinal()];
        if (i10 == 1) {
            f fVar = h.f17970c;
            return j$.com.android.tools.r8.a.I(temporal2.D(fVar), temporal.D(fVar));
        }
        if (i10 == 2) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17967a;
    }
}
