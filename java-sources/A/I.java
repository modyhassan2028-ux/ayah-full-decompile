package A;

import D0.C0096n;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f62a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(D0.N r12, long r13, q9.c r15) {
        /*
            boolean r0 = r15 instanceof A.C0054y
            if (r0 == 0) goto L13
            r0 = r15
            A.y r0 = (A.C0054y) r0
            int r1 = r0.f444u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f444u = r1
            goto L18
        L13:
            A.y r0 = new A.y
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f443t
            int r1 = r0.f444u
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            z9.u r12 = r0.f442s
            D0.N r13 = r0.f441r
            p110k9.a.e(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            p110k9.a.e(r15)
            D0.O r15 = r12.f1073w
            D0.n r15 = r15.f1079K
            boolean r15 = f(r15, r13)
            if (r15 == 0) goto L44
            goto Lc2
        L44:
            z9.u r15 = new z9.u
            r15.<init>()
            r15.f24885r = r13
        L4b:
            r0.f441r = r12
            r0.f442s = r15
            r0.f444u = r2
            java.lang.Object r13 = p245z2.a.s(r12, r0)
            p9.a r14 = p161p9.a.f21156r
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            D0.n r15 = (D0.C0096n) r15
            java.lang.Object r14 = r15.f1119a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            D0.v r7 = (D0.v) r7
            long r7 = r7.f1132a
            long r9 = r13.f24885r
            boolean r7 = D0.u.d(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            D0.v r6 = (D0.v) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = D0.u.c(r6)
            if (r14 == 0) goto Lad
            java.lang.Object r14 = r15.f1119a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            D0.v r5 = (D0.v) r5
            boolean r5 = r5.f1135d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            D0.v r1 = (D0.v) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.f1132a
            r13.f24885r = r14
            goto Lc3
        Lad:
            long r14 = D0.u.g(r6, r2)
            r4 = 0
            boolean r14 = p171r0.c.b(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: A.I.a(D0.N, long, q9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [z9.v] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static final Object b(D0.N n6, long j, q9.c cVar) {
        C0056z c0056z;
        Object obj;
        D0.v vVar;
        p251z9.r rVar;
        if (cVar instanceof C0056z) {
            c0056z = (C0056z) cVar;
            int i10 = c0056z.f452v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0056z.f452v = i10 - Integer.MIN_VALUE;
            } else {
                c0056z = new C0056z(cVar);
            }
        } else {
            c0056z = new C0056z(cVar);
        }
        Object obj2 = c0056z.f451u;
        int i11 = c0056z.f452v;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj2);
                if (!f(n6.f1073w.f1079K, j)) {
                    ?? r11 = n6.f1073w.f1079K.f1119a;
                    int size = r11.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r11.get(i12);
                        if (D0.u.d(((D0.v) obj).f1132a, j)) {
                            break;
                        }
                        i12++;
                    }
                    vVar = (D0.v) obj;
                    if (vVar != null) {
                        p251z9.v vVar2 = new p251z9.v();
                        p251z9.v vVar3 = new p251z9.v();
                        vVar3.f24886r = vVar;
                        long jC = n6.e().c();
                        p251z9.r rVar2 = new p251z9.r();
                        p241y9.e a9 = new A(rVar2, vVar3, vVar2, null);
                        c0056z.f448r = vVar;
                        c0056z.f449s = vVar2;
                        c0056z.f450t = rVar2;
                        c0056z.f452v = 1;
                        Object objF = n6.f(jC, a9, c0056z);
                        Object obj3 = p161p9.a.f21156r;
                        if (objF == obj3) {
                            return obj3;
                        }
                        rVar = rVar2;
                        j = vVar2;
                    }
                }
                return null;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = c0056z.f450t;
            p251z9.v vVar4 = c0056z.f449s;
            vVar = c0056z.f448r;
            p110k9.a.e(obj2);
            j = vVar4;
            if (rVar.f24882r) {
                D0.v vVar5 = (D0.v) j.f24886r;
                return vVar5 == null ? vVar : vVar5;
            }
            return null;
        } catch (D0.p unused) {
            D0.v vVar6 = (D0.v) j.f24886r;
            return vVar6 == null ? vVar : vVar6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce A[LOOP:0: B:26:0x00b5->B:30:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00da A[EDGE_INSN: B:68:0x00da->B:32:0x00da BREAK  A[LOOP:0: B:26:0x00b5->B:30:0x00ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0169 -> B:62:0x016f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(D0.N r19, long r20, G4.m r22, q9.a r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.I.c(D0.N, long, G4.m, q9.a):java.lang.Object");
    }

    public static final Object d(D0.z zVar, p241y9.c cVar, p241y9.a aVar, p241y9.a aVar2, p241y9.e eVar, q9.i iVar) {
        Object objC = V0.c(zVar, new F(C.f22t, new p251z9.u(), null, new D(0, cVar), eVar, aVar2, new E(0, aVar), null), iVar);
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar3 = p161p9.a.f21156r;
        if (objC != aVar3) {
            objC = yVar;
        }
        return objC == aVar3 ? objC : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(D0.N r4, long r5, p241y9.c r7, q9.c r8) {
        /*
            boolean r0 = r8 instanceof A.G
            if (r0 == 0) goto L13
            r0 = r8
            A.G r0 = (A.G) r0
            int r1 = r0.f50u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50u = r1
            goto L18
        L13:
            A.G r0 = new A.G
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f49t
            int r1 = r0.f50u
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            y9.c r4 = r0.f48s
            D0.N r5 = r0.f47r
            p110k9.a.e(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p110k9.a.e(r8)
        L36:
            r0.f47r = r4
            r0.f48s = r7
            r0.f50u = r2
            java.lang.Object r8 = a(r4, r5, r0)
            p9.a r5 = p161p9.a.f21156r
            if (r8 != r5) goto L45
            return r5
        L45:
            D0.v r8 = (D0.v) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = D0.u.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.e(r8)
            long r5 = r8.f1132a
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: A.I.e(D0.N, long, y9.c, q9.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean f(C0096n c0096n, long j) {
        Object obj;
        ?? r10 = c0096n.f1119a;
        int size = r10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r10.get(i10);
            if (D0.u.d(((D0.v) obj).f1132a, j)) {
                break;
            }
            i10++;
        }
        D0.v vVar = (D0.v) obj;
        if (vVar != null && vVar.f1135d) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[LOOP:0: B:25:0x0086->B:29:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a5 A[EDGE_INSN: B:73:0x00a5->B:31:0x00a5 BREAK  A[LOOP:0: B:25:0x0086->B:29:0x009c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0078 -> B:24:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(D0.N r17, long r18, E5.a r20, q9.a r21) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.I.g(D0.N, long, E5.a, q9.a):java.lang.Object");
    }
}
