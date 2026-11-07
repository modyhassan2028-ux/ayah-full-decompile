package p150o9;

import java.io.Serializable;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f20380r = new i();

    @Override // p150o9.h
    public final h A(g gVar) {
        j.e(gVar, "key");
        return this;
    }

    @Override // p150o9.h
    public final h L(h hVar) {
        j.e(hVar, "context");
        return hVar;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p150o9.h
    public final f i(g gVar) {
        j.e(gVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p150o9.h
    public final Object F(Object obj, e eVar) {
        return obj;
    }
}
