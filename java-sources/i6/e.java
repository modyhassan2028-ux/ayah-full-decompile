package i6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p155p3.b f16773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16774b;

    public e(p155p3.b bVar, String str) {
        j.e(str, "url");
        this.f16773a = bVar;
        this.f16774b = str;
    }

    @Override // i6.g
    public final Object b() {
        return this.f16773a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16773a.equals(eVar.f16773a) && j.a(this.f16774b, eVar.f16774b);
    }

    public final int hashCode() {
        return this.f16774b.hashCode() + (this.f16773a.hashCode() * 31);
    }

    public final String toString() {
        return "Pending(request=" + this.f16773a + ", url=" + this.f16774b + ")";
    }
}
