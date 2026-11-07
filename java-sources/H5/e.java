package H5;

import android.view.ViewGroup;
import com.ayah.common.ui.view.QuranImageFooter;
import com.ayah.feature.quran.view.QuranPage;
import com.ayah.feature.quran.view.QuranPageViewGroup;
import com.ayah.feature.tafsir.view.TafsirPage;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p120l9.r;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ boolean f3396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f3397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3398u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ViewGroup viewGroup, p150o9.c cVar, int i10) {
        super(3, cVar);
        this.f3395r = i10;
        this.f3398u = viewGroup;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f3395r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                e eVar = new e((QuranPage) this.f3398u, (p150o9.c) obj3, 0);
                eVar.f3397t = (p124m3.d) obj;
                eVar.f3396s = zBooleanValue;
                y yVar = y.f19095a;
                eVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                e eVar2 = new e(this.f3396s, (p150o9.c) obj3);
                eVar2.f3397t = (List) obj;
                eVar2.f3398u = (List) obj2;
                return eVar2.invokeSuspend(y.f19095a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                e eVar3 = new e((TafsirPage) this.f3398u, (p150o9.c) obj3, 2);
                eVar3.f3397t = (p124m3.d) obj;
                eVar3.f3396s = zBooleanValue2;
                y yVar2 = y.f19095a;
                eVar3.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Iterable iterableQ0;
        String str2;
        switch (this.f3395r) {
            case 0:
                p124m3.d dVar = (p124m3.d) this.f3397t;
                boolean z10 = this.f3396s;
                p110k9.a.e(obj);
                p124m3.f fVar = (p124m3.f) dVar.f19559m.getValue();
                p124m3.g gVar = fVar.f19564a;
                p124m3.h hVar = fVar.f19565b;
                QuranPageViewGroup quranPageViewGroup = ((QuranPage) this.f3398u).f13837t;
                String str3 = p125m4.b.b() ? gVar.f19569c : gVar.f19570d;
                String strA = fVar.a();
                quranPageViewGroup.getClass();
                j.e(str3, "juz");
                j.e(strA, "suras");
                quranPageViewGroup.f13848u.setHeaderInfo(str3, strA);
                String strB = dVar.b();
                if (hVar == null) {
                    str = "";
                } else {
                    str = p125m4.b.b() ? hVar.f19578d : hVar.f19579e;
                    if (str == null) {
                        str = "";
                    }
                }
                boolean z11 = dVar.f19551c;
                quranPageViewGroup.getClass();
                quranPageViewGroup.f13849v.setFooterInfo(strB, str, z11, z10);
                return y.f19095a;
            case 1:
                List<p124m3.g> list = (List) this.f3397t;
                List list2 = (List) this.f3398u;
                p110k9.a.e(obj);
                p088i3.f fVar2 = (p088i3.f) m.g0(list2);
                String str4 = null;
                p065g3.a aVar = fVar2 != null ? fVar2.f16745a : null;
                if (this.f3396s) {
                    if (aVar != null) {
                        str4 = aVar.f16279h;
                    }
                } else if (aVar != null) {
                    str4 = aVar.f16280i;
                }
                r rVar = r.f19440r;
                List listK = (str4 == null || str4.length() == 0 || aVar == null) ? rVar : AbstractC0813f2.K(new O5.b(aVar));
                ArrayList arrayList = new ArrayList();
                for (p124m3.g gVar2 : list) {
                    if (gVar2.f19571e.isEmpty()) {
                        iterableQ0 = rVar;
                    } else {
                        List listK2 = AbstractC0813f2.K(new O5.a(gVar2.f19568b));
                        ArrayList arrayList2 = gVar2.f19571e;
                        ArrayList arrayList3 = new ArrayList(n.a0(arrayList2, 10));
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            p124m3.a aVar2 = (p124m3.a) obj2;
                            p088i3.f fVar3 = (p088i3.f) list2.get(aVar2.f19528b - 1);
                            arrayList3.add(new O5.c(aVar2, fVar3.f16745a, fVar3.f16747c));
                        }
                        iterableQ0 = m.q0(listK2, arrayList3);
                    }
                    m.d0(arrayList, iterableQ0);
                }
                return m.q0(listK, arrayList);
            default:
                p124m3.d dVar2 = (p124m3.d) this.f3397t;
                boolean z12 = this.f3396s;
                p110k9.a.e(obj);
                p124m3.f fVar4 = (p124m3.f) dVar2.f19559m.getValue();
                p124m3.g gVar3 = fVar4.f19564a;
                p124m3.h hVar2 = fVar4.f19565b;
                TafsirPage tafsirPage = (TafsirPage) this.f3398u;
                if (tafsirPage.getContext() != null) {
                    tafsirPage.f13894u.setHeaderInfo(p125m4.b.b() ? gVar3.f19569c : gVar3.f19570d, fVar4.a());
                    QuranImageFooter quranImageFooter = tafsirPage.f13895v;
                    String strB2 = dVar2.b();
                    if (hVar2 == null) {
                        str2 = "";
                    } else {
                        str2 = p125m4.b.b() ? hVar2.f19578d : hVar2.f19579e;
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    quranImageFooter.setFooterInfo(strB2, str2, dVar2.f19551c, z12);
                }
                return y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, p150o9.c cVar) {
        super(3, cVar);
        this.f3395r = 1;
        this.f3396s = z10;
    }
}
