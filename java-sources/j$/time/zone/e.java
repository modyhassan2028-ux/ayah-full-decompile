package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f18020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f18021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DayOfWeek f18022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalTime f18023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f18025f;
    public final ZoneOffset g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZoneOffset f18026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoneOffset f18027i;

    public e(Month month, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f18020a = month;
        this.f18021b = (byte) i10;
        this.f18022c = dayOfWeek;
        this.f18023d = localTime;
        this.f18024e = z10;
        this.f18025f = dVar;
        this.g = zoneOffset;
        this.f18026h = zoneOffset2;
        this.f18027i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int hour;
        int iD0 = this.f18024e ? 86400 : this.f18023d.d0();
        int i10 = this.g.f17766b;
        int i11 = this.f18026h.f17766b - i10;
        int i12 = this.f18027i.f17766b - i10;
        if (iD0 % 3600 == 0) {
            hour = this.f18024e ? 24 : this.f18023d.getHour();
        } else {
            hour = 31;
        }
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f18022c;
        dataOutput.writeInt((this.f18020a.getValue() << 28) + ((this.f18021b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.f18025f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (hour == 31) {
            dataOutput.writeInt(iD0);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f18026h.f17766b);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f18027i.f17766b);
        }
    }

    public static e a(DataInput dataInput) {
        LocalTime localTimeOf;
        int i10;
        int i11;
        int i12 = dataInput.readInt();
        Month monthT = Month.T(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        DayOfWeek dayOfWeekQ = i14 == 0 ? null : DayOfWeek.Q(i14);
        int i15 = (507904 & i12) >>> 14;
        d dVar = d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j = dataInput.readInt();
            LocalTime localTime = LocalTime.f17750e;
            ChronoField.SECOND_OF_DAY.Q(j);
            int i19 = (int) (j / 3600);
            long j10 = j - ((long) (i19 * 3600));
            int i20 = (int) (j10 / 60);
            localTimeOf = LocalTime.R(i19, i20, (int) (j10 - ((long) (i20 * 60))), 0);
        } else {
            localTimeOf = LocalTime.of(i15 % 24, 0);
        }
        ZoneOffset zoneOffsetZ = ZoneOffset.Z(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetZ.f17766b;
        }
        ZoneOffset zoneOffsetZ2 = ZoneOffset.Z(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetZ.f17766b;
        }
        ZoneOffset zoneOffsetZ3 = ZoneOffset.Z(i11);
        boolean z10 = i15 == 24;
        Objects.requireNonNull(monthT, "month");
        Objects.requireNonNull(localTimeOf, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetZ, "standardOffset");
        Objects.requireNonNull(zoneOffsetZ2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetZ3, "offsetAfter");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !localTimeOf.equals(LocalTime.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeOf.f17756d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(monthT, i13, dayOfWeekQ, localTimeOf, z10, dVar, zoneOffsetZ, zoneOffsetZ2, zoneOffsetZ3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f18020a == eVar.f18020a && this.f18021b == eVar.f18021b && this.f18022c == eVar.f18022c && this.f18025f == eVar.f18025f && this.f18023d.equals(eVar.f18023d) && this.f18024e == eVar.f18024e && this.g.equals(eVar.g) && this.f18026h.equals(eVar.f18026h) && this.f18027i.equals(eVar.f18027i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD0 = ((this.f18023d.d0() + (this.f18024e ? 1 : 0)) << 15) + (this.f18020a.ordinal() << 11) + ((this.f18021b + 32) << 5);
        DayOfWeek dayOfWeek = this.f18022c;
        return ((this.g.f17766b ^ (this.f18025f.ordinal() + (iD0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f18026h.f17766b) ^ this.f18027i.f17766b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.f18027i.f17766b - this.f18026h.f17766b > 0 ? "Gap " : "Overlap ");
        sb.append(this.f18026h);
        sb.append(" to ");
        sb.append(this.f18027i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.f18022c;
        if (dayOfWeek != null) {
            byte b5 = this.f18021b;
            if (b5 == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.f18020a.name());
            } else if (b5 < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.f18021b) - 1);
                sb.append(" of ");
                sb.append(this.f18020a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.f18020a.name());
                sb.append(' ');
                sb.append((int) this.f18021b);
            }
        } else {
            sb.append(this.f18020a.name());
            sb.append(' ');
            sb.append((int) this.f18021b);
        }
        sb.append(" at ");
        sb.append(this.f18024e ? "24:00" : this.f18023d.toString());
        sb.append(" ");
        sb.append(this.f18025f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
