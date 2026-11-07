package j$.util;

import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1070k extends C1068i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.C1068i, java.util.List
    public final java.util.List subList(int i10, int i11) {
        C1070k c1070k;
        synchronized (this.f18170b) {
            c1070k = new C1070k(this.f18174c.subList(i10, i11), this.f18170b);
        }
        return c1070k;
    }

    private Object writeReplace() {
        return new C1068i(this.f18174c);
    }
}
