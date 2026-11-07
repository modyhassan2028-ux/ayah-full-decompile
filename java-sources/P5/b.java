package P5;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import N9.k0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import p110k9.y;
import p120l9.n;
import p120l9.v;
import p144o3.h;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f6688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f6689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f6690v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, String str, String str2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6686r = i10;
        this.f6688t = gVar;
        this.f6689u = str;
        this.f6690v = str2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6686r) {
            case 0:
                return new b(this.f6688t, this.f6689u, this.f6690v, cVar, 0);
            default:
                return new b(this.f6688t, this.f6689u, this.f6690v, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6686r) {
            case 0:
                break;
        }
        return ((b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f6686r;
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f6687s;
                g gVar = this.f6688t;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    h hVar = gVar.f6704b;
                    this.f6687s = 1;
                    obj = hVar.a(this.f6689u, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                p065g3.a aVar2 = (p065g3.a) obj;
                E9.d dVar = new E9.d(1, 114, 1);
                ArrayList arrayList = new ArrayList(n.a0(dVar, 10));
                Iterator it = dVar.iterator();
                while (((E9.c) it).f2000t) {
                    int iNextInt = ((v) it).nextInt();
                    arrayList.add(new p088i3.f(aVar2, iNextInt, p017b7.g.h0(aVar2, this.f6690v, AbstractC0813f2.K(new Integer(iNextInt))) ? p088i3.c.f16739f : p088i3.d.f16740f));
                }
                k0 k0Var = gVar.g;
                k0Var.getClass();
                k0Var.n(null, arrayList);
                return yVar;
            default:
                int i12 = this.f6687s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar = H.f5322a;
                R9.d dVar2 = R9.d.f7436t;
                b bVar = new b(this.f6688t, this.f6689u, this.f6690v, null, 0);
                this.f6687s = 1;
                return AbstractC0405x.I(dVar2, bVar, this) == aVar ? aVar : yVar;
        }
    }
}
