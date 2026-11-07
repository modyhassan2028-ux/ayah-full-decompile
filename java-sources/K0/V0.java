package K0;

import java.util.List;
import u.AbstractC1355j;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.j f5026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.u f5027b;

    public V0(R0.p pVar, AbstractC1355j abstractC1355j) {
        this.f5026a = pVar.f7119d;
        this.f5027b = new u.u(R0.p.h(4, pVar).size());
        List listH = R0.p.h(4, pVar);
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            R0.p pVar2 = (R0.p) listH.get(i10);
            if (abstractC1355j.a(pVar2.g)) {
                this.f5027b.a(pVar2.g);
            }
        }
    }
}
