package p024c3;

import B0.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f13453f;

    public d(Object obj, int i10, a aVar) {
        j.e(obj, "value");
        p123m2.c.z(i10, "verificationMode");
        this.f13451d = obj;
        this.f13452e = i10;
        this.f13453f = aVar;
    }

    @Override // B0.c
    public final c Z(String str, p241y9.c cVar) {
        Object obj = this.f13451d;
        return ((Boolean) cVar.e(obj)).booleanValue() ? this : new c(obj, str, this.f13453f, this.f13452e);
    }

    @Override // B0.c
    public final Object p() {
        return this.f13451d;
    }
}
