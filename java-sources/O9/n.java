package O9;

import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M9.i f6543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f6544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h[] f6549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q9.i f6550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0416i f6551z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(InterfaceC0416i interfaceC0416i, p150o9.c cVar, p241y9.f fVar, InterfaceC0415h[] interfaceC0415hArr) {
        super(2, cVar);
        this.f6549x = interfaceC0415hArr;
        this.f6550y = (q9.i) fVar;
        this.f6551z = interfaceC0416i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [q9.i, y9.f] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        n nVar = new n(this.f6551z, cVar, this.f6550y, this.f6549x);
        nVar.f6548w = obj;
        return nVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[DONT_INVERT, EDGE_INSN: B:32:0x00bb->B:18:0x007c BREAK  A[LOOP:0: B:25:0x009c->B:38:?]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:25:0x009c->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v11, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d1 -> B:18:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O9.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
