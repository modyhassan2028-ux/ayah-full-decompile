package B;

import N9.InterfaceC0416i;
import N9.a0;
import N9.f0;
import com.ayah.feature.tafsir.view.TafsirPage;
import p110k9.y;
import p251z9.r;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f567t;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f565r = i10;
        this.f566s = obj;
        this.f567t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r1.b(r9, r0) == r4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r8, p150o9.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof W5.a
            if (r0 == 0) goto L13
            r0 = r9
            W5.a r0 = (W5.a) r0
            int r1 = r0.f9629s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9629s = r1
            goto L18
        L13:
            W5.a r0 = new W5.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f9628r
            int r1 = r0.f9629s
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            p110k9.a.e(r9)
            goto L94
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            int r8 = r0.f9632v
            N9.i r1 = r0.f9631u
            p110k9.a.e(r9)
            goto L86
        L3a:
            p110k9.a.e(r9)
            java.lang.Object r9 = r7.f566s
            r1 = r9
            N9.i r1 = (N9.InterfaceC0416i) r1
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r5 = 10
            int r5 = p120l9.n.a0(r8, r5)
            r9.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L53:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r8.next()
            E3.b r5 = (E3.b) r5
            int r5 = r5.f1839b
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r9.add(r6)
            goto L53
        L6a:
            r8 = 0
            java.lang.Integer[] r5 = new java.lang.Integer[r8]
            java.lang.Object[] r9 = r9.toArray(r5)
            java.lang.Integer[] r9 = (java.lang.Integer[]) r9
            java.lang.Object r5 = r7.f567t
            W5.d r5 = (W5.d) r5
            p.n r5 = r5.f9639a
            r0.f9631u = r1
            r0.f9632v = r8
            r0.f9629s = r3
            java.lang.Object r9 = r5.i(r9, r0)
            if (r9 != r4) goto L86
            goto L93
        L86:
            r3 = 0
            r0.f9631u = r3
            r0.f9632v = r8
            r0.f9629s = r2
            java.lang.Object r8 = r1.b(r9, r0)
            if (r8 != r4) goto L94
        L93:
            return r4
        L94:
            k9.y r8 = p110k9.y.f19095a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.c(java.lang.Object, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object d(Object obj, p150o9.c cVar) {
        p037d6.b bVar;
        if (cVar instanceof p037d6.b) {
            bVar = (p037d6.b) cVar;
            int i10 = bVar.f15694s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f15694s = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new p037d6.b(this, cVar);
            }
        } else {
            bVar = new p037d6.b(this, cVar);
        }
        Object obj2 = bVar.f15693r;
        int i11 = bVar.f15694s;
        if (i11 == 0) {
            p110k9.a.e(obj2);
            InterfaceC0416i interfaceC0416i = (InterfaceC0416i) this.f566s;
            if (((p124m3.d) obj).f19550b == ((TafsirPage) this.f567t).f13899z) {
                bVar.f15694s = 1;
                Object objB = interfaceC0416i.b(obj, bVar);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objB == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj2);
        }
        return y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0124, code lost:
    
        if (r8.b(r1, r2) == r7) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r17, p150o9.c r18) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.e(java.lang.Object, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0379  */
    /* JADX WARN: Code duplicated, block: B:98:0x039e A[LOOP:0: B:91:0x0373->B:98:0x039e, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0439 -> B:114:0x044a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02ff -> B:75:0x0334). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object h(java.lang.Object r33, p150o9.c r34) {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.h(java.lang.Object, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r1.b(r8, r0) == r4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r7, p150o9.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p144o3.g
            if (r0 == 0) goto L13
            r0 = r8
            o3.g r0 = (p144o3.g) r0
            int r1 = r0.f20324s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20324s = r1
            goto L18
        L13:
            o3.g r0 = new o3.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f20323r
            int r1 = r0.f20324s
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            p110k9.a.e(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r7 = r0.f20327v
            N9.i r1 = r0.f20326u
            p110k9.a.e(r8)
            goto L57
        L3a:
            p110k9.a.e(r8)
            java.lang.Object r8 = r6.f566s
            r1 = r8
            N9.i r1 = (N9.InterfaceC0416i) r1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r6.f567t
            o3.h r8 = (p144o3.h) r8
            r0.f20326u = r1
            r5 = 0
            r0.f20327v = r5
            r0.f20324s = r3
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r4) goto L56
            goto L64
        L56:
            r7 = r5
        L57:
            r3 = 0
            r0.f20326u = r3
            r0.f20327v = r7
            r0.f20324s = r2
            java.lang.Object r7 = r1.b(r8, r0)
            if (r7 != r4) goto L65
        L64:
            return r4
        L65:
            k9.y r7 = p110k9.y.f19095a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.i(java.lang.Object, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r3.b(r10, r0) == r4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r9, p150o9.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p174r3.b
            if (r0 == 0) goto L13
            r0 = r10
            r3.b r0 = (p174r3.b) r0
            int r1 = r0.f21510s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21510s = r1
            goto L18
        L13:
            r3.b r0 = new r3.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f21509r
            int r1 = r0.f21510s
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            p110k9.a.e(r10)
            goto Lbc
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            int r9 = r0.f21514w
            java.util.List r1 = r0.f21513v
            N9.i r3 = r0.f21512u
            p110k9.a.e(r10)
            goto L5e
        L3d:
            p110k9.a.e(r10)
            java.lang.Object r10 = r8.f566s
            N9.i r10 = (N9.InterfaceC0416i) r10
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r9 = r8.f567t
            D3.c r9 = (D3.c) r9
            r0.f21512u = r10
            r0.f21513v = r1
            r5 = 0
            r0.f21514w = r5
            r0.f21510s = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r4) goto L5b
            goto Lbb
        L5b:
            r3 = r10
            r10 = r9
            r9 = r5
        L5e:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r5 = 10
            int r5 = p120l9.n.a0(r10, r5)
            int r5 = p120l9.w.g0(r5)
            r6 = 16
            if (r5 >= r6) goto L6f
            r5 = r6
        L6f:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L78:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r10.next()
            r7 = r5
            com.ayah.common.data.source.json.model.booklist.BookType r7 = (com.ayah.common.data.source.json.model.booklist.BookType) r7
            java.lang.String r7 = r7.f13685a
            r6.put(r7, r5)
            goto L78
        L8b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r1.iterator()
        L94:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r6.get(r5)
            com.ayah.common.data.source.json.model.booklist.BookType r5 = (com.ayah.common.data.source.json.model.booklist.BookType) r5
            if (r5 == 0) goto L94
            r10.add(r5)
            goto L94
        Lac:
            r1 = 0
            r0.f21512u = r1
            r0.f21513v = r1
            r0.f21514w = r9
            r0.f21510s = r2
            java.lang.Object r9 = r3.b(r10, r0)
            if (r9 != r4) goto Lbc
        Lbb:
            return r4
        Lbc:
            k9.y r9 = p110k9.y.f19095a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.j(java.lang.Object, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r1.b(r10, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r9, p150o9.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p182s5.b
            if (r0 == 0) goto L13
            r0 = r10
            s5.b r0 = (p182s5.b) r0
            int r1 = r0.f22139s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22139s = r1
            goto L18
        L13:
            s5.b r0 = new s5.b
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f22138r
            int r1 = r0.f22139s
            r2 = 2
            r3 = 1
            r4 = 0
            p9.a r5 = p161p9.a.f21156r
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            p110k9.a.e(r10)
            goto L7a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            int r9 = r0.f22142v
            N9.i r1 = r0.f22141u
            p110k9.a.e(r10)
            goto L68
        L3b:
            p110k9.a.e(r10)
            java.lang.Object r10 = r8.f566s
            r1 = r10
            N9.i r1 = (N9.InterfaceC0416i) r1
            java.lang.Integer r9 = (java.lang.Integer) r9
            r10 = 0
            if (r9 == 0) goto L6b
            int r6 = r9.intValue()
            if (r6 <= 0) goto L6b
            java.lang.Object r6 = r8.f567t
            s5.d r6 = (p182s5.d) r6
            w3.f r6 = r6.f22146a
            int r9 = r9.intValue()
            r0.f22141u = r1
            r0.f22142v = r10
            r0.f22139s = r3
            java.lang.Object r9 = r6.a(r9, r0)
            if (r9 != r5) goto L65
            goto L79
        L65:
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            m3.d r10 = (p124m3.d) r10
            goto L6d
        L6b:
            r9 = r10
            r10 = r4
        L6d:
            r0.f22141u = r4
            r0.f22142v = r9
            r0.f22139s = r2
            java.lang.Object r9 = r1.b(r10, r0)
            if (r9 != r5) goto L7a
        L79:
            return r5
        L7a:
            k9.y r9 = p110k9.y.f19095a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.k(java.lang.Object, o9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i10, p150o9.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i11 = f0Var.f6182t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f0Var.f6182t = i11 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f6180r;
        int i12 = f0Var.f6182t;
        y yVar = y.f19095a;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            return yVar;
        }
        p110k9.a.e(obj);
        if (i10 > 0) {
            r rVar = (r) this.f566s;
            if (!rVar.f24882r) {
                rVar.f24882r = true;
                InterfaceC0416i interfaceC0416i = (InterfaceC0416i) this.f567t;
                f0Var.f6182t = 1;
                Object objB = interfaceC0416i.b(a0.f6156r, f0Var);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objB == aVar) {
                    return aVar;
                }
            }
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0297  */
    /* JADX WARN: Code duplicated, block: B:168:0x0309  */
    /* JADX WARN: Code duplicated, block: B:184:0x034b  */
    /* JADX WARN: Code duplicated, block: B:188:0x036b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0380  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:215:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:232:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:271:0x053a  */
    /* JADX WARN: Code duplicated, block: B:272:0x053e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0542  */
    /* JADX WARN: Code duplicated, block: B:285:0x0561  */
    /* JADX WARN: Code duplicated, block: B:332:0x0684  */
    /* JADX WARN: Code duplicated, block: B:356:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x0736  */
    /* JADX WARN: Code duplicated, block: B:401:0x078f  */
    /* JADX WARN: Code duplicated, block: B:403:0x0791  */
    /* JADX WARN: Code duplicated, block: B:410:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Code duplicated, block: B:471:0x086b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:500:0x08de  */
    /* JADX WARN: Code duplicated, block: B:528:0x096a  */
    /* JADX WARN: Code duplicated, block: B:554:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:610:0x037b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[LOOP:6: B:196:0x0399->B:615:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [q9.i, y9.e] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v69 java.lang.Object, still in use, count: 2, list:
          (r2v69 java.lang.Object) from 0x0536: PHI (r2 I:??) = (r2v67 java.lang.Object), (r2v69 java.lang.Object) binds: [B:268:0x0535, B:617:0x0536] A[DONT_GENERATE, DONT_INLINE]
          (r2v69 java.lang.Object) from 0x0530: CHECK_CAST (androidx.window.layout.g) (r2v69 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // N9.InterfaceC0416i
    public final java.lang.Object b(java.lang.Object r21, p150o9.c r22) {
        /*
            Method dump skipped, instruction units count: 2806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.b(java.lang.Object, o9.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(InterfaceC0416i interfaceC0416i, p241y9.e eVar) {
        this.f565r = 9;
        this.f566s = interfaceC0416i;
        this.f567t = (q9.i) eVar;
    }
}
