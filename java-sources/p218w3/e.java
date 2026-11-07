package p218w3;

import K9.InterfaceC0402u;
import com.ayah.dao.realm.factory.RealmUtils;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.Verse;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.Realm;
import io.realm.RealmQuery;
import java.io.IOException;
import p110k9.a;
import p110k9.o;
import p110k9.y;
import p124m3.d;
import p150o9.c;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f23663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f23664t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, f fVar, c cVar, int i11) {
        super(2, cVar);
        this.f23662r = i11;
        this.f23663s = i10;
        this.f23664t = fVar;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f23662r) {
            case 0:
                return new e(this.f23663s, this.f23664t, cVar, 0);
            default:
                return new e(this.f23663s, this.f23664t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f23662r) {
            case 0:
                break;
        }
        return ((e) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        int i10 = this.f23662r;
        f fVar = this.f23664t;
        int i11 = this.f23663s;
        switch (i10) {
            case 0:
                a.e(obj);
                Realm database = RealmUtils.getDatabase();
                try {
                    Page page = (Page) database.where(Page.class).equalTo("number", new Integer(i11)).findFirst();
                    if (page != null) {
                        o oVar = d.f19547q;
                        d dVarB = AbstractC0813f2.B(page, fVar.f23665a, false);
                        database.close();
                        return dVarB;
                    }
                    throw new IllegalArgumentException("loadPage: page " + i11 + " not found");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p181s2.o.e(database, th);
                        throw th2;
                    }
                }
            default:
                a.e(obj);
                Realm database2 = RealmUtils.getDatabase();
                try {
                    Object objFindFirst = database2.where(Verse.class).equalTo("verseID", new Integer(i11)).findFirst();
                    j.b(objFindFirst);
                    Page page1441 = ((Verse) objFindFirst).getPage1441();
                    RealmQuery realmQueryWhere = database2.where(Page.class);
                    j.b(page1441);
                    Object objFindFirst2 = realmQueryWhere.equalTo("number", new Long(page1441.getNumber())).findFirst();
                    j.b(objFindFirst2);
                    o oVar2 = d.f19547q;
                    d dVarB2 = AbstractC0813f2.B((Page) objFindFirst2, fVar.f23665a, false);
                    database2.close();
                    return dVarB2;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        p181s2.o.e(database2, th3);
                        throw th4;
                    }
                }
        }
    }
}
