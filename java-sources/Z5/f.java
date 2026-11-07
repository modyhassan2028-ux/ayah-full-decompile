package Z5;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f11018v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f11019w;

    public f(View view) {
        super(view);
        this.f11018v = view;
        View viewFindViewById = view.findViewById(R.id.text);
        j.d(viewFindViewById, "findViewById(...)");
        this.f11019w = (TextView) viewFindViewById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && j.a(this.f11018v, ((f) obj).f11018v);
    }

    public final int hashCode() {
        return this.f11018v.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "TextViewHolder(view=" + this.f11018v + ")";
    }
}
