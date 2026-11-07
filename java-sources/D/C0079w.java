package D;

/* JADX INFO: renamed from: D.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079w extends AbstractC0060c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0.i f1030h;

    public C0079w(l0.i iVar) {
        this.f1030h = iVar;
    }

    @Override // D.AbstractC0060c
    public final int b(int i10, p063g1.m mVar) {
        return this.f1030h.a(0, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0079w) && p251z9.j.a(this.f1030h, ((C0079w) obj).f1030h);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1030h.f19325a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f1030h + ')';
    }
}
