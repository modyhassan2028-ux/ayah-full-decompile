package p232y;

import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f24529s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, int i10) {
        super(0);
        this.f24528r = i10;
        this.f24529s = j0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f24528r) {
            case 0:
                return Boolean.valueOf(this.f24529s.f24535a.g() > 0);
            default:
                j0 j0Var = this.f24529s;
                return Boolean.valueOf(j0Var.f24535a.g() < j0Var.f24538d.g());
        }
    }
}
