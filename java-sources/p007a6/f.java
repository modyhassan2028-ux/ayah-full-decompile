package p007a6;

import android.support.v4.media.session.p;
import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.f f11216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f11217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p134n3.f fVar, j jVar) {
        super(fVar);
        p251z9.j.e(fVar, "row");
        p251z9.j.e(jVar, "referencedAyah");
        this.f11216b = fVar;
        this.f11217c = jVar;
        this.f11218d = p.w(fVar.f19994b, fVar.f19995c, "reference_", "_");
    }

    @Override // p007a6.i
    public final String a() {
        return this.f11218d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p251z9.j.a(this.f11216b, fVar.f11216b) && p251z9.j.a(this.f11217c, fVar.f11217c);
    }

    public final int hashCode() {
        return this.f11217c.hashCode() + (this.f11216b.hashCode() * 31);
    }

    public final String toString() {
        return "ReferenceRow(row=" + this.f11216b + ", referencedAyah=" + this.f11217c + ")";
    }
}
