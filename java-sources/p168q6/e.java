package p168q6;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f21329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f21330v;

    public e(View view) {
        super(view);
        this.f21329u = view;
        View viewFindViewById = view.findViewById(R.id.title);
        j.d(viewFindViewById, "findViewById(...)");
        this.f21330v = (TextView) viewFindViewById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f21329u, ((e) obj).f21329u);
    }

    public final int hashCode() {
        return this.f21329u.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "Header(headerView=" + this.f21329u + ")";
    }
}
