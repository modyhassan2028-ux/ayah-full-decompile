package p217w2;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import N9.AbstractC0419l;
import p110k9.a;
import p110k9.y;
import p207v2.d0;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f23643t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f23641r = i10;
        this.f23643t = bVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f23641r) {
            case 0:
                return new c(this.f23643t, cVar, 0);
            case 1:
                return new c(this.f23643t, cVar, 1);
            case 2:
                return new c(this.f23643t, cVar, 2);
            default:
                return new c(this.f23643t, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f23641r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((c) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23641r) {
            case 0:
                int i10 = this.f23642s;
                y yVar = y.f19095a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                    return yVar;
                }
                a.e(obj);
                this.f23642s = 1;
                b bVar = this.f23643t;
                Object objJ = AbstractC0419l.j(bVar.f23637a, new d0(bVar, (p150o9.c) null, 1), this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objJ != aVar) {
                    objJ = yVar;
                }
                return objJ == aVar ? aVar : yVar;
            case 1:
                int i11 = this.f23642s;
                y yVar2 = y.f19095a;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                    return yVar2;
                }
                a.e(obj);
                p150o9.i iVar = p150o9.i.f20380r;
                boolean zEquals = iVar.equals(iVar);
                p150o9.c cVar = null;
                b bVar2 = this.f23643t;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (zEquals) {
                    this.f23642s = 1;
                    Object objJ2 = AbstractC0419l.j(bVar2.f23637a, new d0(bVar2, (p150o9.c) null, 1), this);
                    if (objJ2 != aVar2) {
                        objJ2 = yVar2;
                    }
                    if (objJ2 != aVar2) {
                        return yVar2;
                    }
                } else {
                    c cVar2 = new c(bVar2, cVar, 0);
                    this.f23642s = 2;
                    if (AbstractC0405x.I(iVar, cVar2, this) != aVar2) {
                        return yVar2;
                    }
                }
                return aVar2;
            case 2:
                int i12 = this.f23642s;
                if (i12 == 0) {
                    a.e(obj);
                    this.f23642s = 1;
                    Object objA = this.f23643t.a(this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
            default:
                int i13 = this.f23642s;
                if (i13 == 0) {
                    a.e(obj);
                    p150o9.i iVar2 = p150o9.i.f20380r;
                    boolean zEquals2 = iVar2.equals(iVar2);
                    b bVar3 = this.f23643t;
                    p161p9.a aVar4 = p161p9.a.f21156r;
                    if (zEquals2) {
                        this.f23642s = 1;
                        if (bVar3.a(this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        c cVar3 = new c(bVar3, null, 2);
                        this.f23642s = 2;
                        if (AbstractC0405x.I(iVar2, cVar3, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
        }
    }
}
