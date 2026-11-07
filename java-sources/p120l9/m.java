package p120l9;

import A.M0;
import A9.a;
import A9.b;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p017b7.g;
import p241y9.c;
import p251z9.j;
import p251z9.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p {
    public static final void A0(Iterable iterable, AbstractCollection abstractCollection) {
        j.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] B0(Collection collection) {
        j.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List C0(Iterable iterable) {
        j.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC0813f2.O(E0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.f19440r;
        }
        if (size != 1) {
            return D0(collection);
        }
        return AbstractC0813f2.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList D0(Collection collection) {
        j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List E0(Iterable iterable) {
        j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return D0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        A0(iterable, arrayList);
        return arrayList;
    }

    public static Set F0(Iterable iterable) {
        j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set G0(Iterable iterable) {
        j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(w.g0(collection.size()));
                    A0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                j.d(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            A0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                j.d(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return t.f19442r;
    }

    public static void d0(Collection collection, Iterable iterable) {
        j.e(collection, "<this>");
        j.e(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static boolean e0(Iterable iterable, Object obj) {
        j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return i0(iterable, obj) >= 0;
    }

    public static Object f0(List list) {
        j.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object g0(List list) {
        j.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object h0(int i10, List list) {
        j.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static int i0(Iterable iterable, Object obj) {
        j.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            if (j.a(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void j0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, c cVar) {
        j.e(iterable, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            g.I(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void k0(List list, StringBuilder sb, M0 m10, int i10) {
        if ((i10 & 64) != 0) {
            m10 = null;
        }
        j0(list, sb, "\n", "", "", "...", m10);
    }

    public static String l0(Iterable iterable, String str, String str2, String str3, c cVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            cVar = null;
        }
        j.e(iterable, "<this>");
        j.e(str4, "separator");
        j.e(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        j0(iterable, sb, str4, str5, str6, "...", cVar);
        return sb.toString();
    }

    public static Object m0(List list) {
        j.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0813f2.E(list));
    }

    public static Object n0(List list) {
        j.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable o0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List p0(Iterable iterable, Iterable iterable2) {
        j.e(iterable, "<this>");
        Collection collectionC0 = iterable2 instanceof Collection ? (Collection) iterable2 : C0(iterable2);
        if (collectionC0.isEmpty()) {
            return C0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionC0.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList q0(Collection collection, Iterable iterable) {
        j.e(collection, "<this>");
        j.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            d0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList r0(Collection collection, Object obj) {
        j.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void s0(List list, c cVar) {
        int iE;
        j.e(list, "<this>");
        j.e(cVar, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof a) && !(list instanceof b)) {
                y.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) cVar.e(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int iE2 = AbstractC0813f2.E(list);
        int i10 = 0;
        if (iE2 >= 0) {
            int i11 = 0;
            while (true) {
                Object obj = list.get(i10);
                if (!((Boolean) cVar.e(obj)).booleanValue()) {
                    if (i11 != i10) {
                        list.set(i11, obj);
                    }
                    i11++;
                }
                if (i10 == iE2) {
                    break;
                } else {
                    i10++;
                }
            }
            i10 = i11;
        }
        if (i10 >= list.size() || i10 > (iE = AbstractC0813f2.E(list))) {
            return;
        }
        while (true) {
            list.remove(iE);
            if (iE == i10) {
                return;
            } else {
                iE--;
            }
        }
    }

    public static Object t0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object u0(List list) {
        j.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC0813f2.E(list));
    }

    public static List v0(Iterable iterable) {
        j.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C0(iterable);
        }
        List listE0 = E0(iterable);
        Collections.reverse(listE0);
        return listE0;
    }

    public static Object w0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static List x0(AbstractList abstractList) {
        j.e(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return C0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        j.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return l.S(array);
    }

    public static List y0(Iterable iterable, Comparator comparator) {
        j.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listE0 = E0(iterable);
            p.c0(listE0, comparator);
            return listE0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return C0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        j.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return l.S(array);
    }

    public static List z0(int i10, List list) {
        if (i10 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.f19440r;
        }
        if (i10 >= list.size()) {
            return C0(list);
        }
        if (i10 == 1) {
            return AbstractC0813f2.K(f0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC0813f2.O(arrayList);
    }
}
