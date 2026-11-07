package p077h3;

import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16447b;

    public c(a aVar, j jVar) {
        p251z9.j.e(aVar, "bookmark");
        p251z9.j.e(jVar, "verseDao");
        this.f16446a = aVar;
        this.f16447b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p251z9.j.a(this.f16446a, cVar.f16446a) && p251z9.j.a(this.f16447b, cVar.f16447b);
    }

    public final int hashCode() {
        return this.f16447b.hashCode() + (this.f16446a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedBookmark(bookmark=" + this.f16446a + ", verseDao=" + this.f16447b + ")";
    }
}
