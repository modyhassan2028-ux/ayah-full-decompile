package E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale[] f1427c = new Locale[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f1428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1429b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f1428a = f1427c;
            this.f1429b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException(p245z2.a.B(i10, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i10 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f1428a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f1429b = sb.toString();
    }

    @Override // E1.g
    public final String a() {
        return this.f1429b;
    }

    @Override // E1.g
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f1428a;
        Locale[] localeArr2 = this.f1428a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < localeArr2.length; i10++) {
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // E1.g
    public final Locale get(int i10) {
        if (i10 < 0) {
            return null;
        }
        Locale[] localeArr = this.f1428a;
        if (i10 < localeArr.length) {
            return localeArr[i10];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f1428a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // E1.g
    public final boolean isEmpty() {
        return this.f1428a.length == 0;
    }

    @Override // E1.g
    public final int size() {
        return this.f1428a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f1428a;
            if (i10 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i10]);
            if (i10 < localeArr.length - 1) {
                sb.append(',');
            }
            i10++;
        }
    }
}
