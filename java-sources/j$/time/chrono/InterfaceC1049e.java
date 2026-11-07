package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;

/* JADX INFO: renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1049e extends Temporal, j$.time.temporal.k, Comparable {
    ChronoZonedDateTime B(ZoneId zoneId);

    /* JADX INFO: renamed from: I */
    int compareTo(InterfaceC1049e interfaceC1049e);

    l a();

    LocalTime b();

    InterfaceC1046b f();
}
