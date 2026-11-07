package p223x;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1427p f23822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1433w f23823b;

    public C0(AbstractC1427p abstractC1427p, InterfaceC1433w interfaceC1433w) {
        this.f23822a = abstractC1427p;
        this.f23823b = interfaceC1433w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c10 = (C0) obj;
        return j.a(this.f23822a, c10.f23822a) && j.a(this.f23823b, c10.f23823b);
    }

    public final int hashCode() {
        return (this.f23823b.hashCode() + (this.f23822a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f23822a + ", easing=" + this.f23823b + ", arcMode=ArcMode(value=0))";
    }
}
