package N;

import U0.C0515g;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f5927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0515g f5928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5929c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f5930d = null;

    public f(C0515g c0515g, C0515g c0515g2) {
        this.f5927a = c0515g;
        this.f5928b = c0515g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p251z9.j.a(this.f5927a, fVar.f5927a) && p251z9.j.a(this.f5928b, fVar.f5928b) && this.f5929c == fVar.f5929c && p251z9.j.a(this.f5930d, fVar.f5930d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f5928b.hashCode() + (this.f5927a.hashCode() * 31)) * 31) + (this.f5929c ? 1231 : 1237)) * 31;
        d dVar = this.f5930d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f5927a) + ", substitution=" + ((Object) this.f5928b) + ", isShowingSubstitution=" + this.f5929c + ", layoutCache=" + this.f5930d + ')';
    }
}
