package p197u2;

import Aa.a;
import androidx.lifecycle.K;
import com.ayah.ui.widget.search.SearchResultsView;
import p110k9.y;
import p173r2.v;
import p173r2.x;
import p241y9.c;
import p251z9.j;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22824r;

    public /* synthetic */ b(int i10) {
        this.f22824r = i10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10;
        int i11 = this.f22824r;
        y yVar = y.f19095a;
        switch (i11) {
            case 0:
                p105k2.c cVar = (p105k2.c) obj;
                j.e(cVar, "$this$initializer");
                return new c(K.b(cVar));
            case 1:
                v vVar = (v) obj;
                j.e(vVar, "destination");
                x xVar = vVar.f21494t;
                if (xVar == null || xVar.f21502w.f1673b != vVar.f21493s.f1641a) {
                    return null;
                }
                return xVar;
            case 2:
                v vVar2 = (v) obj;
                j.e(vVar2, "destination");
                x xVar2 = vVar2.f21494t;
                if (xVar2 == null || xVar2.f21502w.f1673b != vVar2.f21493s.f1641a) {
                    return null;
                }
                return xVar2;
            case 3:
                v vVar3 = (v) obj;
                j.e(vVar3, "it");
                i10 = vVar3.f21493s.f1641a;
                break;
            case 4:
                e eVar = (e) obj;
                j.e(eVar, "it");
                i10 = eVar.f24786a;
                break;
            case 5:
                p071g9.c cVar2 = (p071g9.c) obj;
                int i12 = SearchResultsView.f13960B;
                j.e(cVar2, "$this$applyInsetter");
                p071g9.c.a(cVar2, new b(6), 217);
                a aVar = cVar2.f16343a;
                aVar.getClass();
                cVar2.f16343a = aVar;
                return yVar;
            default:
                p071g9.b bVar = (p071g9.b) obj;
                int i13 = SearchResultsView.f13960B;
                j.e(bVar, "$this$type");
                p071g9.b.a(bVar, 122);
                return yVar;
        }
        return Integer.valueOf(i10);
    }
}
