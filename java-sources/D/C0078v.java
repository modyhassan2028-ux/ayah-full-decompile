package D;

/* JADX INFO: renamed from: D.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0078v extends AbstractC0060c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0.d f1029h;

    public C0078v(l0.h hVar) {
        this.f1029h = hVar;
    }

    @Override // D.AbstractC0060c
    public final int b(int i10, p063g1.m mVar) {
        return this.f1029h.a(0, i10, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0078v) && p251z9.j.a(this.f1029h, ((C0078v) obj).f1029h);
    }

    public final int hashCode() {
        return this.f1029h.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f1029h + ')';
    }
}
