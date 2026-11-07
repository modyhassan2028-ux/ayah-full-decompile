package i6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16764b;

    public b(Object obj, String str) {
        j.e(str, "url");
        this.f16763a = obj;
        this.f16764b = str;
    }

    @Override // i6.g
    public final int a() {
        return 100;
    }

    @Override // i6.g
    public final Object b() {
        return this.f16763a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f16763a, bVar.f16763a) && j.a(this.f16764b, bVar.f16764b);
    }

    public final int hashCode() {
        Object obj = this.f16763a;
        return this.f16764b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Complete(request=" + this.f16763a + ", url=" + this.f16764b + ")";
    }
}
