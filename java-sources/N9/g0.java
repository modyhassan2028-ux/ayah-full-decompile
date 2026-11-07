package N9;

import K9.AbstractC0405x;
import com.ayah.common.data.source.database.BookDatabase;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6185r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f6187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f6188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6189v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, p150o9.c cVar) {
        super(3, cVar);
        this.f6189v = h0Var;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f6185r) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = new g0((h0) this.f6189v, (p150o9.c) obj3);
                g0Var.f6188u = (InterfaceC0416i) obj;
                g0Var.f6187t = iIntValue;
                return g0Var.invokeSuspend(p110k9.y.f19095a);
            default:
                g0 g0Var2 = new g0((p218w3.n) this.f6189v, this.f6187t, (p150o9.c) obj3);
                g0Var2.f6188u = (BookType) obj;
                return g0Var2.invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[LOOP:0: B:25:0x006b->B:27:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0416i interfaceC0416i;
        A3.c cVarL;
        List list;
        ArrayList arrayList;
        Iterator it;
        switch (this.f6185r) {
            case 0:
                int i10 = this.f6186s;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            interfaceC0416i = (InterfaceC0416i) this.f6188u;
                            p110k9.a.e(obj);
                            this.f6188u = interfaceC0416i;
                            this.f6186s = 3;
                            if (interfaceC0416i.b(a0.f6157s, this) == aVar) {
                                return aVar;
                            }
                            this.f6188u = interfaceC0416i;
                            this.f6186s = 4;
                            if (AbstractC0405x.k(Long.MAX_VALUE, this) == aVar) {
                                return aVar;
                            }
                        } else if (i10 == 3) {
                            interfaceC0416i = (InterfaceC0416i) this.f6188u;
                            p110k9.a.e(obj);
                            this.f6188u = interfaceC0416i;
                            this.f6186s = 4;
                            if (AbstractC0405x.k(Long.MAX_VALUE, this) == aVar) {
                                return aVar;
                            }
                        } else if (i10 == 4) {
                            interfaceC0416i = (InterfaceC0416i) this.f6188u;
                            p110k9.a.e(obj);
                        } else if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        this.f6188u = null;
                        this.f6186s = 5;
                        if (interfaceC0416i.b(a0.f6158t, this) == aVar) {
                            return aVar;
                        }
                    }
                    p110k9.a.e(obj);
                } else {
                    p110k9.a.e(obj);
                    interfaceC0416i = (InterfaceC0416i) this.f6188u;
                    if (this.f6187t > 0) {
                        this.f6186s = 1;
                        if (interfaceC0416i.b(a0.f6156r, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        this.f6188u = interfaceC0416i;
                        this.f6186s = 2;
                        if (AbstractC0405x.k(0L, this) == aVar) {
                            return aVar;
                        }
                        this.f6188u = interfaceC0416i;
                        this.f6186s = 3;
                        if (interfaceC0416i.b(a0.f6157s, this) == aVar) {
                            return aVar;
                        }
                        this.f6188u = interfaceC0416i;
                        this.f6186s = 4;
                        if (AbstractC0405x.k(Long.MAX_VALUE, this) == aVar) {
                            return aVar;
                        }
                        this.f6188u = null;
                        this.f6186s = 5;
                        if (interfaceC0416i.b(a0.f6158t, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return p110k9.y.f19095a;
            default:
                BookType bookType = (BookType) this.f6188u;
                int i11 = this.f6186s;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    list = (List) obj;
                    if (list != null) {
                        arrayList = new ArrayList(p120l9.n.a0(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(p017b7.g.c0((E3.a) it.next(), bookType.g));
                        }
                        return arrayList;
                    }
                    return AbstractC0813f2.K(new p134n3.c(bookType));
                }
                p110k9.a.e(obj);
                p174r3.l lVar = ((p218w3.n) this.f6189v).f23709e;
                this.f6188u = bookType;
                this.f6186s = 1;
                obj = lVar.d(bookType, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                BookDatabase bookDatabase = (BookDatabase) obj;
                if (bookDatabase != null && (cVarL = bookDatabase.l()) != null) {
                    int i12 = this.f6187t;
                    this.f6188u = bookType;
                    this.f6186s = 2;
                    obj = B9.a.R(cVarL.f489a, true, false, new A3.b(i12, cVarL), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    list = (List) obj;
                    if (list != null) {
                        arrayList = new ArrayList(p120l9.n.a0(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(p017b7.g.c0((E3.a) it.next(), bookType.g));
                        }
                        return arrayList;
                    }
                }
                return AbstractC0813f2.K(new p134n3.c(bookType));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p218w3.n nVar, int i10, p150o9.c cVar) {
        super(3, cVar);
        this.f6189v = nVar;
        this.f6187t = i10;
    }
}
