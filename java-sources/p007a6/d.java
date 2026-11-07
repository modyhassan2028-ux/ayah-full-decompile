package p007a6;

import android.support.v4.media.session.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.d f11212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11213c;

    public d(p134n3.d dVar) {
        super(dVar);
        this.f11212b = dVar;
        this.f11213c = p.w(dVar.f19988a, dVar.f19990c, "footnote_", "_");
    }

    @Override // p007a6.i
    public final String a() {
        return this.f11213c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f11212b, ((d) obj).f11212b);
    }

    public final int hashCode() {
        return this.f11212b.hashCode();
    }

    public final String toString() {
        return "FootnoteRow(row=" + this.f11212b + ")";
    }
}
