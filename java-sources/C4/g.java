package C4;

import J3.C0304b;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.B;
import N9.C0411d;
import N9.C0414g;
import N9.C0424q;
import N9.D;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import N9.k0;
import N9.r;
import O9.k;
import com.ayah.MainActivity;
import com.ayah.feature.tafsir.view.TafsirPage;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.Serializable;
import p110k9.y;
import p174r3.j;
import p198u3.l;
import p207v2.C1384w;
import p218w3.n;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f745t;

    public /* synthetic */ g(InterfaceC0415h interfaceC0415h, Object obj, int i10) {
        this.f743r = i10;
        this.f744s = interfaceC0415h;
        this.f745t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x024b  */
    /* JADX WARN: Code duplicated, block: B:136:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0297  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ab  */
    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) throws Throwable {
        r rVar;
        g gVar;
        B b5;
        B.f fVar;
        switch (this.f743r) {
            case 0:
                Object objD = ((e) this.f744s).d(new B.f(1, interfaceC0416i, (i) this.f745t), cVar);
                return objD == p161p9.a.f21156r ? objD : y.f19095a;
            case 1:
                Object objD2 = this.f744s.d(new B.f(2, interfaceC0416i, (C0304b) this.f745t), cVar);
                return objD2 == p161p9.a.f21156r ? objD2 : y.f19095a;
            case 2:
                Object objD3 = this.f744s.d(new B.f(3, interfaceC0416i, (J3.d) this.f745t), cVar);
                return objD3 == p161p9.a.f21156r ? objD3 : y.f19095a;
            case 3:
                Object objD4 = this.f744s.d(new B.f(4, interfaceC0416i, (J3.B) this.f745t), cVar);
                return objD4 == p161p9.a.f21156r ? objD4 : y.f19095a;
            case 4:
                Object objD5 = ((g) this.f744s).d(new L3.b(interfaceC0416i, (L3.e) this.f745t), cVar);
                return objD5 == p161p9.a.f21156r ? objD5 : y.f19095a;
            case 5:
                if (cVar instanceof r) {
                    rVar = (r) cVar;
                    int i10 = rVar.f6239s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        rVar.f6239s = i10 - Integer.MIN_VALUE;
                    } else {
                        rVar = new r(this, cVar);
                    }
                } else {
                    rVar = new r(this, cVar);
                }
                Object objI = rVar.f6238r;
                int i11 = rVar.f6239s;
                Object obj = p161p9.a.f21156r;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC0416i = rVar.f6242v;
                        gVar = rVar.f6241u;
                        p110k9.a.e(objI);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(objI);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(objI);
                rVar.f6241u = this;
                rVar.f6242v = interfaceC0416i;
                rVar.f6239s = 1;
                objI = AbstractC0419l.i(this.f744s, interfaceC0416i, rVar);
                if (objI == obj) {
                    return obj;
                }
                gVar = this;
                Throwable th = (Throwable) objI;
                if (th != null) {
                    D d5 = (D) gVar.f745t;
                    rVar.f6241u = null;
                    rVar.f6242v = null;
                    rVar.f6239s = 2;
                    if (d5.d(interfaceC0416i, th, rVar) == obj) {
                        return obj;
                    }
                }
                return y.f19095a;
            case 6:
                if (cVar instanceof B) {
                    b5 = (B) cVar;
                    int i12 = b5.f6074s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        b5.f6074s = i12 - Integer.MIN_VALUE;
                    } else {
                        b5 = new B(this, cVar);
                    }
                } else {
                    b5 = new B(this, cVar);
                }
                Object obj2 = b5.f6073r;
                int i13 = b5.f6074s;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = b5.f6076u;
                    try {
                        p110k9.a.e(obj2);
                    } catch (O9.a e10) {
                        e = e10;
                        if (e.f6512r == fVar) {
                            throw e;
                        }
                        AbstractC0405x.l(b5.getContext());
                    }
                    break;
                } else {
                    p110k9.a.e(obj2);
                    C0424q c0424q = (C0424q) this.f744s;
                    B.f fVar2 = new B.f(7, (K4.b) this.f745t, interfaceC0416i);
                    try {
                        b5.f6076u = fVar2;
                        b5.f6074s = 1;
                        Object objD6 = c0424q.d(fVar2, b5);
                        p161p9.a aVar = p161p9.a.f21156r;
                        if (objD6 == aVar) {
                            return aVar;
                        }
                    } catch (O9.a e11) {
                        e = e11;
                        fVar = fVar2;
                        if (e.f6512r == fVar) {
                            throw e;
                        }
                        AbstractC0405x.l(b5.getContext());
                    }
                }
                return y.f19095a;
            case 7:
                v vVar = new v();
                vVar.f24886r = O9.c.f6518b;
                Object objD7 = ((g) this.f744s).d(new H2.i((Object) vVar, (Serializable) this.f745t, interfaceC0416i, 5), cVar);
                return objD7 == p161p9.a.f21156r ? objD7 : y.f19095a;
            case 8:
                Object objD8 = this.f744s.d(new B.f(12, interfaceC0416i, (O3.d) this.f745t), cVar);
                return objD8 == p161p9.a.f21156r ? objD8 : y.f19095a;
            case 9:
                Object objD9 = ((e) this.f744s).d(new B.f(13, interfaceC0416i, (P2.b) this.f745t), cVar);
                return objD9 == p161p9.a.f21156r ? objD9 : y.f19095a;
            case 10:
                Object objD10 = this.f744s.d(new B.f(14, interfaceC0416i, (String) this.f745t), cVar);
                return objD10 == p161p9.a.f21156r ? objD10 : y.f19095a;
            case 11:
                Object objD11 = ((C0411d) this.f744s).d(new B.f(15, interfaceC0416i, (P5.g) this.f745t), cVar);
                return objD11 == p161p9.a.f21156r ? objD11 : y.f19095a;
            case 12:
                Object objD12 = ((g) this.f744s).d(new B.f(16, interfaceC0416i, (L5.c) this.f745t), cVar);
                return objD12 == p161p9.a.f21156r ? objD12 : y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                Object objD13 = this.f744s.d(new B.f(17, interfaceC0416i, (U4.e) this.f745t), cVar);
                return objD13 == p161p9.a.f21156r ? objD13 : y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                Object objD14 = this.f744s.d(new B.f(21, interfaceC0416i, (W5.d) this.f745t), cVar);
                return objD14 == p161p9.a.f21156r ? objD14 : y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                Object objD15 = ((g) this.f744s).d(new B.f(22, interfaceC0416i, (MainActivity) this.f745t), cVar);
                return objD15 == p161p9.a.f21156r ? objD15 : y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                Object objD16 = ((c) this.f744s).d(new B.f(23, interfaceC0416i, (TafsirPage) this.f745t), cVar);
                return objD16 == p161p9.a.f21156r ? objD16 : y.f19095a;
            case 17:
                Object objD17 = this.f744s.d(new B.f(24, interfaceC0416i, (p090i5.b) this.f745t), cVar);
                return objD17 == p161p9.a.f21156r ? objD17 : y.f19095a;
            case 18:
                Object objD18 = ((k) this.f744s).d(new B.f(25, interfaceC0416i, (p107k5.e) this.f745t), cVar);
                return objD18 == p161p9.a.f21156r ? objD18 : y.f19095a;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                Object objD19 = this.f744s.d(new B.f(26, interfaceC0416i, (p144o3.h) this.f745t), cVar);
                return objD19 == p161p9.a.f21156r ? objD19 : y.f19095a;
            case 20:
                Object objD20 = this.f744s.d(new B.f(27, interfaceC0416i, (D3.c) this.f745t), cVar);
                return objD20 == p161p9.a.f21156r ? objD20 : y.f19095a;
            case 21:
                ((k0) this.f744s).d(new B.f(28, interfaceC0416i, (p182s5.d) this.f745t), cVar);
                return p161p9.a.f21156r;
            case 22:
                Object objD21 = this.f744s.d(new j(interfaceC0416i, (p189t3.b) this.f745t, 3), cVar);
                return objD21 == p161p9.a.f21156r ? objD21 : y.f19095a;
            case 23:
                Object objD22 = this.f744s.d(new p198u3.h(interfaceC0416i, (l) this.f745t, 0), cVar);
                return objD22 == p161p9.a.f21156r ? objD22 : y.f19095a;
            case 24:
                Object objD23 = ((C0414g) this.f744s).d(new p198u3.h(interfaceC0416i, (l) this.f745t, 1), cVar);
                return objD23 == p161p9.a.f21156r ? objD23 : y.f19095a;
            case 25:
                Object objD24 = this.f744s.d(new j(interfaceC0416i, (p208v3.c) this.f745t, 6), cVar);
                return objD24 == p161p9.a.f21156r ? objD24 : y.f19095a;
            case 26:
                Object objD25 = this.f744s.d(new C1384w(2, interfaceC0416i, (p218w3.f) this.f745t), cVar);
                return objD25 == p161p9.a.f21156r ? objD25 : y.f19095a;
            case 27:
                Object objD26 = this.f744s.d(new C1384w(3, interfaceC0416i, (n) this.f745t), cVar);
                return objD26 == p161p9.a.f21156r ? objD26 : y.f19095a;
            default:
                Object objD27 = this.f744s.d(new C1384w(4, interfaceC0416i, (p220w5.d) this.f745t), cVar);
                return objD27 == p161p9.a.f21156r ? objD27 : y.f19095a;
        }
    }
}
