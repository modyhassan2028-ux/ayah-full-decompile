package A;

import D0.C0096n;

/* JADX INFO: loaded from: classes.dex */
public final class A extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0096n f0s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p251z9.r f4w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f5x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f6y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(p251z9.r rVar, p251z9.v vVar, p251z9.v vVar2, p150o9.c cVar) {
        super(2, cVar);
        this.f4w = rVar;
        this.f5x = vVar;
        this.f6y = vVar2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        A a9 = new A(this.f4w, this.f5x, this.f6y, cVar);
        a9.f3v = obj;
        return a9;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[LOOP:2: B:16:0x0058->B:20:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006b A[EDGE_INSN: B:74:0x006b->B:22:0x006b BREAK  A[LOOP:2: B:16:0x0058->B:20:0x0067], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b3 -> B:39:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
