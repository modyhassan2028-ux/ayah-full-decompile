package p232y;

import J0.AbstractC0283f;
import K0.AbstractC0359n0;
import p110k9.y;
import p241y9.a;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: y.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1465t extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1466u f24585s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1465t(C1466u c1466u, int i10) {
        super(1);
        this.f24584r = i10;
        this.f24585s = c1466u;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f24584r) {
            case 0:
                long j = ((p171r0.c) obj).f21387a;
                C1466u c1466u = this.f24585s;
                a aVar = c1466u.f24586Y;
                if (aVar != null) {
                    aVar.invoke();
                }
                if (c1466u.f24587Z) {
                    ((p243z0.a) AbstractC0283f.i(c1466u, AbstractC0359n0.f5121l)).a(0);
                }
                break;
            default:
                long j10 = ((p171r0.c) obj).f21387a;
                C1466u c1466u2 = this.f24585s;
                if (c1466u2.f24488L) {
                    c1466u2.f24489M.invoke();
                }
                break;
        }
        return y.f19095a;
    }
}
