package p198u3;

import K9.AbstractC0405x;
import K9.H;
import N9.InterfaceC0416i;
import R9.d;
import R9.e;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import java.util.Iterator;
import java.util.List;
import p077h3.a;
import p110k9.y;
import p150o9.c;
import p218w3.f;
import p251z9.j;
import z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0416i f22905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f22906t;

    public /* synthetic */ h(InterfaceC0416i interfaceC0416i, l lVar, int i10) {
        this.f22904r = i10;
        this.f22905s = interfaceC0416i;
        this.f22906t = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, c cVar) {
        g gVar;
        Object next;
        a aVar;
        int i10;
        BookmarkType bookmarkType;
        i iVar;
        int i11 = this.f22904r;
        InterfaceC0416i interfaceC0416i = this.f22905s;
        p161p9.a aVar2 = p161p9.a.f21156r;
        y yVar = y.f19095a;
        c cVar2 = null;
        int i12 = 0;
        l lVar = this.f22906t;
        int i13 = 1;
        switch (i11) {
            case 0:
                if (cVar instanceof g) {
                    gVar = (g) cVar;
                    int i14 = gVar.f22898s;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        gVar.f22898s = i14 - Integer.MIN_VALUE;
                    } else {
                        gVar = new g(this, cVar);
                    }
                } else {
                    gVar = new g(this, cVar);
                }
                Object objI = gVar.f22897r;
                int i15 = gVar.f22898s;
                if (i15 == 0) {
                    p110k9.a.e(objI);
                    Iterator it = ((List) obj).iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            long j = ((a) next).f16443d;
                            do {
                                Object next2 = it.next();
                                long j10 = ((a) next2).f16443d;
                                if (j < j10) {
                                    next = next2;
                                    j = j10;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    aVar = (a) next;
                    Integer num = aVar != null ? new Integer(aVar.f16440a) : null;
                    if (num == null || num.intValue() <= -1) {
                        int iIntValue = ((Number) lVar.f22927d.f23646b.getValue()).intValue();
                        if (iIntValue > 0) {
                            gVar.f22900u = interfaceC0416i;
                            gVar.f22901v = null;
                            gVar.f22902w = 0;
                            gVar.f22903x = 0;
                            gVar.f22898s = 3;
                            if (lVar.a(iIntValue, null, gVar) == aVar2) {
                                return aVar2;
                            }
                        }
                    } else {
                        f fVar = lVar.f22925b;
                        int iIntValue2 = num.intValue();
                        gVar.f22900u = interfaceC0416i;
                        gVar.f22901v = aVar;
                        gVar.f22902w = 0;
                        gVar.f22903x = 0;
                        gVar.f22898s = 1;
                        fVar.getClass();
                        e eVar = H.f5322a;
                        objI = AbstractC0405x.I(d.f7436t, new p218w3.e(iIntValue2, fVar, cVar2, i13), gVar);
                        if (objI == aVar2) {
                            return aVar2;
                        }
                        i10 = 0;
                        bookmarkType = aVar.f16442c;
                        gVar.f22900u = interfaceC0416i;
                        gVar.f22901v = null;
                        gVar.f22902w = i12;
                        gVar.f22903x = i10;
                        gVar.f22898s = 2;
                        if (lVar.b((p124m3.d) objI, bookmarkType, gVar) == aVar2) {
                            return aVar2;
                        }
                    }
                    gVar.f22900u = null;
                    gVar.f22901v = null;
                    gVar.f22902w = i12;
                    gVar.f22898s = 4;
                    if (interfaceC0416i.b(yVar, gVar) == aVar2) {
                        return aVar2;
                    }
                } else if (i15 != 1) {
                    if (i15 == 2) {
                        int i16 = gVar.f22902w;
                        InterfaceC0416i interfaceC0416i2 = gVar.f22900u;
                        p110k9.a.e(objI);
                        i12 = i16;
                        interfaceC0416i = interfaceC0416i2;
                    } else if (i15 == 3) {
                        i12 = gVar.f22902w;
                        interfaceC0416i = gVar.f22900u;
                        p110k9.a.e(objI);
                    } else {
                        if (i15 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(objI);
                    }
                    gVar.f22900u = null;
                    gVar.f22901v = null;
                    gVar.f22902w = i12;
                    gVar.f22898s = 4;
                    if (interfaceC0416i.b(yVar, gVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    int i17 = gVar.f22903x;
                    int i18 = gVar.f22902w;
                    aVar = gVar.f22901v;
                    InterfaceC0416i interfaceC0416i3 = gVar.f22900u;
                    p110k9.a.e(objI);
                    i12 = i18;
                    interfaceC0416i = interfaceC0416i3;
                    i10 = i17;
                    bookmarkType = aVar.f16442c;
                    gVar.f22900u = interfaceC0416i;
                    gVar.f22901v = null;
                    gVar.f22902w = i12;
                    gVar.f22903x = i10;
                    gVar.f22898s = 2;
                    if (lVar.b((p124m3.d) objI, bookmarkType, gVar) == aVar2) {
                        return aVar2;
                    }
                    gVar.f22900u = null;
                    gVar.f22901v = null;
                    gVar.f22902w = i12;
                    gVar.f22898s = 4;
                    if (interfaceC0416i.b(yVar, gVar) == aVar2) {
                        return aVar2;
                    }
                }
                return yVar;
            default:
                if (cVar instanceof i) {
                    iVar = (i) cVar;
                    int i19 = iVar.f22908s;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        iVar.f22908s = i19 - Integer.MIN_VALUE;
                    } else {
                        iVar = new i(this, cVar);
                    }
                } else {
                    iVar = new i(this, cVar);
                }
                Object obj2 = iVar.f22907r;
                int i20 = iVar.f22908s;
                if (i20 != 0) {
                    if (i20 == 1 || i20 == 2) {
                        i12 = iVar.f22911v;
                        interfaceC0416i = iVar.f22910u;
                        p110k9.a.e(obj2);
                    } else {
                        if (i20 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj2);
                    }
                    return yVar;
                }
                p110k9.a.e(obj2);
                z3.e eVar2 = (z3.e) obj;
                if (eVar2 instanceof z3.a) {
                    int i21 = eVar2.f24786a;
                    BookmarkType bookmarkType2 = ((z3.a) eVar2).f24783c;
                    iVar.f22910u = interfaceC0416i;
                    iVar.f22911v = 0;
                    iVar.f22908s = 1;
                    if (lVar.a(i21, bookmarkType2, iVar) == aVar2) {
                        return aVar2;
                    }
                } else if ((eVar2 instanceof z3.d) || (eVar2 instanceof z3.c)) {
                    int i22 = eVar2.f24786a;
                    if (i22 > 0) {
                        iVar.f22910u = interfaceC0416i;
                        iVar.f22911v = 0;
                        iVar.f22908s = 2;
                        if (lVar.a(i22, null, iVar) == aVar2) {
                            return aVar2;
                        }
                    }
                } else if (!j.a(eVar2, b.f24784b)) {
                    throw new A6.a();
                }
                iVar.f22910u = null;
                iVar.f22911v = i12;
                iVar.f22908s = 3;
                if (interfaceC0416i.b(yVar, iVar) == aVar2) {
                    return aVar2;
                }
                return yVar;
        }
    }
}
