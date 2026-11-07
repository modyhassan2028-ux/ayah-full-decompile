package W;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f8921a = new WeakHashMap();

    public static String a(int i10, int i11) {
        int i12 = (i11 & 1) == 0 ? 2 : 1;
        String str = i12 + ".40.false." + Locale.getDefault().toLanguageTag();
        WeakHashMap weakHashMap = f8921a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i12);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i10));
    }
}
