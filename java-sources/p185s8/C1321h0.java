package p185s8;

import java.util.List;

/* JADX INFO: renamed from: s8.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1321h0 extends J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22365a;

    public C1321h0(List list) {
        this.f22365a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        return this.f22365a.equals(((C1321h0) ((J0) obj)).f22365a);
    }

    public final int hashCode() {
        return this.f22365a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f22365a + "}";
    }
}
