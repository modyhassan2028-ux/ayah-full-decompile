package T4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7794c;

    public e(int i10, String str, List list) {
        this.f7792a = i10;
        this.f7793b = str;
        this.f7794c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7792a == eVar.f7792a && this.f7793b.equals(eVar.f7793b) && this.f7794c.equals(eVar.f7794c);
    }

    public final int hashCode() {
        return this.f7794c.hashCode() + p245z2.a.x(this.f7793b, this.f7792a * 31, 31);
    }

    public final String toString() {
        return "KhatmahCategory(titleResource=" + this.f7792a + ", destination=" + this.f7793b + ", destinationData=" + this.f7794c + ")";
    }
}
