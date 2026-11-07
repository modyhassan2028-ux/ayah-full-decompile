package U0;

import java.util.ArrayList;
import java.util.List;
import u.AbstractC1354i;

/* JADX INFO: renamed from: U0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0515g implements CharSequence {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f8059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f8061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f8062u;

    static {
        p085i0.n nVar = A.f7972a;
    }

    public C0515g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f8059r = list;
        this.f8060s = str;
        int i10 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                C0513e c0513e = (C0513e) list.get(i11);
                Object obj = c0513e.f8054a;
                if (obj instanceof C) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0513e);
                } else if (obj instanceof u) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0513e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f8061t = arrayList;
        this.f8062u = arrayList2;
        List listY0 = arrayList2 != null ? p120l9.m.y0(arrayList2, new C0514f(i10)) : null;
        if (listY0 == null || listY0.isEmpty()) {
            return;
        }
        int i12 = ((C0513e) p120l9.m.f0(listY0)).f8056c;
        u.s sVar = AbstractC1354i.f22730a;
        u.s sVar2 = new u.s(1);
        sVar2.a(i12);
        int size2 = listY0.size();
        for (int i13 = 1; i13 < size2; i13++) {
            C0513e c0513e2 = (C0513e) listY0.get(i13);
            while (true) {
                int i14 = sVar2.f22758b;
                if (i14 == 0) {
                    break;
                }
                if (i14 == 0) {
                    p204v.a.e("IntList is empty.");
                    throw null;
                }
                int i15 = sVar2.f22757a[i14 - 1];
                int i16 = c0513e2.f8055b;
                int i17 = c0513e2.f8056c;
                if (i16 < i15) {
                    if (i17 > i15) {
                        p002a1.a.a("Paragraph overlap not allowed, end " + i17 + " should be less than or equal to " + i15);
                        break;
                    }
                    break;
                }
                sVar2.d(i14 - 1);
            }
            sVar2.a(c0513e2.f8056c);
        }
    }

    public final List a(int i10) {
        List list = this.f8059r;
        if (list == null) {
            return p120l9.r.f19440r;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            C0513e c0513e = (C0513e) obj;
            if ((c0513e.f8054a instanceof AbstractC0522n) && AbstractC0517i.b(0, i10, c0513e.f8055b, c0513e.f8056c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0515g subSequence(int i10, int i11) {
        ArrayList arrayList;
        if (!(i10 <= i11)) {
            p002a1.a.a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        String str = this.f8060s;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        p251z9.j.d(strSubstring, "substring(...)");
        C0515g c0515g = AbstractC0517i.f8088a;
        if (i10 > i11) {
            p002a1.a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        List list = this.f8059r;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0513e c0513e = (C0513e) list.get(i12);
                int i13 = c0513e.f8055b;
                int i14 = c0513e.f8056c;
                if (AbstractC0517i.b(i10, i11, i13, i14)) {
                    arrayList.add(new C0513e(c0513e.f8054a, Math.max(i10, c0513e.f8055b) - i10, Math.min(i11, i14) - i10, c0513e.f8057d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new C0515g(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f8060s.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515g)) {
            return false;
        }
        C0515g c0515g = (C0515g) obj;
        return p251z9.j.a(this.f8060s, c0515g.f8060s) && p251z9.j.a(this.f8059r, c0515g.f8059r);
    }

    public final int hashCode() {
        int iHashCode = this.f8060s.hashCode() * 31;
        List list = this.f8059r;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8060s.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8060s;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0515g(int i10, String str, ArrayList arrayList) {
        List list = (i10 & 2) != 0 ? p120l9.r.f19440r : arrayList;
        C0515g c0515g = AbstractC0517i.f8088a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ C0515g(String str) {
        this(str, p120l9.r.f19440r);
    }

    public C0515g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
