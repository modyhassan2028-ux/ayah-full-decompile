package D5;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import M.k;
import R9.d;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.Map;
import p110k9.y;
import p150o9.c;
import p174r3.l;
import p218w3.n;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f1237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BookType f1238u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(k kVar, BookType bookType, c cVar, int i10) {
        super(2, cVar);
        this.f1235r = i10;
        this.f1237t = kVar;
        this.f1238u = bookType;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f1235r) {
            case 0:
                return new b(this.f1237t, this.f1238u, cVar, 0);
            default:
                return new b(this.f1237t, this.f1238u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f1235r) {
            case 0:
                break;
        }
        return ((b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f1235r;
        Object obj2 = y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        k kVar = this.f1237t;
        BookType bookType = this.f1238u;
        boolean z10 = true;
        z10 = true;
        switch (i10) {
            case 0:
                int i11 = this.f1236s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p110k9.a.e(obj);
                    } else if (i11 == 2) {
                        p110k9.a.e(obj);
                        z10 = false;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return Boolean.valueOf(z10);
                }
                p110k9.a.e(obj);
                l lVar = (l) kVar.f5618s;
                this.f1236s = 1;
                obj = lVar.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                c cVar = null;
                if (((Map) obj).containsKey(bookType.f13685a)) {
                    this.f1236s = 2;
                    R9.e eVar = H.f5322a;
                    Object objI = AbstractC0405x.I(d.f7436t, new b(kVar, bookType, cVar, z10 ? 1 : 0), this);
                    if (objI == aVar) {
                        obj2 = objI;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    z10 = false;
                } else {
                    n nVar = (n) kVar.f5619t;
                    this.f1236s = 3;
                    Object objT = F9.n.t(nVar.f23708d.f4307a, new J3.l(bookType.f13685a, null, 2), this);
                    if (objT != aVar) {
                        objT = obj2;
                    }
                    if (objT == aVar) {
                        obj2 = objT;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                return Boolean.valueOf(z10);
            default:
                l lVar2 = (l) kVar.f5618s;
                int i12 = this.f1236s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    this.f1236s = 1;
                    obj = lVar2.b(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                if (!((Map) obj).containsKey(bookType.f13685a)) {
                    return obj2;
                }
                lVar2.e(bookType);
                return obj2;
        }
    }
}
