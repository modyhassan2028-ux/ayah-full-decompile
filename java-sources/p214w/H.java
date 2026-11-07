package p214w;

import java.util.LinkedHashMap;
import java.util.Map;
import p181s2.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f23441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f23442c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f23443a;

    static {
        LinkedHashMap linkedHashMap = null;
        I i10 = null;
        Q q10 = null;
        C1406t c1406t = null;
        t tVar = null;
        f23441b = new H(new T(i10, q10, c1406t, tVar, linkedHashMap, 63));
        f23442c = new H(new T(i10, q10, c1406t, tVar, linkedHashMap, 47));
    }

    public H(T t2) {
        this.f23443a = t2;
    }

    public final H a(H h7) {
        T t2 = h7.f23443a;
        I i10 = t2.f23465a;
        T t10 = this.f23443a;
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
        boolean z10 = t2.f23468d || t10.f23468d;
        Map map = t10.f23469e;
        Map map2 = t2.f23469e;
        j.e(map, "<this>");
        j.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new H(new T(i10, q10, c1406t, (t) null, z10, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof H) && j.a(((H) obj).f23443a, this.f23443a);
    }

    public final int hashCode() {
        return this.f23443a.hashCode();
    }

    public final String toString() {
        if (equals(f23441b)) {
            return "ExitTransition.None";
        }
        if (equals(f23442c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        T t2 = this.f23443a;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(t2.f23468d);
        return sb.toString();
    }
}
