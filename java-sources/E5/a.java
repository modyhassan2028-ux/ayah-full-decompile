package E5;

import A.C0030l0;
import A.C0040q0;
import D0.u;
import D0.v;
import E4.g;
import E4.h;
import E4.i;
import E4.l;
import E4.m;
import E4.n;
import F2.p;
import H9.o;
import K9.AbstractC0405x;
import N9.Y;
import Q8.K;
import Q8.L;
import T1.C0485b;
import W.I1;
import Y9.O;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.feature.library.edit.view.EditLibraryComposePage;
import com.ayah.feature.library.view.LibraryComposePage;
import com.ayah.feature.picker.book.view.ChooseBookPage;
import com.ayah.feature.tafsir.view.TafsirPage;
import com.ayah.ui.widget.search.SearchResultsView;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p110k9.y;
import p173r2.G;
import p251z9.A;
import p251z9.j;
import p251z9.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1891s;

    public /* synthetic */ a(int i10, Object obj) {
        this.f1890r = i10;
        this.f1891s = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p241y9.c
    public final Object e(Object obj) {
        String strA;
        int i10 = this.f1890r;
        int i11 = 3;
        boolean z10 = true;
        int i12 = 0;
        y yVar = y.f19095a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object obj2 = this.f1891s;
        switch (i10) {
            case 0:
                ChooseBookPage chooseBookPage = (ChooseBookPage) obj2;
                BookType bookType = (BookType) obj;
                j.e(bookType, "book");
                AbstractC0405x.x(chooseBookPage.f13822J0, null, new d(chooseBookPage, bookType, objArr == true ? 1 : 0, i12), 3);
                return yVar;
            case 1:
                R2.a aVar = (R2.a) obj;
                j.e(aVar, "db");
                ((p) obj2).g = aVar;
                return yVar;
            case 2:
                H8.j jVar = (H8.j) obj2;
                X1.b bVar = (X1.b) obj;
                X1.e eVar = H8.j.f3607c;
                long j = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        X1.e eVar2 = (X1.e) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strD = jVar.d(System.currentTimeMillis());
                        if (set.contains(strD)) {
                            Object[] objArr9 = {strD};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr9[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                throw new IllegalArgumentException("duplicate element: " + obj3);
                            }
                            bVar.e(eVar2, DesugarCollections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            bVar.d(eVar2);
                        }
                    }
                }
                if (j == 0) {
                    bVar.d(eVar);
                } else {
                    bVar.e(eVar, Long.valueOf(j));
                }
                return null;
            case 3:
                return ((H9.j) obj2).c(((Integer) obj).intValue());
            case 4:
                String str = (String) obj2;
                String str2 = (String) obj;
                j.e(str2, "it");
                if (o.e1(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return android.support.v4.media.session.p.z(str, str2);
            case 5:
                E4.j jVar2 = (E4.j) obj;
                int i13 = AyahMenuWrapper.f13763v;
                j.e(jVar2, "ayahEvent");
                F4.d presenter = ((AyahMenuWrapper) obj2).getPresenter();
                Y y10 = presenter.f2387o;
                P9.d dVar = presenter.f2384l;
                int iA = jVar2.a();
                if (jVar2 instanceof E4.b) {
                    AbstractC0405x.x(dVar, null, new C0030l0((E4.b) jVar2, presenter, objArr5 == true ? 1 : 0, 8), 3);
                } else if (jVar2 instanceof E4.d) {
                    AbstractC0405x.x(dVar, null, new C0030l0((E4.d) jVar2, presenter, objArr4 == true ? 1 : 0, 9), 3);
                } else if (jVar2 instanceof E4.e) {
                    y10.g(new l(iA));
                } else if (jVar2 instanceof E4.f) {
                    AbstractC0405x.x(dVar, null, new C0030l0(presenter, (E4.f) jVar2, objArr3 == true ? 1 : 0, 7), 3);
                } else if (jVar2 instanceof g) {
                    g gVar = (g) jVar2;
                    presenter.f2383k.b(new p165q3.e(gVar.f1868b, gVar.f1869c));
                } else if (jVar2 instanceof h) {
                    h hVar = (h) jVar2;
                    y10.g(new m(iA, hVar.f1871b, hVar.f1872c));
                } else if (jVar2 instanceof i) {
                    y10.g(new n(iA));
                } else {
                    if (!(jVar2 instanceof E4.c)) {
                        throw new A6.a();
                    }
                    AbstractC0405x.x(dVar, null, new C0040q0((Object) presenter, (p150o9.c) (objArr2 == true ? 1 : 0), 4), 3);
                }
                return yVar;
            case 6:
                v vVar = (v) obj;
                ((D4.l) obj2).invoke(vVar, Float.valueOf(Float.intBitsToFloat((int) (u.g(vVar, false) & 4294967295L))));
                if (!p171r0.c.b(u.g(vVar, false), 0L)) {
                    vVar.a();
                }
                return yVar;
            case 7:
                C0485b c0485b = (C0485b) obj;
                j.e(c0485b, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", c0485b);
                return new K(((L) obj2).f6902a.a(null), null, null);
            case 8:
                ((S9.c) obj2).b(null);
                return yVar;
            case 9:
                W9.g gVar2 = (W9.g) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return gVar2.f9672e[iIntValue] + ": " + gVar2.f9673f[iIntValue].b();
            case 10:
                O o10 = (O) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return o10.f10477e[iIntValue2] + ": " + o10.j(iIntValue2).b();
            case 11:
                p124m3.j jVar3 = (p124m3.j) obj;
                int i14 = KhatmahWrapper.f13794v;
                j.e(jVar3, "it");
                U4.e khatmahPresenter = ((KhatmahWrapper) obj2).getKhatmahPresenter();
                khatmahPresenter.getClass();
                khatmahPresenter.f8187c.a(jVar3.f19585a, jVar3.c(), null);
                return yVar;
            case 12:
                BookType bookType2 = (BookType) obj;
                int i15 = TafsirPage.f13889D;
                j.e(bookType2, "it");
                p027c6.f presenter2 = ((TafsirPage) obj2).getPresenter();
                presenter2.getClass();
                presenter2.f13528h.e(bookType2);
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                p241y9.a aVar2 = (p241y9.a) obj2;
                I1 i16 = (I1) obj;
                j.e(i16, "swipeValue");
                if (i16 == I1.f8596s) {
                    aVar2.invoke();
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                EditLibraryComposePage editLibraryComposePage = (EditLibraryComposePage) obj2;
                p058f5.d dVar2 = (p058f5.d) obj;
                int i17 = EditLibraryComposePage.f13797v;
                j.e(dVar2, "it");
                AbstractC0405x.x(editLibraryComposePage.f13798t, null, new O9.y(editLibraryComposePage, dVar2, objArr6 == true ? 1 : 0, 22), 3);
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                BookType bookType3 = (BookType) obj;
                int i18 = LibraryComposePage.f13804x;
                j.e(bookType3, "it");
                p107k5.e libraryPagePresenter = ((LibraryComposePage) obj2).getLibraryPagePresenter();
                libraryPagePresenter.getClass();
                libraryPagePresenter.f19029e.e(bookType3);
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return obj == ((p120l9.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 17:
                p120l9.e eVar3 = (p120l9.e) obj2;
                Map.Entry entry2 = (Map.Entry) obj;
                j.e(entry2, "it");
                StringBuilder sb = new StringBuilder();
                Object key = entry2.getKey();
                sb.append(key == eVar3 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry2.getValue();
                sb.append(value != eVar3 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 18:
                String str3 = (String) obj;
                j.e(str3, "key");
                Object obj4 = ((p251z9.v) obj2).f24886r;
                if (obj4 != null && ((Bundle) obj4).containsKey(str3)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                G g = (G) obj2;
                p173r2.j jVar4 = (p173r2.j) obj;
                j.e(jVar4, "backStackEntry");
                p197u2.d dVar3 = jVar4.f21448y;
                p173r2.v vVar2 = jVar4.f21442s;
                if (vVar2 == null) {
                    vVar2 = null;
                }
                if (vVar2 == null) {
                    return null;
                }
                dVar3.a();
                p173r2.v vVarC = g.c(vVar2);
                if (vVarC == null) {
                    return null;
                }
                return vVarC.equals(vVar2) ? jVar4 : g.b().b(vVarC, vVarC.b(dVar3.a()));
            case 20:
                p077h3.a aVar3 = (p077h3.a) obj;
                j.e(aVar3, "it");
                return Boolean.valueOf(aVar3.f16442c == ((p077h3.a) obj2).f16442c);
            case 21:
                View view = (View) obj;
                int i19 = SearchResultsView.f13960B;
                j.e(view, "view");
                ((SearchResultsView) obj2).f13965w.getClass();
                return Integer.valueOf(RecyclerView.N(view));
            case 22:
                Context context = (Context) obj;
                j.e(context, "it");
                String str4 = ((p250z8.a) obj2).f24856a;
                LinkedHashSet linkedHashSet = W1.j.f9504a;
                j.e(str4, "sharedPreferencesName");
                j.e(linkedHashSet, "keysToMigrate");
                return AbstractC0813f2.K(new V1.c(context, str4, V1.d.f8411a, new B2.d(linkedHashSet, objArr8 == true ? 1 : 0, 11), new W1.i(i11, objArr7 == true ? 1 : 0, i12)));
            default:
                F9.h hVar2 = (F9.h) obj;
                j.e(hVar2, "it");
                ((A) obj2).getClass();
                F9.i iVar = hVar2.f2541a;
                A a9 = hVar2.f2542b;
                if (iVar == null) {
                    return "*";
                }
                A a10 = a9 instanceof A ? a9 : null;
                String strValueOf = (a10 == null || (strA = a10.a(true)) == null) ? String.valueOf(a9) : strA;
                int i20 = z.f24888a[iVar.ordinal()];
                if (i20 == 1) {
                    return strValueOf;
                }
                if (i20 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i20 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new A6.a();
        }
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f1890r = i10;
        this.f1891s = obj;
    }
}
