package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.q;
import j$.time.temporal.ChronoField;
import j$.time.temporal.l;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f18028i = new long[0];
    public static final e[] j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f18029k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f18030l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f18031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f18032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f18033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f18034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f18035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f18036f;
    public final TimeZone g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f18037h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f18015b;
        if (bVar.k()) {
            if (localDateTime.S(localDateTime2)) {
                return bVar.f18016c;
            }
            if (!localDateTime.S(bVar.f18015b.W(bVar.f18017d.f17766b - bVar.f18016c.f17766b))) {
                return bVar.f18017d;
            }
        } else {
            if (!localDateTime.S(localDateTime2)) {
                return bVar.f18017d;
            }
            if (localDateTime.S(bVar.f18015b.W(bVar.f18017d.f17766b - bVar.f18016c.f17766b))) {
                return bVar.f18016c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f18031a = jArr;
        this.f18032b = zoneOffsetArr;
        this.f18033c = jArr2;
        this.f18035e = zoneOffsetArr2;
        this.f18036f = eVarArr;
        if (jArr2.length == 0) {
            this.f18034d = f18029k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.k()) {
                    arrayList.add(bVar.f18015b);
                    arrayList.add(bVar.f18015b.W(bVar.f18017d.f17766b - bVar.f18016c.f17766b));
                } else {
                    arrayList.add(bVar.f18015b.W(bVar.f18017d.f17766b - bVar.f18016c.f17766b));
                    arrayList.add(bVar.f18015b);
                }
                i10 = i11;
            }
            this.f18034d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f18032b = zoneOffsetArr;
        long[] jArr = f18028i;
        this.f18031a = jArr;
        this.f18033c = jArr;
        this.f18034d = f18029k;
        this.f18035e = zoneOffsetArr;
        this.f18036f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.f18032b = zoneOffsetArr;
        long[] jArr = f18028i;
        this.f18031a = jArr;
        this.f18033c = jArr;
        this.f18034d = f18029k;
        this.f18035e = zoneOffsetArr;
        this.f18036f = j;
        this.g = timeZone;
    }

    public static ZoneOffset h(int i10) {
        return ZoneOffset.Z(i10 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j10, ZoneOffset zoneOffset) {
        return LocalDate.d0(j$.com.android.tools.r8.a.G(j10 + ((long) zoneOffset.f17766b), 86400)).f17743a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.W()));
        }
        long[] jArr = this.f18033c;
        if (jArr.length == 0) {
            return this.f18032b[0];
        }
        long j10 = instant.f17739a;
        if (this.f18036f.length > 0 && j10 > jArr[jArr.length - 1]) {
            ZoneOffset[] zoneOffsetArr = this.f18035e;
            b[] bVarArrB = b(c(j10, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i10 = 0; i10 < bVarArrB.length; i10++) {
                bVar = bVarArrB[i10];
                if (j10 < bVar.f18014a) {
                    return bVar.f18016c;
                }
            }
            return bVar.f18017d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f18035e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.k() ? Collections.EMPTY_LIST : j$.com.android.tools.r8.a.C(new Object[]{bVar.f18016c, bVar.f18017d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.Q(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r8.f17749b.c0() <= r0.f17749b.c0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i10) {
        LocalDate localDateR;
        b[] bVarArr = f18030l;
        Integer numValueOf = Integer.valueOf(i10);
        b[] bVarArr2 = (b[]) this.f18037h.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j10 = 1;
        int i11 = 0;
        int i12 = 1;
        if (this.g != null) {
            if (i10 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f17746c;
            long jV = j$.com.android.tools.r8.a.v(new LocalDateTime(LocalDate.c0(i10 - 1, 12, 31), LocalTime.of(0, 0)), this.f18032b[0]);
            long j11 = 1000;
            int offset = this.g.getOffset(jV * 1000);
            long j12 = 31968000 + jV;
            while (jV < j12) {
                long j13 = jV + 7776000;
                long j14 = j11;
                if (offset != this.g.getOffset(j13 * j14)) {
                    while (j13 - jV > j10) {
                        long jG = j$.com.android.tools.r8.a.G(j13 + jV, 2L);
                        if (this.g.getOffset(jG * j14) == offset) {
                            jV = jG;
                        } else {
                            j13 = jG;
                        }
                        j10 = 1;
                    }
                    if (this.g.getOffset(jV * j14) == offset) {
                        jV = j13;
                    }
                    ZoneOffset zoneOffsetH = h(offset);
                    int offset2 = this.g.getOffset(jV * j14);
                    ZoneOffset zoneOffsetH2 = h(offset2);
                    if (c(jV, zoneOffsetH2) == i10) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jV, zoneOffsetH, zoneOffsetH2);
                    }
                    offset = offset2;
                } else {
                    jV = j13;
                }
                j11 = j14;
                j10 = 1;
            }
            if (1916 <= i10 && i10 < 2100) {
                this.f18037h.putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f18036f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i13 = 0;
        while (i13 < eVarArr.length) {
            e eVar = eVarArr[i13];
            byte b5 = eVar.f18021b;
            if (b5 < 0) {
                Month month = eVar.f18020a;
                long j15 = i10;
                int iR = month.R(q.f17812c.P(j15)) + 1 + eVar.f18021b;
                LocalDate localDate = LocalDate.f17741d;
                ChronoField.YEAR.Q(j15);
                Objects.requireNonNull(month, "month");
                ChronoField.DAY_OF_MONTH.Q(iR);
                localDateR = LocalDate.R(i10, month.getValue(), iR);
                DayOfWeek dayOfWeek = eVar.f18022c;
                if (dayOfWeek != null) {
                    localDateR = localDateR.k(new l(dayOfWeek.getValue(), i12));
                }
            } else {
                Month month2 = eVar.f18020a;
                LocalDate localDate2 = LocalDate.f17741d;
                ChronoField.YEAR.Q(i10);
                Objects.requireNonNull(month2, "month");
                ChronoField.DAY_OF_MONTH.Q(b5);
                localDateR = LocalDate.R(i10, month2.getValue(), b5);
                DayOfWeek dayOfWeek2 = eVar.f18022c;
                if (dayOfWeek2 != null) {
                    localDateR = localDateR.k(new l(dayOfWeek2.getValue(), i11));
                }
            }
            if (eVar.f18024e) {
                localDateR = localDateR.plusDays(1L);
            }
            LocalDateTime localDateTimeT = LocalDateTime.T(localDateR, eVar.f18023d);
            d dVar = eVar.f18025f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.f18026h;
            dVar.getClass();
            int i14 = c.f18018a[dVar.ordinal()];
            if (i14 == 1) {
                localDateTimeT = localDateTimeT.W(zoneOffset2.f17766b - ZoneOffset.UTC.f17766b);
            } else if (i14 == 2) {
                localDateTimeT = localDateTimeT.W(zoneOffset2.f17766b - zoneOffset.f17766b);
            }
            bVarArr3[i13] = new b(localDateTimeT, eVar.f18026h, eVar.f18027i);
            i13++;
            i11 = 0;
        }
        if (i10 < 2100) {
            this.f18037h.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetH;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetH = h(timeZone.getRawOffset());
        } else if (this.f18033c.length != 0) {
            int iBinarySearch = Arrays.binarySearch(this.f18031a, instant.f17739a);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetH = this.f18032b[iBinarySearch + 1];
        } else {
            zoneOffsetH = this.f18032b[0];
        }
        return !zoneOffsetH.equals(d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.f18031a, fVar.f18031a) && Arrays.equals(this.f18032b, fVar.f18032b) && Arrays.equals(this.f18033c, fVar.f18033c) && Arrays.equals(this.f18035e, fVar.f18035e) && Arrays.equals(this.f18036f, fVar.f18036f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.f18031a)) ^ Arrays.hashCode(this.f18032b)) ^ Arrays.hashCode(this.f18033c)) ^ Arrays.hashCode(this.f18035e)) ^ Arrays.hashCode(this.f18036f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f18032b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
