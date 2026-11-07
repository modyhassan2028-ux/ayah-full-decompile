package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC1046b;
import j$.time.temporal.Temporal;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC1046b> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    l a();

    LocalTime b();

    InterfaceC1046b f();

    ZoneOffset g();

    ZoneId getZone();

    ChronoZonedDateTime h(ZoneId zoneId);

    boolean isAfter(ChronoZonedDateTime<?> chronoZonedDateTime);

    InterfaceC1049e q();

    long toEpochSecond();

    ChronoZonedDateTime y(ZoneId zoneId);
}
