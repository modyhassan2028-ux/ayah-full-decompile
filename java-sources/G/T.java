package G;

import A.EnumC0047u0;
import Z.C0675c0;

/* JADX INFO: loaded from: classes.dex */
public final class T extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f2632s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(W w9, int i10) {
        super(0);
        this.f2631r = i10;
        this.f2632s = w9;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f2631r) {
            case 0:
                W w9 = this.f2632s;
                F.A a9 = w9.f2640G.f2044a;
                int iG = (int) (a9.g().f2107o == EnumC0047u0.f424r ? a9.g().g() & 4294967295L : a9.g().g() >> 32);
                F.A a10 = w9.f2640G.f2044a;
                return Float.valueOf(iG - ((-a10.g().f2104l) + a10.g().f2108p));
            case 1:
                F.A a11 = this.f2632s.f2640G.f2044a;
                return Float.valueOf((((C0675c0) a11.f2012d.f1158s).g() * 500) + ((C0675c0) a11.f2012d.f1159t).g());
            default:
                F.A a12 = this.f2632s.f2640G.f2044a;
                int iG2 = ((C0675c0) a12.f2012d.f1158s).g();
                int iG3 = ((C0675c0) a12.f2012d.f1159t).g();
                return Float.valueOf(a12.d() ? (iG2 * 500) + iG3 + 100 : (iG2 * 500) + iG3);
        }
    }
}
