package j$.time.temporal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j$.time.f f17979a = new j$.time.f(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j$.time.f f17980b = new j$.time.f(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j$.time.f f17981c = new j$.time.f(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.f f17982d = new j$.time.f(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.f f17983e = new j$.time.f(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j$.time.f f17984f = new j$.time.f(9);
    public static final j$.time.f g = new j$.time.f(10);

    public static /* synthetic */ int e(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return 0;
        }
        return (((i10 ^ 7) >> 31) | 1) > 0 ? i11 : i11 + 7;
    }

    public static p d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.l(temporalAccessor);
        }
        if (temporalAccessor.e(temporalField)) {
            return ((ChronoField) temporalField).f17960b;
        }
        throw new o(j$.time.c.a("Unsupported field: ", temporalField));
    }

    public static int a(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        p pVarL = temporalAccessor.l(temporalField);
        if (!pVarL.d()) {
            throw new o("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long jD = temporalAccessor.D(temporalField);
        if (pVarL.e(jD)) {
            return (int) jD;
        }
        throw new j$.time.b("Invalid value for " + temporalField + " (valid values " + pVarL + "): " + jD);
    }

    public static Object c(TemporalAccessor temporalAccessor, j$.time.f fVar) {
        if (fVar == f17979a || fVar == f17980b || fVar == f17981c) {
            return null;
        }
        return fVar.g(temporalAccessor);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j10;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.d(Long.MAX_VALUE, temporalUnit);
            j10 = 1;
        } else {
            j10 = -j;
        }
        return temporal.d(j10, temporalUnit);
    }
}
