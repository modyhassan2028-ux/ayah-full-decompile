package p210v5;

import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23342b;

    public b(int i10, List list) {
        this.f23341a = i10;
        this.f23342b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23341a == bVar.f23341a && j.a(this.f23342b, bVar.f23342b);
    }

    public final int hashCode() {
        return this.f23342b.hashCode() + (this.f23341a * 31);
    }

    public final String toString() {
        return "NoteListRow(sura=" + this.f23341a + ", notes=" + this.f23342b + ")";
    }
}
