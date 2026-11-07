package p180s0;

import p171r0.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class C extends F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f21771e;

    public C(e eVar) {
        this.f21771e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            return j.a(this.f21771e, ((C) obj).f21771e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21771e.hashCode();
    }
}
