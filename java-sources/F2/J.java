package F2;

/* JADX INFO: loaded from: classes.dex */
public final class J extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ A f2231A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EnumC0165j[] f2232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public K f2233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public A f2234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ EnumC0165j[] f2239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ K f2240z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(EnumC0165j[] enumC0165jArr, K k7, A a9, p150o9.c cVar) {
        super(2, cVar);
        this.f2239y = enumC0165jArr;
        this.f2240z = k7;
        this.f2231A = a9;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new J(this.f2239y, this.f2240z, this.f2231A, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((H2.o) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0075 -> B:27:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f2238x
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.f2237w
            int r3 = r10.f2236v
            int r4 = r10.f2235u
            F2.A r5 = r10.f2234t
            F2.K r6 = r10.f2233s
            F2.j[] r7 = r10.f2232r
            p110k9.a.e(r11)
            goto L58
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            p110k9.a.e(r11)
            F2.j[] r11 = r10.f2239y
            int r0 = r11.length
            r3 = 0
            F2.K r4 = r10.f2240z
            F2.A r5 = r10.f2231A
            r7 = r11
            r11 = r3
            r6 = r4
        L30:
            if (r3 >= r0) goto L78
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L75
            p9.a r9 = p161p9.a.f21156r
            if (r4 == r2) goto L60
            if (r4 != r1) goto L5a
            r10.f2232r = r7
            r10.f2233s = r6
            r10.f2234t = r5
            r10.f2235u = r8
            r10.f2236v = r3
            r10.f2237w = r0
            r10.f2238x = r1
            java.lang.Object r11 = F2.K.d(r6, r5, r11, r10)
            if (r11 != r9) goto L57
            goto L74
        L57:
            r4 = r8
        L58:
            r11 = r4
            goto L76
        L5a:
            A6.a r11 = new A6.a
            r11.<init>()
            throw r11
        L60:
            r10.f2232r = r7
            r10.f2233s = r6
            r10.f2234t = r5
            r10.f2235u = r8
            r10.f2236v = r3
            r10.f2237w = r0
            r10.f2238x = r2
            java.lang.Object r11 = F2.K.c(r6, r5, r11, r10)
            if (r11 != r9) goto L57
        L74:
            return r9
        L75:
            r11 = r8
        L76:
            int r3 = r3 + r2
            goto L30
        L78:
            k9.y r11 = p110k9.y.f19095a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
