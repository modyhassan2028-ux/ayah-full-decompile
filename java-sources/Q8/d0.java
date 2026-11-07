package Q8;

import K9.AbstractC0405x;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f6969t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6967r = i10;
        this.f6969t = f0Var;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6967r) {
            case 0:
                d0 d0Var = new d0(this.f6969t, cVar, 0);
                d0Var.f6968s = obj;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.f6969t, cVar, 1);
                d0Var2.f6968s = obj;
                return d0Var2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        K k7 = (K) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6967r) {
            case 0:
                break;
        }
        return ((d0) create(k7, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        switch (this.f6967r) {
            case 0:
                p110k9.a.e(obj);
                return K.a((K) this.f6968s, null, this.f6969t.f6987d.a(), null, 5);
            default:
                p110k9.a.e(obj);
                K k7 = (K) this.f6968s;
                f0 f0Var = this.f6969t;
                boolean zD = f0Var.d(k7);
                F f3 = f0Var.f6989f;
                Map mapB = k7.f6901c;
                if (mapB != null) {
                    f3.getClass();
                    if (f3.f6892f) {
                        z10 = false;
                    } else {
                        ArrayList arrayListA = H.a(f3.f6887a);
                        ArrayList arrayList = new ArrayList();
                        int size = arrayListA.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayListA.get(i10);
                            i10++;
                            G g = (G) obj2;
                            D d5 = (D) mapB.get(g.f6893a);
                            p110k9.j jVar = d5 != null ? new p110k9.j(g, d5) : null;
                            if (jVar != null) {
                                arrayList.add(jVar);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj3 = arrayList.get(i11);
                                    i11++;
                                    p110k9.j jVar2 = (p110k9.j) obj3;
                                    G g10 = (G) jVar2.f19077r;
                                    D d9 = (D) jVar2.f19078s;
                                    String strA = f3.a();
                                    String str = g10.f6893a;
                                    int i12 = g10.f6894b;
                                    if (p251z9.j.a(strA, str)) {
                                        if (i12 == d9.f6883a && p251z9.j.a((String) f3.f6890d.getValue(), d9.f6884b)) {
                                            z10 = false;
                                        }
                                    } else if (i12 == d9.f6883a) {
                                        z10 = false;
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                    if (z10) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z10 = true;
                }
                boolean zC = f0Var.c(k7);
                if (z10) {
                    mapB = f3.b(p120l9.s.f19441r);
                } else if (zC) {
                    mapB = f3.b(mapB);
                }
                P p10 = z10 ? null : k7.f6899a;
                if (!zD && !z10) {
                    return zC ? K.a(k7, null, null, f3.b(mapB), 3) : k7;
                }
                P pA = f0Var.f6985b.a(p10);
                V v10 = (V) f0Var.f6986c;
                AbstractC0405x.x(AbstractC0405x.b(v10.f6923e), null, new A.J(v10, pA, null), 3);
                f3.f6892f = true;
                return new K(pA, null, mapB);
        }
    }
}
