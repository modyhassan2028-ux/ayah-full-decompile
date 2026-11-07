package p108k6;

import E3.c;
import p124m3.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f19031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f19032b;

    public a(j jVar, c cVar) {
        p251z9.j.e(jVar, "verse");
        this.f19031a = jVar;
        this.f19032b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p251z9.j.a(this.f19031a, aVar.f19031a) && p251z9.j.a(this.f19032b, aVar.f19032b);
    }

    public final int hashCode() {
        int iHashCode = this.f19031a.hashCode() * 31;
        c cVar = this.f19032b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "NoteInfoRow(verse=" + this.f19031a + ", note=" + this.f19032b + ")";
    }
}
