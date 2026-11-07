package j$.time.temporal;

import j$.time.format.D;
import j$.time.format.E;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalField {
    long A(TemporalAccessor temporalAccessor);

    Temporal D(Temporal temporal, long j);

    boolean isDateBased();

    boolean k(TemporalAccessor temporalAccessor);

    p l(TemporalAccessor temporalAccessor);

    TemporalAccessor p(Map map, D d5, E e10);

    p v();
}
