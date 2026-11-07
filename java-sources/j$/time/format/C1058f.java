package j$.time.format;

import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: renamed from: j$.time.format.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1058f extends i {
    public final boolean g;

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        return vVar.f17921c && this.f17873b == this.f17874c && !this.g;
    }

    @Override // j$.time.format.i, j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        boolean z10 = vVar.f17921c;
        DateTimeFormatter dateTimeFormatter = vVar.f17919a;
        int i11 = (z10 || b(vVar)) ? this.f17873b : 0;
        int i12 = (vVar.f17921c || b(vVar)) ? this.f17874c : 9;
        int length = charSequence.length();
        if (i10 != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i10);
                dateTimeFormatter.f17851c.getClass();
                if (cCharAt == '.') {
                    i10++;
                } else if (i11 > 0) {
                    return ~i10;
                }
            }
            int i13 = i10;
            int i14 = i11 + i13;
            if (i14 > length) {
                return ~i13;
            }
            int iMin = Math.min(i12 + i13, length);
            int i15 = 0;
            int i16 = i13;
            while (i16 < iMin) {
                int i17 = i16 + 1;
                char cCharAt2 = charSequence.charAt(i16);
                dateTimeFormatter.f17851c.getClass();
                int i18 = cCharAt2 - '0';
                if (i18 < 0 || i18 > 9) {
                    i18 = -1;
                }
                if (i18 < 0) {
                    if (i17 >= i14) {
                        break;
                    }
                    return ~i13;
                }
                i15 = (i15 * 10) + i18;
                i16 = i17;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i15).movePointLeft(i16 - i13);
            j$.time.temporal.p pVarV = this.f17872a.v();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarV.f17985a);
            return vVar.f(this.f17872a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(pVarV.f17988d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i13, i16);
        }
        if (i11 > 0) {
            return ~i10;
        }
        return i10;
    }

    public C1058f(TemporalField temporalField, int i10, int i11, boolean z10) {
        this(temporalField, i10, i11, z10, 0);
        Objects.requireNonNull(temporalField, "field");
        j$.time.temporal.p pVarV = temporalField.v();
        if (pVarV.f17985a != pVarV.f17986b || pVarV.f17987c != pVarV.f17988d) {
            throw new IllegalArgumentException(j$.time.c.a("Field must have a fixed set of values: ", temporalField));
        }
        if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
    }

    public C1058f(TemporalField temporalField, int i10, int i11, boolean z10, int i12) {
        super(temporalField, i10, i11, F.NOT_NEGATIVE, i12);
        this.g = z10;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f17876e == -1) {
            return this;
        }
        return new C1058f(this.f17872a, this.f17873b, this.f17874c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i10) {
        return new C1058f(this.f17872a, this.f17873b, this.f17874c, this.g, this.f17876e + i10);
    }

    @Override // j$.time.format.i, j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        TemporalField temporalField = this.f17872a;
        Long lA = yVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        C c10 = yVar.f17929b.f17851c;
        long jLongValue = lA.longValue();
        j$.time.temporal.p pVarV = temporalField.v();
        pVarV.b(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarV.f17985a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(pVarV.f17988d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z10 = this.g;
        int i10 = this.f17873b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f17874c), roundingMode).toPlainString().substring(2);
            c10.getClass();
            if (z10) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i10 > 0) {
            if (z10) {
                c10.getClass();
                sb.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                c10.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f17872a + "," + this.f17873b + "," + this.f17874c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
