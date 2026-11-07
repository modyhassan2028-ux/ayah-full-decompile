package I4;

import A.C0039q;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import N9.AbstractC0419l;
import N9.C0412e;
import N9.C0424q;
import N9.E;
import N9.InterfaceC0415h;
import N9.O;
import N9.k0;
import W.C0561g1;
import W.P;
import Z.X;
import com.ayah.feature.reciterlist.qari.QariAudioActivity;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3839r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f3841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3843v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(QariAudioActivity qariAudioActivity, String str, boolean z10, p150o9.c cVar) {
        super(2, cVar);
        this.f3842u = qariAudioActivity;
        this.f3843v = str;
        this.f3841t = z10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3839r) {
            case 0:
                return new f(this.f3841t, (P) this.f3842u, (X) this.f3843v, cVar);
            default:
                return new f((QariAudioActivity) this.f3842u, (String) this.f3843v, this.f3841t, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f3839r) {
            case 0:
                break;
        }
        return ((f) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        int i11 = this.f3839r;
        boolean z10 = this.f3841t;
        Object obj2 = this.f3843v;
        p161p9.a aVar = p161p9.a.f21156r;
        Object obj3 = this.f3842u;
        y yVar = y.f19095a;
        switch (i11) {
            case 0:
                P p10 = (P) obj3;
                int i12 = this.f3840s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    ((X) obj2).setValue(Boolean.TRUE);
                    return yVar;
                }
                p110k9.a.e(obj);
                this.f3840s = 1;
                if (AbstractC0405x.k(50L, this) == aVar) {
                    return aVar;
                }
                if (z10) {
                    C0561g1 c0561g1 = p10.f8750a;
                    this.f3840s = 2;
                    if (c0561g1.a(this) == aVar) {
                        return aVar;
                    }
                } else {
                    C0561g1 c0561g2 = p10.f8750a;
                    this.f3840s = 3;
                    if (c0561g2.d(this) == aVar) {
                        return aVar;
                    }
                }
                ((X) obj2).setValue(Boolean.TRUE);
                return yVar;
            default:
                QariAudioActivity qariAudioActivity = (QariAudioActivity) obj3;
                int i13 = this.f3840s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    P5.g gVarS = qariAudioActivity.s();
                    String str = (String) obj2;
                    p150o9.c cVar = null;
                    String strValueOf = String.valueOf(qariAudioActivity.getExternalFilesDir(null));
                    C4.g gVar = new C4.g(AbstractC0419l.l(gVarS.f6710i), gVarS, 11);
                    int i14 = E.f6087a;
                    AbstractC0419l.u(new C0424q(new C0412e(gVar, p150o9.i.f20380r, -2, M9.a.f5830r), new P5.f(gVarS, null, 0), 2), gVarS.f6709h);
                    AbstractC0419l.u(new C0424q(new C4.c(gVarS.f6706d.f20979b, 12), new P5.f(gVarS, null, 1), 2), gVarS.f6709h);
                    C4.e eVar = new C4.e(new C0039q(gVarS, cVar, 22));
                    k0 k0Var = gVarS.g;
                    p088i3.f fVar = (p088i3.f) m.g0((List) k0Var.getValue());
                    if (j.a(fVar != null ? fVar.f16745a.f16273a : null, str)) {
                        i10 = 3;
                    } else {
                        P9.d dVar = gVarS.f6708f;
                        P5.b bVar = new P5.b(gVarS, str, strValueOf, cVar, 1);
                        i10 = 3;
                        AbstractC0405x.x(dVar, null, bVar, 3);
                    }
                    C4.g gVar2 = new C4.g(k0Var, str, 10);
                    H5.e eVar2 = new H5.e(z10, null);
                    E5.e eVar3 = new E5.e(i10, qariAudioActivity);
                    this.f3840s = 1;
                    Object objA = O9.c.a(eVar3, this, new O(eVar2, (p150o9.c) null), new InterfaceC0415h[]{eVar, gVar2});
                    if (objA != aVar) {
                        objA = yVar;
                    }
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, P p10, X x9, p150o9.c cVar) {
        super(2, cVar);
        this.f3841t = z10;
        this.f3842u = p10;
        this.f3843v = x9;
    }
}
