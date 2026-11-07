package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1052h implements j$.time.temporal.m, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17799e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17803d;

    static {
        j$.com.android.tools.r8.a.C(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C1052h(l lVar, int i10, int i11, int i12) {
        Objects.requireNonNull(lVar, "chrono");
        this.f17800a = lVar;
        this.f17801b = i10;
        this.f17802c = i11;
        this.f17803d = i12;
    }

    public final String toString() {
        if (this.f17801b == 0 && this.f17802c == 0 && this.f17803d == 0) {
            return this.f17800a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17800a.toString());
        sb.append(" P");
        int i10 = this.f17801b;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        int i11 = this.f17802c;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('M');
        }
        int i12 = this.f17803d;
        if (i12 != 0) {
            sb.append(i12);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public final Temporal k(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        l lVar = (l) temporal.v(j$.time.temporal.n.f17980b);
        if (lVar == null || this.f17800a.equals(lVar)) {
            if (this.f17802c != 0) {
                j$.time.temporal.p pVarS = this.f17800a.s(ChronoField.MONTH_OF_YEAR);
                long j = (pVarS.f17985a == pVarS.f17986b && pVarS.f17987c == pVarS.f17988d && pVarS.d()) ? (pVarS.f17988d - pVarS.f17985a) + 1 : -1L;
                if (j > 0) {
                    temporal = temporal.d((((long) this.f17801b) * j) + ((long) this.f17802c), ChronoUnit.MONTHS);
                } else {
                    int i10 = this.f17801b;
                    if (i10 != 0) {
                        temporal = temporal.d(i10, ChronoUnit.YEARS);
                    }
                    temporal = temporal.d(this.f17802c, ChronoUnit.MONTHS);
                }
            } else {
                int i11 = this.f17801b;
                if (i11 != 0) {
                    temporal = temporal.d(i11, ChronoUnit.YEARS);
                }
            }
            int i12 = this.f17803d;
            return i12 != 0 ? temporal.d(i12, ChronoUnit.DAYS) : temporal;
        }
        throw new j$.time.b("Chronology mismatch, expected: " + this.f17800a.j() + ", actual: " + lVar.j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1052h) {
            C1052h c1052h = (C1052h) obj;
            if (this.f17801b == c1052h.f17801b && this.f17802c == c1052h.f17802c && this.f17803d == c1052h.f17803d && this.f17800a.equals(c1052h.f17800a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f17803d, 16) + (Integer.rotateLeft(this.f17802c, 8) + this.f17801b)) ^ this.f17800a.hashCode();
    }

    public Object writeReplace() {
        return new C((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
