package P0;

import android.support.v4.media.session.p;
import p224x0.C1442f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1442f f6574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6575b;

    public a(C1442f c1442f, int i10) {
        this.f6574a = c1442f;
        this.f6575b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f6574a, aVar.f6574a) && this.f6575b == aVar.f6575b;
    }

    public final int hashCode() {
        return (this.f6574a.hashCode() * 31) + this.f6575b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f6574a);
        sb.append(", configFlags=");
        return p.A(sb, this.f6575b, ')');
    }
}
