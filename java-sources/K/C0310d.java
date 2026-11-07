package K;

import A.q1;
import p180s0.C1303l;

/* JADX INFO: renamed from: K.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0310d extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f4619s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0310d(long j, int i10) {
        super(1);
        this.f4618r = i10;
        this.f4619s = j;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f4618r) {
            case 0:
                p152p0.c cVar = (p152p0.c) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f20809r.b() >> 32)) / 2.0f;
                return cVar.a(new q1(fIntBitsToFloat, B9.a.q(cVar, fIntBitsToFloat), new C1303l(this.f4619s, 5), 2));
            default:
                ((R0.j) obj).e(O.y.f6432c, new O.x(K.f4480r, this.f4619s, O.w.f6423s, true));
                return p110k9.y.f19095a;
        }
    }
}
