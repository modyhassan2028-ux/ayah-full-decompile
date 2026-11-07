package K;

import G.C0191z;

/* JADX INFO: renamed from: K.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0327v extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O.N f4806s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0327v(O.N n6, int i10) {
        super(1);
        this.f4805r = i10;
        this.f4806s = n6;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f4805r) {
            case 0:
                return new C0191z(3, this.f4806s);
            default:
                long j = ((p171r0.c) obj).f21387a;
                this.f4806s.p();
                return p110k9.y.f19095a;
        }
    }
}
