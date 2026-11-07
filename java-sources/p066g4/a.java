package p066g4;

import android.support.v4.media.session.p;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16292c;

    public a(String str, List list, String str2) {
        j.e(str, "text");
        this.f16290a = str;
        this.f16291b = list;
        this.f16292c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f16290a, aVar.f16290a) && this.f16291b.equals(aVar.f16291b) && j.a(this.f16292c, aVar.f16292c);
    }

    public final int hashCode() {
        int iHashCode = (this.f16291b.hashCode() + (this.f16290a.hashCode() * 31)) * 31;
        String str = this.f16292c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareTextModel(text=");
        sb.append(this.f16290a);
        sb.append(", emphases=");
        sb.append(this.f16291b);
        sb.append(", footnotePattern=");
        return p.B(sb, this.f16292c, ")");
    }
}
