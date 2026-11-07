package p062g0;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16244a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f16244a == ((a) obj).f16244a;
    }

    public final int hashCode() {
        return this.f16244a;
    }

    public final String toString() {
        return p.A(new StringBuilder("DeltaCounter(count="), this.f16244a, ')');
    }
}
