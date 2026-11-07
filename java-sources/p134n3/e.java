package p134n3;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19992b;

    public e(int i10, String str) {
        j.e(str, "text");
        this.f19991a = i10;
        this.f19992b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19991a == eVar.f19991a && j.a(this.f19992b, eVar.f19992b);
    }

    public final int hashCode() {
        return this.f19992b.hashCode() + (this.f19991a * 31);
    }

    public final String toString() {
        return "Heading(pageNumber=" + this.f19991a + ", text=" + this.f19992b + ")";
    }
}
