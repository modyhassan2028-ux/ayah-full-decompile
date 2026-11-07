package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    /* JADX INFO: renamed from: A */
    Temporal t(long j, ChronoUnit chronoUnit);

    Temporal c(long j, TemporalField temporalField);

    Temporal d(long j, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: k */
    Temporal z(LocalDate localDate);

    long until(Temporal temporal, TemporalUnit temporalUnit);
}
