package J5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f4341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f4342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f4343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f4344y;

    public d(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.downloaded_icon);
        j.d(viewFindViewById, "findViewById(...)");
        this.f4341v = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.reciter_name);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f4342w = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.reciter_description);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f4343x = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.qari_info);
        j.d(viewFindViewById4, "findViewById(...)");
        this.f4344y = (ImageView) viewFindViewById4;
    }
}
