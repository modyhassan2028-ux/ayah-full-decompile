package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends AbstractC1045a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f17827c = new y();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.l
    public final String j() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m w(int i10) {
        if (i10 == 0) {
            return B.BEFORE_ROC;
        }
        if (i10 == 1) {
            return B.ROC;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b J(int i10, int i11, int i12) {
        return new A(LocalDate.c0(i10 + 1911, i11, i12));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b o(int i10, int i11) {
        return new A(LocalDate.e0(i10 + 1911, i11));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b i(long j) {
        return new A(LocalDate.d0(j));
    }

    @Override // j$.time.chrono.AbstractC1045a
    public final InterfaceC1046b l() {
        return new A(LocalDate.S(LocalDate.b0(j$.com.android.tools.r8.a.L())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1046b C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof A) {
            return (A) temporalAccessor;
        }
        return new A(LocalDate.S(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final boolean P(long j) {
        return q.f17812c.P(j + 1911);
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i10) {
        if (mVar instanceof B) {
            return mVar == B.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.l
    public final List u() {
        return j$.com.android.tools.r8.a.C(B.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.p s(ChronoField chronoField) {
        int i10 = x.f17826a[chronoField.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.p pVar = ChronoField.PROLEPTIC_MONTH.f17960b;
            return j$.time.temporal.p.f(pVar.f17985a - 22932, pVar.f17988d - 22932);
        }
        if (i10 == 2) {
            j$.time.temporal.p pVar2 = ChronoField.YEAR.f17960b;
            return j$.time.temporal.p.g(1L, pVar2.f17988d - 1911, (-pVar2.f17985a) + 1912);
        }
        if (i10 != 3) {
            return chronoField.f17960b;
        }
        j$.time.temporal.p pVar3 = ChronoField.YEAR.f17960b;
        return j$.time.temporal.p.f(pVar3.f17985a - 1911, pVar3.f17988d - 1911);
    }

    @Override // j$.time.chrono.AbstractC1045a, j$.time.chrono.l
    public final InterfaceC1046b L(Map map, j$.time.format.E e10) {
        return (A) super.L(map, e10);
    }

    private y() {
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
