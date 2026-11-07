package p232y;

import E9.a;
import R0.f;
import R0.j;
import R0.s;
import R0.u;
import R0.v;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f24500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f24501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f24502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(float f3, a aVar, int i10) {
        super(1);
        this.f24500r = f3;
        this.f24501s = aVar;
        this.f24502t = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        Float fValueOf = Float.valueOf(this.f24500r);
        a aVar = this.f24501s;
        f fVar = new f(((Number) B0.c.n(fValueOf, aVar)).floatValue(), aVar, this.f24502t);
        F9.f[] fVarArr = u.f7181a;
        v vVar = s.f7158c;
        F9.f fVar2 = u.f7181a[1];
        vVar.a((j) obj, fVar);
        return y.f19095a;
    }
}
