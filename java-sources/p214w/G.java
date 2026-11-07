package p214w;

import java.util.LinkedHashMap;
import java.util.Map;
import p181s2.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f23439b = new G(new T((I) null, (Q) null, (C1406t) null, (t) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f23440a;

    public G(T t2) {
        this.f23440a = t2;
    }

    public final G a(G g) {
        T t2 = g.f23440a;
        I i10 = t2.f23465a;
        T t10 = this.f23440a;
        if (i10 == null) {
            i10 = t10.f23465a;
        }
        Q q10 = t2.f23466b;
        if (q10 == null) {
            q10 = t10.f23466b;
        }
        C1406t c1406t = t2.f23467c;
        if (c1406t == null) {
            c1406t = t10.f23467c;
        }
        Map map = t10.f23469e;
        Map map2 = t2.f23469e;
        j.e(map, "<this>");
        j.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new G(new T(i10, q10, c1406t, (t) null, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && j.a(((G) obj).f23440a, this.f23440a);
    }

    public final int hashCode() {
        return this.f23440a.hashCode();
    }

    public final String toString() {
        if (equals(f23439b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        T t2 = this.f23440a;
        I i10 = t2.f23465a;
        sb.append(i10 != null ? i10.toString() : null);
        sb.append(",\nSlide - ");
        Q q10 = t2.f23466b;
        sb.append(q10 != null ? q10.toString() : null);
        sb.append(",\nShrink - ");
        C1406t c1406t = t2.f23467c;
        sb.append(c1406t != null ? c1406t.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
