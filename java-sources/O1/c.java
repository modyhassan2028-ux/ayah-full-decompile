package O1;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.SearchView;
import com.ayah.R;
import com.ayah.dao.realm.factory.RealmUtils;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Verse;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.Realm;
import io.realm.RealmResults;
import java.util.ArrayList;
import p017b7.g;
import p110k9.o;
import p120l9.m;
import p124m3.h;
import p151p.W0;
import p168q6.d;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6446a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Filterable f6447b;

    public /* synthetic */ c() {
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.f6446a) {
            case 0:
                return ((W0) ((b) this.f6447b)).c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) throws Throwable {
        Cursor cursorG;
        Realm realm = null;
        Integer numValueOf = null;
        switch (this.f6446a) {
            case 0:
                W0 w9 = (W0) ((b) this.f6447b);
                SearchView searchView = w9.f20612B;
                String string = charSequence == null ? "" : charSequence.toString();
                if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
                    try {
                        cursorG = w9.g(w9.f20613C, string);
                        if (cursorG != null) {
                            cursorG.getCount();
                        } else {
                            cursorG = null;
                        }
                    } catch (RuntimeException e10) {
                        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
                    }
                    break;
                } else {
                    cursorG = null;
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursorG != null) {
                    filterResults.count = cursorG.getCount();
                    filterResults.values = cursorG;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            default:
                d dVar = (d) this.f6447b;
                p114l3.b bVar = dVar.f21324v;
                j.e(charSequence, "constraint");
                String string2 = charSequence.toString();
                p168q6.c cVar = new p168q6.c();
                cVar.f21318f = 0;
                if (string2.length() == 0) {
                    return new Filter.FilterResults();
                }
                try {
                    Realm database = RealmUtils.getDatabase();
                    try {
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(string2));
                        } catch (Throwable th) {
                            th = th;
                            realm = database;
                            if (realm != null) {
                                try {
                                    realm.close();
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                        break;
                    } catch (NumberFormatException unused2) {
                    }
                    ArrayList arrayList = cVar.f21317e;
                    ArrayList arrayList2 = cVar.f21316d;
                    ArrayList arrayList3 = cVar.f21314b;
                    if (numValueOf == null) {
                        RealmResults realmResultsFindAll = database.where(Chapter.class).contains("searchableText", d.j(dVar, string2)).findAll();
                        int size = realmResultsFindAll.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Chapter chapter = (Chapter) realmResultsFindAll.get(i10);
                            j.b(chapter);
                            arrayList3.add(g.b0(chapter, bVar, false));
                        }
                        Object[] objArr = string2.length() < 3;
                        RealmResults realmResultsFindAll2 = database.where(Verse.class).contains("searchableText", d.j(dVar, string2)).findAll();
                        int size2 = realmResultsFindAll2.size();
                        cVar.f21318f = size2;
                        for (int i11 = 0; i11 < size2; i11++) {
                            Verse verse = (Verse) realmResultsFindAll2.get(i11);
                            j.b(verse);
                            arrayList.add(B0.c.y(verse, bVar));
                            if (objArr == false || i11 <= 100) {
                            }
                        }
                    } else if (numValueOf.intValue() > 0) {
                        if (numValueOf.intValue() <= 604) {
                            Page page = (Page) database.where(Page.class).equalTo("number", numValueOf).findFirst();
                            o oVar = p124m3.d.f19547q;
                            j.b(page);
                            cVar.f21313a = AbstractC0813f2.B(page, bVar, false);
                        }
                        if (numValueOf.intValue() <= 114) {
                            Chapter chapter2 = (Chapter) database.where(Chapter.class).equalTo("number", numValueOf).findFirst();
                            j.b(chapter2);
                            arrayList3.add(g.b0(chapter2, bVar, false));
                        }
                        if (numValueOf.intValue() <= 30) {
                            Part part = (Part) database.where(Part.class).equalTo("number", numValueOf).findFirst();
                            j.b(part);
                            cVar.f21315c = u0.r(part, bVar, false);
                        }
                        if (numValueOf.intValue() <= 60) {
                            int iIntValue = (numValueOf.intValue() - 1) * 4;
                            RealmResults realmResultsFindAll3 = database.where(Quarter.class).between("identifier", iIntValue, iIntValue + 3).findAll();
                            int size3 = realmResultsFindAll3.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                Quarter quarter = (Quarter) realmResultsFindAll3.get(i12);
                                j.b(quarter);
                                arrayList2.add(va.g.q(quarter, bVar, true));
                            }
                        }
                    }
                    if (database != null) {
                        try {
                            database.close();
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                    Filter.FilterResults filterResults2 = new Filter.FilterResults();
                    int size4 = cVar.f21313a != null ? 2 : 0;
                    if (arrayList3.size() > 0) {
                        size4 += arrayList3.size() + 1;
                    }
                    if (cVar.f21315c != null) {
                        size4 += 2;
                    }
                    if (arrayList2.size() > 0) {
                        size4 += arrayList2.size() + 1;
                    }
                    if (arrayList.size() > 0) {
                        size4 += arrayList.size() + 1;
                    }
                    filterResults2.count = size4;
                    filterResults2.values = cVar;
                    return filterResults2;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.f6446a) {
            case 0:
                b bVar = (b) this.f6447b;
                Cursor cursor = bVar.f6441t;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    ((W0) bVar).b((Cursor) obj);
                    break;
                }
                break;
            default:
                d dVar = (d) this.f6447b;
                ArrayList arrayList = dVar.f21328z;
                j.e(charSequence, "constraint");
                j.e(filterResults, "filterResults");
                Object obj2 = filterResults.values;
                if (obj2 instanceof p168q6.c) {
                    p168q6.c cVar = (p168q6.c) obj2;
                    ArrayList arrayList2 = cVar.f21316d;
                    ArrayList arrayList3 = cVar.f21317e;
                    ArrayList arrayList4 = cVar.f21314b;
                    ArrayList arrayList5 = new ArrayList();
                    p124m3.d dVar2 = cVar.f21313a;
                    if (dVar2 != null) {
                        p221w6.a aVar = new p221w6.a(R.string.page_count, 1);
                        p156p4.a aVar2 = new p156p4.a();
                        aVar2.f20984b = aVar;
                        arrayList5.add(aVar2);
                        p135n4.a aVar3 = new p135n4.a(dVar2);
                        p156p4.a aVar4 = new p156p4.a();
                        aVar4.f20983a = aVar3;
                        arrayList5.add(aVar4);
                    }
                    int size = arrayList4.size();
                    if (size > 0) {
                        p221w6.a aVar5 = new p221w6.a(R.string.chapter_count, size);
                        p156p4.a aVar6 = new p156p4.a();
                        aVar6.f20984b = aVar5;
                        arrayList5.add(aVar6);
                        for (int i10 = 0; i10 < size; i10++) {
                            p135n4.d dVar3 = new p135n4.d((p124m3.j) m.f0(((p124m3.a) arrayList4.get(i10)).f19536l), true);
                            p156p4.a aVar7 = new p156p4.a();
                            aVar7.f20983a = dVar3;
                            arrayList5.add(aVar7);
                        }
                    }
                    p124m3.g gVar = cVar.f21315c;
                    if (gVar != null) {
                        p221w6.a aVar8 = new p221w6.a(R.string.part_count, 1);
                        p156p4.a aVar9 = new p156p4.a();
                        aVar9.f20984b = aVar8;
                        arrayList5.add(aVar9);
                        p135n4.b bVar2 = new p135n4.b(gVar);
                        p156p4.a aVar10 = new p156p4.a();
                        aVar10.f20983a = bVar2;
                        arrayList5.add(aVar10);
                    }
                    int size2 = arrayList3.size();
                    if (size2 > 0) {
                        p221w6.a aVar11 = new p221w6.a(R.string.verse_count, cVar.f21318f);
                        p156p4.a aVar12 = new p156p4.a();
                        aVar12.f20984b = aVar11;
                        arrayList5.add(aVar12);
                        for (int i11 = 0; i11 < size2; i11++) {
                            p135n4.d dVar4 = new p135n4.d((p124m3.j) arrayList3.get(i11), false);
                            p156p4.a aVar13 = new p156p4.a();
                            aVar13.f20983a = dVar4;
                            arrayList5.add(aVar13);
                        }
                    }
                    int size3 = arrayList2.size();
                    if (size3 > 0) {
                        p221w6.a aVar14 = new p221w6.a(R.string.quarter_count, size3);
                        p156p4.a aVar15 = new p156p4.a();
                        aVar15.f20984b = aVar14;
                        arrayList5.add(aVar15);
                        for (int i12 = 0; i12 < size3; i12++) {
                            p135n4.c cVar2 = new p135n4.c((h) arrayList2.get(i12));
                            p156p4.a aVar16 = new p156p4.a();
                            aVar16.f20983a = cVar2;
                            arrayList5.add(aVar16);
                        }
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList5);
                    dVar.d();
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList.clear();
                    arrayList.addAll(arrayList6);
                    dVar.d();
                }
                break;
        }
    }

    public c(d dVar) {
        this.f6447b = dVar;
    }
}
