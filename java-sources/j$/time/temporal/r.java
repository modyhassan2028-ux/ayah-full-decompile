package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Serializable {
    public static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f17997h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DayOfWeek f17998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient q f18000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient q f18001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient q f18002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient q f18003f;

    static {
        new r(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        f17997h = h.f17971d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r a(DayOfWeek dayOfWeek, int i10) {
        String str = dayOfWeek.toString() + i10;
        ConcurrentHashMap concurrentHashMap = g;
        r rVar = (r) concurrentHashMap.get(str);
        if (rVar != null) {
            return rVar;
        }
        concurrentHashMap.putIfAbsent(str, new r(dayOfWeek, i10));
        return (r) concurrentHashMap.get(str);
    }

    public r(DayOfWeek dayOfWeek, int i10) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f18000c = new q("DayOfWeek", this, chronoUnit, chronoUnit2, q.f17989f);
        this.f18001d = new q("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, q.g);
        g gVar = h.f17971d;
        this.f18002e = new q("WeekOfWeekBasedYear", this, chronoUnit2, gVar, q.f17991i);
        this.f18003f = new q("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, ChronoField.YEAR.f17960b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f17998a = dayOfWeek;
        this.f17999b = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f17998a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i10 = this.f17999b;
        if (i10 < 1 || i10 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f17998a, this.f17999b);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e10.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f17998a.ordinal() * 7) + this.f17999b;
    }

    public final String toString() {
        return "WeekFields[" + this.f17998a + "," + this.f17999b + "]";
    }
}
