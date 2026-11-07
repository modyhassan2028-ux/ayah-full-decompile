package A;

/* JADX INFO: loaded from: classes.dex */
public final class F extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f30A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f31B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f32C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ p251z9.u f33D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ EnumC0047u0 f34E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f35F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f36G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f37H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f38I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f39s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f40t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f41u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p251z9.u f42v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o1 f43w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D0.v f44x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f45y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f46z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(p241y9.a aVar, p251z9.u uVar, EnumC0047u0 enumC0047u0, p241y9.f fVar, p241y9.e eVar, p241y9.a aVar2, p241y9.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f32C = (p251z9.k) aVar;
        this.f33D = uVar;
        this.f34E = enumC0047u0;
        this.f35F = (p251z9.k) fVar;
        this.f36G = eVar;
        this.f37H = aVar2;
        this.f38I = (p251z9.k) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r4v0, types: [y9.f, z9.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [y9.c, z9.k] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        F f3 = new F(this.f32C, this.f33D, this.f34E, this.f35F, this.f36G, this.f37H, this.f38I, cVar);
        f3.f31B = obj;
        return f3;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0174  */
    /* JADX WARN: Code duplicated, block: B:246:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x020a A[LOOP:8: B:39:0x01ed->B:43:0x020a, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v50, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [y9.f, z9.k] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x031c -> B:93:0x02dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x0447 -> B:164:0x044a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0460 -> B:87:0x02c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x04b7 -> B:179:0x04ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x019d -> B:29:0x01a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x021f -> B:29:0x01a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x026a -> B:79:0x02a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0298 -> B:76:0x029b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
