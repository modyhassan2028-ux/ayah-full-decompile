package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f17775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17776b;

    public C() {
    }

    public C(byte b5, Object obj) {
        this.f17775a = b5;
        this.f17776b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b5 = this.f17775a;
        Object obj = this.f17776b;
        objectOutput.writeByte(b5);
        switch (b5) {
            case 1:
                objectOutput.writeUTF(((AbstractC1045a) obj).j());
                return;
            case 2:
                C1051g c1051g = (C1051g) obj;
                objectOutput.writeObject(c1051g.f17797a);
                objectOutput.writeObject(c1051g.f17798b);
                return;
            case 3:
                k kVar = (k) obj;
                objectOutput.writeObject(kVar.f17806a);
                objectOutput.writeObject(kVar.f17807b);
                objectOutput.writeObject(kVar.f17808c);
                return;
            case 4:
                v vVar = (v) obj;
                vVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(vVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(vVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(vVar, ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((w) obj).f17823a);
                return;
            case 6:
                HijrahDate hijrahDate = (HijrahDate) obj;
                objectOutput.writeObject(hijrahDate.f17789a);
                objectOutput.writeInt(j$.time.temporal.n.a(hijrahDate, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(hijrahDate, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(hijrahDate, ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                A a9 = (A) obj;
                a9.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(a9, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(a9, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(a9, ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                G g = (G) obj;
                g.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(g, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(g, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(g, ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                C1052h c1052h = (C1052h) obj;
                objectOutput.writeUTF(c1052h.f17800a.j());
                objectOutput.writeInt(c1052h.f17801b);
                objectOutput.writeInt(c1052h.f17802c);
                objectOutput.writeInt(c1052h.f17803d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objK;
        byte b5 = objectInput.readByte();
        this.f17775a = b5;
        switch (b5) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC1045a.f17793a;
                objK = j$.com.android.tools.r8.a.K(objectInput.readUTF());
                break;
            case 2:
                objK = ((InterfaceC1046b) objectInput.readObject()).F((LocalTime) objectInput.readObject());
                break;
            case 3:
                objK = ((InterfaceC1049e) objectInput.readObject()).B((ZoneOffset) objectInput.readObject()).y((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = v.f17817d;
                int i10 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                t.f17815c.getClass();
                objK = new v(LocalDate.c0(i10, b10, b11));
                break;
            case 5:
                w wVar = w.f17821d;
                objK = w.m(objectInput.readByte());
                break;
            case 6:
                HijrahChronology hijrahChronology = (HijrahChronology) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                hijrahChronology.getClass();
                objK = new HijrahDate(hijrahChronology, i11, b12, b13);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                y.f17827c.getClass();
                objK = new A(LocalDate.c0(i12 + 1911, b14, b15));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                E.f17778c.getClass();
                objK = new G(LocalDate.c0(i13 - 543, b16, b17));
                break;
            case 9:
                int i14 = C1052h.f17799e;
                objK = new C1052h(j$.com.android.tools.r8.a.K(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f17776b = objK;
    }

    private Object readResolve() {
        return this.f17776b;
    }
}
