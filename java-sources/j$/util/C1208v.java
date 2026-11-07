package j$.util;

import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1208v extends C1075p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.C1075p, java.util.List
    public final java.util.List subList(int i10, int i11) {
        return new C1208v(this.f18201b.subList(i10, i11));
    }

    private Object writeReplace() {
        return new C1075p(this.f18201b);
    }
}
