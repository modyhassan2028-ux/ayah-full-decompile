package O4;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import com.ayah.feature.infolist.ui.view.widget.NumberCircleView;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f6486v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f6487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final NumberCircleView f6488x;

    public d(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        j.d(viewFindViewById, "findViewById(...)");
        this.f6486v = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f6487w = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.number_circle);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f6488x = (NumberCircleView) viewFindViewById3;
    }
}
