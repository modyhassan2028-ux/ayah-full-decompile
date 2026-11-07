package D0;

import H0.InterfaceC0219s;
import K0.P;
import android.graphics.Matrix;
import com.google.android.gms.internal.measurement.J1;
import java.util.List;
import u.C1360o;

/* JADX INFO: renamed from: D0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0087e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1098f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f1099h;

    /* JADX WARN: Multi-variable type inference failed */
    public C0087e(p241y9.e eVar) {
        this.f1097e = (p251z9.k) eVar;
        this.g = p180s0.A.a();
        this.f1099h = p180s0.A.a();
        this.f1095c = true;
        this.f1096d = true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    public void a(long j, List list, boolean z10) {
        C0094l c0094l;
        Object objD;
        Object obj;
        C0095m c0095m = (C0095m) this.g;
        u.w wVar = (u.w) this.f1099h;
        wVar.a();
        int size = list.size();
        C0095m c0095m2 = c0095m;
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            l0.q qVar = (l0.q) list.get(i10);
            if (qVar.f19338E) {
                qVar.f19337D = new C0086d(0, this, qVar);
                if (z11) {
                    p011b0.e eVar = c0095m2.f1117a;
                    Object[] objArr = eVar.f13125r;
                    int i11 = eVar.f13127t;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i12];
                        if (p251z9.j.a(((C0094l) obj).f1111c, qVar)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    c0094l = (C0094l) obj;
                    if (c0094l != null) {
                        c0094l.f1116i = true;
                        c0094l.f1112d.b(j);
                        Object objD2 = wVar.d(j);
                        if (objD2 == null) {
                            objD2 = new u.A();
                            wVar.g(j, objD2);
                        }
                        ((u.A) objD2).a(c0094l);
                    } else {
                        z11 = false;
                        c0094l = new C0094l(qVar);
                        c0094l.f1112d.b(j);
                        objD = wVar.d(j);
                        if (objD == null) {
                            objD = new u.A();
                            wVar.g(j, objD);
                        }
                        ((u.A) objD).a(c0094l);
                        c0095m2.f1117a.b(c0094l);
                    }
                } else {
                    c0094l = new C0094l(qVar);
                    c0094l.f1112d.b(j);
                    objD = wVar.d(j);
                    if (objD == null) {
                        objD = new u.A();
                        wVar.g(j, objD);
                    }
                    ((u.A) objD).a(c0094l);
                    c0095m2.f1117a.b(c0094l);
                }
                c0095m2 = c0094l;
            }
        }
        if (!z10) {
            return;
        }
        long[] jArr = wVar.f22768b;
        Object[] objArr2 = wVar.f22769c;
        long[] jArr2 = wVar.f22767a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr2[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j10) < 128) {
                        int i17 = (i13 << 3) + i16;
                        long j11 = jArr[i17];
                        u.A a9 = (u.A) objArr2[i17];
                        p011b0.e eVar2 = c0095m.f1117a;
                        Object[] objArr3 = eVar2.f13125r;
                        int i18 = eVar2.f13127t;
                        for (int i19 = 0; i19 < i18; i19++) {
                            ((C0094l) objArr3[i19]).f(j11, a9);
                        }
                    }
                    j10 >>= i14;
                    i16++;
                    i14 = i14;
                }
                if (i15 != i14) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public float[] b(Object obj) {
        float[] fArr = (float[]) this.f1099h;
        if (this.f1094b) {
            this.f1095c = P.j(c(obj), fArr);
            this.f1094b = false;
        }
        if (this.f1095c) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [y9.e, z9.k] */
    public float[] c(Object obj) {
        float[] fArr = (float[]) this.g;
        if (!this.f1093a) {
            return fArr;
        }
        Matrix matrix = (Matrix) this.f1098f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f1098f = matrix;
        }
        ((p251z9.k) this.f1097e).invoke(obj, matrix);
        p180s0.F.q(matrix, fArr);
        this.f1093a = false;
        this.f1096d = p180s0.F.n(fArr);
        return fArr;
    }

    public boolean d(J1 j10, boolean z10) {
        u.A a9 = (u.A) this.f1098f;
        C0095m c0095m = (C0095m) this.g;
        boolean zA = c0095m.a((C1360o) j10.f14056c, (InterfaceC0219s) this.f1097e, j10, z10);
        p011b0.e eVar = c0095m.f1117a;
        if (!zA) {
            return false;
        }
        boolean z11 = true;
        this.f1093a = true;
        Object[] objArr = eVar.f13125r;
        int i10 = eVar.f13127t;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z12 = ((C0094l) objArr[i11]).e(j10, z10) || z12;
        }
        Object[] objArr2 = eVar.f13125r;
        int i12 = eVar.f13127t;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = ((C0094l) objArr2[i13]).d(j10) || z13;
        }
        c0095m.b(j10);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f1093a = false;
        if (this.f1096d) {
            this.f1096d = false;
            int i14 = a9.f22651b;
            for (int i15 = 0; i15 < i14; i15++) {
                g((l0.q) a9.e(i15));
            }
            a9.c();
        }
        if (this.f1094b) {
            this.f1094b = false;
            f();
        }
        if (this.f1095c) {
            this.f1095c = false;
            c0095m.f1117a.g();
        }
        return z11;
    }

    public void e() {
        this.f1093a = true;
        this.f1094b = true;
    }

    public void f() {
        C0095m c0095m = (C0095m) this.g;
        if (this.f1093a) {
            this.f1094b = true;
            return;
        }
        p011b0.e eVar = c0095m.f1117a;
        Object[] objArr = eVar.f13125r;
        int i10 = eVar.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            ((C0094l) objArr[i11]).c();
        }
        if (this.f1095c) {
            this.f1095c = true;
        } else {
            c0095m.f1117a.g();
        }
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
    public void g(l0.q qVar) {
        if (this.f1093a) {
            this.f1096d = true;
            ((u.A) this.f1098f).a(qVar);
            return;
        }
        C0095m c0095m = (C0095m) this.g;
        u.A a9 = c0095m.f1118b;
        a9.c();
        a9.a(c0095m);
        while (a9.h()) {
            C0095m c0095m2 = (C0095m) a9.j(a9.f22651b - 1);
            int i10 = 0;
            while (true) {
                p011b0.e eVar = c0095m2.f1117a;
                if (i10 < eVar.f13127t) {
                    C0094l c0094l = (C0094l) eVar.f13125r[i10];
                    if (p251z9.j.a(c0094l.f1111c, qVar)) {
                        c0095m2.f1117a.k(c0094l);
                        c0094l.c();
                    } else {
                        a9.a(c0094l);
                        i10++;
                    }
                }
            }
        }
    }

    public C0087e(InterfaceC0219s interfaceC0219s) {
        this.f1097e = interfaceC0219s;
        this.f1098f = new u.A();
        this.g = new C0095m();
        this.f1099h = new u.w(10);
    }
}
