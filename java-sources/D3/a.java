package D3;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import com.ayah.common.data.source.json.model.booklist.BookCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p110k9.y;
import p120l9.n;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f1165t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, p150o9.c cVar2, int i10) {
        super(2, cVar2);
        this.f1163r = i10;
        this.f1165t = cVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f1163r) {
            case 0:
                return new a(this.f1165t, cVar, 0);
            case 1:
                return new a(this.f1165t, cVar, 1);
            default:
                return new a(this.f1165t, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f1163r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((a) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f1163r;
        y yVar = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        c cVar = this.f1165t;
        switch (i10) {
            case 0:
                int i11 = this.f1164s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f1164s = 1;
                    return cVar.b(this) == aVar ? aVar : yVar;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            case 1:
                int i12 = this.f1164s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar = H.f5322a;
                d dVar = d.f7436t;
                a aVar2 = new a(cVar, null, 0);
                this.f1164s = 1;
                return AbstractC0405x.I(dVar, aVar2, this) == aVar ? aVar : yVar;
            default:
                int i13 = this.f1164s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    this.f1164s = 1;
                    obj = cVar.b(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                Collection collectionValues = ((Map) obj).values();
                ArrayList arrayList = new ArrayList(n.a0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BookCategory) it.next()).f13683c);
                }
                ArrayList arrayListB0 = n.b0(arrayList);
                cVar.f1171d.set(arrayListB0);
                return arrayListB0;
        }
    }
}
