package I;

import N9.Q;
import N9.Y;
import p110k9.y;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3647r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3649t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p241y9.c cVar, boolean z10) {
        super(0);
        this.f3649t = cVar;
        this.f3648s = z10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        Q qI;
        switch (this.f3647r) {
            case 0:
                ((p241y9.c) this.f3649t).e(Boolean.valueOf(!this.f3648s));
                return y.f19095a;
            default:
                boolean z10 = this.f3648s;
                y yVar = y.f19095a;
                if (z10 && (qI = ((M.c) this.f3649t).i()) != null) {
                    ((Y) qI).g(yVar);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, M.c cVar) {
        super(0);
        this.f3648s = z10;
        this.f3649t = cVar;
    }
}
