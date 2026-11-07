package H0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3179s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(int i10, ArrayList arrayList) {
        super(1);
        this.f3178r = i10;
        this.f3179s = arrayList;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f3178r) {
            case 0:
                T t2 = (T) obj;
                ArrayList arrayList = this.f3179s;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    T.h(t2, (U) arrayList.get(i10), 0, 0);
                }
                break;
            case 1:
                T t10 = (T) obj;
                ArrayList arrayList2 = this.f3179s;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    T.g(t10, (U) arrayList2.get(i11), 0, 0);
                }
                break;
            case 2:
                T t11 = (T) obj;
                ArrayList arrayList3 = this.f3179s;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    t11.d((U) arrayList3.get(i12), 0, 0, 0.0f);
                }
                break;
            case 3:
                T t12 = (T) obj;
                ArrayList arrayList4 = this.f3179s;
                int size4 = arrayList4.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    T.g(t12, (U) arrayList4.get(i13), 0, 0);
                }
                break;
            case 4:
                T t13 = (T) obj;
                ArrayList arrayList5 = this.f3179s;
                int iE = AbstractC0813f2.E(arrayList5);
                if (iE >= 0) {
                    int i14 = 0;
                    while (true) {
                        T.g(t13, (U) arrayList5.get(i14), 0, 0);
                        if (i14 != iE) {
                            i14++;
                        }
                    }
                }
                break;
            default:
                T t14 = (T) obj;
                ArrayList arrayList6 = this.f3179s;
                int size5 = arrayList6.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    t14.d((U) arrayList6.get(i15), 0, 0, 0.0f);
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
