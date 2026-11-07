package z3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24795b;

    public i(int i10, boolean z10) {
        this.f24794a = i10;
        this.f24795b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f24794a == iVar.f24794a && this.f24795b == iVar.f24795b;
    }

    public final int hashCode() {
        return (this.f24794a * 31) + (this.f24795b ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectedSura(suraNumber=" + this.f24794a + ", isProgrammatic=" + this.f24795b + ")";
    }
}
