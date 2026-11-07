package p105k2;

import java.util.LinkedHashMap;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f18958a = new LinkedHashMap();

    public abstract Object a(b bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return j.a(this.f18958a, ((c) obj).f18958a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18958a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f18958a + ')';
    }
}
