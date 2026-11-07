package F;

import H0.T;
import W.C0561g1;
import W.EnumC0565h1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2089u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, Object obj, Object obj2, boolean z10) {
        super(1);
        this.f2086r = i10;
        this.f2088t = obj;
        this.f2089u = obj2;
        this.f2087s = z10;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f2086r) {
            case 0:
                T t2 = (T) obj;
                ArrayList arrayList = (ArrayList) this.f2088t;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    boolean z10 = this.f2087s;
                    if (i10 >= size) {
                        ?? r10 = this.f2089u;
                        int size2 = r10.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((s) r10.get(i11)).b(t2, z10);
                        }
                        return p110k9.y.f19095a;
                    }
                    ((s) arrayList.get(i10)).b(t2, z10);
                    i10++;
                }
                break;
            default:
                return new C0561g1((p063g1.c) this.f2088t, (EnumC0565h1) obj, (p241y9.c) this.f2089u, this.f2087s);
        }
    }
}
