package p124m3;

import java.util.List;
import p123m2.c;
import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19580f;
    public final j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f19581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19582i;

    public h(int i10, int i11, int i12, String str, String str2, int i13, j jVar, j jVar2, List list) {
        j.e(str, "arabicTitle");
        j.e(str2, "englishTitle");
        j.e(jVar, "firstVerse");
        j.e(jVar2, "lastVerse");
        this.f19575a = i10;
        this.f19576b = i11;
        this.f19577c = i12;
        this.f19578d = str;
        this.f19579e = str2;
        this.f19580f = i13;
        this.g = jVar;
        this.f19581h = jVar2;
        this.f19582i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f19575a == hVar.f19575a && this.f19576b == hVar.f19576b && this.f19577c == hVar.f19577c && j.a(this.f19578d, hVar.f19578d) && j.a(this.f19579e, hVar.f19579e) && this.f19580f == hVar.f19580f && j.a(this.g, hVar.g) && j.a(this.f19581h, hVar.f19581h) && this.f19582i.equals(hVar.f19582i);
    }

    public final int hashCode() {
        return this.f19582i.hashCode() + ((this.f19581h.hashCode() + ((this.g.hashCode() + ((a.x(this.f19579e, a.x(this.f19578d, ((((this.f19575a * 31) + this.f19576b) * 31) + this.f19577c) * 31, 31), 31) + this.f19580f) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbX = c.x("QuarterDao(identifier=", this.f19575a, ", hizbNumber=", this.f19576b, ", hizbFraction=");
        sbX.append(this.f19577c);
        sbX.append(", arabicTitle=");
        sbX.append(this.f19578d);
        sbX.append(", englishTitle=");
        sbX.append(this.f19579e);
        sbX.append(", partNumber=");
        sbX.append(this.f19580f);
        sbX.append(", firstVerse=");
        sbX.append(this.g);
        sbX.append(", lastVerse=");
        sbX.append(this.f19581h);
        sbX.append(", verses=");
        sbX.append(this.f19582i);
        sbX.append(")");
        return sbX.toString();
    }
}
