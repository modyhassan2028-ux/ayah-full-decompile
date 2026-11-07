package p226x2;

import E2.F0;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class t extends F0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Drawable f24341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ColorStateList f24342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseArray f24343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f24345y;

    public t(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f24343w = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.ayah.R.id.icon_frame, view.findViewById(com.ayah.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f24341u = view.getBackground();
        if (textView != null) {
            this.f24342v = textView.getTextColors();
        }
    }

    public final View r(int i10) {
        SparseArray sparseArray = this.f24343w;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f1486a.findViewById(i10);
        if (viewFindViewById != null) {
            sparseArray.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }
}
