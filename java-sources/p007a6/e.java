package p007a6;

import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.e f11214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11215c;

    public e(p134n3.e eVar) {
        super(eVar);
        this.f11214b = eVar;
        this.f11215c = c.r(eVar.f19991a, "heading_");
    }

    @Override // p007a6.i
    public final String a() {
        return this.f11215c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f11214b, ((e) obj).f11214b);
    }

    public final int hashCode() {
        return this.f11214b.hashCode();
    }

    public final String toString() {
        return "HeadingRow(row=" + this.f11214b + ")";
    }
}
