package p187t0;

import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f22559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(1);
        this.f22558r = i10;
        this.f22559s = qVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f22558r) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                q qVar = this.f22559s;
                return Double.valueOf(qVar.f22569n.b(B0.c.j(dDoubleValue, qVar.f22562e, qVar.f22563f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.f22559s;
                return Double.valueOf(B0.c.j(qVar2.f22566k.b(dDoubleValue2), qVar2.f22562e, qVar2.f22563f));
        }
    }
}
