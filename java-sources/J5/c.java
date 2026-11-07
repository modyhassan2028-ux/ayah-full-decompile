package J5;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f4340v;

    public c(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        j.d(viewFindViewById, "findViewById(...)");
        this.f4340v = (TextView) viewFindViewById;
    }
}
