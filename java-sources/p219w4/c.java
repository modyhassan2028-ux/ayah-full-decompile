package p219w4;

import j$.time.Instant;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f23713a;

    public c(Instant instant) {
        this.f23713a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f23713a, ((c) obj).f23713a);
    }

    public final int hashCode() {
        return this.f23713a.hashCode();
    }

    public final String toString() {
        return "Prepared(timestamp=" + this.f23713a + ")";
    }
}
