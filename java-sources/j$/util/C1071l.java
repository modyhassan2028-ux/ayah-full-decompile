package j$.util;

import java.util.Set;

/* JADX INFO: renamed from: j$.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1071l extends C1067h implements Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18170b) {
            zEquals = this.f18169a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f18170b) {
            iHashCode = this.f18169a.hashCode();
        }
        return iHashCode;
    }
}
