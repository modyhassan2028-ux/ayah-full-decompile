package F1;

import java.util.ArrayList;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class i implements H1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2169b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f2168a = i10;
        this.f2169b = obj;
    }

    @Override // H1.a
    public final void accept(Object obj) {
        switch (this.f2168a) {
            case 0:
                j jVar = (j) obj;
                if (jVar == null) {
                    jVar = new j(-3);
                }
                ((M.k) this.f2169b).D(jVar);
                return;
            default:
                j jVar2 = (j) obj;
                synchronized (k.f2174c) {
                    try {
                        O o10 = k.f2175d;
                        ArrayList arrayList = (ArrayList) o10.get((String) this.f2169b);
                        if (arrayList == null) {
                            return;
                        }
                        o10.remove((String) this.f2169b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((H1.a) arrayList.get(i10)).accept(jVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
