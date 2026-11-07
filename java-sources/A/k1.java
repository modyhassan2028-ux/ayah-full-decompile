package A;

import K9.InterfaceC0402u;
import android.view.View;
import androidx.lifecycle.InterfaceC0771u;
import java.util.ArrayList;
import java.util.List;
import p223x.C1411c;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f301y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(D0.z zVar, p241y9.f fVar, p241y9.c cVar, p241y9.c cVar2, p241y9.c cVar3, p150o9.c cVar4) {
        super(2, cVar4);
        this.f294r = 0;
        this.f297u = zVar;
        this.f298v = fVar;
        this.f299w = cVar;
        this.f300x = cVar2;
        this.f301y = (p251z9.k) cVar3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [q9.i, y9.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [y9.c, z9.k] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f294r) {
            case 0:
                k1 k1Var = new k1((D0.z) this.f297u, (p241y9.f) this.f298v, (p241y9.c) this.f299w, (p241y9.c) this.f300x, (p251z9.k) this.f301y, cVar);
                k1Var.f296t = obj;
                return k1Var;
            case 1:
                k1 k1Var2 = new k1((p251z9.v) this.f297u, (Z.s0) this.f298v, (InterfaceC0771u) this.f299w, (K0.l1) this.f300x, (View) this.f301y, cVar, 1);
                k1Var2.f296t = obj;
                return k1Var2;
            case 2:
                k1 k1Var3 = new k1((M4.i) this.f297u, (G9.m) this.f298v, (D4.l) this.f299w, (Ba.b) this.f300x, (Ba.b) this.f301y, cVar, 2);
                k1Var3.f296t = obj;
                return k1Var3;
            case 3:
                k1 k1Var4 = new k1((List) this.f300x, (ArrayList) this.f301y, cVar);
                k1Var4.f299w = obj;
                return k1Var4;
            case 4:
                k1 k1Var5 = new k1((M9.i) this.f298v, (C1411c) this.f299w, (Z.X) this.f300x, (Z.X) this.f301y, cVar);
                k1Var5.f296t = obj;
                return k1Var5;
            default:
                k1 k1Var6 = new k1((p223x.L) this.f300x, (p241y9.c) this.f301y, cVar);
                k1Var6.f299w = obj;
                return k1Var6;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f294r) {
            case 0:
                return ((k1) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((k1) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((k1) create((D0.z) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 3:
                return ((k1) create(obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                return ((k1) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((k1) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0137 -> B:71:0x013a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(M9.i iVar, C1411c c1411c, Z.X x9, Z.X x10, p150o9.c cVar) {
        super(2, cVar);
        this.f294r = 4;
        this.f298v = iVar;
        this.f299w = c1411c;
        this.f300x = x9;
        this.f301y = x10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f294r = i10;
        this.f297u = obj;
        this.f298v = obj2;
        this.f299w = obj3;
        this.f300x = obj4;
        this.f301y = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(List list, ArrayList arrayList, p150o9.c cVar) {
        super(2, cVar);
        this.f294r = 3;
        this.f300x = list;
        this.f301y = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(p223x.L l10, p241y9.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f294r = 5;
        this.f300x = l10;
        this.f301y = (q9.i) cVar;
    }
}
