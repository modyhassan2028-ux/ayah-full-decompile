package p232y;

import D.P;
import android.content.Context;
import p063g1.c;
import p180s0.q;
import p251z9.j;

/* JADX INFO: renamed from: y.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1453g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f24514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f24516d;

    public C1453g(Context context, c cVar, long j, P p10) {
        this.f24513a = context;
        this.f24514b = cVar;
        this.f24515c = j;
        this.f24516d = p10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1453g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C1453g c1453g = (C1453g) obj;
        return j.a(this.f24513a, c1453g.f24513a) && j.a(this.f24514b, c1453g.f24514b) && q.c(this.f24515c, c1453g.f24515c) && j.a(this.f24516d, c1453g.f24516d);
    }

    public final int hashCode() {
        int iHashCode = (this.f24514b.hashCode() + (this.f24513a.hashCode() * 31)) * 31;
        int i10 = q.f21844h;
        return this.f24516d.hashCode() + p123m2.c.o(iHashCode, 31, this.f24515c);
    }
}
