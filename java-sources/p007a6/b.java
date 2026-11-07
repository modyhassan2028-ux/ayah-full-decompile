package p007a6;

import p123m2.c;
import p124m3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p134n3.b f11204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f11205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y2.a f11206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p134n3.b bVar, a aVar, Y2.a aVar2) {
        super(bVar);
        j.e(aVar, "chapter");
        this.f11204b = bVar;
        this.f11205c = aVar;
        this.f11206d = aVar2;
        this.f11207e = c.r(bVar.f19986b, "chapter_");
    }

    @Override // p007a6.i
    public final String a() {
        return this.f11207e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f11204b, bVar.f11204b) && j.a(this.f11205c, bVar.f11205c) && j.a(this.f11206d, bVar.f11206d);
    }

    public final int hashCode() {
        return this.f11206d.hashCode() + ((this.f11205c.hashCode() + (this.f11204b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChapterHeaderRow(chapterHeader=" + this.f11204b + ", chapter=" + this.f11205c + ", style=" + this.f11206d + ")";
    }
}
