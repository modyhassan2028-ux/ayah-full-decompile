package G5;

import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f2889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ p095j3.a f2890s;

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        h hVar = new h(3, (p150o9.c) obj3);
        hVar.f2889r = zBooleanValue;
        hVar.f2890s = (p095j3.a) obj2;
        return hVar.invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        boolean z10 = this.f2889r;
        p095j3.a aVar = this.f2890s;
        p110k9.a.e(obj);
        return new p110k9.j(Boolean.valueOf(z10), aVar);
    }
}
