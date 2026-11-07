package H9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends p017b7.g {
    public static String H0(String str) {
        p251z9.j.e(str, "<this>");
        return G9.k.c0(new G9.p(new G9.l(1, str), new E5.a(4, "    "), 1), "\n");
    }

    public static String I0(String str) {
        List listK;
        Comparable comparable;
        p251z9.j.e(str, "<this>");
        g gVar = new g(str);
        if (gVar.hasNext()) {
            Object next = gVar.next();
            if (gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                listK = arrayList;
            } else {
                listK = AbstractC0813f2.K(next);
            }
        } else {
            listK = p120l9.r.f19440r;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listK) {
            if (!o.e1((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(p120l9.n.a0(arrayList2, 10));
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!F9.n.I(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listK.size();
        int iE = AbstractC0813f2.E(listK);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listK) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            String str3 = (String) obj3;
            String strW0 = ((i10 == 0 || i10 == iE) && o.e1(str3)) ? null : o.W0(iIntValue, str3);
            if (strW0 != null) {
                arrayList4.add(strW0);
            }
            i10 = i12;
        }
        StringBuilder sb = new StringBuilder(length3);
        p120l9.m.k0(arrayList4, sb, null, 124);
        return sb.toString();
    }

    public static String J0(String str) {
        List listK;
        p251z9.j.e(str, "<this>");
        if (o.e1("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        g gVar = new g(str);
        if (gVar.hasNext()) {
            Object next = gVar.next();
            if (gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                listK = arrayList;
            } else {
                listK = AbstractC0813f2.K(next);
            }
        } else {
            listK = p120l9.r.f19440r;
        }
        int length = str.length();
        listK.size();
        int iE = AbstractC0813f2.E(listK);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listK.iterator();
        int i10 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                p120l9.m.k0(arrayList2, sb, null, 124);
                return sb.toString();
            }
            Object next2 = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            String str2 = (String) next2;
            if ((i10 != 0 && i10 != iE) || !o.e1(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!F9.n.I(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && v.Q0(i12, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    p251z9.j.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i10 = i11;
        }
    }
}
