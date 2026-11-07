package p219w4;

import j$.time.Instant;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f23714a;

    public d(Instant instant) {
        this.f23714a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f23714a, ((d) obj).f23714a);
    }

    public final int hashCode() {
        return this.f23714a.hashCode();
    }

    public final String toString() {
        return "SeekComplete(timestamp=" + this.f23714a + ")";
    }
}
