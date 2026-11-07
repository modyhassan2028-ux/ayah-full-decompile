package A;

import G.C0185t;
import K9.InterfaceC0402u;
import p223x.InterfaceC1435y;
import p232y.AbstractC1450d;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f77r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f78s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f79t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f80u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f81v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f82w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C0185t c0185t, InterfaceC1435y interfaceC1435y, long j, p150o9.c cVar) {
        super(2, cVar);
        this.f77r = 1;
        this.f81v = c0185t;
        this.f82w = interfaceC1435y;
        this.f79t = j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f77r) {
            case 0:
                J0 j10 = new J0((b1) this.f81v, this.f79t, (p251z9.s) this.f82w, cVar, 0);
                j10.f80u = obj;
                return j10;
            case 1:
                return new J0((C0185t) this.f81v, (InterfaceC1435y) this.f82w, this.f79t, cVar);
            case 2:
                return new J0((Z.X) this.f81v, this.f79t, (B.j) this.f82w, cVar, 2);
            default:
                return new J0((AbstractC1450d) this.f81v, this.f79t, (B.j) this.f82w, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f77r) {
            case 0:
                return ((J0) create((Z0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((J0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((J0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((J0) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x019e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:72:0x010d
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.J0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(Object obj, long j, Object obj2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f77r = i10;
        this.f81v = obj;
        this.f79t = j;
        this.f82w = obj2;
    }
}
