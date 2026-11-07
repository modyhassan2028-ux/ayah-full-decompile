package B5;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f633w;

    public d(View view) {
        super(view);
        this.f632v = view;
        View viewFindViewById = view.findViewById(R.id.title);
        j.d(viewFindViewById, "findViewById(...)");
        this.f633w = (TextView) viewFindViewById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f632v, ((d) obj).f632v);
    }

    public final int hashCode() {
        return this.f632v.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "HeaderHolder(view=" + this.f632v + ")";
    }
}
