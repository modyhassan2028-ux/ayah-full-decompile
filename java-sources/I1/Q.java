package I1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f3685d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f3686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f3687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f3688c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f3686a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        throw android.support.v4.media.session.p.u(size, arrayList);
    }
}
