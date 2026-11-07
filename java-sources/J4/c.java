package J4;

import p124m3.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4325a;

    public c(h hVar) {
        j.e(hVar, "quarterDao");
        this.f4325a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f4325a, ((c) obj).f4325a);
    }

    public final int hashCode() {
        return this.f4325a.hashCode();
    }

    public final String toString() {
        return "QuarterRow(quarterDao=" + this.f4325a + ")";
    }
}
