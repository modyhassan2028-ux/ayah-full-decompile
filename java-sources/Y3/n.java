package Y3;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends u0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M3.a f10422i;

    public n(M3.a aVar) {
        this.f10422i = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f10422i == ((n) obj).f10422i;
    }

    public final int hashCode() {
        return this.f10422i.hashCode();
    }

    public final String toString() {
        return "Bookmarked(bookmarkColor=" + this.f10422i + ")";
    }
}
