package p210v5;

import android.support.v4.media.session.p;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23340e;

    public a(int i10, int i11, int i12, int i13, String str) {
        j.e(str, "note");
        this.f23336a = i10;
        this.f23337b = i11;
        this.f23338c = i12;
        this.f23339d = i13;
        this.f23340e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23336a == aVar.f23336a && this.f23337b == aVar.f23337b && this.f23338c == aVar.f23338c && this.f23339d == aVar.f23339d && j.a(this.f23340e, aVar.f23340e);
    }

    public final int hashCode() {
        return this.f23340e.hashCode() + (((((((this.f23336a * 31) + this.f23337b) * 31) + this.f23338c) * 31) + this.f23339d) * 31);
    }

    public final String toString() {
        StringBuilder sbX = c.x("NoteItem(ayahId=", this.f23336a, ", sura=", this.f23337b, ", ayah=");
        sbX.append(this.f23338c);
        sbX.append(", page=");
        sbX.append(this.f23339d);
        sbX.append(", note=");
        return p.B(sbX, this.f23340e, ")");
    }
}
