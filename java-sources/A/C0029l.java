package A;

import K9.InterfaceC0402u;
import N9.C0424q;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.google.android.gms.internal.measurement.J1;
import io.realm.RealmFieldTypeConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import p223x.C1411c;

/* JADX INFO: renamed from: A.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0029l extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0029l(InterfaceC0415h interfaceC0415h, N9.Q q10, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f302r = 3;
        this.f305u = interfaceC0415h;
        this.f306v = (O9.b) q10;
        this.f307w = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [N9.Q, O9.b] */
    /* JADX WARN: Type inference failed for: r1v9, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v7, types: [N9.Q, O9.b] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f302r) {
            case 0:
                C0029l c0029l = new C0029l((C0031m) this.f305u, (r1) this.f306v, (InterfaceC0015e) this.f307w, cVar, 0);
                c0029l.f304t = obj;
                return c0029l;
            case 1:
                C0029l c0029l2 = new C0029l((F2.K) this.f305u, (int[]) this.f306v, (String[]) this.f307w, cVar, 1);
                c0029l2.f304t = obj;
                return c0029l2;
            case 2:
                C0029l c0029l3 = new C0029l((p241y9.c) this.f305u, (M.c) this.f306v, (M.l) this.f307w, cVar, 2);
                c0029l3.f304t = obj;
                return c0029l3;
            case 3:
                C0029l c0029l4 = new C0029l((InterfaceC0415h) this.f305u, (N9.Q) this.f306v, this.f307w, cVar);
                c0029l4.f304t = obj;
                return c0029l4;
            case 4:
                return new C0029l((N9.d0) this.f305u, (InterfaceC0415h) this.f306v, (N9.Q) this.f307w, this.f304t, cVar);
            case 5:
                return new C0029l((Q0.d) this.f304t, (ScrollCaptureSession) this.f305u, (Rect) this.f306v, (Consumer) this.f307w, cVar, 5);
            case 6:
                return new C0029l((T8.d) this.f305u, (Map) this.f304t, (O9.y) this.f306v, (K4.b) this.f307w, cVar);
            case 7:
                return new C0029l((KhatmahWrapper) this.f304t, (p095j3.c) this.f305u, (p095j3.b) this.f306v, (p241y9.c) this.f307w, cVar, 7);
            case 8:
                return new C0029l((p032d.d) this.f305u, (p241y9.e) this.f306v, (J1) this.f307w, cVar, 8);
            case 9:
                C0029l c0029l5 = new C0029l((p241y9.c) this.f305u, (AtomicReference) this.f306v, (p241y9.e) this.f307w, cVar);
                c0029l5.f304t = obj;
                return c0029l5;
            case 10:
                C0029l c0029l6 = new C0029l((p223x.X) this.f305u, (p173r2.j) this.f306v, (p223x.q0) this.f307w, cVar, 10);
                c0029l6.f304t = obj;
                return c0029l6;
            case 11:
                C0029l c0029l7 = new C0029l((C0424q) this.f306v, (N9.D) this.f307w, cVar, 11);
                c0029l7.f304t = obj;
                return c0029l7;
            case 12:
                C0029l c0029l8 = new C0029l((p207v2.G) this.f307w, cVar, 12);
                c0029l8.f304t = obj;
                return c0029l8;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                C0029l c0029l9 = new C0029l((p207v2.G) this.f307w, cVar, 13);
                c0029l9.f304t = obj;
                return c0029l9;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                C0029l c0029l10 = new C0029l((InterfaceC0416i) this.f306v, (p241y9.e) this.f307w, cVar);
                c0029l10.f304t = obj;
                return c0029l10;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new C0029l(this.f304t, (C1411c) this.f305u, (Z.X) this.f306v, (Z.X) this.f307w, cVar, 15);
            default:
                C0029l c0029l11 = new C0029l((Z.X) this.f306v, (p223x.F) this.f307w, cVar, 16);
                c0029l11.f304t = obj;
                return c0029l11;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f302r) {
            case 0:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                ((C0029l) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            case 2:
                ((C0029l) create((K0.V) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            case 3:
                return ((C0029l) create((N9.a0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 5:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 6:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 7:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 8:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 9:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 10:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 11:
                return ((C0029l) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 12:
                return ((C0029l) create((p207v2.e0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return ((C0029l) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                ((C0029l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:365:0x076e A[PHI: r0
      0x076e: PHI (r0v21 N9.i) = (r0v18 N9.i), (r0v20 N9.i), (r0v28 N9.i) binds: [B:358:0x074c, B:363:0x076b, B:345:0x06fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:462:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [N9.Q, N9.i, O9.b] */
    /* JADX WARN: Type inference failed for: r0v44, types: [N9.h] */
    /* JADX WARN: Type inference failed for: r1v11, types: [N9.h] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r8v18, types: [q9.i, y9.e] */
    /* JADX WARN: Type inference failed for: r8v3, types: [N9.Q, N9.i, O9.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:13:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:13:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0161 -> B:45:0x0131). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0029l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0029l(InterfaceC0416i interfaceC0416i, p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f302r = 14;
        this.f306v = interfaceC0416i;
        this.f307w = (q9.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0029l(N9.d0 d0Var, InterfaceC0415h interfaceC0415h, N9.Q q10, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f302r = 4;
        this.f305u = d0Var;
        this.f306v = interfaceC0415h;
        this.f307w = (O9.b) q10;
        this.f304t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0029l(T8.d dVar, Map map, O9.y yVar, K4.b bVar, p150o9.c cVar) {
        super(2, cVar);
        this.f302r = 6;
        this.f305u = dVar;
        this.f304t = map;
        this.f306v = yVar;
        this.f307w = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0029l(Object obj, Object obj2, Object obj3, Object obj4, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f302r = i10;
        this.f304t = obj;
        this.f305u = obj2;
        this.f306v = obj3;
        this.f307w = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0029l(Object obj, Object obj2, Object obj3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f302r = i10;
        this.f305u = obj;
        this.f306v = obj2;
        this.f307w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0029l(Object obj, Object obj2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f302r = i10;
        this.f306v = obj;
        this.f307w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0029l(p207v2.G g, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f302r = i10;
        this.f307w = g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0029l(p241y9.c cVar, AtomicReference atomicReference, p241y9.e eVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f302r = 9;
        this.f305u = (p251z9.k) cVar;
        this.f306v = atomicReference;
        this.f307w = eVar;
    }
}
