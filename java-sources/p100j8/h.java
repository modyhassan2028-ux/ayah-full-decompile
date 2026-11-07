package p100j8;

import android.support.v4.media.session.p;
import io.realm.CollectionUtils;
import p017b7.g;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f18805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18807c;

    public h(int i10, int i11, Class cls) {
        this(p.a(cls), i10, i11);
    }

    public static h a(p pVar) {
        return new h(pVar, 1, 0);
    }

    public static h b(Class cls) {
        return new h(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f18805a.equals(hVar.f18805a) && this.f18806b == hVar.f18806b && this.f18807c == hVar.f18807c;
    }

    public final int hashCode() {
        return ((((this.f18805a.hashCode() ^ 1000003) * 1000003) ^ this.f18806b) * 1000003) ^ this.f18807c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f18805a);
        sb.append(", type=");
        int i10 = this.f18806b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : CollectionUtils.SET_TYPE;
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f18807c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(c.r(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return p.B(sb, str2, "}");
    }

    public h(p pVar, int i10, int i11) {
        g.R(pVar, "Null dependency anInterface.");
        this.f18805a = pVar;
        this.f18806b = i10;
        this.f18807c = i11;
    }
}
