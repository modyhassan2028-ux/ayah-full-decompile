package C5;

import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f762d;

    public e(int i10, boolean z10) {
        super(1);
        this.f761c = i10;
        this.f762d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f761c == eVar.f761c && this.f762d == eVar.f762d;
    }

    @Override // va.g
    public final int hashCode() {
        return (this.f761c * 31) + (this.f762d ? 1231 : 1237);
    }

    @Override // va.g
    public final String toString() {
        return "Downloading(progress=" + this.f761c + ", isIndeterminate=" + this.f762d + ")";
    }
}
