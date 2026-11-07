package Z5;

import android.view.View;
import android.widget.ImageView;
import com.ayah.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f11015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f11016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CircularProgressIndicator f11017x;

    public e(View view) {
        super(view);
        this.f11015v = view;
        View viewFindViewById = view.findViewById(R.id.downloading);
        j.d(viewFindViewById, "findViewById(...)");
        this.f11016w = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.progress);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f11017x = (CircularProgressIndicator) viewFindViewById2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f11015v, ((e) obj).f11015v);
    }

    public final int hashCode() {
        return this.f11015v.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "DownloadingHolder(view=" + this.f11015v + ")";
    }
}
