package com.google.firebase.sessions;

import J8.e;
import K9.AbstractC0399q;
import Q8.AbstractC0473u;
import Q8.C0462i;
import Q8.C0466m;
import Q8.C0468o;
import Q8.C0471s;
import Q8.C0472t;
import Q8.C0475w;
import Q8.C0476x;
import Q8.M;
import Q8.W;
import Q8.Y;
import Q8.g0;
import Q8.r;
import S8.c;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p050e8.f;
import p091i8.a;
import p091i8.b;
import p100j8.p;
import p120l9.l;
import p150o9.h;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C0475w Companion = new C0475w();
    private static final p appContext = p.a(Context.class);
    private static final p firebaseApp = p.a(f.class);
    private static final p firebaseInstallationsApi = p.a(e.class);
    private static final p backgroundDispatcher = new p(a.class, AbstractC0399q.class);
    private static final p blockingDispatcher = new p(b.class, AbstractC0399q.class);
    private static final p transportFactory = p.a(B6.e.class);
    private static final p firebaseSessionsComponent = p.a(r.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0468o getComponents$lambda$0(p100j8.b bVar) {
        return (C0468o) ((C0462i) ((r) bVar.e(firebaseSessionsComponent))).f7023p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r getComponents$lambda$1(p100j8.b bVar) {
        Object objE = bVar.e(appContext);
        j.d(objE, "get(...)");
        Object objE2 = bVar.e(backgroundDispatcher);
        j.d(objE2, "get(...)");
        Object objE3 = bVar.e(blockingDispatcher);
        j.d(objE3, "get(...)");
        Object objE4 = bVar.e(firebaseApp);
        j.d(objE4, "get(...)");
        Object objE5 = bVar.e(firebaseInstallationsApi);
        j.d(objE5, "get(...)");
        I8.b bVarI = bVar.i(transportFactory);
        j.d(bVarI, "getProvider(...)");
        C0462i c0462i = new C0462i();
        c0462i.f7010a = M.a((f) objE4);
        M mA = M.a((Context) objE);
        c0462i.f7011b = mA;
        c0462i.f7012c = S8.a.a(new C0466m(mA, 2));
        c0462i.f7013d = S8.a.a(AbstractC0473u.f7054a);
        c0462i.f7014e = M.a((e) objE5);
        c0462i.f7015f = S8.a.a(new C0466m(c0462i.f7010a, 1));
        M mA2 = M.a((h) objE3);
        c0462i.g = mA2;
        c0462i.f7016h = S8.a.a(new C0471s(c0462i.f7015f, mA2));
        c0462i.f7017i = M.a((h) objE2);
        c0462i.j = S8.a.a(new Y(c0462i.f7012c, S8.a.a(new W(c0462i.f7013d, c0462i.f7014e, c0462i.f7015f, c0462i.f7016h, S8.a.a(new C0472t(c0462i.f7017i, c0462i.f7013d, S8.a.a(new C0471s(c0462i.f7011b, c0462i.g, 0)))))), 1));
        c cVarA = S8.a.a(AbstractC0473u.f7055b);
        c0462i.f7018k = cVarA;
        c0462i.f7019l = S8.a.a(new Y(c0462i.f7013d, cVarA, 0));
        int i10 = 0;
        c0462i.f7020m = S8.a.a(new W(c0462i.f7010a, c0462i.f7014e, c0462i.j, S8.a.a(new C0466m(M.a(bVarI), i10)), c0462i.f7017i));
        c0462i.f7021n = S8.a.a(new C0472t(c0462i.f7011b, c0462i.g, S8.a.a(new M(i10, c0462i.f7019l))));
        c cVarA2 = S8.a.a(new g0(c0462i.j, c0462i.f7019l, c0462i.f7020m, c0462i.f7013d, c0462i.f7021n, S8.a.a(new C0471s(c0462i.f7011b, c0462i.f7018k, 1)), c0462i.f7017i));
        c0462i.f7022o = cVarA2;
        c0462i.f7023p = S8.a.a(new C0476x(c0462i.f7010a, c0462i.j, c0462i.f7017i, S8.a.a(new M(1, cVarA2))));
        return c0462i;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p100j8.a> getComponents() {
        p071g9.a aVarB = p100j8.a.b(C0468o.class);
        aVarB.f16337c = LIBRARY_NAME;
        aVarB.a(p100j8.h.a(firebaseSessionsComponent));
        aVarB.f16340f = new J1.c(22);
        aVarB.e();
        p100j8.a aVarB2 = aVarB.b();
        p071g9.a aVarB3 = p100j8.a.b(r.class);
        aVarB3.f16337c = "fire-sessions-component";
        aVarB3.a(p100j8.h.a(appContext));
        aVarB3.a(p100j8.h.a(backgroundDispatcher));
        aVarB3.a(p100j8.h.a(blockingDispatcher));
        aVarB3.a(p100j8.h.a(firebaseApp));
        aVarB3.a(p100j8.h.a(firebaseInstallationsApi));
        aVarB3.a(new p100j8.h(transportFactory, 1, 1));
        aVarB3.f16340f = new J1.c(23);
        return l.S(new p100j8.a[]{aVarB2, aVarB3.b(), g.l(LIBRARY_NAME, "3.0.0")});
    }
}
