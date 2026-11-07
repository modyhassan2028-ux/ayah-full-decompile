package p219w4;

import j$.time.Instant;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f23711a;

    public a(Instant instant) {
        this.f23711a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f23711a, ((a) obj).f23711a);
    }

    public final int hashCode() {
        return this.f23711a.hashCode();
    }

    public final String toString() {
        return "AudioError(timestamp=" + this.f23711a + ")";
    }
}
