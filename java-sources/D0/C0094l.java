package D0;

import H0.InterfaceC0219s;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.j0;
import J0.w0;
import com.google.android.gms.internal.measurement.J1;
import java.util.ArrayList;
import java.util.List;
import u.C1360o;

/* JADX INFO: renamed from: D0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094l extends C0095m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0.q f1111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Da.r f1112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1360o f1113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f1114f;
    public C0096n g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1116i;
    public boolean j;

    public C0094l(l0.q qVar) {
        this.f1111c = qVar;
        Da.r rVar = new Da.r((char) 0, 1);
        rVar.f1388t = new long[2];
        this.f1112d = rVar;
        this.f1113e = new C1360o(2);
        this.f1116i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
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
    @Override // D0.C0095m
    public final boolean a(C1360o c1360o, InterfaceC0219s interfaceC0219s, J1 j10, boolean z10) {
        C1360o c1360o2;
        Da.r rVar;
        Object obj;
        boolean z11;
        boolean z12;
        C0096n c0096n;
        int i10;
        int i11;
        boolean z13;
        boolean zA = super.a(c1360o, interfaceC0219s, j10, z10);
        ?? F10 = this.f1111c;
        boolean z14 = true;
        if (F10.f19338E) {
            ?? eVar = 0;
            while (F10 != 0) {
                if (F10 instanceof w0) {
                    this.f1114f = AbstractC0283f.v((w0) F10, 16);
                } else if ((F10.f19341t & 16) != 0 && (F10 instanceof AbstractC0291n)) {
                    l0.q qVar = ((AbstractC0291n) F10).f4151G;
                    int i12 = 0;
                    while (qVar != null) {
                        if ((qVar.f19341t & 16) != 0) {
                            i12++;
                            if (i12 == 1) {
                                F10 = F10;
                                eVar = eVar;
                                eVar = eVar;
                                F10 = qVar;
                            } else {
                                if (eVar == 0) {
                                    eVar = new p011b0.e(new l0.q[16]);
                                }
                                if (F10 != 0) {
                                    eVar.b(F10);
                                    F10 = 0;
                                }
                                eVar.b(qVar);
                            }
                        } else {
                            F10 = F10;
                            eVar = eVar;
                        }
                        qVar = qVar.f19344w;
                        F10 = F10;
                        eVar = eVar;
                    }
                    if (i12 == 1) {
                        F10 = F10;
                        eVar = eVar;
                    } else {
                        F10 = F10;
                        eVar = eVar;
                    }
                }
                F10 = AbstractC0283f.f(eVar);
            }
            if (this.f1114f != null) {
                int iJ = c1360o.j();
                int i13 = 0;
                while (true) {
                    c1360o2 = this.f1113e;
                    rVar = this.f1112d;
                    if (i13 >= iJ) {
                        break;
                    }
                    long jG = c1360o.g(i13);
                    v vVar = (v) c1360o.k(i13);
                    if (rVar.d(jG)) {
                        boolean z15 = z14;
                        long j = vVar.g;
                        List list = vVar.f1140k;
                        long j11 = vVar.f1134c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z13 = z15;
                            p120l9.r rVar2 = p120l9.r.f19440r;
                            ArrayList arrayList = new ArrayList((list == null ? rVar2 : list).size());
                            if (list == null) {
                                list = rVar2;
                            }
                            int size = list.size();
                            int i14 = 0;
                            while (i14 < size) {
                                int i15 = size;
                                C0085c c0085c = (C0085c) list.get(i14);
                                long j12 = jG;
                                List list2 = list;
                                long j13 = c0085c.f1088b;
                                if ((((j13 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j14 = c0085c.f1087a;
                                    j0 j0Var = this.f1114f;
                                    p251z9.j.b(j0Var);
                                    arrayList.add(new C0085c(j14, j0Var.N0(interfaceC0219s, j13), c0085c.f1089c));
                                }
                                i14++;
                                list = list2;
                                size = i15;
                                jG = j12;
                                vVar = vVar;
                            }
                            long j15 = jG;
                            j0 j0Var2 = this.f1114f;
                            p251z9.j.b(j0Var2);
                            long jN0 = j0Var2.N0(interfaceC0219s, j);
                            j0 j0Var3 = this.f1114f;
                            p251z9.j.b(j0Var3);
                            v vVar2 = new v(vVar.f1132a, vVar.f1133b, j0Var3.N0(interfaceC0219s, j11), vVar.f1135d, vVar.f1136e, vVar.f1137f, jN0, vVar.f1138h, vVar.f1139i, arrayList, vVar.j, vVar.f1141l);
                            v vVar3 = vVar.f1144o;
                            if (vVar3 == null) {
                                vVar3 = vVar;
                            }
                            vVar2.f1144o = vVar3;
                            v vVar4 = vVar.f1144o;
                            if (vVar4 != null) {
                                vVar = vVar4;
                            }
                            vVar2.f1144o = vVar;
                            c1360o2.h(j15, vVar2);
                        } else {
                            z13 = z15;
                        }
                    } else {
                        z13 = z14;
                    }
                    i13++;
                    z14 = z13;
                    iJ = iJ;
                    zA = zA;
                }
                boolean z16 = zA;
                boolean z17 = z14;
                if (c1360o2.j() == 0) {
                    rVar.f1387s = 0;
                    this.f1117a.g();
                    return z17;
                }
                int i16 = rVar.f1387s;
                while (true) {
                    i16--;
                    if (-1 >= i16) {
                        break;
                    }
                    if (c1360o.f(((long[]) rVar.f1388t)[i16]) < 0 && i16 < (i11 = rVar.f1387s)) {
                        int i17 = i11 - 1;
                        int i18 = i16;
                        while (i18 < i17) {
                            long[] jArr = (long[]) rVar.f1388t;
                            int i19 = i18 + 1;
                            jArr[i18] = jArr[i19];
                            i18 = i19;
                        }
                        rVar.f1387s--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c1360o2.j());
                int iJ2 = c1360o2.j();
                for (int i20 = 0; i20 < iJ2; i20++) {
                    arrayList2.add(c1360o2.k(i20));
                }
                C0096n c0096n2 = new C0096n(arrayList2, j10);
                int size2 = arrayList2.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i21);
                    if (j10.a(((v) obj).f1132a)) {
                        break;
                    }
                    i21++;
                }
                v vVar5 = (v) obj;
                if (vVar5 != null) {
                    boolean z18 = vVar5.f1135d;
                    if (z10) {
                        z11 = false;
                        if (!this.f1116i && (z18 || vVar5.f1138h)) {
                            j0 j0Var4 = this.f1114f;
                            p251z9.j.b(j0Var4);
                            long j16 = j0Var4.f3170t;
                            long j17 = vVar5.f1134c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j17 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j17 & 4294967295L));
                            int i22 = (int) (j16 >> 32);
                            this.f1116i = !((fIntBitsToFloat2 > ((float) ((int) (j16 & 4294967295L))) ? z17 : false) | (fIntBitsToFloat > ((float) i22) ? z17 : false) | (fIntBitsToFloat < 0.0f ? z17 : false) | (fIntBitsToFloat2 < 0.0f ? z17 : false));
                        }
                    } else {
                        z11 = false;
                        this.f1116i = false;
                    }
                    boolean z19 = this.f1116i;
                    boolean z20 = this.f1115h;
                    if (z19 == z20 || !((i10 = c0096n2.f1122d) == 3 || i10 == 4 || i10 == 5)) {
                        int i23 = c0096n2.f1122d;
                        if (i23 == 4 && z20 && !this.j) {
                            c0096n2.f1122d = 3;
                        } else if (i23 == 5 && z19 && z18) {
                            c0096n2.f1122d = 3;
                        }
                    } else {
                        c0096n2.f1122d = z19 ? 4 : 5;
                    }
                } else {
                    z11 = false;
                }
                if (!z16 && c0096n2.f1122d == 3 && (c0096n = this.g) != null) {
                    ?? r10 = c0096n.f1119a;
                    int size3 = r10.size();
                    ?? r11 = c0096n2.f1119a;
                    if (size3 != r11.size()) {
                        z12 = z17;
                        break;
                    }
                    int size4 = r11.size();
                    ?? r12 = z11;
                    while (true) {
                        if (r12 >= size4) {
                            z12 = z11;
                            break;
                        }
                        if (!p171r0.c.b(((v) r10.get(r12)).f1134c, ((v) r11.get(r12)).f1134c)) {
                            z12 = z17;
                            break;
                        }
                        r12++;
                    }
                } else {
                    z12 = z17;
                    break;
                }
                this.g = c0096n2;
                return z12;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // D0.C0095m
    public final void b(J1 j10) {
        super.b(j10);
        C0096n c0096n = this.g;
        if (c0096n == null) {
            return;
        }
        this.f1115h = this.f1116i;
        ?? r10 = c0096n.f1119a;
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = (v) r10.get(i10);
            boolean z10 = vVar.f1135d;
            long j = vVar.f1132a;
            boolean zA = j10.a(j);
            boolean z11 = this.f1116i;
            if ((!z10 && !zA) || (!z10 && !z11)) {
                this.f1112d.o(j);
            }
        }
        this.f1116i = false;
        this.j = c0096n.f1122d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        p011b0.e eVar = this.f1117a;
        Object[] objArr = eVar.f13125r;
        int i10 = eVar.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            ((C0094l) objArr[i11]).c();
        }
        ?? F10 = this.f1111c;
        ?? eVar2 = 0;
        while (F10 != 0) {
            if (F10 instanceof w0) {
                ((w0) F10).R();
            } else if ((F10.f19341t & 16) != 0 && (F10 instanceof AbstractC0291n)) {
                l0.q qVar = ((AbstractC0291n) F10).f4151G;
                int i12 = 0;
                F10 = F10;
                eVar2 = eVar2;
                while (qVar != null) {
                    if ((qVar.f19341t & 16) != 0) {
                        i12++;
                        if (i12 == 1) {
                            eVar2 = eVar2;
                            F10 = qVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new p011b0.e(new l0.q[16]);
                            }
                            if (F10 != 0) {
                                eVar2.b(F10);
                                F10 = 0;
                            }
                            eVar2.b(qVar);
                        }
                    }
                    qVar = qVar.f19344w;
                    F10 = F10;
                    eVar2 = eVar2;
                }
                if (i12 == 1) {
                }
            }
            F10 = AbstractC0283f.f(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(J1 j10) {
        C1360o c1360o = this.f1113e;
        boolean z10 = false;
        z10 = false;
        if (c1360o.j() != 0) {
            l0.q qVar = this.f1111c;
            if (qVar.f19338E) {
                C0096n c0096n = this.g;
                p251z9.j.b(c0096n);
                j0 j0Var = this.f1114f;
                p251z9.j.b(j0Var);
                long j = j0Var.f3170t;
                ?? F10 = qVar;
                ?? eVar = 0;
                while (F10 != 0) {
                    if (F10 instanceof w0) {
                        ((w0) F10).C(c0096n, EnumC0097o.f1125t, j);
                    } else if ((F10.f19341t & 16) != 0 && (F10 instanceof AbstractC0291n)) {
                        l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                        int i10 = 0;
                        while (qVar2 != null) {
                            if ((qVar2.f19341t & 16) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    F10 = F10;
                                    eVar = eVar;
                                    eVar = eVar;
                                    F10 = qVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new p011b0.e(new l0.q[16]);
                                    }
                                    if (F10 != 0) {
                                        eVar.b(F10);
                                        F10 = 0;
                                    }
                                    eVar.b(qVar2);
                                }
                            } else {
                                F10 = F10;
                                eVar = eVar;
                            }
                            qVar2 = qVar2.f19344w;
                            F10 = F10;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                            F10 = F10;
                            eVar = eVar;
                        } else {
                            F10 = F10;
                            eVar = eVar;
                        }
                    }
                    F10 = AbstractC0283f.f(eVar);
                }
                if (qVar.f19338E) {
                    p011b0.e eVar2 = this.f1117a;
                    Object[] objArr = eVar2.f13125r;
                    int i11 = eVar2.f13127t;
                    for (int i12 = 0; i12 < i11; i12++) {
                        ((C0094l) objArr[i12]).d(j10);
                    }
                }
                z10 = true;
            }
        }
        b(j10);
        c1360o.b();
        this.f1114f = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(J1 j10, boolean z10) {
        if (this.f1113e.j() == 0) {
            return false;
        }
        ?? F10 = this.f1111c;
        if (!F10.f19338E) {
            return false;
        }
        C0096n c0096n = this.g;
        p251z9.j.b(c0096n);
        j0 j0Var = this.f1114f;
        p251z9.j.b(j0Var);
        long j = j0Var.f3170t;
        ?? F11 = F10;
        ?? eVar = 0;
        while (F11 != 0) {
            if (F11 instanceof w0) {
                ((w0) F11).C(c0096n, EnumC0097o.f1123r, j);
            } else if ((F11.f19341t & 16) != 0 && (F11 instanceof AbstractC0291n)) {
                l0.q qVar = ((AbstractC0291n) F11).f4151G;
                int i10 = 0;
                while (qVar != null) {
                    if ((qVar.f19341t & 16) != 0) {
                        i10++;
                        if (i10 == 1) {
                            F11 = F11;
                            eVar = eVar;
                            eVar = eVar;
                            F11 = qVar;
                        } else {
                            if (eVar == 0) {
                                eVar = new p011b0.e(new l0.q[16]);
                            }
                            if (F11 != 0) {
                                eVar.b(F11);
                                F11 = 0;
                            }
                            eVar.b(qVar);
                        }
                    } else {
                        F11 = F11;
                        eVar = eVar;
                    }
                    qVar = qVar.f19344w;
                    F11 = F11;
                    eVar = eVar;
                }
                if (i10 == 1) {
                    F11 = F11;
                    eVar = eVar;
                } else {
                    F11 = F11;
                    eVar = eVar;
                }
            }
            F11 = AbstractC0283f.f(eVar);
        }
        if (F10.f19338E) {
            p011b0.e eVar2 = this.f1117a;
            Object[] objArr = eVar2.f13125r;
            int i11 = eVar2.f13127t;
            for (int i12 = 0; i12 < i11; i12++) {
                C0094l c0094l = (C0094l) objArr[i12];
                p251z9.j.b(this.f1114f);
                c0094l.e(j10, z10);
            }
        }
        if (F10.f19338E) {
            ?? eVar3 = 0;
            while (F10 != 0) {
                if (F10 instanceof w0) {
                    ((w0) F10).C(c0096n, EnumC0097o.f1124s, j);
                } else if ((F10.f19341t & 16) != 0 && (F10 instanceof AbstractC0291n)) {
                    l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                    int i13 = 0;
                    while (qVar2 != null) {
                        if ((qVar2.f19341t & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                F10 = F10;
                                eVar3 = eVar3;
                                eVar3 = eVar3;
                                F10 = qVar2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new p011b0.e(new l0.q[16]);
                                }
                                if (F10 != 0) {
                                    eVar3.b(F10);
                                    F10 = 0;
                                }
                                eVar3.b(qVar2);
                            }
                        } else {
                            F10 = F10;
                            eVar3 = eVar3;
                        }
                        qVar2 = qVar2.f19344w;
                        F10 = F10;
                        eVar3 = eVar3;
                    }
                    if (i13 == 1) {
                        F10 = F10;
                        eVar3 = eVar3;
                    } else {
                        F10 = F10;
                        eVar3 = eVar3;
                    }
                }
                F10 = AbstractC0283f.f(eVar3);
            }
        }
        return true;
    }

    public final void f(long j, u.A a9) {
        Da.r rVar = this.f1112d;
        if (rVar.d(j) && a9.f(this) < 0) {
            rVar.o(j);
            this.f1113e.i(j);
        }
        p011b0.e eVar = this.f1117a;
        Object[] objArr = eVar.f13125r;
        int i10 = eVar.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            ((C0094l) objArr[i11]).f(j, a9);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f1111c + ", children=" + this.f1117a + ", pointerIds=" + this.f1112d + ')';
    }
}
