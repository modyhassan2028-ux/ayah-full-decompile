package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class S extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f129r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p251z9.v f130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p251z9.v f131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ T f134w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t2, p150o9.c cVar) {
        super(2, cVar);
        this.f134w = t2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f129r) {
            case 0:
                S s10 = new S(this.f131t, this.f134w, cVar);
                s10.f133v = obj;
                return s10;
            default:
                S s11 = new S(this.f134w, cVar);
                s11.f133v = obj;
                return s11;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f129r) {
            case 0:
                return ((S) create((p241y9.c) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((S) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b A[PHI: r5
      0x005b: PHI (r5v7 K9.u) = (r5v0 K9.u), (r5v3 K9.u), (r5v3 K9.u), (r5v3 K9.u), (r5v5 K9.u), (r5v8 K9.u) binds: [B:20:0x0053, B:47:0x00ca, B:49:0x00d7, B:43:0x00c3, B:32:0x0087, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[Catch: CancellationException -> 0x00c6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ca -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d7 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e5 -> B:13:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x013b -> B:79:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0140 -> B:81:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x009b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.S.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(p251z9.v vVar, T t2, p150o9.c cVar) {
        super(2, cVar);
        this.f131t = vVar;
        this.f134w = t2;
    }
}
