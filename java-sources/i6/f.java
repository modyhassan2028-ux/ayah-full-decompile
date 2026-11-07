package i6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16776b;

    public f(Object obj, String str) {
        j.e(str, "url");
        this.f16775a = obj;
        this.f16776b = str;
    }

    @Override // i6.g
    public final Object b() {
        return this.f16775a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f16775a, fVar.f16775a) && j.a(this.f16776b, fVar.f16776b);
    }

    public final int hashCode() {
        Object obj = this.f16775a;
        return this.f16776b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Started(request=" + this.f16775a + ", url=" + this.f16776b + ")";
    }
}
