package I4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3824t;

    public /* synthetic */ a(int i10, int i11, Object obj, Object obj2) {
        this.f3822r = i11;
        this.f3823s = obj;
        this.f3824t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0418  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r16v9 java.lang.Object, still in use, count: 2, list:
          (r16v9 java.lang.Object) from 0x03f8: PHI (r16 I:??) = (r16v7 java.lang.Object), (r16v9 java.lang.Object) binds: [B:107:0x03f6, B:203:0x03f8] A[DONT_GENERATE, DONT_INLINE]
          (r16v9 java.lang.Object) from 0x03e4: CHECK_CAST (k3.b) (r16v9 java.lang.Object)
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
    @Override // p241y9.e
    public final java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f3822r = i10;
        this.f3823s = obj;
        this.f3824t = obj2;
    }
}
