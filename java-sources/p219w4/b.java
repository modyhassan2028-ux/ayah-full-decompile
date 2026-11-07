package p219w4;

import j$.time.Instant;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f23712a;

    public b(Instant instant) {
        this.f23712a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f23712a, ((b) obj).f23712a);
    }

    public final int hashCode() {
        return this.f23712a.hashCode();
    }

    public final String toString() {
        return "AudioFileComplete(timestamp=" + this.f23712a + ")";
    }
}
