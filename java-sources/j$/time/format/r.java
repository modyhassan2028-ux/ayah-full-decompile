package j$.time.format;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends i {
    public final char g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17902h;

    @Override // j$.time.format.i, j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        return f(vVar.f17919a.f17850b).l(vVar, charSequence, i10);
    }

    @Override // j$.time.format.i, j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        return f(yVar.f17929b.f17850b).k(yVar, sb);
    }

    public r(char c10, int i10, int i11, int i12, int i13) {
        super(null, i11, i12, F.NOT_NEGATIVE, i13);
        this.g = c10;
        this.f17902h = i10;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f17876e == -1) {
            return this;
        }
        return new r(this.g, this.f17902h, this.f17873b, this.f17874c, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i10) {
        return new r(this.g, this.f17902h, this.f17873b, this.f17874c, this.f17876e + i10);
    }

    public final i f(Locale locale) {
        j$.time.temporal.q qVar;
        ConcurrentHashMap concurrentHashMap = j$.time.temporal.r.g;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.r rVarA = j$.time.temporal.r.a(DayOfWeek.f17736a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c10 = this.g;
        if (c10 == 'W') {
            qVar = rVarA.f18001d;
        } else {
            if (c10 == 'Y') {
                j$.time.temporal.q qVar2 = rVarA.f18003f;
                int i10 = this.f17902h;
                if (i10 == 2) {
                    return new o(qVar2, 2, 2, o.f17896h, this.f17876e);
                }
                return new i(qVar2, i10, 19, i10 < 4 ? F.NORMAL : F.EXCEEDS_PAD, this.f17876e);
            }
            if (c10 == 'c' || c10 == 'e') {
                qVar = rVarA.f18000c;
            } else {
                if (c10 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                qVar = rVarA.f18002e;
            }
        }
        return new i(qVar, this.f17873b, this.f17874c, F.NOT_NEGATIVE, this.f17876e);
    }

    @Override // j$.time.format.i
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i10 = this.f17902h;
        char c10 = this.g;
        if (c10 != 'Y') {
            if (c10 == 'W') {
                sb.append("WeekOfMonth");
            } else if (c10 == 'c' || c10 == 'e') {
                sb.append("DayOfWeek");
            } else if (c10 == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i10);
        } else if (i10 == 1) {
            sb.append("WeekBasedYear");
        } else if (i10 == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i10);
            sb.append(",19,");
            sb.append(i10 < 4 ? F.NORMAL : F.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
