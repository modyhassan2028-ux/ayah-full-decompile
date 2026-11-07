package Y9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W9.f[] f10469a = new W9.f[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U9.a[] f10470b = new U9.a[0];

    public static final C0667x a(U9.a aVar, String str) {
        return new C0667x(str, new C0668y(aVar));
    }

    public static final Set b(W9.f fVar) {
        p251z9.j.e(fVar, "<this>");
        if (fVar instanceof InterfaceC0654j) {
            return ((InterfaceC0654j) fVar).g();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int iD = fVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            hashSet.add(fVar.e(i10));
        }
        return hashSet;
    }

    public static final W9.f[] c(List list) {
        W9.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (W9.f[]) list.toArray(new W9.f[0])) == null) ? f10469a : fVarArr;
    }

    public static final int d(W9.f fVar, W9.f[] fVarArr) {
        p251z9.j.e(fVarArr, "typeParams");
        int iHashCode = (fVar.b().hashCode() * 31) + Arrays.hashCode(fVarArr);
        int iD = fVar.d();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i11 = iD - 1;
            int i12 = i10 * 31;
            String strB = fVar.j(fVar.d() - iD).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i10 = i12 + iHashCode2;
            iD = i11;
        }
        int iD2 = fVar.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iD2 - 1;
            int i14 = iHashCode3 * 31;
            va.g gVarC = fVar.j(fVar.d() - iD2).c();
            iHashCode3 = i14 + (gVarC != null ? gVarC.hashCode() : 0);
            iD2 = i13;
        }
    }

    public static final void e(int i10, int i11, W9.f fVar) {
        p251z9.j.e(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(fVar.e(i13));
            }
            i12 >>>= 1;
        }
        String strB = fVar.b();
        p251z9.j.e(strB, "serialName");
        throw new U9.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strB + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strB + "', but they were missing", null);
    }

    public static final void f(String str, p251z9.e eVar) {
        String string;
        String str2 = "in the polymorphic scope of '" + eVar.c() + '\'';
        if (str == null) {
            string = p245z2.a.A('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sb = new StringBuilder("Serializer for subclass '");
            sb.append(str);
            sb.append("' is not found ");
            sb.append(str2);
            sb.append(".\nCheck if class with serial name '");
            p245z2.a.I(sb, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sb.append(eVar.c());
            sb.append("' has to be sealed and '@Serializable'.");
            string = sb.toString();
        }
        throw new U9.d(string);
    }
}
