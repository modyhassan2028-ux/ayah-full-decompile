package ka;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        p251z9.j.e(str, "a");
        p251z9.j.e(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = str.charAt(i10);
            char cCharAt2 = str2.charAt(i10);
            if (cCharAt != cCharAt2) {
                return p251z9.j.f(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
