package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f18124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f18125f;
    public r g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f18126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18127i;

    public r(int i10, Object obj, Object obj2, l lVar, r rVar) {
        super(i10, obj, obj2, lVar);
        this.f18124e = rVar;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i10, Object obj) {
        return b(i10, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[PHI: r8
      0x0047: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x0040, B:21:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x004d A[SYNTHETIC] */
    public final r b(int i10, Object obj, Class cls) {
        r rVarB;
        if (obj == null) {
            return null;
        }
        r rVar = this;
        do {
            r rVar2 = rVar.f18125f;
            r rVar3 = rVar.g;
            int i11 = rVar.f18105a;
            if (i11 <= i10) {
                if (i11 >= i10) {
                    Object obj2 = rVar.f18106b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i12 = ConcurrentHashMap.g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    rVarB = rVar3.b(i10, obj, cls);
                                    if (rVarB != null) {
                                        return rVarB;
                                    }
                                } else if (iCompareTo >= 0) {
                                    rVar2 = rVar3;
                                }
                            } else {
                                rVarB = rVar3.b(i10, obj, cls);
                                if (rVarB != null) {
                                    return rVarB;
                                }
                            }
                        }
                        rVar = rVar2;
                    }
                }
                rVar = rVar3;
            } else {
                rVar = rVar2;
            }
        } while (rVar != null);
        return null;
    }
}
