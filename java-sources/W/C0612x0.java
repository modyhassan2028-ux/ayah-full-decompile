package W;

/* JADX INFO: renamed from: W.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0612x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p074h0.d f9453a;

    public C0612x0(p074h0.d dVar) {
        this.f9453a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0612x0) && this.f9453a.equals(((C0612x0) obj).f9453a);
    }

    public final int hashCode() {
        return this.f9453a.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=null, transition=" + this.f9453a + ')';
    }
}
