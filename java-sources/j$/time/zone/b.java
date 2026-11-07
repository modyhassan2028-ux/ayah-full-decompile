package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18013e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f18015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f18016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f18017d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f18014a, ((b) obj).f18014a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f18014a = j$.com.android.tools.r8.a.v(localDateTime, zoneOffset);
        this.f18015b = localDateTime;
        this.f18016c = zoneOffset;
        this.f18017d = zoneOffset2;
    }

    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f18014a = j;
        this.f18015b = LocalDateTime.U(j, 0, zoneOffset);
        this.f18016c = zoneOffset;
        this.f18017d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean k() {
        return this.f18017d.f17766b > this.f18016c.f17766b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f18014a == bVar.f18014a && this.f18016c.equals(bVar.f18016c) && this.f18017d.equals(bVar.f18017d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18015b.hashCode() ^ this.f18016c.f17766b) ^ Integer.rotateLeft(this.f18017d.f17766b, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(k() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f18015b);
        sb.append(this.f18016c);
        sb.append(" to ");
        sb.append(this.f18017d);
        sb.append(']');
        return sb.toString();
    }
}
