package O9;

import A.C0030l0;
import A.C0039q;
import K9.AbstractC0405x;
import K9.EnumC0403v;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import java.util.ArrayList;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p150o9.h f6520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final M9.a f6522t;

    public e(p150o9.h hVar, int i10, M9.a aVar) {
        this.f6520r = hVar;
        this.f6521s = i10;
        this.f6522t = aVar;
    }

    public String b() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // O9.p
    public final InterfaceC0415h c(p150o9.h hVar, int i10, M9.a aVar) {
        p150o9.h hVar2 = this.f6520r;
        p150o9.h hVarL = hVar.L(hVar2);
        M9.a aVar2 = M9.a.f5830r;
        M9.a aVar3 = this.f6522t;
        int i11 = this.f6521s;
        if (aVar == aVar2) {
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (p251z9.j.a(hVarL, hVar2) && i10 == i11 && aVar == aVar3) ? this : h(hVarL, i10, aVar);
    }

    @Override // N9.InterfaceC0415h
    public Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        Object objJ = AbstractC0405x.j(new C0039q(interfaceC0416i, this, (p150o9.c) null, 19), cVar);
        return objJ == p161p9.a.f21156r ? objJ : p110k9.y.f19095a;
    }

    public abstract Object e(M9.s sVar, p150o9.c cVar);

    public abstract e h(p150o9.h hVar, int i10, M9.a aVar);

    public InterfaceC0415h i() {
        return null;
    }

    public M9.u j(InterfaceC0402u interfaceC0402u) {
        int i10 = this.f6521s;
        if (i10 == -3) {
            i10 = -2;
        }
        p241y9.e c0030l0 = new C0030l0(this, (p150o9.c) null, 28);
        M9.r rVar = new M9.r(AbstractC0405x.y(interfaceC0402u, this.f6520r), u0.a(i10, 4, this.f6522t));
        rVar.i0(EnumC0403v.f5403t, rVar, c0030l0);
        return rVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        p150o9.i iVar = p150o9.i.f20380r;
        p150o9.h hVar = this.f6520r;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i10 = this.f6521s;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        M9.a aVar = M9.a.f5830r;
        M9.a aVar2 = this.f6522t;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return p245z2.a.F(sb, p120l9.m.l0(arrayList, ", ", null, null, null, 62), ']');
    }
}
