package A;

/* JADX INFO: renamed from: A.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0036o0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0045t0 f353A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ float f354B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ b1 f355C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p251z9.r f356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p251z9.r f357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p251z9.s f361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f364z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036o0(p251z9.s sVar, p251z9.v vVar, p251z9.v vVar2, float f3, C0045t0 c0045t0, float f7, b1 b1Var, p150o9.c cVar) {
        super(2, cVar);
        this.f361w = sVar;
        this.f362x = vVar;
        this.f363y = vVar2;
        this.f364z = f3;
        this.f353A = c0045t0;
        this.f354B = f7;
        this.f355C = b1Var;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        C0036o0 c0036o0 = new C0036o0(this.f361w, this.f362x, this.f363y, this.f364z, this.f353A, this.f354B, this.f355C, cVar);
        c0036o0.f360v = obj;
        return c0036o0;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0036o0) create((Z0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x0093  */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0181 -> B:37:0x0182). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0036o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
