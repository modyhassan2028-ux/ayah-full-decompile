package p007a6;

import p050e8.b;
import p123m2.c;
import p124m3.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.h f11221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f11222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f11223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f11224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p134n3.h hVar, j jVar, g gVar, b bVar) {
        super(hVar);
        p251z9.j.e(jVar, "verse");
        this.f11221b = hVar;
        this.f11222c = jVar;
        this.f11223d = gVar;
        this.f11224e = bVar;
        this.f11225f = c.r(hVar.f20003b, "verse_");
    }

    @Override // p007a6.i
    public final String a() {
        return this.f11225f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p251z9.j.a(this.f11221b, hVar.f11221b) && p251z9.j.a(this.f11222c, hVar.f11222c) && p251z9.j.a(this.f11223d, hVar.f11223d) && p251z9.j.a(this.f11224e, hVar.f11224e);
    }

    public final int hashCode() {
        return this.f11224e.hashCode() + ((this.f11223d.hashCode() + ((this.f11222c.hashCode() + (this.f11221b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VerseRow(ayah=" + this.f11221b + ", verse=" + this.f11222c + ", style=" + this.f11223d + ", highlightStyle=" + this.f11224e + ")";
    }
}
