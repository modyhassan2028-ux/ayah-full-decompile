package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface l extends Comparable {
    InterfaceC1046b C(TemporalAccessor temporalAccessor);

    InterfaceC1049e G(TemporalAccessor temporalAccessor);

    InterfaceC1046b J(int i10, int i11, int i12);

    InterfaceC1046b L(Map map, j$.time.format.E e10);

    ChronoZonedDateTime M(Instant instant, ZoneId zoneId);

    boolean P(long j);

    boolean equals(Object obj);

    int hashCode();

    InterfaceC1046b i(long j);

    String j();

    String m();

    ChronoZonedDateTime n(TemporalAccessor temporalAccessor);

    InterfaceC1046b o(int i10, int i11);

    j$.time.temporal.p s(ChronoField chronoField);

    String toString();

    List u();

    m w(int i10);

    int x(m mVar, int i10);
}
