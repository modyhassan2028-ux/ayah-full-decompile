package p085i0;

import A.C0007a;
import A6.a;
import J0.AbstractC0283f;
import J0.B0;
import J0.I;
import J0.K;
import Z.C0675c0;
import Z.L0;
import Z0.B;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import io.realm.RealmFieldTypeConstants;
import p063g1.m;
import p074h0.i;
import p093j0.t;
import p093j0.u;
import p110k9.y;
import p141o0.d;
import p151p.V;
import p171r0.e;
import p171r0.h;
import p180s0.AbstractC1298g;
import p180s0.AbstractC1302k;
import p180s0.C1294c;
import p180s0.C1297f;
import p180s0.C1300i;
import p180s0.C1303l;
import p180s0.D;
import p180s0.E;
import p180s0.F;
import p180s0.G;
import p180s0.L;
import p180s0.o;
import p180s0.q;
import p180s0.x;
import p196u0.g;
import p205v0.b;
import p207v2.e0;
import p223x.C1426o;
import p224x0.C;
import p224x0.C1439c;
import p232y.C1456j;
import p232y.C1457k;
import p232y.C1458l;
import p232y.C1459m;
import p232y.C1462p;
import p232y.j0;
import p241y9.c;
import p251z9.j;
import p251z9.k;
import p251z9.v;
import u.A;
import u.z;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16719s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj) {
        super(1);
        this.f16718r = i10;
        this.f16719s = obj;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0232  */
    /* JADX WARN: Code duplicated, block: B:85:0x026b  */
    @Override // p241y9.c
    public final Object e(Object obj) {
        C1303l c1303l;
        int i10;
        x xVar;
        x xVar2;
        boolean z10;
        switch (this.f16718r) {
            case 0:
                j jVar = ((g) this.f16719s).f16723c;
                return Boolean.valueOf(jVar != null ? jVar.b(obj) : true);
            case 1:
                u uVar = (u) this.f16719s;
                synchronized (uVar.g) {
                    t tVar = uVar.f18693i;
                    j.b(tVar);
                    Object obj2 = tVar.f18677b;
                    j.b(obj2);
                    int i11 = tVar.f18679d;
                    z zVar = tVar.f18678c;
                    if (zVar == null) {
                        zVar = new z();
                        tVar.f18678c = zVar;
                        tVar.f18681f.l(obj2, zVar);
                    }
                    tVar.c(obj, i11, obj2, zVar);
                }
                return y.f19095a;
            case 2:
                ((I) this.f16719s).Z((p063g1.c) obj);
                return y.f19095a;
            case 3:
                B0 b5 = B0.f3878r;
                d dVar = (d) obj;
                if (!dVar.f19339r.f19338E) {
                    return B0.f3879s;
                }
                d dVar2 = dVar.f20212G;
                if (dVar2 != null) {
                    f fVar = new f(3, (B) this.f16719s);
                    if (fVar.e(dVar2) == b5) {
                        AbstractC0283f.B(dVar2, fVar);
                    }
                }
                dVar.f20212G = null;
                dVar.f20211F = null;
                return b5;
            case 4:
                K k7 = (K) obj;
                ((C0007a) this.f16719s).e(k7);
                k7.a();
                return y.f19095a;
            case 5:
                G g = (G) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f16719s;
                g.h(g.f21784G.getDensity() * p242z.f.f24733d);
                g.i(shadowGraphicsLayerElement.f11937a);
                g.d(shadowGraphicsLayerElement.f11938b);
                g.c(shadowGraphicsLayerElement.f11939c);
                g.j(shadowGraphicsLayerElement.f11940d);
                return y.f19095a;
            case 6:
                G g10 = (G) obj;
                p180s0.K k10 = (p180s0.K) this.f16719s;
                g10.e(k10.f21802F);
                g10.f(k10.f21803G);
                g10.a(k10.f21804H);
                g10.m(0.0f);
                g10.o(0.0f);
                g10.h(k10.f21805I);
                float f3 = k10.f21806J;
                if (g10.f21778A != f3) {
                    g10.f21787r |= 1024;
                    g10.f21778A = f3;
                }
                float f7 = k10.f21807K;
                if (g10.f21779B != f7) {
                    g10.f21787r |= 2048;
                    g10.f21779B = f7;
                }
                g10.l(k10.f21808L);
                g10.i(k10.f21809M);
                g10.d(k10.f21810N);
                g10.c(k10.f21811O);
                g10.j(k10.f21812P);
                return y.f19095a;
            case 7:
                return obj == ((A) this.f16719s) ? "(this)" : String.valueOf(obj);
            case 8:
                return obj == ((u.B) this.f16719s) ? "(this)" : String.valueOf(obj);
            case 9:
                p196u0.d dVar3 = (p196u0.d) obj;
                b bVar = (b) this.f16719s;
                E e10 = bVar.f23013l;
                if (bVar.f23015n && bVar.f23024w && e10 != null) {
                    i iVarY = dVar3.y();
                    long jV = iVarY.v();
                    iVarY.p().q();
                    try {
                        ((i) ((V) iVarY.f16422s).f20603r).p().b(e10);
                        bVar.c(dVar3);
                    } finally {
                        iVarY.p().n();
                        iVarY.J(jV);
                    }
                } else {
                    bVar.c(dVar3);
                }
                return y.f19095a;
            case 10:
                ((e0) this.f16719s).f23228r.l(null, false);
                return y.f19095a;
            case 11:
                C1426o c1426o = (C1426o) obj;
                float f10 = c1426o.f24060b;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = c1426o.f24061c;
                if (f11 < -0.5f) {
                    f11 = -0.5f;
                }
                if (f11 > 0.5f) {
                    f11 = 0.5f;
                }
                float f12 = c1426o.f24062d;
                float f13 = f12 >= -0.5f ? f12 : -0.5f;
                float f14 = f13 <= 0.5f ? f13 : 0.5f;
                float f15 = c1426o.f24059a;
                float f16 = f15 >= 0.0f ? f15 : 0.0f;
                return new q(q.a(F.b(f10, f11, f14, f16 <= 1.0f ? f16 : 1.0f, p187t0.d.f22534x), (p187t0.c) this.f16719s));
            case 12:
                ((G) obj).a(((Number) ((L0) this.f16719s).getValue()).floatValue());
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                C c10 = (C) obj;
                C1439c c1439c = (C1439c) this.f16719s;
                c1439c.g(c10);
                c cVar = c1439c.f24187i;
                if (cVar != null) {
                    cVar.e(c10);
                }
                return y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p152p0.c cVar2 = (p152p0.c) obj;
                C1459m c1459m = (C1459m) this.f16719s;
                if (cVar2.getDensity() * c1459m.f24570I < 0.0f || p171r0.i.c(cVar2.f20809r.b()) <= 0.0f) {
                    return cVar2.a(C1457k.f24542s);
                }
                float f17 = 2;
                float fMin = Math.min(p063g1.f.a(c1459m.f24570I, 0.0f) ? 1.0f : (float) Math.ceil(cVar2.getDensity() * c1459m.f24570I), (float) Math.ceil(p171r0.i.c(cVar2.f20809r.b()) / f17));
                float f18 = fMin / f17;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar2.f20809r.b() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar2.f20809r.b() >> 32)) - fMin)) << 32);
                float f19 = fMin * f17;
                boolean z11 = f19 > p171r0.i.c(cVar2.f20809r.b());
                F fC = c1459m.f24572K.c(cVar2.f20809r.b(), cVar2.f20809r.getLayoutDirection(), cVar2);
                if (!(fC instanceof p180s0.B)) {
                    if (!(fC instanceof D)) {
                        boolean z12 = z11;
                        if (fC instanceof p180s0.C) {
                            return cVar2.a(new p214w.C(c1459m.f24571J, z12 ? 0L : jFloatToRawIntBits, z12 ? cVar2.f20809r.b() : jFloatToRawIntBits2, z12 ? p196u0.f.f22800b : new g(fMin, 0.0f, 0, 0, 30), 1));
                        }
                        throw new a();
                    }
                    L l10 = c1459m.f24571J;
                    p171r0.g gVar = ((D) fC).f21772e;
                    if (h.e(gVar)) {
                        return cVar2.a(new C1458l(z11, l10, gVar.f21397e, f18, fMin, jFloatToRawIntBits, jFloatToRawIntBits2, new g(fMin, 0.0f, 0, 0, 30)));
                    }
                    boolean z13 = z11;
                    if (c1459m.f24569H == null) {
                        c1459m.f24569H = new C1456j();
                    }
                    C1456j c1456j = c1459m.f24569H;
                    j.b(c1456j);
                    C1300i c1300i = c1456j.f24533d;
                    C1300i c1300i2 = c1300i;
                    if (c1300i == null) {
                        C1300i c1300iA = AbstractC1302k.a();
                        c1456j.f24533d = c1300iA;
                        c1300i2 = c1300iA;
                    }
                    c1300i2.c();
                    p123m2.c.c(c1300i2, gVar);
                    if (!z13) {
                        E eA = AbstractC1302k.a();
                        p123m2.c.c(eA, new p171r0.g(fMin, fMin, gVar.b() - fMin, gVar.a() - fMin, p171r0.d.d(gVar.f21397e, fMin), p171r0.d.d(gVar.f21398f, fMin), p171r0.d.d(gVar.g, fMin), p171r0.d.d(gVar.f21399h, fMin)));
                        c1300i2.b(c1300i2, eA, 0);
                    }
                    return cVar2.a(new X.L(23, c1300i2, l10));
                }
                L l11 = c1459m.f24571J;
                p180s0.B b10 = (p180s0.B) fC;
                E e11 = b10.f21770e;
                if (z11) {
                    return cVar2.a(new X.L(22, b10, l11));
                }
                if (p123m2.c.D(l11)) {
                    c1303l = new C1303l(q.b(l11.f21813e, 1.0f), 5);
                    i10 = 1;
                } else {
                    c1303l = null;
                    i10 = 0;
                }
                e eVarA = ((C1300i) e11).a();
                float f20 = eVarA.f21390b;
                float f21 = eVarA.f21389a;
                if (c1459m.f24569H == null) {
                    c1459m.f24569H = new C1456j();
                }
                C1456j c1456j2 = c1459m.f24569H;
                j.b(c1456j2);
                C1300i c1300i3 = c1456j2.f24533d;
                C1300i c1300i4 = c1300i3;
                if (c1300i3 == null) {
                    C1300i c1300iA2 = AbstractC1302k.a();
                    c1456j2.f24533d = c1300iA2;
                    c1300i4 = c1300iA2;
                }
                c1300i4.c();
                float f22 = eVarA.f21389a;
                float f23 = eVarA.f21392d;
                float f24 = eVarA.f21391c;
                float f25 = eVarA.f21390b;
                if (Float.isNaN(f22) || Float.isNaN(f25) || Float.isNaN(f24) || Float.isNaN(f23)) {
                    AbstractC1302k.b("Invalid rectangle, make sure no value is NaN");
                }
                if (c1300i4.f21830b == null) {
                    c1300i4.f21830b = new RectF();
                }
                RectF rectF = c1300i4.f21830b;
                j.b(rectF);
                rectF.set(f22, f25, f24, f23);
                Path path = c1300i4.f21829a;
                RectF rectF2 = c1300i4.f21830b;
                j.b(rectF2);
                path.addRect(rectF2, Path.Direction.CCW);
                c1300i4.b(c1300i4, e11, 0);
                v vVar = new v();
                C1303l c1303l2 = c1303l;
                long jCeil = (((long) ((int) Math.ceil(eVarA.f21392d - f20))) & 4294967295L) | (((long) ((int) Math.ceil(eVarA.f21391c - f21))) << 32);
                C1456j c1456j3 = c1459m.f24569H;
                j.b(c1456j3);
                C1297f c1297fF = c1456j3.f24530a;
                C1294c c1294cA = c1456j3.f24531b;
                if (c1297fF != null) {
                    Bitmap.Config config = c1297fF.f21826a.getConfig();
                    j.b(config);
                    xVar = new x(AbstractC1298g.d(config));
                } else {
                    xVar = null;
                }
                if (xVar != null && xVar.f21850a == 0) {
                    z10 = true;
                } else {
                    if (c1297fF != null) {
                        Bitmap.Config config2 = c1297fF.f21826a.getConfig();
                        j.b(config2);
                        xVar2 = new x(AbstractC1298g.d(config2));
                    } else {
                        xVar2 = null;
                    }
                    if (p123m2.c.D(xVar2) && i10 == xVar2.f21850a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c1297fF == null || c1294cA == null) {
                    c1297fF = F.f((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i10);
                    c1456j3.f24530a = c1297fF;
                    c1294cA = F.a(c1297fF);
                    c1456j3.f24531b = c1294cA;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar2.f20809r.b() >> 32));
                    Bitmap bitmap = c1297fF.f21826a;
                    if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (cVar2.f20809r.b() & 4294967295L)) > bitmap.getHeight() || !z10) {
                        c1297fF = F.f((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i10);
                        c1456j3.f24530a = c1297fF;
                        c1294cA = F.a(c1297fF);
                        c1456j3.f24531b = c1294cA;
                    }
                }
                p196u0.b bVar2 = c1456j3.f24532c;
                if (bVar2 == null) {
                    bVar2 = new p196u0.b();
                    c1456j3.f24532c = bVar2;
                }
                i iVar = bVar2.f22795s;
                p196u0.a aVar = bVar2.f22794r;
                long jD0 = B9.a.d0(jCeil);
                p196u0.b bVar3 = bVar2;
                m layoutDirection = cVar2.f20809r.getLayoutDirection();
                p063g1.c cVar3 = aVar.f22790a;
                m mVar = aVar.f22791b;
                C1300i c1300i5 = c1300i4;
                o oVar = aVar.f22792c;
                long j = aVar.f22793d;
                aVar.f22790a = cVar2;
                aVar.f22791b = layoutDirection;
                aVar.f22792c = c1294cA;
                aVar.f22793d = jD0;
                c1294cA.q();
                p123m2.c.k(bVar3, q.f21839b, 0L, jD0, 58);
                float f26 = -f21;
                float f27 = -f20;
                ((V) iVar.f16422s).x(f26, f27);
                try {
                    p123m2.c.i(bVar3, b10.f21770e, l11, 0.0f, new g(f19, 0.0f, 0, 0, 30), 52);
                    float f28 = 1;
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (iVar.v() >> 32)) + f28) / Float.intBitsToFloat((int) (iVar.v() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (iVar.v() & 4294967295L)) + f28) / Float.intBitsToFloat((int) (iVar.v() & 4294967295L));
                    long jI = bVar3.I();
                    C1297f c1297f = c1297fF;
                    C1294c c1294c = c1294cA;
                    long jV2 = iVar.v();
                    iVar.p().q();
                    try {
                        ((V) iVar.f16422s).w(fIntBitsToFloat2, fIntBitsToFloat3, jI);
                        p123m2.c.i(bVar3, c1300i5, l11, 0.0f, null, 28);
                        iVar.p().n();
                        iVar.J(jV2);
                        ((V) iVar.f16422s).x(-f26, -f27);
                        c1294c.n();
                        aVar.f22790a = cVar3;
                        aVar.f22791b = mVar;
                        aVar.f22792c = oVar;
                        aVar.f22793d = j;
                        c1297f.f21826a.prepareToDraw();
                        vVar.f24886r = c1297f;
                        return cVar2.a(new U0.o(eVarA, vVar, jCeil, c1303l2));
                    } catch (Throwable th) {
                        iVar.p().n();
                        iVar.J(jV2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((V) iVar.f16422s).x(-f26, -f27);
                    throw th2;
                }
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                long j10 = ((p171r0.c) obj).f21387a;
                C1462p c1462p = (C1462p) this.f16719s;
                if (c1462p.f24488L) {
                    c1462p.f24489M.invoke();
                }
                return y.f19095a;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                j0 j0Var = (j0) this.f16719s;
                C0675c0 c0675c0 = j0Var.f24535a;
                float fG = c0675c0.g() + fFloatValue + j0Var.f24539e;
                float fK = B0.c.k(fG, 0.0f, j0Var.f24538d.g());
                boolean z14 = fG == fK;
                float fG2 = fK - c0675c0.g();
                int iRound = Math.round(fG2);
                c0675c0.h(c0675c0.g() + iRound);
                j0Var.f24539e = fG2 - iRound;
                if (!z14) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
