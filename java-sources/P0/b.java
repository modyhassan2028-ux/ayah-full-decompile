package P0;

import android.content.res.Resources;
import android.support.v4.media.session.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f6576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6577b;

    public b(Resources.Theme theme, int i10) {
        this.f6576a = theme;
        this.f6577b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f6576a, bVar.f6576a) && this.f6577b == bVar.f6577b;
    }

    public final int hashCode() {
        return (this.f6576a.hashCode() * 31) + this.f6577b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f6576a);
        sb.append(", id=");
        return p.A(sb, this.f6577b, ')');
    }
}
