package N;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5946c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f5947d = null;

    public i(String str, String str2) {
        this.f5944a = str;
        this.f5945b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p251z9.j.a(this.f5944a, iVar.f5944a) && p251z9.j.a(this.f5945b, iVar.f5945b) && this.f5946c == iVar.f5946c && p251z9.j.a(this.f5947d, iVar.f5947d);
    }

    public final int hashCode() {
        int iX = (p245z2.a.x(this.f5945b, this.f5944a.hashCode() * 31, 31) + (this.f5946c ? 1231 : 1237)) * 31;
        e eVar = this.f5947d;
        return iX + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f5947d + ", isShowingSubstitution=" + this.f5946c + ')';
    }
}
