package p232y;

import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f24512s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, int i10) {
        super(0);
        this.f24511r = i10;
        this.f24512s = g0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f24511r) {
            case 0:
                return Float.valueOf(this.f24512s.f24517F.f24535a.g());
            default:
                return Float.valueOf(this.f24512s.f24517F.f24538d.g());
        }
    }
}
