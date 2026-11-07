package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends AbstractC1045a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f17778c = new E();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.l
    public final m w(int i10) {
        if (i10 == 0) {
            return H.BEFORE_BE;
        }
        if (i10 == 1) {
            return H.BE;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.l
    public final String j() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b J(int i10, int i11, int i12) {
        return new G(LocalDate.c0(i10 - 543, i11, i12));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b o(int i10, int i11) {
        return new G(LocalDate.e0(i10 - 543, i11));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b i(long j) {
        return new G(LocalDate.d0(j));
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final InterfaceC1046b l() {
        return new G(LocalDate.S(LocalDate.b0(j$.com.android.tools.r8.a.L())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof G) {
            return (G) temporalAccessor;
        }
        return new G(LocalDate.S(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final boolean P(long j) {
        return q.f17812c.P(j - 543);
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i10) {
        if (mVar instanceof H) {
            return mVar == H.BE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private E() {
    }

    @Override // j$.time.chrono.l
    public final List u() {
        return j$.com.android.tools.r8.a.C(H.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.p s(ChronoField chronoField) {
        int i10 = D.f17777a[chronoField.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.p pVar = ChronoField.PROLEPTIC_MONTH.f17960b;
            return j$.time.temporal.p.f(pVar.f17985a + 6516, pVar.f17988d + 6516);
        }
        if (i10 == 2) {
            j$.time.temporal.p pVar2 = ChronoField.YEAR.f17960b;
            return j$.time.temporal.p.g(1L, (-(pVar2.f17985a + 543)) + 1, pVar2.f17988d + 543);
        }
        if (i10 != 3) {
            return chronoField.f17960b;
        }
        j$.time.temporal.p pVar3 = ChronoField.YEAR.f17960b;
        return j$.time.temporal.p.f(pVar3.f17985a + 543, pVar3.f17988d + 543);
    }

    @Override // j$.time.chrono.AbstractC1045a, j$.time.chrono.l
    public final InterfaceC1046b L(Map map, j$.time.format.E e10) {
        return (G) super.L(map, e10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        return k.R(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new C((byte) 1, this);
    }
}
