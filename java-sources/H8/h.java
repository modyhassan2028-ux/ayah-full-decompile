package H8;

import G9.m;
import X.L;
import Z.X;
import android.os.Bundle;
import android.support.v4.media.session.r;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p173r2.A;
import p173r2.C1287g;
import p173r2.C1288h;
import p173r2.E;
import p173r2.v;
import p173r2.y;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3602u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3603v;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3599r = i10;
        this.f3600s = obj;
        this.f3601t = obj2;
        this.f3602u = obj3;
        this.f3603v = obj4;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f3599r) {
            case 0:
                j jVar = (j) this.f3600s;
                String str = (String) this.f3601t;
                String str2 = (String) this.f3602u;
                X1.e eVar = (X1.e) this.f3603v;
                X1.b bVar = (X1.b) obj;
                jVar.getClass();
                X1.e eVar2 = j.f3608d;
                if (((String) s.f(bVar, eVar2, "")).equals(str)) {
                    X1.e eVarE = jVar.e(bVar, str);
                    if (eVarE == null || eVarE.f9850a.equals(str2)) {
                        return null;
                    }
                    synchronized (jVar) {
                        jVar.f(bVar, str);
                        HashSet hashSet = new HashSet((Collection) s.f(bVar, eVar, new HashSet()));
                        hashSet.add(str);
                        bVar.f(eVar, hashSet);
                    }
                    return null;
                }
                X1.e eVar3 = j.f3607c;
                long jLongValue = ((Long) s.f(bVar, eVar3, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    jLongValue = jVar.a(bVar);
                }
                HashSet hashSet2 = new HashSet((Collection) s.f(bVar, eVar, new HashSet()));
                hashSet2.add(str);
                bVar.f(eVar, hashSet2);
                bVar.f(eVar3, Long.valueOf(jLongValue + 1));
                bVar.f(eVar2, str);
                return null;
            case 1:
                X x9 = (X) this.f3600s;
                A a9 = (A) this.f3601t;
                p241y9.e eVar4 = (p241y9.e) this.f3602u;
                p241y9.e eVar5 = (p241y9.e) this.f3603v;
                y yVar = (y) obj;
                p251z9.j.e(yVar, "$this$NavHost");
                s.d(yVar, "khatmah/new", null, new p074h0.d(-2080494710, new Y4.c(0, x9, a9), true), 254);
                s.d(yVar, "khatmah/new/meanings", null, new p074h0.d(-124436493, new Y4.c(1, x9, a9), true), 254);
                s.d(yVar, "khatmah/new/quarters", null, new p074h0.d(-2080583406, new Y4.c(2, x9, a9), true), 254);
                s.d(yVar, "khatmah/new/{type}/startFrom", AbstractC0813f2.K(new C1287g(new C1288h(E.f21430d))), new p074h0.d(258236977, new H4.b(x9, eVar4, eVar5, 2), true), 252);
                break;
            case 2:
                List list = (List) this.f3600s;
                Ga.A a10 = (Ga.A) this.f3601t;
                p241y9.c cVar = (p241y9.c) this.f3602u;
                p243z0.a aVar = (p243z0.a) this.f3603v;
                F.h hVar = (F.h) obj;
                p251z9.j.e(hVar, "$this$LazyColumn");
                m mVar = new m(18);
                hVar.f2052a.a(list.size(), new r(new L(9, mVar, list), new p026c5.e(1, list), new p074h0.d(-632812321, new p067g5.e(list, a10, cVar, aVar), true), 6));
                break;
            default:
                p251z9.r rVar = (p251z9.r) this.f3600s;
                p197u2.h hVar2 = (p197u2.h) this.f3601t;
                v vVar = (v) this.f3602u;
                Bundle bundle = (Bundle) this.f3603v;
                p173r2.j jVar2 = (p173r2.j) obj;
                p251z9.j.e(jVar2, "it");
                rVar.f24882r = true;
                hVar2.a(vVar, bundle, jVar2, p120l9.r.f19440r);
                break;
        }
        return p110k9.y.f19095a;
    }
}
