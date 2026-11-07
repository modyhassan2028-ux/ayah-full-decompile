package p173r2;

import p251z9.j;
import p251z9.w;

/* JADX INFO: renamed from: r2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1288h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f21439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21440b = false;

    public C1288h(E e10) {
        this.f21439a = e10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1288h.class != obj.getClass()) {
            return false;
        }
        C1288h c1288h = (C1288h) obj;
        return this.f21440b == c1288h.f21440b && this.f21439a.equals(c1288h.f21439a);
    }

    public final int hashCode() {
        return ((this.f21439a.hashCode() * 961) + (this.f21440b ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w.a(C1288h.class).c());
        sb.append(" Type: " + this.f21439a);
        sb.append(" Nullable: false");
        if (this.f21440b) {
            sb.append(" DefaultValue: null");
        }
        String string = sb.toString();
        j.d(string, "toString(...)");
        return string;
    }
}
