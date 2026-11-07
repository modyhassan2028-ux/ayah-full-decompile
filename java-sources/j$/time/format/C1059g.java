package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* JADX INFO: renamed from: j$.time.format.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1059g implements InterfaceC1057e {
    @Override // j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        Long lA = yVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = yVar.f17928a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.e(chronoField) ? Long.valueOf(temporalAccessor.D(chronoField)) : null;
        int i10 = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = chronoField.f17960b.a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jG = j$.com.android.tools.r8.a.G(j, 315569520000L) + 1;
            LocalDateTime localDateTimeU = LocalDateTime.U(j$.com.android.tools.r8.a.F(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jG > 0) {
                sb.append('+');
                sb.append(jG);
            }
            sb.append(localDateTimeU);
            if (localDateTimeU.f17749b.f17755c == 0) {
                sb.append(":00");
            }
        } else {
            long j10 = jLongValue + 62167219200L;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            LocalDateTime localDateTimeU2 = LocalDateTime.U(j12 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeU2);
            if (localDateTimeU2.f17749b.f17755c == 0) {
                sb.append(":00");
            }
            if (j11 < 0) {
                if (localDateTimeU2.f17748a.f17743a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb.insert(length, j11);
                } else {
                    sb.insert(length + 1, Math.abs(j11));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i11 = 100000000;
            while (true) {
                if (iA <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = iA / i11;
                sb.append((char) (i12 + 48));
                iA -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        u uVar = new u();
        uVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        uVar.d('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        uVar.m(chronoField, 2);
        uVar.d(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        uVar.m(chronoField2, 2);
        uVar.d(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        uVar.m(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i11 = 1;
        uVar.b(chronoField4, 0, 9, true);
        uVar.d('Z');
        C1056d c1056d = uVar.r(Locale.getDefault(), E.SMART, null).f17849a;
        if (c1056d.f17868b) {
            c1056d = new C1056d(c1056d.f17867a, false);
        }
        v vVar2 = new v(vVar.f17919a);
        vVar2.f17920b = vVar.f17920b;
        vVar2.f17921c = vVar.f17921c;
        int iL = c1056d.l(vVar2, charSequence, i10);
        if (iL < 0) {
            return iL;
        }
        long jLongValue = vVar2.d(ChronoField.YEAR).longValue();
        int iIntValue = vVar2.d(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVar2.d(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVar2.d(chronoField).intValue();
        int iIntValue4 = vVar2.d(chronoField2).intValue();
        Long lD = vVar2.d(chronoField3);
        Long lD2 = vVar2.d(chronoField4);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            vVar.c().f17844d = true;
            i11 = 0;
            iIntValue5 = 59;
        } else {
            i11 = 0;
        }
        int i12 = ((int) jLongValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.f17746c;
            LocalDate localDateC0 = LocalDate.c0(i12, iIntValue, iIntValue2);
            LocalTime localTimeU = LocalTime.U(iIntValue3, iIntValue4, iIntValue5, 0);
            return vVar.f(chronoField4, iIntValue6, i10, vVar.f(ChronoField.INSTANT_SECONDS, j$.com.android.tools.r8.a.v(new LocalDateTime(localDateC0, localTimeU).Z(localDateC0.plusDays(i11), localTimeU), ZoneOffset.UTC) + j$.com.android.tools.r8.a.H(jLongValue / 10000, 315569520000L), i10, iL));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
