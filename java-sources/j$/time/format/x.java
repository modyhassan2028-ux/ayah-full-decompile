package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1046b;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1046b f17924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TemporalAccessor f17925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.l f17926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoneId f17927d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.n.a(this, temporalField);
    }

    public x(InterfaceC1046b interfaceC1046b, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.f17924a = interfaceC1046b;
        this.f17925b = temporalAccessor;
        this.f17926c = lVar;
        this.f17927d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        InterfaceC1046b interfaceC1046b = this.f17924a;
        if (interfaceC1046b != null && temporalField.isDateBased()) {
            return interfaceC1046b.e(temporalField);
        }
        return this.f17925b.e(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(TemporalField temporalField) {
        InterfaceC1046b interfaceC1046b = this.f17924a;
        if (interfaceC1046b != null && temporalField.isDateBased()) {
            return interfaceC1046b.l(temporalField);
        }
        return this.f17925b.l(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(TemporalField temporalField) {
        InterfaceC1046b interfaceC1046b = this.f17924a;
        if (interfaceC1046b != null && temporalField.isDateBased()) {
            return interfaceC1046b.D(temporalField);
        }
        return this.f17925b.D(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object v(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f17980b) {
            return this.f17926c;
        }
        if (fVar == j$.time.temporal.n.f17979a) {
            return this.f17927d;
        }
        if (fVar == j$.time.temporal.n.f17981c) {
            return this.f17925b.v(fVar);
        }
        return fVar.g(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.f17926c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f17927d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f17925b + str + str2;
    }
}
