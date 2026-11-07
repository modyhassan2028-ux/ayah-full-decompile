package p020c;

import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class y extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f13411s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(D d5, int i10) {
        super(1);
        this.f13410r = i10;
        this.f13411s = d5;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x005f: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:24:0x005e, B:37:0x005f] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0057: CHECK_CAST (c.x) (r2v5 java.lang.Object)
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
    @Override // p241y9.c
    public final java.lang.Object e(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f13410r
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            c.a r5 = (p020c.C0776a) r5
            java.lang.String r0 = "backEvent"
            p251z9.j.e(r5, r0)
            c.D r0 = r4.f13411s
            c.x r1 = r0.f13356c
            if (r1 != 0) goto L31
            l9.k r0 = r0.f13355b
            int r1 = r0.b()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L1c:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            c.x r2 = (p020c.x) r2
            boolean r2 = r2.f13407a
            if (r2 == 0) goto L1c
            goto L2f
        L2e:
            r1 = 0
        L2f:
            c.x r1 = (p020c.x) r1
        L31:
            if (r1 == 0) goto L36
            r1.c(r5)
        L36:
            k9.y r5 = p110k9.y.f19095a
            return r5
        L39:
            c.a r5 = (p020c.C0776a) r5
            java.lang.String r0 = "backEvent"
            p251z9.j.e(r5, r0)
            c.D r0 = r4.f13411s
            l9.k r1 = r0.f13355b
            int r2 = r1.b()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L4c:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.previous()
            r3 = r2
            c.x r3 = (p020c.x) r3
            boolean r3 = r3.f13407a
            if (r3 == 0) goto L4c
            goto L5f
        L5e:
            r2 = 0
        L5f:
            c.x r2 = (p020c.x) r2
            c.x r1 = r0.f13356c
            if (r1 == 0) goto L68
            r0.b()
        L68:
            r0.f13356c = r2
            if (r2 == 0) goto L6f
            r2.d(r5)
        L6f:
            k9.y r5 = p110k9.y.f19095a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p020c.y.e(java.lang.Object):java.lang.Object");
    }
}
