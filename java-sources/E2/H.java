package E2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f1506b = new G(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f1507c = new G(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1508a;

    public static void a(F0 f3) {
        View view = f3.f1486a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = I1.S.f3689a;
            I1.I.k(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static int b(int i10, int i11) {
        int i12;
        int i13 = i10 & 3158064;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 >> 2;
        } else {
            int i15 = i13 >> 1;
            i14 |= (-3158065) & i15;
            i12 = (i15 & 3158064) >> 2;
        }
        return i14 | i12;
    }

    public static int c(int i10, int i11) {
        int i12;
        int i13 = i10 & 789516;
        if (i13 == 0) {
            return i10;
        }
        int i14 = i10 & (~i13);
        if (i11 == 0) {
            i12 = i13 << 2;
        } else {
            int i15 = i13 << 1;
            i14 |= (-789517) & i15;
            i12 = (i15 & 789516) << 2;
        }
        return i14 | i12;
    }

    public final int d(RecyclerView recyclerView, int i10, int i11, long j) {
        if (this.f1508a == -1) {
            this.f1508a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f1506b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f1507c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * this.f1508a)));
        if (interpolation == 0) {
            return i11 > 0 ? 1 : -1;
        }
        return interpolation;
    }
}
