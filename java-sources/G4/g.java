package G4;

import p110k9.y;
import ra.EnumC1290b;
import ra.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2821t;

    public /* synthetic */ g(int i10, int i11, p241y9.c cVar) {
        this.f2819r = i11;
        this.f2820s = cVar;
        this.f2821t = i10;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f2819r) {
            case 0:
                ((p241y9.c) this.f2820s).e(new E4.i(this.f2821t));
                break;
            case 1:
                ((p241y9.c) this.f2820s).e(new E4.e(this.f2821t));
                break;
            case 2:
                ((p241y9.c) this.f2820s).e(Integer.valueOf(this.f2821t));
                break;
            default:
                p pVar = (p) this.f2820s;
                int i10 = this.f2821t;
                pVar.f21696B.getClass();
                synchronized (pVar) {
                    pVar.f21710P.remove(Integer.valueOf(i10));
                    break;
                }
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ g(p pVar, int i10, EnumC1290b enumC1290b) {
        this.f2819r = 3;
        this.f2820s = pVar;
        this.f2821t = i10;
    }
}
