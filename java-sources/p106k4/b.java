package p106k4;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f18991b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f18992a;

    public b() {
        SparseArray sparseArray = new SparseArray();
        this.f18992a = sparseArray;
        sparseArray.put(6, Typeface.DEFAULT);
        sparseArray.put(7, Typeface.DEFAULT_BOLD);
    }

    public final Typeface a(Context context, int i10) {
        String str;
        SparseArray sparseArray = this.f18992a;
        Typeface typeface = (Typeface) sparseArray.get(i10);
        if (typeface != null) {
            return typeface;
        }
        if (i10 == 2) {
            return Typeface.DEFAULT_BOLD;
        }
        if (i10 == 3) {
            str = "hafs_smart_08.ttf";
        } else if (i10 == 4) {
            str = "quran_titles.ttf";
        } else {
            if (i10 != 5) {
                return Typeface.DEFAULT;
            }
            str = "quran_numbers.ttf";
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
        sparseArray.put(i10, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }
}
