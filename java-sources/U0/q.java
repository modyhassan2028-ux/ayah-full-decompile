package U0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E6.u f8114s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(E6.u uVar, int i10) {
        super(0);
        this.f8113r = i10;
        this.f8114s = uVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f8113r) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f8114s.f1964f;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fC = ((s) obj3).f8121a.f13425i.c();
                    int iE = AbstractC0813f2.E(arrayList);
                    int i10 = 1;
                    if (1 <= iE) {
                        while (true) {
                            Object obj4 = arrayList.get(i10);
                            float fC2 = ((s) obj4).f8121a.f13425i.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj3 = obj4;
                                fC = fC2;
                            }
                            if (i10 != iE) {
                                i10++;
                            }
                        }
                    }
                    obj = obj3;
                }
                s sVar = (s) obj;
                return Float.valueOf(sVar != null ? sVar.f8121a.f13425i.c() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f8114s.f1964f;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float fA = ((s) obj5).f8121a.a();
                    int iE2 = AbstractC0813f2.E(arrayList2);
                    int i11 = 1;
                    if (1 <= iE2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i11);
                            float fA2 = ((s) obj6).f8121a.a();
                            if (Float.compare(fA, fA2) < 0) {
                                obj5 = obj6;
                                fA = fA2;
                            }
                            if (i11 != iE2) {
                                i11++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                s sVar2 = (s) obj2;
                return Float.valueOf(sVar2 != null ? sVar2.f8121a.a() : 0.0f);
        }
    }
}
