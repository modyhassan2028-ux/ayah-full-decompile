package p163q1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f21267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f21268b;

    public static long a(f fVar, long j) {
        m mVar = fVar.f21258d;
        ArrayList arrayList = fVar.f21263k;
        if (mVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f21258d != mVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f21260f) + j));
                }
            }
        }
        f fVar3 = mVar.f21278i;
        f fVar4 = mVar.f21277h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j10 = j - mVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j10)), j10 - ((long) fVar4.f21260f));
    }

    public static long b(f fVar, long j) {
        m mVar = fVar.f21258d;
        ArrayList arrayList = fVar.f21263k;
        if (mVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f21258d != mVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f21260f) + j));
                }
            }
        }
        f fVar3 = mVar.f21277h;
        f fVar4 = mVar.f21278i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j10 = mVar.j() + j;
        return Math.max(Math.max(jMax, b(fVar4, j10)), j10 - ((long) fVar4.f21260f));
    }
}
