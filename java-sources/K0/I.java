package K0;

import U0.C0515g;
import android.content.res.Resources;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import u.AbstractC1355j;
import u.AbstractC1356k;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator[] f4946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f4947b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new H(1, new H(i10 == 0 ? C0.f4880c : C0.f4879b));
            i10++;
        }
        f4946a = comparatorArr;
        f4947b = G.f4928s;
    }

    public static final boolean a(R0.p pVar) {
        return !pVar.i().f7108r.c(R0.s.f7163i);
    }

    public static final void b(R0.p pVar, ArrayList arrayList, u.t tVar, AbstractC1355j abstractC1355j, Resources resources) {
        boolean zF = f(pVar);
        int i10 = pVar.g;
        R0.j jVar = pVar.f7119d;
        Object objG = jVar.f7108r.g(R0.s.f7166m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || g(pVar, resources)) && abstractC1355j.a(i10)) {
            arrayList.add(pVar);
        }
        if (zBooleanValue) {
            tVar.h(i10, h(zF, R0.p.h(7, pVar), abstractC1355j, resources));
            return;
        }
        List listH = R0.p.h(7, pVar);
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            b((R0.p) listH.get(i11), arrayList, tVar, abstractC1355j, resources);
        }
    }

    public static final boolean c(R0.p pVar) {
        Object objG = pVar.f7119d.f7108r.g(R0.s.f7150H);
        if (objG == null) {
            objG = null;
        }
        T0.a aVar = (T0.a) objG;
        u.E e10 = pVar.f7119d.f7108r;
        Object objG2 = e10.g(R0.s.f7176w);
        if (objG2 == null) {
            objG2 = null;
        }
        R0.g gVar = (R0.g) objG2;
        boolean z10 = aVar != null;
        Object objG3 = e10.g(R0.s.f7149G);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (gVar != null && gVar.f7079a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String d(R0.p pVar, Resources resources) {
        int iL;
        R0.j jVar = pVar.f7119d;
        R0.j jVar2 = pVar.f7119d;
        Object objG = jVar.f7108r.g(R0.s.f7157b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        u.E e10 = jVar2.f7108r;
        Object objG2 = e10.g(R0.s.f7150H);
        if (objG2 == null) {
            objG2 = null;
        }
        T0.a aVar = (T0.a) objG2;
        Object objG3 = e10.g(R0.s.f7176w);
        if (objG3 == null) {
            objG3 = null;
        }
        R0.g gVar = (R0.g) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (gVar != null && gVar.f7079a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (gVar != null && gVar.f7079a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = e10.g(R0.s.f7149G);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f7079a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = e10.g(R0.s.f7158c);
        if (objG5 == null) {
            objG5 = null;
        }
        R0.f fVar = (R0.f) objG5;
        if (fVar != null) {
            if (fVar != R0.f.f7075d) {
                if (objG == null) {
                    E9.a aVar2 = fVar.f7077b;
                    float f3 = aVar2.f1994b;
                    float f7 = aVar2.f1993a;
                    float f10 = f3 - f7 == 0.0f ? 0.0f : (fVar.f7076a - f7) / (aVar2.f1994b - f7);
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (f10 == 0.0f) {
                        iL = 0;
                    } else {
                        iL = 100;
                        if (f10 != 1.0f) {
                            iL = B0.c.l(Math.round(f10 * 100), 1, 99);
                        }
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(iL));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        R0.v vVar = R0.s.f7146D;
        if (e10.c(vVar)) {
            u.E e11 = new R0.p(pVar.f7116a, true, pVar.f7118c, jVar2).i().f7108r;
            Object objG6 = e11.g(R0.s.f7156a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = e11.g(R0.s.f7179z);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = e11.g(vVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final C0515g e(R0.p pVar) {
        R0.j jVar = pVar.f7119d;
        R0.v vVar = R0.s.f7156a;
        C0515g c0515g = (C0515g) B9.a.D(jVar, R0.s.f7146D);
        List list = (List) B9.a.D(pVar.f7119d, R0.s.f7179z);
        return c0515g == null ? list != null ? (C0515g) p120l9.m.g0(list) : null : c0515g;
    }

    public static final boolean f(R0.p pVar) {
        return pVar.f7118c.Q == p063g1.m.f16262s;
    }

    public static final boolean g(R0.p pVar, Resources resources) {
        Object objG = pVar.f7119d.f7108r.g(R0.s.f7156a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !P.k(pVar) && (pVar.f7119d.f7110t || (pVar.m() && ((list != null ? (String) p120l9.m.g0(list) : null) != null || e(pVar) != null || d(pVar, resources) != null || c(pVar))));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList h(boolean z10, List list, AbstractC1355j abstractC1355j, Resources resources) {
        int i10;
        u.t tVar = AbstractC1356k.f22736a;
        u.t tVar2 = new u.t();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b((R0.p) list.get(i11), arrayList, tVar2, abstractC1355j, resources);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iE = AbstractC0813f2.E(arrayList);
        if (iE >= 0) {
            int i12 = 0;
            while (true) {
                R0.p pVar = (R0.p) arrayList.get(i12);
                if (i12 == 0) {
                    i10 = 0;
                    p171r0.e eVarF = pVar.f();
                    R0.p[] pVarArr = new R0.p[1];
                    pVarArr[i10] = pVar;
                    arrayList2.add(new p110k9.j(eVarF, AbstractC0813f2.M(pVarArr)));
                    break;
                }
                float f3 = pVar.f().f21390b;
                float f7 = pVar.f().f21392d;
                boolean z11 = f3 >= f7;
                int iE2 = AbstractC0813f2.E(arrayList2);
                if (iE2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        p171r0.e eVar = (p171r0.e) ((p110k9.j) arrayList2.get(i13)).f19077r;
                        float f10 = eVar.f21390b;
                        i10 = 0;
                        float f11 = eVar.f21392d;
                        Object[] objArr = f10 >= f11;
                        if (!z11 && objArr != true && Math.max(f3, f10) < Math.min(f7, f11)) {
                            arrayList2.set(i13, new p110k9.j(new p171r0.e(Math.max(eVar.f21389a, 0.0f), Math.max(eVar.f21390b, f3), Math.min(eVar.f21391c, Float.POSITIVE_INFINITY), Math.min(f11, f7)), ((p110k9.j) arrayList2.get(i13)).f19078s));
                            ((List) ((p110k9.j) arrayList2.get(i13)).f19078s).add(pVar);
                            break;
                        }
                        if (i13 != iE2) {
                            i13++;
                        }
                    }
                } else {
                    i10 = 0;
                }
                p171r0.e eVarF2 = pVar.f();
                R0.p[] pVarArr2 = new R0.p[1];
                pVarArr2[i10] = pVar;
                arrayList2.add(new p110k9.j(eVarF2, AbstractC0813f2.M(pVarArr2)));
                break;
                if (i12 == iE) {
                    break;
                }
                i12++;
            }
        } else {
            i10 = 0;
        }
        p120l9.p.c0(arrayList2, C0.f4881d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f4946a[!z10 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i14 = i10; i14 < size2; i14++) {
            p110k9.j jVar = (p110k9.j) arrayList2.get(i14);
            p120l9.p.c0((List) jVar.f19078s, comparator);
            arrayList3.addAll((Collection) jVar.f19078s);
        }
        int i15 = i10;
        p120l9.p.c0(arrayList3, new F(i15, f4947b));
        int size3 = i15;
        while (size3 <= AbstractC0813f2.E(arrayList3)) {
            List list2 = (List) tVar2.b(((R0.p) arrayList3.get(size3)).g);
            if (list2 != null) {
                if (g((R0.p) arrayList3.get(size3), resources)) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
