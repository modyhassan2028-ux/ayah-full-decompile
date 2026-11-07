package H5;

import android.graphics.drawable.Drawable;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f3387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3389c;

    public a(Drawable drawable, float f3, float f7) {
        this.f3387a = drawable;
        this.f3388b = f3;
        this.f3389c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f3387a, aVar.f3387a) && Float.compare(this.f3388b, aVar.f3388b) == 0 && Float.compare(this.f3389c, aVar.f3389c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3389c) + p123m2.c.n(this.f3387a.hashCode() * 31, this.f3388b, 31);
    }

    public final String toString() {
        return "DrawablePosition(drawable=" + this.f3387a + ", x=" + this.f3388b + ", y=" + this.f3389c + ")";
    }
}
