package u;

/* JADX INFO: loaded from: classes.dex */
public final class G extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f22680A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f22681B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ H f22682C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ G9.h f22683D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public G9.h f22684s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public H f22685t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long[] f22686u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22689x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22690y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f22691z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h7, G9.h hVar, p150o9.c cVar) {
        super(2, cVar);
        this.f22682C = h7;
        this.f22683D = hVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        G g = new G(this.f22682C, this.f22683D, cVar);
        g.f22681B = obj;
        return g;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((G9.j) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f22680A
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f22690y
            int r5 = r0.f22689x
            long r6 = r0.f22691z
            int r8 = r0.f22688w
            int r9 = r0.f22687v
            long[] r10 = r0.f22686u
            u.H r11 = r0.f22685t
            G9.h r12 = r0.f22684s
            java.lang.Object r13 = r0.f22681B
            G9.j r13 = (G9.j) r13
            p110k9.a.e(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            p110k9.a.e(r21)
            java.lang.Object r1 = r0.f22681B
            G9.j r1 = (G9.j) r1
            u.H r5 = r0.f22682C
            u.F r6 = r5.f22693s
            long[] r6 = r6.f22675a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            G9.h r8 = r0.f22683D
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f2935t = r2
            u.F r3 = r11.f22693s
            java.lang.Object[] r3 = r3.f22676b
            r2 = r3[r2]
            r0.f22681B = r13
            r0.f22684s = r12
            r0.f22685t = r11
            r0.f22686u = r10
            r0.f22687v = r9
            r0.f22688w = r8
            r0.f22691z = r6
            r0.f22689x = r5
            r0.f22690y = r1
            r0.f22680A = r4
            r13.b(r2, r0)
            p9.a r1 = p161p9.a.f21156r
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            k9.y r1 = p110k9.y.f19095a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
