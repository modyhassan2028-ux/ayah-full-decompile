package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l[] f18099e;

    public g(l[] lVarArr) {
        super(-1, null, null);
        this.f18099e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i10, Object obj) {
        l lVarK;
        Object obj2;
        l[] lVarArr = this.f18099e;
        while (true) {
            int length = lVarArr.length;
            if (length == 0 || (lVarK = ConcurrentHashMap.k(lVarArr, (length - 1) & i10)) == null) {
                return null;
            }
            do {
                int i11 = lVarK.f18105a;
                if (i11 == i10 && ((obj2 = lVarK.f18106b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVarK;
                }
                if (i11 < 0) {
                    if (lVarK instanceof g) {
                        lVarArr = ((g) lVarK).f18099e;
                    } else {
                        return lVarK.a(i10, obj);
                    }
                } else {
                    lVarK = lVarK.f18108d;
                }
            } while (lVarK != null);
            return null;
        }
    }
}
