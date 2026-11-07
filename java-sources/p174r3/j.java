package p174r3;

import E2.C0140p;
import N9.InterfaceC0416i;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import com.ayah.common.data.source.preference.model.AppNotificationType;
import com.ayah.common.data.source.preference.model.PreferencesAppNotification;
import com.ayah.common.data.source.preference.model.PreferencesBookmark;
import com.ayah.common.data.source.preference.model.PreferencesKhatmah;
import i6.g;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import k3.f;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p120l9.r;
import p120l9.w;
import p150o9.c;
import p175r4.d;
import p189t3.a;
import p207v2.C1364b;
import p208v3.b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0416i f21542s;

    public /* synthetic */ j(InterfaceC0416i interfaceC0416i, int i10) {
        this.f21541r = i10;
        this.f21542s = interfaceC0416i;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0250  */
    /* JADX WARN: Code duplicated, block: B:124:0x0296  */
    /* JADX WARN: Code duplicated, block: B:145:0x0308  */
    /* JADX WARN: Code duplicated, block: B:176:0x038b  */
    /* JADX WARN: Code duplicated, block: B:199:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:220:0x0428  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, c cVar) {
        i iVar;
        d dVar;
        p182s5.c cVar2;
        List listA;
        a aVar;
        p095j3.a aVar2;
        LocalTime localTimeOf;
        p198u3.c cVar3;
        C1364b c1364b;
        b bVar;
        k3.b bVar2;
        p220w5.b bVar3;
        p220w5.c cVar4;
        switch (this.f21541r) {
            case 0:
                if (cVar instanceof i) {
                    iVar = (i) cVar;
                    int i10 = iVar.f21539s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        iVar.f21539s = i10 - Integer.MIN_VALUE;
                    } else {
                        iVar = new i(this, cVar);
                    }
                } else {
                    iVar = new i(this, cVar);
                }
                Object obj2 = iVar.f21538r;
                int i11 = iVar.f21539s;
                if (i11 == 0) {
                    p110k9.a.e(obj2);
                    if (((g) obj) instanceof i6.b) {
                        iVar.f21539s = 1;
                        Object objB = this.f21542s.b(obj, iVar);
                        p161p9.a aVar3 = p161p9.a.f21156r;
                        if (objB == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj2);
                }
                return y.f19095a;
            case 1:
                if (cVar instanceof d) {
                    dVar = (d) cVar;
                    int i12 = dVar.f21562s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        dVar.f21562s = i12 - Integer.MIN_VALUE;
                    } else {
                        dVar = new d(this, cVar);
                    }
                } else {
                    dVar = new d(this, cVar);
                }
                Object obj3 = dVar.f21561r;
                int i13 = dVar.f21562s;
                if (i13 == 0) {
                    p110k9.a.e(obj3);
                    g gVar = (g) obj;
                    if ((gVar instanceof i6.b) || (gVar instanceof i6.d)) {
                        dVar.f21562s = 1;
                        Object objB2 = this.f21542s.b(obj, dVar);
                        p161p9.a aVar4 = p161p9.a.f21156r;
                        if (objB2 == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj3);
                }
                return y.f19095a;
            case 2:
                if (cVar instanceof p182s5.c) {
                    cVar2 = (p182s5.c) cVar;
                    int i14 = cVar2.f22144s;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        cVar2.f22144s = i14 - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new p182s5.c(this, cVar);
                    }
                } else {
                    cVar2 = new p182s5.c(this, cVar);
                }
                Object obj4 = cVar2.f22143r;
                int i15 = cVar2.f22144s;
                if (i15 == 0) {
                    p110k9.a.e(obj4);
                    p124m3.d dVar2 = (p124m3.d) obj;
                    p124m3.j jVar = (dVar2 == null || (listA = dVar2.a()) == null) ? null : (p124m3.j) m.f0(listA);
                    cVar2.f22144s = 1;
                    Object objB3 = this.f21542s.b(jVar, cVar2);
                    p161p9.a aVar5 = p161p9.a.f21156r;
                    if (objB3 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj4);
                }
                return y.f19095a;
            case 3:
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i16 = aVar.f22584s;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        aVar.f22584s = i16 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(this, cVar);
                    }
                } else {
                    aVar = new a(this, cVar);
                }
                Object obj5 = aVar.f22583r;
                int i17 = aVar.f22584s;
                if (i17 == 0) {
                    p110k9.a.e(obj5);
                    p110k9.j jVar2 = (p110k9.j) obj;
                    PreferencesKhatmah preferencesKhatmah = (PreferencesKhatmah) jVar2.f19077r;
                    PreferencesAppNotification preferencesAppNotification = (PreferencesAppNotification) jVar2.f19078s;
                    if (preferencesKhatmah != null) {
                        LocalDate localDate = LocalDate.parse(preferencesKhatmah.f13700b);
                        if (preferencesAppNotification == null || (localTimeOf = LocalTime.parse(preferencesAppNotification.f13694c)) == null) {
                            localTimeOf = LocalTime.of(19, 0);
                        }
                        LocalTime localTime = localTimeOf;
                        p095j3.c cVarValueOf = p095j3.c.valueOf(preferencesKhatmah.f13699a);
                        p251z9.j.b(localDate);
                        int i18 = preferencesKhatmah.f13701c;
                        int i19 = preferencesKhatmah.f13702d;
                        boolean z10 = preferencesAppNotification != null ? preferencesAppNotification.f13693b : false;
                        p251z9.j.b(localTime);
                        aVar2 = new p095j3.a(cVarValueOf, localDate, i18, i19, z10, localTime);
                    } else {
                        aVar2 = null;
                    }
                    aVar.f22584s = 1;
                    Object objB4 = this.f21542s.b(aVar2, aVar);
                    p161p9.a aVar6 = p161p9.a.f21156r;
                    if (objB4 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj5);
                }
                return y.f19095a;
            case 4:
                if (cVar instanceof p198u3.c) {
                    cVar3 = (p198u3.c) cVar;
                    int i20 = cVar3.f22888s;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        cVar3.f22888s = i20 - Integer.MIN_VALUE;
                    } else {
                        cVar3 = new p198u3.c(this, cVar);
                    }
                } else {
                    cVar3 = new p198u3.c(this, cVar);
                }
                Object obj6 = cVar3.f22887r;
                int i21 = cVar3.f22888s;
                if (i21 == 0) {
                    p110k9.a.e(obj6);
                    List<PreferencesBookmark> list = (List) obj;
                    ArrayList arrayList = new ArrayList(n.a0(list, 10));
                    for (PreferencesBookmark preferencesBookmark : list) {
                        arrayList.add(new p077h3.a(preferencesBookmark.f13695a, preferencesBookmark.f13696b, BookmarkType.valueOf(preferencesBookmark.f13697c), preferencesBookmark.f13698d));
                    }
                    cVar3.f22888s = 1;
                    Object objB5 = this.f21542s.b(arrayList, cVar3);
                    p161p9.a aVar7 = p161p9.a.f21156r;
                    if (objB5 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj6);
                }
                return y.f19095a;
            case 5:
                if (cVar instanceof C1364b) {
                    c1364b = (C1364b) cVar;
                    int i22 = c1364b.f23205s;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        c1364b.f23205s = i22 - Integer.MIN_VALUE;
                    } else {
                        c1364b = new C1364b(this, cVar);
                    }
                } else {
                    c1364b = new C1364b(this, cVar);
                }
                Object obj7 = c1364b.f23204r;
                int i23 = c1364b.f23205s;
                if (i23 == 0) {
                    p110k9.a.e(obj7);
                    Object obj8 = ((p110k9.j) obj).f19078s;
                    if (obj8 != null) {
                        c1364b.f23205s = 1;
                        Object objB6 = this.f21542s.b(obj8, c1364b);
                        p161p9.a aVar8 = p161p9.a.f21156r;
                        if (objB6 == aVar8) {
                            return aVar8;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj7);
                }
                return y.f19095a;
            case 6:
                if (cVar instanceof b) {
                    bVar = (b) cVar;
                    int i24 = bVar.f23327s;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        bVar.f23327s = i24 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, cVar);
                    }
                } else {
                    bVar = new b(this, cVar);
                }
                Object obj9 = bVar.f23326r;
                int i25 = bVar.f23327s;
                if (i25 == 0) {
                    p110k9.a.e(obj9);
                    List<PreferencesAppNotification> list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(n.a0(list2, 10));
                    for (PreferencesAppNotification preferencesAppNotification2 : list2) {
                        AppNotificationType appNotificationType = preferencesAppNotification2.f13692a;
                        boolean z11 = preferencesAppNotification2.f13693b;
                        String str = preferencesAppNotification2.f13694c;
                        int i26 = p208v3.a.f23325a[appNotificationType.ordinal()];
                        if (i26 == 1) {
                            f fVar = new f(k3.a.DAILY_READING);
                            LocalTime localTime2 = LocalTime.parse(str);
                            p251z9.j.d(localTime2, "parse(...)");
                            bVar2 = new k3.b(fVar, localTime2, z11, k3.j.f18978k);
                        } else if (i26 == 2) {
                            f fVar2 = new f(k3.a.SURA_KAHF);
                            LocalTime localTime3 = LocalTime.parse(str);
                            p251z9.j.d(localTime3, "parse(...)");
                            bVar2 = new k3.b(fVar2, localTime3, z11, new k3.j());
                        } else {
                            if (i26 != 3) {
                                throw new A6.a();
                            }
                            f fVar3 = new f(k3.a.VERSE_OF_THE_DAY);
                            LocalTime localTime4 = LocalTime.parse(str);
                            p251z9.j.d(localTime4, "parse(...)");
                            bVar2 = new k3.b(fVar3, localTime4, z11, k3.j.f18978k);
                        }
                        arrayList2.add(bVar2);
                    }
                    bVar.f23327s = 1;
                    Object objB7 = this.f21542s.b(arrayList2, bVar);
                    p161p9.a aVar9 = p161p9.a.f21156r;
                    if (objB7 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj9);
                }
                return y.f19095a;
            case 7:
                if (cVar instanceof p220w5.b) {
                    bVar3 = (p220w5.b) cVar;
                    int i27 = bVar3.f23736s;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        bVar3.f23736s = i27 - Integer.MIN_VALUE;
                    } else {
                        bVar3 = new p220w5.b(this, cVar);
                    }
                } else {
                    bVar3 = new p220w5.b(this, cVar);
                }
                Object obj10 = bVar3.f23735r;
                int i28 = bVar3.f23736s;
                if (i28 == 0) {
                    p110k9.a.e(obj10);
                    p110k9.j jVar3 = (p110k9.j) obj;
                    List<E3.c> list3 = (List) jVar3.f19077r;
                    List list4 = (List) jVar3.f19078s;
                    int iG0 = w.g0(n.a0(list4, 10));
                    if (iG0 < 16) {
                        iG0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                    for (Object obj11 : list4) {
                        linkedHashMap.put(new Integer(((p124m3.j) obj11).f19585a), obj11);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (E3.c cVar5 : list3) {
                        p124m3.j jVar4 = (p124m3.j) linkedHashMap.get(new Integer(cVar5.f1842b));
                        p210v5.a aVar10 = jVar4 != null ? new p210v5.a(cVar5.f1842b, jVar4.f19595m, jVar4.f19586b, jVar4.c(), cVar5.f1843c) : null;
                        if (aVar10 != null) {
                            arrayList3.add(aVar10);
                        }
                    }
                    bVar3.f23736s = 1;
                    Object objB8 = this.f21542s.b(arrayList3, bVar3);
                    p161p9.a aVar11 = p161p9.a.f21156r;
                    if (objB8 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj10);
                }
                return y.f19095a;
            default:
                if (cVar instanceof p220w5.c) {
                    cVar4 = (p220w5.c) cVar;
                    int i29 = cVar4.f23739s;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        cVar4.f23739s = i29 - Integer.MIN_VALUE;
                    } else {
                        cVar4 = new p220w5.c(this, cVar);
                    }
                } else {
                    cVar4 = new p220w5.c(this, cVar);
                }
                Object obj12 = cVar4.f23738r;
                int i30 = cVar4.f23739s;
                if (i30 == 0) {
                    p110k9.a.e(obj12);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj13 : (List) obj) {
                        Integer num = new Integer(((p210v5.a) obj13).f23337b);
                        Object arrayList4 = linkedHashMap2.get(num);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap2.put(num, arrayList4);
                        }
                        ((List) arrayList4).add(obj13);
                    }
                    Set setKeySet = linkedHashMap2.keySet();
                    ArrayList arrayList5 = new ArrayList(n.a0(setKeySet, 10));
                    Iterator it = setKeySet.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        List list5 = (List) linkedHashMap2.get(new Integer(iIntValue));
                        if (list5 == null) {
                            list5 = r.f19440r;
                        }
                        arrayList5.add(new p210v5.b(iIntValue, list5));
                    }
                    List listY0 = m.y0(arrayList5, new C0140p(16));
                    cVar4.f23739s = 1;
                    Object objB9 = this.f21542s.b(listY0, cVar4);
                    p161p9.a aVar12 = p161p9.a.f21156r;
                    if (objB9 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj12);
                }
                return y.f19095a;
        }
    }

    public /* synthetic */ j(InterfaceC0416i interfaceC0416i, Object obj, int i10) {
        this.f21541r = i10;
        this.f21542s = interfaceC0416i;
    }
}
