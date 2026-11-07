package k3;

import j$.time.LocalTime;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f18967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f18969d;

    public b(h hVar, LocalTime localTime, boolean z10, j jVar) {
        p251z9.j.e(jVar, "days");
        this.f18966a = hVar;
        this.f18967b = localTime;
        this.f18968c = z10;
        this.f18969d = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p251z9.j.a(this.f18966a, bVar.f18966a) && p251z9.j.a(this.f18967b, bVar.f18967b) && this.f18968c == bVar.f18968c && p251z9.j.a(this.f18969d, bVar.f18969d);
    }

    public final int hashCode() {
        return this.f18969d.hashCode() + ((((this.f18967b.hashCode() + (this.f18966a.hashCode() * 31)) * 31) + (this.f18968c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Reminder(identifier=" + this.f18966a + ", time=" + this.f18967b + ", isEnabled=" + this.f18968c + ", days=" + this.f18969d + ")";
    }
}
