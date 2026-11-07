package p127m6;

import G.V;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.widget.Button;
import android.widget.Spinner;
import com.ayah.dao.realm.factory.RealmUtils;
import com.ayah.dao.realm.model.quran.Verse;
import com.ayah.share.ShareActivity;
import i7.B;
import io.realm.Realm;
import io.realm.RealmResults;
import java.io.IOException;
import java.util.ArrayList;
import p110k9.a;
import p110k9.y;
import p120l9.n;
import p150o9.c;
import p151p.C1256n;
import p181s2.o;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19623r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f19625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f19627v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, int i12, C1256n c1256n, c cVar) {
        super(2, cVar);
        this.f19624s = i10;
        this.f19625t = i11;
        this.f19626u = i12;
        this.f19627v = c1256n;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f19623r) {
            case 0:
                return new b((ShareActivity) this.f19627v, this.f19625t, this.f19626u, cVar);
            default:
                return new b(this.f19624s, this.f19625t, this.f19626u, (C1256n) this.f19627v, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f19623r) {
            case 0:
                break;
        }
        return ((b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        int i10 = this.f19623r;
        Object obj2 = this.f19627v;
        int i11 = this.f19626u;
        int i12 = this.f19625t;
        switch (i10) {
            case 0:
                ShareActivity shareActivity = (ShareActivity) obj2;
                int i13 = this.f19624s;
                c cVar = null;
                if (i13 == 0) {
                    a.e(obj);
                    R9.e eVar = H.f5322a;
                    d dVar = d.f7436t;
                    V v10 = new V(i11, 4, shareActivity, cVar);
                    this.f19624s = 1;
                    obj = AbstractC0405x.I(dVar, v10, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                p124m3.a aVar2 = (p124m3.a) obj;
                shareActivity.f13929e0 = aVar2;
                shareActivity.f13928d0 = aVar2.f19536l;
                int i14 = aVar2.f19537m;
                Spinner spinner = shareActivity.f13925a0;
                if (spinner == null) {
                    j.k("fromSpinner");
                    throw null;
                }
                ShareActivity.s(shareActivity, spinner, Math.max(1, i12 - 30), i12, i12);
                Spinner spinner2 = shareActivity.f13924Z;
                if (spinner2 == null) {
                    j.k("toSpinner");
                    throw null;
                }
                ShareActivity.s(shareActivity, spinner2, i12, Math.min(i12 + 30, i14), Math.min(i12, i14));
                Spinner spinner3 = shareActivity.f13925a0;
                if (spinner3 == null) {
                    j.k("fromSpinner");
                    throw null;
                }
                spinner3.setOnItemSelectedListener(new a(shareActivity, i14));
                Button button = shareActivity.f13926b0;
                if (button != null) {
                    button.setEnabled(true);
                    return y.f19095a;
                }
                j.k("shareButton");
                throw null;
            default:
                a.e(obj);
                Realm database = RealmUtils.getDatabase();
                C1256n c1256n = (C1256n) obj2;
                try {
                    RealmResults<Verse> realmResultsFindAll = database.where(Verse.class).equalTo("chapter.number", new Integer(this.f19624s)).between("number", i12, i11).findAll();
                    j.b(realmResultsFindAll);
                    ArrayList arrayList = new ArrayList(n.a0(realmResultsFindAll, 10));
                    for (Verse verse : realmResultsFindAll) {
                        j.b(verse);
                        arrayList.add(B0.c.y(verse, (B) c1256n.f20747s));
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShareActivity shareActivity, int i10, int i11, c cVar) {
        super(2, cVar);
        this.f19627v = shareActivity;
        this.f19625t = i10;
        this.f19626u = i11;
    }
}
