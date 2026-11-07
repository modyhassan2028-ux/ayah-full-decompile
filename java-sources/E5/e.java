package E5;

import M9.o;
import M9.v;
import N9.InterfaceC0416i;
import p110k9.y;
import p207v2.AbstractC1379q;
import p207v2.B;
import p207v2.e0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1900s;

    public /* synthetic */ e(int i10, Object obj) {
        this.f1899r = i10;
        this.f1900s = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(AbstractC1379q abstractC1379q, p150o9.c cVar) {
        B b5;
        if (cVar instanceof B) {
            b5 = (B) cVar;
            int i10 = b5.f23113t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b5.f23113t = i10 - Integer.MIN_VALUE;
            } else {
                b5 = new B(this, cVar);
            }
        } else {
            b5 = new B(this, cVar);
        }
        Object obj = b5.f23111r;
        int i11 = b5.f23113t;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                e0 e0Var = (e0) this.f1900s;
                b5.f23113t = 1;
                Object objD = e0Var.f23228r.d(abstractC1379q, b5);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
            }
        } catch (o unused) {
        }
        return y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 java.lang.Object, still in use, count: 2, list:
          (r1v9 java.lang.Object) from 0x00ec: PHI (r1 I:??) = (r1v1 java.lang.Object), (r1v9 java.lang.Object) binds: [B:47:0x00eb, B:78:0x00ec] A[DONT_GENERATE, DONT_INLINE]
          (r1v9 java.lang.Object) from 0x00e4: CHECK_CAST (O5.d) (r1v9 java.lang.Object)
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
    public final java.lang.Object b(java.lang.Object r6, p150o9.c r7) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.e.b(java.lang.Object, o9.c):java.lang.Object");
    }

    public e(v vVar) {
        this.f1899r = 7;
        j.e(vVar, "channel");
        this.f1900s = vVar;
    }
}
