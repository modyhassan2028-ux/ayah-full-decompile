package K4;

import K9.A;
import N9.InterfaceC0416i;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p124m3.g;
import p124m3.h;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC0416i f5227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f5228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5229u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f5231w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f5226r = i10;
        this.f5231w = dVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5226r) {
            case 0:
                a aVar = new a(this.f5231w, cVar, 0);
                aVar.f5230v = obj;
                return aVar;
            default:
                a aVar2 = new a(this.f5231w, cVar, 1);
                aVar2.f5230v = obj;
                return aVar2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0416i interfaceC0416i = (InterfaceC0416i) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f5226r) {
            case 0:
                break;
        }
        return ((a) create(interfaceC0416i, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        switch (this.f5226r) {
            case 0:
                InterfaceC0416i interfaceC0416i = (InterfaceC0416i) this.f5230v;
                int i10 = this.f5229u;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i10 != 0) {
                    if (i10 == 1) {
                        List list3 = this.f5228t;
                        InterfaceC0416i interfaceC0416i2 = this.f5227s;
                        p110k9.a.e(obj);
                        list = list3;
                        interfaceC0416i = interfaceC0416i2;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj);
                List listK = AbstractC0813f2.K(J4.b.f4324a);
                A a9 = this.f5231w.f5241e;
                this.f5230v = null;
                this.f5227s = interfaceC0416i;
                this.f5228t = listK;
                this.f5229u = 1;
                Object objP = a9.p(this);
                if (objP == aVar) {
                    return aVar;
                }
                list = listK;
                obj = objP;
                ArrayList arrayList = new ArrayList();
                for (g gVar : (Iterable) obj) {
                    List listK2 = AbstractC0813f2.K(new J4.a(gVar));
                    ArrayList arrayList2 = gVar.f19572f;
                    ArrayList arrayList3 = new ArrayList(n.a0(arrayList2, 10));
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        arrayList3.add(new J4.c((h) obj2));
                    }
                    m.d0(arrayList, m.q0(listK2, arrayList3));
                }
                ArrayList arrayListQ0 = m.q0(list, arrayList);
                this.f5230v = null;
                this.f5227s = null;
                this.f5228t = null;
                this.f5229u = 2;
                if (interfaceC0416i.b(arrayListQ0, this) == aVar) {
                    return aVar;
                }
                return y.f19095a;
            default:
                InterfaceC0416i interfaceC0416i3 = (InterfaceC0416i) this.f5230v;
                int i12 = this.f5229u;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i12 != 0) {
                    if (i12 == 1) {
                        List list4 = this.f5228t;
                        InterfaceC0416i interfaceC0416i4 = this.f5227s;
                        p110k9.a.e(obj);
                        list2 = list4;
                        interfaceC0416i3 = interfaceC0416i4;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj);
                List listK3 = AbstractC0813f2.K(J4.b.f4324a);
                A a10 = this.f5231w.f5241e;
                this.f5230v = null;
                this.f5227s = interfaceC0416i3;
                this.f5228t = listK3;
                this.f5229u = 1;
                Object objP2 = a10.p(this);
                if (objP2 == aVar2) {
                    return aVar2;
                }
                list2 = listK3;
                obj = objP2;
                ArrayList arrayList4 = new ArrayList();
                for (g gVar2 : (Iterable) obj) {
                    List listK4 = AbstractC0813f2.K(new J4.a(gVar2));
                    ArrayList arrayList5 = gVar2.f19571e;
                    ArrayList arrayList6 = new ArrayList(n.a0(arrayList5, 10));
                    int size2 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj3 = arrayList5.get(i13);
                        i13++;
                        arrayList6.add(new J4.d((p124m3.a) obj3));
                    }
                    m.d0(arrayList4, m.q0(listK4, arrayList6));
                }
                ArrayList arrayListQ1 = m.q0(list2, arrayList4);
                this.f5230v = null;
                this.f5227s = null;
                this.f5228t = null;
                this.f5229u = 2;
                if (interfaceC0416i3.b(arrayListQ1, this) == aVar2) {
                    return aVar2;
                }
                return y.f19095a;
        }
    }
}
