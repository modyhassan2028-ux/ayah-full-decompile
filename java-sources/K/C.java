package K;

import A.C0027k;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f4445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f4446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z0.z f4447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z0.y f4448u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Z0.k f4449v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Z0.s f4450w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ O.N f4451x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f4452y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ H.b f4453z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(W w9, boolean z10, Z0.z zVar, Z0.y yVar, Z0.k kVar, Z0.s sVar, O.N n6, InterfaceC0402u interfaceC0402u, H.b bVar) {
        super(1);
        this.f4445r = w9;
        this.f4446s = z10;
        this.f4447t = zVar;
        this.f4448u = yVar;
        this.f4449v = kVar;
        this.f4450w = sVar;
        this.f4451x = n6;
        this.f4452y = interfaceC0402u;
        this.f4453z = bVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        t0 t0VarD;
        p162q0.s sVar = (p162q0.s) obj;
        W w9 = this.f4445r;
        if (w9.b() != sVar.a()) {
            w9.f4558f.setValue(Boolean.valueOf(sVar.a()));
            if (w9.b() && this.f4446s) {
                T.o(this.f4447t, w9, this.f4448u, this.f4449v, this.f4450w);
            } else {
                T.k(w9);
            }
            if (sVar.a() && (t0VarD = w9.d()) != null) {
                AbstractC0405x.x(this.f4452y, null, new C0027k(this.f4453z, this.f4448u, w9, t0VarD, this.f4450w, null, 3), 3);
            }
            if (!sVar.a()) {
                this.f4451x.e(null);
            }
        }
        return p110k9.y.f19095a;
    }
}
