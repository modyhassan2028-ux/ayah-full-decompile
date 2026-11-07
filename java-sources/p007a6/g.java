package p007a6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.g f11219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11220c;

    public g(p134n3.g gVar) {
        super(gVar);
        this.f11219b = gVar;
        this.f11220c = "text_" + gVar.f19996a + "_" + gVar.f19999d;
    }

    @Override // p007a6.i
    public final String a() {
        return this.f11220c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && j.a(this.f11219b, ((g) obj).f11219b);
    }

    public final int hashCode() {
        return this.f11219b.hashCode();
    }

    public final String toString() {
        return "TextRow(row=" + this.f11219b + ")";
    }
}
