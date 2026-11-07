package P5;

import K9.AbstractC0405x;
import K9.C0401t;
import N9.AbstractC0419l;
import N9.k0;
import java.util.ArrayList;
import java.util.List;
import p085i0.n;
import p120l9.m;
import p120l9.r;
import p144o3.h;
import p185s8.u0;
import p218w3.j;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f6703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p144o3.a f6705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p155p3.a f6706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f6707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P9.d f6708f;
    public final k0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public P9.d f6709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M9.e f6710i;

    public g(j jVar, h hVar, p144o3.a aVar, p155p3.a aVar2, n nVar) {
        p251z9.j.e(jVar, "suraModel");
        p251z9.j.e(hVar, "reciterModel");
        p251z9.j.e(aVar, "audioPlaybackModel");
        p251z9.j.e(aVar2, "downloadingPlaybackAudioModel");
        this.f6703a = jVar;
        this.f6704b = hVar;
        this.f6705c = aVar;
        this.f6706d = aVar2;
        this.f6707e = nVar;
        this.f6708f = AbstractC0405x.z(AbstractC0405x.d(), new C0401t("QariAudioScope"));
        this.g = AbstractC0419l.c(r.f19440r);
        this.f6709h = AbstractC0405x.z(AbstractC0405x.d(), new C0401t("QariAudioDownloadScope"));
        this.f6710i = u0.a(0, 7, null);
    }

    public static final void a(g gVar, p065g3.a aVar, int i10, i6.g gVar2) {
        p088i3.f fVarA;
        k0 k0Var = gVar.g;
        List<p088i3.f> list = (List) k0Var.getValue();
        p088i3.f fVar = (p088i3.f) m.g0(list);
        if (p251z9.j.a(fVar != null ? fVar.f16745a.f16273a : null, aVar.f16273a)) {
            p088i3.f fVar2 = (p088i3.f) list.get(i10 - 1);
            if ((gVar2 instanceof i6.a) || (gVar2 instanceof i6.d)) {
                fVarA = p088i3.f.a(fVar2, p088i3.d.f16740f);
            } else if (gVar2 instanceof i6.b) {
                fVarA = p088i3.f.a(fVar2, p088i3.c.f16739f);
            } else if (gVar2 instanceof i6.c) {
                i6.c cVar = (i6.c) gVar2;
                fVarA = p088i3.f.a(fVar2, new p088i3.a((int) ((cVar.f16767c * 100.0f) / (cVar.f16768d * 1.0f))));
            } else if (gVar2 instanceof i6.f) {
                fVarA = p088i3.f.a(fVar2, new p088i3.a(0));
            } else {
                if (!(gVar2 instanceof i6.e)) {
                    throw new A6.a();
                }
                fVarA = p088i3.f.a(fVar2, p088i3.b.f16738f);
            }
            ArrayList arrayList = new ArrayList(p120l9.n.a0(list, 10));
            for (p088i3.f fVar3 : list) {
                if (fVar3.f16746b == i10) {
                    fVar3 = fVarA;
                }
                arrayList.add(fVar3);
            }
            k0Var.n(null, arrayList);
        }
    }

    public final boolean b(p065g3.a aVar, int i10) {
        p251z9.j.e(aVar, "reciterDao");
        String str = aVar.f16273a;
        p165q3.b bVarA = this.f6705c.a();
        i6.g gVar = (i6.g) this.f6706d.f20979b.f6130r.getValue();
        p155p3.b bVar = gVar != null ? (p155p3.b) gVar.b() : null;
        if (p251z9.j.a(bVarA != null ? bVarA.f21283a : null, str) && bVarA.f21284b == i10) {
            return true;
        }
        if (bVar != null && p251z9.j.a(bVar.f20981b.f16273a, str) && bVar.f20982c == i10) {
            return (gVar instanceof i6.f) || (gVar instanceof i6.c) || (gVar instanceof i6.e);
        }
        return false;
    }
}
