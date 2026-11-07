package p214w;

import java.util.LinkedHashMap;
import java.util.Map;
import p120l9.s;
import p181s2.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f23465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f23466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1406t f23467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f23469e;

    public T(I i10, Q q10, C1406t c1406t, t tVar, boolean z10, Map map) {
        this.f23465a = i10;
        this.f23466b = q10;
        this.f23467c = c1406t;
        this.f23468d = z10;
        this.f23469e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t2 = (T) obj;
        return j.a(this.f23465a, t2.f23465a) && j.a(this.f23466b, t2.f23466b) && j.a(this.f23467c, t2.f23467c) && j.a(null, null) && this.f23468d == t2.f23468d && j.a(this.f23469e, t2.f23469e);
    }

    public final int hashCode() {
        I i10 = this.f23465a;
        int iHashCode = (i10 == null ? 0 : i10.hashCode()) * 31;
        Q q10 = this.f23466b;
        int iHashCode2 = (iHashCode + (q10 == null ? 0 : q10.hashCode())) * 31;
        C1406t c1406t = this.f23467c;
        return this.f23469e.hashCode() + ((((((iHashCode2 + (c1406t == null ? 0 : c1406t.hashCode())) * 31) + 0) * 31) + (this.f23468d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f23465a + ", slide=" + this.f23466b + ", changeSize=" + this.f23467c + ", scale=" + ((Object) null) + ", hold=" + this.f23468d + ", effectsMap=" + this.f23469e + ')';
    }

    public /* synthetic */ T(I i10, Q q10, C1406t c1406t, t tVar, LinkedHashMap linkedHashMap, int i11) {
        this((i11 & 1) != 0 ? null : i10, (i11 & 2) != 0 ? null : q10, (i11 & 4) != 0 ? null : c1406t, (i11 & 8) != 0 ? null : tVar, (i11 & 16) == 0, (i11 & 32) != 0 ? s.f19441r : linkedHashMap);
    }
}
