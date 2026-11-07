package Q5;

import E2.F0;
import E2.H;
import E5.c;
import I1.I;
import I1.S;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import java.util.WeakHashMap;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f6866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f6867f;

    public a(int i10, c cVar, c cVar2) {
        this.f1508a = -1;
        this.f6865d = i10;
        this.f6866e = cVar;
        this.f6867f = cVar2;
    }

    public final int e(RecyclerView recyclerView, F0 f3) {
        j.e(recyclerView, "recyclerView");
        j.e(f3, "viewHolder");
        int i10 = ((Boolean) this.f6867f.e(f3)).booleanValue() ? 4 : 0;
        return i10 | (i10 << 8);
    }

    public final void f(Canvas canvas, RecyclerView recyclerView, F0 f3, float f7, float f10, boolean z10) {
        j.e(canvas, "c");
        j.e(f3, "viewHolder");
        View view = f3.f1486a;
        j.d(view, "itemView");
        float f11 = 0.0f;
        if (f10 == 0.0f) {
            ColorDrawable colorDrawable = new ColorDrawable(this.f6865d);
            colorDrawable.setBounds(view.getLeft() + ((int) f7), view.getTop(), view.getRight(), view.getBottom());
            colorDrawable.draw(canvas);
        }
        if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = S.f3689a;
            Float fValueOf = Float.valueOf(I.e(view));
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = S.f3689a;
                    float fE = I.e(childAt);
                    if (fE > f11) {
                        f11 = fE;
                    }
                }
            }
            I.k(view, f11 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f7);
        view.setTranslationY(f10);
    }
}
