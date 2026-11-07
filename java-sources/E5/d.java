package E5;

import C4.g;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import M.k;
import N9.InterfaceC0415h;
import N9.O;
import N9.k0;
import android.app.Dialog;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.feature.picker.book.view.ChooseBookPage;
import p110k9.y;
import p174r3.l;
import p218w3.n;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ChooseBookPage f1897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BookType f1898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ChooseBookPage chooseBookPage, BookType bookType, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f1895r = i10;
        this.f1897t = chooseBookPage;
        this.f1898u = bookType;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f1895r) {
            case 0:
                return new d(this.f1897t, this.f1898u, cVar, 0);
            case 1:
                return new d(this.f1897t, this.f1898u, cVar, 1);
            default:
                return new d(this.f1897t, this.f1898u, cVar, 2);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f1895r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f1895r;
        BookType bookType = this.f1898u;
        p161p9.a aVar = p161p9.a.f21156r;
        ChooseBookPage chooseBookPage = this.f1897t;
        p150o9.c cVar = null;
        y yVar = y.f19095a;
        int i11 = 0;
        int i12 = 1;
        switch (i10) {
            case 0:
                int i13 = this.f1896s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    k kVar = chooseBookPage.L0;
                    if (kVar == null) {
                        j.k("chooseBookPresenter");
                        throw null;
                    }
                    this.f1896s = 1;
                    R9.e eVar = H.f5322a;
                    obj = AbstractC0405x.I(R9.d.f7436t, new D5.b(kVar, bookType, cVar, i11), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Dialog dialog = chooseBookPage.f12590z0;
                    if (dialog instanceof p193t7.e) {
                        p193t7.e eVar2 = (p193t7.e) dialog;
                        if (eVar2.f22638w == null) {
                            eVar2.g();
                        }
                        boolean z10 = eVar2.f22638w.f14671Z;
                    }
                    chooseBookPage.S(false, false);
                }
                return yVar;
            case 1:
                int i14 = this.f1896s;
                if (i14 == 0) {
                    p110k9.a.e(obj);
                    k kVar2 = chooseBookPage.L0;
                    if (kVar2 == null) {
                        j.k("chooseBookPresenter");
                        throw null;
                    }
                    this.f1896s = 1;
                    R9.e eVar3 = H.f5322a;
                    Object objI = AbstractC0405x.I(R9.d.f7436t, new D5.b(kVar2, bookType, cVar, i12), this);
                    if (objI != aVar) {
                        objI = yVar;
                    }
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return yVar;
            default:
                int i15 = this.f1896s;
                if (i15 == 0) {
                    p110k9.a.e(obj);
                    k kVar3 = chooseBookPage.L0;
                    if (kVar3 == null) {
                        j.k("chooseBookPresenter");
                        throw null;
                    }
                    g gVar = ((n) kVar3.f5619t).g;
                    k0 k0Var = ((l) kVar3.f5618s).g;
                    D5.a aVar2 = new D5.a(kVar3, bookType, null);
                    e eVar4 = new e(0, chooseBookPage);
                    this.f1896s = 1;
                    Object objA = O9.c.a(eVar4, this, new O(aVar2, (p150o9.c) null), new InterfaceC0415h[]{gVar, k0Var});
                    if (objA != aVar) {
                        objA = yVar;
                    }
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return yVar;
        }
    }
}
