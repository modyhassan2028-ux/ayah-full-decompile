package org.bson.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f20494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f20495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final BigInteger f20487t = new BigInteger("10");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final BigInteger f20488u = new BigInteger("1");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final BigInteger f20489v = new BigInteger("0");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashSet f20490w = new HashSet(Collections.singletonList("nan"));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashSet f20491x = new HashSet(Collections.singletonList("-nan"));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final HashSet f20492y = new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final HashSet f20493z = new HashSet(Arrays.asList("-inf", "-infinity"));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Decimal128 f20483A = fromIEEE754BIDEncoding(8646911284551352320L, 0);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Decimal128 f20484B = fromIEEE754BIDEncoding(-576460752303423488L, 0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Decimal128 f20485C = fromIEEE754BIDEncoding(-288230376151711744L, 0);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Decimal128 f20486D = fromIEEE754BIDEncoding(8935141660703064064L, 0);

    static {
        fromIEEE754BIDEncoding(3476778912330022912L, 0L);
        fromIEEE754BIDEncoding(-5746593124524752896L, 0L);
    }

    public Decimal128(long j) {
        this(new BigDecimal(j, MathContext.DECIMAL128));
    }

    public static int b(BigDecimal bigDecimal, int i10) {
        String string = bigDecimal.unscaledValue().abs().toString();
        int iMax = Math.max(0, string.length() - i10);
        for (int i11 = iMax; i11 < string.length(); i11++) {
            if (string.charAt(i11) != '0') {
                throw new NumberFormatException("Conversion to Decimal128 would require inexact rounding of " + bigDecimal);
            }
        }
        return iMax;
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j, long j10) {
        return new Decimal128(j, j10);
    }

    public static Decimal128 g(String str) {
        String lowerCase = str.toLowerCase();
        if (f20490w.contains(lowerCase)) {
            return f20486D;
        }
        if (f20491x.contains(lowerCase)) {
            return f20485C;
        }
        if (f20492y.contains(lowerCase)) {
            return f20483A;
        }
        if (f20493z.contains(lowerCase)) {
            return f20484B;
        }
        return new Decimal128(new BigDecimal(str), str.charAt(0) == '-');
    }

    public final BigDecimal a() {
        long j;
        char c10;
        long j10 = this.f20494r;
        if ((j10 & 6917529027641081856L) == 6917529027641081856L) {
            j = 2305807824841605120L & j10;
            c10 = '/';
        } else {
            j = 9223231299366420480L & j10;
            c10 = '1';
        }
        int i10 = -(((int) (j >>> c10)) - 6176);
        if ((j10 & 6917529027641081856L) == 6917529027641081856L) {
            return BigDecimal.valueOf(0L, i10);
        }
        int i11 = f() ? -1 : 1;
        byte[] bArr = new byte[15];
        long j11 = 255;
        for (int i12 = 14; i12 >= 7; i12--) {
            bArr[i12] = (byte) ((this.f20495s & j11) >>> ((14 - i12) << 3));
            j11 <<= 8;
        }
        long j12 = 255;
        for (int i13 = 6; i13 >= 1; i13--) {
            bArr[i13] = (byte) ((j10 & j12) >>> ((6 - i13) << 3));
            j12 <<= 8;
        }
        bArr[0] = (byte) ((j10 & 281474976710656L) >>> 48);
        return new BigDecimal(new BigInteger(i11, bArr), i10);
    }

    public final boolean c(BigDecimal bigDecimal) {
        return f() && bigDecimal.signum() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    public final int compareTo(Decimal128 decimal128) {
        Decimal128 decimal129 = decimal128;
        if (e()) {
            return !decimal129.e() ? 1 : 0;
        }
        if (!d()) {
            BigDecimal bigDecimalA = a();
            BigDecimal bigDecimalA2 = decimal129.a();
            if (!e() && !d()) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (bigDecimalA.compareTo(bigDecimal) != 0 || decimal129.e() || decimal129.d() || bigDecimalA2.compareTo(bigDecimal) != 0) {
                    if (decimal129.e()) {
                        return -1;
                    }
                    if (!decimal129.d()) {
                        return bigDecimalA.compareTo(bigDecimalA2);
                    }
                    if (!decimal129.f()) {
                        return -1;
                    }
                } else {
                    if (c(bigDecimalA)) {
                        return decimal129.c(bigDecimalA2) ? 0 : -1;
                    }
                    if (!decimal129.c(bigDecimalA2)) {
                        if (decimal129.e()) {
                            return -1;
                        }
                        if (!decimal129.d()) {
                            return bigDecimalA.compareTo(bigDecimalA2);
                        }
                        if (!decimal129.f()) {
                            return -1;
                        }
                    }
                }
            } else {
                if (decimal129.e()) {
                    return -1;
                }
                if (!decimal129.d()) {
                    return bigDecimalA.compareTo(bigDecimalA2);
                }
                if (!decimal129.f()) {
                    return -1;
                }
            }
        } else {
            if (f()) {
                return (decimal129.d() && decimal129.f()) ? 0 : -1;
            }
            if (decimal129.e()) {
                return -1;
            }
            if (decimal129.d() && !decimal129.f()) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean d() {
        return (this.f20494r & 8646911284551352320L) == 8646911284551352320L;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        if (e()) {
            return Double.NaN;
        }
        if (d()) {
            return f() ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        BigDecimal bigDecimalA = a();
        if (c(bigDecimalA)) {
            return -0.0d;
        }
        return bigDecimalA.doubleValue();
    }

    public final boolean e() {
        return (this.f20494r & 8935141660703064064L) == 8935141660703064064L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        return this.f20494r == decimal128.f20494r && this.f20495s == decimal128.f20495s;
    }

    public final boolean f() {
        return (this.f20494r & Long.MIN_VALUE) == Long.MIN_VALUE;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) doubleValue();
    }

    public final int hashCode() {
        long j = this.f20495s;
        int i10 = ((int) (j ^ (j >>> 32))) * 31;
        long j10 = this.f20494r;
        return i10 + ((int) ((j10 >>> 32) ^ j10));
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) doubleValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) doubleValue();
    }

    public final String toString() {
        if (e()) {
            return "NaN";
        }
        if (d()) {
            return f() ? "-Infinity" : "Infinity";
        }
        StringBuilder sb = new StringBuilder();
        BigDecimal bigDecimalA = a();
        String string = bigDecimalA.unscaledValue().abs().toString();
        if (f()) {
            sb.append('-');
        }
        int i10 = -bigDecimalA.scale();
        int length = (string.length() - 1) + i10;
        if (i10 > 0 || length < -6) {
            sb.append(string.charAt(0));
            if (string.length() > 1) {
                sb.append('.');
                sb.append((CharSequence) string, 1, string.length());
            }
            sb.append('E');
            if (length > 0) {
                sb.append('+');
            }
            sb.append(length);
        } else if (i10 == 0) {
            sb.append(string);
        } else {
            int length2 = (-i10) - string.length();
            if (length2 >= 0) {
                sb.append("0.");
                for (int i11 = 0; i11 < length2; i11++) {
                    sb.append('0');
                }
                sb.append((CharSequence) string, 0, string.length());
            } else {
                int i12 = -length2;
                sb.append((CharSequence) string, 0, i12);
                sb.append('.');
                sb.append((CharSequence) string, i12, i12 - i10);
            }
        }
        return sb.toString();
    }

    public Decimal128(BigDecimal bigDecimal) {
        this(bigDecimal, bigDecimal.signum() == -1);
    }

    public Decimal128(long j, long j10) {
        this.f20494r = j;
        this.f20495s = j10;
    }

    public Decimal128(BigDecimal bigDecimal, boolean z10) {
        BigDecimal bigDecimalRound;
        BigDecimal bigDecimal2;
        int i10;
        int i11 = -bigDecimal.scale();
        BigInteger bigInteger = f20487t;
        if (i11 > 6111) {
            int i12 = (-bigDecimal.scale()) - 6111;
            if (bigDecimal.unscaledValue().equals(f20489v)) {
                bigDecimalRound = new BigDecimal(bigDecimal.unscaledValue(), -6111);
            } else if (bigDecimal.precision() + i12 <= 34) {
                bigDecimal2 = new BigDecimal(bigDecimal.unscaledValue().multiply(bigInteger.pow(i12)), bigDecimal.scale() + i12);
                bigDecimalRound = bigDecimal2;
            } else {
                throw new NumberFormatException("Exponent is out of range for Decimal128 encoding of " + bigDecimal);
            }
        } else if ((-bigDecimal.scale()) < -6176) {
            int iScale = bigDecimal.scale() - 6176;
            bigDecimal2 = new BigDecimal(bigDecimal.unscaledValue().divide(b(bigDecimal, iScale) == 0 ? f20488u : bigInteger.pow(iScale)), bigDecimal.scale() - iScale);
            bigDecimalRound = bigDecimal2;
        } else {
            bigDecimalRound = bigDecimal.round(MathContext.DECIMAL128);
            int iPrecision = bigDecimal.precision() - bigDecimalRound.precision();
            if (iPrecision > 0) {
                b(bigDecimal, iPrecision);
            }
        }
        long j = -bigDecimalRound.scale();
        if (j >= -6176 && j <= 6111) {
            if (bigDecimalRound.unscaledValue().bitLength() <= 113) {
                BigInteger bigIntegerAbs = bigDecimalRound.unscaledValue().abs();
                int iBitLength = bigIntegerAbs.bitLength();
                long j10 = 0;
                int i13 = 0;
                long j11 = 0;
                while (true) {
                    if (i13 >= Math.min(64, iBitLength)) {
                        break;
                    }
                    if (bigIntegerAbs.testBit(i13)) {
                        j11 |= 1 << i13;
                    }
                    i13++;
                }
                for (i10 = 64; i10 < iBitLength; i10++) {
                    if (bigIntegerAbs.testBit(i10)) {
                        j10 |= 1 << (i10 - 64);
                    }
                }
                long j12 = ((j + 6176) << 49) | j10;
                this.f20494r = (bigDecimalRound.signum() == -1 || z10) ? j12 | Long.MIN_VALUE : j12;
                this.f20495s = j11;
                return;
            }
            throw new AssertionError("Unscaled roundedValue is out of range for Decimal128 encoding:" + bigDecimalRound.unscaledValue());
        }
        throw new AssertionError("Exponent is out of range for Decimal128 encoding: " + j);
    }
}
