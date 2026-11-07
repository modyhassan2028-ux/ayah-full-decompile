package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.k, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f17767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f17763d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f17764e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = Z(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f17765f = Z(-64800);
    public static final ZoneOffset g = Z(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f17766b - this.f17766b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset X(String str) {
        int iA0;
        int iA1;
        int iA2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f17764e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 3, false);
                } else if (length == 6) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 4, true);
                } else if (length == 7) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 3, false);
                    iA2 = a0(str, 5, false);
                } else if (length == 9) {
                    iA0 = a0(str, 1, false);
                    iA1 = a0(str, 4, true);
                    iA2 = a0(str, 7, true);
                } else {
                    throw new b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iA2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return Y(-iA0, -iA1, -iA2);
            }
            return Y(iA0, iA1, iA2);
        }
        iA0 = a0(str, 1, false);
        iA1 = 0;
        iA2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return Y(-iA0, -iA1, -iA2);
        }
        return Y(iA0, iA1, iA2);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f R() {
        Objects.requireNonNull(this, "offset");
        return new j$.time.zone.f(this);
    }

    public static int a0(CharSequence charSequence, int i10, boolean z10) {
        if (z10) {
            String str = (String) charSequence;
            if (str.charAt(i10 - 1) != ':') {
                throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i10);
        char cCharAt2 = str2.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset W(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.v(j$.time.temporal.n.f17982d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new b("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    public static ZoneOffset Y(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new b("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new b("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (i12 < -59 || i12 > 59) {
            throw new b("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (Math.abs(i10) == 18 && (i11 | i12) != 0) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return Z((i11 * 60) + (i10 * 3600) + i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset Z(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i10);
            ConcurrentHashMap concurrentHashMap = f17763d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i10));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f17764e.putIfAbsent(zoneOffset2.f17767c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i10);
    }

    public ZoneOffset(int i10) {
        String string;
        this.f17766b = i10;
        if (i10 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i10);
            StringBuilder sb = new StringBuilder();
            int i11 = iAbs / 3600;
            int i12 = (iAbs / 60) % 60;
            sb.append(i10 < 0 ? "-" : "+");
            sb.append(i11 < 10 ? "0" : "");
            sb.append(i11);
            sb.append(i12 < 10 ? ":0" : ":");
            sb.append(i12);
            int i13 = iAbs % 60;
            if (i13 != 0) {
                sb.append(i13 < 10 ? ":0" : ":");
                sb.append(i13);
            }
            string = sb.toString();
        }
        this.f17767c = string;
    }

    @Override // j$.time.ZoneId
    public final String j() {
        return this.f17767c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.f17766b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
        return j$.time.temporal.n.d(this, temporalField).a(D(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.f17766b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
        return temporalField.A(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        return (fVar == j$.time.temporal.n.f17982d || fVar == j$.time.temporal.n.f17983e) ? this : j$.time.temporal.n.c(this, fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(this.f17766b, ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f17766b == ((ZoneOffset) obj).f17766b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f17766b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f17767c;
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void V(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        c0(dataOutput);
    }

    public final void c0(DataOutput dataOutput) throws IOException {
        int i10 = this.f17766b;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    public static ZoneOffset b0(DataInput dataInput) throws IOException {
        byte b5 = dataInput.readByte();
        return b5 == 127 ? Z(dataInput.readInt()) : Z(b5 * 900);
    }
}
