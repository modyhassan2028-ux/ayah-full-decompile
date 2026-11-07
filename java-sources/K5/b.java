package K5;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065g3.a f5243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5244b;

    public b(p065g3.a aVar, boolean z10) {
        this.f5243a = aVar;
        this.f5244b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5243a.equals(bVar.f5243a) && this.f5244b == bVar.f5244b;
    }

    public final int hashCode() {
        return (((this.f5243a.hashCode() * 31) + (this.f5244b ? 1231 : 1237)) * 31) + 1237;
    }

    public final String toString() {
        return "Reciter(reciter=" + this.f5243a + ", hasFile=" + this.f5244b + ", isSelected=false)";
    }
}
