package p173r2;

import N9.k0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p110k9.y;
import p120l9.w;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21452r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f21453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f21454t;

    public /* synthetic */ m(n nVar, j jVar) {
        this.f21453s = nVar;
        this.f21454t = jVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f21452r) {
            case 0:
                n nVar = this.f21453s;
                j jVar = this.f21454t;
                j.e(jVar, "entry");
                k0 k0Var = nVar.f21457c;
                Set set = (Set) k0Var.getValue();
                j.e(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(w.g0(set.size()));
                boolean z10 = false;
                for (Object obj : set) {
                    boolean z11 = true;
                    if (!z10 && j.a(obj, jVar)) {
                        z10 = true;
                        z11 = false;
                    }
                    if (z11) {
                        linkedHashSet.add(obj);
                    }
                }
                k0Var.n(null, linkedHashSet);
                break;
            default:
                n nVar2 = this.f21453s;
                j jVar2 = this.f21454t;
                synchronized (nVar2.f21455a) {
                    try {
                        k0 k0Var2 = nVar2.f21456b;
                        Iterable iterable = (Iterable) k0Var2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (j.a((j) obj2, jVar2)) {
                                k0Var2.getClass();
                                k0Var2.n(null, arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                            break;
                        }
                        k0Var2.getClass();
                        k0Var2.n(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ m(n nVar, j jVar, boolean z10) {
        this.f21453s = nVar;
        this.f21454t = jVar;
    }
}
