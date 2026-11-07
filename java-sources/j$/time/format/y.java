package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1046b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalAccessor f17928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f17929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17930c;

    public y(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l lVar = dateTimeFormatter.f17853e;
        if (lVar != null) {
            j$.time.chrono.l lVar2 = (j$.time.chrono.l) temporalAccessor.v(j$.time.temporal.n.f17980b);
            ZoneId zoneId = (ZoneId) temporalAccessor.v(j$.time.temporal.n.f17979a);
            InterfaceC1046b interfaceC1046bC = null;
            lVar = Objects.equals(lVar, lVar2) ? null : lVar;
            Objects.equals(null, zoneId);
            if (lVar != null) {
                j$.time.chrono.l lVar3 = lVar != null ? lVar : lVar2;
                if (lVar != null) {
                    if (temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                        interfaceC1046bC = lVar3.C(temporalAccessor);
                    } else if (lVar != j$.time.chrono.q.f17812c || lVar2 != null) {
                        for (ChronoField chronoField : ChronoField.values()) {
                            if (chronoField.isDateBased() && temporalAccessor.e(chronoField)) {
                                throw new j$.time.b("Unable to apply override chronology '" + lVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new x(interfaceC1046bC, temporalAccessor, lVar3, zoneId);
            }
        }
        this.f17928a = temporalAccessor;
        this.f17929b = dateTimeFormatter;
    }

    public final Object b(j$.time.f fVar) {
        TemporalAccessor temporalAccessor = this.f17928a;
        Object objV = temporalAccessor.v(fVar);
        if (objV != null || this.f17930c != 0) {
            return objV;
        }
        throw new j$.time.b("Unable to extract " + fVar + " from temporal " + temporalAccessor);
    }

    public final Long a(TemporalField temporalField) {
        int i10 = this.f17930c;
        TemporalAccessor temporalAccessor = this.f17928a;
        if (i10 <= 0 || temporalAccessor.e(temporalField)) {
            return Long.valueOf(temporalAccessor.D(temporalField));
        }
        return null;
    }

    public final String toString() {
        return this.f17928a.toString();
    }
}
