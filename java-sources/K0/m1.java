package K0;

import K9.InterfaceC0402u;
import N9.InterfaceC0416i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5100r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f5101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f5103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f5104v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f5105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f5106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f5107y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5108z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ContentResolver contentResolver, Uri uri, n1 n1Var, M9.e eVar, Context context, p150o9.c cVar) {
        super(2, cVar);
        this.f5104v = contentResolver;
        this.f5105w = uri;
        this.f5106x = n1Var;
        this.f5107y = eVar;
        this.f5108z = context;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [q9.i, y9.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [q9.i, y9.c] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5100r) {
            case 0:
                m1 m1Var = new m1((ContentResolver) this.f5104v, (Uri) this.f5105w, (n1) this.f5106x, (M9.e) this.f5107y, (Context) this.f5108z, cVar);
                m1Var.f5101s = obj;
                return m1Var;
            case 1:
                m1 m1Var2 = new m1((p232y.T) this.f5106x, (X.A) this.f5107y, (p241y9.c) this.f5108z, cVar);
                m1Var2.f5105w = obj;
                return m1Var2;
            case 2:
                m1 m1Var3 = new m1((p241y9.a) this.f5108z, cVar);
                m1Var3.f5107y = obj;
                return m1Var3;
            case 3:
                return new m1((p251z9.v) this.f5103u, (List) this.f5101s, (ja.a) this.f5104v, (Z.X) this.f5105w, (Z.X) this.f5106x, (fa.a) this.f5107y, (Z.X) this.f5108z, cVar);
            default:
                m1 m1Var4 = new m1((p232y.T) this.f5106x, (p232y.V) this.f5107y, (p241y9.c) this.f5108z, cVar);
                m1Var4.f5105w = obj;
                return m1Var4;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5100r) {
            case 0:
                return ((m1) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((m1) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                ((m1) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            case 3:
                ((m1) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            default:
                return ((m1) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0310 -> B:133:0x0311). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:241:0x04d1 -> B:232:0x0490). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(p232y.T t2, X.A a9, p241y9.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f5106x = t2;
        this.f5107y = a9;
        this.f5108z = (q9.i) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(p232y.T t2, p232y.V v10, p241y9.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f5106x = t2;
        this.f5107y = v10;
        this.f5108z = (q9.i) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p241y9.a aVar, p150o9.c cVar) {
        super(2, cVar);
        this.f5108z = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p251z9.v vVar, List list, ja.a aVar, Z.X x9, Z.X x10, fa.a aVar2, Z.X x11, p150o9.c cVar) {
        super(2, cVar);
        this.f5103u = vVar;
        this.f5101s = list;
        this.f5104v = aVar;
        this.f5105w = x9;
        this.f5106x = x10;
        this.f5107y = aVar2;
        this.f5108z = x11;
    }
}
