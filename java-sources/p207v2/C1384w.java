package p207v2;

import N9.InterfaceC0416i;

/* JADX INFO: renamed from: v2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1384w implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f23307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23308t;

    public /* synthetic */ C1384w(int i10, Object obj, Object obj2) {
        this.f23306r = i10;
        this.f23307s = obj;
        this.f23308t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0142  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v9 java.lang.Object, still in use, count: 2, list:
          (r6v9 java.lang.Object) from 0x0117: PHI (r6 I:??) = (r6v4 java.lang.Object), (r6v9 java.lang.Object) binds: [B:52:0x0116, B:96:0x0117] A[DONT_GENERATE, DONT_INLINE]
          (r6v9 java.lang.Object) from 0x010b: CHECK_CAST (com.ayah.common.data.source.json.model.booklist.BookType) (r6v9 java.lang.Object)
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
    public final java.lang.Object b(java.lang.Object r15, p150o9.c r16) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p207v2.C1384w.b(java.lang.Object, o9.c):java.lang.Object");
    }
}
