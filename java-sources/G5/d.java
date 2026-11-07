package G5;

import java.io.Serializable;
import java.util.List;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q9.i implements p241y9.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f2871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2874v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, p150o9.c cVar, int i11) {
        super(i10, cVar);
        this.f2870r = i11;
    }

    @Override // p241y9.h
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        switch (this.f2870r) {
            case 0:
                d dVar = new d(5, (p150o9.c) serializable, 0);
                dVar.f2871s = (p124m3.d) obj;
                dVar.f2872t = (z3.j) obj2;
                dVar.f2873u = (z3.j) obj3;
                dVar.f2874v = (p088i3.e) obj4;
                return dVar.invokeSuspend(y.f19095a);
            case 1:
                d dVar2 = new d(5, (p150o9.c) serializable, 1);
                dVar2.f2871s = (p124m3.d) obj;
                dVar2.f2872t = (z3.j) obj2;
                dVar2.f2873u = (z3.j) obj3;
                dVar2.f2874v = (p088i3.e) obj4;
                return dVar2.invokeSuspend(y.f19095a);
            default:
                d dVar3 = new d(5, (p150o9.c) serializable, 2);
                dVar3.f2871s = (List) obj;
                dVar3.f2872t = (List) obj2;
                dVar3.f2873u = (List) obj3;
                dVar3.f2874v = (p165q3.d) obj4;
                return dVar3.invokeSuspend(y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x022e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v13 java.lang.Object, still in use, count: 2, list:
          (r4v13 java.lang.Object) from 0x019c: PHI (r4 I:??) = (r4v10 java.lang.Object), (r4v13 java.lang.Object) binds: [B:104:0x019b, B:172:0x019c] A[DONT_GENERATE, DONT_INLINE]
          (r4v13 java.lang.Object) from 0x0194: CHECK_CAST (m3.b) (r4v13 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
