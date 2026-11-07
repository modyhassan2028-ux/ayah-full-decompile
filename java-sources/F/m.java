package F;

import G.F;
import H0.H;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f2066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f2068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2070f;
    public final /* synthetic */ l0.d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2072i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A f2073k;

    public m(long j, i iVar, F f3, int i10, int i11, l0.d dVar, int i12, int i13, long j10, A a9) {
        this.f2068d = f3;
        this.f2069e = i10;
        this.f2070f = i11;
        this.g = dVar;
        this.f2071h = i12;
        this.f2072i = i13;
        this.j = j10;
        this.f2073k = a9;
        this.f2065a = iVar;
        this.f2066b = f3;
        this.f2067c = p063g1.b.b(p063g1.a.h(j), Integer.MAX_VALUE, 5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final s a(long j, int i10) {
        List list;
        i iVar = this.f2065a;
        Object objC = iVar.c(i10);
        Object objA = iVar.a(i10);
        F f3 = this.f2066b;
        i iVar2 = f3.f2584t;
        u.t tVar = f3.f2585u;
        List list2 = (List) tVar.b(i10);
        if (list2 != null) {
            list = list2;
        } else {
            Object objC2 = iVar2.c(i10);
            List listC0 = f3.f2583s.c0(objC2, f3.f2582r.a(i10, objC2, iVar2.a(i10)));
            int size = listC0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((H) listC0.get(i11)).a(j));
            }
            tVar.h(i10, arrayList);
            list = arrayList;
        }
        return new s(i10, list, this.g, this.f2068d.f2583s.getLayoutDirection(), this.f2071h, this.f2072i, i10 != this.f2069e + (-1) ? this.f2070f : 0, this.j, objC, objA, this.f2073k.f2019m, j);
    }
}
