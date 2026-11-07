package A;

import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import Z.C0673b0;
import android.app.Activity;

/* JADX INFO: renamed from: A.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0027k extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f290x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0027k(D0.z zVar, p241y9.f fVar, p241y9.c cVar, C0053x0 c0053x0, p150o9.c cVar2) {
        super(2, cVar2);
        this.f284r = 1;
        this.f287u = zVar;
        this.f288v = (q9.i) fVar;
        this.f289w = (p251z9.k) cVar;
        this.f290x = c0053x0;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r7v3, types: [y9.c, z9.k] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f284r) {
            case 0:
                C0027k c0027k = new C0027k((r1) this.f287u, (C0031m) this.f288v, (InterfaceC0015e) this.f289w, (K9.a0) this.f290x, cVar, 0);
                c0027k.f286t = obj;
                return c0027k;
            case 1:
                C0027k c0027k2 = new C0027k((D0.z) this.f287u, (q9.i) this.f288v, (p251z9.k) this.f289w, (C0053x0) this.f290x, cVar);
                c0027k2.f286t = obj;
                return c0027k2;
            case 2:
                return new C0027k((K.W) this.f286t, (Z.X) this.f287u, (Z0.z) this.f288v, (O.N) this.f289w, (Z0.k) this.f290x, cVar, 2);
            case 3:
                return new C0027k((H.b) this.f286t, (Z0.y) this.f287u, (K.W) this.f288v, (K.t0) this.f289w, (Z0.s) this.f290x, cVar, 3);
            case 4:
                C0027k c0027k3 = new C0027k((K0.V) this.f287u, (p241y9.c) this.f288v, (M.c) this.f289w, (M.l) this.f290x, cVar, 4);
                c0027k3.f286t = obj;
                return c0027k3;
            case 5:
                C0027k c0027k4 = new C0027k((Z.s0) this.f288v, (Z.r0) this.f289w, (Z.T) this.f290x, cVar);
                c0027k4.f286t = obj;
                return c0027k4;
            case 6:
                C0027k c0027k5 = new C0027k((androidx.window.layout.t) this.f289w, (Activity) this.f290x, cVar);
                c0027k5.f286t = obj;
                return c0027k5;
            case 7:
                C0027k c0027k6 = new C0027k((p181s2.i) this.f287u, (Z.X) this.f288v, (C0673b0) this.f289w, (Z.X) this.f290x, cVar, 7);
                c0027k6.f286t = obj;
                return c0027k6;
            default:
                return new C0027k((p223x.X) this.f289w, this.f286t, (p223x.q0) this.f290x, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f284r) {
            case 0:
                return ((C0027k) create((Z0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((C0027k) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((C0027k) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 3:
                return ((C0027k) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                ((C0027k) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            case 5:
                return ((C0027k) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 6:
                return ((C0027k) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 7:
                return ((C0027k) create((InterfaceC0415h) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((C0027k) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e4 A[Catch: all -> 0x0282, TRY_LEAVE, TryCatch #2 {all -> 0x0282, blocks: (B:121:0x027c, B:133:0x02c8, B:137:0x02dc, B:139:0x02e4, B:128:0x0299), top: B:289:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c6 A[Catch: all -> 0x0322, LOOP:1: B:175:0x03c4->B:176:0x03c6, LOOP_END, TryCatch #1 {all -> 0x0322, blocks: (B:153:0x031d, B:170:0x03b3, B:171:0x03b9, B:173:0x03be, B:174:0x03bf, B:176:0x03c6, B:177:0x03d2, B:194:0x0416, B:195:0x0417, B:172:0x03ba), top: B:288:0x030f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x03ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [C6.b] */
    /* JADX WARN: Type inference failed for: r2v33, types: [C6.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [C6.b] */
    /* JADX WARN: Type inference failed for: r2v39, types: [androidx.window.layout.w] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [H1.a] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [H1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r5v5, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r6v3, types: [y9.c, z9.k] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x02f9 -> B:133:0x02c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0027k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0027k(Z.s0 s0Var, Z.r0 r0Var, Z.T t2, p150o9.c cVar) {
        super(2, cVar);
        this.f284r = 5;
        this.f288v = s0Var;
        this.f289w = r0Var;
        this.f290x = t2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0027k(androidx.window.layout.t tVar, Activity activity, p150o9.c cVar) {
        super(2, cVar);
        this.f284r = 6;
        this.f289w = tVar;
        this.f290x = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0027k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f284r = i10;
        this.f286t = obj;
        this.f287u = obj2;
        this.f288v = obj3;
        this.f289w = obj4;
        this.f290x = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0027k(Object obj, Object obj2, Object obj3, Object obj4, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f284r = i10;
        this.f287u = obj;
        this.f288v = obj2;
        this.f289w = obj3;
        this.f290x = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0027k(p223x.X x9, Object obj, p223x.q0 q0Var, p150o9.c cVar) {
        super(2, cVar);
        this.f284r = 8;
        this.f289w = x9;
        this.f286t = obj;
        this.f290x = q0Var;
    }
}
