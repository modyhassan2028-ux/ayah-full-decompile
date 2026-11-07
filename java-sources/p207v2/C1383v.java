package p207v2;

import C4.e;
import N9.AbstractC0419l;
import N9.C0427u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import N9.Y;
import N9.m0;
import S9.c;
import p110k9.y;
import p161p9.a;
import p241y9.f;
import p251z9.j;
import q9.i;

/* JADX INFO: renamed from: v2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1383v extends i implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ InterfaceC0416i f23300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f23301t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f23302u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ EnumC1375m f23303v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f23304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23305x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383v(p150o9.c cVar, G g, EnumC1375m enumC1375m) {
        super(3, cVar);
        this.f23302u = g;
        this.f23303v = enumC1375m;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C1383v c1383v = new C1383v((p150o9.c) obj3, this.f23302u, this.f23303v);
        c1383v.f23300s = (InterfaceC0416i) obj;
        c1383v.f23301t = obj2;
        return c1383v.invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC0416i interfaceC0416i;
        int iIntValue;
        H h7;
        c cVar;
        Y y10;
        InterfaceC0415h c0427u;
        EnumC1375m enumC1375m = this.f23303v;
        int i10 = this.f23299r;
        y yVar = y.f19095a;
        G g = this.f23302u;
        a aVar = a.f21156r;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    iIntValue = this.f23305x;
                    cVar = this.f23304w;
                    h7 = (H) this.f23301t;
                    interfaceC0416i = this.f23300s;
                    p110k9.a.e(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
            }
            p110k9.a.e(obj);
            interfaceC0416i = this.f23300s;
            iIntValue = ((Number) this.f23301t).intValue();
            h7 = g.f23139h;
            cVar = h7.f23141a;
            this.f23300s = interfaceC0416i;
            this.f23301t = h7;
            this.f23304w = cVar;
            this.f23305x = iIntValue;
            this.f23299r = 1;
            if (cVar.e(this) != aVar) {
            }
            p074h0.i iVar = h7.f23142b.j;
            if (j.a(iVar.o(enumC1375m), C1372j.f23255b)) {
                c0427u = new e(6, new C1368f[0]);
                cVar.b(null);
            } else {
                iVar.o(enumC1375m);
                iVar.F(enumC1375m, C1372j.f23256c);
                cVar.b(null);
                Aa.a aVar2 = (Aa.a) g.f23137e.f20747s;
                int iOrdinal = enumC1375m.ordinal();
                if (iOrdinal == 1) {
                    y10 = ((C1369g) aVar2.f554r).f23234b;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalArgumentException("invalid load type for hints");
                    }
                    y10 = ((C1369g) aVar2.f555s).f23234b;
                }
                c0427u = new C0427u(AbstractC0419l.n(y10, iIntValue == 0 ? 0 : 1), iIntValue, 1);
            }
            this.f23300s = null;
            this.f23301t = null;
            this.f23304w = null;
            this.f23299r = 2;
            if (interfaceC0416i instanceof m0) {
                throw ((m0) interfaceC0416i).f6221r;
            }
            Object objD = c0427u.d(interfaceC0416i, this);
            if (objD != aVar) {
                objD = yVar;
            }
            return objD == aVar ? aVar : yVar;
        } catch (Throwable th) {
            cVar.b(null);
            throw th;
        }
    }
}
