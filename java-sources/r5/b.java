package r5;

import java.util.List;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21572c;

    public b(int i10, int i11, List list) {
        this.f21570a = i10;
        this.f21571b = i11;
        this.f21572c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21570a == bVar.f21570a && this.f21571b == bVar.f21571b && j.a(this.f21572c, bVar.f21572c);
    }

    public final int hashCode() {
        return this.f21572c.hashCode() + (((this.f21570a * 31) + this.f21571b) * 31);
    }

    public final String toString() {
        StringBuilder sbX = c.x("ReadingPagesInfo(currentPage=", this.f21570a, ", lastPage=", this.f21571b, ", historyItems=");
        sbX.append(this.f21572c);
        sbX.append(")");
        return sbX.toString();
    }
}
