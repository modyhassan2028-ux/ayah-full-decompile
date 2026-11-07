package p168q6;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f21331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f21332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f21333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f21334x;

    public f(View view) {
        super(view);
        this.f21331u = view;
        View viewFindViewById = view.findViewById(R.id.title);
        j.d(viewFindViewById, "findViewById(...)");
        this.f21332v = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.page_number);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f21333w = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f21334x = (TextView) viewFindViewById3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && j.a(this.f21331u, ((f) obj).f21331u);
    }

    public final int hashCode() {
        return this.f21331u.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "Result(resultView=" + this.f21331u + ")";
    }
}
