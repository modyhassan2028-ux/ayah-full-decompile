package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17962a;

    static {
        j$.time.d.p(1L);
        j$.time.d.p(1000L);
        j$.time.d.p(1000000L);
        j$.time.d.l(1L, 0);
        j$.time.d.l(60L, 0);
        j$.time.d.l(3600L, 0);
        j$.time.d.l(43200L, 0);
        j$.time.d.l(86400L, 0);
        j$.time.d.l(604800L, 0);
        j$.time.d.l(2629746L, 0);
        j$.time.d.l(31556952L, 0);
        j$.time.d.l(315569520L, 0);
        j$.time.d.l(3155695200L, 0);
        j$.time.d.l(31556952000L, 0);
        j$.time.d.l(31556952000000000L, 0);
        j$.time.d.l(j$.com.android.tools.r8.a.B(Long.MAX_VALUE, j$.com.android.tools.r8.a.G(999999999L, 1000000000L)), (int) j$.com.android.tools.r8.a.F(999999999L, 1000000000L));
    }

    ChronoUnit(String str) {
        this.f17962a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal k(Temporal temporal, long j) {
        return temporal.d(j, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17962a;
    }
}
