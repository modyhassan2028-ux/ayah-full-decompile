package C8;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f782b;

    public c(String str, Map map) {
        this.f781a = str;
        this.f782b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f781a.equals(cVar.f781a) && this.f782b.equals(cVar.f782b);
    }

    public final int hashCode() {
        return this.f782b.hashCode() + (this.f781a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f781a + ", properties=" + this.f782b.values() + "}";
    }
}
