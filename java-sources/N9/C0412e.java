package N9;

import A.C0030l0;
import K9.AbstractC0405x;
import K9.EnumC0403v;
import K9.InterfaceC0402u;
import p185s8.u0;

/* JADX INFO: renamed from: N9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0412e extends O9.e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6174u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f6175v;

    public C0412e(C4.g gVar, p150o9.h hVar, int i10, M9.a aVar) {
        super(hVar, i10, aVar);
        this.f6175v = gVar;
    }

    @Override // O9.e
    public String b() {
        switch (this.f6174u) {
            case 1:
                return "concurrency=3";
            default:
                return super.b();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [q9.i, y9.e] */
    @Override // O9.e
    public Object e(M9.s sVar, p150o9.c cVar) throws Throwable {
        int i10 = this.f6174u;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        Object obj = this.f6175v;
        switch (i10) {
            case 0:
                Object objInvoke = ((q9.i) obj).invoke(sVar, cVar);
                return objInvoke == aVar ? objInvoke : yVar;
            default:
                int i11 = S9.i.f7544a;
                Object objD = ((C4.g) obj).d(new F2.D((K9.a0) cVar.getContext().i(K9.r.f5392s), new S9.h(3, 0), sVar, new O9.v(sVar), 2), cVar);
                return objD == aVar ? objD : yVar;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q9.i, y9.e] */
    @Override // O9.e
    public O9.e h(p150o9.h hVar, int i10, M9.a aVar) {
        switch (this.f6174u) {
            case 0:
                return new C0412e((p241y9.e) this.f6175v, hVar, i10, aVar);
            default:
                return new C0412e((C4.g) this.f6175v, hVar, i10, aVar);
        }
    }

    @Override // O9.e
    public M9.u j(InterfaceC0402u interfaceC0402u) {
        switch (this.f6174u) {
            case 1:
                p241y9.e c0030l0 = new C0030l0(this, (p150o9.c) null, 28);
                M9.r rVar = new M9.r(AbstractC0405x.y(interfaceC0402u, this.f6520r), u0.a(this.f6521s, 4, M9.a.f5830r));
                rVar.i0(EnumC0403v.f5401r, rVar, c0030l0);
                return rVar;
            default:
                return super.j(interfaceC0402u);
        }
    }

    @Override // O9.e
    public String toString() {
        switch (this.f6174u) {
            case 0:
                return "block[" + ((q9.i) this.f6175v) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0412e(p241y9.e eVar, p150o9.h hVar, int i10, M9.a aVar) {
        super(hVar, i10, aVar);
        this.f6175v = (q9.i) eVar;
    }
}
