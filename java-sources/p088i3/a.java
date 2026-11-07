package p088i3;

import F9.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16737f;

    public a(int i10) {
        this.f16737f = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f16737f == ((a) obj).f16737f;
    }

    public final int hashCode() {
        return this.f16737f;
    }

    public final String toString() {
        return p245z2.a.B(this.f16737f, "DownloadInProgress(progress=", ")");
    }
}
