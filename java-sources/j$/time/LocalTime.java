package j$.time;

import io.realm.RealmFieldTypeConstants;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalTime implements Temporal, j$.time.temporal.k, Comparable<LocalTime>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LocalTime f17750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LocalTime f17751f;
    public static final LocalTime g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LocalTime[] f17752h = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f17754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f17755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17756d;

    static {
        int i10 = 0;
        while (true) {
            LocalTime[] localTimeArr = f17752h;
            if (i10 < localTimeArr.length) {
                localTimeArr[i10] = new LocalTime(i10, 0, 0, 0);
                i10++;
            } else {
                LocalTime localTime = localTimeArr[0];
                g = localTime;
                LocalTime localTime2 = localTimeArr[12];
                f17750e = localTime;
                f17751f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime of(int i10, int i11) {
        ChronoField.HOUR_OF_DAY.Q(i10);
        if (i11 == 0) {
            return f17752h[i10];
        }
        ChronoField.MINUTE_OF_HOUR.Q(i11);
        return new LocalTime(i10, i11, 0, 0);
    }

    public static LocalTime U(int i10, int i11, int i12, int i13) {
        ChronoField.HOUR_OF_DAY.Q(i10);
        ChronoField.MINUTE_OF_HOUR.Q(i11);
        ChronoField.SECOND_OF_MINUTE.Q(i12);
        ChronoField.NANO_OF_SECOND.Q(i13);
        return R(i10, i11, i12, i13);
    }

    public static LocalTime V(long j) {
        ChronoField.NANO_OF_DAY.Q(j);
        int i10 = (int) (j / 3600000000000L);
        long j10 = j - (((long) i10) * 3600000000000L);
        int i11 = (int) (j10 / 60000000000L);
        long j11 = j10 - (((long) i11) * 60000000000L);
        int i12 = (int) (j11 / 1000000000);
        return R(i10, i11, i12, (int) (j11 - (((long) i12) * 1000000000)));
    }

    public static LocalTime S(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.v(j$.time.temporal.n.g);
        if (localTime != null) {
            return localTime;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.b(charSequence, new f(1));
    }

    public static LocalTime R(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f17752h[i10];
        }
        return new LocalTime(i10, i11, i12, i13);
    }

    public LocalTime(int i10, int i11, int i12, int i13) {
        this.f17753a = (byte) i10;
        this.f17754b = (byte) i11;
        this.f17755c = (byte) i12;
        this.f17756d = i13;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R();
        }
        return temporalField != null && temporalField.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        return j$.time.temporal.n.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return T(temporalField);
        }
        return j$.time.temporal.n.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return c0();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return c0() / 1000;
            }
            return T(temporalField);
        }
        return temporalField.A(this);
    }

    public final int T(TemporalField temporalField) {
        switch (i.f17934a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f17756d;
            case 2:
                throw new j$.time.temporal.o("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f17756d / 1000;
            case 4:
                throw new j$.time.temporal.o("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f17756d / 1000000;
            case 6:
                return (int) (c0() / 1000000);
            case 7:
                return this.f17755c;
            case 8:
                return d0();
            case 9:
                return this.f17754b;
            case 10:
                return (this.f17753a * 60) + this.f17754b;
            case 11:
                return this.f17753a % 12;
            case 12:
                int i10 = this.f17753a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return this.f17753a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                byte b5 = this.f17753a;
                if (b5 == 0) {
                    return 24;
                }
                return b5;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return this.f17753a / 12;
            default:
                throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
    }

    public int getHour() {
        return this.f17753a;
    }

    public int getMinute() {
        return this.f17754b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final Temporal z(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalTime c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.D(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        switch (i.f17934a[chronoField.ordinal()]) {
            case 1:
                return f0((int) j);
            case 2:
                return V(j);
            case 3:
                return f0(((int) j) * 1000);
            case 4:
                return V(j * 1000);
            case 5:
                return f0(((int) j) * 1000000);
            case 6:
                return V(j * 1000000);
            case 7:
                int i10 = (int) j;
                if (this.f17755c != i10) {
                    ChronoField.SECOND_OF_MINUTE.Q(i10);
                    return R(this.f17753a, this.f17754b, i10, this.f17756d);
                }
                return this;
            case 8:
                return a0(j - ((long) d0()));
            case 9:
                int i11 = (int) j;
                if (this.f17754b != i11) {
                    ChronoField.MINUTE_OF_HOUR.Q(i11);
                    return R(this.f17753a, i11, this.f17755c, this.f17756d);
                }
                return this;
            case 10:
                return Y(j - ((long) ((this.f17753a * 60) + this.f17754b)));
            case 11:
                return X(j - ((long) (this.f17753a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return X(j - ((long) (this.f17753a % 12)));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                int i12 = (int) j;
                if (this.f17753a != i12) {
                    ChronoField.HOUR_OF_DAY.Q(i12);
                    return R(i12, this.f17754b, this.f17755c, this.f17756d);
                }
                return this;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                if (j == 24) {
                    j = 0;
                }
                int i13 = (int) j;
                if (this.f17753a != i13) {
                    ChronoField.HOUR_OF_DAY.Q(i13);
                    return R(i13, this.f17754b, this.f17755c, this.f17756d);
                }
                return this;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return X((j - ((long) (this.f17753a / 12))) * 12);
            default:
                throw new j$.time.temporal.o(c.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime f0(int i10) {
        if (this.f17756d == i10) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.Q(i10);
        return R(this.f17753a, this.f17754b, this.f17755c, i10);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (i.f17935b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return Z(j);
                case 2:
                    return Z((j % 86400000000L) * 1000);
                case 3:
                    return Z((j % 86400000) * 1000000);
                case 4:
                    return a0(j);
                case 5:
                    return Y(j);
                case 6:
                    return X(j);
                case 7:
                    return X((j % 2) * 12);
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.k(this, j);
    }

    public final LocalTime X(long j) {
        return j == 0 ? this : R(((((int) (j % 24)) + this.f17753a) + 24) % 24, this.f17754b, this.f17755c, this.f17756d);
    }

    public final LocalTime Y(long j) {
        if (j != 0) {
            int i10 = (this.f17753a * 60) + this.f17754b;
            int i11 = ((((int) (j % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return R(i11 / 60, i11 % 60, this.f17755c, this.f17756d);
            }
        }
        return this;
    }

    public final LocalTime a0(long j) {
        if (j != 0) {
            int i10 = (this.f17754b * 60) + (this.f17753a * 3600) + this.f17755c;
            int i11 = ((((int) (j % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return R(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f17756d);
            }
        }
        return this;
    }

    public final LocalTime Z(long j) {
        if (j != 0) {
            long jC0 = c0();
            long j10 = (((j % 86400000000000L) + jC0) + 86400000000000L) % 86400000000000L;
            if (jC0 != j10) {
                return R((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: A */
    public final Temporal t(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(f fVar) {
        if (fVar == j$.time.temporal.n.f17980b || fVar == j$.time.temporal.n.f17979a || fVar == j$.time.temporal.n.f17983e || fVar == j$.time.temporal.n.f17982d) {
            return null;
        }
        if (fVar == j$.time.temporal.n.g) {
            return this;
        }
        if (fVar == j$.time.temporal.n.f17984f) {
            return null;
        }
        if (fVar == j$.time.temporal.n.f17981c) {
            return ChronoUnit.NANOS;
        }
        return fVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(c0(), ChronoField.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeS = S(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jC0 = localTimeS.c0() - c0();
            switch (i.f17935b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jC0;
                case 2:
                    return jC0 / 1000;
                case 3:
                    return jC0 / 1000000;
                case 4:
                    return jC0 / 1000000000;
                case 5:
                    return jC0 / 60000000000L;
                case 6:
                    return jC0 / 3600000000000L;
                case 7:
                    return jC0 / 43200000000000L;
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, localTimeS);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public final int d0() {
        return (this.f17754b * 60) + (this.f17753a * 3600) + this.f17755c;
    }

    public final long c0() {
        return (((long) this.f17755c) * 1000000000) + (((long) this.f17754b) * 60000000000L) + (((long) this.f17753a) * 3600000000000L) + ((long) this.f17756d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f17753a, localTime.f17753a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f17754b, localTime.f17754b)) == 0 && (iCompare = Integer.compare(this.f17755c, localTime.f17755c)) == 0) ? Integer.compare(this.f17756d, localTime.f17756d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f17753a == localTime.f17753a && this.f17754b == localTime.f17754b && this.f17755c == localTime.f17755c && this.f17756d == localTime.f17756d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jC0 = c0();
        return (int) (jC0 ^ (jC0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b5 = this.f17753a;
        byte b10 = this.f17754b;
        byte b11 = this.f17755c;
        int i10 = this.f17756d;
        sb.append(b5 < 10 ? "0" : "");
        sb.append((int) b5);
        sb.append(b10 < 10 ? ":0" : ":");
        sb.append((int) b10);
        if (b11 > 0 || i10 > 0) {
            sb.append(b11 < 10 ? ":0" : ":");
            sb.append((int) b11);
            if (i10 > 0) {
                sb.append('.');
                if (i10 % 1000000 == 0) {
                    sb.append(Integer.toString((i10 / 1000000) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb.append(Integer.toString((i10 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void g0(DataOutput dataOutput) throws IOException {
        if (this.f17756d == 0) {
            if (this.f17755c == 0) {
                if (this.f17754b == 0) {
                    dataOutput.writeByte(~this.f17753a);
                    return;
                } else {
                    dataOutput.writeByte(this.f17753a);
                    dataOutput.writeByte(~this.f17754b);
                    return;
                }
            }
            dataOutput.writeByte(this.f17753a);
            dataOutput.writeByte(this.f17754b);
            dataOutput.writeByte(~this.f17755c);
            return;
        }
        dataOutput.writeByte(this.f17753a);
        dataOutput.writeByte(this.f17754b);
        dataOutput.writeByte(this.f17755c);
        dataOutput.writeInt(this.f17756d);
    }

    public static LocalTime b0(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        int i13 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
            i10 = 0;
        } else {
            byte b5 = dataInput.readByte();
            if (b5 < 0) {
                int i14 = ~b5;
                i10 = 0;
                i13 = i14;
                i11 = 0;
            } else {
                byte b10 = dataInput.readByte();
                if (b10 < 0) {
                    i11 = ~b10;
                    i10 = 0;
                    i13 = b5;
                } else {
                    i10 = dataInput.readInt();
                    i13 = b5;
                    i11 = b10;
                }
            }
        }
        return U(i12, i13, i11, i10);
    }
}
