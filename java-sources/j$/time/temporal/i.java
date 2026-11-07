package j$.time.temporal;

import j$.time.format.D;
import j$.time.format.E;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements TemporalField {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f17972d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f17973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient p f17974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f17975c;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f17972d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        f17972d = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i10, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        super(str, i10);
        this.f17973a = str2;
        this.f17974b = p.f((-365243219162L) + j, 365241780471L + j);
        this.f17975c = j;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal D(Temporal temporal, long j) {
        if (!this.f17974b.e(j)) {
            throw new j$.time.b("Invalid value: " + this.f17973a + " " + j);
        }
        return temporal.c(j$.com.android.tools.r8.a.I(j, this.f17975c), ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final p v() {
        return this.f17974b;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean k(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final p l(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.e(ChronoField.EPOCH_DAY)) {
            return this.f17974b;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final long A(TemporalAccessor temporalAccessor) {
        return temporalAccessor.D(ChronoField.EPOCH_DAY) + this.f17975c;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor p(Map map, D d5, E e10) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.l lVarZ = j$.com.android.tools.r8.a.z(d5);
        E e11 = E.LENIENT;
        long j = this.f17975c;
        if (e10 == e11) {
            return lVarZ.i(j$.com.android.tools.r8.a.I(jLongValue, j));
        }
        this.f17974b.b(jLongValue, this);
        return lVarZ.i(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17973a;
    }
}
