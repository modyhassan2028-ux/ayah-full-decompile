package j$.time.format;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.f f17911h = new j$.time.f(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f17912i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f17913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f17914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f17918f;
    public int g;

    static {
        HashMap map = new HashMap();
        f17912i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.f17968a;
        map.put('Q', fVar);
        map.put('q', fVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.f17976a);
    }

    public u() {
        this.f17913a = this;
        this.f17915c = new ArrayList();
        this.g = -1;
        this.f17914b = null;
        this.f17916d = false;
    }

    public u(u uVar) {
        this.f17913a = this;
        this.f17915c = new ArrayList();
        this.g = -1;
        this.f17914b = uVar;
        this.f17916d = true;
    }

    public final void l(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        k(new i(temporalField, 1, 19, F.NORMAL));
    }

    public final void m(TemporalField temporalField, int i10) {
        Objects.requireNonNull(temporalField, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        k(new i(temporalField, i10, i10, F.NOT_NEGATIVE));
    }

    public final void n(TemporalField temporalField, int i10, int i11, F f3) {
        if (i10 == i11 && f3 == F.NOT_NEGATIVE) {
            m(temporalField, i11);
            return;
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(f3, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        k(new i(temporalField, i10, i11, f3));
    }

    public final void k(i iVar) {
        i iVarD;
        u uVar = this.f17913a;
        int i10 = uVar.g;
        if (i10 < 0) {
            uVar.g = c(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) uVar.f17915c).get(i10);
        int i11 = iVar.f17873b;
        int i12 = iVar.f17874c;
        if (i11 == i12 && iVar.f17875d == F.NOT_NEGATIVE) {
            iVarD = iVar2.e(i12);
            c(iVar.d());
            this.f17913a.g = i10;
        } else {
            iVarD = iVar2.d();
            this.f17913a.g = c(iVar);
        }
        ((ArrayList) this.f17913a.f17915c).set(i10, iVarD);
    }

    public final void b(ChronoField chronoField, int i10, int i11, boolean z10) {
        if (i10 == i11 && !z10) {
            k(new C1058f(chronoField, i10, i11, z10));
        } else {
            c(new C1058f(chronoField, i10, i11, z10));
        }
    }

    public final void j(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new q(temporalField, textStyle, B.f17839c));
    }

    public final void i(ChronoField chronoField, Map map) {
        Objects.requireNonNull(chronoField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new q(chronoField, textStyle, new C1053a(new A(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    public final void f(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(0, textStyle));
    }

    public final void d(char c10) {
        c(new C1055c(c10));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new C1055c(str.charAt(0)));
        } else {
            c(new h(1, str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        C1056d c1056d = dateTimeFormatter.f17849a;
        if (c1056d.f17868b) {
            c1056d = new C1056d(c1056d.f17867a, false);
        }
        c(c1056d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:119:0x01e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:159:0x0291  */
    /* JADX WARN: Code duplicated, block: B:260:0x0487  */
    /* JADX WARN: Code duplicated, block: B:262:0x0491  */
    /* JADX WARN: Code duplicated, block: B:263:0x0495  */
    /* JADX WARN: Code duplicated, block: B:297:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x04a0 A[SYNTHETIC] */
    public final void h(String str) {
        String strSubstring;
        boolean z10;
        int i10;
        int i11;
        Objects.requireNonNull(str, "pattern");
        int i12 = 0;
        while (i12 < str.length()) {
            char cCharAt = str.charAt(i12);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i13 = i12 + 1;
                while (i13 < str.length() && str.charAt(i13) == cCharAt) {
                    i13++;
                }
                int i14 = i13 - i12;
                if (cCharAt == 'p') {
                    if (i13 >= str.length() || (((cCharAt = str.charAt(i13)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i10 = i13;
                        i11 = i14;
                        i14 = 0;
                    } else {
                        i10 = i13 + 1;
                        while (i10 < str.length() && str.charAt(i10) == cCharAt) {
                            i10++;
                        }
                        i11 = i10 - i13;
                    }
                    if (i14 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i14 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i14);
                    }
                    u uVar = this.f17913a;
                    uVar.f17917e = i14;
                    uVar.f17918f = ' ';
                    uVar.g = -1;
                    i14 = i11;
                    i13 = i10;
                }
                TemporalField temporalField = (TemporalField) ((HashMap) f17912i).get(Character.valueOf(cCharAt));
                if (temporalField != null) {
                    if (cCharAt == 'A') {
                        n(temporalField, i14, 19, F.NOT_NEGATIVE);
                    } else {
                        if (cCharAt == 'Q') {
                            z10 = false;
                        } else if (cCharAt == 'S') {
                            b(ChronoField.NANO_OF_SECOND, i14, i14, false);
                        } else if (cCharAt == 'a') {
                            if (i14 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            j(temporalField, TextStyle.SHORT);
                        } else if (cCharAt == 'k') {
                            if (i14 == 1) {
                                l(temporalField);
                            } else {
                                if (i14 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m(temporalField, i14);
                            }
                        } else if (cCharAt == 'q') {
                            z10 = true;
                        } else if (cCharAt == 's') {
                            if (i14 == 1) {
                                l(temporalField);
                            } else {
                                if (i14 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m(temporalField, i14);
                            }
                        } else if (cCharAt == 'u' || cCharAt == 'y') {
                            if (i14 == 2) {
                                LocalDate localDate = o.f17896h;
                                Objects.requireNonNull(temporalField, "field");
                                Objects.requireNonNull(localDate, "baseDate");
                                o oVar = new o(temporalField, 2, 2, localDate, 0);
                                if (localDate == null) {
                                    long j = 0;
                                    if (!temporalField.v().e(j)) {
                                        throw new IllegalArgumentException("The base value must be within the range of the field");
                                    }
                                    if (j + i.f17871f[2] > 2147483647L) {
                                        throw new j$.time.b("Unable to add printer-parser as the range exceeds the capacity of an int");
                                    }
                                }
                                k(oVar);
                            } else if (i14 < 4) {
                                n(temporalField, i14, 19, F.NORMAL);
                            } else {
                                n(temporalField, i14, 19, F.EXCEEDS_PAD);
                            }
                        } else if (cCharAt == 'g') {
                            n(temporalField, i14, 19, F.NORMAL);
                        } else if (cCharAt == 'h' || cCharAt == 'm') {
                            if (i14 == 1) {
                                l(temporalField);
                            } else {
                                if (i14 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m(temporalField, i14);
                            }
                        } else if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'D':
                                    if (i14 == 1) {
                                        l(temporalField);
                                    } else {
                                        if (i14 != 2 && i14 != 3) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        n(temporalField, i14, 3, F.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    z10 = false;
                                    break;
                                case 'F':
                                    if (i14 != 1) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    l(temporalField);
                                    break;
                                    break;
                                case 'G':
                                    if (i14 == 1 || i14 == 2 || i14 == 3) {
                                        j(temporalField, TextStyle.SHORT);
                                    } else if (i14 == 4) {
                                        j(temporalField, TextStyle.FULL);
                                    } else {
                                        if (i14 != 5) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        j(temporalField, TextStyle.NARROW);
                                    }
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            z10 = true;
                                            break;
                                        case 'M':
                                            z10 = false;
                                            break;
                                        case 'N':
                                            n(temporalField, i14, 19, F.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'c':
                                                    if (i14 == 1) {
                                                        int i15 = i14;
                                                        k(new r(cCharAt, i15, i15, i15, 0));
                                                    } else {
                                                        if (i14 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        z10 = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case 'e':
                                                    z10 = false;
                                                    break;
                                                default:
                                                    if (i14 != 1) {
                                                        m(temporalField, i14);
                                                    } else {
                                                        l(temporalField);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 'H':
                                    if (i14 == 1) {
                                        l(temporalField);
                                    } else {
                                        if (i14 == 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m(temporalField, i14);
                                    }
                                    break;
                            }
                        } else {
                            n(temporalField, i14, 19, F.NOT_NEGATIVE);
                        }
                        if (i14 == 1 || i14 == 2) {
                            if (cCharAt == 'e') {
                                int i16 = i14;
                                k(new r(cCharAt, i16, i16, i16, 0));
                            } else if (cCharAt == 'E') {
                                j(temporalField, TextStyle.SHORT);
                            } else if (i14 == 1) {
                                l(temporalField);
                            } else {
                                m(temporalField, 2);
                            }
                        } else if (i14 == 3) {
                            j(temporalField, z10 ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i14 == 4) {
                            j(temporalField, z10 ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i14 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            j(temporalField, z10 ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    }
                } else if (cCharAt == 'z') {
                    if (i14 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i14 == 4) {
                        c(new t(TextStyle.FULL, false));
                    } else {
                        c(new t(TextStyle.SHORT, false));
                    }
                } else if (cCharAt == 'V') {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    c(new s(j$.time.temporal.n.f17979a, "ZoneId()"));
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i14 < 4) {
                            g("+HHMM", "+0000");
                        } else if (i14 == 4) {
                            f(TextStyle.FULL);
                        } else {
                            if (i14 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            g("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i14 == 1) {
                            f(TextStyle.SHORT);
                        } else {
                            if (i14 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            f(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i14 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        g(j.f17877d[i14 + (i14 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i14 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i14 == 1) {
                            str2 = "+00";
                        } else if (i14 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        g(j.f17877d[i14 + (i14 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt != 'W') {
                        int i17 = i14;
                        if (cCharAt == 'w') {
                            if (i17 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            k(new r(cCharAt, i17, i17, 2, 0));
                        } else {
                            if (cCharAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            if (i17 == 2) {
                                k(new r(cCharAt, i17, i17, 2, 0));
                            } else {
                                k(new r(cCharAt, i17, i17, 19, 0));
                            }
                        }
                    } else {
                        if (i14 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        int i18 = i14;
                        k(new r(cCharAt, i18, i18, i18, 0));
                    }
                } else if (i14 == 1) {
                    c(new t(TextStyle.SHORT, true));
                } else {
                    if (i14 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                    }
                    c(new t(TextStyle.FULL, true));
                }
                i12 = i13 - 1;
            } else if (cCharAt == '\'') {
                int i19 = i12 + 1;
                int i20 = i19;
                while (i20 < str.length()) {
                    if (str.charAt(i20) == '\'') {
                        int i21 = i20 + 1;
                        if (i21 < str.length() && str.charAt(i21) == '\'') {
                            i20 = i21;
                        } else {
                            if (i20 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i19, i20);
                            if (strSubstring.isEmpty()) {
                                d('\'');
                            } else {
                                e(strSubstring.replace("''", "'"));
                            }
                            i12 = i20;
                        }
                    }
                    i20++;
                }
                if (i20 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i19, i20);
                if (strSubstring.isEmpty()) {
                    d('\'');
                } else {
                    e(strSubstring.replace("''", "'"));
                }
                i12 = i20;
            } else if (cCharAt == '[') {
                p();
            } else if (cCharAt == ']') {
                if (this.f17913a.f17914b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                o();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                d(cCharAt);
            }
            i12++;
        }
    }

    public final void p() {
        u uVar = this.f17913a;
        uVar.g = -1;
        this.f17913a = new u(uVar);
    }

    public final void o() {
        u uVar = this.f17913a;
        if (uVar.f17914b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) uVar.f17915c).size() > 0) {
            u uVar2 = this.f17913a;
            C1056d c1056d = new C1056d(uVar2.f17915c, uVar2.f17916d);
            this.f17913a = this.f17913a.f17914b;
            c(c1056d);
            return;
        }
        this.f17913a = this.f17913a.f17914b;
    }

    public final int c(InterfaceC1057e interfaceC1057e) {
        Objects.requireNonNull(interfaceC1057e, "pp");
        u uVar = this.f17913a;
        int i10 = uVar.f17917e;
        if (i10 > 0) {
            if (interfaceC1057e != null) {
                interfaceC1057e = new k(interfaceC1057e, i10, uVar.f17918f);
            }
            uVar.f17917e = 0;
            uVar.f17918f = (char) 0;
        }
        ((ArrayList) uVar.f17915c).add(interfaceC1057e);
        u uVar2 = this.f17913a;
        uVar2.g = -1;
        return ((ArrayList) uVar2.f17915c).size() - 1;
    }

    public final DateTimeFormatter q(E e10, j$.time.chrono.l lVar) {
        return r(Locale.getDefault(), e10, lVar);
    }

    public final DateTimeFormatter r(Locale locale, E e10, j$.time.chrono.l lVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f17913a.f17914b != null) {
            o();
        }
        C1056d c1056d = new C1056d(this.f17915c, false);
        C c10 = C.f17840a;
        return new DateTimeFormatter(c1056d, locale, e10, lVar);
    }
}
