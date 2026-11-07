package J0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f4157b = new p0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4158a;

    public /* synthetic */ p0(int i10) {
        this.f4158a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4158a) {
            case 0:
                I i10 = (I) obj;
                I i11 = (I) obj2;
                int iF = p251z9.j.f(i11.f3903G, i10.f3903G);
                return iF != 0 ? iF : p251z9.j.f(i10.hashCode(), i11.hashCode());
            default:
                I i12 = (I) obj;
                I i13 = (I) obj2;
                int iF2 = p251z9.j.f(i12.f3903G, i13.f3903G);
                return iF2 != 0 ? iF2 : p251z9.j.f(i12.hashCode(), i13.hashCode());
        }
    }
}
