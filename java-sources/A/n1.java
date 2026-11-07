package A;

import D0.EnumC0097o;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U f346a = new U(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:1: B:22:0x005d->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object a(D0.N r7, q9.a r8) {
        /*
            boolean r0 = r8 instanceof A.e1
            if (r0 == 0) goto L13
            r0 = r8
            A.e1 r0 = (A.e1) r0
            int r1 = r0.f230t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230t = r1
            goto L18
        L13:
            A.e1 r0 = new A.e1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f229s
            int r1 = r0.f230t
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            D0.N r7 = r0.f228r
            p110k9.a.e(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p110k9.a.e(r8)
        L32:
            r0.f228r = r7
            r0.f230t = r2
            java.lang.Object r8 = p245z2.a.s(r7, r0)
            p9.a r1 = p161p9.a.f21156r
            if (r8 != r1) goto L3f
            return r1
        L3f:
            D0.n r8 = (D0.C0096n) r8
            java.lang.Object r1 = r8.f1119a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L49:
            if (r5 >= r3) goto L57
            java.lang.Object r6 = r1.get(r5)
            D0.v r6 = (D0.v) r6
            r6.a()
            int r5 = r5 + 1
            goto L49
        L57:
            java.lang.Object r8 = r8.f1119a
            int r1 = r8.size()
        L5d:
            if (r4 >= r1) goto L6d
            java.lang.Object r3 = r8.get(r4)
            D0.v r3 = (D0.v) r3
            boolean r3 = r3.f1135d
            if (r3 == 0) goto L6a
            goto L32
        L6a:
            int r4 = r4 + 1
            goto L5d
        L6d:
            k9.y r7 = p110k9.y.f19095a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A.n1.a(D0.N, q9.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[LOOP:0: B:19:0x0055->B:33:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(D0.N r9, boolean r10, D0.EnumC0097o r11, q9.a r12) {
        /*
            boolean r0 = r12 instanceof A.c1
            if (r0 == 0) goto L13
            r0 = r12
            A.c1 r0 = (A.c1) r0
            int r1 = r0.f213v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213v = r1
            goto L18
        L13:
            A.c1 r0 = new A.c1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f212u
            int r1 = r0.f213v
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r9 = r0.f211t
            D0.o r10 = r0.f210s
            D0.N r11 = r0.f209r
            p110k9.a.e(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            p110k9.a.e(r12)
        L3a:
            r0.f209r = r9
            r0.f210s = r11
            r0.f211t = r10
            r0.f213v = r2
            java.lang.Object r12 = r9.a(r11, r0)
            p9.a r1 = p161p9.a.f21156r
            if (r12 != r1) goto L4b
            return r1
        L4b:
            D0.n r12 = (D0.C0096n) r12
            java.lang.Object r1 = r12.f1119a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L55:
            if (r5 >= r3) goto L7c
            java.lang.Object r6 = r1.get(r5)
            D0.v r6 = (D0.v) r6
            if (r10 == 0) goto L71
            boolean r7 = r6.b()
            if (r7 != 0) goto L6f
            boolean r7 = r6.f1138h
            if (r7 != 0) goto L6f
            boolean r6 = r6.f1135d
            if (r6 == 0) goto L6f
            r6 = r2
            goto L75
        L6f:
            r6 = r4
            goto L75
        L71:
            boolean r6 = D0.u.a(r6)
        L75:
            if (r6 != 0) goto L79
            r1 = r4
            goto L7d
        L79:
            int r5 = r5 + 1
            goto L55
        L7c:
            r1 = r2
        L7d:
            if (r1 == 0) goto L3a
            java.lang.Object r9 = r12.f1119a
            java.lang.Object r9 = r9.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A.n1.b(D0.N, boolean, D0.o, q9.a):java.lang.Object");
    }

    public static /* synthetic */ Object c(D0.N n6, q9.h hVar, int i10) {
        return b(n6, (i10 & 1) != 0, EnumC0097o.f1124s, hVar);
    }

    public static Object d(D0.z zVar, p241y9.f fVar, p241y9.c cVar, q9.i iVar, int i10) {
        if ((i10 & 4) != 0) {
            fVar = f346a;
        }
        Object objJ = AbstractC0405x.j(new k1(zVar, fVar, null, null, cVar, null), iVar);
        return objJ == p161p9.a.f21156r ? objJ : p110k9.y.f19095a;
    }

    public static K9.A e(InterfaceC0402u interfaceC0402u, K9.a0 a0Var, p241y9.e eVar) {
        return AbstractC0405x.x(interfaceC0402u, null, new C0039q(a0Var, eVar, (p150o9.c) null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(D0.N n6, EnumC0097o enumC0097o, q9.a aVar) {
        l1 l1Var;
        p251z9.v vVar;
        if (aVar instanceof l1) {
            l1Var = (l1) aVar;
            int i10 = l1Var.f314t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l1Var.f314t = i10 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(aVar);
            }
        } else {
            l1Var = new l1(aVar);
        }
        Object obj = l1Var.f313s;
        int i11 = l1Var.f314t;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                p251z9.v vVar2 = new p251z9.v();
                vVar2.f24886r = C0016e0.f227a;
                long jC = n6.e().c();
                p241y9.e c0012c0 = new C0012c0(enumC0097o, vVar2, (p150o9.c) null);
                l1Var.f312r = vVar2;
                l1Var.f314t = 1;
                Object objF = n6.f(jC, c0012c0, l1Var);
                Object obj2 = p161p9.a.f21156r;
                if (objF == obj2) {
                    return obj2;
                }
                vVar = vVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar = l1Var.f312r;
                p110k9.a.e(obj);
            }
            return vVar.f24886r;
        } catch (D0.p unused) {
            return C0020g0.f242a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[LOOP:1: B:23:0x005f->B:44:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object g(D0.N r13, D0.EnumC0097o r14, q9.a r15) {
        /*
            boolean r0 = r15 instanceof A.m1
            if (r0 == 0) goto L13
            r0 = r15
            A.m1 r0 = (A.m1) r0
            int r1 = r0.f334u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f334u = r1
            goto L18
        L13:
            A.m1 r0 = new A.m1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f333t
            int r1 = r0.f334u
            r2 = 2
            r3 = 0
            r4 = 1
            p9.a r5 = p161p9.a.f21156r
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L33
            D0.o r13 = r0.f332s
            D0.N r14 = r0.f331r
            p110k9.a.e(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            D0.o r13 = r0.f332s
            D0.N r14 = r0.f331r
            p110k9.a.e(r15)
            goto L56
        L43:
            p110k9.a.e(r15)
        L46:
            r0.f331r = r13
            r0.f332s = r14
            r0.f334u = r4
            java.lang.Object r15 = r13.a(r14, r0)
            if (r15 != r5) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            D0.n r15 = (D0.C0096n) r15
            java.lang.Object r15 = r15.f1119a
            int r1 = r15.size()
            r6 = r3
        L5f:
            if (r6 >= r1) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            D0.v r7 = (D0.v) r7
            boolean r7 = D0.u.b(r7)
            if (r7 != 0) goto Lbd
            int r1 = r15.size()
            r6 = r3
        L72:
            if (r6 >= r1) goto L92
            java.lang.Object r7 = r15.get(r6)
            D0.v r7 = (D0.v) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb8
            D0.O r8 = r14.f1073w
            long r8 = r8.f1084P
            long r10 = r14.d()
            boolean r7 = D0.u.e(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            r0.f331r = r14
            r0.f332s = r13
            r0.f334u = r2
            D0.o r15 = D0.EnumC0097o.f1125t
            java.lang.Object r15 = r14.a(r15, r0)
            if (r15 != r5) goto L2e
        La0:
            return r5
        La1:
            D0.n r15 = (D0.C0096n) r15
            java.lang.Object r15 = r15.f1119a
            int r1 = r15.size()
            r6 = r3
        Laa:
            if (r6 >= r1) goto L46
            java.lang.Object r7 = r15.get(r6)
            D0.v r7 = (D0.v) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: A.n1.g(D0.N, D0.o, q9.a):java.lang.Object");
    }
}
