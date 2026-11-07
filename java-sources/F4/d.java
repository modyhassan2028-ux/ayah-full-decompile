package F4;

import E4.p;
import E4.r;
import E4.s;
import E4.t;
import E4.u;
import K9.AbstractC0405x;
import K9.C0401t;
import K9.H;
import K9.p0;
import N9.AbstractC0419l;
import N9.T;
import N9.Y;
import N9.k0;
import java.util.List;
import p110k9.y;
import p198u3.l;
import p207v2.C1381t;
import p207v2.L;
import p218w3.i;
import p218w3.j;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p198u3.d f2375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p198u3.e f2376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f2377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p198u3.f f2378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p189t3.b f2379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f2380f;
    public final f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O3.d f2381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f2382i;
    public final p144o3.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p144o3.a f2383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final P9.d f2384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f2385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k0 f2386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y f2387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final T f2388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C4.c f2389q;

    public d(p198u3.d dVar, p198u3.e eVar, j jVar, p198u3.f fVar, p189t3.b bVar, f fVar2, f fVar3, O3.d dVar2, l lVar, p144o3.e eVar2, p144o3.a aVar) {
        p251z9.j.e(dVar, "bookmarksModel");
        p251z9.j.e(eVar, "favoritesModel");
        p251z9.j.e(jVar, "suraModel");
        p251z9.j.e(fVar, "notesModel");
        p251z9.j.e(bVar, "khatmahModel");
        p251z9.j.e(lVar, "suggestedBookmarkModel");
        p251z9.j.e(eVar2, "playbackRequestModel");
        p251z9.j.e(aVar, "audioPlaybackModel");
        this.f2375a = dVar;
        this.f2376b = eVar;
        this.f2377c = jVar;
        this.f2378d = fVar;
        this.f2379e = bVar;
        this.f2380f = fVar2;
        this.g = fVar3;
        this.f2381h = dVar2;
        this.f2382i = lVar;
        this.j = eVar2;
        this.f2383k = aVar;
        p0 p0VarE = AbstractC0405x.e();
        R9.e eVar3 = H.f5322a;
        this.f2384l = AbstractC0405x.b(Y2.a.Z(p0VarE, R9.d.f7436t).L(new C0401t("AyahMenuPresenter")));
        k0 k0VarC = AbstractC0419l.c(null);
        this.f2386n = k0VarC;
        Y yB = AbstractC0419l.b(1, 1, M9.a.f5831s);
        this.f2387o = yB;
        this.f2388p = new T(yB);
        this.f2389q = new C4.c(k0VarC, 11);
    }

    public static N3.a a(p077h3.e eVar) {
        if (eVar instanceof p077h3.c) {
            p077h3.c cVar = (p077h3.c) eVar;
            p124m3.j jVar = cVar.f16447b;
            p077h3.a aVar = cVar.f16446a;
            return new N3.b(jVar.f19585a, jVar.f19595m, jVar.f19586b, jVar.c(), aVar.f16441b, p017b7.g.K(aVar.f16442c), aVar.f16443d);
        }
        if (!(eVar instanceof p077h3.d)) {
            throw new A6.a();
        }
        p077h3.d dVar = (p077h3.d) eVar;
        return new N3.c(dVar.f16448a, p017b7.g.K(dVar.f16449b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p124m3.j jVar, u uVar, q9.c cVar) {
        c cVar2;
        k0 k0Var;
        t tVar;
        p124m3.j jVar2;
        k0 k0Var2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f2374v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f2374v = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objI = cVar2.f2372t;
        int i11 = cVar2.f2374v;
        final int i12 = 1;
        p150o9.c cVar3 = null;
        if (i11 == 0) {
            p110k9.a.e(objI);
            int iOrdinal = uVar.ordinal();
            final int i13 = 0;
            k0Var = this.f2386n;
            if (iOrdinal == 0) {
                int i14 = jVar.f19585a;
                p017b7.d dVar = new p017b7.d(50);
                tVar = new t(jVar, new p(new C1381t(new L(new p241y9.a(this) { // from class: F4.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ d f2358s;

                    {
                        this.f2358s = this;
                    }

                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return this.f2358s.f2380f;
                            default:
                                return this.f2358s.g;
                        }
                    }
                }, null, 0), Integer.valueOf(i14), dVar).f23297f));
            } else if (iOrdinal == 1) {
                int iC = jVar.c();
                p017b7.d dVar2 = new p017b7.d(25);
                tVar = new t(jVar, new r(new C1381t(new L(new p241y9.a(this) { // from class: F4.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ d f2358s;

                    {
                        this.f2358s = this;
                    }

                    @Override // p241y9.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return this.f2358s.f2380f;
                            default:
                                return this.f2358s.g;
                        }
                    }
                }, null, 0), Integer.valueOf(iC), dVar2).f23297f));
            } else {
                if (iOrdinal != 2) {
                    throw new A6.a();
                }
                cVar2.f2370r = jVar;
                cVar2.f2371s = k0Var;
                cVar2.f2374v = 1;
                j jVar3 = this.f2377c;
                jVar3.getClass();
                R9.e eVar = H.f5322a;
                objI = AbstractC0405x.I(R9.d.f7436t, new i(jVar3, cVar3, 3), cVar2);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objI == aVar) {
                    return aVar;
                }
                jVar2 = jVar;
                k0Var2 = k0Var;
            }
            k0Var.getClass();
            k0Var.n(null, tVar);
            return y.f19095a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k0Var2 = cVar2.f2371s;
        jVar2 = cVar2.f2370r;
        p110k9.a.e(objI);
        List list = (List) objI;
        tVar = new t(jVar2, new s(list.subList(jVar2.f19595m - 1, list.size())));
        k0Var = k0Var2;
        k0Var.getClass();
        k0Var.n(null, tVar);
        return y.f19095a;
    }
}
