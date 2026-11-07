package J0;

import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.C0424q;
import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: J0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0280d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4062a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4067f;
    public Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f4068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f4069i;

    public /* synthetic */ C0280d0() {
    }

    public static final void a(C0280d0 c0280d0, l0.q qVar, j0 j0Var) {
        for (l0.q qVar2 = qVar.f19343v; qVar2 != null; qVar2 = qVar2.f19343v) {
            if (qVar2 == f0.f4084a) {
                I iU = ((I) c0280d0.f4063b).u();
                j0Var.f4127E = iU != null ? (C0298v) iU.f3914W.f4064c : null;
                c0280d0.f4065d = j0Var;
                return;
            } else {
                if ((qVar2.f19341t & 2) != 0) {
                    return;
                }
                qVar2.u0(j0Var);
            }
        }
    }

    public static l0.q d(l0.p pVar, l0.q qVar) {
        l0.q qVarK;
        if (pVar instanceof AbstractC0274a0) {
            qVarK = ((AbstractC0274a0) pVar).k();
            qVarK.f19341t = k0.f(qVarK);
        } else {
            C0277c c0277c = new C0277c();
            c0277c.f19341t = k0.d(pVar);
            c0277c.f4052F = pVar;
            c0277c.f4054H = new HashSet();
            qVarK = c0277c;
        }
        if (qVarK.f19338E) {
            G0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        qVarK.f19347z = true;
        l0.q qVar2 = qVar.f19344w;
        if (qVar2 != null) {
            qVar2.f19343v = qVarK;
            qVarK.f19344w = qVar2;
        }
        qVar.f19344w = qVarK;
        qVarK.f19343v = qVar;
        return qVarK;
    }

    public static l0.q f(l0.q qVar) {
        boolean z10 = qVar.f19338E;
        if (z10) {
            u.z zVar = k0.f4143a;
            if (!z10) {
                G0.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            k0.a(qVar, -1, 2);
            qVar.s0();
            qVar.k0();
        }
        l0.q qVar2 = qVar.f19344w;
        l0.q qVar3 = qVar.f19343v;
        if (qVar2 != null) {
            qVar2.f19343v = qVar3;
            qVar.f19344w = null;
        }
        if (qVar3 != null) {
            qVar3.f19344w = qVar2;
            qVar.f19343v = null;
        }
        p251z9.j.b(qVar3);
        return qVar3;
    }

    public static void p(l0.p pVar, l0.p pVar2, l0.q qVar) {
        if ((pVar instanceof AbstractC0274a0) && (pVar2 instanceof AbstractC0274a0)) {
            C0282e0 c0282e0 = f0.f4084a;
            p251z9.j.c(qVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC0274a0) pVar2).l(qVar);
            if (qVar.f19338E) {
                k0.c(qVar);
                return;
            } else {
                qVar.f19334A = true;
                return;
            }
        }
        if (!(qVar instanceof C0277c)) {
            G0.a.b("Unknown Modifier.Node type");
            return;
        }
        C0277c c0277c = (C0277c) qVar;
        if (c0277c.f19338E) {
            c0277c.w0();
        }
        c0277c.f4052F = pVar2;
        c0277c.f19341t = k0.d(pVar2);
        if (c0277c.f19338E) {
            c0277c.v0(false);
        }
        if (qVar.f19338E) {
            k0.c(qVar);
        } else {
            qVar.f19334A = true;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public p246z4.l b(p065g3.c cVar, p175r4.a aVar, p246z4.a aVar2) {
        int i10;
        Object bVar;
        z3.k kVar = aVar.f21553r;
        p065g3.b bVar2 = (p065g3.b) this.f4069i;
        N9.k0 k0Var = (N9.k0) this.g;
        N9.k0 k0Var2 = (N9.k0) this.f4066e;
        ?? r10 = cVar.g;
        int size = r10.size();
        z3.k kVar2 = aVar2.f24806a;
        int i11 = aVar2.f24809d;
        int i12 = aVar2.f24808c;
        z3.k kVarF = p181s2.o.f(kVar2, size);
        int i13 = kVarF.f24796r;
        int i14 = kVar2.f24797s;
        int i15 = kVar2.f24796r;
        int i16 = i14 - 1;
        float f3 = 1000;
        int i17 = (int) (((p065g3.b) ((i16 < 0 || i16 >= r10.size()) ? bVar2 : r10.get(i16))).f16283b * f3);
        int i18 = aVar.f21556u;
        z3.k kVar3 = aVar.f21554s;
        p246z4.l lVar = p246z4.l.f24829t;
        if (i18 == -1 || i12 + 1 < i18) {
            p246z4.a aVarA = p246z4.a.a(aVar2, null, i12 + 1, 0, 11);
            k0Var.getClass();
            k0Var.n(null, aVarA);
            Object bVar3 = i13 != i15 ? new p246z4.b(System.currentTimeMillis(), true) : new p246z4.c(System.currentTimeMillis(), i17);
            k0Var2.getClass();
            k0Var2.n(null, bVar3);
            return i13 != i15 ? lVar : p246z4.l.f24827r;
        }
        int iA = kVarF.compareTo(kVar3);
        p246z4.l lVar2 = p246z4.l.f24828s;
        if (iA > 0 && ((i10 = aVar.f21557v) == -1 || i11 + 1 < i10)) {
            p246z4.a aVarA2 = p246z4.a.a(aVar2, kVar, 0, i11 + 1, 2);
            k0Var.getClass();
            k0Var.n(null, aVarA2);
            int i19 = kVar.f24796r;
            if (i19 == i15 && i19 == i13) {
                int i20 = kVar.f24797s - 1;
                bVar = new p246z4.c(System.currentTimeMillis(), (int) (((p065g3.b) ((i20 < 0 || i20 >= r10.size()) ? bVar2 : r10.get(i20))).f16283b * f3));
            } else {
                bVar = new p246z4.b(System.currentTimeMillis(), i19 == i15);
            }
            k0Var2.getClass();
            k0Var2.n(null, bVar);
            return kVar.f24796r == i15 ? lVar2 : lVar;
        }
        int iA2 = kVarF.compareTo(kVar3);
        p246z4.l lVar3 = p246z4.l.f24831v;
        if (iA2 > 0) {
            p246z4.e eVar = new p246z4.e(System.currentTimeMillis());
            k0Var2.getClass();
            k0Var2.n(null, eVar);
            return lVar3;
        }
        if (i13 != i15) {
            p246z4.a aVarA3 = p246z4.a.a(aVar2, kVarF, 0, 0, 10);
            k0Var.getClass();
            k0Var.n(null, aVarA3);
            p246z4.b bVar4 = new p246z4.b(System.currentTimeMillis(), false);
            k0Var2.getClass();
            k0Var2.n(null, bVar4);
            return lVar;
        }
        if (kVarF.equals(kVar3) && kVarF.equals(kVar2)) {
            p246z4.e eVar2 = new p246z4.e(System.currentTimeMillis());
            k0Var2.getClass();
            k0Var2.n(null, eVar2);
            return lVar3;
        }
        p246z4.a aVarA4 = p246z4.a.a(aVar2, kVarF, 0, 0, 10);
        k0Var.getClass();
        k0Var.n(null, aVarA4);
        return lVar2;
    }

    public p065g3.c c() {
        p246z4.a aVar = (p246z4.a) ((N9.k0) this.g).getValue();
        if (aVar == null) {
            return null;
        }
        p237y4.e eVar = (p237y4.e) this.f4065d;
        int i10 = aVar.f24806a.f24796r;
        String str = aVar.f24807b;
        eVar.getClass();
        p251z9.j.e(str, "reciterId");
        return (p065g3.c) eVar.f24646a.g(new p246z4.k(i10, str));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    public p124m3.j e() {
        p246z4.a aVar = (p246z4.a) ((N9.k0) this.g).getValue();
        if (aVar == null) {
            return null;
        }
        z3.k kVar = aVar.f24806a;
        p124m3.a aVar2 = (p124m3.a) ((p237y4.c) this.f4064c).f24639b.g(Integer.valueOf(kVar.f24796r));
        if (aVar2 != null) {
            return (p124m3.j) aVar2.f19536l.get(kVar.f24797s - 1);
        }
        return null;
    }

    public boolean g(int i10) {
        return (i10 & ((l0.q) this.f4067f).f19342u) != 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public int h() {
        p065g3.c cVarC = c();
        p246z4.a aVar = (p246z4.a) ((N9.k0) this.g).getValue();
        z3.k kVar = aVar != null ? aVar.f24806a : null;
        if (cVarC == null || kVar == null) {
            return 0;
        }
        p065g3.b bVar = (p065g3.b) p120l9.m.h0(kVar.f24797s, cVarC.g);
        return (int) ((bVar != null ? bVar.f16283b : ((float) cVarC.f16289f) + 0.5f) * 1000);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0125  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00b6, please report this as an issue */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.List] */
    public Object i(q9.c cVar) {
        p228x4.a aVar;
        p246z4.a aVar2;
        p246z4.a aVar3;
        p124m3.a aVar4;
        Object objA;
        p124m3.a aVar5;
        p246z4.a aVar6;
        p065g3.c cVar2;
        p065g3.a aVar7;
        int i10;
        int i11;
        File externalFilesDir;
        File file;
        char c10;
        File file2;
        int i12;
        int i13;
        Object obj;
        float f3;
        p237y4.c cVar3 = (p237y4.c) this.f4064c;
        if (cVar instanceof p228x4.a) {
            aVar = (p228x4.a) cVar;
            int i14 = aVar.f24378v;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f24378v = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new p228x4.a(this, cVar);
            }
        } else {
            aVar = new p228x4.a(this, cVar);
        }
        Object objB = aVar.f24376t;
        int i15 = aVar.f24378v;
        p161p9.a aVar8 = p161p9.a.f21156r;
        if (i15 == 0) {
            p110k9.a.e(objB);
            aVar2 = (p246z4.a) ((N9.k0) this.g).getValue();
            if (aVar2 == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            aVar.f24374r = aVar2;
            aVar.f24378v = 1;
            if (cVar3.a(aVar) != aVar8) {
            }
            return aVar8;
        }
        if (i15 == 1) {
            aVar2 = aVar.f24374r;
            p110k9.a.e(objB);
        } else {
            if (i15 == 2) {
                aVar3 = aVar.f24374r;
                p110k9.a.e(objB);
                aVar4 = (p124m3.a) objB;
                p237y4.e eVar = (p237y4.e) this.f4065d;
                int i16 = aVar3.f24806a.f24796r;
                String str = aVar3.f24807b;
                aVar.f24374r = aVar3;
                aVar.f24375s = aVar4;
                aVar.f24378v = 3;
                objA = eVar.a(i16, str, aVar);
                if (objA != aVar8) {
                    p246z4.a aVar9 = aVar3;
                    aVar5 = aVar4;
                    objB = objA;
                    aVar6 = aVar9;
                }
                return aVar8;
            }
            if (i15 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar5 = aVar.f24375s;
            aVar6 = aVar.f24374r;
            p110k9.a.e(objB);
        }
        cVar2 = (p065g3.c) objB;
        Context context = (Context) this.f4063b;
        aVar7 = cVar2.f16285b;
        i10 = cVar2.f16287d;
        p251z9.j.e(aVar7, "reciter");
        p251z9.j.e(aVar5, "sura");
        i11 = aVar5.f19528b;
        externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            file = null;
        } else {
            file = new File(externalFilesDir + File.separator + "audio", aVar7.f16273a);
        }
        if (file != null) {
            c10 = 0;
            file2 = new File(file, String.format(Locale.US, "%03d_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i10)}, 2)).concat(".mp3"));
        } else {
            c10 = 0;
            file2 = null;
        }
        if (file2 == null) {
            return null;
        }
        if (file2.exists()) {
            i12 = aVar6.f24806a.f24797s;
            if (i12 == 1) {
                f3 = (float) cVar2.f16288e;
            } else {
                ?? r10 = cVar2.g;
                i13 = i12 - 1;
                if (i13 >= 0 || i13 >= r10.size()) {
                    obj = (p065g3.b) this.f4069i;
                } else {
                    obj = r10.get(i13);
                }
                f3 = ((p065g3.b) obj).f16283b;
            }
            String absolutePath = file2.getAbsolutePath();
            p251z9.j.d(absolutePath, "getAbsolutePath(...)");
            return new p246z4.h((int) (f3 * 1000), aVar7, absolutePath);
        }
        String str2 = aVar7.f16273a;
        p251z9.j.e(str2, "reciterId");
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(i11);
        Object[] objArr = new Object[1];
        objArr[c10] = numValueOf;
        String str3 = String.format(locale, "%03d", Arrays.copyOf(objArr, 1));
        StringBuilder sb = new StringBuilder("https://audio.ayah.app/");
        sb.append(str2);
        sb.append("/");
        sb.append(str3);
        sb.append("-");
        String strE = p245z2.a.E(sb, i10, ".mp3");
        String absolutePath2 = file2.getAbsolutePath();
        p251z9.j.d(absolutePath2, "getAbsolutePath(...)");
        return new p246z4.i(aVar7, strE, absolutePath2, aVar5);
        int i17 = aVar2.f24806a.f24796r;
        aVar.f24374r = aVar2;
        aVar.f24378v = 2;
        objB = cVar3.b(i17, aVar);
        if (objB != aVar8) {
            aVar3 = aVar2;
            aVar4 = (p124m3.a) objB;
            p237y4.e eVar2 = (p237y4.e) this.f4065d;
            int i18 = aVar3.f24806a.f24796r;
            String str4 = aVar3.f24807b;
            aVar.f24374r = aVar3;
            aVar.f24375s = aVar4;
            aVar.f24378v = 3;
            objA = eVar2.a(i18, str4, aVar);
            if (objA != aVar8) {
                p246z4.a aVar10 = aVar3;
                aVar5 = aVar4;
                objB = objA;
                aVar6 = aVar10;
                cVar2 = (p065g3.c) objB;
                Context context2 = (Context) this.f4063b;
                aVar7 = cVar2.f16285b;
                i10 = cVar2.f16287d;
                p251z9.j.e(aVar7, "reciter");
                p251z9.j.e(aVar5, "sura");
                i11 = aVar5.f19528b;
                externalFilesDir = context2.getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    file = null;
                } else {
                    file = new File(externalFilesDir + File.separator + "audio", aVar7.f16273a);
                }
                if (file != null) {
                    c10 = 0;
                    file2 = new File(file, String.format(Locale.US, "%03d_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i10)}, 2)).concat(".mp3"));
                } else {
                    c10 = 0;
                    file2 = null;
                }
                if (file2 == null) {
                    return null;
                }
                if (file2.exists()) {
                    i12 = aVar6.f24806a.f24797s;
                    if (i12 == 1) {
                        f3 = (float) cVar2.f16288e;
                    } else {
                        ?? r11 = cVar2.g;
                        i13 = i12 - 1;
                        if (i13 >= 0) {
                            obj = (p065g3.b) this.f4069i;
                        } else {
                            obj = (p065g3.b) this.f4069i;
                        }
                        f3 = ((p065g3.b) obj).f16283b;
                    }
                    String absolutePath3 = file2.getAbsolutePath();
                    p251z9.j.d(absolutePath3, "getAbsolutePath(...)");
                    return new p246z4.h((int) (f3 * 1000), aVar7, absolutePath3);
                }
                String str5 = aVar7.f16273a;
                p251z9.j.e(str5, "reciterId");
                Locale locale2 = Locale.US;
                Integer numValueOf2 = Integer.valueOf(i11);
                Object[] objArr2 = new Object[1];
                objArr2[c10] = numValueOf2;
                String str6 = String.format(locale2, "%03d", Arrays.copyOf(objArr2, 1));
                StringBuilder sb2 = new StringBuilder("https://audio.ayah.app/");
                sb2.append(str5);
                sb2.append("/");
                sb2.append(str6);
                sb2.append("-");
                String strE2 = p245z2.a.E(sb2, i10, ".mp3");
                String absolutePath4 = file2.getAbsolutePath();
                p251z9.j.d(absolutePath4, "getAbsolutePath(...)");
                return new p246z4.i(aVar7, strE2, absolutePath4, aVar5);
            }
        }
        return aVar8;
    }

    public void j() {
        N9.k0 k0Var = (N9.k0) this.g;
        p246z4.a aVar = (p246z4.a) k0Var.getValue();
        p175r4.a aVar2 = (p175r4.a) ((N9.k0) this.f4067f).getValue();
        if (aVar == null || aVar2 == null) {
            return;
        }
        p246z4.a aVarA = p246z4.a.a(aVar, aVar2.f21553r, 0, 0, 2);
        k0Var.getClass();
        k0Var.n(null, aVarA);
        N9.k0 k0Var2 = (N9.k0) this.f4066e;
        p246z4.b bVar = new p246z4.b(System.currentTimeMillis(), false);
        k0Var2.getClass();
        k0Var2.n(null, bVar);
    }

    public void k() {
        j0 j0Var = (j0) this.f4065d;
        C0298v c0298v = (C0298v) this.f4064c;
        while (j0Var != c0298v) {
            j0Var.O0();
            j0Var = j0Var.f4126D;
            p251z9.j.b(j0Var);
        }
        c0298v.O0();
        for (l0.q qVar = (l0.q) this.f4067f; qVar != null; qVar = qVar.f19344w) {
            qVar.r0();
            if (qVar.f19347z) {
                u.z zVar = k0.f4143a;
                if (!qVar.f19338E) {
                    G0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                k0.a(qVar, -1, 1);
            }
            if (qVar.f19334A) {
                k0.c(qVar);
            }
            qVar.f19347z = false;
            qVar.f19334A = false;
        }
    }

    public void l() {
        for (l0.q qVar = (z0) this.f4066e; qVar != null; qVar = qVar.f19343v) {
            if (qVar.f19338E) {
                qVar.s0();
            }
        }
        j0 j0Var = (C0298v) this.f4064c;
        j0 j0Var2 = (j0) this.f4065d;
        while (j0Var != j0Var2) {
            q0 q0Var = j0Var.f4140W;
            if (q0Var != null) {
                q0Var.destroy();
            }
            j0Var.f4140W = null;
            j0Var = j0Var.f4127E;
            p251z9.j.b(j0Var);
        }
        q0 q0Var2 = j0Var2.f4140W;
        if (q0Var2 != null) {
            q0Var2.destroy();
        }
        j0Var2.f4140W = null;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0142 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void m(int r32, p011b0.e r33, p011b0.e r34, l0.q r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.C0280d0.m(int, b0.e, b0.e, l0.q, boolean):void");
    }

    public void n() {
        B b5;
        q0 q0Var;
        I i10 = (I) this.f4063b;
        j0 j0Var = (C0298v) this.f4064c;
        for (l0.q qVar = ((z0) this.f4066e).f19343v; qVar != null; qVar = qVar.f19343v) {
            InterfaceC0302z interfaceC0302zG = AbstractC0283f.g(qVar);
            if (interfaceC0302zG != null) {
                j0 j0Var2 = qVar.f19346y;
                if (j0Var2 != null) {
                    b5 = (B) j0Var2;
                    InterfaceC0302z interfaceC0302z = b5.f3876d0;
                    b5.e1(interfaceC0302zG);
                    if (interfaceC0302z != qVar && (q0Var = b5.f4140W) != null) {
                        q0Var.invalidate();
                    }
                } else {
                    b5 = new B(i10, interfaceC0302zG);
                    qVar.u0(b5);
                }
                j0Var.f4127E = b5;
                b5.f4126D = j0Var;
                j0Var = b5;
            } else {
                qVar.u0(j0Var);
            }
        }
        I iU = i10.u();
        j0Var.f4127E = iU != null ? (C0298v) iU.f3914W.f4064c : null;
        this.f4065d = j0Var;
    }

    public void o(p175r4.a aVar) {
        N9.k0 k0Var = (N9.k0) this.f4067f;
        k0Var.getClass();
        k0Var.n(null, aVar);
        N9.k0 k0Var2 = (N9.k0) this.g;
        p246z4.a aVar2 = new p246z4.a(aVar.f21553r, aVar.f21555t, 0, 0);
        k0Var2.getClass();
        k0Var2.n(null, aVar2);
    }

    public String toString() {
        switch (this.f4062a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                l0.q qVar = (l0.q) this.f4067f;
                z0 z0Var = (z0) this.f4066e;
                if (qVar == z0Var) {
                    sb.append("]");
                } else {
                    while (qVar != null && qVar != z0Var) {
                        sb.append(String.valueOf(qVar));
                        if (qVar.f19344w == z0Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            qVar = qVar.f19344w;
                        }
                    }
                }
                String string = sb.toString();
                p251z9.j.d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public C0280d0(Context context, p237y4.c cVar, p237y4.e eVar, p144o3.b bVar) {
        p251z9.j.e(cVar, "suraHelper");
        p251z9.j.e(eVar, "trackHelper");
        p251z9.j.e(bVar, "audioSettingsRequestModel");
        this.f4063b = context;
        this.f4064c = cVar;
        this.f4065d = eVar;
        this.f4066e = AbstractC0419l.c(null);
        this.f4067f = AbstractC0419l.c(null);
        this.g = AbstractC0419l.c(null);
        P9.d dVarD = AbstractC0405x.d();
        this.f4068h = dVarD;
        this.f4069i = new p065g3.b(0, 0.0f);
        AbstractC0419l.u(new C0424q(new C4.c(AbstractC0419l.n(bVar.f20304b, 1), 11), new B2.d(this, null, 20), 2), dVarD);
    }

    public C0280d0(I i10) {
        this.f4063b = i10;
        C0298v c0298v = new C0298v(i10);
        this.f4064c = c0298v;
        this.f4065d = c0298v;
        z0 z0Var = c0298v.f4178d0;
        this.f4066e = z0Var;
        this.f4067f = z0Var;
    }
}
