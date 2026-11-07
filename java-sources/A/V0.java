package A;

import p223x.InterfaceC1435y;

/* JADX INFO: loaded from: classes.dex */
public abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f154a = new StackTraceElement[0];

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(T0 t2, float f3, InterfaceC1435y interfaceC1435y, q9.c cVar) {
        C0055y0 c0055y0;
        p251z9.s sVar;
        if (cVar instanceof C0055y0) {
            c0055y0 = (C0055y0) cVar;
            int i10 = c0055y0.f447t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0055y0.f447t = i10 - Integer.MIN_VALUE;
            } else {
                c0055y0 = new C0055y0(cVar);
            }
        } else {
            c0055y0 = new C0055y0(cVar);
        }
        Object obj = c0055y0.f446s;
        int i11 = c0055y0.f447t;
        if (i11 == 0) {
            p110k9.a.e(obj);
            p251z9.s sVar2 = new p251z9.s();
            p241y9.e c0057z0 = new C0057z0(f3, interfaceC1435y, sVar2, null);
            c0055y0.f445r = sVar2;
            c0055y0.f447t = 1;
            Object objA = t2.a(p232y.T.f24454r, c0057z0, c0055y0);
            Object obj2 = p161p9.a.f21156r;
            if (objA == obj2) {
                return obj2;
            }
            sVar = sVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = c0055y0.f445r;
            p110k9.a.e(obj);
        }
        return new Float(sVar.f24883r);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:22:0x0067->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004f A[EDGE_INSN: B:31:0x004f->B:18:0x004f BREAK  A[LOOP:0: B:22:0x0067->B:26:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(D0.N r7, D0.EnumC0097o r8, q9.a r9) {
        /*
            boolean r0 = r9 instanceof A.C0010b0
            if (r0 == 0) goto L13
            r0 = r9
            A.b0 r0 = (A.C0010b0) r0
            int r1 = r0.f192u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192u = r1
            goto L18
        L13:
            A.b0 r0 = new A.b0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f191t
            int r1 = r0.f192u
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            D0.o r7 = r0.f190s
            D0.N r8 = r0.f189r
            p110k9.a.e(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p110k9.a.e(r9)
            D0.O r9 = r7.f1073w
            D0.n r9 = r9.f1079K
            java.lang.Object r9 = r9.f1119a
            int r1 = r9.size()
            r4 = r2
        L43:
            if (r4 >= r1) goto L7a
            java.lang.Object r5 = r9.get(r4)
            D0.v r5 = (D0.v) r5
            boolean r5 = r5.f1135d
            if (r5 == 0) goto L77
        L4f:
            r0.f189r = r7
            r0.f190s = r8
            r0.f192u = r3
            java.lang.Object r9 = r7.a(r8, r0)
            p9.a r1 = p161p9.a.f21156r
            if (r9 != r1) goto L5e
            return r1
        L5e:
            D0.n r9 = (D0.C0096n) r9
            java.lang.Object r9 = r9.f1119a
            int r1 = r9.size()
            r4 = r2
        L67:
            if (r4 >= r1) goto L7a
            java.lang.Object r5 = r9.get(r4)
            D0.v r5 = (D0.v) r5
            boolean r5 = r5.f1135d
            if (r5 == 0) goto L74
            goto L4f
        L74:
            int r4 = r4 + 1
            goto L67
        L77:
            int r4 = r4 + 1
            goto L43
        L7a:
            k9.y r7 = p110k9.y.f19095a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A.V0.b(D0.N, D0.o, q9.a):java.lang.Object");
    }

    public static final Object c(D0.z zVar, p241y9.e eVar, p150o9.c cVar) {
        Object objV0 = ((D0.O) zVar).v0(new C0012c0(cVar.getContext(), eVar, (p150o9.c) null), cVar);
        return objV0 == p161p9.a.f21156r ? objV0 : p110k9.y.f19095a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:49|27|(3:30|31|(0)(1:34))|46) */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r3 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        r1 = r10;
        r10 = r12;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (r3 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [D0.z] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [o9.h] */
    /* JADX WARN: Type inference failed for: r10v12, types: [o9.h] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [o9.h] */
    /* JADX WARN: Type inference failed for: r10v3, types: [o9.h] */
    /* JADX WARN: Type inference failed for: r10v4, types: [D0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [A.k1] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [y9.e] */
    /* JADX WARN: Type inference failed for: r11v3, types: [y9.e] */
    /* JADX WARN: Type inference failed for: r11v4, types: [y9.e] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [y9.e] */
    /* JADX WARN: Type inference failed for: r11v9, types: [y9.e] */
    /* JADX WARN: Type inference failed for: r12v10, types: [o9.h] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [D0.z] */
    /* JADX WARN: Type inference failed for: r1v12, types: [D0.z] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [D0.z] */
    /* JADX WARN: Type inference failed for: r1v3, types: [D0.z] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(D0.z r10, A.k1 r11, p150o9.c r12) {
        /*
            boolean r0 = r12 instanceof A.C0014d0
            if (r0 == 0) goto L13
            r0 = r12
            A.d0 r0 = (A.C0014d0) r0
            int r1 = r0.f221v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221v = r1
            goto L18
        L13:
            A.d0 r0 = new A.d0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f220u
            int r1 = r0.f221v
            r2 = 0
            k9.y r3 = p110k9.y.f19095a
            p9.a r4 = p161p9.a.f21156r
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L56
            if (r1 == r7) goto L4c
            if (r1 == r6) goto L3e
            if (r1 != r5) goto L36
            o9.h r10 = r0.f219t
            y9.e r11 = r0.f218s
            D0.z r1 = r0.f217r
            p110k9.a.e(r12)
            goto L47
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            o9.h r10 = r0.f219t
            y9.e r11 = r0.f218s
            D0.z r1 = r0.f217r
            p110k9.a.e(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
        L47:
            r12 = r10
            r10 = r1
            goto L5d
        L4a:
            r12 = move-exception
            goto L94
        L4c:
            o9.h r10 = r0.f219t
            y9.e r11 = r0.f218s
            D0.z r1 = r0.f217r
            p110k9.a.e(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
            goto L74
        L56:
            p110k9.a.e(r12)
            o9.h r12 = r0.getContext()
        L5d:
            boolean r1 = K9.AbstractC0405x.v(r12)
            if (r1 == 0) goto Lb6
            r0.f217r = r10     // Catch: java.util.concurrent.CancellationException -> L8f
            r0.f218s = r11     // Catch: java.util.concurrent.CancellationException -> L8f
            r0.f219t = r12     // Catch: java.util.concurrent.CancellationException -> L8f
            r0.f221v = r7     // Catch: java.util.concurrent.CancellationException -> L8f
            java.lang.Object r1 = r11.invoke(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L8f
            if (r1 != r4) goto L72
            goto Lb4
        L72:
            r1 = r10
            r10 = r12
        L74:
            r0.f217r = r1     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f218s = r11     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f219t = r10     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f221v = r6     // Catch: java.util.concurrent.CancellationException -> L4a
            A.a0 r12 = new A.a0     // Catch: java.util.concurrent.CancellationException -> L4a
            r12.<init>(r6, r2)     // Catch: java.util.concurrent.CancellationException -> L4a
            r8 = r1
            D0.O r8 = (D0.O) r8     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.Object r12 = r8.v0(r12, r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r12 != r4) goto L8b
            goto L8c
        L8b:
            r12 = r3
        L8c:
            if (r12 != r4) goto L47
            goto Lb4
        L8f:
            r1 = move-exception
            r9 = r1
            r1 = r10
            r10 = r12
            r12 = r9
        L94:
            boolean r8 = K9.AbstractC0405x.v(r10)
            if (r8 == 0) goto Lb5
            r0.f217r = r1
            r0.f218s = r11
            r0.f219t = r10
            r0.f221v = r5
            A.a0 r12 = new A.a0
            r12.<init>(r6, r2)
            r8 = r1
            D0.O r8 = (D0.O) r8
            java.lang.Object r12 = r8.v0(r12, r0)
            if (r12 != r4) goto Lb1
            goto Lb2
        Lb1:
            r12 = r3
        Lb2:
            if (r12 != r4) goto L47
        Lb4:
            return r4
        Lb5:
            throw r12
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A.V0.d(D0.z, A.k1, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(T0 t2, float f3, q9.c cVar) {
        A0 a9;
        p251z9.s sVar;
        if (cVar instanceof A0) {
            a9 = (A0) cVar;
            int i10 = a9.f9t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a9.f9t = i10 - Integer.MIN_VALUE;
            } else {
                a9 = new A0(cVar);
            }
        } else {
            a9 = new A0(cVar);
        }
        Object obj = a9.f8s;
        int i11 = a9.f9t;
        if (i11 == 0) {
            p110k9.a.e(obj);
            p251z9.s sVar2 = new p251z9.s();
            p241y9.e b5 = new B0(sVar2, f3, null);
            a9.f7r = sVar2;
            a9.f9t = 1;
            Object objA = t2.a(p232y.T.f24454r, b5, a9);
            Object obj2 = p161p9.a.f21156r;
            if (objA == obj2) {
                return obj2;
            }
            sVar = sVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = a9.f7r;
            p110k9.a.e(obj);
        }
        return new Float(sVar.f24883r);
    }
}
