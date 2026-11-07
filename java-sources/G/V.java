package G;

import A.C0028k0;
import E2.AbstractC0114c;
import F.C0154c;
import K9.InterfaceC0402u;
import N9.k0;
import com.ayah.MainActivity;
import com.ayah.dao.realm.factory.RealmUtils;
import com.ayah.dao.realm.model.quran.Page;
import com.ayah.dao.realm.model.quran.Verse;
import com.ayah.feature.reciterlist.RecitersActivity;
import com.ayah.share.ShareActivity;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.Realm;
import io.realm.RealmResults;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p151p.C1256n;

/* JADX INFO: loaded from: classes.dex */
public final class V extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2638u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i10, int i11, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f2635r = i11;
        this.f2638u = obj;
        this.f2637t = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2635r) {
            case 0:
                return new V(this.f2637t, 0, (W) this.f2638u, cVar);
            case 1:
                return new V(this.f2637t, 1, (RecitersActivity) this.f2638u, cVar);
            case 2:
                return new V(this.f2637t, 2, (MainActivity) this.f2638u, cVar);
            case 3:
                return new V(this.f2637t, 3, (p074h0.i) this.f2638u, cVar);
            case 4:
                return new V(this.f2637t, 4, (ShareActivity) this.f2638u, cVar);
            case 5:
                return new V(this.f2636s, this.f2637t, (C1256n) this.f2638u, cVar, 5);
            case 6:
                return new V(this.f2636s, this.f2637t, (p218w3.f) this.f2638u, cVar, 6);
            default:
                return new V(this.f2637t, 7, (p237y4.c) this.f2638u, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f2635r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((V) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        int i10 = this.f2635r;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        int i11 = this.f2637t;
        Object obj2 = this.f2638u;
        switch (i10) {
            case 0:
                int i12 = this.f2636s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                C0154c c0154c = ((W) obj2).f2640G;
                this.f2636s = 1;
                Object objI = F.A.i(c0154c.f2044a, i11, this);
                if (objI != aVar) {
                    objI = yVar;
                }
                return objI == aVar ? aVar : yVar;
            case 1:
                RecitersActivity recitersActivity = (RecitersActivity) obj2;
                int i13 = this.f2636s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    L5.c cVar = recitersActivity.f13856Y;
                    if (cVar == null) {
                        p251z9.j.k("recitersPresenter");
                        throw null;
                    }
                    boolean zB = p125m4.b.b();
                    String strValueOf = String.valueOf(recitersActivity.getExternalFilesDir(null));
                    this.f2636s = 1;
                    obj = cVar.K(zB, strValueOf, i11, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                List list = (List) obj;
                J5.a aVar2 = recitersActivity.f13855X;
                if (aVar2 == null) {
                    p251z9.j.k("adapter");
                    throw null;
                }
                p251z9.j.e(list, "reciters");
                ArrayList arrayList = aVar2.f4333z;
                E2.r rVarE = AbstractC0114c.e(new p125m4.a(arrayList, list));
                arrayList.clear();
                arrayList.addAll(list);
                rVarE.a(new p248z6.c(3, aVar2));
                return yVar;
            case 2:
                int i14 = this.f2636s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                p218w3.a aVar3 = ((MainActivity) obj2).f13623A0;
                if (aVar3 == null) {
                    p251z9.j.k("currentPageModel");
                    throw null;
                }
                int i15 = i11 + 1;
                this.f2636s = 1;
                k0 k0Var = aVar3.f23646b;
                Integer num = new Integer(i15);
                k0Var.getClass();
                k0Var.n(null, num);
                Object objT = F9.n.t(aVar3.f23645a.f4307a, new C0028k0(i15, null), this);
                if (objT != aVar) {
                    objT = yVar;
                }
                if (objT != aVar) {
                    objT = yVar;
                }
                return objT == aVar ? aVar : yVar;
            case 3:
                int i16 = this.f2636s;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                p198u3.f fVar = (p198u3.f) ((p074h0.i) obj2).f16423t;
                this.f2636s = 1;
                Object objR = B9.a.R(fVar.f22895a.f497a, false, true, new A3.b(i11, 2), this);
                if (objR != aVar) {
                    objR = yVar;
                }
                if (objR != aVar) {
                    objR = yVar;
                }
                return objR == aVar ? aVar : yVar;
            case 4:
                int i17 = this.f2636s;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                Z0.B b5 = ((ShareActivity) obj2).f13932h0;
                if (b5 == null) {
                    p251z9.j.k("sharePresenter");
                    throw null;
                }
                this.f2636s = 1;
                Object objB = ((p218w3.j) b5.f10875s).b(i11, this);
                return objB == aVar ? aVar : objB;
            case 5:
                p110k9.a.e(obj);
                Realm database = RealmUtils.getDatabase();
                C1256n c1256n = (C1256n) obj2;
                try {
                    RealmResults<Verse> realmResultsFindAll = database.where(Verse.class).between("verseID", this.f2636s, i11).findAll();
                    p251z9.j.d(realmResultsFindAll, "findAll(...)");
                    ArrayList arrayList2 = new ArrayList(p120l9.n.a0(realmResultsFindAll, 10));
                    for (Verse verse : realmResultsFindAll) {
                        p251z9.j.b(verse);
                        arrayList2.add(B0.c.y(verse, (i7.B) c1256n.f20747s));
                    }
                    database.close();
                    return arrayList2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p181s2.o.e(database, th);
                        throw th2;
                    }
                }
            case 6:
                p110k9.a.e(obj);
                Realm database2 = RealmUtils.getDatabase();
                int i18 = this.f2636s;
                p218w3.f fVar2 = (p218w3.f) obj2;
                try {
                    RealmResults<Page> realmResultsFindAll2 = database2.where(Page.class).greaterThanOrEqualTo("number", i18).lessThanOrEqualTo("number", i18 + i11).findAll();
                    p251z9.j.b(realmResultsFindAll2);
                    ArrayList arrayList3 = new ArrayList(p120l9.n.a0(realmResultsFindAll2, 10));
                    for (Page page : realmResultsFindAll2) {
                        p110k9.o oVar = p124m3.d.f19547q;
                        p251z9.j.b(page);
                        arrayList3.add(AbstractC0813f2.B(page, fVar2.f23665a, true));
                    }
                    database2.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        p181s2.o.e(database2, th3);
                        throw th4;
                    }
                }
            default:
                int i19 = this.f2636s;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                p218w3.j jVar = ((p237y4.c) obj2).f24638a;
                this.f2636s = 1;
                Object objB2 = jVar.b(i11, this);
                return objB2 == aVar ? aVar : objB2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i10, int i11, Object obj, p150o9.c cVar, int i12) {
        super(2, cVar);
        this.f2635r = i12;
        this.f2636s = i10;
        this.f2637t = i11;
        this.f2638u = obj;
    }
}
