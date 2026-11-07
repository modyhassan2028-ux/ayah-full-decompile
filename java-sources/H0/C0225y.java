package H0;

import J0.C0297u;
import J0.C0298v;
import java.util.Map;

/* JADX INFO: renamed from: H0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0225y implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f3233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0226z f3234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f3235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f3236f;

    public C0225y(int i10, int i11, Map map, C0226z c0226z, E e10, p241y9.c cVar) {
        this.f3231a = i10;
        this.f3232b = i11;
        this.f3233c = map;
        this.f3234d = c0226z;
        this.f3235e = e10;
        this.f3236f = cVar;
    }

    @Override // H0.J
    public final int a() {
        return this.f3232b;
    }

    @Override // H0.J
    public final int b() {
        return this.f3231a;
    }

    @Override // H0.J
    public final Map c() {
        return this.f3233c;
    }

    @Override // H0.J
    public final void d() {
        C0297u c0297u;
        J0.I i10 = this.f3235e.f3144r;
        boolean zT = this.f3234d.t();
        p241y9.c cVar = this.f3236f;
        if (!zT || (c0297u = ((C0298v) i10.f3914W.f4064c).f4179e0) == null) {
            cVar.e(((C0298v) i10.f3914W.f4064c).f3971z);
        } else {
            cVar.e(c0297u.f3971z);
        }
    }

    @Override // H0.J
    public final p241y9.c e() {
        return null;
    }
}
