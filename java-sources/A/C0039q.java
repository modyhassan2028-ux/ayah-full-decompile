package A;

import D0.C0086d;
import G.C0185t;
import K9.C0395m;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import W.C0601t1;
import Z.C0691k0;
import android.net.Uri;
import android.view.InputEvent;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.File;
import java.util.List;
import p223x.C1411c;
import p223x.InterfaceC1435y;

/* JADX INFO: renamed from: A.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039q extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f388v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0039q(C0042s c0042s, p232y.T t2, p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f384r = 1;
        this.f386t = c0042s;
        this.f388v = t2;
        this.f387u = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (va.g.i(r4, r10, r9) == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r10) {
        /*
            r9 = this;
            p9.a r0 = p161p9.a.f21156r
            int r1 = r9.f385s
            r2 = 24
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            p110k9.a.e(r10)
            goto La4
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            java.lang.Object r1 = r9.f386t
            L9.c r1 = (L9.c) r1
            java.lang.Object r4 = r9.f388v
            M9.s r4 = (M9.s) r4
            p110k9.a.e(r10)
            goto L91
        L27:
            p110k9.a.e(r10)
            java.lang.Object r10 = r9.f388v
            M9.s r10 = (M9.s) r10
            A.a r1 = new A.a
            java.lang.Object r5 = r9.f387u
            java.io.File r5 = (java.io.File) r5
            r1.<init>(r2, r5, r10)
            java.lang.Object r6 = T1.V.f7643b
            java.io.File r5 = r5.getParentFile()
            p251z9.j.b(r5)
            java.io.File r5 = r5.getCanonicalFile()
            java.lang.String r5 = r5.getPath()
            java.lang.Object r6 = T1.V.f7643b
            monitor-enter(r6)
            java.util.LinkedHashMap r7 = T1.V.f7644c     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = "key"
            p251z9.j.d(r5, r8)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r7.get(r5)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L63
            T1.V r8 = new T1.V     // Catch: java.lang.Throwable -> L61
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L61
            r7.put(r5, r8)     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r10 = move-exception
            goto La7
        L63:
            T1.V r8 = (T1.V) r8     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.f7645a     // Catch: java.lang.Throwable -> L61
            r7.add(r1)     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.f7645a     // Catch: java.lang.Throwable -> L61
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L61
            if (r7 != r4) goto L75
            r8.startWatching()     // Catch: java.lang.Throwable -> L61
        L75:
            monitor-exit(r6)
            L9.c r6 = new L9.c
            r6.<init>(r4, r5, r1)
            k9.y r1 = p110k9.y.f19095a
            r9.f388v = r10
            r9.f386t = r6
            r9.f385s = r4
            r4 = r10
            M9.r r4 = (M9.r) r4
            M9.e r4 = r4.f5883u
            java.lang.Object r1 = r4.d(r1, r9)
            if (r1 != r0) goto L8f
            goto La3
        L8f:
            r4 = r10
            r1 = r6
        L91:
            A.r0 r10 = new A.r0
            r10.<init>(r2, r1)
            r1 = 0
            r9.f388v = r1
            r9.f386t = r1
            r9.f385s = r3
            java.lang.Object r10 = va.g.i(r4, r10, r9)
            if (r10 != r0) goto La4
        La3:
            return r0
        La4:
            k9.y r10 = p110k9.y.f19095a
            return r10
        La7:
            monitor-exit(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0039q.m(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj) throws Throwable {
        int i10 = this.f385s;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            return p110k9.y.f19095a;
        }
        p110k9.a.e(obj);
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f388v;
        N9.Y y10 = ((B.j) this.f386t).f569a;
        B.f fVar = new B.f(18, (V.a) this.f387u, interfaceC0402u);
        this.f385s = 1;
        y10.d(fVar, this);
        return p161p9.a.f21156r;
    }

    private final Object o(Object obj) {
        C0039q c0039q;
        int i10 = this.f385s;
        if (i10 == 0) {
            p110k9.a.e(obj);
            C1411c c1411c = (C1411c) this.f388v;
            Float f3 = new Float(1.0f);
            p223x.u0 u0Var = (p223x.u0) this.f386t;
            this.f385s = 1;
            c0039q = this;
            Object objC = C1411c.c(c1411c, f3, u0Var, null, c0039q, 12);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            c0039q = this;
        }
        ((p241y9.a) c0039q.f387u).invoke();
        return p110k9.y.f19095a;
    }

    private final Object p(Object obj) {
        C0691k0 c0691k0 = (C0691k0) this.f388v;
        int i10 = this.f385s;
        if (i10 == 0) {
            p110k9.a.e(obj);
            p241y9.e eVar = (p241y9.e) this.f387u;
            p095j3.c cVar = (p095j3.c) this.f386t;
            this.f388v = c0691k0;
            this.f385s = 1;
            obj = eVar.invoke(cVar, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        c0691k0.setValue((List) obj);
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r1v13, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r1v16, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r1v25, types: [q9.i, y9.e] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f384r) {
            case 0:
                C0039q c0039q = new C0039q((C0042s) this.f386t, (p241y9.e) this.f387u, cVar, 0);
                c0039q.f388v = obj;
                return c0039q;
            case 1:
                return new C0039q((C0042s) this.f386t, (p232y.T) this.f388v, (p241y9.e) this.f387u, cVar);
            case 2:
                C0039q c0039q2 = new C0039q((S) this.f386t, (X) this.f387u, cVar, 2);
                c0039q2.f388v = obj;
                return c0039q2;
            case 3:
                C0039q c0039q3 = new C0039q((S) this.f386t, (b1) this.f387u, cVar, 3);
                c0039q3.f388v = obj;
                return c0039q3;
            case 4:
                C0039q c0039q4 = new C0039q((b1) this.f386t, (p241y9.e) this.f387u, cVar, 4);
                c0039q4.f388v = obj;
                return c0039q4;
            case 5:
                return new C0039q((p241y9.f) this.f388v, (C0053x0) this.f386t, (D0.v) this.f387u, cVar);
            case 6:
                C0039q c0039q5 = new C0039q((K9.a0) this.f386t, (p241y9.e) this.f387u, cVar);
                c0039q5.f388v = obj;
                return c0039q5;
            case 7:
                return new C0039q((A2.a) this.f388v, (Uri) this.f386t, (InputEvent) this.f387u, cVar, 7);
            case 8:
                return new C0039q((Z.X) this.f388v, (InterfaceC0402u) this.f386t, this.f385s, (F.A) this.f387u, cVar, 8);
            case 9:
                return new C0039q((C0185t) this.f388v, (InterfaceC1435y) this.f386t, (p205v0.b) this.f387u, cVar, 9);
            case 10:
                return new C0039q((Ga.k) this.f388v, (Z.X) this.f386t, (Z.X) this.f387u, cVar, 10);
            case 11:
                return new C0039q((H.f) this.f388v, (J0.j0) this.f386t, (C0086d) this.f387u, cVar, 11);
            case 12:
                return new C0039q((p251z9.v) this.f386t, (H2.m) this.f387u, cVar, 12);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                C0039q c0039q6 = new C0039q((C0395m) this.f386t, (p241y9.e) this.f387u, cVar);
                c0039q6.f388v = obj;
                return c0039q6;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new C0039q((Z.X) this.f386t, (O.N) this.f387u, cVar, 14);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new C0039q((M9.e) this.f387u, cVar, 15);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                C0039q c0039q7 = new C0039q((Z.L0) this.f386t, (C1411c) this.f387u, cVar, 16);
                c0039q7.f388v = obj;
                return c0039q7;
            case 17:
                return new C0039q((O.N) this.f387u, cVar, 17);
            case 18:
                return new C0039q((O3.d) this.f388v, (M3.a) this.f386t, (String) this.f387u, cVar, 18);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                C0039q c0039q8 = new C0039q((InterfaceC0416i) this.f386t, (O9.e) this.f387u, cVar, 19);
                c0039q8.f388v = obj;
                return c0039q8;
            case 20:
                return new C0039q((InterfaceC0415h) this.f388v, (O9.v) this.f386t, (S9.h) this.f387u, cVar, 20);
            case 21:
                return new C0039q((p065g3.a) this.f388v, (String) this.f386t, this.f385s, (P5.g) this.f387u, cVar, 21);
            case 22:
                C0039q c0039q9 = new C0039q((P5.g) this.f387u, cVar, 22);
                c0039q9.f388v = obj;
                return c0039q9;
            case 23:
                C0039q c0039q10 = new C0039q((T1.B) this.f387u, cVar, 23);
                c0039q10.f388v = obj;
                return c0039q10;
            case 24:
                C0039q c0039q11 = new C0039q((T1.B) this.f386t, (p241y9.e) this.f387u, cVar);
                c0039q11.f388v = obj;
                return c0039q11;
            case 25:
                C0039q c0039q12 = new C0039q((File) this.f387u, cVar, 25);
                c0039q12.f388v = obj;
                return c0039q12;
            case 26:
                C0039q c0039q13 = new C0039q((B.j) this.f386t, (V.a) this.f387u, cVar, 26);
                c0039q13.f388v = obj;
                return c0039q13;
            case 27:
                return new C0039q((C1411c) this.f388v, (p223x.u0) this.f386t, (p241y9.a) this.f387u, cVar, 27);
            case 28:
                C0039q c0039q14 = new C0039q((p241y9.e) this.f387u, (p095j3.c) this.f386t, cVar);
                c0039q14.f388v = obj;
                return c0039q14;
            default:
                return new C0039q((p241y9.e) this.f387u, this.f388v, (InterfaceC0402u) this.f386t, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f384r) {
            case 0:
                return ((C0039q) create((C0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((C0039q) create((C0601t1) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 3:
                return ((C0039q) create((Z0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                return ((C0039q) create((C0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 5:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 6:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 7:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 8:
                C0039q c0039q = (C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                p110k9.y yVar = p110k9.y.f19095a;
                c0039q.invokeSuspend(yVar);
                return yVar;
            case 9:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 10:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 11:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 12:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 17:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 18:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 20:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 21:
                C0039q c0039q2 = (C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                p110k9.y yVar2 = p110k9.y.f19095a;
                c0039q2.invokeSuspend(yVar2);
                return yVar2;
            case 22:
                return ((C0039q) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 23:
                return ((C0039q) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 24:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 25:
                return ((C0039q) create((M9.s) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 26:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 27:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 28:
                return ((C0039q) create((C0691k0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((C0039q) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0634 */
    /* JADX WARN: Code duplicated, block: B:305:0x0659  */
    /* JADX WARN: Code duplicated, block: B:308:0x0662 A[Catch: all -> 0x0634, TryCatch #3 {, blocks: (B:295:0x062e, B:306:0x065a, B:308:0x0662, B:309:0x066f, B:317:0x0680, B:303:0x064c, B:319:0x0683, B:321:0x0688, B:322:0x0689, B:302:0x0647, B:310:0x0670, B:312:0x0676), top: B:577:0x0622, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0676 A[Catch: all -> 0x0687, TRY_LEAVE, TryCatch #5 {all -> 0x0687, blocks: (B:310:0x0670, B:312:0x0676), top: B:581:0x0670, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x0683 A[Catch: all -> 0x0634, TryCatch #3 {, blocks: (B:295:0x062e, B:306:0x065a, B:308:0x0662, B:309:0x066f, B:317:0x0680, B:303:0x064c, B:319:0x0683, B:321:0x0688, B:322:0x0689, B:302:0x0647, B:310:0x0670, B:312:0x0676), top: B:577:0x0622, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:422:0x084d  */
    /* JADX WARN: Code duplicated, block: B:581:0x0670 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:312:0x0676, B:316:0x067f], limit reached: 600 */
    /* JADX WARN: Type inference failed for: r12v0, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Throwable, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r1v26, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v21, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r2v53, types: [M9.e] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55, types: [M9.u] */
    /* JADX WARN: Type inference failed for: r3v41, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r7v47, types: [q9.i, y9.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:304:0x0657 -> B:306:0x065a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0039q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0039q(C0395m c0395m, p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f384r = 13;
        this.f386t = c0395m;
        this.f387u = (q9.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0039q(K9.a0 a0Var, p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f384r = 6;
        this.f386t = a0Var;
        this.f387u = (q9.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0039q(T1.B b5, p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f384r = 24;
        this.f386t = b5;
        this.f387u = (q9.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039q(Object obj, Object obj2, int i10, Object obj3, p150o9.c cVar, int i11) {
        super(2, cVar);
        this.f384r = i11;
        this.f388v = obj;
        this.f386t = obj2;
        this.f385s = i10;
        this.f387u = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039q(Object obj, Object obj2, Object obj3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f384r = i10;
        this.f388v = obj;
        this.f386t = obj2;
        this.f387u = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039q(Object obj, Object obj2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f384r = i10;
        this.f386t = obj;
        this.f387u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039q(Object obj, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f384r = i10;
        this.f387u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0039q(p241y9.e eVar, p095j3.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f384r = 28;
        this.f387u = eVar;
        this.f386t = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0039q(p241y9.e eVar, Object obj, InterfaceC0402u interfaceC0402u, p150o9.c cVar) {
        super(2, cVar);
        this.f384r = 29;
        this.f387u = eVar;
        this.f388v = obj;
        this.f386t = interfaceC0402u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0039q(p241y9.f fVar, C0053x0 c0053x0, D0.v vVar, p150o9.c cVar) {
        super(2, cVar);
        this.f384r = 5;
        this.f388v = (q9.i) fVar;
        this.f386t = c0053x0;
        this.f387u = vVar;
    }
}
