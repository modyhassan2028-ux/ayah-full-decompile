package N5;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f6043v;

    public e(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.info);
        j.d(viewFindViewById, "findViewById(...)");
        this.f6043v = (TextView) viewFindViewById;
    }
}
