package B2;

import A.C0030l0;
import A.C0039q;
import A.C0040q0;
import E4.k;
import E4.o;
import J0.C0280d0;
import K9.A;
import K9.AbstractC0405x;
import K9.C0395m;
import K9.EnumC0403v;
import K9.H;
import K9.InterfaceC0402u;
import K9.V;
import K9.a0;
import N9.k0;
import T1.C0487d;
import T1.d0;
import W.EnumC0565h1;
import W.P;
import Z.X;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import androidx.fragment.app.FragmentActivity;
import com.ayah.MainActivity;
import com.ayah.PreferencesActivity;
import com.ayah.common.data.source.preference.model.PreferencesBookmark;
import com.ayah.dao.realm.factory.RealmUtils;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.Verse;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import com.ayah.feature.infolist.ui.wrapper.view.BaseListWrapper;
import com.ayah.note.NoteActivity;
import com.ayah.share.ShareActivity;
import com.ayah.ui.PreferencesFragment;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import i7.B;
import io.realm.Realm;
import io.realm.RealmFieldTypeConstants;
import io.realm.RealmResults;
import io.realm.internal.ObjectServerFacade;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p120l9.w;
import p151p.C1256n;
import p174r3.l;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f594t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f592r = i10;
        this.f593s = obj;
        this.f594t = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [q9.i, y9.e] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f592r) {
            case 0:
                d dVar = new d((e) this.f594t, cVar, 0);
                dVar.f593s = obj;
                return dVar;
            case 1:
                d dVar2 = new d((i) this.f594t, cVar);
                dVar2.f593s = obj;
                return dVar2;
            case 2:
                return new d((H3.a) this.f593s, (X1.b) this.f594t, cVar, 2);
            case 3:
                return new d((X1.b) this.f593s, (H3.e) this.f594t, cVar, 3);
            case 4:
                return new d((p241y9.c) this.f593s, (X) this.f594t, cVar, 4);
            case 5:
                d dVar3 = new d((AyahMenuWrapper) this.f594t, cVar, 5);
                dVar3.f593s = obj;
                return dVar3;
            case 6:
                d dVar4 = new d((List) this.f594t, cVar, 6);
                dVar4.f593s = obj;
                return dVar4;
            case 7:
                d dVar5 = new d((ArrayList) this.f594t, cVar, 7);
                dVar5.f593s = obj;
                return dVar5;
            case 8:
                d dVar6 = new d((M.h) this.f594t, cVar, 8);
                dVar6.f593s = obj;
                return dVar6;
            case 9:
                d dVar7 = new d((BaseListWrapper) this.f594t, cVar, 9);
                dVar7.f593s = obj;
                return dVar7;
            case 10:
                d dVar8 = new d((d0) this.f594t, cVar, 10);
                dVar8.f593s = obj;
                return dVar8;
            case 11:
                d dVar9 = new d((Set) this.f594t, cVar, 11);
                dVar9.f593s = obj;
                return dVar9;
            case 12:
                return new d((P) this.f593s, (Context) this.f594t, cVar, 12);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new d((NoteActivity) this.f593s, (E3.c) this.f594t, cVar, 13);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new d((P) this.f593s, (MainActivity) this.f594t, cVar, 14);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                d dVar10 = new d((PreferencesFragment) this.f594t, cVar, 15);
                dVar10.f593s = obj;
                return dVar10;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                d dVar11 = new d((l) this.f594t, cVar, 16);
                dVar11.f593s = obj;
                return dVar11;
            case 17:
                return new d((Integer[]) this.f593s, (C1256n) this.f594t, cVar, 17);
            case 18:
                return new d((List) this.f593s, (p218w3.f) this.f594t, cVar, 18);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new d((p219w4.f) this.f593s, (p199u4.a) this.f594t, cVar, 19);
            default:
                d dVar12 = new d((C0280d0) this.f594t, cVar, 20);
                dVar12.f593s = obj;
                return dVar12;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f592r) {
            case 0:
                ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
                throw null;
            case 1:
                return ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 2:
                return ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 3:
                return ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 4:
                d dVar = (d) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                dVar.invokeSuspend(yVar);
                return yVar;
            case 5:
                d dVar2 = (d) create((o) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                dVar2.invokeSuspend(yVar2);
                return yVar2;
            case 6:
                d dVar3 = (d) create((X1.b) obj, (p150o9.c) obj2);
                y yVar3 = y.f19095a;
                dVar3.invokeSuspend(yVar3);
                return yVar3;
            case 7:
                d dVar4 = (d) create((X1.b) obj, (p150o9.c) obj2);
                y yVar4 = y.f19095a;
                dVar4.invokeSuspend(yVar4);
                return yVar4;
            case 8:
                return ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 9:
                d dVar5 = (d) create((List) obj, (p150o9.c) obj2);
                y yVar5 = y.f19095a;
                dVar5.invokeSuspend(yVar5);
                return yVar5;
            case 10:
                return ((d) create((d0) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 11:
                return ((d) create((X1.b) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 12:
                d dVar6 = (d) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar6 = y.f19095a;
                dVar6.invokeSuspend(yVar6);
                return yVar6;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                d dVar7 = (d) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar7 = y.f19095a;
                dVar7.invokeSuspend(yVar7);
                return yVar7;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                d dVar8 = (d) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar8 = y.f19095a;
                dVar8.invokeSuspend(yVar8);
                return yVar8;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                d dVar9 = (d) create((I3.a) obj, (p150o9.c) obj2);
                y yVar9 = y.f19095a;
                dVar9.invokeSuspend(yVar9);
                return yVar9;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                d dVar10 = (d) create((i6.g) obj, (p150o9.c) obj2);
                y yVar10 = y.f19095a;
                dVar10.invokeSuspend(yVar10);
                return yVar10;
            case 17:
                return ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 18:
                return ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                d dVar11 = (d) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar11 = y.f19095a;
                dVar11.invokeSuspend(yVar11);
                return yVar11;
            default:
                d dVar12 = (d) create((p165q3.a) obj, (p150o9.c) obj2);
                y yVar12 = y.f19095a;
                dVar12.invokeSuspend(yVar12);
                return yVar12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        U3.a aVar;
        Object value;
        Map mapH0;
        MediaPlayer mediaPlayer;
        int i10 = this.f592r;
        EnumC0565h1 enumC0565h1 = EnumC0565h1.f9160t;
        int i11 = 0;
        int i12 = 0;
        z = false;
        boolean z10 = false;
        z = false;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        ?? r10 = 0;
        y yVar = y.f19095a;
        Object obj2 = this.f594t;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                throw null;
            case 1:
                p110k9.a.e(obj);
                p150o9.f fVarI = ((InterfaceC0402u) this.f593s).getCoroutineContext().i(p150o9.d.f20379r);
                j.b(fVarI);
                p150o9.e eVar = (p150o9.e) fVarI;
                C0395m c0395mA = AbstractC0405x.a();
                AbstractC0405x.w(V.f5341r, eVar, EnumC0403v.f5404u, new C0039q(c0395mA, (p241y9.e) obj2, (p150o9.c) null));
                while (!c0395mA.N()) {
                    try {
                        return AbstractC0405x.C(eVar, new C0040q0(c0395mA, (p150o9.c) r10, 7));
                    } catch (InterruptedException unused) {
                    }
                }
                return c0395mA.B();
            case 2:
                p110k9.a.e(obj);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                H3.a aVar2 = (H3.a) this.f593s;
                int i14 = aVar2.f3339a.getInt("PREF_BOOKMARK_ID", -1);
                if (i14 > -1) {
                    linkedHashSet.add(new PreferencesBookmark(i14, System.currentTimeMillis(), "", "RED"));
                }
                X1.b bVarG = ((X1.b) obj2).g();
                Set set = (Set) bVarG.c(aVar2.f3341c);
                if (set == null) {
                    X1.e eVar2 = aVar2.f3341c;
                    ArrayList arrayList = new ArrayList(n.a0(linkedHashSet, 10));
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(aVar2.f3340b.d((PreferencesBookmark) it.next()));
                    }
                    bVarG.e(eVar2, m.G0(arrayList));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        PreferencesBookmark preferencesBookmark = (PreferencesBookmark) aVar2.f3340b.b((String) it2.next());
                        if (preferencesBookmark != null) {
                            arrayList2.add(preferencesBookmark);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(n.a0(arrayList2, 10));
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList2.get(i15);
                        i15++;
                        PreferencesBookmark preferencesBookmark2 = (PreferencesBookmark) obj3;
                        if (preferencesBookmark2.f13698d == -1) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i16 = preferencesBookmark2.f13695a;
                            String str = preferencesBookmark2.f13696b;
                            String str2 = preferencesBookmark2.f13697c;
                            j.e(str, "name");
                            j.e(str2, "color");
                            preferencesBookmark2 = new PreferencesBookmark(i16, jCurrentTimeMillis, str, str2);
                        }
                        arrayList3.add(preferencesBookmark2);
                    }
                    ArrayList arrayList4 = new ArrayList(n.a0(arrayList3, 10));
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        arrayList4.add(aVar2.f3340b.d((PreferencesBookmark) obj4));
                    }
                    bVarG.e(aVar2.f3341c, m.G0(arrayList4));
                }
                return bVarG.h();
            case 3:
                p110k9.a.e(obj);
                X1.b bVar = (X1.b) this.f593s;
                H3.e eVar3 = (H3.e) obj2;
                X1.e eVar4 = eVar3.f3352b;
                String str3 = (String) bVar.c(eVar4);
                X1.b bVarG2 = bVar.g();
                if (str3 != null) {
                    List listN1 = H9.o.n1(str3, new String[]{","});
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : listN1) {
                        if (!j.a((String) obj5, "ru_mokhtasar")) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(n.a0(arrayList5, 10));
                    int size3 = arrayList5.size();
                    while (i13 < size3) {
                        Object obj6 = arrayList5.get(i13);
                        i13++;
                        String str4 = (String) obj6;
                        String str5 = (String) eVar3.f3351a.get(str4);
                        if (str5 != null) {
                            str4 = str5;
                        }
                        arrayList6.add(str4);
                    }
                    bVarG2.e(eVar4, m.l0(m.C0(m.F0(arrayList6)), ",", null, null, null, 62));
                }
                return bVarG2.h();
            case 4:
                p110k9.a.e(obj);
                ((p241y9.c) this.f593s).e(((X) obj2).getValue());
                return yVar;
            case 5:
                o oVar = (o) this.f593s;
                p110k9.a.e(obj);
                Object context = ((AyahMenuWrapper) obj2).getContext();
                if (context instanceof U3.a) {
                    aVar = (U3.a) context;
                }
                if (r10 != 0) {
                    if (j.a(oVar, k.f1874a)) {
                        r10 = aVar;
                        ((MainActivity) r10).C();
                    } else if (oVar instanceof E4.l) {
                        r10 = aVar;
                        int i17 = ((E4.l) oVar).f1875a;
                        MainActivity mainActivity = (MainActivity) r10;
                        Intent intent = new Intent(mainActivity, (Class<?>) NoteActivity.class);
                        intent.putExtra("AYAH_ID", i17);
                        mainActivity.startActivity(intent);
                        mainActivity.C();
                    } else if (oVar instanceof E4.m) {
                        r10 = aVar;
                        E4.m mVar = (E4.m) oVar;
                        int i18 = mVar.f1877b;
                        int i19 = mVar.f1878c;
                        MainActivity mainActivity2 = (MainActivity) r10;
                        Intent intent2 = new Intent(mainActivity2, (Class<?>) ShareActivity.class);
                        intent2.putExtra("EXTRA_SURA_NUMBER", i18);
                        intent2.putExtra("EXTRA_AYAH_NUMBER", i19);
                        mainActivity2.startActivity(intent2);
                        mainActivity2.C();
                    } else {
                        if (!(oVar instanceof E4.n)) {
                            r10 = aVar;
                            throw new A6.a();
                        }
                        r10 = aVar;
                        ((MainActivity) r10).E(((E4.n) oVar).f1879a);
                    }
                }
                r10 = aVar;
                return yVar;
            case 6:
                X1.b bVar2 = (X1.b) this.f593s;
                p110k9.a.e(obj);
                bVar2.e(F3.a.f2352k, m.l0((List) obj2, ",", null, null, null, 62));
                return yVar;
            case 7:
                X1.b bVar3 = (X1.b) this.f593s;
                p110k9.a.e(obj);
                bVar3.e(F3.a.f2345b, m.l0((ArrayList) obj2, ",", null, null, null, 62));
                return yVar;
            case 8:
                p110k9.a.e(obj);
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f593s;
                M.h hVar = (M.h) obj2;
                a0 a0Var = (a0) hVar.f5612b.getAndSet(null);
                AtomicReference atomicReference = hVar.f5612b;
                A aX = AbstractC0405x.x(interfaceC0402u, null, new C0030l0(a0Var, hVar, r10, 22), 3);
                while (!atomicReference.compareAndSet(null, aX)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z12);
                    }
                }
                z12 = true;
                return Boolean.valueOf(z12);
            case 9:
                List list = (List) this.f593s;
                p110k9.a.e(obj);
                ((BaseListWrapper) obj2).f13781u = list;
                return yVar;
            case 10:
                p110k9.a.e(obj);
                d0 d0Var = (d0) this.f593s;
                if ((d0Var instanceof C0487d) && d0Var.f7669a <= ((d0) obj2).f7669a) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 11:
                p110k9.a.e(obj);
                Set setKeySet = ((X1.b) this.f593s).a().keySet();
                ArrayList arrayList7 = new ArrayList(n.a0(setKeySet, 10));
                Iterator it3 = setKeySet.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((X1.e) it3.next()).f9850a);
                }
                Set set2 = (Set) obj2;
                if (set2 == W1.j.f9504a) {
                    z10 = true;
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it4 = set3.iterator();
                        while (it4.hasNext()) {
                            if (!arrayList7.contains((String) it4.next())) {
                                z10 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 12:
                p110k9.a.e(obj);
                if (((P) this.f593s).f8750a.b() == enumC0565h1) {
                    Object obj7 = (Context) obj2;
                    U3.a aVar3 = obj7 instanceof U3.a ? (U3.a) obj7 : null;
                    if (aVar3 != null) {
                        ((MainActivity) aVar3).C();
                    }
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                p110k9.a.e(obj);
                p074h0.i iVar = ((NoteActivity) this.f593s).f13918h0;
                if (iVar == null) {
                    j.k("notesPresenter");
                    throw null;
                }
                P9.d dVar = (P9.d) iVar.f16424u;
                R9.e eVar5 = H.f5322a;
                AbstractC0405x.x(dVar, R9.d.f7436t, new O9.y(iVar, (E3.c) obj2, r10, 25), 2);
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p110k9.a.e(obj);
                if (((P) this.f593s).f8750a.b() == enumC0565h1) {
                    ((MainActivity) obj2).C();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                I3.a aVar4 = (I3.a) this.f593s;
                p110k9.a.e(obj);
                PreferencesFragment preferencesFragment = (PreferencesFragment) obj2;
                preferencesFragment.f13940D0 = true;
                String str6 = aVar4.f3821r;
                preferencesFragment.l();
                p171r0.d.c(str6);
                FragmentActivity fragmentActivityL = preferencesFragment.L();
                if (fragmentActivityL instanceof PreferencesActivity) {
                    ((PreferencesActivity) fragmentActivityL).s();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                i6.g gVar = (i6.g) this.f593s;
                p110k9.a.e(obj);
                k0 k0Var = ((l) obj2).g;
                do {
                    value = k0Var.getValue();
                    Map map = (Map) value;
                    String str7 = ((s3.b) gVar.b()).f22128a;
                    p110k9.j jVar = new p110k9.j(str7, gVar);
                    j.e(map, "<this>");
                    if (map.isEmpty()) {
                        mapH0 = w.h0(jVar);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put(str7, gVar);
                        mapH0 = linkedHashMap;
                    }
                } while (!k0Var.l(value, mapH0));
                return yVar;
            case 17:
                p110k9.a.e(obj);
                Realm database = RealmUtils.getDatabase();
                C1256n c1256n = (C1256n) obj2;
                try {
                    RealmResults<Verse> realmResultsFindAll = database.where(Verse.class).in("verseID", (Integer[]) this.f593s).findAll();
                    j.d(realmResultsFindAll, "findAll(...)");
                    ArrayList arrayList8 = new ArrayList(n.a0(realmResultsFindAll, 10));
                    for (Verse verse : realmResultsFindAll) {
                        j.b(verse);
                        arrayList8.add(B0.c.y(verse, (B) c1256n.f20747s));
                    }
                    database.close();
                    return arrayList8;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p181s2.o.e(database, th);
                        throw th2;
                    }
                }
            case 18:
                p110k9.a.e(obj);
                Realm database2 = RealmUtils.getDatabase();
                List list2 = (List) this.f593s;
                p218w3.f fVar = (p218w3.f) obj2;
                try {
                    RealmResults<Page> realmResultsFindAll2 = database2.where(Page.class).in("number", (Integer[]) list2.toArray(new Integer[0])).findAll();
                    j.b(realmResultsFindAll2);
                    ArrayList arrayList9 = new ArrayList(n.a0(realmResultsFindAll2, 10));
                    for (Page page : realmResultsFindAll2) {
                        p110k9.o oVar2 = p124m3.d.f19547q;
                        j.b(page);
                        arrayList9.add(AbstractC0813f2.B(page, fVar.f23665a, true));
                    }
                    int iG0 = w.g0(n.a0(arrayList9, 10));
                    if (iG0 < 16) {
                        iG0 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG0);
                    int size4 = arrayList9.size();
                    while (i12 < size4) {
                        Object obj8 = arrayList9.get(i12);
                        i12++;
                        linkedHashMap2.put(new Integer(((p124m3.d) obj8).f19550b), obj8);
                    }
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        p124m3.d dVar2 = (p124m3.d) linkedHashMap2.get(new Integer(((Number) it5.next()).intValue()));
                        if (dVar2 != null) {
                            arrayList10.add(dVar2);
                        }
                        break;
                    }
                    database2.close();
                    return arrayList10;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        p181s2.o.e(database2, th3);
                        throw th4;
                    }
                }
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                p110k9.a.e(obj);
                p219w4.f fVar2 = (p219w4.f) this.f593s;
                k0 k0Var2 = fVar2.f23717c;
                int iOrdinal = ((p199u4.a) obj2).ordinal();
                p219w4.g gVar2 = p219w4.g.f23727v;
                if (iOrdinal == 0) {
                    MediaPlayer mediaPlayer2 = fVar2.g;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.setVolume(1.0f, 1.0f);
                    }
                    if (k0Var2.getValue() == gVar2 && (mediaPlayer = fVar2.g) != null) {
                        fVar2.a(mediaPlayer, true);
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        MediaPlayer mediaPlayer3 = fVar2.g;
                        if (mediaPlayer3 != null) {
                            mediaPlayer3.setVolume(0.1f, 0.1f);
                        }
                    } else {
                        if (iOrdinal != 3) {
                            throw new A6.a();
                        }
                        fVar2.c(true);
                    }
                } else if (k0Var2.getValue() == p219w4.g.f23725t) {
                    MediaPlayer mediaPlayer4 = fVar2.g;
                    if (mediaPlayer4 != null) {
                        mediaPlayer4.pause();
                    }
                    k0Var2.n(null, gVar2);
                }
                return yVar;
            default:
                p165q3.a aVar5 = (p165q3.a) this.f593s;
                p110k9.a.e(obj);
                C0280d0 c0280d0 = (C0280d0) obj2;
                k0 k0Var3 = (k0) c0280d0.f4066e;
                k0 k0Var4 = (k0) c0280d0.f4067f;
                p175r4.a aVar6 = (p175r4.a) k0Var4.getValue();
                if (aVar6 != null) {
                    p246z4.a aVar7 = (p246z4.a) ((k0) c0280d0.g).getValue();
                    String str8 = aVar6.f21555t;
                    j.e(aVar5, "<this>");
                    j.e(str8, "reciterId");
                    z3.k kVar = aVar5.f21279a;
                    z3.k kVar2 = aVar5.f21280b;
                    p175r4.a aVar8 = new p175r4.a(kVar, kVar2, str8, aVar5.f21281c, aVar5.f21282d);
                    if (aVar7 != null) {
                        z3.k kVar3 = aVar7.f24806a;
                        if (kVar.compareTo(kVar3) > 0 || kVar2.compareTo(kVar3) < 0) {
                            c0280d0.o(aVar8);
                            p246z4.b bVar4 = new p246z4.b(System.currentTimeMillis(), false);
                            k0Var3.getClass();
                            k0Var3.n(null, bVar4);
                        } else {
                            k0Var4.n(null, aVar8);
                            p246z4.f fVar3 = new p246z4.f(System.currentTimeMillis());
                            k0Var3.getClass();
                            k0Var3.n(null, fVar3);
                        }
                    } else {
                        c0280d0.o(aVar8);
                        p246z4.b bVar5 = new p246z4.b(System.currentTimeMillis(), false);
                        k0Var3.getClass();
                        k0Var3.n(null, bVar5);
                    }
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f592r = i10;
        this.f594t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f592r = 1;
        this.f594t = (i) eVar;
    }
}
