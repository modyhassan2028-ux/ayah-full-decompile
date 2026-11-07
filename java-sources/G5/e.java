package G5;

import D0.z;
import K.g0;
import K9.InterfaceC0402u;
import O.N;
import com.ayah.common.data.source.preference.model.PreferencesAppNotification;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2878u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2879v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p088i3.e eVar, p095j3.a aVar, j jVar, p124m3.d dVar, p150o9.c cVar) {
        super(2, cVar);
        this.f2875r = 0;
        this.f2876s = eVar;
        this.f2877t = aVar;
        this.f2878u = jVar;
        this.f2879v = dVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2875r) {
            case 0:
                return new e((p088i3.e) this.f2876s, (p095j3.a) this.f2877t, (j) this.f2878u, (p124m3.d) this.f2879v, cVar);
            case 1:
                e eVar = new e((X1.e) this.f2877t, (J3.j) this.f2878u, (PreferencesAppNotification) this.f2879v, cVar, 1);
                eVar.f2876s = obj;
                return eVar;
            default:
                e eVar2 = new e((z) this.f2877t, (g0) this.f2878u, (N) this.f2879v, cVar, 2);
                eVar2.f2876s = obj;
                return eVar2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2875r) {
            case 0:
                return ((e) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                e eVar = (e) create((X1.b) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                eVar.invokeSuspend(yVar);
                return yVar;
            default:
                e eVar2 = (e) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                eVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0157  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:2: B:51:0x010a->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:3: B:40:0x00e1->B:82:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v4 java.lang.Object, still in use, count: 2, list:
          (r14v4 java.lang.Object) from 0x00c9: PHI (r14 I:??) = (r14v1 java.lang.Object), (r14v4 java.lang.Object) binds: [B:33:0x00c8, B:75:0x00c9] A[DONT_GENERATE, DONT_INLINE]
          (r14v4 java.lang.Object) from 0x00c1: CHECK_CAST (h3.a) (r14v4 java.lang.Object)
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
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f2875r = i10;
        this.f2877t = obj;
        this.f2878u = obj2;
        this.f2879v = obj3;
    }
}
