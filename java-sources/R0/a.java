package R0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p110k9.e f7069b;

    public a(String str, p110k9.e eVar) {
        this.f7068a = str;
        this.f7069b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p251z9.j.a(this.f7068a, aVar.f7068a) && p251z9.j.a(this.f7069b, aVar.f7069b);
    }

    public final int hashCode() {
        String str = this.f7068a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        p110k9.e eVar = this.f7069b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f7068a + ", action=" + this.f7069b + ')';
    }
}
