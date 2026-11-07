package p173r2;

import android.content.Context;
import java.util.Iterator;
import p020c.E;
import p110k9.y;
import p120l9.k;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f21451s;

    public /* synthetic */ l(A a9, int i10) {
        this.f21450r = i10;
        this.f21451s = a9;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10;
        switch (this.f21450r) {
            case 0:
                A a9 = this.f21451s;
                E e10 = a9.f21416f;
                boolean z10 = false;
                if (a9.g) {
                    k kVar = a9.f21412b.f22854f;
                    if (kVar == null || !kVar.isEmpty()) {
                        Iterator it = kVar.iterator();
                        i10 = 0;
                        while (it.hasNext()) {
                            if (!(((j) it.next()).f21442s instanceof x) && (i10 = i10 + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 1) {
                        z10 = true;
                    }
                }
                e10.e(z10);
                return y.f19095a;
            default:
                A a10 = this.f21451s;
                Context context = a10.f21411a;
                H h7 = a10.f21412b.f22865s;
                j.e(context, "context");
                j.e(h7, "navigatorProvider");
                return new B();
        }
    }
}
