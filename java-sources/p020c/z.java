package p020c;

import p110k9.y;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class z extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f13413s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(D d5, int i10) {
        super(0);
        this.f13412r = i10;
        this.f13413s = d5;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f13412r) {
            case 0:
                this.f13413s.c();
                break;
            case 1:
                this.f13413s.b();
                break;
            default:
                this.f13413s.c();
                break;
        }
        return y.f19095a;
    }
}
