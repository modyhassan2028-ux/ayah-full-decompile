package Z5;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f11020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f11021w;

    public g(View view) {
        super(view);
        this.f11020v = view;
        View viewFindViewById = view.findViewById(R.id.text);
        j.d(viewFindViewById, "findViewById(...)");
        this.f11021w = (TextView) viewFindViewById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && j.a(this.f11020v, ((g) obj).f11020v);
    }

    public final int hashCode() {
        return this.f11020v.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "VerseViewHolder(view=" + this.f11020v + ")";
    }
}
