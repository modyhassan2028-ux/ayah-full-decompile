package i6;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16762b;

    public a(Object obj, String str) {
        j.e(str, "url");
        this.f16761a = obj;
        this.f16762b = str;
    }

    @Override // i6.g
    public final Object b() {
        return this.f16761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f16761a, aVar.f16761a) && j.a(this.f16762b, aVar.f16762b);
    }

    public final int hashCode() {
        Object obj = this.f16761a;
        return this.f16762b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Canceled(request=" + this.f16761a + ", url=" + this.f16762b + ")";
    }
}
