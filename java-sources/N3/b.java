package N3;

import android.support.v4.media.session.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M3.a f6006f;
    public final long g;

    public b(int i10, int i11, int i12, int i13, String str, M3.a aVar, long j) {
        j.e(str, "name");
        this.f6001a = i10;
        this.f6002b = i11;
        this.f6003c = i12;
        this.f6004d = i13;
        this.f6005e = str;
        this.f6006f = aVar;
        this.g = j;
    }

    @Override // N3.a
    public final M3.a a() {
        return this.f6006f;
    }

    @Override // N3.a
    public final String b() {
        return this.f6005e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6001a == bVar.f6001a && this.f6002b == bVar.f6002b && this.f6003c == bVar.f6003c && this.f6004d == bVar.f6004d && j.a(this.f6005e, bVar.f6005e) && this.f6006f == bVar.f6006f && this.g == bVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.f6006f.hashCode() + p245z2.a.x(this.f6005e, ((((((this.f6001a * 31) + this.f6002b) * 31) + this.f6003c) * 31) + this.f6004d) * 31, 31)) * 31;
        long j = this.g;
        return iHashCode + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sbX = p123m2.c.x("BookmarkedRow(ayahId=", this.f6001a, ", sura=", this.f6002b, ", ayah=");
        sbX.append(this.f6003c);
        sbX.append(", page=");
        sbX.append(this.f6004d);
        sbX.append(", name=");
        sbX.append(this.f6005e);
        sbX.append(", color=");
        sbX.append(this.f6006f);
        sbX.append(", timestampMillis=");
        return p.x(this.g, ")", sbX);
    }
}
