package M4;

import D0.N;
import D4.l;
import G9.m;
import p110k9.y;
import p251z9.s;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f5719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5720t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f5721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f5722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f5723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f5724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Ba.b f5725y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Ba.b f5726z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, m mVar, l lVar, Ba.b bVar, Ba.b bVar2, p150o9.c cVar) {
        super(2, cVar);
        this.f5722v = iVar;
        this.f5723w = mVar;
        this.f5724x = lVar;
        this.f5725y = bVar;
        this.f5726z = bVar2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        f fVar = new f(this.f5722v, this.f5723w, this.f5724x, this.f5725y, this.f5726z, cVar);
        fVar.f5721u = obj;
        return fVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((N) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if (r14 == r6) goto L22;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f5721u
            D0.N r0 = (D0.N) r0
            int r1 = r13.f5720t
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p9.a r6 = p161p9.a.f21156r
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            p110k9.a.e(r14)
            goto La2
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            z9.s r1 = r13.f5719s
            p110k9.a.e(r14)
            goto L7d
        L27:
            p110k9.a.e(r14)
            goto L39
        L2b:
            p110k9.a.e(r14)
            r13.f5721u = r0
            r13.f5720t = r4
            java.lang.Object r14 = A.n1.c(r0, r13, r3)
            if (r14 != r6) goto L39
            goto La1
        L39:
            D0.v r14 = (D0.v) r14
            long r7 = r14.f1134c
            M4.i r1 = r13.f5722v
            int r4 = r1.f5734r
            int r9 = r1.f5735s
            K9.u r10 = r1.f5736t
            F.A r1 = r1.f5737u
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r11
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r4 = (float) r4
            float r7 = r7 / r4
            float r4 = (float) r9
            float r7 = r7 * r4
            int r4 = B9.a.V(r7)
            D4.i r7 = new D4.i
            r8 = 1
            r7.<init>(r1, r4, r5, r8)
            K9.AbstractC0405x.x(r10, r5, r7, r2)
            z9.s r1 = new z9.s
            r1.<init>()
            long r7 = r14.f1132a
            G4.m r14 = new G4.m
            r4 = 3
            r14.<init>(r4, r1)
            r13.f5721u = r0
            r13.f5719s = r1
            r13.f5720t = r3
            java.lang.Object r14 = A.I.c(r0, r7, r14, r13)
            if (r14 != r6) goto L7d
            goto La1
        L7d:
            D0.v r14 = (D0.v) r14
            if (r14 == 0) goto La7
            float r1 = r1.f24883r
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r1)
            D4.l r1 = r13.f5724x
            r1.invoke(r14, r3)
            long r3 = r14.f1132a
            E5.a r14 = new E5.a
            r7 = 6
            r14.<init>(r7, r1)
            r13.f5721u = r5
            r13.f5719s = r5
            r13.f5720t = r2
            java.lang.Object r14 = A.I.g(r0, r3, r14, r13)
            if (r14 != r6) goto La2
        La1:
            return r6
        La2:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.booleanValue()
        La7:
            k9.y r14 = p110k9.y.f19095a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
