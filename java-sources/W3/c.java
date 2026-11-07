package W3;

import F9.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9596f;
    public final float g;

    public c(float f3, float f7) {
        this.f9596f = f3;
        this.g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f9596f, cVar.f9596f) == 0 && Float.compare(this.g, cVar.g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + (Float.floatToIntBits(this.f9596f) * 31);
    }

    public final String toString() {
        return "LongPress(x=" + this.f9596f + ", y=" + this.g + ")";
    }
}
