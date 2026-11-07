package p037d6;

import X3.d;
import Z5.b;
import com.ayah.MainActivity;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import com.ayah.feature.tafsir.view.TafsirPage;
import java.util.Iterator;
import java.util.List;
import p110k9.a;
import p110k9.y;
import p241y9.e;
import q9.i;
import z3.g;
import z3.h;
import z3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TafsirPage f15698t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TafsirPage tafsirPage, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f15696r = i10;
        this.f15698t = tafsirPage;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f15696r) {
            case 0:
                c cVar2 = new c(this.f15698t, cVar, 0);
                cVar2.f15697s = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(this.f15698t, cVar, 1);
                cVar3.f15697s = obj;
                return cVar3;
            default:
                c cVar4 = new c(this.f15698t, cVar, 2);
                cVar4.f15697s = obj;
                return cVar4;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15696r) {
            case 0:
                c cVar = (c) create((List) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                cVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                c cVar2 = (c) create((d) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                cVar2.invokeSuspend(yVar2);
                return yVar2;
            default:
                c cVar3 = (c) create((j) obj, (p150o9.c) obj2);
                y yVar3 = y.f19095a;
                cVar3.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f15696r;
        y yVar = y.f19095a;
        TafsirPage tafsirPage = this.f15698t;
        switch (i10) {
            case 0:
                List list = (List) this.f15697s;
                a.e(obj);
                b bVar = tafsirPage.f13896w;
                bVar.getClass();
                p251z9.j.e(list, "items");
                bVar.j(list);
                return yVar;
            case 1:
                d dVar = (d) this.f15697s;
                a.e(obj);
                if (dVar instanceof X3.c) {
                    if (tafsirPage.f13890A == null) {
                        p251z9.j.k("pageContainer");
                        throw null;
                    }
                } else if (dVar instanceof X3.b) {
                    MainActivity mainActivity = tafsirPage.f13890A;
                    if (mainActivity == null) {
                        p251z9.j.k("pageContainer");
                        throw null;
                    }
                    mainActivity.s(new AyahMenuWrapper(mainActivity, ((X3.b) dVar).f9934a));
                    p211v6.a aVar = mainActivity.f13639d0;
                    if (aVar == null) {
                        p251z9.j.k("systemUiHelper");
                        throw null;
                    }
                    aVar.d();
                } else if (p251z9.j.a(dVar, X3.a.f9933b)) {
                    MainActivity mainActivity2 = tafsirPage.f13890A;
                    if (mainActivity2 == null) {
                        p251z9.j.k("pageContainer");
                        throw null;
                    }
                    if (System.currentTimeMillis() > mainActivity2.f13646k0) {
                        p211v6.a aVar2 = mainActivity2.f13639d0;
                        if (aVar2 == null) {
                            p251z9.j.k("systemUiHelper");
                            throw null;
                        }
                        aVar2.toggle();
                    }
                } else if (!p251z9.j.a(dVar, X3.a.f9932a)) {
                    throw new A6.a();
                }
                return yVar;
            default:
                j jVar = (j) this.f15697s;
                a.e(obj);
                int i11 = TafsirPage.f13889D;
                p251z9.j.e(jVar, "<this>");
                boolean z11 = jVar instanceof z3.i;
                g gVar = g.f24791a;
                if (z11) {
                    z10 = ((z3.i) jVar).f24795b;
                } else if (jVar instanceof h) {
                    z10 = ((h) jVar).f24793b;
                } else {
                    if (!jVar.equals(gVar)) {
                        throw new A6.a();
                    }
                    z10 = true;
                }
                if (z10) {
                    b bVar2 = tafsirPage.f13896w;
                    bVar2.getClass();
                    List list2 = bVar2.f1623u.f1666f;
                    p251z9.j.d(list2, "getCurrentList(...)");
                    int i12 = 0;
                    if (z11) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                p007a6.i iVar = (p007a6.i) it.next();
                                if (!(iVar instanceof p007a6.b) || ((p007a6.b) iVar).f11205c.f19528b != ((z3.i) jVar).f24794a) {
                                    i12++;
                                }
                            } else {
                                i12 = -1;
                            }
                        }
                    } else {
                        if (jVar instanceof h) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    p007a6.i iVar2 = (p007a6.i) it2.next();
                                    if (!(iVar2 instanceof p007a6.h) || ((p007a6.h) iVar2).f11221b.f20003b != ((h) jVar).f24792a) {
                                        i12++;
                                    }
                                }
                            }
                        } else if (!jVar.equals(gVar)) {
                            throw new A6.a();
                        }
                        i12 = -1;
                    }
                    if (i12 > -1) {
                        tafsirPage.f13893t.o0(i12);
                    }
                }
                return yVar;
        }
    }
}
