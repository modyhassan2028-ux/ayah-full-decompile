package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements m, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f17821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w[] f17822e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f17823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient LocalDate f17824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f17825c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long D(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.m(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.p(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.l(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object v(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.u(this, fVar);
    }

    static {
        w wVar = new w(-1, LocalDate.c0(1868, 1, 1), "Meiji");
        f17821d = wVar;
        f17822e = new w[]{wVar, new w(0, LocalDate.c0(1912, 7, 30), "Taisho"), new w(1, LocalDate.c0(1926, 12, 25), "Showa"), new w(2, LocalDate.c0(1989, 1, 8), "Heisei"), new w(3, LocalDate.c0(2019, 5, 1), "Reiwa")};
    }

    public final w j() {
        w[] wVarArr = f17822e;
        if (this == wVarArr[wVarArr.length - 1]) {
            return null;
        }
        return m(this.f17823a + 1);
    }

    public w(int i10, LocalDate localDate, String str) {
        this.f17823a = i10;
        this.f17824b = localDate;
        this.f17825c = str;
    }

    public static w m(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            w[] wVarArr = f17822e;
            if (i11 < wVarArr.length) {
                return wVarArr[i11];
            }
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.temporal.k
    public final Temporal p(Temporal temporal) {
        return temporal.c(getValue(), ChronoField.ERA);
    }

    public static w i(LocalDate localDate) {
        if (localDate.X(v.f17817d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f17822e.length - 1; length >= 0; length--) {
            w wVar = f17822e[length];
            if (localDate.compareTo(wVar.f17824b) >= 0) {
                return wVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.f17823a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField != chronoField) {
            return j$.time.temporal.n.d(this, temporalField);
        }
        return t.f17815c.s(chronoField);
    }

    public final String toString() {
        return this.f17825c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C((byte) 5, this);
    }
}
