package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1046b extends Temporal, j$.time.temporal.k, Comparable {
    long E();

    InterfaceC1049e F(LocalTime localTime);

    m H();

    InterfaceC1046b K(j$.time.temporal.m mVar);

    int N();

    /* JADX INFO: renamed from: O */
    int compareTo(InterfaceC1046b interfaceC1046b);

    l a();

    @Override // j$.time.temporal.Temporal
    InterfaceC1046b c(long j, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    InterfaceC1046b d(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean e(TemporalField temporalField);

    boolean equals(Object obj);

    int hashCode();

    boolean r();

    InterfaceC1046b t(long j, TemporalUnit temporalUnit);

    String toString();

    @Override // j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    InterfaceC1046b z(j$.time.temporal.k kVar);
}
