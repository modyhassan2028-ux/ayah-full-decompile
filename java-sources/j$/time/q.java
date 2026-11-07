package j$.time;

import io.realm.RealmFieldTypeConstants;
import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f17950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17951b;

    public q() {
    }

    public q(byte b5, Object obj) {
        this.f17950a = b5;
        this.f17951b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b5 = this.f17950a;
        Object obj = this.f17951b;
        objectOutput.writeByte(b5);
        switch (b5) {
            case 1:
                d dVar = (d) obj;
                objectOutput.writeLong(dVar.f17830a);
                objectOutput.writeInt(dVar.f17831b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f17739a);
                objectOutput.writeInt(instant.f17740b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f17743a);
                objectOutput.writeByte(localDate.f17744b);
                objectOutput.writeByte(localDate.f17745c);
                return;
            case 4:
                ((LocalTime) obj).g0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.f17748a;
                objectOutput.writeInt(localDate2.f17743a);
                objectOutput.writeByte(localDate2.f17744b);
                objectOutput.writeByte(localDate2.f17745c);
                localDateTime.f17749b.g0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f17768a;
                LocalDate localDate3 = localDateTime2.f17748a;
                objectOutput.writeInt(localDate3.f17743a);
                objectOutput.writeByte(localDate3.f17744b);
                objectOutput.writeByte(localDate3.f17745c);
                localDateTime2.f17749b.g0(objectOutput);
                zonedDateTime.f17769b.c0(objectOutput);
                zonedDateTime.f17770c.V(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((v) obj).f18008b);
                return;
            case 8:
                ((ZoneOffset) obj).c0(objectOutput);
                return;
            case 9:
                o oVar = (o) obj;
                oVar.f17944a.g0(objectOutput);
                oVar.f17945b.c0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f17760a;
                LocalDate localDate4 = localDateTime3.f17748a;
                objectOutput.writeInt(localDate4.f17743a);
                objectOutput.writeByte(localDate4.f17744b);
                objectOutput.writeByte(localDate4.f17745c);
                localDateTime3.f17749b.g0(objectOutput);
                offsetDateTime.f17761b.c0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((s) obj).f17955a);
                return;
            case 12:
                u uVar = (u) obj;
                objectOutput.writeInt(uVar.f18005a);
                objectOutput.writeByte(uVar.f18006b);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                l lVar = (l) obj;
                objectOutput.writeByte(lVar.f17939a);
                objectOutput.writeByte(lVar.f17940b);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p pVar = (p) obj;
                objectOutput.writeInt(pVar.f17947a);
                objectOutput.writeInt(pVar.f17948b);
                objectOutput.writeInt(pVar.f17949c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b5 = objectInput.readByte();
        this.f17950a = b5;
        this.f17951b = a(b5, objectInput);
    }

    public static Object a(byte b5, ObjectInput objectInput) throws IOException {
        switch (b5) {
            case 1:
                d dVar = d.f17829c;
                long j = objectInput.readLong();
                long j10 = objectInput.readInt();
                return d.l(j$.com.android.tools.r8.a.B(j, j$.com.android.tools.r8.a.G(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.F(j10, 1000000000L));
            case 2:
                Instant instant = Instant.f17738c;
                return Instant.S(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.f17741d;
                return LocalDate.c0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.b0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f17746c;
                LocalDate localDate2 = LocalDate.f17741d;
                return LocalDateTime.T(LocalDate.c0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.b0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f17746c;
                LocalDate localDate3 = LocalDate.f17741d;
                LocalDateTime localDateTimeT = LocalDateTime.T(LocalDate.c0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.b0(objectInput));
                ZoneOffset zoneOffsetB0 = ZoneOffset.b0(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeT, "localDateTime");
                Objects.requireNonNull(zoneOffsetB0, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetB0.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeT, zoneId, zoneOffsetB0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i10 = v.f18007d;
                return ZoneId.S(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.b0(objectInput);
            case 9:
                int i11 = o.f17943c;
                return new o(LocalTime.b0(objectInput), ZoneOffset.b0(objectInput));
            case 10:
                int i12 = OffsetDateTime.f17759c;
                LocalDate localDate4 = LocalDate.f17741d;
                return new OffsetDateTime(LocalDateTime.T(LocalDate.c0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.b0(objectInput)), ZoneOffset.b0(objectInput));
            case 11:
                int i13 = s.f17954b;
                return s.Q(objectInput.readInt());
            case 12:
                int i14 = u.f18004c;
                int i15 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                ChronoField.YEAR.Q(i15);
                ChronoField.MONTH_OF_YEAR.Q(b10);
                return new u(i15, b10);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                int i16 = l.f17938c;
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                Month monthT = Month.T(b11);
                Objects.requireNonNull(monthT, "month");
                ChronoField.DAY_OF_MONTH.Q(b12);
                if (b12 <= monthT.S()) {
                    return new l(monthT.getValue(), b12);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b12) + " is not valid for month " + monthT.name());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p pVar = p.f17946d;
                return p.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f17951b;
    }
}
