package p218w3;

import K9.InterfaceC0402u;
import com.ayah.dao.realm.factory.RealmUtils;
import com.ayah.dao.realm.model.quran.Chapter;
import com.ayah.dao.realm.model.quran.Part;
import com.ayah.dao.realm.model.quran.Quarter;
import com.ayah.dao.realm.model.quran.Verse;
import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;
import java.io.IOException;
import java.util.ArrayList;
import p110k9.a;
import p110k9.y;
import p120l9.n;
import p150o9.c;
import p181s2.o;
import p185s8.u0;
import p241y9.e;
import p251z9.j;
import va.g;
import z3.l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f23677s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, c cVar, int i10) {
        super(2, cVar);
        this.f23676r = i10;
        this.f23677s = jVar;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f23676r) {
            case 0:
                return new i(this.f23677s, cVar, 0);
            case 1:
                return new i(this.f23677s, cVar, 1);
            case 2:
                return new i(this.f23677s, cVar, 2);
            default:
                return new i(this.f23677s, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f23676r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((i) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        l lVar;
        switch (this.f23676r) {
            case 0:
                a.e(obj);
                Realm database = RealmUtils.getDatabase();
                j jVar = this.f23677s;
                try {
                    RealmResults<Part> realmResultsFindAll = database.where(Part.class).sort("number", Sort.ASCENDING).findAll();
                    j.d(realmResultsFindAll, "findAll(...)");
                    ArrayList arrayList = new ArrayList(n.a0(realmResultsFindAll, 10));
                    for (Part part : realmResultsFindAll) {
                        j.b(part);
                        arrayList.add(u0.r(part, jVar.f23678a, true));
                    }
                    database.close();
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        o.e(database, th);
                        throw th2;
                    }
                }
            case 1:
                a.e(obj);
                Realm database2 = RealmUtils.getDatabase();
                j jVar2 = this.f23677s;
                try {
                    RealmResults<Quarter> realmResultsFindAll2 = database2.where(Quarter.class).sort("identifier", Sort.ASCENDING).findAll();
                    j.d(realmResultsFindAll2, "findAll(...)");
                    ArrayList arrayList2 = new ArrayList(n.a0(realmResultsFindAll2, 10));
                    for (Quarter quarter : realmResultsFindAll2) {
                        j.b(quarter);
                        arrayList2.add(g.q(quarter, jVar2.f23678a, true));
                    }
                    database2.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        o.e(database2, th3);
                        throw th4;
                    }
                }
            case 2:
                a.e(obj);
                Realm database3 = RealmUtils.getDatabase();
                j jVar3 = this.f23677s;
                try {
                    RealmResults<Chapter> realmResultsFindAll3 = database3.where(Chapter.class).sort("number", Sort.ASCENDING).findAll();
                    j.d(realmResultsFindAll3, "findAll(...)");
                    ArrayList arrayList3 = new ArrayList(n.a0(realmResultsFindAll3, 10));
                    for (Chapter chapter : realmResultsFindAll3) {
                        j.b(chapter);
                        arrayList3.add(p017b7.g.b0(chapter, jVar3.f23678a, true));
                    }
                    database3.close();
                    return arrayList3;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        o.e(database3, th5);
                        throw th6;
                    }
                }
            default:
                a.e(obj);
                Realm database4 = RealmUtils.getDatabase();
                j jVar4 = this.f23677s;
                try {
                    RealmResults<Chapter> realmResultsFindAll4 = database4.where(Chapter.class).sort("number", Sort.ASCENDING).findAll();
                    j.d(realmResultsFindAll4, "findAll(...)");
                    ArrayList arrayList4 = new ArrayList();
                    for (Chapter chapter2 : realmResultsFindAll4) {
                        j.b(chapter2);
                        p124m3.a aVarB0 = p017b7.g.b0(chapter2, jVar4.f23678a, true);
                        Verse verseLast = chapter2.getVerses().last();
                        if (verseLast != null) {
                            p124m3.j jVarY = B0.c.y(verseLast, jVar4.f23678a);
                            lVar = new l(aVarB0, jVarY, jVarY.c());
                        } else {
                            lVar = null;
                        }
                        if (lVar != null) {
                            arrayList4.add(lVar);
                        }
                        break;
                    }
                    database4.close();
                    return arrayList4;
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        o.e(database4, th7);
                        throw th8;
                    }
                }
        }
    }
}
