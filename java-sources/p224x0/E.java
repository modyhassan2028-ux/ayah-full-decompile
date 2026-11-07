package p224x0;

import B9.a;
import Z.C0672b;
import Z.C0681f0;
import android.graphics.Bitmap;
import p063g1.c;
import p063g1.m;
import p171r0.i;
import p180s0.AbstractC1298g;
import p180s0.C1294c;
import p180s0.C1297f;
import p180s0.C1303l;
import p180s0.F;
import p180s0.o;
import p180s0.q;
import p196u0.b;
import p196u0.d;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1439c f24134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1437a f24137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f24138f;
    public final C0681f0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1303l f24139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0681f0 f24140i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f24141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f24142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D f24143m;

    public E(C1439c c1439c) {
        this.f24134b = c1439c;
        c1439c.f24187i = new D(this, 0);
        this.f24135c = "";
        this.f24136d = true;
        this.f24137e = new C1437a();
        this.f24138f = C1443g.f24225t;
        this.g = C0672b.r(null);
        this.f24140i = C0672b.r(new i(0L));
        this.j = 9205357640488583168L;
        this.f24141k = 1.0f;
        this.f24142l = 1.0f;
        this.f24143m = new D(this, 1);
    }

    @Override // p224x0.C
    public final void a(d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    public final void e(d dVar, float f3, C1303l c1303l) {
        int i10;
        C1303l c1303l2;
        C1297f c1297fF;
        char c10;
        long j;
        int iD;
        int i11;
        int i12;
        C1303l c1303l3 = c1303l;
        C1439c c1439c = this.f24134b;
        boolean z10 = c1439c.f24183d;
        C0681f0 c0681f0 = this.g;
        if (!z10 || c1439c.f24184e == 16) {
            i10 = 0;
        } else {
            C1303l c1303l4 = (C1303l) c0681f0.getValue();
            int i13 = G.f24154a;
            if (!(c1303l4 instanceof C1303l) ? c1303l4 == null : (i12 = c1303l4.f21836c) == 5 || i12 == 3) {
                i10 = 0;
            } else if (!(c1303l3 instanceof C1303l) ? c1303l3 == null : (i11 = c1303l3.f21836c) == 5 || i11 == 3) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        boolean z11 = this.f24136d;
        C1437a c1437a = this.f24137e;
        if (z11 || !i.a(this.j, dVar.b())) {
            if (i10 == 1) {
                c1303l2 = new C1303l(c1439c.f24184e, 5);
            } else {
                c1303l2 = null;
            }
            this.f24139h = c1303l2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32));
            C0681f0 c0681f1 = this.f24140i;
            this.f24141k = fIntBitsToFloat / Float.intBitsToFloat((int) (((i) c0681f1.getValue()).f21400a >> 32));
            this.f24142l = Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) / Float.intBitsToFloat((int) (((i) c0681f1.getValue()).f21400a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() & 4294967295L))))) & 4294967295L);
            m layoutDirection = dVar.getLayoutDirection();
            c1297fF = c1437a.f24174a;
            C1294c c1294cA = c1437a.f24175b;
            if (c1297fF != null || c1294cA == null) {
                c10 = ' ';
                j = 4294967295L;
            } else {
                int i14 = (int) (jCeil >> 32);
                Bitmap bitmap = c1297fF.f21826a;
                c10 = ' ';
                j = 4294967295L;
                if (i14 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c1437a.f24177d != i10) {
                }
                c1437a.f24176c = jCeil;
                b bVar = c1437a.f24178e;
                long jD0 = a.d0(jCeil);
                p196u0.a aVar = bVar.f22794r;
                c cVar = aVar.f22790a;
                m mVar = aVar.f22791b;
                o oVar = aVar.f22792c;
                C1294c c1294c = c1294cA;
                long j10 = aVar.f22793d;
                aVar.f22790a = dVar;
                aVar.f22791b = layoutDirection;
                aVar.f22792c = c1294c;
                aVar.f22793d = jD0;
                c1294c.q();
                p123m2.c.k(bVar, q.f21839b, 0L, 0L, 62);
                this.f24143m.e(bVar);
                c1294c.n();
                p196u0.a aVar2 = bVar.f22794r;
                aVar2.f22790a = cVar;
                aVar2.f22791b = mVar;
                aVar2.f22792c = oVar;
                aVar2.f22793d = j10;
                c1297fF.f21826a.prepareToDraw();
                this.f24136d = false;
                this.j = dVar.b();
            }
            c1297fF = F.f((int) (jCeil >> c10), (int) (jCeil & j), i10);
            c1294cA = F.a(c1297fF);
            c1437a.f24174a = c1297fF;
            c1437a.f24175b = c1294cA;
            c1437a.f24177d = i10;
            c1437a.f24176c = jCeil;
            b bVar2 = c1437a.f24178e;
            long jD1 = a.d0(jCeil);
            p196u0.a aVar3 = bVar2.f22794r;
            c cVar2 = aVar3.f22790a;
            m mVar2 = aVar3.f22791b;
            o oVar2 = aVar3.f22792c;
            C1294c c1294c2 = c1294cA;
            long j11 = aVar3.f22793d;
            aVar3.f22790a = dVar;
            aVar3.f22791b = layoutDirection;
            aVar3.f22792c = c1294c2;
            aVar3.f22793d = jD1;
            c1294c2.q();
            p123m2.c.k(bVar2, q.f21839b, 0L, 0L, 62);
            this.f24143m.e(bVar2);
            c1294c2.n();
            p196u0.a aVar4 = bVar2.f22794r;
            aVar4.f22790a = cVar2;
            aVar4.f22791b = mVar2;
            aVar4.f22792c = oVar2;
            aVar4.f22793d = j11;
            c1297fF.f21826a.prepareToDraw();
            this.f24136d = false;
            this.j = dVar.b();
        } else {
            C1297f c1297f = c1437a.f24174a;
            if (c1297f != null) {
                Bitmap.Config config = c1297f.f21826a.getConfig();
                j.b(config);
                iD = AbstractC1298g.d(config);
            } else {
                iD = 0;
            }
            if (i10 != iD) {
                if (i10 == 1) {
                    c1303l2 = new C1303l(c1439c.f24184e, 5);
                } else {
                    c1303l2 = null;
                }
                this.f24139h = c1303l2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.b() >> 32));
                C0681f0 c0681f2 = this.f24140i;
                this.f24141k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((i) c0681f2.getValue()).f21400a >> 32));
                this.f24142l = Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) / Float.intBitsToFloat((int) (((i) c0681f2.getValue()).f21400a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() & 4294967295L))))) & 4294967295L);
                m layoutDirection2 = dVar.getLayoutDirection();
                c1297fF = c1437a.f24174a;
                C1294c c1294cA2 = c1437a.f24175b;
                if (c1297fF != null) {
                    c10 = ' ';
                    j = 4294967295L;
                    c1297fF = F.f((int) (jCeil2 >> c10), (int) (jCeil2 & j), i10);
                    c1294cA2 = F.a(c1297fF);
                    c1437a.f24174a = c1297fF;
                    c1437a.f24175b = c1294cA2;
                    c1437a.f24177d = i10;
                } else {
                    c10 = ' ';
                    j = 4294967295L;
                    c1297fF = F.f((int) (jCeil2 >> c10), (int) (jCeil2 & j), i10);
                    c1294cA2 = F.a(c1297fF);
                    c1437a.f24174a = c1297fF;
                    c1437a.f24175b = c1294cA2;
                    c1437a.f24177d = i10;
                }
                c1437a.f24176c = jCeil2;
                b bVar3 = c1437a.f24178e;
                long jD2 = a.d0(jCeil2);
                p196u0.a aVar5 = bVar3.f22794r;
                c cVar3 = aVar5.f22790a;
                m mVar3 = aVar5.f22791b;
                o oVar3 = aVar5.f22792c;
                C1294c c1294c3 = c1294cA2;
                long j12 = aVar5.f22793d;
                aVar5.f22790a = dVar;
                aVar5.f22791b = layoutDirection2;
                aVar5.f22792c = c1294c3;
                aVar5.f22793d = jD2;
                c1294c3.q();
                p123m2.c.k(bVar3, q.f21839b, 0L, 0L, 62);
                this.f24143m.e(bVar3);
                c1294c3.n();
                p196u0.a aVar6 = bVar3.f22794r;
                aVar6.f22790a = cVar3;
                aVar6.f22791b = mVar3;
                aVar6.f22792c = oVar3;
                aVar6.f22793d = j12;
                c1297fF.f21826a.prepareToDraw();
                this.f24136d = false;
                this.j = dVar.b();
            }
        }
        if (c1303l3 == null) {
            c1303l3 = ((C1303l) c0681f0.getValue()) != null ? (C1303l) c0681f0.getValue() : this.f24139h;
        }
        C1303l c1303l5 = c1303l3;
        C1297f c1297f2 = c1437a.f24174a;
        if (c1297f2 == null) {
            G0.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        p123m2.c.f(dVar, c1297f2, c1437a.f24176c, 0L, f3, c1303l5, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f24135c);
        sb.append("\n\tviewportWidth: ");
        C0681f0 c0681f0 = this.f24140i;
        sb.append(Float.intBitsToFloat((int) (((i) c0681f0.getValue()).f21400a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((i) c0681f0.getValue()).f21400a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        j.d(string, "toString(...)");
        return string;
    }
}
