package H5;

import Y3.k;
import com.ayah.MainActivity;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import com.ayah.feature.quran.view.QuranPage;
import java.util.List;
import p110k9.y;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ QuranPage f3394t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(QuranPage quranPage, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f3392r = i10;
        this.f3394t = quranPage;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3392r) {
            case 0:
                d dVar = new d(this.f3394t, cVar, 0);
                dVar.f3393s = obj;
                return dVar;
            default:
                d dVar2 = new d(this.f3394t, cVar, 1);
                dVar2.f3393s = obj;
                return dVar2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3392r) {
            case 0:
                d dVar = (d) create((List) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                dVar.invokeSuspend(yVar);
                return yVar;
            default:
                d dVar2 = (d) create((X3.d) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                dVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f3392r;
        y yVar = y.f19095a;
        QuranPage quranPage = this.f3394t;
        switch (i10) {
            case 0:
                List<? extends k> list = (List) this.f3393s;
                p110k9.a.e(obj);
                quranPage.f13837t.setAccessoryViews(list);
                return yVar;
            default:
                X3.d dVar = (X3.d) this.f3393s;
                p110k9.a.e(obj);
                if (dVar instanceof X3.c) {
                    if (quranPage.f13841x == null) {
                        j.k("pageContainer");
                        throw null;
                    }
                } else if (dVar instanceof X3.b) {
                    MainActivity mainActivity = quranPage.f13841x;
                    if (mainActivity == null) {
                        j.k("pageContainer");
                        throw null;
                    }
                    mainActivity.s(new AyahMenuWrapper(mainActivity, ((X3.b) dVar).f9934a));
                    p211v6.a aVar = mainActivity.f13639d0;
                    if (aVar == null) {
                        j.k("systemUiHelper");
                        throw null;
                    }
                    aVar.d();
                } else if (j.a(dVar, X3.a.f9933b)) {
                    MainActivity mainActivity2 = quranPage.f13841x;
                    if (mainActivity2 == null) {
                        j.k("pageContainer");
                        throw null;
                    }
                    if (System.currentTimeMillis() > mainActivity2.f13646k0) {
                        p211v6.a aVar2 = mainActivity2.f13639d0;
                        if (aVar2 == null) {
                            j.k("systemUiHelper");
                            throw null;
                        }
                        aVar2.toggle();
                    }
                } else if (!j.a(dVar, X3.a.f9932a)) {
                    throw new A6.a();
                }
                return yVar;
        }
    }
}
