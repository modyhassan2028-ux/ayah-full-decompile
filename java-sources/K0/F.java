package K0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4925b;

    public /* synthetic */ F(int i10, Object obj) {
        this.f4924a = i10;
        this.f4925b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4924a) {
            case 0:
                return ((Number) ((p241y9.e) this.f4925b).invoke(obj, obj2)).intValue();
            default:
                for (p241y9.c cVar : (p241y9.c[]) this.f4925b) {
                    int i10 = p185s8.u0.i((Comparable) cVar.e(obj), (Comparable) cVar.e(obj2));
                    if (i10 != 0) {
                        return i10;
                    }
                }
                return 0;
        }
    }
}
