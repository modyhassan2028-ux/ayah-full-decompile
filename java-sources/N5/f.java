package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ayah.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f6044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f6045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f6046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CircularProgressIndicator f6047y;

    public f(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.sura_name);
        j.d(viewFindViewById, "findViewById(...)");
        this.f6044v = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.download_area);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f6045w = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.download_icon);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f6046x = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.progress);
        j.d(viewFindViewById4, "findViewById(...)");
        this.f6047y = (CircularProgressIndicator) viewFindViewById4;
    }
}
